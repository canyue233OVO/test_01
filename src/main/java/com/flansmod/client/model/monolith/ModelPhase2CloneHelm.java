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

public class ModelPhase2CloneHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelPhase2CloneHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[41];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 31
		headModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 32
		headModel[4] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 39
		headModel[5] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 40
		headModel[6] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 45
		headModel[7] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 28
		headModel[8] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 34
		headModel[9] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Import 
		headModel[10] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 57
		headModel[11] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 59
		headModel[12] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 60
		headModel[13] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 63
		headModel[14] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 64
		headModel[15] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 65
		headModel[16] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 66
		headModel[17] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import 
		headModel[18] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 68
		headModel[19] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 70
		headModel[20] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 71
		headModel[21] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 73
		headModel[22] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 74
		headModel[23] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Import 
		headModel[24] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import 
		headModel[25] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import 
		headModel[26] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 78
		headModel[27] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 79
		headModel[28] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import 
		headModel[29] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 81
		headModel[30] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import 
		headModel[31] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 84
		headModel[32] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 86
		headModel[33] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 42
		headModel[34] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 96
		headModel[35] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 97
		headModel[36] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 98
		headModel[37] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 99
		headModel[38] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 100
		headModel[39] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 101
		headModel[40] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 102

		headModel[0].addShapeBox(-4F, -8F, -4F, 2, 2, 8, 0F,0.2F, 0.6F, -0.5F, 1F, 0.6F, 0.2F, 1F, -0.1F, 0.8F, 0.2F, -0.1F, 0.3F, 0.9F, -0.5F, 0.7F, 0F, -0.5F, 1.7F, 1F, 0.3F, 1.5F, 0.9F, 0.3F, 1F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.9F, -4F, 2, 1, 8, 0F,-1.2F, -0.3F, -2.5F, 1F, 0F, -2.2F, 1F, -0.6F, -0.7F, -1.2F, -0.8F, -1.2F, 0.2F, 0.3F, -0.5F, 1F, 0.3F, 0.2F, 1F, 1F, 0.8F, 0.2F, 1F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1F, -9.9F, -4F, 2, 1, 8, 0F,0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, -0.4F, -0.7F, 0.2F, -0.4F, -0.7F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F, 0.1F, -0.1F, 0.8F, 0.8F, -0.1F, 0.8F, 0.8F); // Box 31
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1F, -8F, -4F, 2, 2, 8, 0F,0F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0.8F, 1F, -0.5F, 1.7F, 1F, -0.5F, 1.7F, 0F, 0.3F, 1.5F, 0F, 0.3F, 1.5F); // Box 32
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(2F, -8F, -4F, 2, 2, 8, 0F,1F, 0.6F, 0.2F, 0.2F, 0.6F, -0.5F, 0.2F, -0.1F, 0.3F, 1F, -0.1F, 0.8F, 0F, -0.5F, 1.7F, 0.9F, -0.5F, 0.7F, 0.9F, 0.3F, 1F, 1F, 0.3F, 1.5F); // Box 39
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(2F, -9.9F, -4F, 2, 1, 8, 0F,1F, 0F, -2.2F, -1.2F, -0.3F, -2.5F, -1.2F, -0.8F, -1.2F, 1F, -0.6F, -0.7F, 1F, 0.3F, 0.2F, 0.2F, 0.3F, -0.5F, 0.2F, 1F, 0.3F, 1F, 1F, 0.8F); // Box 40
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1F, -9.9F, -4F, 2, 1, 8, 0F,0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.7F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 1F, 0.8F, 0F, 1F, 0.8F); // Box 45
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -6.5F, -4F, 1, 3, 6, 0F,0.9F, 0F, 0.7F, 1F, 0F, 1.7F, 2F, -0.8F, 1.5F, 0.9F, -0.6F, 0.6F, 0.9F, 0.2F, 0.65F, 1.07F, 1.2F, 1.7F, 2F, -1.1F, 1F, 0.9F, -1.1F, 0.5F); // Box 28
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-1F, -6.5F, -4F, 2, 4, 8, 0F,1F, 0F, 1.7F, 1F, 0F, 1.7F, 0F, -0.8F, 1.5F, 0F, -0.8F, 1.5F, 0.9F, 1.625F, 1.7F, 0.9F, 1.625F, 1.7F, 1F, 1.825F, 1.275F, 1F, 1.825F, 1.275F); // Box 34
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5F, -6.45F, -6F, 3, 1, 12, 0F,0F, 0.0F, -1.1F, 0F, 0.0F, -0.3F, 1.6F, -0.2F, -0.6F, -0.1F, -0.2F, -1.1F, 0F, -0.5F, -1.2F, 0F, -0.5F, -0.2F, 1.7F, -0.3F, -0.4F, 0F, -0.3F, -1F); // Import 
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(2.5F, -5.25F, -6.3F, 2, 2, 1, 0F,0.5F, 0F, -0.5F, 0F, 0F, -1.3F, 0F, 0F, 1.2F, 0F, 0F, 0.3F, 0.5F, -0.7F, -0.4F, 0F, -0.2F, -1.3F, 0F, -0.2F, 1.2F, 1F, -0.5F, 0F); // Box 57
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-1F, -4.25F, -6.3F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 1.3F, -0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0.2F, 0F, 0F, 0.5F, 1.2F); // Box 59
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-0.5F, -5.25F, -6.3F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 1.3F, -0.5F, -0.9F, -0.4F, 0.5F, -0.7F, -0.4F, 0F, -0.5F, 0F, 0F, -0.6F, 1.2F); // Box 60
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(3F, -1.5F, -4F, 1, 1, 8, 0F,1.1F, 0F, 1.7F, 0.9F, 0F, 0.7F, 0.9F, -0.8F, 1F, 2.05F, -0.8F, 1.45F, 1F, 1.2F, 2.3F, 0.9F, 1.2F, 0.9F, 0.9F, 1.2F, 0.9F, 1F, 1.2F, 1.4F); // Box 63
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -1.5F, -4F, 1, 1, 8, 0F,0.9F, 0F, 0.7F, 1.1F, 0F, 1.7F, 2.05F, -0.8F, 1.45F, 0.9F, -0.8F, 1F, 0.9F, 1.2F, 0.9F, 1F, 1.2F, 2.3F, 1F, 1.2F, 1.4F, 0.9F, 1.2F, 0.9F); // Box 64
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(2F, -6.45F, -6F, 3, 1, 12, 0F,0F, 0F, -0.3F, 0F, 0F, -1.1F, -0.1F, -0.2F, -1.1F, 1.6F, -0.2F, -0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F, -1.2F, 0F, -0.3F, -1F, 1.7F, -0.3F, -0.4F); // Box 65
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-2F, -6.45F, -6F, 4, 1, 11, 0F,0F, 0.0F, -0.3F, 0F, 0.0F, -0.3F, -0.4F, -0.2F, -0.8F, -0.1F, -0.2F, -1.1F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.3F, -0.3F, -0.6F, 0F, -0.3F, -1F); // Box 66
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4.5F, -6F, -4.5F, 4, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import 
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(0.5F, -6F, -4.5F, 4, 6, 9, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 68
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(3F, -5.5F, -0.5F, 1, 3, 1, 0F,1F, 0F, 1.7F, 0.775F, -1.5F, 0.7F, 0.775F, -0.9F, 1F, 2F, -0.8F, 1.5F, 1F, 1.3F, 1.9F, 0.775F, 1.3F, 0.65F, 0.775F, 1.5F, 0.9F, 2F, 1.5F, 1.4F); // Box 70
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-1F, -1.5F, -4F, 2, 1, 8, 0F,0.9F, 0F, 1.7F, 0.9F, 0F, 1.7F, -0.05F, -0.8F, 1.45F, -0.05F, -0.8F, 1.45F, 1F, 1.2F, 2.3F, 1F, 1.2F, 2.3F, 1F, 1.2F, 1.4F, 1F, 1.2F, 1.4F); // Box 71
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-1.5F, -5.25F, -6.3F, 2, 2, 1, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 1.3F, 0F, 0F, 0.3F, 0.5F, -0.7F, -0.4F, -0.5F, -0.9F, -0.4F, 0F, -0.6F, 1.2F, 0F, -0.5F, 0F); // Box 73
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-4.5F, -5.25F, -6.3F, 2, 2, 1, 0F,0F, 0F, -1.3F, 0.5F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 1.2F, 0F, -0.2F, -1.3F, 0.5F, -0.7F, -0.4F, 1F, -0.5F, 0F, 0F, -0.2F, 1.2F); // Box 74
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-5F, -5.5F, -0.5F, 10, 1, 1, 0F,0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F); // Import 
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addBox(-0.5F, -6.5F, 2.6F, 1, 1, 3, 0F); // Import 
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(3F, -5.75F, -0.5F, 2, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F); // Import 
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-4F, -5.5F, -0.5F, 1, 3, 1, 0F,0.775F, -1.5F, 0.7F, 1F, 0F, 1.7F, 2F, -0.8F, 1.5F, 0.775F, -0.9F, 1F, 0.775F, 1.3F, 0.65F, 1F, 1.3F, 1.9F, 2F, 1.5F, 1.4F, 0.775F, 1.5F, 0.9F); // Box 78
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-5F, -5.75F, -0.5F, 2, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.125F, 0F, 0.25F); // Box 79
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(2.5F, -1F, -5.5F, 1, 1, 3, 0F,0.25F, 0.25F, 0.3F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.7F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import 
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-3.5F, -1F, -5.5F, 1, 1, 3, 0F,0.25F, 0.25F, -0.2F, 0.25F, 0.25F, 0.3F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.7F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 81
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-0.5F, -0.35F, -6.45F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import 
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-3.5F, -1F, -5.5F, 1, 1, 3, 0F,0F, -0.75F, 0.2F, 0F, -0.75F, 0.6F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 84
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(3F, -6.5F, -4F, 1, 3, 6, 0F,1F, 0F, 1.7F, 0.9F, 0F, 0.7F, 0.9F, -0.6F, 0.6F, 2F, -0.8F, 1.5F, 1.07F, 1.2F, 1.7F, 0.9F, 0.2F, 0.65F, 0.9F, -1.1F, 0.5F, 2F, -1.1F, 1F); // Box 86
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-0.5F, -10.5F, -4F, 1, 1, 8, 0F,-0.1F, 0.1F, -2.6F, -0.1F, 0.1F, -2.6F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 1.2F, 0.7F, 0F, 1.2F, 0.7F); // Box 42
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-3.5F, -1F, -5.5F, 1, 1, 3, 0F,-0.25F, 0F, 0.15F, -0.25F, 0F, 0.35F, -0.25F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 96
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-3.5F, -1.5F, -5.5F, 1, 1, 3, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.6F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 97
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(2.5F, -1F, -5.5F, 1, 1, 3, 0F,-0.25F, 0F, 0.35F, -0.25F, 0F, 0.15F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 98
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(2.5F, -1.5F, -5.5F, 1, 1, 3, 0F,0F, -0.75F, 0.5F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0.6F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 99
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(2.5F, -1F, -5.5F, 1, 1, 3, 0F,0F, -0.75F, 0.6F, 0F, -0.75F, 0.2F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 100
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(0.5F, -2.25F, -6.3F, 1, 2, 1, 0F,1F, 0F, -0.4F, -1F, 0F, -0.4F, -0.5F, 0F, 1.3F, 0.5F, 0F, 0.3F, -1.35F, -0.5F, -0.4F, 0.4F, -0.9F, -0.45F, 1F, -0.2F, 1.2F, -1.5F, -1F, 0F); // Box 101
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-1.5F, -2.25F, -6.3F, 1, 2, 1, 0F,-1F, 0F, -0.4F, 1F, 0F, -0.4F, 0.5F, 0F, 0.3F, -0.5F, 0F, 1.3F, 0.4F, -0.9F, -0.45F, -1.35F, -0.5F, -0.4F, -1.5F, 0.1F, 0F, 1F, 0.1F, 1.2F); // Box 102
		headModel[40].setRotationPoint(0F, 0F, 0F);
	}
}