//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: DiosMioCute
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDiosMioCute extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelDiosMioCute() //Same as Filename
	{
		headModel = new ModelRendererTurbo[26];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 38
		headModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 39
		headModel[3] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 85
		headModel[4] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 86
		headModel[5] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 96
		headModel[6] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 97
		headModel[7] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 98
		headModel[8] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 99
		headModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 112
		headModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 101
		headModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 102
		headModel[12] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 66
		headModel[13] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 67
		headModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 69
		headModel[15] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 70
		headModel[16] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 71
		headModel[17] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 72
		headModel[18] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 74
		headModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 75
		headModel[20] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 82
		headModel[21] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 92
		headModel[22] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 100
		headModel[23] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 101
		headModel[24] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 106
		headModel[25] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 107

		headModel[0].addShapeBox(-5F, -11F, -4F, 10, 4, 8, 0F,-1.5F, 0F, 2F, -1.5F, 0F, 2F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, 1F, 0.5F, 3.5F, 1F, 0.5F, 3.5F, 1F, 0.5F, 1.5F, 1F, 0.5F, 1.5F); // Box 50
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-5F, -6F, -6F, 10, 3, 10, 0F,1F, 0.5F, 1.5F, 1F, 0.5F, 1.5F, 1F, 0.5F, 1.5F, 1F, 0.5F, 1.5F, 0.8F, 1F, 1F, 0.8F, 1F, 1F, 0.8F, 1F, 1F, 0.8F, 1F, 1F); // Box 38
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -2F, -5.5F, 9, 1, 10, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -2.5F, 1.5F, -3F, -2.5F, 1.5F, -3F, -2.5F, 1.5F, -4F, -2.5F, 1.5F, -4F); // Box 39
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-9F, -15F, -6.5F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-9.7F, -15F, -6.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F); // Box 86
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-0.7F, -15F, -6.5F, 1, 1, 15, 0F,-9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-9.7F, -15F, -11F, 1, 1, 15, 0F,-9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-0.7F, -15F, -11F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F); // Box 98
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-9F, -15F, 3F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-3F, -9.5F, -8.2F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4.5F, 1F, -5.5F, 9, 1, 10, 0F,-2.5F, 1F, -3F, -2.5F, 1F, -3F, -2.5F, 1F, -4F, -2.5F, 1F, -4F, -4.4F, 4F, -4.9F, -4.4F, 4F, -4.9F, -4.4F, 4F, -4.9F, -4.4F, 4F, -4.9F); // Box 101
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(2F, -9.5F, -8.2F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-1F, -4F, -8F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, 0.8F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.8F, 0F, -0.2F); // Box 66
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-3F, -4F, -8F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, -1.2F, 0F, -0.2F); // Box 67
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-3F, -5F, -8F, 1, 1, 1, 0F,0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 69
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-1F, -5F, -8F, 1, 1, 1, 0F,-0.65F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 70
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(2F, -4F, -8F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.8F, 0F, -0.2F); // Box 71
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(0F, -4F, -8F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -1.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, -1.2F, 0F, -0.2F); // Box 72
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(2F, -5F, -8F, 1, 1, 1, 0F,-0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 74
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(0F, -5F, -8F, 1, 1, 1, 0F,0.25F, 0F, -0.2F, -0.65F, 0F, -0.2F, -0.65F, 0F, -0.2F, 0.25F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 75
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-17F, -17F, 1F, 7, 11, 3, 0F,2F, -1F, -3F, 0F, -3F, -4F, 0F, -3F, 4F, 2F, -1F, 3F, -2F, -2F, 0F, 5F, 3F, 0F, 5F, 3F, 0F, -2F, -2F, 0F); // Box 82
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-19F, -8F, 2F, 13, 6, 3, 0F,2F, -1F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 2F, -1F, 0F, 0F, 3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 3F, 0F); // Box 92
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(10F, -17F, 1F, 7, 11, 3, 0F,0F, -3F, -4F, 2F, -1F, -3F, 2F, -1F, 3F, 0F, -3F, 4F, 5F, 3F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 5F, 3F, 0F); // Box 100
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(6F, -8F, 2F, 13, 6, 3, 0F,2F, -2F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, -2F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -2F, 0F, 0F); // Box 101
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-17F, -1F, 1F, 7, 11, 3, 0F,-2F, -2F, 0F, 5F, 3F, 0F, 5F, 3F, 0F, -2F, -2F, 0F, 2F, -1F, -3F, 0F, -3F, -4F, 0F, -3F, 4F, 2F, -1F, 3F); // Box 106
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(10F, -1F, 1F, 7, 11, 3, 0F,5F, 3F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 5F, 3F, 0F, 0F, -3F, -4F, 2F, -1F, -3F, 2F, -1F, 3F, 0F, -3F, 4F); // Box 107
		headModel[25].setRotationPoint(0F, 0F, 0F);
	}
}