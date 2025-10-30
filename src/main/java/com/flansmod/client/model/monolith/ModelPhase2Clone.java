//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Phase2Clone
// Model Creator: 
// Created on: 19.12.2020 - 14:21:46
// Last changed on: 19.12.2020 - 14:21:46

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPhase2Clone extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelPhase2Clone() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[44];
		leftArmModel = new ModelRendererTurbo[5];
		rightArmModel = new ModelRendererTurbo[5];
		leftLegModel = new ModelRendererTurbo[6];
		rightLegModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box33
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box89
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box90
		bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box91
		bodyModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box92
		bodyModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box93
		bodyModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box96
		bodyModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box111
		bodyModel[8] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import Box107
		bodyModel[9] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Import Box108
		bodyModel[10] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Box89
		bodyModel[11] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import Box90
		bodyModel[12] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Box91
		bodyModel[13] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 52
		bodyModel[18] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Import 
		bodyModel[19] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import 
		bodyModel[20] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import 
		bodyModel[21] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import 
		bodyModel[22] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import 
		bodyModel[23] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import 
		bodyModel[24] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import 
		bodyModel[25] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import 
		bodyModel[26] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import 
		bodyModel[27] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import 
		bodyModel[28] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 35
		bodyModel[29] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 36
		bodyModel[30] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 37
		bodyModel[31] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 38
		bodyModel[32] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 39
		bodyModel[33] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 40
		bodyModel[34] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 41
		bodyModel[35] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 42
		bodyModel[36] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import 
		bodyModel[37] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import 
		bodyModel[38] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import 
		bodyModel[39] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Import 
		bodyModel[40] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Import 
		bodyModel[41] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import 
		bodyModel[42] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 93
		bodyModel[43] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 94

		bodyModel[0].addShapeBox(-4F, 0.4F, -2F, 8, 13, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F); // Import Box33
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 3.5F, -2F, 4, 5, 4, 0F,0.25F, 0F, 0.7F, 0F, 0F, 1.2F, 0F, 0F, 1F, 0.25F, 0F, 0.5F, 0.15F, 0F, 0.4F, 0F, -1F, 1F, 0F, -0.5F, 1F, 0.15F, 0F, 0.4F); // Import Box89
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 2.5F, -2F, 4, 1, 4, 0F,-0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1F, -0.2F, 0.5F, 0.7F, 0.2F, 0F, 0.7F, 0F, 0F, 1.2F, 0F, 0F, 1F, 0.2F, 0F, 0.5F); // Import Box90
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 0.5F, -2F, 4, 1, 4, 0F,0.2F, -0.3F, 0.3F, -1.5F, -0.3F, 0.2F, 0F, -0.3F, 0.8F, -0.8F, -0.3F, 0.5F, -0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1F, -0.2F, 0.5F, 0.7F); // Import Box91
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, 0.5F, -2F, 4, 1, 4, 0F,-1.5F, -0.3F, 0.2F, 0.2F, -0.3F, 0.3F, -0.8F, -0.3F, 0.5F, 0F, -0.3F, 0.8F, 0F, 0.5F, 0.8F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.7F, 0F, 0.5F, 1F); // Import Box92
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 2.5F, -2F, 4, 1, 4, 0F,0F, 0.5F, 0.8F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.7F, 0F, 0.5F, 1F, 0F, 0F, 1.2F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.5F, 0F, 0F, 1F); // Import Box93
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 3.5F, -2F, 4, 5, 4, 0F,0F, 0F, 1.2F, 0.25F, 0F, 0.7F, 0.25F, 0F, 0.5F, 0F, 0F, 1F, 0F, -1F, 1F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0F, -0.5F, 1F); // Import Box96
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 0.7F, -3.3F, 4, 4, 1, 0F,0F, -0.05F, 0F, 0.3F, 0.45F, -0.6F, 0.3F, 0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.3F, 0F, 0.3F, 0.7F, -0.2F, 0.3F, 0.7F, 0F, 0F, -0.3F, 0F); // Import Box111
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-2F, 10.8F, -2F, 2, 3, 4, 0F,2.1F, 0.1F, 0.5F, 0F, 0.1F, 0.64F, 0F, 0.1F, 0.8F, 2.4F, 0.1F, 0.5F, -0.5F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, -0.6F, 0.5F, 1F, -0.6F, 0.5F); // Import Box107
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 10.8F, -2F, 2, 3, 4, 0F,0F, 0.1F, 0.6F, 2.1F, 0.1F, 0.5F, 2.4F, 0.1F, 0.5F, 0F, 0.1F, 0.8F, 0F, 0.4F, 0.5F, -0.5F, 0.4F, 0.5F, 1F, -0.6F, 0.5F, 0F, -0.6F, 0.5F); // Import Box108
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1F, 12.5F, -2.8F, 2, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box89
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1F, 13F, -2.8F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1F, 13.5F, -2.8F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box91
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(2.5F, -2.5F, -2F, 1, 1, 4, 0F,-0.2F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, 0F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.3F, 0.3F, 0.5F, 0F, 0.3F, 0.55F); // Box 17
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.5F, -2.5F, -2F, 1, 1, 4, 0F,0F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, -0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.55F, -0.3F, 0.3F, 0.5F); // Box 21
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 0.7F, -3.3F, 4, 4, 1, 0F,0.3F, 0.45F, -0.6F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.3F, 0.45F, 0F, 0.3F, 0.7F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.3F, 0.7F, 0F); // Box 22
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(2.5F, -0.5F, -2F, 1, 3, 4, 0F,-0.2F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.2F, 0F, 0.4F, 0F, 0.3F, 0.9F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.6F, 0F, 0.3F, 0.6F); // Box 17
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.5F, -0.5F, -2F, 1, 3, 4, 0F,0F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.4F, 0F, 0F, 0.3F, -0.2F, 0F, 0.9F, 0F, 0.3F, 1.1F, 0F, 0.3F, 0.7F, -0.2F, 0F, 0.6F); // Box 52
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, 9.3F, -2.5F, 8, 1, 5, 0F,0.2F, 0.2F, -0.075F, 0.2F, 0.2F, -0.075F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, -0.075F, 0.2F, 0.2F, -0.075F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, 0.05F); // Import 
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-1F, 9.3F, -2.45F, 1, 1, 1, 0F,-0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.0F); // Import 
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0F, 9.3F, -2.45F, 1, 1, 1, 0F,-0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.0F, -0.2F, 0F, 0.0F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.0F); // Import 
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-3F, 10F, 2F, 4, 1, 2, 0F,0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import 
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-3F, 9F, 2F, 4, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F); // Import 
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-3F, 9.65F, 2F, 4, 1, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F); // Import 
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3.8F, 9.4F, -3F, 2, 2, 1, 0F,0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F); // Import 
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(1.8F, 9.4F, -3F, 2, 2, 1, 0F,0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F); // Import 
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-2.3F, 9.4F, -3.45F, 1, 2, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Import 
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(1.3F, 9.4F, -3.45F, 1, 2, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Import 
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(3.3F, 9.4F, -3.45F, 1, 2, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 35
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-4.3F, 9.4F, -3.45F, 1, 2, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 36
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-4.3F, 8.4F, -3.45F, 3, 1, 1, 0F,-0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, -0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 37
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(1.3F, 8.4F, -3.45F, 3, 1, 1, 0F,-0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 38
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-3.3F, 9.4F, -3.45F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 39
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(2.3F, 9.4F, -3.45F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 40
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-4.3F, 10.65F, -3.45F, 3, 1, 1, 0F,-0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 41
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(1.3F, 10.65F, -3.45F, 3, 1, 1, 0F,-0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 42
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(1.8F, 9F, 2.4F, 2, 2, 1, 0F,0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F); // Import 
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(1.8F, 8.6F, 2.35F, 2, 1, 1, 0F,0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F); // Import 
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(1.7F, 9.35F, 2.55F, 1, 2, 1, 0F,-0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, -0.8F, 0.0F); // Import 
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(2.9F, 9.35F, 2.55F, 1, 2, 1, 0F,-0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, -0.8F, 0.0F); // Import 
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(2.9F, 9.4F, 2.2F, 1, 2, 1, 0F,-0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.8F, 0F); // Import 
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(1.7F, 9.4F, 2.2F, 1, 2, 1, 0F,-0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.8F, 0F); // Import 
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(2.9F, 8.85F, 2.55F, 1, 2, 1, 0F,-0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, -0.8F, 0.0F); // Box 93
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(1.7F, 8.85F, 2.55F, 1, 2, 1, 0F,-0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, -0.8F, 0.0F, -0.35F, -0.8F, 0.0F); // Box 94
		bodyModel[43].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box57
		leftArmModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box58
		leftArmModel[2] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box100
		leftArmModel[3] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import Box102
		leftArmModel[4] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Import Box42

		leftArmModel[0].addShapeBox(2F, 7.5F, -2F, 1, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Import Box57
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 5F, -2F, 4, 3, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Import Box58
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-0.5F, 2.4F, -2F, 4, 2, 4, 0F,0.2F, -0.8F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, -0.8F, 0.4F); // Import Box100
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 0F, -2F, 4, 2, 4, 0F,0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F); // Import Box102
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, -2.1F, -2F, 3, 2, 4, 0F,0.3F, 0.3F, 0.3F, 1.3F, 0.3F, 0.3F, 1.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.5F, 0F, 0.3F, 1.8F, 1.3F, 1.3F, 1.8F, 1.3F, 1.3F, 0.5F, 0F, 0.3F); // Import Box42
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import Box101
		rightArmModel[1] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Import Box43
		rightArmModel[2] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import Box55
		rightArmModel[3] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import Box56
		rightArmModel[4] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import Box63

		rightArmModel[0].addShapeBox(-2F, -2.1F, -2F, 3, 2, 4, 0F,1.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 1.3F, 0.3F, 0.3F, 1.8F, 1.3F, 1.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 1.8F, 1.3F, 1.3F); // Import Box101
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 0F, -2F, 4, 2, 4, 0F,0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Import Box43
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 7.5F, -2F, 1, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Import Box55
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 5F, -2F, 4, 3, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Import Box56
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.5F, 2.4F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, 0.2F, 0.4F); // Import Box63
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box24
		leftLegModel[1] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box22
		leftLegModel[2] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Box27
		leftLegModel[3] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 1
		leftLegModel[4] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 8
		leftLegModel[5] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 24

		leftLegModel[0].addShapeBox(-2F, 9.1F, -2.3F, 4, 3, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Import Box24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 5.1F, -2.8F, 4, 2, 3, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F); // Import Box22
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 5.1F, -2.3F, 4, 4, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, -0.4F, 0.2F, -1F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Import Box27
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, -0.9F, -2.3F, 4, 6, 3, 0F,0.2F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 1.6F, 0F, 0F, 1.6F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 1.6F, 0F, -1F, 1.6F); // Box 1
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 3.1F, -2.8F, 4, 2, 3, 0F,-1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 8
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, -0.6F, 0.9F, 0.1F, -0.6F, 0.9F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box25
		rightLegModel[1] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import Box20
		rightLegModel[2] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import Box21
		rightLegModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box29
		rightLegModel[4] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 9
		rightLegModel[5] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 50

		rightLegModel[0].addShapeBox(-2F, 9.1F, -2.3F, 4, 3, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Import Box25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -0.9F, -2.3F, 4, 6, 3, 0F,0.4F, 0.5F, 0F, 0.2F, 0F, 0F, 0F, 0F, 1.6F, 0.4F, 0.5F, 1.6F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -1F, 1.6F, 0.2F, -1F, 1.6F); // Import Box20
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 5.1F, -2.8F, 4, 2, 3, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F); // Import Box21
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 5.1F, -2.3F, 4, 4, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, -0.4F, 0.2F, -1F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Import Box29
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 3.1F, -2.8F, 4, 2, 3, 0F,-1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 9
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, -0.6F, 0.9F, 0.1F, -0.6F, 0.9F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 50
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);
	}
}