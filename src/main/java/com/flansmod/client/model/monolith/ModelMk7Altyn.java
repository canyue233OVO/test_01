//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Mk7Altyn
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMk7Altyn extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelMk7Altyn() //Same as Filename
	{
		headModel = new ModelRendererTurbo[85];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 32
		headModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		headModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 45
		headModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		headModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
		headModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 6
		headModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 43
		headModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 45
		headModel[10] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 48
		headModel[11] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 50
		headModel[12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 51
		headModel[13] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 52
		headModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 54
		headModel[15] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 56
		headModel[16] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 57
		headModel[17] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 58
		headModel[18] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 59
		headModel[19] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 60
		headModel[20] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 61
		headModel[21] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 62
		headModel[22] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 63
		headModel[23] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 25
		headModel[24] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 26
		headModel[25] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 28
		headModel[26] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 29
		headModel[27] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 30
		headModel[28] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 32
		headModel[29] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 34
		headModel[30] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 35
		headModel[31] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 36
		headModel[32] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 37
		headModel[33] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 38
		headModel[34] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 40
		headModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 41
		headModel[36] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 42
		headModel[37] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 43
		headModel[38] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 44
		headModel[39] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 45
		headModel[40] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 46
		headModel[41] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 47
		headModel[42] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 48
		headModel[43] = new ModelRendererTurbo(this, 77, 30, textureX, textureY); // Box 49
		headModel[44] = new ModelRendererTurbo(this, 69, 32, textureX, textureY); // Box 50
		headModel[45] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 51
		headModel[46] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 52
		headModel[47] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 53
		headModel[48] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 54
		headModel[49] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 55
		headModel[50] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 56
		headModel[51] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 57
		headModel[52] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 58
		headModel[53] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 59
		headModel[54] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 60
		headModel[55] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 61
		headModel[56] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 62
		headModel[57] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 63
		headModel[58] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 64
		headModel[59] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 65
		headModel[60] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 1
		headModel[61] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 2
		headModel[62] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 4
		headModel[63] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 5
		headModel[64] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 6
		headModel[65] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 8
		headModel[66] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 9
		headModel[67] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 10
		headModel[68] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 11
		headModel[69] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 13
		headModel[70] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 14
		headModel[71] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 16
		headModel[72] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 17
		headModel[73] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 23
		headModel[74] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 24
		headModel[75] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 25
		headModel[76] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 26
		headModel[77] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 27
		headModel[78] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 28
		headModel[79] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 30
		headModel[80] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 32
		headModel[81] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 3
		headModel[82] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 29
		headModel[83] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 91
		headModel[84] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 92

		headModel[0].addShapeBox(2F, -8.6F, -4.3F, 2, 3, 8, 0F,1F, 0.8F, 0.5F, 0.2F, 0.8F, -0.5F, 0.2F, -0.1F, 0.7F, 1F, -0.3F, 1.3F, 0F, -1.2F, 2F, 1F, -1F, 0.7F, 1F, 0.3F, 1.2F, 0F, 0.3F, 2F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(2F, -10.5F, -4.3F, 2, 1, 8, 0F,1F, 0.2F, -2.3F, -1.4F, -0.2F, -2.7F, -1.4F, -0.5F, -1.2F, 1F, -0.2F, -0.7F, 1F, 0.1F, 0.5F, 0.2F, 0.1F, -0.5F, 0.2F, 1F, 0.7F, 1F, 1.2F, 1.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1F, -8.6F, -4.3F, 2, 3, 8, 0F,0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, -0.3F, 1.3F, 0F, -0.3F, 1.3F, 1F, -1.2F, 2F, 1F, -1.2F, 2F, 1F, 0.3F, 2F, 1F, 0.3F, 2F); // Box 32
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(0F, -6.1F, -4.3F, 1, 5, 1, 0F,0F, 0.7F, 2F, 1F, 0.7F, 2F, 1F, -0.8F, 2F, 0F, -0.8F, 2F, 0F, -3.3F, 2.8F, 0.5F, -3.4F, 2.4F, 0.5F, -2.7F, 0F, 0F, -2F, 0F); // Box 34
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-1F, -10.5F, -4.3F, 2, 1, 8, 0F,0F, 0.2F, -2.3F, 0F, 0.2F, -2.3F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 1.2F, 1.3F, 0F, 1.2F, 1.3F); // Box 45
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(2F, -6.1F, -5.3F, 3, 5, 2, 0F,0F, 0.7F, 1F, 0F, 0.5F, -0.3F, 0F, 0.18F, 1F, 0F, 0.1F, 0F, 0.5F, -3.4F, 1.4F, 0F, -4.1F, 0.2F, 0.1F, -3.8F, 0.79F, 0.5F, -2.7F, 0F); // Box 2
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(3F, -6.1F, -3.3F, 1, 5, 5, 0F,1F, 0.15F, -1F, 1F, 0.15F, -1F, 1F, -0.35F, 0F, 1F, 0F, 1.7F, 1F, -0.5F, -0.3F, 1.3F, -0.5F, -0.3F, 1.3F, -0.1F, -0.4F, 1F, -0.1F, 1.9F); // Box 3
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(2F, -6.1F, 1.7F, 3, 5, 2, 0F,0F, 0F, 1.7F, 0F, -0.35F, 0F, 0F, -0.8F, 1.2F, 0F, -0.8F, 2F, 0F, -1.3F, 1.9F, 0.3F, -0.1F, 0.4F, 0.1F, 0.1F, 0.75F, 0.05F, 0.3F, 1.65F); // Box 6
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(0F, -5.1F, -5.6F, 2, 2, 1, 0F,-0.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-1.5F, -3.1F, -6.8F, 3, 3, 3, 0F,-0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -1.4F, 4F, 0F, -1.4F, 4F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(0.5F, -3.1F, -6.8F, 2, 3, 3, 0F,-0.5F, -0.2F, 0F, 0.2F, -0.5F, -1F, 0.2F, 0.4F, -1F, -0.29F, 0.6F, -2.3F, -1F, -0.2F, 0.5F, 0.2F, -0.2F, -0.5F, 0.2F, 0F, 0F, -1F, 0F, 0F); // Box 48
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(3F, -3.1F, -5.8F, 1, 3, 2, 0F,0.3F, -0.5F, 0F, 0.18F, 1.5F, -1.35F, 0.2F, 2F, 0F, 0.3F, 0.4F, -1F, 0.3F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.1F, 0F, 0.3F, 0F, 0F); // Box 50
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-1.5F, -11.5F, -2.3F, 3, 1, 6, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 1.4F, 2F, 0.2F, 1.4F, 2F); // Box 51
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(4F, -3.1F, -5.8F, 1, 3, 6, 0F,-0.2F, 1.8F, -1.4F, -0.4F, 2F, -2.5F, -0.3F, 2F, 1F, 0F, 2F, 1F, 0F, -0.2F, -0.5F, -0.2F, -0.2F, -1.5F, 0F, 0F, 0F, 0F, -0.1F, 0F); // Box 52
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-2F, -6.1F, 2.7F, 3, 5, 1, 0F,0F, 0.7F, 2F, 1F, 0.7F, 2F, 1F, -0.8F, 2F, 0F, -0.8F, 2F, 0F, -3.4F, 2.8F, 0.5F, -3.8F, 2.4F, 1F, 0.3F, 1.65F, 0F, 0.3F, 1.65F); // Box 54
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(2F, -5.1F, -5.3F, 2, 2, 1, 0F,0F, 0F, -0.2F, 0.1F, 0F, -1F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.3F, -1F, -1.2F, 0F, 0F, 2.5F, 0F, 0F, 0F); // Box 56
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-1F, -6.1F, -4.3F, 1, 5, 1, 0F,1F, 0.7F, 2F, 0F, 0.7F, 2F, 0F, -0.8F, 2F, 1F, -0.8F, 2F, 0.5F, -3.4F, 2.4F, 0F, -3.3F, 2.8F, 0F, -2F, 0F, 0.5F, -2.7F, 0F); // Box 57
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-1.5F, -11.5F, -4.7F, 7, 3, 3, 0F,0F, -0.8F, -0.3F, -4F, -0.8F, -0.3F, -4F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, -0.8F, -0.3F, -3.8F, -0.8F, -0.3F, -3.8F, -1.9F, -0.3F, 0.2F, -1.9F, -0.3F); // Box 58
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(4.1F, -3.1F, -1.3F, 2, 3, 3, 0F,0F, 0.9F, 0.5F, 0.1F, 0.9F, 0F, 0.1F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 1F, 0.4F, 0F, 0.5F, 0.4F, 0.3F, -0.4F, 0F, 0.4F, 0.1F); // Box 59
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(4.1F, -5F, -1.3F, 2, 1, 3, 0F,0F, 0.7F, -0.6F, 0F, 0.2F, -1F, 0F, 0F, -0.5F, 0F, 0.4F, 0F, 0F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0.4F, 0F, 0F, 0.4F, 0.5F); // Box 60
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(5.6F, -3.8F, -1.3F, 1, 1, 3, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0.1F, -0.1F, -0.7F, 0.1F, -0.1F, -0.7F, 0F, -0.1F, -0.5F); // Box 61
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(5.6F, -4.6F, -1.3F, 1, 1, 3, 0F,0F, -0.1F, -1.1F, -0.05F, -0.1F, -1.1F, -0.05F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F); // Box 62
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(5.6F, -3F, -1.3F, 1, 1, 3, 0F,0F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -1.1F, 0.15F, -0.1F, -1.1F, 0.15F, -0.1F, -1.1F, 0F, -0.1F, -1.1F); // Box 63
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-1.5F, -9.1F, 3.2F, 3, 4, 2, 0F,0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 2F, 0.2F, 0F, 2F); // Box 25
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(3.7F, -2.5F, -4.3F, 2, 2, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0.4F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, 0F, 0.9F, 0.2F, 0F, 0.5F, 0.6F, 0.3F, -0.4F, 0F, 0.4F, 0.1F); // Box 26
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(3.7F, -3.1F, -4.3F, 2, 1, 3, 0F,0F, 0.4F, 0.3F, -0.8F, 0.3F, -0.1F, -0.4F, 0F, 0.6F, 0F, 0F, 0.1F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0.5F); // Box 28
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(1F, -2.4F, -6.8F, 2, 2, 2, 0F,0F, 0F, 0F, 0.4F, 0F, -0.2F, 0.4F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.3F, 0.5F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.2F, 0F); // Box 29
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(2.7F, -2.3F, -6.5F, 2, 1, 1, 0F,0F, -0.1F, 0.1F, 0F, 0F, -0.6F, 0F, 0F, 0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.1F, 0F, -0.2F, -0.6F, 0F, -0.2F, 0.5F, 0F, -0.1F, -0.1F); // Box 30
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(2.9F, -1.5F, -6.6F, 2, 1, 1, 0F,0F, -0.1F, 0.1F, 0F, -0.1F, -0.6F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, -0.6F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.1F); // Box 32
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(2F, -4.6F, 3.7F, 2, 3, 1, 0F,1F, 1F, 0F, 1F, 0.65F, 0F, 1F, -0.8F, 1.2F, 0.3F, -0.8F, 2.34F, 0.5F, 0F, 0F, 1.3F, -0.1F, 0F, 1.1F, 0.3F, 0.75F, 0.3F, 0.5F, 2F); // Box 34
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-1.5F, -5.1F, 3.2F, 3, 4, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 2F, 0.2F, 0F, 2F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 1.5F, 0.2F, 0F, 1.5F); // Box 35
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(4.4F, -4.6F, 0.7F, 1, 3, 3, 0F,0F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.8F, 1.2F, -0.6F, -0.8F, 2.2F, 0F, 0F, 0.9F, 0.9F, -0.1F, 0.4F, 0.7F, 0.1F, 0.75F, -0.7F, 0.3F, 1.8F); // Box 36
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(4.4F, -4.8F, 0.7F, 1, 1, 3, 0F,0F, 0.7F, 0.9F, 0.5F, -0.3F, 0.4F, 0.5F, -0.9F, 1F, -0.6F, -0.2F, 1F, 0F, -0.5F, 0F, 0.6F, -0.5F, 0F, 0.6F, 0F, 1.2F, -0.6F, 0F, 2.2F); // Box 37
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(5F, -1.6F, 0.7F, 1, 2, 3, 0F,1F, 0F, 0F, 0.27F, 0.05F, 0F, 0.15F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, -0.5F, 0F, 0.4F, -0.5F, -0.5F, 0.3F, -0.4F, -1.5F, 0F, -0.4F, -1.5F); // Box 38
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-5F, -6.1F, -5.3F, 3, 5, 2, 0F,0F, 0.5F, -0.3F, 0F, 0.7F, 1F, 0F, 0.1F, 0F, 0F, 0.18F, 1F, 0F, -4.1F, 0.2F, 0.5F, -3.4F, 1.4F, 0.5F, -2.7F, 0F, 0.1F, -3.8F, 0.79F); // Box 40
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-4F, -8.6F, -4.3F, 2, 3, 8, 0F,0.2F, 0.8F, -0.5F, 1F, 0.8F, 0.5F, 1F, -0.3F, 1.3F, 0.2F, -0.1F, 0.7F, 1F, -1F, 0.7F, 0F, -1.2F, 2F, 0F, 0.3F, 2F, 1F, 0.3F, 1.2F); // Box 41
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-4F, -10.5F, -4.3F, 2, 1, 8, 0F,-1.4F, -0.2F, -2.7F, 1F, 0.2F, -2.3F, 1F, -0.2F, -0.7F, -1.4F, -0.5F, -1.2F, 0.2F, 0.1F, -0.5F, 1F, 0.1F, 0.5F, 1F, 1.2F, 1.3F, 0.2F, 1F, 0.7F); // Box 42
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-4F, -6.1F, -3.3F, 1, 5, 5, 0F,1F, 0.15F, -1F, 1F, 0.15F, -1F, 1F, 0F, 1.7F, 1F, -0.35F, 0F, 1.3F, -0.5F, -0.3F, 1F, -0.5F, -0.3F, 1F, -0.1F, 1.9F, 1.3F, -0.1F, -0.4F); // Box 43
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-5F, -6.1F, 1.7F, 3, 5, 2, 0F,0F, -0.35F, 0F, 0F, 0F, 1.7F, 0F, -0.8F, 2F, 0F, -0.8F, 1.2F, 0.3F, -0.1F, 0.4F, 0F, -1.3F, 1.9F, 0.05F, 0.3F, 1.65F, 0.1F, 0.1F, 0.75F); // Box 44
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-4F, -4.6F, 3.7F, 2, 3, 1, 0F,0.9F, 0.65F, 0F, 1F, 1F, 0F, 0.3F, -0.8F, 2.34F, 1F, -0.8F, 1.2F, 1.3F, -0.1F, 0F, 0.5F, 0F, 0F, 0.3F, 0.5F, 2F, 1.1F, 0.3F, 0.75F); // Box 45
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-5.4F, -4.6F, 0.7F, 1, 3, 3, 0F,0.6F, -0.3F, 0F, 0F, -0.3F, 0F, -0.6F, -0.8F, 2.2F, 0.6F, -0.8F, 1.2F, 0.9F, -0.1F, 0.4F, 0F, 0F, 0.9F, -0.7F, 0.3F, 1.8F, 0.7F, 0.1F, 0.75F); // Box 46
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-5.4F, -4.8F, 0.7F, 1, 1, 3, 0F,0.5F, -0.3F, 0.4F, 0F, 0.7F, 0.9F, -0.55F, -0.2F, 1F, 0.5F, -0.9F, 1F, 0.6F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, 2.2F, 0.6F, 0F, 1.2F); // Box 47
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-6F, -1.6F, 0.7F, 1, 2, 3, 0F,0.27F, 0.05F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0.4F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.4F, -1.5F, 0.3F, -0.4F, -1.5F); // Box 48
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-2F, -5.1F, -5.6F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.8F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(-4F, -5.1F, -5.3F, 2, 2, 1, 0F,0.1F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.3F, -1F, -1.2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 2.5F); // Box 50
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(-2.5F, -3.1F, -6.8F, 2, 3, 3, 0F,0.2F, -0.5F, -1F, -0.5F, -0.2F, 0F, -0.29F, 0.6F, -2.3F, 0.2F, 0.4F, -1F, 0.2F, -0.2F, -0.5F, -1F, -0.2F, 0.5F, -1F, 0F, 0F, 0.2F, 0F, 0F); // Box 51
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(-4F, -3.1F, -5.8F, 1, 3, 2, 0F,0.18F, 1.5F, -1.35F, 0.3F, -0.5F, 0F, 0.3F, 0.4F, -1F, 0.2F, 2F, 0F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, 0.5F, 0.3F, 0F, 0F, 0F, -0.1F, 0F); // Box 52
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(-3F, -2.4F, -6.8F, 2, 2, 2, 0F,0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, 0F, 0.3F, 0F, 0.2F, 0F, 0.5F, 0.1F, 0F); // Box 53
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(-4.8F, -2.3F, -6.5F, 2, 1, 1, 0F,0F, 0F, -0.6F, 0F, -0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0.5F, 0F, -0.2F, -0.6F, 0F, -0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, 0.5F); // Box 54
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(-5F, -1.5F, -6.6F, 2, 1, 1, 0F,0F, -0.1F, -0.6F, 0F, -0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.6F, 0F, -0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.5F); // Box 55
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(-5.1F, -2.5F, -6.1F, 1, 1, 2, 0F,0F, -0.2F, 0.8F, -0.1F, -0.2F, 1.1F, -0.8F, -0.1F, 0.1F, 0.7F, -0.1F, 0.1F, 0F, 0F, 0.8F, -0.1F, 0F, 1.1F, -0.8F, -0.1F, 0.1F, 0.8F, -0.1F, 0.1F); // Box 56
		headModel[50].setRotationPoint(0F, 0F, 0F);

		headModel[51].addShapeBox(-5.3F, -1.5F, -6.2F, 1, 1, 2, 0F,-0.1F, -0.1F, 0.6F, -0.1F, -0.1F, 0.8F, -0.7F, -0.1F, -0.3F, 0.5F, -0.1F, -0.3F, -0.1F, -0.1F, 0.6F, -0.1F, -0.1F, 0.8F, -0.7F, -0.1F, -0.5F, 0.6F, -0.1F, -0.5F); // Box 57
		headModel[51].setRotationPoint(0F, 0F, 0F);

		headModel[52].addShapeBox(-5.8F, -2.5F, -4.3F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.4F, 0.5F, 0.4F, -0.4F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 0.9F, 0F, 0.4F, 0.1F, 0.6F, 0.3F, -0.4F); // Box 58
		headModel[52].setRotationPoint(0F, 0F, 0F);

		headModel[53].addShapeBox(-5.8F, -3.1F, -4.3F, 2, 1, 3, 0F,-0.8F, 0.3F, -0.1F, 0F, 0.4F, 0.3F, 0F, 0F, 0.1F, -0.4F, 0F, 0.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, 0F, 0.5F, 0.4F, 0F, 0F); // Box 59
		headModel[53].setRotationPoint(0F, 0F, 0F);

		headModel[54].addShapeBox(-5F, -3.1F, -5.8F, 1, 3, 6, 0F,-0.4F, 2F, -2.5F, -0.2F, 1.8F, -1.4F, 0F, 2F, 1F, -0.3F, 2F, 1F, -0.2F, -0.2F, -1.5F, 0F, -0.2F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F); // Box 60
		headModel[54].setRotationPoint(0F, 0F, 0F);

		headModel[55].addShapeBox(-6.1F, -3.1F, -1.3F, 2, 3, 3, 0F,0.1F, 0.9F, 0F, 0F, 0.9F, 0.5F, 0F, 0.5F, 0.5F, 0.1F, 0.5F, 0F, 0.4F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0.4F, 0.1F, 0.4F, 0.3F, -0.4F); // Box 61
		headModel[55].setRotationPoint(0F, 0F, 0F);

		headModel[56].addShapeBox(-6.1F, -5F, -1.3F, 2, 1, 3, 0F,0F, 0.2F, -1F, 0F, 0.7F, -0.6F, 0F, 0.4F, 0F, 0F, 0F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.4F, 0.5F, 0.1F, 0.4F, 0F); // Box 62
		headModel[56].setRotationPoint(0F, 0F, 0F);

		headModel[57].addShapeBox(-6.6F, -3F, -1.3F, 1, 1, 3, 0F,0.1F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.15F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0.15F, -0.1F, -1.1F); // Box 63
		headModel[57].setRotationPoint(0F, 0F, 0F);

		headModel[58].addShapeBox(-6.6F, -3.8F, -1.3F, 1, 1, 3, 0F,0F, -0.1F, -0.7F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.7F, 0.1F, -0.1F, -0.7F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0.1F, -0.1F, -0.7F); // Box 64
		headModel[58].setRotationPoint(0F, 0F, 0F);

		headModel[59].addShapeBox(-6.6F, -4.6F, -1.3F, 1, 1, 3, 0F,-0.05F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, -0.05F, -0.1F, -1.1F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F); // Box 65
		headModel[59].setRotationPoint(0F, 0F, 0F);

		headModel[60].addShapeBox(-2F, -7F, -8F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 1
		headModel[60].setRotationPoint(0F, 0F, 0F);

		headModel[61].addShapeBox(2F, -7F, -8F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0.4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.4F, 0F, 0F, -3F, 0F, 0F); // Box 2
		headModel[61].setRotationPoint(0F, 0F, 0F);

		headModel[62].addShapeBox(2F, -3F, -8F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0.4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.4F, 0F, 0F, -3F, 0F, 0F); // Box 4
		headModel[62].setRotationPoint(0F, 0F, 0F);

		headModel[63].addShapeBox(4F, -7F, -4F, 1, 7, 2, 0F,-1F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 5
		headModel[63].setRotationPoint(0F, 0F, 0F);

		headModel[64].addShapeBox(4F, -7F, -2F, 1, 7, 1, 0F,-1F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, -1F, 0F, -1F, -1F, 0F); // Box 6
		headModel[64].setRotationPoint(0F, 0F, 0F);

		headModel[65].addShapeBox(-2F, -3F, -8F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.6F, 0.5F, 0F, -0.6F); // Box 8
		headModel[65].setRotationPoint(0F, 0F, 0F);

		headModel[66].addShapeBox(-2F, -6F, -8.6F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.6F, 0.5F, 0F, -0.6F); // Box 9
		headModel[66].setRotationPoint(0F, 0F, 0F);

		headModel[67].addShapeBox(2F, -6F, -8.6F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0.4F, -0.5F, -1F, 0.8F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0.4F, 0F, -1F, 0.8F, 0F, 0F, -3F, 0F, 0F); // Box 10
		headModel[67].setRotationPoint(0F, 0F, 0F);

		headModel[68].addShapeBox(4F, -5F, -8.6F, 1, 2, 4, 0F,-0.7F, 0F, -0.79F, 0.4F, 0F, -1F, 0.8F, 0F, 0F, -1F, 0F, 0F, -0.7F, 0F, -0.79F, 0.4F, 0F, -1F, 0.8F, 0F, 0F, -1F, 0F, 0F); // Box 11
		headModel[68].setRotationPoint(0F, 0F, 0F);

		headModel[69].addShapeBox(2F, -3.6F, -8.6F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0.4F, -0.5F, -1F, 0.8F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0.4F, 0F, -1F, 0.8F, 0F, 0F, -3F, 0F, 0F); // Box 13
		headModel[69].setRotationPoint(0F, 0F, 0F);

		headModel[70].addShapeBox(-2F, -3.6F, -8.6F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -0.6F, 0.5F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F); // Box 14
		headModel[70].setRotationPoint(0F, 0F, 0F);

		headModel[71].addShapeBox(-2F, -5.1F, -8.3F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 16
		headModel[71].setRotationPoint(0F, 0F, 0F);

		headModel[72].addShapeBox(2F, -5.1F, -8.3F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0.4F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.4F, 0F, -0.5F, -3F, 0F, 0F); // Box 17
		headModel[72].setRotationPoint(0F, 0F, 0F);

		headModel[73].addShapeBox(-5F, -5F, -8.6F, 1, 2, 4, 0F,0.4F, 0F, -1F, -0.7F, 0F, -0.79F, -1F, 0F, 0F, 0.8F, 0F, 0F, 0.4F, 0F, -1F, -0.7F, 0F, -0.79F, -1F, 0F, 0F, 0.8F, 0F, 0F); // Box 23
		headModel[73].setRotationPoint(0F, 0F, 0F);

		headModel[74].addShapeBox(-5F, -3.6F, -8.6F, 3, 1, 4, 0F,0.4F, -0.5F, -1F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.4F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0.8F, 0F, 0F); // Box 24
		headModel[74].setRotationPoint(0F, 0F, 0F);

		headModel[75].addShapeBox(-5F, -3F, -8F, 3, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0.4F, 0F, 0F); // Box 25
		headModel[75].setRotationPoint(0F, 0F, 0F);

		headModel[76].addShapeBox(-5F, -6F, -8.6F, 3, 1, 4, 0F,0.4F, -0.5F, -1F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.4F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0.8F, 0F, 0F); // Box 26
		headModel[76].setRotationPoint(0F, 0F, 0F);

		headModel[77].addShapeBox(-5F, -7F, -8F, 3, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0.4F, 0F, 0F); // Box 27
		headModel[77].setRotationPoint(0F, 0F, 0F);

		headModel[78].addShapeBox(-5F, -7F, -4F, 1, 7, 2, 0F,0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.4F, 0F, -0.5F); // Box 28
		headModel[78].setRotationPoint(0F, 0F, 0F);

		headModel[79].addShapeBox(-5F, -7F, -2F, 1, 7, 1, 0F,0.4F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -1F, 0F, 0.4F, -1F, 0F); // Box 30
		headModel[79].setRotationPoint(0F, 0F, 0F);

		headModel[80].addShapeBox(-5F, -5.1F, -8.3F, 3, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0.4F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0.4F, 0F, -0.5F); // Box 32
		headModel[80].setRotationPoint(0F, 0F, 0F);

		headModel[81].addShapeBox(4F, -5F, -8F, 1, 2, 4, 0F,0.5F, 0F, -0.5F, 0F, 0F, -1F, 0.4F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -1F, 0.4F, 0F, 0F, -1F, 0F, 0F); // Box 3
		headModel[81].setRotationPoint(0F, 0F, 0F);

		headModel[82].addShapeBox(-5F, -5F, -8F, 1, 2, 4, 0F,0F, 0F, -1F, 0.5F, 0F, -0.5F, -1F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -0.5F, -1F, 0F, 0F, 0.4F, 0F, 0F); // Box 29
		headModel[82].setRotationPoint(0F, 0F, 0F);

		headModel[83].addShapeBox(4.3F, -1.5F, -6.2F, 1, 1, 2, 0F,-0.1F, -0.1F, 0.8F, -0.1F, -0.1F, 0.6F, 0.5F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.1F, -0.1F, 0.8F, -0.1F, -0.1F, 0.6F, 0.6F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F); // Box 91
		headModel[83].setRotationPoint(0F, 0F, 0F);

		headModel[84].addShapeBox(4.1F, -2.5F, -6.1F, 1, 1, 2, 0F,-0.1F, -0.2F, 1.1F, 0F, -0.2F, 0.8F, 0.6F, -0.1F, 0.1F, -0.8F, -0.1F, 0.1F, -0.1F, 0F, 1.1F, 0F, 0F, 0.8F, 0.7F, -0.1F, 0.1F, -0.8F, -0.1F, 0.1F); // Box 92
		headModel[84].setRotationPoint(0F, 0F, 0F);
	}
}