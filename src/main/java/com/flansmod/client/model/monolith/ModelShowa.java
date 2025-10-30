//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Showa
// Model Creator: 
// Created on: 19.05.2020 - 08:09:04
// Last changed on: 19.05.2020 - 08:09:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelShowa extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelShowa() //Same as Filename
	{
		headModel = new ModelRendererTurbo[34];
		bodyModel = new ModelRendererTurbo[20];
		leftArmModel = new ModelRendererTurbo[6];
		rightArmModel = new ModelRendererTurbo[5];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 22
		headModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 28
		headModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 29
		headModel[3] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 30
		headModel[4] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 37
		headModel[5] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 38
		headModel[6] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 124
		headModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 125
		headModel[8] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 42
		headModel[9] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 43
		headModel[10] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 44
		headModel[11] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 45
		headModel[12] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 46
		headModel[13] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 47
		headModel[14] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 48
		headModel[15] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 49
		headModel[16] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 50
		headModel[17] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 51
		headModel[18] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 52
		headModel[19] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 63
		headModel[20] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 64
		headModel[21] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 34
		headModel[22] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 14
		headModel[23] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 12
		headModel[24] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 13
		headModel[25] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 70
		headModel[26] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 73
		headModel[27] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 74
		headModel[28] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 82
		headModel[29] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 83
		headModel[30] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 84
		headModel[31] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 85
		headModel[32] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 92
		headModel[33] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 102

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 8, 8, 0F,0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.55F, 0.05F, 0.05F, 0.55F, 0.05F, 0.05F, 0.55F, 0.05F, 0.05F, 0.55F, 0.05F); // Box 22
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-0.5F, -4.2F, -4F, 1, 1, 1, 0F,-0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, -0.05F, 1.2F, 1F, -0.05F, 1.2F, 1F, 0.5F, 1.4F, -0.8F, 0.5F, 1.4F, -0.8F); // Box 28
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(0.8F, -5.2F, -4.2F, 1, 1, 1, 0F,0.3F, -0.4F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0.3F, -0.4F, 0F, 0.1F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.1F, -0.1F, 0F); // Box 29
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(2.3F, -5.2F, -4.2F, 1, 1, 1, 0F,0.8F, -0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.8F, -0.1F, 0F, 0.5F, -0.3F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0.5F, -0.3F, 0F); // Box 30
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-1.8F, -5.2F, -4.2F, 1, 1, 1, 0F,-0.3F, -0.1F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, -0.3F, -0.1F, 0F, 0F, -0.3F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0F, -0.3F, 0F); // Box 37
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3.3F, -5.2F, -4.2F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0.8F, -0.1F, 0F, 0.8F, -0.1F, 0F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.1F, -0.2F, 0F); // Box 38
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-3.1F, -4F, -4F, 2, 1, 1, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F); // Box 124
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(1.1F, -4F, -4F, 2, 1, 1, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F); // Box 125
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-3.1F, -3.3F, -4.5F, 2, 1, 1, 0F,0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F); // Box 42
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-3.1F, -4.55F, -4.5F, 2, 1, 1, 0F,0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F); // Box 43
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-3.8F, -4.4F, -4.5F, 1, 2, 1, 0F,-0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F); // Box 44
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-1.4F, -4.4F, -4.5F, 1, 2, 1, 0F,-0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F); // Box 45
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(2.8F, -4.4F, -4.5F, 1, 2, 1, 0F,-0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F); // Box 46
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(1.1F, -3.3F, -4.5F, 2, 1, 1, 0F,0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F); // Box 47
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(0.4F, -4.4F, -4.5F, 1, 2, 1, 0F,-0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F); // Box 48
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(1.1F, -4.5F, -4.5F, 2, 1, 1, 0F,0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F); // Box 49
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-1F, -4F, -4.5F, 2, 1, 1, 0F,-0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F); // Box 50
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4.3F, -4F, -4.5F, 1, 1, 4, 0F,-0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F); // Box 51
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(3.3F, -4F, -4.5F, 1, 1, 4, 0F,-0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F); // Box 52
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(0F, -2F, -4.2F, 1, 1, 1, 0F,-0.2F, -0.1F, 0F, 0.1F, -0.45F, 0F, 0.1F, -0.45F, 0F, -0.2F, -0.1F, 0F, -0.1F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.5F, 0F); // Box 63
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-1F, -2F, -4.2F, 1, 1, 1, 0F,0.1F, -0.45F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0.1F, -0.45F, 0F, 0F, -0.1F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, -0.1F, 0F); // Box 64
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-4.5F, -9F, -4.5F, 9, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 1F, 0.1F, -0.2F, 1F, 0.1F); // Box 34
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-4F, -6.5F, -7F, 8, 1, 3, 0F,-2.5F, -0.5F, -0.3F, -2.5F, -0.5F, -0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0F, 0.3F, -2F, 0F, 0.3F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 14
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-4.5F, -9.5F, -3.9F, 9, 2, 8, 0F,0.7F, -0.5F, 1.5F, 0.7F, -0.5F, 1.5F, 0.7F, -2.2F, 2F, 0.7F, -2.2F, 2F, -0.3F, 0.3F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, 1.3F, 0.5F, -0.3F, 1.3F, 0.5F); // Box 12
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-4.5F, -8.7F, -3.9F, 9, 1, 8, 0F,-0.8F, 1F, -0.7F, -0.8F, 1F, -0.7F, -0.8F, -0.1F, 0.2F, -0.8F, -0.1F, 0.2F, 0.8F, -1.3F, 1.5F, 0.8F, -1.3F, 1.5F, 0.8F, 0.4F, 2F, 0.8F, 0.4F, 2F); // Box 13
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-1F, -8F, -5F, 2, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 70
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-1F, -8.6F, -5F, 2, 1, 1, 0F,-0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 73
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-1F, -7.4F, -5F, 2, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Box 74
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-1F, -12.5F, -5F, 2, 4, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F); // Box 82
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-3F, -13.5F, -7.5F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 83
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-3F, -16.5F, -7.5F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-3F, -18.5F, -7.5F, 6, 2, 6, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-3.1F, -4.1F, -4.05F, 2, 1, 1, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.5F, 0.1F, -2F, -0.5F, 0.1F, -2F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F); // Box 92
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(1.1F, -4.1F, -4.05F, 2, 1, 1, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -2F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -2F, -0.5F, 0.1F); // Box 102
		headModel[33].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 58
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 62
		bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 64
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 24
		bodyModel[6] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 31
		bodyModel[7] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 31
		bodyModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 32
		bodyModel[9] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 34
		bodyModel[10] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 53
		bodyModel[11] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 54
		bodyModel[12] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 55
		bodyModel[13] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 56
		bodyModel[14] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 57
		bodyModel[15] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 58
		bodyModel[16] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 59
		bodyModel[17] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 60
		bodyModel[18] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 61
		bodyModel[19] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 62

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 7, 4, 0F,1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 8F, -2F, 2, 9, 4, 0F,0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.5F, 0F, 0.1F, 1F, -0.5F, 0.3F, 0F, -0.2F, 0.7F, 0F, 0F, 0.9F, 1F, -0.5F, 0.3F); // Box 58
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3F, 0F, -3F, 3, 1, 2, 0F,-0.5F, 0.6F, -0.3F, 0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.6F, 0F, 0F, -1F, -0.3F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 62
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, -3F, 3, 1, 2, 0F,0.3F, 0F, -0.1F, -0.5F, 0.6F, -0.3F, -0.5F, 0.6F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, -1F, -0.3F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 64
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 5F, -2F, 9, 5, 4, 0F,0.2F, -1.8F, 0.3F, 0.2F, -1.8F, 0.3F, 0.2F, -1.8F, 0.3F, 0.2F, -1.8F, 0.3F, 0.2F, -1.8F, 0.3F, 0.2F, -1.8F, 0.3F, 0.2F, -1.8F, 0.3F, 0.2F, -1.8F, 0.3F); // Box 14
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(2F, 8F, -2F, 2, 9, 4, 0F,0F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.9F, 1F, -0.5F, 0.3F, 1F, -0.5F, 0.3F, 0F, 0F, 0.9F); // Box 24
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, -0.5F, -2.5F, 1, 8, 5, 0F,-0.9F, 0F, 0F, 2.3F, 0F, 0F, 2.3F, 0F, 0F, -0.9F, 0F, 0F, 4F, -0.5F, -0.25F, -2.5F, -0.5F, -0.25F, -2.5F, -0.5F, -0.25F, 4F, 0F, -0.25F); // Box 31
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1F, 2.5F, -2.7F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F); // Box 31
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.5F, 4F, -2.7F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-2F, 8F, -2F, 4, 9, 4, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F); // Box 34
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3.5F, -0.5F, -2.6F, 1, 3, 1, 0F,1.1F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, 0F, 1.1F, 0F, 0F, -0.9F, -0.5F, 0F, 1.4F, -0.5F, 0F, 1.4F, 0F, 0F, -0.9F, -0.5F, 0F); // Box 53
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1.5F, 1.5F, -2.6F, 1, 3, 1, 0F,1.1F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 1.1F, -0.5F, 0F, -0.9F, -1.5F, 0F, 1.1F, -2F, 0F, 1.1F, -2F, 0F, -0.9F, -1.5F, 0F); // Box 54
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0.5F, 1.5F, -2.6F, 1, 3, 1, 0F,-0.6F, -0.5F, 0F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, -0.6F, -0.5F, 0F, 1.1F, -2F, 0F, -0.9F, -1.5F, 0F, -0.9F, -1.5F, 0F, 1.1F, -2F, 0F); // Box 55
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(2.5F, -0.5F, -2.6F, 1, 3, 1, 0F,-0.9F, 0F, -0.1F, 1.1F, 0F, -0.1F, 1.1F, 0F, 0F, -0.9F, 0F, 0F, 1.4F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, 1.4F, 0F, 0F); // Box 56
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(3.2F, 5.5F, -2.5F, 1, 1, 2, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 57
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(1.2F, 5.3F, -2.5F, 1, 1, 2, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 58
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(1.4F, 3.5F, -2.5F, 1, 1, 2, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 59
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(3.4F, 3.7F, -2.5F, 1, 1, 2, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 60
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(1.4F, 1.5F, -2.5F, 3, 1, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 61
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-6F, 7.5F, -2.5F, 1, 8, 5, 0F,-1.9F, -0.5F, -0.3F, 3.1F, -0.5F, -0.24F, 3.1F, 0F, -0.25F, -1.9F, -0.5F, -0.3F, -1.3F, -6.5F, -0.3F, 0.1F, -3F, -0.18F, 0.1F, -3F, -0.2F, -1.3F, -6.5F, -0.3F); // Box 62
		bodyModel[19].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 32
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 96
		leftArmModel[2] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 97
		leftArmModel[3] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 98
		leftArmModel[4] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 99
		leftArmModel[5] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 101

		leftArmModel[0].addShapeBox(-1F, -3F, -2F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F); // Box 32
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0.1F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F); // Box 96
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 0F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F); // Box 97
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 7.5F, -2F, 4, 1, 4, 0F,0F, 0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, 0F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F); // Box 98
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1.7F, 3F, -2F, 1, 5, 4, 0F,-0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 99
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2.7F, 3F, -2F, 1, 5, 4, 0F,-0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 101
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 61
		rightArmModel[1] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 33
		rightArmModel[2] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 34
		rightArmModel[3] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 86
		rightArmModel[4] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 88

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F); // Box 61
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -3F, -2F, 4, 1, 3, 0F,0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F); // Box 33
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 0F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F); // Box 34
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.7F, 3F, -2F, 1, 5, 4, 0F,-0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 86
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 7.5F, -2F, 4, 1, 4, 0F,0F, 0.1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.1F, 0F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F, 0.3F, 0.6F, 0.2F); // Box 88
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 93
		leftLegModel[1] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 94
		leftLegModel[2] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 95

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 10, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F); // Box 93
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 94
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -4F, 4, 2, 2, 0F,0.1F, -0.9F, 0.1F, 0.1F, -0.9F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 95
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 18
		rightLegModel[1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 19
		rightLegModel[2] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 29

		rightLegModel[0].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 18
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10F, -4F, 4, 2, 2, 0F,0.1F, -0.9F, 0.1F, 0.1F, -0.9F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 19
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 0F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F); // Box 29
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}
}