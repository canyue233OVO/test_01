//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FDR
// Model Creator: 
// Created on: 19.05.2020 - 08:09:04
// Last changed on: 19.05.2020 - 08:09:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFDR extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelFDR() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[57];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 14
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 15
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 16
		bodyModel[4] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 17
		bodyModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 18
		bodyModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 20
		bodyModel[8] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 21
		bodyModel[9] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 22
		bodyModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 25
		bodyModel[13] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 31
		bodyModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 32
		bodyModel[17] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 34
		bodyModel[19] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 35
		bodyModel[20] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 36
		bodyModel[21] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 37
		bodyModel[22] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 38
		bodyModel[23] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 39
		bodyModel[24] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 40
		bodyModel[25] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 41
		bodyModel[26] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 42
		bodyModel[27] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 43
		bodyModel[28] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 44
		bodyModel[29] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 45
		bodyModel[30] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 46
		bodyModel[31] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 47
		bodyModel[32] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 48
		bodyModel[33] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 50
		bodyModel[35] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 51
		bodyModel[36] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 52
		bodyModel[37] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 53
		bodyModel[38] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 54
		bodyModel[39] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 55
		bodyModel[40] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 56
		bodyModel[41] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 57
		bodyModel[42] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 58
		bodyModel[43] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 60
		bodyModel[45] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 68
		bodyModel[53] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 69
		bodyModel[54] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 70
		bodyModel[55] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 71
		bodyModel[56] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 72

		bodyModel[0].addShapeBox(-5F, 15F, -5F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-5F, 5F, 4F, 10, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 2F, -3F, 8, 12, 4, 0F,0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-5F, 1F, 4F, 10, 4, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-8F, 9F, -7F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(5F, 9F, -7F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-6F, 10F, 3.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(5F, 10F, 3.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(5F, 10F, -2.5F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-6F, 10F, -2.5F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-5F, 16F, -7F, 4, 7, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 23
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(1F, 16F, -7F, 4, 7, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 24
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-5F, 23F, -11F, 4, 1, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F); // Box 25
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(1F, 23F, -11F, 4, 1, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F); // Box 26
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-8F, 12F, -3.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-8F, 23F, -3.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-8F, 16F, 3.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-8F, 12F, 3.5F, 1, 4, 1, 0F,0F, -1F, 3.4F, 0F, -1F, 3.4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-8F, 12F, -7.5F, 1, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 3.4F, 0F, -1F, 3.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 34
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-8F, 16F, -7.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-8F, 20F, -7.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 3.4F, 0F, -1F, 3.4F); // Box 36
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-8F, 20F, 3.5F, 1, 4, 1, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3.4F, 0F, -1F, 3.4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 37
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-8F, 17F, -2.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-7F, 17F, -2.5F, 14, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 39
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-6F, 22F, -7.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(5F, 22F, -7.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(7F, 23F, -3.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(7F, 20F, -7.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 3.4F, 0F, -1F, 3.4F); // Box 43
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(7F, 12F, -7.5F, 1, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 3.4F, 0F, -1F, 3.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 44
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(7F, 16F, -7.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(7F, 12F, -3.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(7F, 12F, 3.5F, 1, 4, 1, 0F,0F, -1F, 3.4F, 0F, -1F, 3.4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(7F, 16F, 3.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(7F, 20F, 3.5F, 1, 4, 1, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3.4F, 0F, -1F, 3.4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 49
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(7F, 17F, -2.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-4F, 12F, -9F, 4, 4, 6, 0F,1F, 1F, 0F, -1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-5F, 12F, -11F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, 0F); // Box 52
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(2F, 12F, -11F, 4, 8, 4, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F); // Box 53
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(1F, 12F, -9F, 4, 4, 6, 0F,-1F, 1.5F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 54
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-6F, 17F, -1.5F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(5F, 17F, -1.5F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4F, -6F, -4F, 8, 8, 8, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 57
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-0.5F, -1.8F, -5F, 1, 2, 1, 0F,-0.2F, 0.2F, -1F, -0.2F, 0.2F, -1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 58
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-8F, 2F, -2F, 4, 6, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 59
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-8.5F, 5F, -9.5F, 4, 4, 9, 0F,-0.3F, -1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 60
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-2.5F, 2F, -2.2F, 5, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0.4F, -2.4F, 0F, 0.4F, -2.4F, 0F, 0F, -2.4F, 0F, 0F); // Box 61
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-0.5F, 2F, -2.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 62
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-6.5F, 16F, 9.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-7.5F, 18F, 9F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-7.5F, 18F, 11F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 65
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-7.5F, 18F, 7F, 1, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(4F, 2F, -2F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 67
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(4.5F, 5F, -9.5F, 4, 4, 9, 0F,-0.3F, -1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 68
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(5.5F, 16F, 9.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(6.5F, 18F, 11F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 70
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(6.5F, 18F, 7F, 1, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(6.5F, 18F, 9F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[56].setRotationPoint(0F, 0F, 0F);
	}
}