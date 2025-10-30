//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: stormtrooperfull
// Model Creator: 
// Created on: 17.02.2021 - 21:45:49
// Last changed on: 17.02.2021 - 21:45:49

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStormTrooperPlates extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelStormTrooperPlates() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[41];
		leftArmModel = new ModelRendererTurbo[11];
		rightArmModel = new ModelRendererTurbo[9];
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
		bodyModel[1] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box107
		bodyModel[2] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Box108
		bodyModel[3] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import Box89
		bodyModel[4] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Import Box90
		bodyModel[5] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import Box91
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 22
		bodyModel[7] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 17
		bodyModel[8] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 52
		bodyModel[9] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import 
		bodyModel[10] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import 
		bodyModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import 
		bodyModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import 
		bodyModel[13] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import 
		bodyModel[14] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import 
		bodyModel[15] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import 
		bodyModel[16] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import 
		bodyModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 40
		bodyModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 70
		bodyModel[19] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 72
		bodyModel[20] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 73
		bodyModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 74
		bodyModel[22] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 75
		bodyModel[23] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 79
		bodyModel[24] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 80
		bodyModel[25] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 81
		bodyModel[26] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 83
		bodyModel[27] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 84
		bodyModel[28] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 85
		bodyModel[29] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 86
		bodyModel[30] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 87
		bodyModel[31] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 107
		bodyModel[32] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 108
		bodyModel[33] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 109
		bodyModel[34] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 65
		bodyModel[35] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 66
		bodyModel[36] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 67
		bodyModel[37] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 113
		bodyModel[38] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 114
		bodyModel[39] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 129
		bodyModel[40] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 130

		bodyModel[0].addShapeBox(-4F, 0.4F, -2F, 8, 13, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F); // Import Box33
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-2F, 10.8F, -2F, 2, 3, 4, 0F,2.1F, 0.1F, 0.5F, 0F, 0.1F, 0.64F, 0F, 0.25F, 0.8F, 2.4F, 0.3F, 0.5F, -0.5F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, -0.6F, 0.5F, 1F, -0.6F, 0.5F); // Import Box107
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 10.8F, -2F, 2, 3, 4, 0F,0F, 0.1F, 0.6F, 2.1F, 0.1F, 0.5F, 2.4F, 0.3F, 0.5F, 0F, 0.25F, 0.8F, 0F, 0.4F, 0.5F, -0.5F, 0.4F, 0.5F, 1F, -0.6F, 0.5F, 0F, -0.6F, 0.5F); // Import Box108
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-1F, 11.5F, -2.8F, 2, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box89
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-1F, 12F, -2.8F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-1F, 13.5F, -2.8F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box91
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 2.7F, -3.3F, 4, 2, 1, 0F,0.3F, 0.45F, -0.6F, 0F, -0.55F, 0F, 0F, -0.675F, 0F, 0.3F, 0.45F, 0F, -0.95F, 0.075F, -0.2F, -1F, -0.05F, 0F, -0.625F, 0.45F, 0.5F, -0.325F, 0.7F, 0F); // Box 22
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2.5F, -0.5F, -2F, 1, 2, 4, 0F,-0.2F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.2F, 0F, 0.4F, 0F, 0.3F, 0.9F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.6F, 0F, 0.3F, 0.6F); // Box 17
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.5F, -0.5F, -2F, 1, 2, 4, 0F,0F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.4F, 0F, 0F, 0.3F, -0.2F, 0F, 0.65F, 0F, 0.3F, 0.625F, 0F, 0.3F, 0.7F, -0.2F, 0F, 0.6F); // Box 52
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 9.3F, -2.5F, 8, 1, 5, 0F,0.2F, 0.2F, -0.075F, 0.2F, 0.2F, -0.075F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, -0.075F, 0.2F, 0.2F, -0.075F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, 0.05F); // Import 
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2.5F, 9.3F, -2.45F, 1, 1, 1, 0F,-0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.0F); // Import 
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0.25F, 9.3F, -2.45F, 1, 1, 1, 0F,-0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.0F, -0.2F, 0F, 0.0F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.0F); // Import 
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-2F, 10F, 2F, 4, 1, 2, 0F,0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F); // Import 
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-2F, 9F, 2F, 4, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F); // Import 
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-2F, 9.65F, 2F, 4, 1, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F); // Import 
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.8F, 9.4F, -3F, 1, 2, 1, 0F,0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F); // Import 
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(2.8F, 9.4F, -3F, 1, 2, 1, 0F,0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F); // Import 
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.95F, 16.15F, -3.05F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 40
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, -0.3F, -3.3F, 4, 3, 1, 0F,-0.2F, -0.55F, -0.45F, 0F, -1.05F, -0.75F, 0F, -0.8F, 0F, -0.2F, -0.05F, 0F, 0.3F, -0.4F, -0.6F, 0F, 0.55F, 0F, 0F, 0.55F, 0F, 0.3F, -0.4F, 0F); // Box 70
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0F, 0.3F, -2F, 4, 7, 4, 0F,0F, -0.5F, 0.575F, 0.25F, 0.25F, 0.2F, 0.25F, 0.125F, 0.375F, 0F, -0.125F, 0.25F, 0F, -1F, 0.25F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0F, -0.5F, 0.475F); // Box 72
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, 0.3F, -2F, 4, 7, 4, 0F,0.25F, 0.25F, 0.2F, 0F, -0.5F, 0.575F, 0F, -0.125F, 0.25F, 0.25F, 0.125F, 0.375F, 0.15F, 0F, 0.4F, 0F, -1F, 0.25F, 0F, -0.5F, 0.475F, 0.15F, 0F, 0.4F); // Box 73
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-1.25F, 9.3F, -2.45F, 1, 1, 1, 0F,-0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.0F); // Box 74
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(1.5F, 9.3F, -2.45F, 1, 1, 1, 0F,-0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.0F, -0.2F, 0F, 0.0F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.0F); // Box 75
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-2.95F, 16.15F, -3.05F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 79
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-1.95F, 16.15F, -3.05F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 80
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-0.95F, 16.15F, -3.05F, 1, 1, 1, 0F,-0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Box 81
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-0.5F, 6.3F, -1.95F, 1, 3, 1, 0F,-0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F); // Box 83
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-2F, 6.3F, -1.95F, 1, 3, 1, 0F,-0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F); // Box 84
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-3.5F, 6.3F, -1.95F, 1, 3, 1, 0F,-0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F); // Box 85
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(1F, 6.3F, -1.95F, 1, 3, 1, 0F,-0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F); // Box 86
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(2.5F, 6.3F, -1.95F, 1, 3, 1, 0F,-0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F); // Box 87
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(1F, 6.3F, 1.05F, 1, 3, 1, 0F,-0.35F, 0.5F, 0F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F); // Box 107
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-2F, 6.3F, 1.05F, 1, 3, 1, 0F,-0.35F, 0.5F, 0F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F); // Box 108
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-2.5F, 2.3F, -0.5F, 5, 3, 3, 0F,0.2F, 0.2F, -0.075F, 0.2F, 0.2F, -0.075F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, -0.075F, 0.2F, 0.2F, -0.075F, 0.2F, 0.2F, 0.05F, 0.2F, 0.2F, 0.05F); // Box 109
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0.7F, 3.4F, 2.1F, 1, 1, 1, 0F,0.35F, -0.4F, -0.45F, 0.35F, -0.4F, -0.45F, 0.35F, -0.4F, -0.45F, 0.35F, -0.4F, -0.45F, 0.35F, -0.4F, -0.45F, 0.35F, -0.4F, -0.45F, 0.35F, -0.4F, -0.45F, 0.35F, -0.4F, -0.45F); // Box 65
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(0.7F, 3.6F, 2.1F, 1, 1, 1, 0F,0.35F, -0.4F, -0.45F, 0.35F, -0.4F, -0.45F, 0.35F, -0.4F, -0.45F, 0.35F, -0.4F, -0.45F, 0.1F, 0.12F, -0.45F, 0.1F, 0.12F, -0.45F, 0.1F, 0.12F, -0.45F, 0.1F, 0.12F, -0.45F); // Box 66
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(0.7F, 3.2F, 2.1F, 1, 1, 1, 0F,0.1F, 0.12F, -0.45F, 0.1F, 0.12F, -0.45F, 0.1F, 0.12F, -0.45F, 0.1F, 0.12F, -0.45F, 0.35F, -0.4F, -0.45F, 0.35F, -0.4F, -0.45F, 0.35F, -0.4F, -0.45F, 0.35F, -0.4F, -0.45F); // Box 67
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-1F, 3.3F, 1.7F, 1, 1, 1, 0F,-0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.0F, -0.2F, 0.25F, 0.0F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.0F); // Box 113
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-2F, 3.3F, 1.7F, 1, 1, 1, 0F,-0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.0F, -0.2F, 0.25F, 0.0F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.0F); // Box 114
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(0F, -0.3F, -3.3F, 4, 3, 1, 0F,0F, -1.05F, -0.75F, -0.2F, -0.55F, -0.45F, -0.2F, -0.05F, 0F, 0F, -0.8F, 0F, 0F, 0.55F, 0F, 0.3F, -0.4F, -0.6F, 0.3F, -0.4F, 0F, 0F, 0.55F, 0F); // Box 129
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(0F, 2.7F, -3.3F, 4, 2, 1, 0F,0F, -0.55F, 0F, 0.3F, 0.45F, -0.6F, 0.3F, 0.45F, 0F, 0F, -0.675F, 0F, -1F, -0.05F, 0F, -0.95F, 0.075F, -0.2F, -0.325F, 0.7F, 0F, -0.625F, 0.45F, 0.5F); // Box 130
		bodyModel[40].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box57
		leftArmModel[1] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 76
		leftArmModel[2] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 77
		leftArmModel[3] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 93
		leftArmModel[4] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 98
		leftArmModel[5] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 99
		leftArmModel[6] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 100
		leftArmModel[7] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 102
		leftArmModel[8] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 104
		leftArmModel[9] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 105
		leftArmModel[10] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 106

		leftArmModel[0].addShapeBox(2F, 7.5F, -2F, 1, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Import Box57
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2.1F, -2F, 3, 3, 4, 0F,0.3F, 0.3F, 0.3F, 1.3F, 0.3F, 0.3F, 1.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, -1.75F, 1.25F, 0.3F, 1.8F, 1.3F, 0.3F, 1.8F, 1.3F, 0.3F, -1.75F, 1.25F, 0.3F); // Box 76
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 1F, -2F, 4, 2, 4, 0F,0F, -0.2F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.4F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0F, 0F, 0.4F); // Box 77
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(0.5F, 5.3F, -1.95F, 1, 2, 1, 0F,-0.35F, 0.85F, 0.625F, -0.35F, 0.925F, 0.625F, -0.35F, 0.925F, 0F, -0.35F, 0.85F, 0F, -0.35F, 0.5F, 0.375F, -0.35F, 0.5F, 0.375F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0F); // Box 93
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 4F, -2F, 4, 4, 4, 0F,-0.5F, -0.8F, 0.5F, 0.5F, 0.2F, 0.25F, 0.5F, 0.2F, 0.25F, 0.5F, -0.8F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 98
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(0.5F, 5.3F, 1.05F, 1, 2, 1, 0F,-0.35F, 1F, 0F, -0.35F, 1.025F, 0F, -0.35F, 1.075F, 0.475F, -0.35F, 1F, 0.475F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0.275F, -0.35F, 0.5F, 0.275F); // Box 99
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-0.85F, 4F, -0.5F, 4, 4, 1, 0F,-0.5F, -0.8F, 0.5F, 0.5F, 0.2F, 0.25F, 0.5F, 0.2F, 0.25F, 0.5F, -0.8F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 100
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-0.5F, -1.45F, -0.45F, 4, 3, 1, 0F,0.625F, 0.975F, -0.35F, -0.1F, 0.975F, -0.35F, -0.1F, 1F, -0.35F, 0.625F, 1F, -0.35F, 0.375F, 0.55F, -0.35F, 0.375F, 0.65F, -0.35F, 0.375F, 0.65F, -0.35F, 0.375F, 0.55F, -0.35F); // Box 102
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(1.5F, 2.3F, -1.95F, 1, 1, 1, 0F,-0.35F, 0.85F, 0.325F, -0.35F, 0.925F, 0.325F, -0.35F, 0.925F, 0F, -0.35F, 0.85F, 0F, -0.35F, -0.3F, 0.325F, -0.35F, -0.3F, 0.325F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F); // Box 104
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(1.5F, 2.3F, 1.05F, 1, 1, 1, 0F,-0.35F, 0.85F, 0F, -0.35F, 0.925F, 0F, -0.35F, 0.925F, 0.125F, -0.35F, 0.85F, 0.125F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0.225F, -0.35F, -0.3F, 0.225F); // Box 105
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(-12.5F, 2.3F, 1.05F, 1, 1, 1, 0F,-0.35F, 0.925F, 0F, -0.35F, 0.85F, 0F, -0.35F, 0.85F, 0.225F, -0.35F, 0.925F, 0.225F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0.225F, -0.35F, -0.3F, 0.225F); // Box 106
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box101
		rightArmModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box43
		rightArmModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box55
		rightArmModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box56
		rightArmModel[4] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 92
		rightArmModel[5] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 95
		rightArmModel[6] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 96
		rightArmModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 101
		rightArmModel[8] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 103

		rightArmModel[0].addShapeBox(-2F, -2.1F, -2F, 3, 3, 4, 0F,1.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 1.3F, 0.3F, 0.3F, 1.8F, 1.3F, 0.3F, -1.75F, 1.25F, 0.3F, -1.75F, 1.25F, 0.3F, 1.8F, 1.3F, 0.3F); // Import Box101
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 1F, -2F, 4, 2, 4, 0F,0.2F, 0.3F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.15F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.4F, 0F, 0.15F); // Import Box43
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 7.5F, -2F, 1, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Import Box55
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 4F, -2F, 4, 4, 4, 0F,0.5F, 0.2F, 0.25F, -0.5F, -0.8F, 0.5F, 0.5F, -0.8F, 0.5F, 0.5F, 0.2F, 0.25F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Import Box56
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-1.5F, 5.3F, -1.95F, 1, 2, 1, 0F,-0.35F, 0.925F, 0.625F, -0.35F, 0.85F, 0.625F, -0.35F, 0.85F, 0.0F, -0.35F, 0.925F, 0.0F, -0.35F, 0.5F, 0.375F, -0.35F, 0.5F, 0.375F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F); // Box 92
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-1.5F, 5.3F, 1.05F, 1, 2, 1, 0F,-0.35F, 1.025F, 0F, -0.35F, 1F, 0F, -0.35F, 1F, 0.475F, -0.35F, 1.075F, 0.475F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0.275F, -0.35F, 0.5F, 0.275F); // Box 95
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3.15F, 4F, -0.5F, 4, 4, 1, 0F,0.5F, 0.2F, 0.25F, -0.5F, -0.8F, 0.5F, 0.5F, -0.8F, 0.5F, 0.5F, 0.2F, 0.25F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 96
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3.5F, -1.45F, -0.45F, 4, 3, 1, 0F,-0.1F, 0.975F, -0.35F, 0.625F, 0.975F, -0.35F, 0.625F, 1F, -0.35F, -0.1F, 1F, -0.35F, 0.375F, 0.65F, -0.35F, 0.375F, 0.55F, -0.35F, 0.375F, 0.55F, -0.35F, 0.375F, 0.65F, -0.35F); // Box 101
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-2.5F, 2.3F, -1.95F, 1, 1, 1, 0F,-0.35F, 0.925F, 0.275F, -0.35F, 0.85F, 0.275F, -0.35F, 0.85F, 0.0F, -0.35F, 0.925F, 0.0F, -0.35F, -0.3F, 0.375F, -0.35F, -0.3F, 0.375F, -0.35F, -0.3F, 0.0F, -0.35F, -0.3F, 0.0F); // Box 103
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box27
		leftLegModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 1
		leftLegModel[2] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 8
		leftLegModel[3] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 24
		leftLegModel[4] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 89
		leftLegModel[5] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 91

		leftLegModel[0].addShapeBox(-2F, 6.1F, -2.3F, 4, 5, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, -0.4F, 0.2F, -1F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Import Box27
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -0.9F, -2.3F, 4, 6, 3, 0F,0.2F, -4F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 1.6F, 0F, -3F, 1.6F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1.6F, 0F, 0F, 1.6F); // Box 1
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 4.1F, -2.8F, 4, 2, 3, 0F,-1.1F, 0F, 0.25F, -1.1F, 0F, 0.25F, -1.1F, 0F, -2.9F, -1.1F, 0F, -2.9F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 8
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, -0.6F, 0.9F, 0.1F, -0.6F, 0.9F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-0.5F, 2.3F, -2.2F, 1, 2, 1, 0F,-0.35F, 0.75F, 0.25F, -0.35F, 1F, 0.25F, -0.35F, 1F, 0F, -0.35F, 0.75F, 0F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0F); // Box 89
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-0.5F, 6.3F, -2.2F, 1, 4, 1, 0F,-0.35F, 0.125F, 0.25F, -0.35F, 0.125F, 0.25F, -0.35F, 0.125F, 0.0F, -0.35F, 0.125F, 0.0F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F); // Box 91
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box20
		rightLegModel[1] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box29
		rightLegModel[2] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 50
		rightLegModel[3] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 78
		rightLegModel[4] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 88
		rightLegModel[5] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 90

		rightLegModel[0].addShapeBox(-2F, -0.9F, -2.3F, 4, 6, 3, 0F,0.4F, -0.5F, 0F, 0.2F, -4F, 0F, 0F, -3F, 1.6F, 0.4F, -0.5F, 1.6F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 1.6F, 0.2F, 0F, 1.6F); // Import Box20
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 6.1F, -2.3F, 4, 5, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, -0.4F, 0.2F, -1F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Import Box29
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, -0.6F, 0.9F, 0.1F, -0.6F, 0.9F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 50
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 4.1F, -2.05F, 4, 1, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 78
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-0.5F, 2.3F, -2.2F, 1, 2, 1, 0F,-0.35F, 1F, 0.25F, -0.35F, 0.75F, 0.25F, -0.35F, 0.75F, 0.0F, -0.35F, 1F, 0.0F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F); // Box 88
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-0.5F, 6.3F, -2.2F, 1, 4, 1, 0F,-0.35F, 0.125F, 0.25F, -0.35F, 0.125F, 0.25F, -0.35F, 0.125F, 0.0F, -0.35F, 0.125F, 0.0F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F); // Box 90
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);
	}
}