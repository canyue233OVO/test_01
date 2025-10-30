//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MjolnirHelm
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMjolnirHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelMjolnirHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[64];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 32
		headModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 34
		headModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 24
		headModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 32
		headModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 33
		headModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 7
		headModel[7] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 8
		headModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 13
		headModel[9] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 14
		headModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
		headModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 19
		headModel[12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 37
		headModel[13] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 38
		headModel[14] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 39
		headModel[15] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 40
		headModel[16] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 41
		headModel[17] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 42
		headModel[18] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 46
		headModel[19] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 47
		headModel[20] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 48
		headModel[21] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 49
		headModel[22] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 50
		headModel[23] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 51
		headModel[24] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 52
		headModel[25] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 53
		headModel[26] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 54
		headModel[27] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 55
		headModel[28] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 56
		headModel[29] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 57
		headModel[30] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 58
		headModel[31] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 59
		headModel[32] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 60
		headModel[33] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 61
		headModel[34] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 62
		headModel[35] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 63
		headModel[36] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 64
		headModel[37] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 65
		headModel[38] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 66
		headModel[39] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 67
		headModel[40] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 68
		headModel[41] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 69
		headModel[42] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 70
		headModel[43] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 71
		headModel[44] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 72
		headModel[45] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 73
		headModel[46] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 74
		headModel[47] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 75
		headModel[48] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 76
		headModel[49] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 77
		headModel[50] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 78
		headModel[51] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 79
		headModel[52] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 80
		headModel[53] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 81
		headModel[54] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 82
		headModel[55] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 83
		headModel[56] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 84
		headModel[57] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 85
		headModel[58] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 86
		headModel[59] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 87
		headModel[60] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 88
		headModel[61] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 89
		headModel[62] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 90
		headModel[63] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 91

		headModel[0].addShapeBox(-1F, -9F, -5.05F, 2, 2, 9, 0F,0.1F, -0.7F, -0.3F, 0.1F, -0.7F, -0.3F, 0.1F, -0.9F, 1.5F, 0.1F, -0.9F, 1.5F, 0.2F, 0.6F, 1.2F, 0.2F, 0.6F, 1.2F, 0.2F, 1F, 2.8F, 0.2F, 1F, 2.8F); // Box 32
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-1F, -6.5F, 0.95F, 2, 2, 4, 0F,0.25F, 0.3F, -0.2F, 0.25F, 0.3F, -0.2F, 0.2F, -0.5F, 0.8F, 0.2F, -0.5F, 0.8F, 0.25F, -0.5F, 0.2F, 0.25F, -0.5F, 0.2F, 0.2F, 0.8F, 1F, 0.2F, 0.8F, 1F); // Box 34
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1F, -10F, 1.95F, 2, 1, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -1F, 0F, -0.6F, -1F, 0.1F, 0.7F, -1F, 0.1F, 0.7F, -1F, 0.1F, 0.9F, 1.5F, 0.1F, 0.9F, 1.5F); // Box 45
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1F, -2.5F, -6.5F, 2, 3, 2, 0F,0.3F, -0.5F, 0.7F, 0.3F, -0.5F, 0.7F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.7F, 0.4F, -0.5F, 0.7F, 0.4F, -0.5F, 0.7F, 0.3F, 0.5F, 0.7F, 0.3F, 0.5F); // Box 24
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-1F, -2.5F, -6.4F, 2, 1, 1, 0F,-0.1F, 0.7F, -0.3F, -0.1F, 0.7F, -0.3F, -0.1F, 0.6F, 0.5F, -0.1F, 0.6F, 0.5F, -0.1F, -0.5F, 0.5F, -0.1F, -0.5F, 0.5F, -0.1F, -0.5F, 0.5F, -0.1F, -0.5F, 0.5F); // Box 32
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-1F, -6.8F, -5.5F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.7F, 0F, 0.5F, -1.3F, 0F, 0.5F, -1.3F); // Box 33
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(1F, -2.5F, -6.5F, 3, 3, 1, 0F,-0.3F, -0.5F, 0.5F, 0.3F, -0.3F, -1F, 0.8F, 0.1F, 1.5F, 0.3F, 0.1F, 0F, -0.7F, 0.3F, -0.5F, -0.2F, -0.1F, -2F, 0.3F, -0.4F, 2F, -0.7F, 0.3F, 1.5F); // Box 7
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(3F, -2.5F, -4F, 1, 3, 5, 0F,-1F, 0.1F, 0.3F, 0.8F, 0.1F, 0F, 1.45F, 2F, 1F, -1.5F, 2F, 1.5F, 0F, -0.1F, 0.2F, 0.3F, -0.4F, -0.5F, 1F, -1.8F, 0.5F, -1F, -1.8F, 1.5F); // Box 8
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(3F, -6.5F, 1.95F, 1, 2, 2, 0F,1F, 0.1F, -1F, 0.6F, -0.3F, -0.8F, 0.7F, -0.5F, 1.3F, 1.8F, -0.5F, 1.8F, 1.8F, 0.5F, -1.3F, 1F, 0.5F, -1.3F, 0.9F, 0.8F, 1.6F, 1.8F, 0.8F, 2F); // Box 13
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(2F, -9F, -5.05F, 2, 2, 9, 0F,0.9F, -0.6F, -0.3F, 0.1F, -0.8F, -0.6F, 0.2F, -1F, 0.5F, 0.9F, -0.9F, 1.5F, 0.8F, 0.6F, 1.5F, 0.6F, 0.6F, 1F, 0.8F, 1F, 1.3F, 0.8F, 1F, 2.8F); // Box 14
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(2F, -10F, -5.05F, 2, 1, 9, 0F,1F, -0.4F, -3.5F, -0.8F, -0.8F, -4F, -0.7F, -1F, -1.8F, 1F, -0.6F, -1F, 0.9F, 0.6F, -0.3F, 0.1F, 0.8F, -0.6F, 0.2F, 1F, 0.5F, 0.9F, 0.9F, 1.5F); // Box 15
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(1F, -6.8F, -5.5F, 3, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -1F, 0.3F, 0F, 0.4F, 0F, 0F, -0.3F, 0F, 0.5F, 0.7F, -0.2F, 0.5F, 0F, 0.3F, 0.5F, -0.6F, 0F, 0.5F, -1.3F); // Box 19
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-1F, -9.5F, -1.5F, 2, 1, 4, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F); // Box 37
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-1F, -9.6F, -0.85F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 38
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-1F, -9.5F, -3.5F, 2, 1, 2, 0F,0.05F, -0.7F, -0.5F, 0.05F, -0.7F, -0.5F, 0.05F, 0.1F, 0F, 0.05F, 0.1F, 0F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 39
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(1F, -2.5F, -6.4F, 1, 1, 1, 0F,0.1F, 0.7F, -0.3F, -0.9F, 0.7F, -0.5F, -0.9F, 0.6F, 0.5F, 0.1F, 0.6F, 0.5F, 0.1F, -0.5F, 0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, 0.5F, 0.1F, -0.5F, 0.5F); // Box 40
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-2F, -2.5F, -6.4F, 1, 1, 1, 0F,-0.9F, 0.7F, -0.5F, 0.1F, 0.7F, -0.3F, 0.1F, 0.6F, 0.5F, -0.9F, 0.6F, 0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, 0.5F, 0.1F, -0.5F, 0.5F, 0.1F, -0.5F, 0.5F); // Box 41
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(3.5F, -6.4F, 0F, 2, 5, 3, 0F,-0.75F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 42
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-1F, -2.8F, -5.5F, 2, 1, 1, 0F,0F, 0.5F, 0.7F, 0F, 0.5F, 0.7F, 0F, 0.5F, -1.3F, 0F, 0.5F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 46
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(1F, -2.8F, -5.5F, 3, 1, 1, 0F,0F, 0.5F, 0.7F, -0.2F, 0.5F, 0F, 0.3F, 0.5F, -0.6F, 0F, 0.5F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0.3F, 0F, 0.4F, 0F, 0F, -0.3F); // Box 47
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-1F, -5.3F, -6.5F, 2, 2, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 48
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(1F, -5.3F, -6.5F, 3, 2, 1, 0F,0F, 0F, -0.3F, -0.2F, 0F, -1F, 0.3F, 0F, 0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -1F, 0.3F, 0F, 0.4F, 0F, 0F, -0.3F); // Box 49
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(3.6F, -5.3F, -4.5F, 1, 2, 5, 0F,-0.3F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 50
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(3.6F, -6.3F, -4.5F, 1, 1, 5, 0F,-0.3F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 51
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(3.6F, -3.3F, -4.5F, 1, 1, 5, 0F,-0.3F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F); // Box 52
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-1F, -9F, -5.25F, 2, 1, 2, 0F,0.05F, -0.9F, -0.5F, 0.05F, -0.9F, -0.5F, 0.05F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0.2F, -0.5F, 0.05F, 0.2F, -0.5F, 0.05F, 0F, 0.2F, 0.05F, 0F, 0.2F); // Box 53
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(4F, -7.2F, -4F, 1, 1, 4, 0F,-0.2F, 0.6F, 0.5F, 0F, -0.6F, 0.5F, 0.5F, -0.8F, 0F, -0.25F, 0F, 0F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F); // Box 54
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(4F, -7.2F, -8F, 1, 1, 3, 0F,-0.25F, -0.5F, 0F, -0.4F, -0.5F, -0.5F, 0F, -0.6F, 0.5F, -0.2F, 0.6F, 0.5F, -0.25F, -0.1F, 0F, -0.4F, -0.1F, -0.5F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F); // Box 55
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(1.5F, -7.2F, -8F, 3, 1, 3, 0F,-0.25F, -0.5F, 1F, -0.25F, -0.5F, 0F, -0.3F, 0.6F, 0.5F, -0.2F, 0.6F, 0.5F, -0.25F, -0.1F, 1F, -0.25F, -0.1F, 0F, -0.3F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 56
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-1.5F, -7.2F, -7.5F, 3, 1, 3, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.3F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 57
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(1F, -7.2F, -7.5F, 1, 1, 3, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 1.5F, -0.3F, 0.6F, 0F, -0.2F, 0.4F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 58
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(3.8F, -6.4F, -1F, 1, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(3.8F, -4.4F, -2F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(4.5F, -3.4F, -1.5F, 1, 2, 3, 0F,0F, 0.7F, 0F, 0.4F, 0F, 0F, 0.4F, 0.3F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, 0F, 0.2F, 0.5F, 0F, 0.2F, -0.3F, -0.2F, -0.3F, 0F, -0.2F); // Box 61
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(4.85F, -3.2F, -1.8F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, 0F, 0F, -0.1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.1F, 0F); // Box 62
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(3.5F, -6.4F, 3F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.6F, -1.5F, 0F, 0F, -1.7F, 0.5F); // Box 63
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(1.5F, -6.4F, 4.5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, -1.7F, 0F, 0F, -2F, 0.5F); // Box 64
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-1.5F, -6.4F, 4.5F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 65
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-4F, -8F, -1F, 8, 8, 5, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 66
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-4F, -8F, -4F, 8, 3, 3, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 67
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-4F, -1F, -4F, 8, 1, 3, 0F,0F, -1F, 0.1F, 0F, -1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 68
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-4F, -9F, -5.05F, 2, 2, 9, 0F,0.1F, -0.8F, -0.6F, 0.9F, -0.6F, -0.3F, 0.9F, -0.9F, 1.5F, 0.2F, -1F, 0.5F, 0.6F, 0.6F, 1F, 0.8F, 0.6F, 1.5F, 0.8F, 1F, 2.8F, 0.8F, 1F, 1.3F); // Box 69
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-4F, -10F, -5.05F, 2, 1, 9, 0F,-0.8F, -0.8F, -4F, 1F, -0.4F, -3.5F, 1F, -0.6F, -1F, -0.7F, -1F, -1.8F, 0.1F, 0.8F, -0.6F, 0.9F, 0.6F, -0.3F, 0.9F, 0.9F, 1.5F, 0.2F, 1F, 0.5F); // Box 70
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-2F, -7.2F, -7.5F, 1, 1, 3, 0F,-0.25F, -0.5F, 1.5F, -0.25F, -0.5F, 0F, -0.2F, 0.4F, 0F, -0.3F, 0.6F, 0F, -0.25F, -0.1F, 1.5F, -0.25F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 71
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(-4.5F, -7.2F, -8F, 3, 1, 3, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 1F, -0.2F, 0.6F, 0.5F, -0.3F, 0.6F, 0.5F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 1F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 72
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(-5F, -7.2F, -8F, 1, 1, 3, 0F,-0.4F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.2F, 0.6F, 0.5F, 0F, -0.6F, 0.5F, -0.4F, -0.1F, -0.5F, -0.25F, -0.1F, 0F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 73
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(-5F, -7.2F, -4F, 1, 1, 4, 0F,0F, -0.6F, 0.5F, -0.2F, 0.6F, 0.5F, -0.25F, 0F, 0F, 0.5F, -0.8F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F); // Box 74
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(-5.5F, -6.4F, 0F, 2, 5, 3, 0F,0F, 0F, 0F, -0.75F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 75
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(-5.5F, -6.4F, 3F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.7F, 0.5F, -0.6F, -1.5F, 0F); // Box 76
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(-4F, -2.8F, -5.5F, 3, 1, 1, 0F,-0.2F, 0.5F, 0F, 0F, 0.5F, 0.7F, 0F, 0.5F, -1.3F, 0.3F, 0.5F, -0.6F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, 0.4F); // Box 77
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(-4F, -5.3F, -6.5F, 3, 2, 1, 0F,-0.2F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, 0.4F, -0.2F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, 0.4F); // Box 78
		headModel[50].setRotationPoint(0F, 0F, 0F);

		headModel[51].addShapeBox(-4F, -6.8F, -5.5F, 3, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, 0.4F, -0.2F, 0.5F, 0F, 0F, 0.5F, 0.7F, 0F, 0.5F, -1.3F, 0.3F, 0.5F, -0.6F); // Box 79
		headModel[51].setRotationPoint(0F, 0F, 0F);

		headModel[52].addShapeBox(-4.6F, -5.3F, -4.5F, 1, 2, 5, 0F,-0.3F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 80
		headModel[52].setRotationPoint(0F, 0F, 0F);

		headModel[53].addShapeBox(-4.6F, -3.3F, -4.5F, 1, 1, 5, 0F,-0.3F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F); // Box 81
		headModel[53].setRotationPoint(0F, 0F, 0F);

		headModel[54].addShapeBox(-4.6F, -6.3F, -4.5F, 1, 1, 5, 0F,-0.3F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 82
		headModel[54].setRotationPoint(0F, 0F, 0F);

		headModel[55].addShapeBox(-4F, -2.5F, -6.5F, 3, 3, 1, 0F,0.3F, -0.3F, -1F, -0.3F, -0.5F, 0.5F, 0.3F, 0.1F, 0F, 0.8F, 0.1F, 1.5F, -0.2F, -0.1F, -2F, -0.7F, 0.3F, -0.5F, -0.7F, 0.3F, 1.5F, 0.3F, -0.4F, 2F); // Box 83
		headModel[55].setRotationPoint(0F, 0F, 0F);

		headModel[56].addShapeBox(-4F, -2.5F, -4F, 1, 3, 5, 0F,0.8F, 0.1F, 0F, -1F, 0.1F, 0.3F, -1.5F, 2F, 1.5F, 1.45F, 2F, 1F, 0.3F, -0.4F, -0.5F, 0F, -0.1F, 0.2F, -1F, -1.8F, 1.5F, 1F, -1.8F, 0.5F); // Box 84
		headModel[56].setRotationPoint(0F, 0F, 0F);

		headModel[57].addShapeBox(-5.5F, -3.4F, -1.5F, 1, 2, 3, 0F,0.4F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.8F, -0.5F, 0.4F, 0.3F, -0.5F, 0.2F, 0.5F, 0F, 0F, 0.8F, 0F, -0.3F, 0F, -0.2F, 0.2F, -0.3F, -0.2F); // Box 85
		headModel[57].setRotationPoint(0F, 0F, 0F);

		headModel[58].addShapeBox(-5.85F, -3.2F, -1.8F, 1, 2, 1, 0F,-0.2F, -0.1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.1F, 0F, -0.4F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.4F, 0F, 0F); // Box 86
		headModel[58].setRotationPoint(0F, 0F, 0F);

		headModel[59].addShapeBox(-3.5F, -6.4F, 4.5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, -2F, 0.5F, 0F, -1.7F, 0F); // Box 87
		headModel[59].setRotationPoint(0F, 0F, 0F);

		headModel[60].addShapeBox(-4.8F, -6.4F, -1F, 1, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		headModel[60].setRotationPoint(0F, 0F, 0F);

		headModel[61].addShapeBox(-4.8F, -4.4F, -2F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		headModel[61].setRotationPoint(0F, 0F, 0F);

		headModel[62].addShapeBox(-6F, -5.4F, 1.5F, 1, 1, 2, 0F,0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, -0.3F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, -0.3F, 0F, 0F); // Box 90
		headModel[62].setRotationPoint(0F, 0F, 0F);

		headModel[63].addShapeBox(5F, -5.4F, 1.5F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, -0.3F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, -0.3F, 0F, 0F, 0F, 0F, 1F); // Box 91
		headModel[63].setRotationPoint(0F, 0F, 0F);
	}
}