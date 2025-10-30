//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Mjolnir
// Model Creator: 
// Created on: 19.12.2020 - 14:21:46
// Last changed on: 19.12.2020 - 14:21:46

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMjolnir extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelMjolnir() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[83];
		leftArmModel = new ModelRendererTurbo[15];
		rightArmModel = new ModelRendererTurbo[14];
		leftLegModel = new ModelRendererTurbo[14];
		rightLegModel = new ModelRendererTurbo[14];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 66
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 67
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 68
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 69
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 70
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 71
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 72
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 73
		bodyModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 74
		bodyModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 75
		bodyModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 76
		bodyModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 77
		bodyModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 78
		bodyModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 79
		bodyModel[14] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 80
		bodyModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 81
		bodyModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 84
		bodyModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 85
		bodyModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 86
		bodyModel[19] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 87
		bodyModel[20] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 88
		bodyModel[21] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 89
		bodyModel[22] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 90
		bodyModel[23] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 91
		bodyModel[24] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 92
		bodyModel[25] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 93
		bodyModel[26] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 94
		bodyModel[27] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 97
		bodyModel[28] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 105
		bodyModel[29] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 106
		bodyModel[30] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 107
		bodyModel[31] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 108
		bodyModel[32] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 109
		bodyModel[33] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 110
		bodyModel[34] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 111
		bodyModel[35] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 112
		bodyModel[36] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 113
		bodyModel[37] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 114
		bodyModel[38] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 115
		bodyModel[39] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 116
		bodyModel[40] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 117
		bodyModel[41] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 119
		bodyModel[42] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 120
		bodyModel[43] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 121
		bodyModel[44] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 122
		bodyModel[45] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 123
		bodyModel[46] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 124
		bodyModel[47] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 125
		bodyModel[48] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 126
		bodyModel[49] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 127
		bodyModel[50] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 129
		bodyModel[51] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 130
		bodyModel[52] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 131
		bodyModel[53] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 132
		bodyModel[54] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 133
		bodyModel[55] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 134
		bodyModel[56] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 135
		bodyModel[57] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 136
		bodyModel[58] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 137
		bodyModel[59] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 138
		bodyModel[60] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 139
		bodyModel[61] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 140
		bodyModel[62] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 141
		bodyModel[63] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 142
		bodyModel[64] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 143
		bodyModel[65] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 144
		bodyModel[66] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 145
		bodyModel[67] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 146
		bodyModel[68] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 147
		bodyModel[69] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 148
		bodyModel[70] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 150
		bodyModel[71] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 151
		bodyModel[72] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 152
		bodyModel[73] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 153
		bodyModel[74] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 154
		bodyModel[75] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 155
		bodyModel[76] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 156
		bodyModel[77] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 157
		bodyModel[78] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 158
		bodyModel[79] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 159
		bodyModel[80] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 160
		bodyModel[81] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 161
		bodyModel[82] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 162

		bodyModel[0].addShapeBox(2F, 9.7F, 0.100000000000001F, 3, 2, 3, 0F,-0.5F, 0F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, 0.5F, 0.4F); // Box 66
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-1F, 9F, -4.1F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-1F, 11F, -4.1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 68
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(1F, 10F, -2.9F, 4, 3, 3, 0F,0.5F, 0F, 0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0.5F, 0F, 0.5F, -0.5F, -0.3F, 0.5F, 0.5F, -1.8F, -0.5F, 0.5F, -1.8F, 0F, -0.5F, -0.3F, 0.5F); // Box 69
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3F, 10F, 2.6F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 70
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3F, 9F, 2.6F, 6, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3F, 11.5F, 2.6F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 72
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-5F, 9.7F, 0.100000000000001F, 3, 2, 3, 0F,0F, 0.2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.4F, 0F, 0.2F, -0.5F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0.5F, 0F, 0.5F, 0.4F, 0.5F, -0.5F, -0.5F); // Box 73
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-5F, 10F, -2.9F, 4, 3, 3, 0F,0F, 0.2F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.2F, 0F, 0.5F, -1.8F, -0.5F, -0.5F, -0.3F, 0.5F, -0.5F, -0.3F, 0.5F, 0.5F, -1.8F, 0F); // Box 74
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-6F, 9.5F, -0.899999999999999F, 1, 2, 2, 0F,-0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-5.7F, 8.5F, -0.899999999999999F, 1, 1, 2, 0F,-0.3F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-6F, 11.5F, -0.899999999999999F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.1F, -0.2F, -0.5F); // Box 77
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(4.7F, 8.5F, -0.899999999999999F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(5F, 9.5F, -0.899999999999999F, 1, 2, 2, 0F,0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(5F, 11.5F, -0.899999999999999F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.5F, 0F, -0.5F); // Box 80
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-1F, 2F, -3.9F, 2, 3, 3, 0F,0F, 0.2F, -0.52F, 0F, 0.2F, -0.52F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.03F, -0.3F, 0F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-2.5F, 5.2F, -2.9F, 2, 3, 1, 0F,1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 84
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3F, 3F, -3.9F, 2, 3, 3, 0F,0F, 0F, -0.35F, 1F, 0F, -0.35F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0.08F, 0F, -0.2F, 0F, 0F, 0.5F, 0F); // Box 85
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-5F, 5F, -3.9F, 2, 1, 2, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, -0.07F, 0F, -0.5F, 0F, 0.5F, -0.2F, 0.5F, -0.2F, 1.2F, -0.6F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 1.8F, 0F); // Box 86
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-5F, 3F, -3.9F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 87
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-5F, 5F, -3.9F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, -0.07F, 0F, -0.5F, 0F, 0.5F, -0.8F, 0.5F); // Box 88
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4F, 3.5F, -4.6F, 3, 1, 3, 0F,0F, -0.5F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 89
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-1F, 3.5F, -4.6F, 1, 1, 3, 0F,1F, 0F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-5F, 4F, -4.6F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -1F, 0.2F, -0.2F, -1F); // Box 91
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4F, 2.5F, -4.6F, 3, 1, 3, 0F,0F, 1F, -1F, -0.8F, 1F, -1F, -0.8F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0F, 0F, 0.5F, 0F); // Box 92
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-5F, 2F, -4.6F, 1, 1, 3, 0F,0.2F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, 0.7F, 0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0.3F, 0F, 1F, 0F, 0.5F, 1F, 0F); // Box 93
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-1F, 1.5F, -4.6F, 1, 2, 3, 0F,0.8F, 0F, -1F, -0.3F, -0.5F, -1F, -0.3F, -0.5F, 0F, 0.8F, 0F, 0F, 1F, 0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F); // Box 94
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(3F, 3F, -3.9F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(0.5F, 5.2F, -2.9F, 2, 3, 1, 0F,0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 105
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-1.5F, 4.9F, -3.1F, 3, 3, 1, 0F,1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 106
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-5F, 0.5F, -4.6F, 1, 1, 3, 0F,0.3F, 0.6F, -2.5F, 0F, 0.6F, -2.5F, 0F, 0.6F, 0F, 0.5F, 0.6F, 0F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0.7F, 0F, 0.5F); // Box 107
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-4F, 0.5F, -4.6F, 3, 1, 3, 0F,0F, 0.6F, -2.5F, -1.5F, 0.6F, -2.5F, -1.5F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 108
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-5.5F, -1.4F, -2.4F, 3, 1, 5, 0F,-0.3F, -1F, -0.3F, 0F, -1F, -0.3F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.4F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 109
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0F, 3.5F, -4.6F, 1, 1, 3, 0F,-0.1F, 0F, 0F, 1F, 0F, 0.3F, 1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, -0.3F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, -0.3F, 0F); // Box 110
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0F, 1.5F, -4.6F, 1, 2, 3, 0F,-0.3F, -0.5F, -1F, 0.8F, 0F, -1F, 0.8F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0.3F, 1F, 0F, 0F, -0.3F, 0F, 0F); // Box 111
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(1F, 3.5F, -4.6F, 3, 1, 3, 0F,-1F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(1F, 2.5F, -4.6F, 3, 1, 3, 0F,-0.8F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, -0.8F, 1F, 0F, -1F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, -1F, 0F, 0F); // Box 113
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(1F, 0.5F, -4.6F, 3, 1, 3, 0F,-1.5F, 0.6F, -2.5F, 0F, 0.6F, -2.5F, 0F, 0.6F, 0F, -1.5F, 0.6F, 0F, -0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.8F, 0F, 0.5F); // Box 114
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(4F, 4F, -4.6F, 1, 1, 3, 0F,0F, 0F, 0.3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.4F, 0F, 0F, -0.4F, 0.2F, -0.2F, -1F, 0F, 0.5F, -1F); // Box 115
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(4F, 2F, -4.6F, 1, 1, 3, 0F,0F, 0.5F, -1F, 0.2F, 0.5F, -1F, 0.7F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1F, 0.3F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F); // Box 116
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(4F, 0.5F, -4.6F, 1, 1, 3, 0F,0F, 0.6F, -2.5F, 0.3F, 0.6F, -2.5F, 0.5F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, -1F, 0.2F, 0F, -1F, 0.7F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 117
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-6F, -2.5F, 3.1F, 3, 3, 2, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 119
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-4.8F, 0F, -2.7F, 2, 1, 1, 0F,-0.3F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-6F, 1.5F, 3.1F, 3, 3, 2, 0F,0F, 1F, 1F, 0F, 1F, 1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, -0.3F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, -0.3F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 121
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(2.8F, 0F, -2.7F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(2.5F, -1.4F, -2.4F, 3, 1, 5, 0F,0F, -1F, -0.3F, -0.3F, -1F, -0.3F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 1F, 0F, -0.4F, 1F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 123
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(3F, -2.5F, 3.1F, 3, 3, 2, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0.5F, -0.5F, 1F, 0.5F); // Box 124
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(3F, 1.5F, 3.1F, 3, 3, 2, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.8F, 0.5F, -0.3F, 0.8F, 0.5F, -0.2F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 125
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-5.55F, -2.4F, 2.7F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(3.55F, -2.4F, 2.7F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-5F, 5F, -1.9F, 2, 1, 2, 0F,0.5F, -0.2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.8F, 0F, 0.5F, -0.8F, 0F, -0.2F, 1.8F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, -0.2F, 2F, 0F); // Box 129
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-5F, 5F, 0.100000000000001F, 2, 1, 2, 0F,0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0.5F, -0.2F, 0F, -0.2F, 2F, 0F, 0F, 1F, 0F, 0F, 0.8F, 0F, -0.2F, 1.5F, 0F); // Box 130
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-5F, 5F, 2.1F, 2, 1, 2, 0F,0.5F, -0.2F, 0F, 0F, 1F, 0F, -0.3F, 1F, 0.6F, 0.5F, 0.5F, 0F, -0.2F, 1.5F, 0F, 0F, 1F, 0F, -0.3F, 0.7F, 0F, -0.2F, 1F, -1F); // Box 131
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-3F, 4.5F, 2.4F, 2, 2, 2, 0F,0.3F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, -0.4F, -0.5F, -0.4F, 0.3F, 0.2F, -0.3F); // Box 132
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-3F, 0F, 2.9F, 6, 4, 2, 0F,1F, 0.5F, -0.8F, 1F, 0.5F, -0.8F, -1F, -1F, 0.5F, -1F, -1F, 0.5F, 1.3F, 0F, -0.8F, 1.3F, 0F, -0.8F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F); // Box 133
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(1F, 4.5F, 2.4F, 2, 2, 2, 0F,0.5F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0.3F, 0.2F, -0.3F, -0.4F, -0.5F, -0.4F); // Box 134
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-1F, 4.3F, 1.6F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 135
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-3.2F, 5.5F, 3.5F, 1, 1, 1, 0F,0.1F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(2.2F, 5.5F, 3.5F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F); // Box 137
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-5.8F, 0F, 4.7F, 2, 1, 1, 0F,-0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F); // Box 138
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(3.8F, 0F, 4.7F, 2, 1, 1, 0F,-0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F); // Box 139
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(3F, 3F, -3.9F, 2, 2, 2, 0F,0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(3F, 5F, -3.9F, 2, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.07F, 0.5F, -0.5F, 0F, 0.5F, -0.8F, 0.5F, 0F, -0.5F, 0F); // Box 141
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(3F, 5F, -3.9F, 2, 1, 2, 0F,0F, -0.5F, -0.07F, 0.5F, -0.5F, 0F, 0.5F, -0.2F, 0.5F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, -0.2F, 1.2F, -0.6F, -0.2F, 1.8F, 0F, 0F, 0.5F, 0F); // Box 142
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(1F, 3F, -3.9F, 2, 3, 3, 0F,1F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.2F, 0.08F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F); // Box 143
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-0.5F, 1.8F, 4.5F, 1, 1, 1, 0F,0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(3F, 5F, 2.1F, 2, 1, 2, 0F,0F, 1F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0.5F, 0F, -0.3F, 1F, 0.6F, 0F, 1F, 0F, -0.2F, 1.5F, 0F, -0.2F, 1F, -1F, -0.3F, 0.7F, 0F); // Box 145
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(3F, 5F, 0.100000000000001F, 2, 1, 2, 0F,0F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 1.5F, 0F, 0F, 0.8F, 0F); // Box 146
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(3F, 5F, -1.9F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0.5F, -0.2F, -0.5F, 0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, -0.2F, 1.8F, 0F, -0.2F, 2F, 0F, 0F, 1F, 0F); // Box 147
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-1.5F, -1.7F, 3.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 148
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-3.5F, -1.7F, 3.5F, 2, 3, 1, 0F,0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.5F); // Box 150
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(1.5F, -1.7F, 3.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, 0F); // Box 151
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-5.5F, 4F, 1.1F, 2, 1, 2, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F); // Box 152
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-5.5F, 0.3F, 1.1F, 2, 2, 2, 0F,0F, 0.5F, 1F, 0F, 0.8F, 1F, 0F, 1F, 0F, 0.4F, 1F, 0F, 0.1F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F); // Box 153
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-5.5F, 0.8F, -1.9F, 2, 1, 2, 0F,-0.3F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, -0.1F, 0F, -1.4F); // Box 154
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-5.5F, -0.2F, -0.399999999999999F, 2, 1, 2, 0F,-0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0.1F, 0F, -0.6F); // Box 155
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-5.5F, 2F, 1.9F, 2, 3, 1, 0F,0.15F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 156
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(3.5F, 4F, 1.1F, 2, 1, 2, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F); // Box 157
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(3.5F, 2F, 1.9F, 2, 3, 1, 0F,0F, 0.2F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 158
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(3.5F, 0.3F, 1.1F, 2, 2, 2, 0F,0F, 0.8F, 1F, 0F, 0.5F, 1F, 0.4F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 159
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(3.5F, -0.2F, -0.399999999999999F, 2, 1, 2, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, -0.6F, 0F, 0F, -0.4F); // Box 160
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(3.5F, 0.8F, -1.9F, 2, 1, 2, 0F,0F, 1F, 0F, -0.3F, 1F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1.4F, 0F, 0F, -1.4F); // Box 161
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-16.4F, -7.8F, -3.6F, 40, 20, 1, 0F,-19F, -9F, -0.15F, -19F, -9F, -0.15F, -19F, -9F, 0F, -19F, -9F, 0F, -19F, -10F, 0.5F, -19F, -10F, 0.4F, -19F, -9F, 0F, -19F, -9F, 0F); // Box 162
		bodyModel[82].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 181
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 182
		leftArmModel[2] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 183
		leftArmModel[3] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 184
		leftArmModel[4] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 185
		leftArmModel[5] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 186
		leftArmModel[6] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 187
		leftArmModel[7] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 188
		leftArmModel[8] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 189
		leftArmModel[9] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 190
		leftArmModel[10] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 191
		leftArmModel[11] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 192
		leftArmModel[12] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 193
		leftArmModel[13] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 138
		leftArmModel[14] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 139

		leftArmModel[0].addShapeBox(-1F, 9.5F, -2F, 4, 2, 4, 0F,0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F); // Box 181
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 2.2F, -2F, 4, 2, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 182
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -0.8F, -2F, 4, 3, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 183
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, -2.8F, -2F, 4, 2, 4, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 184
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 7.7F, -2F, 4, 2, 4, 0F,0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 185
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-1F, 5.7F, -2F, 2, 2, 4, 0F,0.8F, 0F, 0.8F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0.8F, 0F, 0.8F); // Box 186
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(1F, 4.7F, -2F, 2, 3, 4, 0F,0F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 187
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(2F, 3.7F, -2F, 1, 1, 4, 0F,-0.5F, 0F, -0.2F, 0.8F, 0.4F, -0.2F, 0.8F, 0.4F, -0.2F, -0.5F, 0F, -0.2F, 1F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 1F, 0F, 0.8F); // Box 188
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(1.5F, 3.2F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F); // Box 189
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(0.5F, 6.2F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(2.8F, -3.8F, -2F, 2, 3, 4, 0F,0F, 0F, 0F, -0.3F, -1.5F, -1.5F, -0.3F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, -1F, 1.2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, 1.2F); // Box 191
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(3F, -1.8F, -2F, 2, 3, 4, 0F,0.2F, 0F, 1.2F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, 0.2F, 0F, 1.2F, -0.2F, 0F, 1.2F, 0.2F, -0.5F, -1F, 0.2F, -0.5F, -1F, -0.2F, 0F, 1.2F); // Box 192
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(3.2F, 0.2F, -2F, 2, 3, 4, 0F,0F, -1F, 1.2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, 1.2F, -0.4F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, -0.4F, 0F, 0F); // Box 193
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(1.5F, 6.2F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(2F, 9F, -1.5F, 1, 2, 3, 0F,0.15F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 139
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 137
		rightArmModel[1] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 166
		rightArmModel[2] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 167
		rightArmModel[3] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 168
		rightArmModel[4] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 169
		rightArmModel[5] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 170
		rightArmModel[6] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 171
		rightArmModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 174
		rightArmModel[8] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 175
		rightArmModel[9] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 176
		rightArmModel[10] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 177
		rightArmModel[11] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 178
		rightArmModel[12] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 179
		rightArmModel[13] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 180

		rightArmModel[0].addShapeBox(-3F, 9.5F, -2F, 4, 2, 4, 0F,0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F); // Box 137
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 7.7F, -2F, 4, 2, 4, 0F,0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 166
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 4.7F, -2F, 2, 3, 4, 0F,0.8F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0.8F, 0F, 0.8F); // Box 167
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-1F, 5.7F, -2F, 2, 2, 4, 0F,0F, 1F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0F, 1F, 0.8F, 0F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 168
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.5F, 3.2F, -1F, 2, 3, 2, 0F,0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F); // Box 169
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 3.7F, -2F, 1, 1, 4, 0F,0.8F, 0.4F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.8F, 0.4F, -0.2F, 0.8F, 0F, 0.8F, 1F, 0F, 0.8F, 1F, 0F, 0.8F, 0.8F, 0F, 0.8F); // Box 170
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3.5F, 6.2F, -1F, 2, 2, 2, 0F,0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, -2.8F, -2F, 4, 2, 4, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 174
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3F, -0.8F, -2F, 4, 3, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 175
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3F, 9F, -1.5F, 1, 2, 3, 0F,0.5F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 176
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-5F, -1.8F, -2F, 2, 3, 4, 0F,-0.2F, -0.5F, -1F, 0.2F, 0F, 1.2F, 0.2F, 0F, 1.2F, -0.2F, -0.5F, -1F, 0.2F, -0.5F, -1F, -0.2F, 0F, 1.2F, -0.2F, 0F, 1.2F, 0.2F, -0.5F, -1F); // Box 177
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-4.8F, -3.8F, -2F, 2, 3, 4, 0F,-0.3F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, -1F, 1.2F, 0F, -1F, 1.2F, 0F, -0.5F, -1F); // Box 178
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-5.2F, 0.2F, -2F, 2, 3, 4, 0F,0F, -0.5F, -1F, 0F, -1F, 1.2F, 0F, -1F, 1.2F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -1.5F, -1.5F); // Box 179
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3F, 2.2F, -2F, 4, 2, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 180
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 209
		leftLegModel[1] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 210
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 211
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 212
		leftLegModel[4] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 215
		leftLegModel[5] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 216
		leftLegModel[6] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 217
		leftLegModel[7] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 218
		leftLegModel[8] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 219
		leftLegModel[9] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 220
		leftLegModel[10] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 221
		leftLegModel[11] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 222
		leftLegModel[12] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 140
		leftLegModel[13] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 141

		leftLegModel[0].addShapeBox(-2F, 11.2F, -5.5F, 4, 1, 2, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 209
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 11.2F, -3.5F, 4, 1, 2, 0F,-0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.6F, 2F, 0F, -0.6F, 2F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 210
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 11.2F, -2.5F, 4, 1, 5, 0F,0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 211
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.8F, 6.1F, -2F, 4, 4, 4, 0F,0.5F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.2F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F); // Box 212
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 5.5F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, -0.5F, 1F, 0.8F, -0.5F, 1F); // Box 215
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-1.5F, 5F, -3.5F, 3, 1, 1, 0F,-0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-1.5F, 6F, -3.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-1.5F, 7F, -3.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 218
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-1.5F, 4F, -2F, 4, 1, 4, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 219
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(0.5F, 1F, -2F, 2, 3, 4, 0F,0F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F); // Box 220
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(0.5F, 0F, -2F, 2, 1, 4, 0F,-3F, 0.2F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -3F, 0.2F, 0F, 0F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, 1F, 0F, 0F, 1F); // Box 221
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(2F, 1F, -0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(-2F, 6.5F, -2F, 4, 1, 4, 0F,0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0.5F, 1F, 0.8F, 0.5F, 1F, 1F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.5F, 1.5F, 1F, 0.5F, 1.5F); // Box 140
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);

		leftLegModel[13].addShapeBox(-2F, 8F, -2F, 4, 1, 4, 0F,1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 0.2F, 0F, 0.15F, 0.5F, 0F, 0.15F, 0.5F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F); // Box 141
		leftLegModel[13].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 123
		rightLegModel[1] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 124
		rightLegModel[2] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 127
		rightLegModel[3] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 128
		rightLegModel[4] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 129
		rightLegModel[5] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 199
		rightLegModel[6] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 200
		rightLegModel[7] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 201
		rightLegModel[8] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 203
		rightLegModel[9] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 204
		rightLegModel[10] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 205
		rightLegModel[11] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 206
		rightLegModel[12] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 207
		rightLegModel[13] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 208

		rightLegModel[0].addShapeBox(-2.2F, 6.1F, -2F, 4, 4, 4, 0F,0.4F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.2F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F); // Box 123
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.5F, 1F, -2F, 2, 3, 4, 0F,1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1.5F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 124
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 11.2F, -2.5F, 4, 1, 5, 0F,0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 127
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 11.2F, -3.5F, 4, 1, 2, 0F,-0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.6F, 2F, 0F, -0.6F, 2F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 128
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 11.2F, -5.5F, 4, 1, 2, 0F,-0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 129
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2.5F, 4F, -2F, 4, 1, 4, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 199
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2.5F, 0F, -2F, 2, 1, 4, 0F,1.5F, 0F, 0F, -3F, 0.2F, 0F, -3F, 0.2F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1.5F, 0F, 1F); // Box 200
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-4F, 1F, -0.5F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2F, 8F, -2F, 4, 1, 4, 0F,1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 0.5F, 0F, 0.15F, 0.2F, 0F, 0.15F, 0.2F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F); // Box 203
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2F, 6.5F, -2F, 4, 1, 4, 0F,0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0.5F, 1F, 0.8F, 0.5F, 1F, 1F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.5F, 1.5F, 1F, 0.5F, 1.5F); // Box 204
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-2F, 5.5F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, -0.5F, 1F, 0.8F, -0.5F, 1F); // Box 205
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-1.5F, 6F, -3.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(-1.5F, 5F, -3.5F, 3, 1, 1, 0F,-0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);

		rightLegModel[13].addShapeBox(-1.5F, 7F, -3.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 208
		rightLegModel[13].setRotationPoint(0F, 0F, 0F);
	}
}