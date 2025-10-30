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

public class ModelStormTrooperHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelStormTrooperHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[46];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 32
		headModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 39
		headModel[4] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 40
		headModel[5] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 45
		headModel[6] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Import 
		headModel[7] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 63
		headModel[8] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 64
		headModel[9] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 66
		headModel[10] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 70
		headModel[11] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 71
		headModel[12] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import 
		headModel[13] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Import 
		headModel[14] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 81
		headModel[15] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Import 
		headModel[16] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 84
		headModel[17] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 96
		headModel[18] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 97
		headModel[19] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 48
		headModel[20] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 51
		headModel[21] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 52
		headModel[22] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 53
		headModel[23] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 54
		headModel[24] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 56
		headModel[25] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 57
		headModel[26] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 34
		headModel[27] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import 
		headModel[28] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 61
		headModel[29] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 66
		headModel[30] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 68
		headModel[31] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 43
		headModel[32] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 44
		headModel[33] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 122
		headModel[34] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 123
		headModel[35] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 124
		headModel[36] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 127
		headModel[37] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 128
		headModel[38] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 131
		headModel[39] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 132
		headModel[40] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 133
		headModel[41] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 134
		headModel[42] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 135
		headModel[43] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 136
		headModel[44] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 137
		headModel[45] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 138

		headModel[0].addShapeBox(-4F, -8F, -4F, 2, 2, 8, 0F,0.2F, 0.6F, -0.5F, 1F, 0.6F, 0.2F, 1F, -0.1F, 0.8F, 0.2F, -0.1F, 0.3F, 0.9F, -0.5F, 0.7F, -1F, -0.5F, 1.7F, 1F, 0.3F, 1.5F, 0.9F, 0.3F, 1F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.9F, -4F, 2, 1, 8, 0F,-1.2F, -0.3F, -2.5F, 1F, 0F, -2.2F, 1F, -0.6F, -0.7F, -1.2F, -0.8F, -1.2F, 0.2F, 0.3F, -0.5F, 1F, 0.3F, 0.2F, 1F, 1F, 0.8F, 0.2F, 1F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1F, -8F, -4F, 2, 2, 8, 0F,0F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0.8F, 2F, -0.5F, 1.7F, 2F, -0.5F, 1.7F, 0F, 0.3F, 1.5F, 0F, 0.3F, 1.5F); // Box 32
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(2F, -8F, -4F, 2, 2, 8, 0F,1F, 0.6F, 0.2F, 0.2F, 0.6F, -0.5F, 0.2F, -0.1F, 0.3F, 1F, -0.1F, 0.8F, -1F, -0.5F, 1.7F, 0.9F, -0.5F, 0.7F, 0.9F, 0.3F, 1F, 1F, 0.3F, 1.5F); // Box 39
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(2F, -9.9F, -4F, 2, 1, 8, 0F,1F, 0F, -2.2F, -1.2F, -0.3F, -2.5F, -1.2F, -0.8F, -1.2F, 1F, -0.6F, -0.7F, 1F, 0.3F, 0.2F, 0.2F, 0.3F, -0.5F, 0.2F, 1F, 0.3F, 1F, 1F, 0.8F); // Box 40
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-1F, -9.9F, -4F, 2, 1, 8, 0F,0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.7F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 1F, 0.8F, 0F, 1F, 0.8F); // Box 45
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -6.45F, -6F, 3, 1, 7, 0F,0F, 0.0F, -1.1F, -1F, 0.0F, -0.15F, 1.6F, -0.2F, -0.6F, -0.1F, -0.2F, -1.1F, 0F, -0.5F, -1.2F, -1F, -0.5F, -0.05F, 1.7F, -0.3F, -0.4F, 0F, -0.3F, -1F); // Import 
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(3F, -1.5F, -4F, 1, 1, 4, 0F,1.1F, 0F, 2.7F, 0.9F, 0F, 0.7F, 0.9F, 1.2F, 1F, 2.05F, -0.55F, 1.45F, 1F, 1.2F, 2.3F, 1.15F, 1.2F, 0.9F, 1.275F, 1.2F, 0.9F, 1F, 1.2F, 1.4F); // Box 63
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -1.5F, -4F, 1, 1, 4, 0F,0.9F, 0F, 0.7F, 1.1F, 0F, 2.7F, 2.05F, -0.8F, 1.45F, 0.9F, 1.2F, 1F, 1.15F, 1.2F, 0.9F, 1F, 1.2F, 2.3F, 1F, 1.2F, 1.4F, 1.275F, 1.2F, 0.9F); // Box 64
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-2F, -6.45F, -6F, 4, 1, 6, 0F,1F, 0.0F, -0.15F, 1F, 0.0F, -0.15F, -0.45F, -0.2F, -0.8F, -0.1F, -0.2F, -1.1F, 1F, -0.5F, -0.05F, 1F, -0.5F, -0.05F, -0.3F, -0.3F, -0.6F, 0F, -0.3F, -1F); // Box 66
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(3F, -7.5F, -0.95F, 1, 5, 1, 0F,1F, 0F, 1.7F, 0.775F, -1.5F, 0.7F, 0.775F, -1.2F, 1F, 2F, -0.8F, 1.5F, 1F, 1.3F, 1.9F, 0.775F, 1.3F, 0.65F, 0.775F, 1.5F, 0.9F, 2F, 1.5F, 1.4F); // Box 70
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-1F, -1.5F, -4F, 2, 1, 6, 0F,0.9F, 0F, 2.7F, 0.9F, 0F, 2.7F, -0.05F, -0.8F, 1.45F, -0.05F, -0.8F, 1.45F, 1F, 1.2F, 2.3F, 1F, 1.2F, 2.3F, 1F, 1.2F, 1.4F, 1F, 1.2F, 1.4F); // Box 71
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-3.5F, -7F, 2.1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.025F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.25F, 0F, 0F, 0.125F); // Import 
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(3F, -5.75F, -0.8F, 2, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.025F, 1F, 0.25F, 0.025F, 1F, 0.25F, 0F, 0F, 0.25F); // Import 
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-3.5F, -1F, -6F, 1, 1, 3, 0F,0.25F, 0.25F, 0.45F, 0.25F, 0.25F, 0.8F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.3F, 0.25F, 0.25F, 0.6F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 81
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-1F, -1.35F, -6.95F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, -0.2F, -0.25F, 0.5F, -0.2F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Import 
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-3.5F, -1F, -6F, 1, 1, 3, 0F,-0.25F, 0F, 0.7F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.7F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 84
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-3.5F, -1F, -6F, 1, 1, 3, 0F,0F, -0.75F, 0.45F, 0F, -0.75F, 0.65F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0.45F, -0.25F, 0F, 0.55F, -0.25F, 0F, 0F, -0.1F, 0F, 0F); // Box 96
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-3.5F, -0.5F, -6F, 1, 1, 3, 0F,0F, 0.25F, 0.5F, 0F, 0.25F, 0.7F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.45F, 0F, -0.75F, 0.65F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 97
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(2F, -6.45F, -6F, 3, 1, 7, 0F,-1F, 0F, -0.15F, 0F, 0F, -1.1F, -0.1F, -0.2F, -1.1F, 1.6F, -0.2F, -0.6F, -1F, -0.5F, -0.05F, 0F, -0.5F, -1.2F, 0F, -0.3F, -1F, 1.7F, -0.3F, -0.4F); // Box 48
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-5F, -5.75F, -0.8F, 2, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.025F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.025F, 1F, 0.25F); // Box 51
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-4F, -7.5F, -0.95F, 1, 5, 1, 0F,0.775F, -1.5F, 0.7F, 1F, 0F, 1.7F, 2F, -0.8F, 1.5F, 0.775F, -1.2F, 1F, 0.775F, 1.3F, 0.65F, 1F, 1.3F, 1.9F, 2F, 1.5F, 1.4F, 0.775F, 1.5F, 0.9F); // Box 52
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(2.5F, -7F, 2.1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.75F, 0F, 0.025F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0.75F, 0F, 0.25F); // Box 53
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(3F, -1.5F, 2F, 1, 1, 2, 0F,4.05F, 1.2F, 1.45F, 0.9F, 1.2F, 1F, 0.9F, 1F, 0.7F, 2.95F, 1F, 1.7F, 3F, 1.2F, 1.4F, 1.275F, 1.2F, 1.1F, 1.15F, 1.2F, 1.15F, 3F, 1.2F, 1.925F); // Box 54
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-4F, -1.5F, 2F, 1, 1, 2, 0F,0.9F, 1.2F, 1F, 4.05F, 1.2F, 1.45F, 3.05F, 1F, 1.7F, 0.9F, 1F, 0.7F, 1.275F, 1.2F, 1.1F, 3F, 1.2F, 1.4F, 3F, 1.2F, 1.925F, 1.15F, 1.2F, 1.15F); // Box 56
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-4.5F, -6F, -4.5F, 4, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0.8F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1.25F, 0.5F, 0F, 0.25F); // Box 57
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-1F, -6.5F, -0.7F, 2, 4, 4, 0F,0F, 0F, 1.7F, 0F, 0F, 1.7F, -0.5F, -0.8F, 2F, -0.5F, -0.8F, 2F, 0.9F, 1F, 2.725F, 0.9F, 1F, 2.775F, -0.5F, 1.7F, 2.4F, -0.5F, 1.7F, 2.4F); // Box 34
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-5F, -5.75F, -1.25F, 10, 2, 2, 0F,0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F); // Import 
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-1F, -6.5F, -4F, 2, 4, 1, 0F,-0.5F, -0.25F, 1.7F, -0.5F, -0.25F, 1.7F, 1.5F, -0.3F, -2F, 1.5F, -0.3F, -2F, 0.15F, 1F, 2.725F, 0.15F, 1F, 2.725F, 3.55F, 1.7F, -0.975F, 3.5F, 1.7F, -0.975F); // Box 61
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-3F, -5.6F, -6.15F, 2, 2, 1, 0F,0.5F, 0F, -1.05F, 0.125F, 0F, -0.45F, 0.875F, 0F, 0.3F, 0.5F, 0F, 1.2F, 0.2F, -0.85F, -0.9F, -1.5F, -0.875F, -0.75F, -1.5F, -1F, 1.75F, -0.25F, -0.95F, 1.2F); // Box 66
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(0.5F, -3.75F, -7.2F, 1, 2, 1, 0F,0.75F, 0F, -0.8F, -1.25F, 0F, -0.8F, -1.25F, 0F, 1.3F, 0.5F, 0F, 0.3F, -0.6F, -1.05F, -0.65F, -0.35F, -1.35F, -0.7F, -1F, -0.95F, 1.2F, -0.25F, -1.5F, 1.75F); // Box 68
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(0.5F, -6F, -4.5F, 4, 6, 9, 0F,0F, 0F, 1.25F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.8F, 0F, 0F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 1.25F); // Box 43
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-2.8F, -5.85F, -6.3F, 2, 2, 1, 0F,0.9F, 0.05F, -1.475F, 0.175F, 0.05F, -0.6F, 0.925F, 0.05F, 0.3F, 0.9F, 0.05F, 1.2F, 0.65F, 0F, -1.2F, 0.025F, -0.975F, -0.4F, 0.675F, -1.4F, 0F, 0.9F, 0F, 1.2F); // Box 44
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(0.98F, -5.85F, -6.3F, 2, 2, 1, 0F,0.225F, 0.05F, -0.6F, 0.9F, 0.05F, -1.475F, 0.9F, 0.05F, 1.2F, 0.925F, 0.05F, 0.3F, 0.075F, -0.975F, -0.35F, 0.65F, 0F, -1.1F, 0.9F, 0F, 1.2F, 0.675F, -1.4F, 0F); // Box 122
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(1.08F, -5.6F, -6.3F, 2, 2, 1, 0F,0.125F, 0F, -0.45F, 0.5F, 0F, -1.05F, 0.5F, 0F, 1.2F, 0.875F, 0F, 0.3F, -1.5F, -0.875F, -0.75F, 0.2F, -0.85F, -0.9F, -0.25F, -0.95F, 1.2F, -1.5F, -1F, 1.75F); // Box 123
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-1.5F, -3.75F, -7.2F, 1, 2, 1, 0F,-1.25F, 0F, -0.8F, 0.75F, 0F, -0.8F, 0.5F, 0F, 0.3F, -2F, 0F, 1.3F, -0.35F, -1.35F, -0.7F, -0.6F, -1.05F, -0.65F, -0.25F, -1.5F, 1.75F, -1F, -0.95F, 1.2F); // Box 124
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-2.5F, -3.05F, -7.2F, 1, 2, 1, 0F,-1.35F, 0.05F, -0.7F, 0.4F, -0.25F, -0.65F, 0.65F, -0.1F, 0.3F, -1.95F, -0.35F, 1.3F, -0.3F, -1.05F, -1.45F, -0.6F, -1.05F, -1.4F, -0.25F, -0.5F, 1.75F, -1F, -0.95F, 1.2F); // Box 127
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(1.5F, -3.05F, -7.2F, 1, 2, 1, 0F,0.4F, -0.25F, -0.65F, -1.35F, 0.05F, -0.7F, -1.95F, -0.35F, 1.3F, 0.65F, -0.1F, 0.3F, -0.6F, -1.05F, -1.25F, -0.3F, -1F, -1.35F, -1F, -0.95F, 1.2F, -0.25F, -0.5F, 1.75F); // Box 128
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-4.4F, -4.7F, -4.55F, 1, 1, 1, 0F,-0.4F, -0.55F, 0.2F, -0.2F, -0.95F, 0.3F, -0.2F, -0.95F, 0F, -0.4F, -0.55F, 0.0F, -0.2F, 0.5F, 0.125F, -0.2F, 0.5F, 0.3F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.0F); // Box 131
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(3.6F, -4.7F, -4.75F, 1, 1, 1, 0F,-0.2F, -0.95F, 0.125F, -0.4F, -0.55F, 0F, -0.4F, -0.55F, 0F, -0.2F, -0.95F, 0F, -0.2F, 0.5F, 0.125F, -0.2F, 0.5F, -0.125F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 132
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-5.05F, -8.1F, -2.55F, 1, 1, 1, 0F,-0.5F, -0.55F, 0.2F, -0.2F, -0.575F, 0.3F, -0.2F, -0.575F, 0F, -0.5F, -0.55F, 0.0F, -0.2F, 0.5F, 0.125F, -0.2F, 0.5F, 0.3F, -0.2F, 0.5F, 0.0F, -0.2F, 0.5F, 0.0F); // Box 133
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(4.05F, -8.1F, -2.55F, 1, 1, 1, 0F,-0.2F, -0.575F, 0.3F, -0.5F, -0.55F, 0.2F, -0.5F, -0.55F, 0F, -0.2F, -0.575F, 0F, -0.2F, 0.5F, 0.3F, -0.2F, 0.5F, 0.125F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 134
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(2.5F, -1F, -6F, 1, 1, 3, 0F,0.25F, 0.25F, 0.8F, 0.25F, 0.25F, 0.45F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.6F, 0.25F, 0.25F, 0.3F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 135
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(2.5F, -1F, -6F, 1, 1, 3, 0F,-0.25F, 0F, 0.75F, -0.25F, 0F, 0.7F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0.7F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 136
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(2.5F, -0.5F, -6F, 1, 1, 3, 0F,0F, 0.25F, 0.7F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.65F, 0F, -0.75F, 0.45F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 137
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(2.5F, -1F, -6F, 1, 1, 3, 0F,0F, -0.75F, 0.65F, 0F, -0.75F, 0.45F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0.55F, -0.25F, 0F, 0.45F, -0.1F, 0F, 0F, -0.25F, 0F, 0F); // Box 138
		headModel[45].setRotationPoint(0F, 0F, 0F);
	}
}