//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Iku
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIku extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelIku() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[125];
		leftFrontWheelModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initleftFrontWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 103
		bodyModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 104
		bodyModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 105
		bodyModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 106
		bodyModel[4] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 107
		bodyModel[5] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 108
		bodyModel[6] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 109
		bodyModel[7] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 110
		bodyModel[8] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 111
		bodyModel[9] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 112
		bodyModel[10] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 113
		bodyModel[11] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 114
		bodyModel[12] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 115
		bodyModel[13] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 116
		bodyModel[14] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 117
		bodyModel[15] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 118
		bodyModel[16] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 119
		bodyModel[17] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 120
		bodyModel[18] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 121
		bodyModel[19] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 122
		bodyModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 123
		bodyModel[21] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 124
		bodyModel[22] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 125
		bodyModel[23] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 126
		bodyModel[24] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 127
		bodyModel[25] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 129
		bodyModel[27] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 130
		bodyModel[28] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 131
		bodyModel[29] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 132
		bodyModel[30] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 133
		bodyModel[31] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 134
		bodyModel[32] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 135
		bodyModel[33] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 136
		bodyModel[34] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 137
		bodyModel[35] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 138
		bodyModel[36] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 139
		bodyModel[37] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 140
		bodyModel[38] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 141
		bodyModel[39] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 142
		bodyModel[40] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 143
		bodyModel[41] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 144
		bodyModel[42] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 145
		bodyModel[43] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 146
		bodyModel[44] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 147
		bodyModel[45] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 148
		bodyModel[46] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 149
		bodyModel[47] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 150
		bodyModel[48] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 151
		bodyModel[49] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 152
		bodyModel[50] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 153
		bodyModel[51] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 154
		bodyModel[52] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 155
		bodyModel[53] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 156
		bodyModel[54] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 157
		bodyModel[55] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 158
		bodyModel[56] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 159
		bodyModel[57] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 160
		bodyModel[58] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 161
		bodyModel[59] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 162
		bodyModel[60] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 163
		bodyModel[61] = new ModelRendererTurbo(this, 163, 140, textureX, textureY); // Box 164
		bodyModel[62] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 165
		bodyModel[63] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 166
		bodyModel[64] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 167
		bodyModel[65] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 168
		bodyModel[66] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 169
		bodyModel[67] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 170
		bodyModel[68] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 171
		bodyModel[69] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 172
		bodyModel[70] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 173
		bodyModel[71] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 174
		bodyModel[72] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 175
		bodyModel[73] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 176
		bodyModel[74] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 177
		bodyModel[75] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 178
		bodyModel[76] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 179
		bodyModel[77] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 180
		bodyModel[78] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 181
		bodyModel[79] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 182
		bodyModel[80] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 183
		bodyModel[81] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 184
		bodyModel[82] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 185
		bodyModel[83] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 186
		bodyModel[84] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 187
		bodyModel[85] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 188
		bodyModel[86] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 189
		bodyModel[87] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 190
		bodyModel[88] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 191
		bodyModel[89] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 192
		bodyModel[90] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 193
		bodyModel[91] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 194
		bodyModel[92] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 195
		bodyModel[93] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 198
		bodyModel[94] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 199
		bodyModel[95] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 200
		bodyModel[96] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 201
		bodyModel[97] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 202
		bodyModel[98] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 203
		bodyModel[99] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 204
		bodyModel[100] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 205
		bodyModel[101] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 206
		bodyModel[102] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 207
		bodyModel[103] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 208
		bodyModel[104] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 209
		bodyModel[105] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 210
		bodyModel[106] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 211
		bodyModel[107] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 18
		bodyModel[108] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 21
		bodyModel[109] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 22
		bodyModel[110] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 23
		bodyModel[111] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 216
		bodyModel[112] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 217
		bodyModel[113] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 218
		bodyModel[114] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 219
		bodyModel[115] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 220
		bodyModel[116] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 221
		bodyModel[117] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 222
		bodyModel[118] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 223
		bodyModel[119] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 224
		bodyModel[120] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 225
		bodyModel[121] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 226
		bodyModel[122] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 227
		bodyModel[123] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 228
		bodyModel[124] = new ModelRendererTurbo(this, 1, 144, textureX, textureY); // Box 229

		bodyModel[0].addShapeBox(0F, 0F, 0F, 50, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 103
		bodyModel[0].setRotationPoint(-24F, 1F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 50, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 104
		bodyModel[1].setRotationPoint(-24F, 6F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 50, 3, 18, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[2].setRotationPoint(-24F, -2F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 50, 2, 14, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 106
		bodyModel[3].setRotationPoint(-24F, -3.5F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 50, 2, 11, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[4].setRotationPoint(-24F, -5.5F, -5.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 15, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 108
		bodyModel[5].setRotationPoint(26F, 6F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 15, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 109
		bodyModel[6].setRotationPoint(26F, 1F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 15, 3, 18, 0F,0F, -0.5F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 110
		bodyModel[7].setRotationPoint(26F, -2F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 2, 14, 0F,0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 111
		bodyModel[8].setRotationPoint(26F, -3.5F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 2, 11, 0F,0F, 0F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 112
		bodyModel[9].setRotationPoint(26F, -5.5F, -5.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 25, 2, 11, 0F,0F, 0F, -0.8F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -0.5F); // Box 113
		bodyModel[10].setRotationPoint(41F, -5.5F, -5.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 25, 3, 18, 0F,0F, -0.5F, -3F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -3F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1F); // Box 114
		bodyModel[11].setRotationPoint(41F, -2F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 25, 5, 18, 0F,0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -2F); // Box 115
		bodyModel[12].setRotationPoint(41F, 1F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 25, 4, 16, 0F,0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F); // Box 116
		bodyModel[13].setRotationPoint(41F, 6F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 25, 2, 14, 0F,0F, 0F, -2F, 0F, 0F, -3.3F, 0F, 0F, -3.3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1F); // Box 117
		bodyModel[14].setRotationPoint(41F, -3.5F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 20, 2, 11, 0F,0F, 0.5F, -2F, 0F, 1.1F, -4F, 0F, 1.1F, -4F, 0F, 0.5F, -2F, 0F, 0F, -1.8F, 0F, 0F, -3.3F, 0F, 0F, -3.3F, 0F, 0F, -1.8F); // Box 118
		bodyModel[15].setRotationPoint(66F, -5.5F, -5.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 20, 2, 14, 0F,0F, 0F, -3.3F, 0F, 0F, -4.8F, 0F, 0F, -4.8F, 0F, 0F, -3.3F, 0F, 0F, -2.5F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -2.5F); // Box 119
		bodyModel[16].setRotationPoint(66F, -3.5F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 20, 3, 18, 0F,0F, -0.5F, -4.5F, 0F, -0.5F, -6.2F, 0F, -0.5F, -6.2F, 0F, -0.5F, -4.5F, 0F, 0F, -3.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3.5F); // Box 120
		bodyModel[17].setRotationPoint(66F, -2F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 20, 5, 18, 0F,0F, 0F, -3.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3.5F, 0F, 0F, -4.5F, 0F, 0F, -6.8F, 0F, 0F, -6.8F, 0F, 0F, -4.5F); // Box 121
		bodyModel[18].setRotationPoint(66F, 1F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 20, 4, 16, 0F,0F, 0F, -3.5F, 0F, 0F, -5.8F, 0F, 0F, -5.8F, 0F, 0F, -3.5F, 0F, 0F, -7F, 0F, -0.5F, -7.8F, 0F, -0.5F, -7.8F, 0F, 0F, -7F); // Box 122
		bodyModel[19].setRotationPoint(66F, 6F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 123
		bodyModel[20].setRotationPoint(86F, 6F, -1.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 124
		bodyModel[21].setRotationPoint(86F, 6.4F, -1.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 125
		bodyModel[22].setRotationPoint(86F, 5.6F, -1.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 126
		bodyModel[23].setRotationPoint(86F, 3.8F, -1.8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 127
		bodyModel[24].setRotationPoint(86F, 4.2F, -1.8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 128
		bodyModel[25].setRotationPoint(86F, 4.6F, -1.8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 129
		bodyModel[26].setRotationPoint(86F, 2.05F, -2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 130
		bodyModel[27].setRotationPoint(86F, 2.45F, -2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 131
		bodyModel[28].setRotationPoint(86F, 2.85F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0.2F, 0.5F, 0F, -1.8F, 0.5F, 0F, -1.8F, 0F, 0F, 0.2F, 0F, 0.5F, -1.8F, -3F, -1.2F, -1.8F, -3F, -1.2F, -1.8F, 0F, 0.5F, -1.8F); // Box 132
		bodyModel[29].setRotationPoint(86F, 6F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 11, 5, 4, 0F,0F, 0F, 1F, 5F, 0F, -1.8F, 5F, 0F, -1.8F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0.5F, 0F, -1.8F, 0.5F, 0F, -1.8F, 0F, 0F, 0.2F); // Box 133
		bodyModel[30].setRotationPoint(86F, 1F, -2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 0.5F, 0.8F, 6.5F, 0.5F, -1.8F, 6.5F, 0.5F, -1.8F, 0F, 0.5F, 0.8F, 0F, 0F, 1F, 5F, 0F, -1.8F, 5F, 0F, -1.8F, 0F, 0F, 1F); // Box 134
		bodyModel[31].setRotationPoint(86F, -1F, -2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, -0.5F, 0.2F, 8.5F, 1.5F, -1.8F, 8.5F, 1.5F, -1.8F, 0F, -0.5F, 0.2F, 0F, 0.5F, 0.8F, 6.5F, 0.5F, -1.8F, 6.5F, 0.5F, -1.8F, 0F, 0.5F, 0.8F); // Box 135
		bodyModel[32].setRotationPoint(86F, -4F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 0.6F, -0.5F, 7.5F, 0.8F, -1.8F, 7.5F, 0.8F, -1.8F, 0F, 0.6F, -0.5F, 0F, 0.5F, 0.2F, 8.5F, -1.5F, -1.8F, 8.5F, -1.5F, -1.8F, 0F, 0.5F, 0.2F); // Box 136
		bodyModel[33].setRotationPoint(86F, -6F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 31, 5, 18, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 137
		bodyModel[34].setRotationPoint(-55F, 1F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 31, 4, 16, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6.5F); // Box 138
		bodyModel[35].setRotationPoint(-55F, 6F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 31, 3, 18, 0F,0F, -0.5F, -2.3F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 139
		bodyModel[36].setRotationPoint(-55F, -2F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 31, 2, 14, 0F,0F, 0F, -2.2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2.2F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F); // Box 140
		bodyModel[37].setRotationPoint(-55F, -3.5F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 31, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F); // Box 141
		bodyModel[38].setRotationPoint(-55F, -5.5F, -5.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 31, 2, 11, 0F,0F, -0.5F, -3.8F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -3.8F, 0F, 0F, -3.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -3.3F); // Box 142
		bodyModel[39].setRotationPoint(-86F, -5.5F, -5.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 31, 2, 14, 0F,0F, 0F, -4.8F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, -4.8F, 0F, 0F, -2.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2.5F); // Box 143
		bodyModel[40].setRotationPoint(-86F, -3.5F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 31, 3, 18, 0F,0F, -0.5F, -4.5F, 0F, -0.5F, -2.3F, 0F, -0.5F, -2.3F, 0F, -0.5F, -4.5F, 0F, 0F, -3.8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3.8F); // Box 144
		bodyModel[41].setRotationPoint(-86F, -2F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 31, 5, 18, 0F,0F, 0F, -3.8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3.8F, 0F, -2.5F, -5.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2.5F, -5.5F); // Box 145
		bodyModel[42].setRotationPoint(-86F, 1F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 31, 4, 16, 0F,0F, 2.5F, -4.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2.5F, -4.5F, 0F, -5F, -7.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, -5F, -7.5F); // Box 146
		bodyModel[43].setRotationPoint(-86F, 6F, -8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 41, 2, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.3F, -1.8F, 0F, -0.3F, -1.8F); // Box 147
		bodyModel[44].setRotationPoint(-25F, 8F, -5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 148
		bodyModel[45].setRotationPoint(-59F, -9F, -0.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.48F, 10F, -0.48F, -0.48F, 10F, -0.48F, -0.48F, 10F, -0.48F, -0.48F, 10F, -0.48F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F); // Box 149
		bodyModel[46].setRotationPoint(-59F, -19F, -0.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,20F, 0F, 0F, 23F, 2.5F, 0F, 23F, 2.5F, 0F, 20F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F); // Box 150
		bodyModel[47].setRotationPoint(54F, -6F, -1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 4.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 4.5F, -0.2F, 0F); // Box 151
		bodyModel[48].setRotationPoint(88F, -4.5F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, -3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 152
		bodyModel[49].setRotationPoint(90F, -4.5F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,4.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 4.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 153
		bodyModel[50].setRotationPoint(88F, -4.5F, 1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -3F, 0F, -0.2F, 0F); // Box 154
		bodyModel[51].setRotationPoint(90F, -4.5F, 1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 155
		bodyModel[52].setRotationPoint(86F, 6F, 0.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 156
		bodyModel[53].setRotationPoint(86F, 6.4F, 0.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 157
		bodyModel[54].setRotationPoint(86F, 5.6F, 0.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 158
		bodyModel[55].setRotationPoint(86F, 3.8F, 0.8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 159
		bodyModel[56].setRotationPoint(86F, 4.2F, 0.8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 160
		bodyModel[57].setRotationPoint(86F, 4.6F, 0.8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 161
		bodyModel[58].setRotationPoint(86F, 2.05F, 1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 162
		bodyModel[59].setRotationPoint(86F, 2.45F, 1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 163
		bodyModel[60].setRotationPoint(86F, 2.85F, 1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 24, 12, 5, 0F,-6F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F); // Box 164
		bodyModel[61].setRotationPoint(-12F, -14.5F, -2.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 6, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 165
		bodyModel[62].setRotationPoint(-10F, -11.5F, -2.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, -1.9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.9F); // Box 166
		bodyModel[63].setRotationPoint(-13.5F, -11.5F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[64].setRotationPoint(-10.8F, -16.5F, -0.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 5F, -0.45F, -0.45F, 5F, -0.45F, -0.45F, 5F, -0.45F, -0.45F, 5F, -0.45F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F); // Box 168
		bodyModel[65].setRotationPoint(3.5F, -20F, -0.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 8, 5, 0F,0F, 0F, 0F, -4F, 0F, -0.8F, -4F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.8F, -4F, 0F, -0.8F, 0F, 0F, 0F); // Box 169
		bodyModel[66].setRotationPoint(6F, -13.5F, -2.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 8, 7, 0F,-0.7F, 0F, -0.3F, -3F, 0F, -1.6F, -3F, 0F, -4.6F, -0.7F, 0F, -3.3F, -0.7F, 0F, -0.3F, -3F, 0F, -1.6F, -3F, 0F, -4.6F, -0.7F, 0F, -3.3F); // Box 170
		bodyModel[67].setRotationPoint(8.3F, -13.5F, -2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 20, 1, 5, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[68].setRotationPoint(5.3F, -6.5F, -2.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 20, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 172
		bodyModel[69].setRotationPoint(5.3F, -7.5F, -2.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[70].setRotationPoint(5.3F, -8.5F, -1.5F);

		bodyModel[71].addShapeBox(-2F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 174
		bodyModel[71].setRotationPoint(7.3F, -7.5F, -2.5F);
		bodyModel[71].rotateAngleZ = -0.73303829F;

		bodyModel[72].addShapeBox(-1F, -2.5F, 0F, 4, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F); // Box 175
		bodyModel[72].setRotationPoint(7.3F, -7.5F, -2.5F);
		bodyModel[72].rotateAngleZ = -0.73303829F;

		bodyModel[73].addShapeBox(-1F, -3.5F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[73].setRotationPoint(7.3F, -7.5F, -1.5F);
		bodyModel[73].rotateAngleZ = -0.73303829F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 177
		bodyModel[74].setRotationPoint(3F, -13.5F, -2.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.2F, 0.3F, 0F, -1.2F, 0.3F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F); // Box 178
		bodyModel[75].setRotationPoint(25.3F, -6.5F, -2.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.2F, 1.3F, 0F, -1.2F, 1.3F, 0F, -1.2F, 0F, 0F, -0.2F); // Box 179
		bodyModel[76].setRotationPoint(25.3F, -7.5F, -2.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, -1F, -1F, -0.6F, -1F, -1F, -0.6F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 180
		bodyModel[77].setRotationPoint(25.3F, -8.5F, -1.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 41, 2, 1, 0F,2F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.3F, -1.8F, 0F, -0.3F, -1.8F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 181
		bodyModel[78].setRotationPoint(-25F, 8F, 4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,62F, 0F, 0F, 63F, 0F, 0F, 63F, 0F, 0F, 62F, 0F, 0F, 60F, 0F, 0F, 60F, 0F, 0F, 60F, 0F, 0F, 60F, 0F, 0F); // Box 182
		bodyModel[79].setRotationPoint(0.5F, 9F, -1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 3F, -0.45F, -0.45F, 3F, -0.45F, -0.45F, 3F, -0.45F, -0.45F, 3F, -0.45F, -0.3F, 3F, -0.3F, -0.3F, 3F, -0.3F, -0.3F, 3F, -0.3F, -0.3F, 3F, -0.3F); // Box 183
		bodyModel[80].setRotationPoint(5.5F, -20F, -0.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 7F, -0.45F, -0.45F, 7F, -0.45F, -0.45F, 7F, -0.45F, -0.45F, 7F, -0.45F, -0.3F, 7F, -0.3F, -0.3F, 7F, -0.3F, -0.3F, 7F, -0.3F, -0.3F, 7F, -0.3F); // Box 184
		bodyModel[81].setRotationPoint(1.5F, -21F, -0.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 185
		bodyModel[82].setRotationPoint(-24F, -6.5F, -5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 1F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, 0F); // Box 186
		bodyModel[83].setRotationPoint(-35F, -6.5F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 187
		bodyModel[84].setRotationPoint(-24F, -6.5F, 4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 1F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.6F); // Box 188
		bodyModel[85].setRotationPoint(-35F, -6.5F, 4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 19, 3, 4, 0F,-0.3F, 0.4F, -1.8F, 0.5F, -0.5F, 2.5F, 0.5F, -0.5F, 2.5F, -0.3F, 0.4F, -1.8F, 0F, -0.5F, -1.8F, 0.5F, 0F, 3.2F, 0.5F, 0F, 3.2F, 0F, -0.5F, -1.8F); // Box 189
		bodyModel[86].setRotationPoint(-105.5F, -2F, -2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 19, 2, 4, 0F,-1.5F, -0.6F, -1.8F, 0.5F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F, -1.5F, -0.6F, -1.8F, -0.3F, -0.4F, -1.8F, 0.5F, 0.5F, 2.5F, 0.5F, 0.5F, 2.5F, -0.3F, -0.4F, -1.8F); // Box 190
		bodyModel[87].setRotationPoint(-105.5F, -4F, -2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 19, 3, 4, 0F,0F, 0.5F, -1.8F, 0.5F, 0F, 3.2F, 0.5F, 0F, 3.2F, 0F, 0.5F, -1.8F, -1F, -2.5F, -1.8F, 0.5F, -0.5F, 1.5F, 0.5F, -0.5F, 1.5F, -1F, -2.5F, -1.8F); // Box 191
		bodyModel[88].setRotationPoint(-105.5F, 1F, -2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 19, 2, 4, 0F,-1F, 1.5F, -1.8F, 0.5F, -0.5F, 1.5F, 0.5F, -0.5F, 1.5F, -1F, 1.5F, -1.8F, -9F, -1.5F, -1.8F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, -9F, -1.5F, -1.8F); // Box 192
		bodyModel[89].setRotationPoint(-105.5F, 3F, -2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 193
		bodyModel[90].setRotationPoint(-97.5F, 3F, -0.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -9F, 0F, -0.3F, -9F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 194
		bodyModel[91].setRotationPoint(-94.5F, 6F, -0.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 195
		bodyModel[92].setRotationPoint(-99.5F, 9F, -0.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F,-5F, -1.4F, -1F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -5F, -1.4F, -1F, 0F, 0.2F, -1.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0.2F, -1.3F); // Box 198
		bodyModel[93].setRotationPoint(-102F, -5.5F, -1.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[94].setRotationPoint(33F, -14.5F, -3.8F);

		bodyModel[95].addShapeBox(-7F, -0.5F, 0F, 8, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 200
		bodyModel[95].setRotationPoint(33F, -8.5F, -3.8F);
		bodyModel[95].rotateAngleZ = -0.52359878F;

		bodyModel[96].addShapeBox(-19F, -0.5F, 0F, 12, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 201
		bodyModel[96].setRotationPoint(33F, -8.5F, -3.8F);
		bodyModel[96].rotateAngleZ = -0.52359878F;

		bodyModel[97].addShapeBox(0F, -0.5F, 0F, 1, 7, 1, 0F,-0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F); // Box 202
		bodyModel[97].setRotationPoint(16.5F, -17.5F, -3.8F);

		bodyModel[98].addShapeBox(0F, -0.5F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 203
		bodyModel[98].setRotationPoint(16.5F, -11.5F, -3.8F);
		bodyModel[98].rotateAngleZ = -0.26179939F;

		bodyModel[99].addShapeBox(0F, -0.5F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 204
		bodyModel[99].setRotationPoint(15.5F, -10.5F, -3.8F);
		bodyModel[99].rotateAngleZ = 0.73303829F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 205
		bodyModel[100].setRotationPoint(-99F, 5F, -6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 206
		bodyModel[101].setRotationPoint(-95.5F, 5F, -7.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 207
		bodyModel[102].setRotationPoint(-95.5F, 5F, -7.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.4F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.4F, -0.4F, 0.4F, -0.4F, -0.4F, 0.4F, -0.4F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.4F, -0.4F, 0.4F, -0.4F, -0.4F, 0.4F); // Box 208
		bodyModel[103].setRotationPoint(-91F, 5F, -6.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 209
		bodyModel[104].setRotationPoint(-99F, 5F, 2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 210
		bodyModel[105].setRotationPoint(-95.5F, 5F, 6.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.4F, -0.4F, 0.4F, -0.4F, -0.4F, 0.4F, -0.9F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0.4F, -0.4F, -0.4F, 0.4F, -0.9F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 211
		bodyModel[106].setRotationPoint(-91F, 5F, 0.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[107].setRotationPoint(-92.5F, 4.9F, -3.8F);

		bodyModel[108].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[108].setRotationPoint(-92.5F, 5.4F, -3.3F);

		bodyModel[109].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[109].setRotationPoint(-92.5F, 5.4F, -3.3F);
		bodyModel[109].rotateAngleX = 2.0943951F;

		bodyModel[110].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[110].setRotationPoint(-92.5F, 5.4F, -3.3F);
		bodyModel[110].rotateAngleX = 4.1887902F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[111].setRotationPoint(-92.5F, 4.9F, 2.8F);

		bodyModel[112].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[112].setRotationPoint(-92.5F, 5.4F, 3.3F);
		bodyModel[112].rotateAngleX = 4.1887902F;

		bodyModel[113].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[113].setRotationPoint(-92.5F, 5.4F, 3.3F);
		bodyModel[113].rotateAngleX = 2.0943951F;

		bodyModel[114].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[114].setRotationPoint(-92.5F, 5.4F, 3.3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-0.5F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 220
		bodyModel[115].setRotationPoint(-91.5F, 0.9F, -3.8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-0.5F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 221
		bodyModel[116].setRotationPoint(-91.5F, 0.9F, 2.8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[117].setRotationPoint(38F, -6.5F, -1.5F);
		bodyModel[117].rotateAngleZ = 0.05235988F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[118].setRotationPoint(-33.5F, -7.7F, -1F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 224
		bodyModel[119].setRotationPoint(-33F, -8.7F, -0.5F);

		bodyModel[120].addShapeBox(-2F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[120].setRotationPoint(-32.5F, -8.7F, 0.5F);
		bodyModel[120].rotateAngleY = -3.14159265F;
		bodyModel[120].rotateAngleZ = 0.17453293F;

		bodyModel[121].addShapeBox(0.5F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 226
		bodyModel[121].setRotationPoint(-32.5F, -8.7F, 0.5F);
		bodyModel[121].rotateAngleY = -3.14159265F;
		bodyModel[121].rotateAngleZ = 0.17453293F;

		bodyModel[122].addShapeBox(2.5F, -0.5F, 0F, 4, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 227
		bodyModel[122].setRotationPoint(-32.5F, -8.7F, 0.5F);
		bodyModel[122].rotateAngleY = -3.14159265F;
		bodyModel[122].rotateAngleZ = 0.17453293F;

		bodyModel[123].addShapeBox(6F, -0.5F, 0F, 4, 1, 1, 0F,0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F); // Box 228
		bodyModel[123].setRotationPoint(-32.5F, -8.7F, 0.5F);
		bodyModel[123].rotateAngleY = -3.14159265F;
		bodyModel[123].rotateAngleZ = 0.17453293F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 77, 53, 1, 0F,-36.5F, -26.5F, -0.45F, -36F, -25F, -0.45F, -36F, -25F, -0.45F, -36.5F, -26.5F, -0.45F, -36.3F, -23F, -0.45F, -36F, -25F, -0.45F, -36F, -25F, -0.45F, -36.3F, -23F, -0.45F); // Box 229
		bodyModel[124].setRotationPoint(-39F, -51F, -0.5F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 196
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 197

		leftFrontWheelModel[0].addShapeBox(0F, -1F, -0.5F, 7, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 196
		leftFrontWheelModel[0].setRotationPoint(-94.5F, 8F, 0F);
		leftFrontWheelModel[0].rotateAngleZ = 3.14159265F;

		leftFrontWheelModel[1].addShapeBox(3F, 2F, -0.5F, 4, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F); // Box 197
		leftFrontWheelModel[1].setRotationPoint(-94.5F, 8F, 0F);
		leftFrontWheelModel[1].rotateAngleZ = 3.14159265F;
	}
}