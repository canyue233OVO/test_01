//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KulturTerror
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKulturTerror extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelKulturTerror() //Same as Filename
	{
		headModel = new ModelRendererTurbo[11];
		bodyModel = new ModelRendererTurbo[76];
		rightArmModel = new ModelRendererTurbo[21];
		leftLegModel = new ModelRendererTurbo[17];
		rightLegModel = new ModelRendererTurbo[4];
		skirtFrontModel = new ModelRendererTurbo[1];

		initheadModel_1();
		initbodyModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 174
		headModel[1] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 175
		headModel[2] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 176
		headModel[3] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 177
		headModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 178
		headModel[5] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 179
		headModel[6] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 180
		headModel[7] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 181
		headModel[8] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 182
		headModel[9] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 183
		headModel[10] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 184

		headModel[0].addShapeBox(-4.5F, -2F, -4.5F, 9, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.3F, 1.5F, -3F, 0.3F, 1.5F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 174
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, -2F, -1.5F, 9, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0.3F, 0F, 1F, 0.3F, 0F); // Box 175
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -2F, 1.5F, 9, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0.3F, 0F, 1F, 0.3F, 0F, -3F, 1F, 1.5F, -3F, 1F, 1.5F); // Box 176
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4.5F, -7F, -4.5F, 9, 5, 3, 0F,-3F, 0F, -0.5F, -3F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4.5F, -7F, -1.5F, 9, 5, 3, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -7F, 1.5F, 9, 5, 3, 0F,-0.7F, 0F, 0F, -0.7F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 179
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, -17F, -4.5F, 9, 10, 3, 0F,-4.4F, 0F, -3.9F, -4.4F, 0F, -3.9F, -4.4F, 0F, 1F, -4.4F, 0F, 1F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 180
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -17F, -1.5F, 9, 10, 3, 0F,-4.4F, 0F, -1F, -4.4F, 0F, -1F, -4.4F, 0F, -1.9F, -4.4F, 0F, -1.9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F); // Box 181
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.5F, -17F, 1.5F, 9, 10, 3, 0F,-4.4F, 0F, 1.9F, -4.4F, 0F, 1.9F, -4.4F, 0F, -4.9F, -4.4F, 0F, -4.9F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F); // Box 182
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-2.7F, -6F, -4.5F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 183
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(0.7F, -6F, -4.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 184
		headModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 101
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 102
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 103
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 104
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 105
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 107
		bodyModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 108
		bodyModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 109
		bodyModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 110
		bodyModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 111
		bodyModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 112
		bodyModel[11] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 113
		bodyModel[12] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 117
		bodyModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 119
		bodyModel[14] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 120
		bodyModel[15] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 121
		bodyModel[16] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 122
		bodyModel[17] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 123
		bodyModel[18] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 124
		bodyModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 125
		bodyModel[20] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 126
		bodyModel[21] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 127
		bodyModel[22] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 128
		bodyModel[23] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 129
		bodyModel[24] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 130
		bodyModel[25] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 131
		bodyModel[26] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 132
		bodyModel[27] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 133
		bodyModel[28] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 134
		bodyModel[29] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 135
		bodyModel[30] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 136
		bodyModel[31] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 137
		bodyModel[32] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 138
		bodyModel[33] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 139
		bodyModel[34] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 140
		bodyModel[35] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 141
		bodyModel[36] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 142
		bodyModel[37] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 143
		bodyModel[38] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 144
		bodyModel[39] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 145
		bodyModel[40] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 146
		bodyModel[41] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 147
		bodyModel[42] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 148
		bodyModel[43] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 149
		bodyModel[44] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 150
		bodyModel[45] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 151
		bodyModel[46] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 152
		bodyModel[47] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 153
		bodyModel[48] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 154
		bodyModel[49] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 155
		bodyModel[50] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 156
		bodyModel[51] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 157
		bodyModel[52] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 158
		bodyModel[53] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 159
		bodyModel[54] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 160
		bodyModel[55] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 161
		bodyModel[56] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 162
		bodyModel[57] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 163
		bodyModel[58] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 164
		bodyModel[59] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 165
		bodyModel[60] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 166
		bodyModel[61] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 167
		bodyModel[62] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 168
		bodyModel[63] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 169
		bodyModel[64] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 170
		bodyModel[65] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 171
		bodyModel[66] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 172
		bodyModel[67] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 173
		bodyModel[68] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 218
		bodyModel[69] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 219
		bodyModel[70] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 220
		bodyModel[71] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 221
		bodyModel[72] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 222
		bodyModel[73] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 234
		bodyModel[74] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 235
		bodyModel[75] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 236

		bodyModel[0].addShapeBox(-2.5F, 5F, -1.5F, 5, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-2.5F, 5F, -4.5F, 5, 9, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-2.5F, 5F, 1.5F, 5, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 103
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.1F, 5F, -4.5F, 1, 9, 3, 0F,0F, -2.9F, 0.1F, 0F, -2.9F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -2.9F, 0.1F, 0F, -2.9F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 104
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.1F, 5F, -1.5F, 1, 9, 3, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 105
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.1F, 5F, 1.5F, 1, 9, 3, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -2.9F, 0.1F, 0F, -2.9F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -2.9F, 0.1F, 0F, -2.9F, 0.1F); // Box 107
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(2.1F, 5F, -4.5F, 1, 9, 3, 0F,0F, -2.9F, 0.1F, 0F, -2.9F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -2.9F, 0.1F, 0F, -2.9F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 108
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2.1F, 5F, -1.5F, 1, 9, 3, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 109
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(2.1F, 5F, 1.5F, 1, 9, 3, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -2.9F, 0.1F, 0F, -2.9F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -2.9F, 0.1F, 0F, -2.9F, 0.1F); // Box 110
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3F, 9F, -5F, 6, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 111
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3F, 6F, -3.5F, 6, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 112
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3F, 12F, -3.5F, 6, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 113
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3F, 13.5F, -0.5F, 6, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 117
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4.5F, 4.5F, -1.5F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4.5F, 4.5F, 1.5F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 120
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4.5F, 4.5F, -4.5F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-2F, 0.5F, -4.8F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 122
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(1F, 0.5F, -4.8F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 123
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-2F, 0F, -4.8F, 4, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 124
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4.8F, 0F, -2F, 1, 1, 4, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 125
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(3.8F, 0F, -2F, 1, 1, 4, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 126
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4.8F, 0F, -5F, 1, 1, 4, 0F,-3F, -0.3F, -0.5F, 2.5F, -0.3F, -0.5F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, -3F, -0.3F, -0.5F, 2.5F, -0.3F, -0.5F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F); // Box 127
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(1F, 0F, -5.2F, 1, 1, 4, 0F,-0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, 2.5F, -0.3F, -0.5F, -3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, 2.5F, -0.3F, -0.5F, -3F, -0.3F, -0.5F); // Box 128
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-2F, 0.5F, 3.8F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 129
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-2F, 0F, 3.8F, 4, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 130
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(1F, 0.5F, 3.8F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 131
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4.8F, 0F, 1F, 1, 1, 4, 0F,-0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, 2.5F, -0.3F, -0.5F, -3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, 2.5F, -0.3F, -0.5F, -3F, -0.3F, -0.5F); // Box 132
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(1F, 0F, 1.2F, 1, 1, 4, 0F,-3F, -0.3F, -0.5F, 2.5F, -0.3F, -0.5F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, -3F, -0.3F, -0.5F, 2.5F, -0.3F, -0.5F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F); // Box 133
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-4.8F, 0.5F, -2F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 134
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-4.8F, 0.5F, 1F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 135
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(3.8F, 0.5F, 1F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 136
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(3.8F, 0.5F, -2F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 137
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-2F, 2F, -4.8F, 4, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 138
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-4.8F, 2F, -5F, 1, 1, 4, 0F,-3F, -0.3F, -0.5F, 2.5F, -0.3F, -0.5F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, -3F, -0.3F, -0.5F, 2.5F, -0.3F, -0.5F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F); // Box 139
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-4.8F, 2F, -2F, 1, 1, 4, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 140
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-4.8F, 2F, 1F, 1, 1, 4, 0F,-0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, 2.5F, -0.3F, -0.5F, -3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, 2.5F, -0.3F, -0.5F, -3F, -0.3F, -0.5F); // Box 141
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-2F, 2F, 3.8F, 4, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 142
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(1F, 2F, 0.8F, 1, 1, 4, 0F,-3F, -0.3F, -0.5F, 2.5F, -0.3F, -0.5F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, -3F, -0.3F, -0.5F, 2.5F, -0.3F, -0.5F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F); // Box 143
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(3.8F, 2F, -2F, 1, 1, 4, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 144
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(1F, 2F, -5.2F, 1, 1, 4, 0F,-0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, 2.5F, -0.3F, -0.5F, -3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, 2.5F, -0.3F, -0.5F, -3F, -0.3F, -0.5F); // Box 145
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-0.5F, 0.5F, -4.8F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 146
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-0.5F, 0.5F, 3.8F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 147
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-4.8F, 0.5F, -0.5F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 148
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(3.8F, 0.5F, -0.5F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 149
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-3.5F, 0.5F, -3.5F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 150
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(2.5F, 0.5F, -3.5F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 151
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(2.5F, 0.5F, 2.5F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 152
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-3.5F, 0.5F, 2.5F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 153
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-2F, -1.5F, -4.8F, 1, 2, 1, 0F,-0.3F, 0F, -3.3F, -0.3F, 0F, -3.3F, -0.3F, 0F, 2.7F, -0.3F, 0F, 2.7F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 154
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-0.5F, -1.5F, -4.8F, 1, 2, 1, 0F,-0.3F, 0F, -3.3F, -0.3F, 0F, -3.3F, -0.3F, 0F, 2.7F, -0.3F, 0F, 2.7F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 155
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(1F, -1.5F, -4.8F, 1, 2, 1, 0F,-0.3F, 0F, -3.3F, -0.3F, 0F, -3.3F, -0.3F, 0F, 2.7F, -0.3F, 0F, 2.7F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 156
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-1.5F, -2F, -1.8F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 157
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-3.5F, -1.5F, -3.5F, 1, 2, 1, 0F,-1.8F, 0F, -1.8F, 1.2F, 0F, -1.8F, 1.2F, 0F, 1.2F, -1.8F, 0F, 1.2F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 158
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-1.8F, -2F, -1.5F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 159
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(0.8F, -2F, -1.5F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 160
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-1.5F, -2F, 0.8F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 161
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(2.5F, -1.5F, -3.5F, 1, 2, 1, 0F,1.2F, 0F, -1.8F, -1.8F, 0F, -1.8F, -1.8F, 0F, 1.2F, 1.2F, 0F, 1.2F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 162
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(2.5F, -1.5F, 2.5F, 1, 2, 1, 0F,1.2F, 0F, 1.2F, -1.8F, 0F, 1.2F, -1.8F, 0F, -1.8F, 1.2F, 0F, -1.8F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 163
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-3.5F, -1.5F, 2.5F, 1, 2, 1, 0F,-1.8F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, -1.8F, -1.8F, 0F, -1.8F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 164
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-2F, -1.5F, 3.8F, 1, 2, 1, 0F,-0.3F, 0F, 2.7F, -0.3F, 0F, 2.7F, -0.3F, 0F, -3.3F, -0.3F, 0F, -3.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 165
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-0.5F, -1.5F, 3.8F, 1, 2, 1, 0F,-0.3F, 0F, 2.7F, -0.3F, 0F, 2.7F, -0.3F, 0F, -3.3F, -0.3F, 0F, -3.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 166
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(1F, -1.5F, 3.8F, 1, 2, 1, 0F,-0.3F, 0F, 2.7F, -0.3F, 0F, 2.7F, -0.3F, 0F, -3.3F, -0.3F, 0F, -3.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 167
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(3.8F, -1.5F, -0.5F, 1, 2, 1, 0F,2.7F, 0F, -0.3F, -3.3F, 0F, -0.3F, -3.3F, 0F, -0.3F, 2.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 168
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(3.8F, -1.5F, 1F, 1, 2, 1, 0F,2.7F, 0F, -0.3F, -3.3F, 0F, -0.3F, -3.3F, 0F, -0.3F, 2.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 169
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(3.8F, -1.5F, -2F, 1, 2, 1, 0F,2.7F, 0F, -0.3F, -3.3F, 0F, -0.3F, -3.3F, 0F, -0.3F, 2.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 170
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-4.8F, -1.5F, -2F, 1, 2, 1, 0F,-3.3F, 0F, -0.3F, 2.7F, 0F, -0.3F, 2.7F, 0F, -0.3F, -3.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 171
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-4.8F, -1.5F, 1F, 1, 2, 1, 0F,-3.3F, 0F, -0.3F, 2.7F, 0F, -0.3F, 2.7F, 0F, -0.3F, -3.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 172
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-4.8F, -1.5F, -0.5F, 1, 2, 1, 0F,-3.3F, 0F, -0.3F, 2.7F, 0F, -0.3F, 2.7F, 0F, -0.3F, -3.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 173
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(0F, -0.5F, 3F, 18, 1, 6, 0F,0F, 0F, 0F, 1F, 0F, 0F, -3F, -3.2F, -1.5F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 3.2F, -1.5F, 0F, 5F, 0F); // Box 218
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(18F, -0.5F, 3F, 4, 1, 6, 0F,-1F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.8F, -3F, 3F, -3.2F, -1.5F, -1F, 0F, 0F, 0F, 0.5F, -1F, -0.5F, 1.8F, -3F, 3F, 3.2F, -1.5F); // Box 219
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-18F, -0.5F, 3F, 18, 1, 6, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -3.2F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -3F, 3.2F, -1.5F); // Box 220
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-22F, -0.5F, 3F, 4, 1, 6, 0F,0F, -0.5F, -1F, -1F, 0F, 0F, 3F, -3.2F, -1.5F, -0.5F, -1.8F, -3F, 0F, 0.5F, -1F, -1F, 0F, 0F, 3F, 3.2F, -1.5F, -0.5F, 1.8F, -3F); // Box 221
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-32F, -41.7F, -2F, 64, 88, 1, 0F,-30F, -41F, 0F, -30F, -41F, 0F, -30F, -41F, 0F, -30F, -41F, 0F, -30F, -41F, 0F, -30F, -41F, 0F, -30F, -41F, 0F, -30F, -41F, 0F); // Box 222
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-3F, 12F, 2.5F, 6, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 234
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-3F, 9F, 4F, 6, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 235
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-3F, 6F, 2.5F, 6, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 236
		bodyModel[75].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 11
		rightArmModel[1] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 8
		rightArmModel[2] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 94
		rightArmModel[3] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 48
		rightArmModel[4] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 212
		rightArmModel[5] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 213
		rightArmModel[6] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 214
		rightArmModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 215
		rightArmModel[8] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 216
		rightArmModel[9] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 217
		rightArmModel[10] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 223
		rightArmModel[11] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 224
		rightArmModel[12] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 225
		rightArmModel[13] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 226
		rightArmModel[14] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 227
		rightArmModel[15] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 228
		rightArmModel[16] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 229
		rightArmModel[17] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 230
		rightArmModel[18] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 231
		rightArmModel[19] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 232
		rightArmModel[20] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 233

		rightArmModel[0].addShapeBox(-3.5F, 5.7F, -0.7F, 3, 6, 3, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0.8F, -0.6F, -0.5F, 0.8F, -0.6F, 0F, -1.8F, 0F, 0F, -1.8F); // Box 11
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-2.5F, 0.999999999999999F, -1F, 3, 5, 3, 0F,-1F, 0F, -0.2F, 1F, -1F, 1F, 0.8F, 0.2F, -0.2F, -1F, 0F, -0.2F, 0.9F, 0F, -0.3F, -0.9F, 0.2F, -0.3F, -0.9F, 0.2F, 0.3F, 0.9F, 0F, 0.3F); // Box 8
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-2F, 1F, -3F, 3, 6, 3, 0F,0F, 2.5F, -4F, 0F, 2.5F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, 2F, 5.5F, -8F, 1F, -5.5F, -8F, 2F, -5.5F, -5.5F, -4.5F, 5.5F, -5.5F, -3.5F); // Box 94
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-9F, 1F, -11F, 3, 6, 3, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 2.5F, -2F, 0F, 2.5F, -2F, -1.5F, -5.5F, -7.5F, 1.5F, -5.5F, -7.5F, 1.5F, -8F, 4F, -1.5F, -8F, 4F); // Box 48
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-13.7F, -2F, -11.2F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-13.7F, -6F, -11.2F, 12, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-13.7F, 2F, -11.2F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 214
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-9.2F, -0.5F, -11.3F, 3, 1, 1, 0F,1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 215
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-10.2F, -2F, -11.3F, 5, 1, 1, 0F,-1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-10.2F, 1F, -11.3F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F); // Box 217
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(9F, 1F, -3F, 3, 6, 3, 0F,0F, 2.5F, -2F, 0F, 2.5F, -4F, 0F, -0.5F, 2F, 0F, -0.5F, -1F, -5.5F, -7.5F, 2F, 5.5F, -7.5F, 1F, 5.5F, -5F, -3.5F, -5.5F, -5F, -4.5F); // Box 223
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(16F, 1.5F, -11F, 3, 6, 3, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, -2F, 0.5F, 2.5F, -2F, 1.5F, -5.5F, -7.5F, -1.5F, -5.5F, -7.5F, -1.5F, -8F, 4F, 1.5F, -8F, 4F); // Box 224
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(15F, -1.5F, -11.5F, 4, 3, 3, 0F,0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(15F, -1.5F, -13.5F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F); // Box 226
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(14.2F, 1F, -12F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.6F, -0.4F, 0F); // Box 227
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(14.2F, 1F, -13F, 2, 2, 1, 0F,-0.3F, -0.4F, 0.5F, -0.3F, -0.4F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(15F, -1.5F, -8.5F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F); // Box 229
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(9.5F, 0.999999999999999F, -1F, 3, 5, 3, 0F,1F, -1F, 1F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.8F, 0.2F, -0.2F, -1.9F, 0.2F, -0.3F, 1.9F, 0F, -0.3F, 1.9F, 0F, 0.3F, -1.9F, 0.2F, 0.3F); // Box 230
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(11.5F, 5.7F, -0.7F, 3, 6, 3, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, 0F, -1.8F, -0.6F, 0F, -1.8F); // Box 231
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addShapeBox(12.5F, 9.7F, -4.7F, 1, 1, 6, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 232
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);

		rightArmModel[20].addShapeBox(12.5F, 9.7F, -7.5F, 1, 1, 3, 0F,0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F); // Box 233
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 186
		leftLegModel[1] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 187
		leftLegModel[2] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 188
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 189
		leftLegModel[4] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 190
		leftLegModel[5] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 191
		leftLegModel[6] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 192
		leftLegModel[7] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 194
		leftLegModel[8] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 195
		leftLegModel[9] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 196
		leftLegModel[10] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 197
		leftLegModel[11] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 198
		leftLegModel[12] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 199
		leftLegModel[13] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 200
		leftLegModel[14] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 201
		leftLegModel[15] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 202
		leftLegModel[16] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 203

		leftLegModel[0].addShapeBox(1.1F, -1F, -2F, 4, 5, 4, 0F,-0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F); // Box 186
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(1.1F, 4F, -2F, 4, 3, 4, 0F,-1.6F, 0F, -1.6F, -1.6F, 0F, -1.6F, -1.6F, 0F, -1.6F, -1.6F, 0F, -1.6F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 187
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(1.1F, 7F, -2F, 4, 3, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F); // Box 188
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(1.1F, 11F, -2F, 4, 1, 4, 0F,-0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F); // Box 189
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(1.1F, -3.1F, -2F, 4, 2, 4, 0F,-0.2F, 1.1F, -0.2F, -1.2F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, -0.2F, 1.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F); // Box 190
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(1.1F, 4F, -0.5F, 2, 4, 1, 0F,0.4F, 0F, -0.3F, -1.4F, 0F, -0.3F, -1.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -2F, -0.3F, 0F, -2F, -0.3F, 0F, -1F, -0.3F); // Box 191
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(1.1F, 6.5F, -0.5F, 2, 2, 1, 0F,0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 192
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(3.1F, 4F, -0.5F, 2, 4, 1, 0F,-1.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, -1.4F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -2F, -0.3F); // Box 194
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(3.1F, 6.5F, -0.5F, 2, 2, 1, 0F,0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 195
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(2.5F, 6.5F, 0F, 1, 2, 2, 0F,-0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F); // Box 196
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(2.5F, 4F, 0F, 1, 4, 2, 0F,-0.3F, 0F, -1.4F, -0.3F, 0F, -1.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F); // Box 197
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(2.5F, 4F, -2F, 1, 4, 2, 0F,-0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, -1.4F, -0.3F, 0F, -1.4F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, 0F); // Box 198
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(2.5F, 6.5F, -2F, 1, 2, 2, 0F,-0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F); // Box 199
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);

		leftLegModel[13].addShapeBox(1.1F, 3.2F, -2F, 4, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 200
		leftLegModel[13].setRotationPoint(0F, 0F, 0F);

		leftLegModel[14].addShapeBox(1.1F, 1.2F, -2F, 4, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 201
		leftLegModel[14].setRotationPoint(0F, 0F, 0F);

		leftLegModel[15].addShapeBox(1.1F, -0.800000000000001F, -2F, 4, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 202
		leftLegModel[15].setRotationPoint(0F, 0F, 0F);

		leftLegModel[16].addShapeBox(1.1F, -2.8F, -2F, 4, 1, 4, 0F,0F, -0.5F, 0F, -1.2F, 0.7F, 0F, -1.2F, 0.7F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.9F, -1.3F, 0F, -0.9F, -1.3F, 0F, 0F, 0F, 0F); // Box 203
		leftLegModel[16].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 7
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 8
		rightLegModel[2] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 9
		rightLegModel[3] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 101

		rightLegModel[0].addShapeBox(-3.5F, -3.2F, -2F, 4, 2, 4, 0F,-2F, 2F, -1F, -1F, 0F, 0F, -0.3F, 0F, -0.5F, -1.8F, 1F, -0.8F, 0.5F, 0.3F, 0.4F, -0.5F, 0.3F, 0F, 0F, 0F, 1F, 0.3F, -0.3F, 1F); // Box 7
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-3.5F, 1.8F, -2F, 4, 3, 4, 0F,0.9F, 0F, 0.2F, -0.7F, 0F, 0.2F, -0.7F, 0F, 0F, 0.9F, 0F, 0F, 0.2F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.2F, 0.2F, 0F, -0.2F); // Box 8
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-3.8F, 4.8F, -2F, 4, 7, 4, 0F,-0.1F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 9
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-3.5F, -1.2F, -2F, 4, 3, 4, 0F,0.55F, -0.3F, 0.45F, -0.5F, -0.3F, 0.05F, 0.05F, 0F, 1.05F, 0.25F, 0.3F, 1.05F, 0.9F, 0F, 0.3F, -0.7F, 0F, 0.25F, -0.7F, 0F, 0.05F, 0.9F, 0F, 0.2F); // Box 101
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 185

		skirtFrontModel[0].addShapeBox(-12F, -9F, -4F, 28, 28, 1, 0F,-9F, -9F, -0.3F, -13F, -9F, -0.3F, -13F, -9F, -0.3F, -9F, -9F, -0.3F, -8.5F, -13F, 0.7F, -12.5F, -13F, 0.7F, -12.5F, -13F, -1.3F, -8.5F, -13F, -1.3F); // Box 185
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}
}