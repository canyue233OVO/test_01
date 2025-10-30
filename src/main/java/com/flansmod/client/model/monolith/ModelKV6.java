//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KV6
// Model Creator: 
// Created on: 15.04.2018 - 14:47:38
// Last changed on: 15.04.2018 - 14:47:38

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKV6 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelKV6() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[598];
		turretModel = new ModelRendererTurbo[78];
		barrelModel = new ModelRendererTurbo[20];
		leftTrackWheelModels = new ModelRendererTurbo[104];
		rightTrackWheelModels = new ModelRendererTurbo[104];
		leftTrackModel = new ModelRendererTurbo[11];
		rightTrackModel = new ModelRendererTurbo[11];

		initbodyModel_1();
		initbodyModel_2();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 4
		bodyModel[9] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 33
		bodyModel[17] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 35
		bodyModel[19] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 36
		bodyModel[20] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 37
		bodyModel[21] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 38
		bodyModel[22] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 76
		bodyModel[23] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 77
		bodyModel[24] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 78
		bodyModel[25] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 79
		bodyModel[26] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 80
		bodyModel[27] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Box 81
		bodyModel[28] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 178
		bodyModel[29] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // Box 179
		bodyModel[30] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 180
		bodyModel[31] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Box 181
		bodyModel[32] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Box 182
		bodyModel[33] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 183
		bodyModel[34] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 184
		bodyModel[35] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 185
		bodyModel[36] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 186
		bodyModel[37] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 187
		bodyModel[38] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 188
		bodyModel[39] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 189
		bodyModel[40] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Box 190
		bodyModel[41] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Box 191
		bodyModel[42] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 192
		bodyModel[43] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 193
		bodyModel[44] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Box 194
		bodyModel[45] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 195
		bodyModel[46] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 196
		bodyModel[47] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Box 197
		bodyModel[48] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 198
		bodyModel[49] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 199
		bodyModel[50] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // Box 200
		bodyModel[51] = new ModelRendererTurbo(this, 305, 233, textureX, textureY); // Box 201
		bodyModel[52] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Box 202
		bodyModel[53] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Box 203
		bodyModel[54] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 204
		bodyModel[55] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Box 205
		bodyModel[56] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Box 206
		bodyModel[57] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 207
		bodyModel[58] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 208
		bodyModel[59] = new ModelRendererTurbo(this, 353, 241, textureX, textureY); // Box 209
		bodyModel[60] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 210
		bodyModel[61] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 211
		bodyModel[62] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Box 212
		bodyModel[63] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 213
		bodyModel[64] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // Box 214
		bodyModel[65] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Box 215
		bodyModel[66] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 216
		bodyModel[67] = new ModelRendererTurbo(this, 409, 249, textureX, textureY); // Box 217
		bodyModel[68] = new ModelRendererTurbo(this, 441, 249, textureX, textureY); // Box 218
		bodyModel[69] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 219
		bodyModel[70] = new ModelRendererTurbo(this, 201, 257, textureX, textureY); // Box 272
		bodyModel[71] = new ModelRendererTurbo(this, 225, 257, textureX, textureY); // Box 273
		bodyModel[72] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 274
		bodyModel[73] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 0
		bodyModel[74] = new ModelRendererTurbo(this, 241, 257, textureX, textureY); // Box 1
		bodyModel[75] = new ModelRendererTurbo(this, 57, 265, textureX, textureY); // Box 2
		bodyModel[76] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 3
		bodyModel[77] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Box 4
		bodyModel[78] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Box 5
		bodyModel[79] = new ModelRendererTurbo(this, 433, 257, textureX, textureY); // Box 6
		bodyModel[80] = new ModelRendererTurbo(this, 473, 257, textureX, textureY); // Box 7
		bodyModel[81] = new ModelRendererTurbo(this, 489, 257, textureX, textureY); // Box 8
		bodyModel[82] = new ModelRendererTurbo(this, 313, 257, textureX, textureY); // Box 9
		bodyModel[83] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 10
		bodyModel[84] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Box 11
		bodyModel[85] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Box 12
		bodyModel[86] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Box 13
		bodyModel[87] = new ModelRendererTurbo(this, 289, 265, textureX, textureY); // Box 14
		bodyModel[88] = new ModelRendererTurbo(this, 353, 265, textureX, textureY); // Box 15
		bodyModel[89] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 16
		bodyModel[90] = new ModelRendererTurbo(this, 401, 273, textureX, textureY); // Box 17
		bodyModel[91] = new ModelRendererTurbo(this, 81, 281, textureX, textureY); // Box 18
		bodyModel[92] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 19
		bodyModel[93] = new ModelRendererTurbo(this, 209, 281, textureX, textureY); // Box 20
		bodyModel[94] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 21
		bodyModel[95] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Box 22
		bodyModel[96] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 23
		bodyModel[97] = new ModelRendererTurbo(this, 401, 289, textureX, textureY); // Box 24
		bodyModel[98] = new ModelRendererTurbo(this, 457, 289, textureX, textureY); // Box 25
		bodyModel[99] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Box 26
		bodyModel[100] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Box 27
		bodyModel[101] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Box 28
		bodyModel[102] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Box 29
		bodyModel[103] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Box 30
		bodyModel[104] = new ModelRendererTurbo(this, 489, 265, textureX, textureY); // Box 31
		bodyModel[105] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 32
		bodyModel[106] = new ModelRendererTurbo(this, 65, 273, textureX, textureY); // Box 33
		bodyModel[107] = new ModelRendererTurbo(this, 41, 289, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 1
		bodyModel[109] = new ModelRendererTurbo(this, 65, 297, textureX, textureY); // Box 2
		bodyModel[110] = new ModelRendererTurbo(this, 105, 297, textureX, textureY); // Box 3
		bodyModel[111] = new ModelRendererTurbo(this, 145, 297, textureX, textureY); // Box 4
		bodyModel[112] = new ModelRendererTurbo(this, 185, 297, textureX, textureY); // Box 5
		bodyModel[113] = new ModelRendererTurbo(this, 201, 297, textureX, textureY); // Box 6
		bodyModel[114] = new ModelRendererTurbo(this, 297, 297, textureX, textureY); // Box 7
		bodyModel[115] = new ModelRendererTurbo(this, 345, 297, textureX, textureY); // Box 8
		bodyModel[116] = new ModelRendererTurbo(this, 377, 297, textureX, textureY); // Box 9
		bodyModel[117] = new ModelRendererTurbo(this, 465, 273, textureX, textureY); // Box 10
		bodyModel[118] = new ModelRendererTurbo(this, 433, 297, textureX, textureY); // Box 11
		bodyModel[119] = new ModelRendererTurbo(this, 433, 305, textureX, textureY); // Box 12
		bodyModel[120] = new ModelRendererTurbo(this, 81, 273, textureX, textureY); // Box 13
		bodyModel[121] = new ModelRendererTurbo(this, 497, 273, textureX, textureY); // Box 14
		bodyModel[122] = new ModelRendererTurbo(this, 201, 281, textureX, textureY); // Box 15
		bodyModel[123] = new ModelRendererTurbo(this, 385, 281, textureX, textureY); // Box 16
		bodyModel[124] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 17
		bodyModel[125] = new ModelRendererTurbo(this, 65, 313, textureX, textureY); // Box 18
		bodyModel[126] = new ModelRendererTurbo(this, 65, 289, textureX, textureY); // Box 19
		bodyModel[127] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 20
		bodyModel[128] = new ModelRendererTurbo(this, 25, 297, textureX, textureY); // Box 21
		bodyModel[129] = new ModelRendererTurbo(this, 89, 297, textureX, textureY); // Box 22
		bodyModel[130] = new ModelRendererTurbo(this, 129, 297, textureX, textureY); // Box 23
		bodyModel[131] = new ModelRendererTurbo(this, 169, 297, textureX, textureY); // Box 24
		bodyModel[132] = new ModelRendererTurbo(this, 273, 297, textureX, textureY); // Box 25
		bodyModel[133] = new ModelRendererTurbo(this, 289, 297, textureX, textureY); // Box 26
		bodyModel[134] = new ModelRendererTurbo(this, 329, 297, textureX, textureY); // Box 27
		bodyModel[135] = new ModelRendererTurbo(this, 345, 297, textureX, textureY); // Box 28
		bodyModel[136] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 30
		bodyModel[137] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 31
		bodyModel[138] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 32
		bodyModel[139] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 33
		bodyModel[140] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 34
		bodyModel[141] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 35
		bodyModel[142] = new ModelRendererTurbo(this, 209, 297, textureX, textureY); // Box 36
		bodyModel[143] = new ModelRendererTurbo(this, 97, 273, textureX, textureY); // Box 37
		bodyModel[144] = new ModelRendererTurbo(this, 105, 297, textureX, textureY); // Box 38
		bodyModel[145] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 39
		bodyModel[146] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 40
		bodyModel[147] = new ModelRendererTurbo(this, 185, 297, textureX, textureY); // Box 41
		bodyModel[148] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 42
		bodyModel[149] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 43
		bodyModel[150] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 44
		bodyModel[151] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 45
		bodyModel[152] = new ModelRendererTurbo(this, 377, 297, textureX, textureY); // Box 46
		bodyModel[153] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 47
		bodyModel[154] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 48
		bodyModel[155] = new ModelRendererTurbo(this, 465, 273, textureX, textureY); // Box 49
		bodyModel[156] = new ModelRendererTurbo(this, 497, 297, textureX, textureY); // Box 50
		bodyModel[157] = new ModelRendererTurbo(this, 41, 305, textureX, textureY); // Box 51
		bodyModel[158] = new ModelRendererTurbo(this, 89, 313, textureX, textureY); // Box 69
		bodyModel[159] = new ModelRendererTurbo(this, 410, 313, textureX, textureY); // Box 70
		bodyModel[160] = new ModelRendererTurbo(this, 225, 361, textureX, textureY); // Box 76
		bodyModel[161] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 77
		bodyModel[162] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 78
		bodyModel[163] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 79
		bodyModel[164] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Box 87
		bodyModel[165] = new ModelRendererTurbo(this, 169, 305, textureX, textureY); // Box 88
		bodyModel[166] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 90
		bodyModel[167] = new ModelRendererTurbo(this, 89, 305, textureX, textureY); // Box 91
		bodyModel[168] = new ModelRendererTurbo(this, 185, 313, textureX, textureY); // Box 94
		bodyModel[169] = new ModelRendererTurbo(this, 129, 305, textureX, textureY); // Box 95
		bodyModel[170] = new ModelRendererTurbo(this, 281, 313, textureX, textureY); // Box 98
		bodyModel[171] = new ModelRendererTurbo(this, 329, 313, textureX, textureY); // Box 99
		bodyModel[172] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 102
		bodyModel[173] = new ModelRendererTurbo(this, 489, 313, textureX, textureY); // Box 103
		bodyModel[174] = new ModelRendererTurbo(this, 81, 321, textureX, textureY); // Box 106
		bodyModel[175] = new ModelRendererTurbo(this, 17, 321, textureX, textureY); // Box 107
		bodyModel[176] = new ModelRendererTurbo(this, 97, 321, textureX, textureY); // Box 134
		bodyModel[177] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 135
		bodyModel[178] = new ModelRendererTurbo(this, 217, 321, textureX, textureY); // Box 138
		bodyModel[179] = new ModelRendererTurbo(this, 233, 321, textureX, textureY); // Box 140
		bodyModel[180] = new ModelRendererTurbo(this, 249, 321, textureX, textureY); // Box 142
		bodyModel[181] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Box 144
		bodyModel[182] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 146
		bodyModel[183] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Box 148
		bodyModel[184] = new ModelRendererTurbo(this, 337, 321, textureX, textureY); // Box 150
		bodyModel[185] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Box 151
		bodyModel[186] = new ModelRendererTurbo(this, 369, 321, textureX, textureY); // Box 154
		bodyModel[187] = new ModelRendererTurbo(this, 385, 321, textureX, textureY); // Box 156
		bodyModel[188] = new ModelRendererTurbo(this, 153, 313, textureX, textureY); // Box 157
		bodyModel[189] = new ModelRendererTurbo(this, 401, 321, textureX, textureY); // Box 158
		bodyModel[190] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 159
		bodyModel[191] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 161
		bodyModel[192] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 162
		bodyModel[193] = new ModelRendererTurbo(this, 201, 313, textureX, textureY); // Box 163
		bodyModel[194] = new ModelRendererTurbo(this, 273, 313, textureX, textureY); // Box 164
		bodyModel[195] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 165
		bodyModel[196] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 166
		bodyModel[197] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 167
		bodyModel[198] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 168
		bodyModel[199] = new ModelRendererTurbo(this, 457, 313, textureX, textureY); // Box 169
		bodyModel[200] = new ModelRendererTurbo(this, 297, 313, textureX, textureY); // Box 170
		bodyModel[201] = new ModelRendererTurbo(this, 433, 321, textureX, textureY); // Box 171
		bodyModel[202] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 172
		bodyModel[203] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 173
		bodyModel[204] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 174
		bodyModel[205] = new ModelRendererTurbo(this, 49, 321, textureX, textureY); // Box 175
		bodyModel[206] = new ModelRendererTurbo(this, 353, 313, textureX, textureY); // Box 176
		bodyModel[207] = new ModelRendererTurbo(this, 113, 329, textureX, textureY); // Box 177
		bodyModel[208] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Box 178
		bodyModel[209] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 179
		bodyModel[210] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 180
		bodyModel[211] = new ModelRendererTurbo(this, 137, 329, textureX, textureY); // Box 181
		bodyModel[212] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Box 182
		bodyModel[213] = new ModelRendererTurbo(this, 153, 329, textureX, textureY); // Box 183
		bodyModel[214] = new ModelRendererTurbo(this, 441, 257, textureX, textureY); // Box 184
		bodyModel[215] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 185
		bodyModel[216] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 186
		bodyModel[217] = new ModelRendererTurbo(this, 185, 329, textureX, textureY); // Box 187
		bodyModel[218] = new ModelRendererTurbo(this, 329, 329, textureX, textureY); // Box 188
		bodyModel[219] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 189
		bodyModel[220] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Box 190
		bodyModel[221] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 191
		bodyModel[222] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 192
		bodyModel[223] = new ModelRendererTurbo(this, 433, 329, textureX, textureY); // Box 193
		bodyModel[224] = new ModelRendererTurbo(this, 457, 329, textureX, textureY); // Box 229
		bodyModel[225] = new ModelRendererTurbo(this, 473, 329, textureX, textureY); // Box 230
		bodyModel[226] = new ModelRendererTurbo(this, 489, 329, textureX, textureY); // Box 231
		bodyModel[227] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 232
		bodyModel[228] = new ModelRendererTurbo(this, 17, 337, textureX, textureY); // Box 233
		bodyModel[229] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Box 234
		bodyModel[230] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 235
		bodyModel[231] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 236
		bodyModel[232] = new ModelRendererTurbo(this, 49, 337, textureX, textureY); // Box 237
		bodyModel[233] = new ModelRendererTurbo(this, 65, 337, textureX, textureY); // Box 238
		bodyModel[234] = new ModelRendererTurbo(this, 33, 297, textureX, textureY); // Box 239
		bodyModel[235] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 240
		bodyModel[236] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 241
		bodyModel[237] = new ModelRendererTurbo(this, 81, 337, textureX, textureY); // Box 242
		bodyModel[238] = new ModelRendererTurbo(this, 97, 337, textureX, textureY); // Box 243
		bodyModel[239] = new ModelRendererTurbo(this, 305, 297, textureX, textureY); // Box 244
		bodyModel[240] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 245
		bodyModel[241] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Box 246
		bodyModel[242] = new ModelRendererTurbo(this, 113, 337, textureX, textureY); // Box 247
		bodyModel[243] = new ModelRendererTurbo(this, 153, 337, textureX, textureY); // Box 248
		bodyModel[244] = new ModelRendererTurbo(this, 201, 337, textureX, textureY); // Box 249
		bodyModel[245] = new ModelRendererTurbo(this, 25, 305, textureX, textureY); // Box 250
		bodyModel[246] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 251
		bodyModel[247] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 252
		bodyModel[248] = new ModelRendererTurbo(this, 217, 337, textureX, textureY); // Box 253
		bodyModel[249] = new ModelRendererTurbo(this, 233, 337, textureX, textureY); // Box 254
		bodyModel[250] = new ModelRendererTurbo(this, 249, 337, textureX, textureY); // Box 255
		bodyModel[251] = new ModelRendererTurbo(this, 209, 305, textureX, textureY); // Box 256
		bodyModel[252] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Box 257
		bodyModel[253] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Box 258
		bodyModel[254] = new ModelRendererTurbo(this, 265, 337, textureX, textureY); // Box 259
		bodyModel[255] = new ModelRendererTurbo(this, 281, 337, textureX, textureY); // Box 260
		bodyModel[256] = new ModelRendererTurbo(this, 297, 337, textureX, textureY); // Box 261
		bodyModel[257] = new ModelRendererTurbo(this, 353, 305, textureX, textureY); // Box 262
		bodyModel[258] = new ModelRendererTurbo(this, 393, 241, textureX, textureY); // Box 263
		bodyModel[259] = new ModelRendererTurbo(this, 377, 249, textureX, textureY); // Box 264
		bodyModel[260] = new ModelRendererTurbo(this, 105, 377, textureX, textureY); // Box 331
		bodyModel[261] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 332
		bodyModel[262] = new ModelRendererTurbo(this, 121, 377, textureX, textureY); // Box 333
		bodyModel[263] = new ModelRendererTurbo(this, 145, 377, textureX, textureY); // Box 334
		bodyModel[264] = new ModelRendererTurbo(this, 153, 377, textureX, textureY); // Box 335
		bodyModel[265] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 336
		bodyModel[266] = new ModelRendererTurbo(this, 169, 377, textureX, textureY); // Box 337
		bodyModel[267] = new ModelRendererTurbo(this, 193, 377, textureX, textureY); // Box 338
		bodyModel[268] = new ModelRendererTurbo(this, 201, 377, textureX, textureY); // Box 351
		bodyModel[269] = new ModelRendererTurbo(this, 225, 377, textureX, textureY); // Box 352
		bodyModel[270] = new ModelRendererTurbo(this, 249, 377, textureX, textureY); // Box 353
		bodyModel[271] = new ModelRendererTurbo(this, 273, 377, textureX, textureY); // Box 354
		bodyModel[272] = new ModelRendererTurbo(this, 114, 448, textureX, textureY); // Shape 11
		bodyModel[273] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 85
		bodyModel[274] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 86
		bodyModel[275] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 89
		bodyModel[276] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 92
		bodyModel[277] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 93
		bodyModel[278] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 96
		bodyModel[279] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 97
		bodyModel[280] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 100
		bodyModel[281] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 101
		bodyModel[282] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 104
		bodyModel[283] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 105
		bodyModel[284] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 108
		bodyModel[285] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 133
		bodyModel[286] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 136
		bodyModel[287] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 137
		bodyModel[288] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 139
		bodyModel[289] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 141
		bodyModel[290] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 143
		bodyModel[291] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 145
		bodyModel[292] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 147
		bodyModel[293] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 149
		bodyModel[294] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 152
		bodyModel[295] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 153
		bodyModel[296] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 155
		bodyModel[297] = new ModelRendererTurbo(this, 79, 414, textureX, textureY); // Shape 10
		bodyModel[298] = new ModelRendererTurbo(this, 79, 414, textureX, textureY); // Shape 17
		bodyModel[299] = new ModelRendererTurbo(this, 79, 414, textureX, textureY); // Shape 21
		bodyModel[300] = new ModelRendererTurbo(this, 79, 414, textureX, textureY); // Shape 25
		bodyModel[301] = new ModelRendererTurbo(this, 79, 414, textureX, textureY); // Shape 30
		bodyModel[302] = new ModelRendererTurbo(this, 79, 414, textureX, textureY); // Shape 35
		bodyModel[303] = new ModelRendererTurbo(this, 76, 448, textureX, textureY); // Shape 11
		bodyModel[304] = new ModelRendererTurbo(this, 457, 289, textureX, textureY); // Box 683
		bodyModel[305] = new ModelRendererTurbo(this, 401, 289, textureX, textureY); // Box 684
		bodyModel[306] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 685
		bodyModel[307] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Box 686
		bodyModel[308] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Box 687
		bodyModel[309] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Box 688
		bodyModel[310] = new ModelRendererTurbo(this, 489, 265, textureX, textureY); // Box 689
		bodyModel[311] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 690
		bodyModel[312] = new ModelRendererTurbo(this, 65, 273, textureX, textureY); // Box 691
		bodyModel[313] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 5
		bodyModel[314] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 6
		bodyModel[315] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 7
		bodyModel[316] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 6
		bodyModel[317] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 7
		bodyModel[318] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 8
		bodyModel[319] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 9
		bodyModel[320] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 10
		bodyModel[321] = new ModelRendererTurbo(this, 273, 305, textureX, textureY); // Box 52
		bodyModel[322] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 53
		bodyModel[323] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 54
		bodyModel[324] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 55
		bodyModel[325] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 56
		bodyModel[326] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 58
		bodyModel[327] = new ModelRendererTurbo(this, 305, 305, textureX, textureY); // Box 59
		bodyModel[328] = new ModelRendererTurbo(this, 329, 305, textureX, textureY); // Box 60
		bodyModel[329] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 61
		bodyModel[330] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Box 62
		bodyModel[331] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 64
		bodyModel[332] = new ModelRendererTurbo(this, 377, 305, textureX, textureY); // Box 65
		bodyModel[333] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 66
		bodyModel[334] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 67
		bodyModel[335] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 71
		bodyModel[336] = new ModelRendererTurbo(this, 137, 321, textureX, textureY); // Box 72
		bodyModel[337] = new ModelRendererTurbo(this, 401, 281, textureX, textureY); // Box 73
		bodyModel[338] = new ModelRendererTurbo(this, 385, 289, textureX, textureY); // Box 74
		bodyModel[339] = new ModelRendererTurbo(this, 497, 305, textureX, textureY); // Box 75
		bodyModel[340] = new ModelRendererTurbo(this, 457, 313, textureX, textureY); // Box 80
		bodyModel[341] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 81
		bodyModel[342] = new ModelRendererTurbo(this, 49, 321, textureX, textureY); // Box 82
		bodyModel[343] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 83
		bodyModel[344] = new ModelRendererTurbo(this, 185, 313, textureX, textureY); // Box 94
		bodyModel[345] = new ModelRendererTurbo(this, 129, 305, textureX, textureY); // Box 95
		bodyModel[346] = new ModelRendererTurbo(this, 281, 313, textureX, textureY); // Box 98
		bodyModel[347] = new ModelRendererTurbo(this, 329, 313, textureX, textureY); // Box 99
		bodyModel[348] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 102
		bodyModel[349] = new ModelRendererTurbo(this, 489, 313, textureX, textureY); // Box 103
		bodyModel[350] = new ModelRendererTurbo(this, 81, 321, textureX, textureY); // Box 106
		bodyModel[351] = new ModelRendererTurbo(this, 17, 321, textureX, textureY); // Box 107
		bodyModel[352] = new ModelRendererTurbo(this, 249, 321, textureX, textureY); // Box 142
		bodyModel[353] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Box 144
		bodyModel[354] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 146
		bodyModel[355] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Box 148
		bodyModel[356] = new ModelRendererTurbo(this, 337, 321, textureX, textureY); // Box 150
		bodyModel[357] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Box 151
		bodyModel[358] = new ModelRendererTurbo(this, 369, 321, textureX, textureY); // Box 154
		bodyModel[359] = new ModelRendererTurbo(this, 385, 321, textureX, textureY); // Box 156
		bodyModel[360] = new ModelRendererTurbo(this, 297, 313, textureX, textureY); // Box 170
		bodyModel[361] = new ModelRendererTurbo(this, 433, 321, textureX, textureY); // Box 171
		bodyModel[362] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 172
		bodyModel[363] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 173
		bodyModel[364] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 174
		bodyModel[365] = new ModelRendererTurbo(this, 49, 321, textureX, textureY); // Box 175
		bodyModel[366] = new ModelRendererTurbo(this, 353, 313, textureX, textureY); // Box 176
		bodyModel[367] = new ModelRendererTurbo(this, 113, 329, textureX, textureY); // Box 177
		bodyModel[368] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Box 178
		bodyModel[369] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 179
		bodyModel[370] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 180
		bodyModel[371] = new ModelRendererTurbo(this, 137, 329, textureX, textureY); // Box 181
		bodyModel[372] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Box 182
		bodyModel[373] = new ModelRendererTurbo(this, 153, 329, textureX, textureY); // Box 183
		bodyModel[374] = new ModelRendererTurbo(this, 441, 257, textureX, textureY); // Box 184
		bodyModel[375] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 185
		bodyModel[376] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 186
		bodyModel[377] = new ModelRendererTurbo(this, 185, 329, textureX, textureY); // Box 187
		bodyModel[378] = new ModelRendererTurbo(this, 329, 329, textureX, textureY); // Box 188
		bodyModel[379] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 189
		bodyModel[380] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Box 190
		bodyModel[381] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 191
		bodyModel[382] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 192
		bodyModel[383] = new ModelRendererTurbo(this, 433, 329, textureX, textureY); // Box 193
		bodyModel[384] = new ModelRendererTurbo(this, 457, 329, textureX, textureY); // Box 229
		bodyModel[385] = new ModelRendererTurbo(this, 81, 337, textureX, textureY); // Box 242
		bodyModel[386] = new ModelRendererTurbo(this, 97, 337, textureX, textureY); // Box 243
		bodyModel[387] = new ModelRendererTurbo(this, 305, 297, textureX, textureY); // Box 244
		bodyModel[388] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 245
		bodyModel[389] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Box 246
		bodyModel[390] = new ModelRendererTurbo(this, 113, 337, textureX, textureY); // Box 247
		bodyModel[391] = new ModelRendererTurbo(this, 153, 337, textureX, textureY); // Box 248
		bodyModel[392] = new ModelRendererTurbo(this, 201, 337, textureX, textureY); // Box 249
		bodyModel[393] = new ModelRendererTurbo(this, 25, 305, textureX, textureY); // Box 250
		bodyModel[394] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 251
		bodyModel[395] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 252
		bodyModel[396] = new ModelRendererTurbo(this, 217, 337, textureX, textureY); // Box 253
		bodyModel[397] = new ModelRendererTurbo(this, 233, 337, textureX, textureY); // Box 254
		bodyModel[398] = new ModelRendererTurbo(this, 249, 337, textureX, textureY); // Box 255
		bodyModel[399] = new ModelRendererTurbo(this, 209, 305, textureX, textureY); // Box 256
		bodyModel[400] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Box 257
		bodyModel[401] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Box 258
		bodyModel[402] = new ModelRendererTurbo(this, 265, 337, textureX, textureY); // Box 259
		bodyModel[403] = new ModelRendererTurbo(this, 281, 337, textureX, textureY); // Box 260
		bodyModel[404] = new ModelRendererTurbo(this, 297, 337, textureX, textureY); // Box 261
		bodyModel[405] = new ModelRendererTurbo(this, 353, 305, textureX, textureY); // Box 262
		bodyModel[406] = new ModelRendererTurbo(this, 377, 249, textureX, textureY); // Box 264
		bodyModel[407] = new ModelRendererTurbo(this, 217, 377, textureX, textureY); // Box 10
		bodyModel[408] = new ModelRendererTurbo(this, 297, 377, textureX, textureY); // Box 11
		bodyModel[409] = new ModelRendererTurbo(this, 313, 377, textureX, textureY); // Box 12
		bodyModel[410] = new ModelRendererTurbo(this, 241, 377, textureX, textureY); // Box 16
		bodyModel[411] = new ModelRendererTurbo(this, 329, 377, textureX, textureY); // Box 17
		bodyModel[412] = new ModelRendererTurbo(this, 345, 377, textureX, textureY); // Box 18
		bodyModel[413] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 93
		bodyModel[414] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 96
		bodyModel[415] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 97
		bodyModel[416] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 100
		bodyModel[417] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 101
		bodyModel[418] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 104
		bodyModel[419] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 105
		bodyModel[420] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 108
		bodyModel[421] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 141
		bodyModel[422] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 143
		bodyModel[423] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 145
		bodyModel[424] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 147
		bodyModel[425] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 149
		bodyModel[426] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 152
		bodyModel[427] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 153
		bodyModel[428] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 155
		bodyModel[429] = new ModelRendererTurbo(this, 79, 414, textureX, textureY); // Shape 17
		bodyModel[430] = new ModelRendererTurbo(this, 79, 414, textureX, textureY); // Shape 21
		bodyModel[431] = new ModelRendererTurbo(this, 79, 414, textureX, textureY); // Shape 30
		bodyModel[432] = new ModelRendererTurbo(this, 79, 414, textureX, textureY); // Shape 35
		bodyModel[433] = new ModelRendererTurbo(this, 36, 412, textureX, textureY); // Shape 40
		bodyModel[434] = new ModelRendererTurbo(this, 36, 412, textureX, textureY); // Shape 9
		bodyModel[435] = new ModelRendererTurbo(this, 289, 265, textureX, textureY); // Box 925
		bodyModel[436] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 926
		bodyModel[437] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 927
		bodyModel[438] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Box 928
		bodyModel[439] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 929
		bodyModel[440] = new ModelRendererTurbo(this, 353, 265, textureX, textureY); // Box 930
		bodyModel[441] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Box 931
		bodyModel[442] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 932
		bodyModel[443] = new ModelRendererTurbo(this, 209, 281, textureX, textureY); // Box 933
		bodyModel[444] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // Box 934
		bodyModel[445] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Box 935
		bodyModel[446] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 936
		bodyModel[447] = new ModelRendererTurbo(this, 409, 249, textureX, textureY); // Box 937
		bodyModel[448] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 938
		bodyModel[449] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Box 939
		bodyModel[450] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Box 940
		bodyModel[451] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 941
		bodyModel[452] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 942
		bodyModel[453] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Box 943
		bodyModel[454] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Box 944
		bodyModel[455] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Box 945
		bodyModel[456] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 946
		bodyModel[457] = new ModelRendererTurbo(this, 401, 273, textureX, textureY); // Box 947
		bodyModel[458] = new ModelRendererTurbo(this, 81, 281, textureX, textureY); // Box 948
		bodyModel[459] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Box 949
		bodyModel[460] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 950
		bodyModel[461] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 951
		bodyModel[462] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 952
		bodyModel[463] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 953
		bodyModel[464] = new ModelRendererTurbo(this, 353, 241, textureX, textureY); // Box 954
		bodyModel[465] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 955
		bodyModel[466] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 956
		bodyModel[467] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 957
		bodyModel[468] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 958
		bodyModel[469] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 959
		bodyModel[470] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Box 960
		bodyModel[471] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Box 961
		bodyModel[472] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 962
		bodyModel[473] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 963
		bodyModel[474] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 964
		bodyModel[475] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 965
		bodyModel[476] = new ModelRendererTurbo(this, 353, 241, textureX, textureY); // Box 966
		bodyModel[477] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 967
		bodyModel[478] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 968
		bodyModel[479] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 969
		bodyModel[480] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 970
		bodyModel[481] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 971
		bodyModel[482] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Box 972
		bodyModel[483] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Box 973
		bodyModel[484] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 974
		bodyModel[485] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 975
		bodyModel[486] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 976
		bodyModel[487] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 977
		bodyModel[488] = new ModelRendererTurbo(this, 353, 241, textureX, textureY); // Box 978
		bodyModel[489] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 979
		bodyModel[490] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 980
		bodyModel[491] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 981
		bodyModel[492] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 982
		bodyModel[493] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 983
		bodyModel[494] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Box 984
		bodyModel[495] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 985
		bodyModel[496] = new ModelRendererTurbo(this, 401, 289, textureX, textureY); // Box 986
		bodyModel[497] = new ModelRendererTurbo(this, 65, 273, textureX, textureY); // Box 987
		bodyModel[498] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 988
		bodyModel[499] = new ModelRendererTurbo(this, 489, 265, textureX, textureY); // Box 989

		bodyModel[0].addShapeBox(0F, 0F, 0F, 112, 8, 40, 0F,192F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 192F, 0F, 0F, 192F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 192F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(33F, -25.5F, -20F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 117, 8, 40, 0F,192F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 192F, 0F, 0F, 192F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 192F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(33F, -17.5F, -20F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 17, 8, 40, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[2].setRotationPoint(150F, -17.5F, -20F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 134, 10, 40, 0F,192F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 192F, 0F, 0F, 192F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 192F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(33F, -9.5F, -20F);

		bodyModel[4].addBox(0F, -1.5F, 0F, 1, 6, 8, 0F); // Box 0
		bodyModel[4].setRotationPoint(147.25F, -21F, -4F);
		bodyModel[4].rotateAngleZ = 0.55850536F;

		bodyModel[5].addShapeBox(1F, -1.5F, 0F, 1, 6, 8, 0F,0F, -0.25F, -0.25F, 0F, -2.875F, -1.75F, 0F, -2.875F, -1.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.875F, -1.75F, 0F, -2.875F, -1.75F, 0F, -0.25F, -0.25F); // Box 1
		bodyModel[5].setRotationPoint(147.25F, -21F, -4F);
		bodyModel[5].rotateAngleZ = 0.55850536F;

		bodyModel[6].addShapeBox(-0.5F, -1F, -3F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 2
		bodyModel[6].setRotationPoint(146.5F, -21F, 10.5F);

		bodyModel[7].addShapeBox(-0.5F, -3F, -3F, 4, 2, 6, 0F,0.25F, 0F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0.25F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 3
		bodyModel[7].setRotationPoint(146.5F, -21F, 10.5F);

		bodyModel[8].addShapeBox(-0.5F, 1F, -3F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, 0F, -2F); // Box 4
		bodyModel[8].setRotationPoint(146.5F, -21F, 10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 12
		bodyModel[9].setRotationPoint(151.25F, -22.5F, -13F);

		bodyModel[10].addShapeBox(0F, -2F, 0F, 1, 2, 5, 0F,0F, -0.25F, -1.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(151.25F, -22.5F, -13F);

		bodyModel[11].addShapeBox(0F, 2F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -1.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, -0.25F, -1.5F); // Box 14
		bodyModel[11].setRotationPoint(151.25F, -22.5F, -13F);

		bodyModel[12].addShapeBox(-2F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 16
		bodyModel[12].setRotationPoint(151.25F, -22.5F, -13F);

		bodyModel[13].addShapeBox(-2F, -2F, 0F, 2, 2, 5, 0F,0F, -1F, -2F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 17
		bodyModel[13].setRotationPoint(151.25F, -22.5F, -13F);

		bodyModel[14].addShapeBox(-2F, 2F, 0F, 2, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -1F, -2F); // Box 18
		bodyModel[14].setRotationPoint(151.25F, -22.5F, -13F);

		bodyModel[15].addShapeBox(-2F, 0F, 2F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[15].setRotationPoint(151.25F, -22.5F, -13F);
		bodyModel[15].rotateAngleZ = -0.34906585F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 33
		bodyModel[16].setRotationPoint(148.5F, -24F, -16.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[17].setRotationPoint(148.5F, -22F, -16.5F);
		bodyModel[17].rotateAngleZ = -0.2268928F;

		bodyModel[18].addShapeBox(-7F, 0F, 0.5F, 8, 1, 1, 0F,-0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 35
		bodyModel[18].setRotationPoint(148.5F, -22F, -16.5F);
		bodyModel[18].rotateAngleZ = -1.04719755F;

		bodyModel[19].addShapeBox(-2F, 0F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[19].setRotationPoint(145.16F, -27.29F, -16.5F);

		bodyModel[20].addShapeBox(-2F, 0F, 0.5F, 2, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 37
		bodyModel[20].setRotationPoint(143.16F, -27.29F, -16.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 38
		bodyModel[21].setRotationPoint(140F, -27.5F, -8.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 76
		bodyModel[22].setRotationPoint(134F, -26.25F, 4.5F);

		bodyModel[23].addShapeBox(-4F, 0.5F, -0.5F, 4, 1, 13, 0F,0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4.5F); // Box 77
		bodyModel[23].setRotationPoint(134F, -26.25F, 4.5F);

		bodyModel[24].addShapeBox(-4F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 78
		bodyModel[24].setRotationPoint(134F, -26.25F, 4.5F);

		bodyModel[25].addBox(0F, 0.5F, -0.5F, 4, 1, 13, 0F); // Box 79
		bodyModel[25].setRotationPoint(134F, -26.25F, 4.5F);

		bodyModel[26].addShapeBox(4F, 0.5F, -0.5F, 4, 1, 13, 0F,0F, 0F, 0F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0F, 0F, 0F); // Box 80
		bodyModel[26].setRotationPoint(134F, -26.25F, 4.5F);

		bodyModel[27].addShapeBox(4F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 81
		bodyModel[27].setRotationPoint(134F, -26.25F, 4.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 134, 1, 14, 0F,192F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 192F, 0F, 0F, 192F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 192F, 0F, 0F); // Box 178
		bodyModel[28].setRotationPoint(31F, -20.5F, -34F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[29].setRotationPoint(165F, -20.5F, -34F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -2F, 1F, -1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[30].setRotationPoint(148F, -19.5F, -21F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 2.5F, 1F, -1F, -4.5F, 1F, -1F, -4F, 0F, 0F, 2F, 0F, 0F); // Box 181
		bodyModel[31].setRotationPoint(165F, -19.5F, -21F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 182
		bodyModel[32].setRotationPoint(142F, -20.75F, -33.75F);

		bodyModel[33].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 183
		bodyModel[33].setRotationPoint(142F, -20.75F, -20.75F);

		bodyModel[34].addShapeBox(0F, -4F, -14F, 1, 1, 13, 0F,-0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 184
		bodyModel[34].setRotationPoint(142F, -20.75F, -19.75F);

		bodyModel[35].addShapeBox(0F, -4F, -14F, 1, 1, 13, 0F,-0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 185
		bodyModel[35].setRotationPoint(115F, -20.75F, -19.75F);

		bodyModel[36].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 186
		bodyModel[36].setRotationPoint(115F, -20.75F, -20.75F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 187
		bodyModel[37].setRotationPoint(115F, -20.75F, -33.75F);

		bodyModel[38].addShapeBox(0F, -4F, -14F, 1, 1, 13, 0F,-0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 188
		bodyModel[38].setRotationPoint(91F, -20.75F, -19.75F);

		bodyModel[39].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 189
		bodyModel[39].setRotationPoint(91F, -20.75F, -20.75F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 190
		bodyModel[40].setRotationPoint(91F, -20.75F, -33.75F);

		bodyModel[41].addShapeBox(0F, -4F, -14F, 1, 1, 13, 0F,-0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 191
		bodyModel[41].setRotationPoint(62F, -20.75F, -19.75F);

		bodyModel[42].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 192
		bodyModel[42].setRotationPoint(62F, -20.75F, -20.75F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 193
		bodyModel[43].setRotationPoint(62F, -20.75F, -33.75F);

		bodyModel[44].addShapeBox(0F, -4F, -14F, 1, 1, 13, 0F,-0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 194
		bodyModel[44].setRotationPoint(35F, -20.75F, -19.75F);

		bodyModel[45].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 195
		bodyModel[45].setRotationPoint(35F, -20.75F, -20.75F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 196
		bodyModel[46].setRotationPoint(35F, -20.75F, -33.75F);

		bodyModel[47].addShapeBox(0F, -1F, 0F, 1, 2, 14, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[47].setRotationPoint(163.75F, -20.75F, -33.75F);

		bodyModel[48].addShapeBox(0F, 1F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 198
		bodyModel[48].setRotationPoint(163.75F, -20.75F, -20.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 134, 1, 14, 0F,192F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 192F, 0F, 0F, 192F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 192F, 0F, 0F); // Box 199
		bodyModel[49].setRotationPoint(31F, -20.5F, 20F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[50].setRotationPoint(165F, -20.5F, 20F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, -1F, 0F, 1F, -1F); // Box 201
		bodyModel[51].setRotationPoint(148F, -19.5F, 20F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -4.5F, 1F, -1F, 2.5F, 1F, -1F); // Box 202
		bodyModel[52].setRotationPoint(165F, -19.5F, 20F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 203
		bodyModel[53].setRotationPoint(142F, -20.75F, 19.75F);

		bodyModel[54].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 204
		bodyModel[54].setRotationPoint(142F, -20.75F, 19.75F);

		bodyModel[55].addShapeBox(0F, -4F, 0F, 1, 1, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2.5F, -0.5F, 3F, -2.5F); // Box 205
		bodyModel[55].setRotationPoint(142F, -20.75F, 20.75F);

		bodyModel[56].addShapeBox(0F, -4F, 0F, 1, 1, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2.5F, -0.5F, 3F, -2.5F); // Box 206
		bodyModel[56].setRotationPoint(115F, -20.75F, 20.75F);

		bodyModel[57].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 207
		bodyModel[57].setRotationPoint(115F, -20.75F, 19.75F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 208
		bodyModel[58].setRotationPoint(115F, -20.75F, 19.75F);

		bodyModel[59].addShapeBox(0F, -4F, 0F, 1, 1, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2.5F, -0.5F, 3F, -2.5F); // Box 209
		bodyModel[59].setRotationPoint(91F, -20.75F, 20.75F);

		bodyModel[60].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 210
		bodyModel[60].setRotationPoint(91F, -20.75F, 19.75F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 15, 0F); // Box 211
		bodyModel[61].setRotationPoint(91F, -20.75F, 19.75F);

		bodyModel[62].addShapeBox(0F, -4F, 0F, 1, 1, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2.5F, -0.5F, 3F, -2.5F); // Box 212
		bodyModel[62].setRotationPoint(62F, -20.75F, 20.75F);

		bodyModel[63].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 213
		bodyModel[63].setRotationPoint(62F, -20.75F, 19.75F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 214
		bodyModel[64].setRotationPoint(62F, -20.75F, 19.75F);

		bodyModel[65].addShapeBox(0F, -4F, 0F, 1, 1, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2.5F, -0.5F, 3F, -2.5F); // Box 215
		bodyModel[65].setRotationPoint(35F, -20.75F, 20.75F);

		bodyModel[66].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 216
		bodyModel[66].setRotationPoint(35F, -20.75F, 19.75F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 217
		bodyModel[67].setRotationPoint(35F, -20.75F, 19.75F);

		bodyModel[68].addShapeBox(0F, -1F, 0F, 1, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[68].setRotationPoint(163.75F, -20.75F, 19.75F);

		bodyModel[69].addShapeBox(0F, 1F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 219
		bodyModel[69].setRotationPoint(163.75F, -20.75F, 19.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[70].setRotationPoint(151F, -18F, 15F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[71].setRotationPoint(151.5F, -19.5F, 15.5F);

		bodyModel[72].addShapeBox(-0.5F, -6F, -0.5F, 1, 6, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[72].setRotationPoint(153F, -19F, 17F);

		bodyModel[73].addBox(0F, 0F, 0F, 20, 2, 4, 0F); // Box 0
		bodyModel[73].setRotationPoint(94F, -23.65F, -29F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[74].setRotationPoint(94F, -24.65F, -29F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[75].setRotationPoint(94F, -21.65F, -29F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 3
		bodyModel[76].setRotationPoint(97.5F, -24.65F, -29F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 4
		bodyModel[77].setRotationPoint(97.5F, -23.65F, -29F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 5
		bodyModel[78].setRotationPoint(97.5F, -21.65F, -29F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 6
		bodyModel[79].setRotationPoint(109.5F, -21.65F, -29F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 7
		bodyModel[80].setRotationPoint(109.5F, -23.65F, -29F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 8
		bodyModel[81].setRotationPoint(109.5F, -24.65F, -29F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 9
		bodyModel[82].setRotationPoint(97.5F, -21.5F, -28.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 10
		bodyModel[83].setRotationPoint(109.5F, -21.5F, -28.5F);

		bodyModel[84].addShapeBox(0F, 2F, 0F, 25, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[84].setRotationPoint(64.5F, -24.5F, -33.75F);

		bodyModel[85].addShapeBox(0F, 0F, 8F, 25, 3, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[85].setRotationPoint(64.5F, -25.5F, -33.75F);

		bodyModel[86].addShapeBox(0F, 0F, -9F, 25, 3, 9, 0F,-0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 13
		bodyModel[86].setRotationPoint(64.5F, -25.5F, -24.75F);

		bodyModel[87].addShapeBox(0F, 0F, -9F, 25, 3, 9, 0F,-0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 14
		bodyModel[87].setRotationPoint(36.5F, -25.5F, -24.75F);

		bodyModel[88].addShapeBox(0F, 0F, 8F, 25, 3, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[88].setRotationPoint(36.5F, -25.5F, -33.75F);

		bodyModel[89].addShapeBox(0F, 2F, 0F, 25, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[89].setRotationPoint(36.5F, -24.5F, -33.75F);

		bodyModel[90].addShapeBox(0F, 2F, 0F, 25, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[90].setRotationPoint(64.5F, -24.5F, 20.75F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 25, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 18
		bodyModel[91].setRotationPoint(64.5F, -25.5F, 20.75F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 25, 3, 9, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 19
		bodyModel[92].setRotationPoint(64.5F, -25.5F, 24.75F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 25, 3, 9, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 20
		bodyModel[93].setRotationPoint(36.5F, -25.5F, 24.75F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 25, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 21
		bodyModel[94].setRotationPoint(36.5F, -25.5F, 20.75F);

		bodyModel[95].addShapeBox(0F, 2F, 0F, 25, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[95].setRotationPoint(36.5F, -24.5F, 20.75F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[96].setRotationPoint(94F, -24.65F, -34F);

		bodyModel[97].addBox(0F, 0F, 0F, 20, 2, 4, 0F); // Box 24
		bodyModel[97].setRotationPoint(94F, -23.65F, -34F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 25
		bodyModel[98].setRotationPoint(94F, -21.65F, -34F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 26
		bodyModel[99].setRotationPoint(109.5F, -21.65F, -34F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 27
		bodyModel[100].setRotationPoint(109.5F, -21.5F, -33.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 28
		bodyModel[101].setRotationPoint(109.5F, -23.65F, -34F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 29
		bodyModel[102].setRotationPoint(109.5F, -24.65F, -34F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 30
		bodyModel[103].setRotationPoint(97.5F, -21.5F, -33.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 31
		bodyModel[104].setRotationPoint(97.5F, -21.65F, -34F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 32
		bodyModel[105].setRotationPoint(97.5F, -23.65F, -34F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 33
		bodyModel[106].setRotationPoint(97.5F, -24.65F, -34F);

		bodyModel[107].addShapeBox(-4F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 0
		bodyModel[107].setRotationPoint(-150F, -26F, 5F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 1
		bodyModel[108].setRotationPoint(-150F, -26F, 5F);

		bodyModel[109].addShapeBox(4F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 2
		bodyModel[109].setRotationPoint(-150F, -26F, 5F);

		bodyModel[110].addShapeBox(-4F, 0F, -12F, 4, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 3
		bodyModel[110].setRotationPoint(-150F, -26F, -5F);

		bodyModel[111].addBox(0F, 0F, -12F, 4, 1, 12, 0F); // Box 4
		bodyModel[111].setRotationPoint(-150F, -26F, -5F);

		bodyModel[112].addShapeBox(4F, 0F, -12F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 5
		bodyModel[112].setRotationPoint(-150F, -26F, -5F);

		bodyModel[113].addBox(0F, 0F, 0F, 22, 1, 22, 0F); // Box 6
		bodyModel[113].setRotationPoint(-130F, -26F, -11F);

		bodyModel[114].addShapeBox(-1F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 7
		bodyModel[114].setRotationPoint(-130F, -26F, -11F);

		bodyModel[115].addShapeBox(22F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 8
		bodyModel[115].setRotationPoint(-130F, -26F, -11F);

		bodyModel[116].addShapeBox(-8F, -2F, -8F, 16, 2, 16, 0F,-3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[116].setRotationPoint(-119F, -26F, 0F);

		bodyModel[117].addShapeBox(-5F, -3F, -5F, 10, 1, 10, 0F,-3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[117].setRotationPoint(-119F, -26F, 0F);

		bodyModel[118].addBox(0F, 0F, 0F, 25, 1, 4, 0F); // Box 11
		bodyModel[118].setRotationPoint(-131.5F, -25.75F, -17F);

		bodyModel[119].addShapeBox(0F, -1F, 0F, 25, 1, 4, 0F,-0.2F, -0.25F, -1F, -0.2F, -0.25F, -1F, -0.2F, -0.25F, -1F, -0.2F, -0.25F, -1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 12
		bodyModel[119].setRotationPoint(-131.5F, -25.75F, -17F);

		bodyModel[120].addShapeBox(0F, -1F, 0F, 1, 1, 4, 0F,-0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 13
		bodyModel[120].setRotationPoint(-131.75F, -25.75F, -17F);

		bodyModel[121].addShapeBox(24.45F, -1F, 0F, 1, 1, 4, 0F,-0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 14
		bodyModel[121].setRotationPoint(-131.75F, -25.75F, -17F);

		bodyModel[122].addShapeBox(0F, -1F, 0F, 1, 1, 4, 0F,-0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 15
		bodyModel[122].setRotationPoint(-124.75F, -25.75F, -17F);

		bodyModel[123].addShapeBox(0F, -1F, 0F, 1, 1, 4, 0F,-0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 16
		bodyModel[123].setRotationPoint(-115.25F, -25.75F, -17F);

		bodyModel[124].addBox(0F, 0F, 0F, 25, 1, 4, 0F); // Box 17
		bodyModel[124].setRotationPoint(-131.5F, -25.75F, 13F);

		bodyModel[125].addShapeBox(0F, -1F, 0F, 25, 1, 4, 0F,-0.2F, -0.25F, -1F, -0.2F, -0.25F, -1F, -0.2F, -0.25F, -1F, -0.2F, -0.25F, -1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 18
		bodyModel[125].setRotationPoint(-131.5F, -25.75F, 13F);

		bodyModel[126].addShapeBox(0F, -1F, 0F, 1, 1, 4, 0F,-0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 19
		bodyModel[126].setRotationPoint(-131.75F, -25.75F, 13F);

		bodyModel[127].addShapeBox(24.45F, -1F, 0F, 1, 1, 4, 0F,-0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 20
		bodyModel[127].setRotationPoint(-131.75F, -25.75F, 13F);

		bodyModel[128].addShapeBox(0F, -1F, 0F, 1, 1, 4, 0F,-0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 21
		bodyModel[128].setRotationPoint(-124.75F, -25.75F, 13F);

		bodyModel[129].addShapeBox(0F, -1F, 0F, 1, 1, 4, 0F,-0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 22
		bodyModel[129].setRotationPoint(-115.25F, -25.75F, 13F);

		bodyModel[130].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 23
		bodyModel[130].setRotationPoint(-136.5F, -26F, -10.5F);

		bodyModel[131].addShapeBox(0F, 0F, -4F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[131].setRotationPoint(-136F, -28F, -7F);

		bodyModel[132].addShapeBox(0F, 0F, -8F, 3, 2, 4, 0F,0F, 0F, -2.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[132].setRotationPoint(-136F, -28F, -7F);

		bodyModel[133].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 26
		bodyModel[133].setRotationPoint(-136.5F, -26F, 6.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[134].setRotationPoint(-136F, -28F, 7F);

		bodyModel[135].addShapeBox(0F, 0F, 4F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -2.5F); // Box 28
		bodyModel[135].setRotationPoint(-136F, -28F, 7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 30
		bodyModel[136].setRotationPoint(-137F, -25.6F, -17.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 31
		bodyModel[137].setRotationPoint(-142F, -25.6F, -17.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 32
		bodyModel[138].setRotationPoint(-157F, -25.6F, -17.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 33
		bodyModel[139].setRotationPoint(-137F, -25.6F, 15.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 34
		bodyModel[140].setRotationPoint(-142F, -25.6F, 15.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 35
		bodyModel[141].setRotationPoint(-157F, -25.6F, 15.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[142].setRotationPoint(163.5F, -7F, -15F);

		bodyModel[143].addShapeBox(1F, -0.5F, 1F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 37
		bodyModel[143].setRotationPoint(163.5F, -7F, -15F);
		bodyModel[143].rotateAngleZ = -0.29670597F;

		bodyModel[144].addShapeBox(1.7F, -0.2F, 0F, 1, 1, 4, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 38
		bodyModel[144].setRotationPoint(163.5F, -7F, -15F);
		bodyModel[144].rotateAngleZ = -0.38397244F;

		bodyModel[145].addShapeBox(1.2F, 0.5F, 0.1F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[145].setRotationPoint(163.5F, -7F, -15F);
		bodyModel[145].rotateAngleZ = 0.08726646F;

		bodyModel[146].addShapeBox(2.2F, 0.5F, 0.1F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[146].setRotationPoint(163.5F, -7F, -15F);
		bodyModel[146].rotateAngleZ = 0.08726646F;

		bodyModel[147].addShapeBox(1.2F, 4.5F, 0F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F); // Box 41
		bodyModel[147].setRotationPoint(163.5F, -7F, -15F);
		bodyModel[147].rotateAngleZ = 0.08726646F;

		bodyModel[148].addShapeBox(1.2F, 0.5F, 2.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[148].setRotationPoint(163.5F, -7F, -15F);
		bodyModel[148].rotateAngleZ = 0.08726646F;

		bodyModel[149].addShapeBox(2.2F, 0.5F, 2.9F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[149].setRotationPoint(163.5F, -7F, -15F);
		bodyModel[149].rotateAngleZ = 0.08726646F;

		bodyModel[150].addShapeBox(2.2F, 0.5F, -1.1F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[150].setRotationPoint(163.5F, -7F, 15F);
		bodyModel[150].rotateAngleZ = 0.08726646F;

		bodyModel[151].addShapeBox(1.2F, 0.5F, -1.1F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[151].setRotationPoint(163.5F, -7F, 15F);
		bodyModel[151].rotateAngleZ = 0.08726646F;

		bodyModel[152].addShapeBox(1.2F, 4.5F, -4F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F); // Box 46
		bodyModel[152].setRotationPoint(163.5F, -7F, 15F);
		bodyModel[152].rotateAngleZ = 0.08726646F;

		bodyModel[153].addShapeBox(1.2F, 0.5F, -3.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[153].setRotationPoint(163.5F, -7F, 15F);
		bodyModel[153].rotateAngleZ = 0.08726646F;

		bodyModel[154].addShapeBox(2.2F, 0.5F, -3.9F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[154].setRotationPoint(163.5F, -7F, 15F);
		bodyModel[154].rotateAngleZ = 0.08726646F;

		bodyModel[155].addShapeBox(1F, -0.5F, -3F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 49
		bodyModel[155].setRotationPoint(163.5F, -7F, 15F);
		bodyModel[155].rotateAngleZ = -0.29670597F;

		bodyModel[156].addShapeBox(0F, 0F, -4F, 2, 2, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[156].setRotationPoint(163.5F, -7F, 15F);

		bodyModel[157].addShapeBox(1.7F, -0.2F, -4F, 1, 1, 4, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 51
		bodyModel[157].setRotationPoint(163.5F, -7F, 15F);
		bodyModel[157].rotateAngleZ = -0.38397244F;

		bodyModel[158].addBox(0F, 0.25F, 0F, 1, 7, 39, 0F); // Box 69
		bodyModel[158].setRotationPoint(165F, -9F, -19.5F);
		bodyModel[158].rotateAngleZ = -0.45378561F;

		bodyModel[159].addShapeBox(-2.75F, -4F, 0F, 4, 4, 39, 0F,0F, -0.875F, 0.125F, -0.125F, -0.375F, 0.125F, -0.125F, -0.375F, 0.125F, 0F, -0.875F, 0.125F, 0F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 70
		bodyModel[159].setRotationPoint(165F, -9F, -19.5F);
		bodyModel[159].rotateAngleZ = -0.45378561F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 134, 1, 1, 0F,0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F); // Box 76
		bodyModel[160].setRotationPoint(31F, -21F, -34.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.25F, 0F, -1.375F, -0.25F, 0F, -1.375F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.375F, 0.875F, -0.25F, -0.375F, 0.875F, -0.25F, 0F, -0.125F, -0.25F); // Box 77
		bodyModel[161].setRotationPoint(165F, -21F, -34.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 134, 1, 1, 0F,0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F); // Box 78
		bodyModel[162].setRotationPoint(31F, -21F, 33.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.25F, 0F, -1.375F, -0.25F, 0F, -1.375F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.375F, 0.875F, -0.25F, -0.375F, 0.875F, -0.25F, 0F, -0.125F, -0.25F); // Box 79
		bodyModel[163].setRotationPoint(165F, -21F, 33.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 87
		bodyModel[164].setRotationPoint(148F, 1F, -21.5F);
		bodyModel[164].rotateAngleZ = 0.40142573F;

		bodyModel[165].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 88
		bodyModel[165].setRotationPoint(147.5F, 2F, -21.5F);

		bodyModel[166].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 90
		bodyModel[166].setRotationPoint(127F, 2F, -21.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 91
		bodyModel[167].setRotationPoint(127.5F, 1F, -21.5F);
		bodyModel[167].rotateAngleZ = 0.40142573F;

		bodyModel[168].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 94
		bodyModel[168].setRotationPoint(107.25F, 2F, -21.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 95
		bodyModel[169].setRotationPoint(107.75F, 1F, -21.5F);
		bodyModel[169].rotateAngleZ = 0.40142573F;

		bodyModel[170].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 98
		bodyModel[170].setRotationPoint(87.25F, 2F, -21.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 99
		bodyModel[171].setRotationPoint(87.75F, 1F, -21.5F);
		bodyModel[171].rotateAngleZ = 0.40142573F;

		bodyModel[172].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 102
		bodyModel[172].setRotationPoint(68.5F, 2F, -21.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 103
		bodyModel[173].setRotationPoint(69F, 1F, -21.5F);
		bodyModel[173].rotateAngleZ = 0.40142573F;

		bodyModel[174].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 106
		bodyModel[174].setRotationPoint(51.5F, 2F, -21.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 107
		bodyModel[175].setRotationPoint(52F, 1F, -21.5F);
		bodyModel[175].rotateAngleZ = 0.40142573F;

		bodyModel[176].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 134
		bodyModel[176].setRotationPoint(148F, 1F, 20.5F);
		bodyModel[176].rotateAngleZ = 0.40142573F;

		bodyModel[177].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 135
		bodyModel[177].setRotationPoint(147.5F, 2F, 20.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 138
		bodyModel[178].setRotationPoint(127.5F, 1F, 20.5F);
		bodyModel[178].rotateAngleZ = 0.40142573F;

		bodyModel[179].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 140
		bodyModel[179].setRotationPoint(127F, 2F, 20.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 142
		bodyModel[180].setRotationPoint(107.75F, 1F, 20.5F);
		bodyModel[180].rotateAngleZ = 0.40142573F;

		bodyModel[181].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 144
		bodyModel[181].setRotationPoint(107.25F, 2F, 20.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 146
		bodyModel[182].setRotationPoint(87.75F, 1F, 20.5F);
		bodyModel[182].rotateAngleZ = 0.40142573F;

		bodyModel[183].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 148
		bodyModel[183].setRotationPoint(87.25F, 2F, 20.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 150
		bodyModel[184].setRotationPoint(69F, 1F, 20.5F);
		bodyModel[184].rotateAngleZ = 0.40142573F;

		bodyModel[185].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 151
		bodyModel[185].setRotationPoint(68.5F, 2F, 20.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 154
		bodyModel[186].setRotationPoint(52F, 1F, 20.5F);
		bodyModel[186].rotateAngleZ = 0.40142573F;

		bodyModel[187].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 156
		bodyModel[187].setRotationPoint(51.5F, 2F, 20.5F);

		bodyModel[188].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 157
		bodyModel[188].setRotationPoint(147.5F, -4F, -20.5F);

		bodyModel[189].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[189].setRotationPoint(147.5F, -4F, -20.5F);

		bodyModel[190].addShapeBox(-2.5F, -5F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[190].setRotationPoint(147.5F, -4F, -20.5F);

		bodyModel[191].addShapeBox(-1.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[191].setRotationPoint(147.5F, -4F, -20.5F);

		bodyModel[192].addShapeBox(0.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[192].setRotationPoint(147.5F, -4F, -20.5F);

		bodyModel[193].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[193].setRotationPoint(147.5F, -4F, -20.5F);

		bodyModel[194].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[194].setRotationPoint(127F, -4F, -20.5F);

		bodyModel[195].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[195].setRotationPoint(127F, -4F, -20.5F);

		bodyModel[196].addShapeBox(-2.5F, -5F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[196].setRotationPoint(127F, -4F, -20.5F);

		bodyModel[197].addShapeBox(0.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[197].setRotationPoint(127F, -4F, -20.5F);

		bodyModel[198].addShapeBox(-1.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[198].setRotationPoint(127F, -4F, -20.5F);

		bodyModel[199].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 169
		bodyModel[199].setRotationPoint(127F, -4F, -20.5F);

		bodyModel[200].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[200].setRotationPoint(107.25F, -4F, -20.5F);

		bodyModel[201].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[201].setRotationPoint(107.25F, -4F, -20.5F);

		bodyModel[202].addShapeBox(-2.5F, -5F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[202].setRotationPoint(107.25F, -4F, -20.5F);

		bodyModel[203].addShapeBox(0.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[203].setRotationPoint(107.25F, -4F, -20.5F);

		bodyModel[204].addShapeBox(-1.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[204].setRotationPoint(107.25F, -4F, -20.5F);

		bodyModel[205].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 175
		bodyModel[205].setRotationPoint(107.25F, -4F, -20.5F);

		bodyModel[206].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[206].setRotationPoint(87.25F, -4F, -20.5F);

		bodyModel[207].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[207].setRotationPoint(87.25F, -4F, -20.5F);

		bodyModel[208].addShapeBox(-2.5F, -5F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[208].setRotationPoint(87.25F, -4F, -20.5F);

		bodyModel[209].addShapeBox(0.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[209].setRotationPoint(87.25F, -4F, -20.5F);

		bodyModel[210].addShapeBox(-1.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[210].setRotationPoint(87.25F, -4F, -20.5F);

		bodyModel[211].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 181
		bodyModel[211].setRotationPoint(87.25F, -4F, -20.5F);

		bodyModel[212].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[212].setRotationPoint(68.5F, -4F, -20.5F);

		bodyModel[213].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[213].setRotationPoint(68.5F, -4F, -20.5F);

		bodyModel[214].addShapeBox(-2.5F, -5F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[214].setRotationPoint(68.5F, -4F, -20.5F);

		bodyModel[215].addShapeBox(0.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[215].setRotationPoint(68.5F, -4F, -20.5F);

		bodyModel[216].addShapeBox(-1.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[216].setRotationPoint(68.5F, -4F, -20.5F);

		bodyModel[217].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 187
		bodyModel[217].setRotationPoint(68.5F, -4F, -20.5F);

		bodyModel[218].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[218].setRotationPoint(51.5F, -4F, -20.5F);

		bodyModel[219].addShapeBox(-2.5F, -3F, -1F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[219].setRotationPoint(51.5F, -4F, -20.5F);

		bodyModel[220].addShapeBox(-2.5F, -5F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[220].setRotationPoint(51.5F, -4F, -20.5F);

		bodyModel[221].addShapeBox(0.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[221].setRotationPoint(51.5F, -4F, -20.5F);

		bodyModel[222].addShapeBox(-1.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[222].setRotationPoint(51.5F, -4F, -20.5F);

		bodyModel[223].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 193
		bodyModel[223].setRotationPoint(51.5F, -4F, -20.5F);

		bodyModel[224].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 229
		bodyModel[224].setRotationPoint(107.25F, -4F, 20.5F);

		bodyModel[225].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 230
		bodyModel[225].setRotationPoint(127F, -4F, 20.5F);

		bodyModel[226].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 231
		bodyModel[226].setRotationPoint(147.5F, -4F, 20.5F);

		bodyModel[227].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 232
		bodyModel[227].setRotationPoint(147.5F, -4F, 22.5F);

		bodyModel[228].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[228].setRotationPoint(147.5F, -4F, 20.5F);

		bodyModel[229].addShapeBox(-2.5F, -5F, 1F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[229].setRotationPoint(147.5F, -4F, 18.5F);

		bodyModel[230].addShapeBox(0.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[230].setRotationPoint(147.5F, -4F, 21.5F);

		bodyModel[231].addShapeBox(-1.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[231].setRotationPoint(147.5F, -4F, 21.5F);

		bodyModel[232].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 237
		bodyModel[232].setRotationPoint(127F, -4F, 22.5F);

		bodyModel[233].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[233].setRotationPoint(127F, -4F, 20.5F);

		bodyModel[234].addShapeBox(-2.5F, -5F, 1F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[234].setRotationPoint(127F, -4F, 18.5F);

		bodyModel[235].addShapeBox(0.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[235].setRotationPoint(127F, -4F, 21.5F);

		bodyModel[236].addShapeBox(-1.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[236].setRotationPoint(127F, -4F, 21.5F);

		bodyModel[237].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[237].setRotationPoint(107.25F, -4F, 20.5F);

		bodyModel[238].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 243
		bodyModel[238].setRotationPoint(107.25F, -4F, 22.5F);

		bodyModel[239].addShapeBox(-2.5F, -5F, 1F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[239].setRotationPoint(107.25F, -4F, 18.5F);

		bodyModel[240].addShapeBox(0.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[240].setRotationPoint(107.25F, -4F, 21.5F);

		bodyModel[241].addShapeBox(-1.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[241].setRotationPoint(107.25F, -4F, 21.5F);

		bodyModel[242].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 247
		bodyModel[242].setRotationPoint(87.25F, -4F, 20.5F);

		bodyModel[243].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[243].setRotationPoint(87.25F, -4F, 20.5F);

		bodyModel[244].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 249
		bodyModel[244].setRotationPoint(87.25F, -4F, 22.5F);

		bodyModel[245].addShapeBox(-2.5F, -5F, 1F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[245].setRotationPoint(87.25F, -4F, 18.5F);

		bodyModel[246].addShapeBox(0.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[246].setRotationPoint(87.25F, -4F, 21.5F);

		bodyModel[247].addShapeBox(-1.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[247].setRotationPoint(87.25F, -4F, 21.5F);

		bodyModel[248].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 253
		bodyModel[248].setRotationPoint(68.5F, -4F, 20.5F);

		bodyModel[249].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 254
		bodyModel[249].setRotationPoint(68.5F, -4F, 22.5F);

		bodyModel[250].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[250].setRotationPoint(68.5F, -4F, 20.5F);

		bodyModel[251].addShapeBox(-2.5F, -5F, 1F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[251].setRotationPoint(68.5F, -4F, 18.5F);

		bodyModel[252].addShapeBox(-1.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[252].setRotationPoint(68.5F, -4F, 21.5F);

		bodyModel[253].addShapeBox(0.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[253].setRotationPoint(68.5F, -4F, 21.5F);

		bodyModel[254].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[254].setRotationPoint(51.5F, -4F, 22.5F);

		bodyModel[255].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[255].setRotationPoint(51.5F, -4F, 20.5F);

		bodyModel[256].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 261
		bodyModel[256].setRotationPoint(51.5F, -4F, 20.5F);

		bodyModel[257].addShapeBox(-2.5F, -5F, 1F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[257].setRotationPoint(51.5F, -4F, 18.5F);

		bodyModel[258].addShapeBox(-1.5F, -5F, -1F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[258].setRotationPoint(51.5F, -4F, 21.5F);

		bodyModel[259].addShapeBox(0.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[259].setRotationPoint(51.5F, -4F, 21.5F);

		bodyModel[260].addShapeBox(-1.5F, -0.5F, -6.5F, 3, 1, 8, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 331
		bodyModel[260].setRotationPoint(161F, -8.5F, -21.5F);

		bodyModel[261].addShapeBox(-1F, -6.5F, -0.5F, 2, 6, 1, 0F,0F, 0F, 0.3F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 332
		bodyModel[261].setRotationPoint(161F, -8.5F, -21.5F);
		bodyModel[261].rotateAngleZ = 0.17453293F;

		bodyModel[262].addShapeBox(-10F, -6.5F, -0.5F, 9, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 333
		bodyModel[262].setRotationPoint(161F, -8.5F, -21.5F);
		bodyModel[262].rotateAngleZ = 0.17453293F;

		bodyModel[263].addShapeBox(-7.5F, -7.5F, -0.6F, 3, 4, 2, 0F,0F, -0.75F, 0.55F, 0F, -0.75F, 0.55F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.75F, 0.55F, 0F, -0.75F, 0.55F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 334
		bodyModel[263].setRotationPoint(161F, -8.5F, -21.5F);
		bodyModel[263].rotateAngleZ = 0.17453293F;

		bodyModel[264].addShapeBox(-1.5F, -0.5F, -0.5F, 3, 1, 8, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 335
		bodyModel[264].setRotationPoint(161F, -8.5F, 20.5F);

		bodyModel[265].addShapeBox(-1F, -6.5F, -0.5F, 2, 6, 1, 0F,0F, 0F, 0.3F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 336
		bodyModel[265].setRotationPoint(161F, -8.5F, 20.5F);
		bodyModel[265].rotateAngleZ = 0.17453293F;

		bodyModel[266].addShapeBox(-10F, -6.5F, -0.5F, 9, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 337
		bodyModel[266].setRotationPoint(161F, -8.5F, 20.5F);
		bodyModel[266].rotateAngleZ = 0.17453293F;

		bodyModel[267].addShapeBox(-7.5F, -7.5F, -0.6F, 3, 4, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.75F, 0.55F, 0F, -0.75F, 0.55F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.75F, 0.55F, 0F, -0.75F, 0.55F); // Box 338
		bodyModel[267].setRotationPoint(161F, -8.5F, 19.5F);
		bodyModel[267].rotateAngleZ = 0.17453293F;

		bodyModel[268].addShapeBox(-1.5F, -1.5F, -6.5F, 3, 1, 8, 0F,-1F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 351
		bodyModel[268].setRotationPoint(161F, -8.5F, -21.5F);

		bodyModel[269].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 1, 8, 0F,-1F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 352
		bodyModel[269].setRotationPoint(161F, -8.5F, 20.5F);

		bodyModel[270].addShapeBox(-1.5F, 0.5F, -0.5F, 3, 1, 8, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0.3F); // Box 353
		bodyModel[270].setRotationPoint(161F, -8.5F, 20.5F);

		bodyModel[271].addShapeBox(-1.5F, 0.5F, -6.5F, 3, 1, 8, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0.3F); // Box 354
		bodyModel[271].setRotationPoint(161F, -8.5F, -21.5F);

		bodyModel[272].addShape3D(18F, -18F, 0F, new Shape2D(new Coord2D[] { new Coord2D(36, 12, 36, 12), new Coord2D(36, 24, 36, 24), new Coord2D(25, 36, 25, 36), new Coord2D(13, 36, 13, 36), new Coord2D(0, 24, 0, 24), new Coord2D(0, 13, 0, 13), new Coord2D(13, 0, 13, 0), new Coord2D(24, 0, 24, 0) }), 19, 36, 36, 117, 19, ModelRendererTurbo.MR_FRONT, new float[] {17 ,11 ,19 ,11 ,18 ,12 ,17 ,12}); // Shape 11
		bodyModel[272].setRotationPoint(1.5F, -25.5F, 0F);
		bodyModel[272].rotateAngleX = -1.57079633F;

		bodyModel[273].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 85
		bodyModel[273].setRotationPoint(158F, -2F, -20F);

		bodyModel[274].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 86
		bodyModel[274].setRotationPoint(147.5F, 2F, -20F);

		bodyModel[275].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 89
		bodyModel[275].setRotationPoint(137.5F, -2F, -20F);

		bodyModel[276].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 92
		bodyModel[276].setRotationPoint(127F, 2F, -20F);

		bodyModel[277].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 93
		bodyModel[277].setRotationPoint(117.75F, -2F, -20F);

		bodyModel[278].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 96
		bodyModel[278].setRotationPoint(107.25F, 2F, -20F);

		bodyModel[279].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 97
		bodyModel[279].setRotationPoint(97.75F, -2F, -20F);

		bodyModel[280].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 100
		bodyModel[280].setRotationPoint(87.25F, 2F, -20F);

		bodyModel[281].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 101
		bodyModel[281].setRotationPoint(79F, -2F, -20F);

		bodyModel[282].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 104
		bodyModel[282].setRotationPoint(68.5F, 2F, -20F);

		bodyModel[283].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 105
		bodyModel[283].setRotationPoint(62F, -2F, -20F);

		bodyModel[284].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 108
		bodyModel[284].setRotationPoint(51.5F, 2F, -20F);

		bodyModel[285].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 133
		bodyModel[285].setRotationPoint(158F, -2F, 20F);

		bodyModel[286].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 136
		bodyModel[286].setRotationPoint(147.5F, 2F, 20F);

		bodyModel[287].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 1, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 137
		bodyModel[287].setRotationPoint(137.5F, -2F, 20F);

		bodyModel[288].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 139
		bodyModel[288].setRotationPoint(127F, 2F, 20F);

		bodyModel[289].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 141
		bodyModel[289].setRotationPoint(117.75F, -2F, 20F);

		bodyModel[290].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 143
		bodyModel[290].setRotationPoint(107.25F, 2F, 20F);

		bodyModel[291].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 145
		bodyModel[291].setRotationPoint(97.75F, -2F, 20F);

		bodyModel[292].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 147
		bodyModel[292].setRotationPoint(87.25F, 2F, 20F);

		bodyModel[293].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 149
		bodyModel[293].setRotationPoint(79F, -2F, 20F);

		bodyModel[294].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 152
		bodyModel[294].setRotationPoint(68.5F, 2F, 20F);

		bodyModel[295].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 153
		bodyModel[295].setRotationPoint(62F, -2F, 20F);

		bodyModel[296].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 155
		bodyModel[296].setRotationPoint(51.5F, 2F, 20F);

		bodyModel[297].addShape3D(3F, -3F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 6, 6, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 10
		bodyModel[297].setRotationPoint(133.5F, -11.5F, -20F);

		bodyModel[298].addShape3D(3F, -3F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 6, 6, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 17
		bodyModel[298].setRotationPoint(93.5F, -11.5F, -20F);

		bodyModel[299].addShape3D(3F, -3F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 6, 6, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 21
		bodyModel[299].setRotationPoint(55.5F, -11.5F, -20F);

		bodyModel[300].addShape3D(3F, -3F, -6F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 6, 6, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 25
		bodyModel[300].setRotationPoint(133.5F, -11.5F, 20F);

		bodyModel[301].addShape3D(3F, -3F, -6F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 6, 6, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 30
		bodyModel[301].setRotationPoint(93.5F, -11.5F, 20F);

		bodyModel[302].addShape3D(3F, -3F, -6F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 6, 6, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 35
		bodyModel[302].setRotationPoint(55.5F, -11.5F, 20F);

		bodyModel[303].addShape3D(4.5F, -4F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 5, 8, 5), new Coord2D(6, 7, 6, 7), new Coord2D(3, 7, 3, 7), new Coord2D(1, 5, 1, 5), new Coord2D(1, 2, 1, 2) }), 1, 8, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 11
		bodyModel[303].setRotationPoint(146.5F, -21F, 10.5F);
		bodyModel[303].rotateAngleX = -0.56723201F;
		bodyModel[303].rotateAngleY = 1.57079633F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 683
		bodyModel[304].setRotationPoint(120F, -21.65F, -26F);

		bodyModel[305].addBox(0F, 0F, 0F, 20, 2, 4, 0F); // Box 684
		bodyModel[305].setRotationPoint(120F, -23.65F, -26F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 685
		bodyModel[306].setRotationPoint(120F, -24.65F, -26F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 686
		bodyModel[307].setRotationPoint(135.5F, -24.65F, -26F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 687
		bodyModel[308].setRotationPoint(135.5F, -23.65F, -26F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 688
		bodyModel[309].setRotationPoint(135.5F, -21.65F, -26F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 689
		bodyModel[310].setRotationPoint(123.5F, -21.65F, -26F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 690
		bodyModel[311].setRotationPoint(123.5F, -23.65F, -26F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 691
		bodyModel[312].setRotationPoint(123.5F, -24.65F, -26F);

		bodyModel[313].addShapeBox(3F, -1F, -3F, 2, 2, 6, 0F,-0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F); // Box 5
		bodyModel[313].setRotationPoint(146.5F, -21F, 10.5F);

		bodyModel[314].addShapeBox(3F, -3F, -3F, 2, 2, 6, 0F,-0.45F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -0.45F, -0.25F, -1.75F, -0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F); // Box 6
		bodyModel[314].setRotationPoint(146.5F, -21F, 10.5F);

		bodyModel[315].addShapeBox(3F, 1F, -3F, 2, 2, 6, 0F,-0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F, -0.45F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -0.45F, -0.25F, -1.75F); // Box 7
		bodyModel[315].setRotationPoint(146.5F, -21F, 10.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 5, 10, 40, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 0.75F, 0F); // Box 6
		bodyModel[316].setRotationPoint(-164F, -25.5F, -20F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 5, 10, 40, 0F,-1F, -4.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, -4.5F, 0F, 0F, -1.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, -1.75F, 0F); // Box 7
		bodyModel[317].setRotationPoint(-168F, -25.5F, -20F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 5, 6, 40, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 8
		bodyModel[318].setRotationPoint(-164F, -14.75F, -20F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 5, 6, 40, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 9
		bodyModel[319].setRotationPoint(-164F, -5.5F, -20F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 9, 3, 40, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[320].setRotationPoint(-168F, -8.5F, -20F);

		bodyModel[321].addShapeBox(-2.2F, 4.5F, -4F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F); // Box 52
		bodyModel[321].setRotationPoint(-167.5F, -7.75F, 13F);

		bodyModel[322].addShapeBox(-2.2F, 0.5F, -3.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[322].setRotationPoint(-167.5F, -7.75F, 13F);

		bodyModel[323].addShapeBox(-3.2F, 0.5F, -3.9F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 54
		bodyModel[323].setRotationPoint(-167.5F, -7.75F, 13F);

		bodyModel[324].addShapeBox(-3.2F, 0.5F, -1.1F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 55
		bodyModel[324].setRotationPoint(-167.5F, -7.75F, 13F);

		bodyModel[325].addShapeBox(-2.2F, 0.5F, -1.1F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[325].setRotationPoint(-167.5F, -7.75F, 13F);

		bodyModel[326].addShapeBox(-3.4F, -0.8F, -3F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 58
		bodyModel[326].setRotationPoint(-167.5F, -7.75F, 13F);
		bodyModel[326].rotateAngleZ = 0.55850536F;

		bodyModel[327].addShapeBox(-2F, 0F, -4F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 59
		bodyModel[327].setRotationPoint(-167.5F, -7.75F, 13F);
		bodyModel[327].rotateAngleZ = 0.08726646F;

		bodyModel[328].addShapeBox(-2F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 60
		bodyModel[328].setRotationPoint(-167.5F, -7.75F, -13F);
		bodyModel[328].rotateAngleZ = 0.08726646F;

		bodyModel[329].addShapeBox(-3.2F, 0.5F, 2.9F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 61
		bodyModel[329].setRotationPoint(-167.5F, -7.75F, -13F);

		bodyModel[330].addShapeBox(-3.4F, -0.8F, 1F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 62
		bodyModel[330].setRotationPoint(-167.5F, -7.75F, -13F);
		bodyModel[330].rotateAngleZ = 0.55850536F;

		bodyModel[331].addShapeBox(-2.2F, 0.5F, 2.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[331].setRotationPoint(-167.5F, -7.75F, -13F);

		bodyModel[332].addShapeBox(-2.2F, 4.5F, 0F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F); // Box 65
		bodyModel[332].setRotationPoint(-167.5F, -7.75F, -13F);

		bodyModel[333].addShapeBox(-2.2F, 0.5F, 0.1F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[333].setRotationPoint(-167.5F, -7.75F, -13F);

		bodyModel[334].addShapeBox(-3.2F, 0.5F, 0.1F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 67
		bodyModel[334].setRotationPoint(-167.5F, -7.75F, -13F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 3, 39, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F); // Box 71
		bodyModel[335].setRotationPoint(-164F, -15.25F, -19.5F);
		bodyModel[335].rotateAngleZ = -0.61086524F;

		bodyModel[336].addShapeBox(-0.5F, 3F, 0F, 1, 3, 39, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.1F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 1.1F, 0F, 0F); // Box 72
		bodyModel[336].setRotationPoint(-164F, -15.25F, -19.5F);
		bodyModel[336].rotateAngleZ = -0.61086524F;

		bodyModel[337].addBox(0F, 1F, 0F, 3, 1, 3, 0F); // Box 73
		bodyModel[337].setRotationPoint(-168F, -13.5F, 13F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[338].setRotationPoint(-168F, -13.5F, 13F);

		bodyModel[339].addShapeBox(0F, 2F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 75
		bodyModel[339].setRotationPoint(-168F, -13.5F, 13F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F); // Box 80
		bodyModel[340].setRotationPoint(-167F, -20.5F, -34F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -1.375F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -1.375F, -0.25F, -0.375F, 0.875F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.375F, 0.875F, -0.25F); // Box 81
		bodyModel[341].setRotationPoint(-167F, -21F, -34.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F); // Box 82
		bodyModel[342].setRotationPoint(-167F, -20.5F, 20F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -1.375F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -1.375F, -0.25F, -0.375F, 0.875F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.375F, 0.875F, -0.25F); // Box 83
		bodyModel[343].setRotationPoint(-167F, -21F, 33.5F);

		bodyModel[344].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 94
		bodyModel[344].setRotationPoint(-84.75F, 2F, -21.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 95
		bodyModel[345].setRotationPoint(-84.25F, 1F, -21.5F);
		bodyModel[345].rotateAngleZ = 0.40142573F;

		bodyModel[346].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 98
		bodyModel[346].setRotationPoint(-104.75F, 2F, -21.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 99
		bodyModel[347].setRotationPoint(-104.25F, 1F, -21.5F);
		bodyModel[347].rotateAngleZ = 0.40142573F;

		bodyModel[348].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 102
		bodyModel[348].setRotationPoint(-123.5F, 2F, -21.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 103
		bodyModel[349].setRotationPoint(-123F, 1F, -21.5F);
		bodyModel[349].rotateAngleZ = 0.40142573F;

		bodyModel[350].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 106
		bodyModel[350].setRotationPoint(-140.5F, 2F, -21.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 107
		bodyModel[351].setRotationPoint(-140F, 1F, -21.5F);
		bodyModel[351].rotateAngleZ = 0.40142573F;

		bodyModel[352].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 142
		bodyModel[352].setRotationPoint(-84.25F, 1F, 20.5F);
		bodyModel[352].rotateAngleZ = 0.40142573F;

		bodyModel[353].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 144
		bodyModel[353].setRotationPoint(-84.75F, 2F, 20.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 146
		bodyModel[354].setRotationPoint(-104.25F, 1F, 20.5F);
		bodyModel[354].rotateAngleZ = 0.40142573F;

		bodyModel[355].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 148
		bodyModel[355].setRotationPoint(-104.75F, 2F, 20.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 150
		bodyModel[356].setRotationPoint(-123F, 1F, 20.5F);
		bodyModel[356].rotateAngleZ = 0.40142573F;

		bodyModel[357].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 151
		bodyModel[357].setRotationPoint(-123.5F, 2F, 20.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 154
		bodyModel[358].setRotationPoint(-140F, 1F, 20.5F);
		bodyModel[358].rotateAngleZ = 0.40142573F;

		bodyModel[359].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 156
		bodyModel[359].setRotationPoint(-140.5F, 2F, 20.5F);

		bodyModel[360].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[360].setRotationPoint(-84.75F, -4F, -20.5F);

		bodyModel[361].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[361].setRotationPoint(-84.75F, -4F, -20.5F);

		bodyModel[362].addShapeBox(-2.5F, -5F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[362].setRotationPoint(-84.75F, -4F, -20.5F);

		bodyModel[363].addShapeBox(0.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[363].setRotationPoint(-84.75F, -4F, -20.5F);

		bodyModel[364].addShapeBox(-1.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[364].setRotationPoint(-84.75F, -4F, -20.5F);

		bodyModel[365].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 175
		bodyModel[365].setRotationPoint(-84.75F, -4F, -20.5F);

		bodyModel[366].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[366].setRotationPoint(-104.75F, -4F, -20.5F);

		bodyModel[367].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[367].setRotationPoint(-104.75F, -4F, -20.5F);

		bodyModel[368].addShapeBox(-2.5F, -5F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[368].setRotationPoint(-104.75F, -4F, -20.5F);

		bodyModel[369].addShapeBox(0.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[369].setRotationPoint(-104.75F, -4F, -20.5F);

		bodyModel[370].addShapeBox(-1.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[370].setRotationPoint(-104.75F, -4F, -20.5F);

		bodyModel[371].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 181
		bodyModel[371].setRotationPoint(-104.75F, -4F, -20.5F);

		bodyModel[372].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[372].setRotationPoint(-123.5F, -4F, -20.5F);

		bodyModel[373].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[373].setRotationPoint(-123.5F, -4F, -20.5F);

		bodyModel[374].addShapeBox(-2.5F, -5F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[374].setRotationPoint(-123.5F, -4F, -20.5F);

		bodyModel[375].addShapeBox(0.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[375].setRotationPoint(-123.5F, -4F, -20.5F);

		bodyModel[376].addShapeBox(-1.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[376].setRotationPoint(-123.5F, -4F, -20.5F);

		bodyModel[377].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 187
		bodyModel[377].setRotationPoint(-123.5F, -4F, -20.5F);

		bodyModel[378].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[378].setRotationPoint(-140.5F, -4F, -20.5F);

		bodyModel[379].addShapeBox(-2.5F, -3F, -1F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[379].setRotationPoint(-140.5F, -4F, -20.5F);

		bodyModel[380].addShapeBox(-2.5F, -5F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[380].setRotationPoint(-140.5F, -4F, -20.5F);

		bodyModel[381].addShapeBox(0.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[381].setRotationPoint(-140.5F, -4F, -20.5F);

		bodyModel[382].addShapeBox(-1.5F, -5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[382].setRotationPoint(-140.5F, -4F, -20.5F);

		bodyModel[383].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 193
		bodyModel[383].setRotationPoint(-140.5F, -4F, -20.5F);

		bodyModel[384].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 229
		bodyModel[384].setRotationPoint(-84.75F, -4F, 20.5F);

		bodyModel[385].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[385].setRotationPoint(-84.75F, -4F, 20.5F);

		bodyModel[386].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 243
		bodyModel[386].setRotationPoint(-84.75F, -4F, 22.5F);

		bodyModel[387].addShapeBox(-2.5F, -5F, 1F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[387].setRotationPoint(-84.75F, -4F, 18.5F);

		bodyModel[388].addShapeBox(0.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[388].setRotationPoint(-84.75F, -4F, 21.5F);

		bodyModel[389].addShapeBox(-1.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[389].setRotationPoint(-84.75F, -4F, 21.5F);

		bodyModel[390].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 247
		bodyModel[390].setRotationPoint(-104.75F, -4F, 20.5F);

		bodyModel[391].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[391].setRotationPoint(-104.75F, -4F, 20.5F);

		bodyModel[392].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 249
		bodyModel[392].setRotationPoint(-104.75F, -4F, 22.5F);

		bodyModel[393].addShapeBox(-2.5F, -5F, 1F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[393].setRotationPoint(-104.75F, -4F, 18.5F);

		bodyModel[394].addShapeBox(0.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[394].setRotationPoint(-104.75F, -4F, 21.5F);

		bodyModel[395].addShapeBox(-1.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[395].setRotationPoint(-104.75F, -4F, 21.5F);

		bodyModel[396].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 253
		bodyModel[396].setRotationPoint(-123.5F, -4F, 20.5F);

		bodyModel[397].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 254
		bodyModel[397].setRotationPoint(-123.5F, -4F, 22.5F);

		bodyModel[398].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[398].setRotationPoint(-123.5F, -4F, 20.5F);

		bodyModel[399].addShapeBox(-2.5F, -5F, 1F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[399].setRotationPoint(-123.5F, -4F, 18.5F);

		bodyModel[400].addShapeBox(-1.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[400].setRotationPoint(-123.5F, -4F, 21.5F);

		bodyModel[401].addShapeBox(0.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[401].setRotationPoint(-123.5F, -4F, 21.5F);

		bodyModel[402].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[402].setRotationPoint(-140.5F, -4F, 22.5F);

		bodyModel[403].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[403].setRotationPoint(-140.5F, -4F, 20.5F);

		bodyModel[404].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 261
		bodyModel[404].setRotationPoint(-140.5F, -4F, 20.5F);

		bodyModel[405].addShapeBox(-2.5F, -5F, 1F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[405].setRotationPoint(-140.5F, -4F, 18.5F);

		bodyModel[406].addShapeBox(0.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[406].setRotationPoint(-140.5F, -4F, 21.5F);

		bodyModel[407].addBox(-1F, -2F, -1F, 5, 4, 1, 0F); // Box 10
		bodyModel[407].setRotationPoint(-144F, -10.5F, -20F);
		bodyModel[407].rotateAngleZ = 0.34906585F;

		bodyModel[408].addShapeBox(0F, -2F, -8F, 1, 4, 7, 0F,2F, 0F, -1.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[408].setRotationPoint(-144F, -10.5F, -20F);
		bodyModel[408].rotateAngleZ = 0.34906585F;

		bodyModel[409].addShapeBox(-11F, -2F, -7.5F, 10, 4, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 12
		bodyModel[409].setRotationPoint(-144F, -10.5F, -20F);
		bodyModel[409].rotateAngleZ = 0.34906585F;

		bodyModel[410].addBox(-1F, -2F, 0F, 5, 4, 1, 0F); // Box 16
		bodyModel[410].setRotationPoint(-144F, -10.5F, 20F);
		bodyModel[410].rotateAngleZ = 0.34906585F;

		bodyModel[411].addShapeBox(0F, -2F, 1F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, 2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, 2F, 0F, -1.5F); // Box 17
		bodyModel[411].setRotationPoint(-144F, -10.5F, 20F);
		bodyModel[411].rotateAngleZ = 0.34906585F;

		bodyModel[412].addShapeBox(-11F, -2F, 6.5F, 10, 4, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F); // Box 18
		bodyModel[412].setRotationPoint(-144F, -10.5F, 20F);
		bodyModel[412].rotateAngleZ = 0.34906585F;

		bodyModel[413].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 93
		bodyModel[413].setRotationPoint(-74.25F, -2F, -20F);

		bodyModel[414].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 96
		bodyModel[414].setRotationPoint(-84.75F, 2F, -20F);

		bodyModel[415].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 97
		bodyModel[415].setRotationPoint(-94.25F, -2F, -20F);

		bodyModel[416].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 100
		bodyModel[416].setRotationPoint(-104.75F, 2F, -20F);

		bodyModel[417].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 101
		bodyModel[417].setRotationPoint(-113F, -2F, -20F);

		bodyModel[418].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 104
		bodyModel[418].setRotationPoint(-123.5F, 2F, -20F);

		bodyModel[419].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 105
		bodyModel[419].setRotationPoint(-130F, -2F, -20F);

		bodyModel[420].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 108
		bodyModel[420].setRotationPoint(-140.5F, 2F, -20F);

		bodyModel[421].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 141
		bodyModel[421].setRotationPoint(-74.25F, -2F, 20F);

		bodyModel[422].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 143
		bodyModel[422].setRotationPoint(-84.75F, 2F, 20F);

		bodyModel[423].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 145
		bodyModel[423].setRotationPoint(-94.25F, -2F, 20F);

		bodyModel[424].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 147
		bodyModel[424].setRotationPoint(-104.75F, 2F, 20F);

		bodyModel[425].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 149
		bodyModel[425].setRotationPoint(-113F, -2F, 20F);

		bodyModel[426].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 152
		bodyModel[426].setRotationPoint(-123.5F, 2F, 20F);

		bodyModel[427].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 153
		bodyModel[427].setRotationPoint(-130F, -2F, 20F);

		bodyModel[428].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 155
		bodyModel[428].setRotationPoint(-140.5F, 2F, 20F);

		bodyModel[429].addShape3D(3F, -3F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 6, 6, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 17
		bodyModel[429].setRotationPoint(-98.5F, -11.5F, -20F);

		bodyModel[430].addShape3D(3F, -3F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 6, 6, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 21
		bodyModel[430].setRotationPoint(-136.5F, -11.5F, -20F);

		bodyModel[431].addShape3D(3F, -3F, -6F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 6, 6, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 30
		bodyModel[431].setRotationPoint(-98.5F, -11.5F, 20F);

		bodyModel[432].addShape3D(3F, -3F, -6F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 6, 6, 6, 20, 6, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 35
		bodyModel[432].setRotationPoint(-136.5F, -11.5F, 20F);

		bodyModel[433].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 5, 9, 9, 32, 5, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 40
		bodyModel[433].setRotationPoint(-158.75F, -6.25F, -20F);

		bodyModel[434].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 5, 9, 9, 32, 5, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 9
		bodyModel[434].setRotationPoint(-158.75F, -6.25F, 20F);

		bodyModel[435].addShapeBox(0F, 0F, -9F, 25, 3, 9, 0F,-0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 925
		bodyModel[435].setRotationPoint(-18.5F, -25.5F, -24.75F);

		bodyModel[436].addShapeBox(0F, 2F, 0F, 25, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 926
		bodyModel[436].setRotationPoint(-18.5F, -24.5F, -33.75F);

		bodyModel[437].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 927
		bodyModel[437].setRotationPoint(7F, -20.75F, -33.75F);

		bodyModel[438].addShapeBox(0F, -4F, -14F, 1, 1, 13, 0F,-0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 928
		bodyModel[438].setRotationPoint(7F, -20.75F, -19.75F);

		bodyModel[439].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 929
		bodyModel[439].setRotationPoint(7F, -20.75F, -20.75F);

		bodyModel[440].addShapeBox(0F, 0F, 8F, 25, 3, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 930
		bodyModel[440].setRotationPoint(-18.5F, -25.5F, -33.75F);

		bodyModel[441].addShapeBox(0F, 2F, 0F, 22, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 931
		bodyModel[441].setRotationPoint(-90.5F, -24.5F, 20.75F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 22, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 932
		bodyModel[442].setRotationPoint(-90.5F, -25.5F, 20.75F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 22, 3, 9, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 933
		bodyModel[443].setRotationPoint(-90.5F, -25.5F, 24.75F);

		bodyModel[444].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 934
		bodyModel[444].setRotationPoint(7F, -20.75F, 19.75F);

		bodyModel[445].addShapeBox(0F, -4F, 0F, 1, 1, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2.5F, -0.5F, 3F, -2.5F); // Box 935
		bodyModel[445].setRotationPoint(7F, -20.75F, 20.75F);

		bodyModel[446].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 936
		bodyModel[446].setRotationPoint(7F, -20.75F, 19.75F);

		bodyModel[447].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 937
		bodyModel[447].setRotationPoint(-20F, -20.75F, 19.75F);

		bodyModel[448].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 938
		bodyModel[448].setRotationPoint(-20F, -20.75F, 19.75F);

		bodyModel[449].addShapeBox(0F, -4F, 0F, 1, 1, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2.5F, -0.5F, 3F, -2.5F); // Box 939
		bodyModel[449].setRotationPoint(-20F, -20.75F, 20.75F);

		bodyModel[450].addShapeBox(0F, -4F, -14F, 1, 1, 13, 0F,-0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 940
		bodyModel[450].setRotationPoint(-20F, -20.75F, -19.75F);

		bodyModel[451].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 941
		bodyModel[451].setRotationPoint(-20F, -20.75F, -33.75F);

		bodyModel[452].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 942
		bodyModel[452].setRotationPoint(-20F, -20.75F, -20.75F);

		bodyModel[453].addShapeBox(0F, 0F, -9F, 25, 3, 9, 0F,-0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 943
		bodyModel[453].setRotationPoint(9.5F, -25.5F, -24.75F);

		bodyModel[454].addShapeBox(0F, 2F, 0F, 25, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 944
		bodyModel[454].setRotationPoint(9.5F, -24.5F, -33.75F);

		bodyModel[455].addShapeBox(0F, 0F, 8F, 25, 3, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 945
		bodyModel[455].setRotationPoint(9.5F, -25.5F, -33.75F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 22, 3, 9, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 946
		bodyModel[456].setRotationPoint(-66.5F, -25.5F, 24.75F);

		bodyModel[457].addShapeBox(0F, 2F, 0F, 22, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 947
		bodyModel[457].setRotationPoint(-66.5F, -24.5F, 20.75F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 22, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 948
		bodyModel[458].setRotationPoint(-66.5F, -25.5F, 20.75F);

		bodyModel[459].addShapeBox(0F, -4F, 0F, 1, 1, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2.5F, -0.5F, 3F, -2.5F); // Box 949
		bodyModel[459].setRotationPoint(-44F, -20.75F, 20.75F);

		bodyModel[460].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 950
		bodyModel[460].setRotationPoint(-44F, -20.75F, 19.75F);

		bodyModel[461].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 951
		bodyModel[461].setRotationPoint(-44F, -20.75F, 19.75F);

		bodyModel[462].addBox(0F, 0F, 0F, 1, 1, 15, 0F); // Box 952
		bodyModel[462].setRotationPoint(-68F, -20.75F, 19.75F);

		bodyModel[463].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 953
		bodyModel[463].setRotationPoint(-68F, -20.75F, 19.75F);

		bodyModel[464].addShapeBox(0F, -4F, 0F, 1, 1, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2.5F, -0.5F, 3F, -2.5F); // Box 954
		bodyModel[464].setRotationPoint(-68F, -20.75F, 20.75F);

		bodyModel[465].addShapeBox(0F, -4F, -14F, 1, 1, 13, 0F,-0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 955
		bodyModel[465].setRotationPoint(-68F, -20.75F, -19.75F);

		bodyModel[466].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 956
		bodyModel[466].setRotationPoint(-68F, -20.75F, -20.75F);

		bodyModel[467].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 957
		bodyModel[467].setRotationPoint(-44F, -20.75F, -20.75F);

		bodyModel[468].addShapeBox(0F, -4F, -14F, 1, 1, 13, 0F,-0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 958
		bodyModel[468].setRotationPoint(-44F, -20.75F, -19.75F);

		bodyModel[469].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 959
		bodyModel[469].setRotationPoint(-44F, -20.75F, -33.75F);

		bodyModel[470].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 960
		bodyModel[470].setRotationPoint(-68F, -20.75F, -33.75F);

		bodyModel[471].addShapeBox(0F, -4F, 0F, 1, 1, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2.5F, -0.5F, 3F, -2.5F); // Box 961
		bodyModel[471].setRotationPoint(-92F, -20.75F, 20.75F);

		bodyModel[472].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 962
		bodyModel[472].setRotationPoint(-92F, -20.75F, 19.75F);

		bodyModel[473].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 963
		bodyModel[473].setRotationPoint(-92F, -20.75F, 19.75F);

		bodyModel[474].addBox(0F, 0F, 0F, 1, 1, 15, 0F); // Box 964
		bodyModel[474].setRotationPoint(-116F, -20.75F, 19.75F);

		bodyModel[475].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 965
		bodyModel[475].setRotationPoint(-116F, -20.75F, 19.75F);

		bodyModel[476].addShapeBox(0F, -4F, 0F, 1, 1, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2.5F, -0.5F, 3F, -2.5F); // Box 966
		bodyModel[476].setRotationPoint(-116F, -20.75F, 20.75F);

		bodyModel[477].addShapeBox(0F, -4F, -14F, 1, 1, 13, 0F,-0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 967
		bodyModel[477].setRotationPoint(-116F, -20.75F, -19.75F);

		bodyModel[478].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 968
		bodyModel[478].setRotationPoint(-116F, -20.75F, -20.75F);

		bodyModel[479].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 969
		bodyModel[479].setRotationPoint(-92F, -20.75F, -20.75F);

		bodyModel[480].addShapeBox(0F, -4F, -14F, 1, 1, 13, 0F,-0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 970
		bodyModel[480].setRotationPoint(-92F, -20.75F, -19.75F);

		bodyModel[481].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 971
		bodyModel[481].setRotationPoint(-92F, -20.75F, -33.75F);

		bodyModel[482].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 972
		bodyModel[482].setRotationPoint(-116F, -20.75F, -33.75F);

		bodyModel[483].addShapeBox(0F, -4F, 0F, 1, 1, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2.5F, -0.5F, 3F, -2.5F); // Box 973
		bodyModel[483].setRotationPoint(-136F, -20.75F, 20.75F);

		bodyModel[484].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 974
		bodyModel[484].setRotationPoint(-136F, -20.75F, 19.75F);

		bodyModel[485].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 975
		bodyModel[485].setRotationPoint(-136F, -20.75F, 19.75F);

		bodyModel[486].addBox(0F, 0F, 0F, 1, 1, 15, 0F); // Box 976
		bodyModel[486].setRotationPoint(-160F, -20.75F, 19.75F);

		bodyModel[487].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 977
		bodyModel[487].setRotationPoint(-160F, -20.75F, 19.75F);

		bodyModel[488].addShapeBox(0F, -4F, 0F, 1, 1, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2.5F, -0.5F, 3F, -2.5F); // Box 978
		bodyModel[488].setRotationPoint(-160F, -20.75F, 20.75F);

		bodyModel[489].addShapeBox(0F, -4F, -14F, 1, 1, 13, 0F,-0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 979
		bodyModel[489].setRotationPoint(-160F, -20.75F, -19.75F);

		bodyModel[490].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 980
		bodyModel[490].setRotationPoint(-160F, -20.75F, -20.75F);

		bodyModel[491].addBox(0F, -4F, 0F, 1, 4, 1, 0F); // Box 981
		bodyModel[491].setRotationPoint(-136F, -20.75F, -20.75F);

		bodyModel[492].addShapeBox(0F, -4F, -14F, 1, 1, 13, 0F,-0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 982
		bodyModel[492].setRotationPoint(-136F, -20.75F, -19.75F);

		bodyModel[493].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 983
		bodyModel[493].setRotationPoint(-136F, -20.75F, -33.75F);

		bodyModel[494].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 984
		bodyModel[494].setRotationPoint(-160F, -20.75F, -33.75F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 985
		bodyModel[495].setRotationPoint(-114F, -24.65F, -34F);

		bodyModel[496].addBox(0F, 0F, 0F, 20, 2, 4, 0F); // Box 986
		bodyModel[496].setRotationPoint(-114F, -23.65F, -34F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 987
		bodyModel[497].setRotationPoint(-110.5F, -24.65F, -34F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 988
		bodyModel[498].setRotationPoint(-110.5F, -23.65F, -34F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 989
		bodyModel[499].setRotationPoint(-110.5F, -21.65F, -34F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 457, 289, textureX, textureY); // Box 990
		bodyModel[501] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Box 991
		bodyModel[502] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Box 992
		bodyModel[503] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Box 993
		bodyModel[504] = new ModelRendererTurbo(this, 57, 265, textureX, textureY); // Box 994
		bodyModel[505] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 995
		bodyModel[506] = new ModelRendererTurbo(this, 241, 257, textureX, textureY); // Box 996
		bodyModel[507] = new ModelRendererTurbo(this, 489, 257, textureX, textureY); // Box 997
		bodyModel[508] = new ModelRendererTurbo(this, 473, 257, textureX, textureY); // Box 998
		bodyModel[509] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Box 999
		bodyModel[510] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 1000
		bodyModel[511] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Box 1001
		bodyModel[512] = new ModelRendererTurbo(this, 313, 257, textureX, textureY); // Box 1002
		bodyModel[513] = new ModelRendererTurbo(this, 433, 257, textureX, textureY); // Box 1003
		bodyModel[514] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 1004
		bodyModel[515] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Box 1005
		bodyModel[516] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Box 1006
		bodyModel[517] = new ModelRendererTurbo(this, 114, 448, textureX, textureY); // Shape 1007
		bodyModel[518] = new ModelRendererTurbo(this, 114, 448, textureX, textureY); // Shape 1008
		bodyModel[519] = new ModelRendererTurbo(this, 297, 313, textureX, textureY); // Box 2259
		bodyModel[520] = new ModelRendererTurbo(this, 433, 321, textureX, textureY); // Box 2260
		bodyModel[521] = new ModelRendererTurbo(this, 49, 321, textureX, textureY); // Box 2261
		bodyModel[522] = new ModelRendererTurbo(this, 273, 313, textureX, textureY); // Box 2262
		bodyModel[523] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 2263
		bodyModel[524] = new ModelRendererTurbo(this, 457, 313, textureX, textureY); // Box 2264
		bodyModel[525] = new ModelRendererTurbo(this, 201, 313, textureX, textureY); // Box 2265
		bodyModel[526] = new ModelRendererTurbo(this, 401, 321, textureX, textureY); // Box 2266
		bodyModel[527] = new ModelRendererTurbo(this, 153, 313, textureX, textureY); // Box 2267
		bodyModel[528] = new ModelRendererTurbo(this, 353, 313, textureX, textureY); // Box 2268
		bodyModel[529] = new ModelRendererTurbo(this, 113, 329, textureX, textureY); // Box 2269
		bodyModel[530] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Box 2270
		bodyModel[531] = new ModelRendererTurbo(this, 153, 329, textureX, textureY); // Box 2271
		bodyModel[532] = new ModelRendererTurbo(this, 185, 329, textureX, textureY); // Box 2272
		bodyModel[533] = new ModelRendererTurbo(this, 329, 329, textureX, textureY); // Box 2273
		bodyModel[534] = new ModelRendererTurbo(this, 433, 329, textureX, textureY); // Box 2274
		bodyModel[535] = new ModelRendererTurbo(this, 137, 329, textureX, textureY); // Box 2275
		bodyModel[536] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 2276
		bodyModel[537] = new ModelRendererTurbo(this, 329, 313, textureX, textureY); // Box 2277
		bodyModel[538] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 2278
		bodyModel[539] = new ModelRendererTurbo(this, 489, 313, textureX, textureY); // Box 2279
		bodyModel[540] = new ModelRendererTurbo(this, 129, 305, textureX, textureY); // Box 2280
		bodyModel[541] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 2281
		bodyModel[542] = new ModelRendererTurbo(this, 89, 305, textureX, textureY); // Box 2282
		bodyModel[543] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 2283
		bodyModel[544] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Box 2284
		bodyModel[545] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 2285
		bodyModel[546] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 2286
		bodyModel[547] = new ModelRendererTurbo(this, 97, 321, textureX, textureY); // Box 2287
		bodyModel[548] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 2288
		bodyModel[549] = new ModelRendererTurbo(this, 17, 337, textureX, textureY); // Box 2289
		bodyModel[550] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 2290
		bodyModel[551] = new ModelRendererTurbo(this, 217, 321, textureX, textureY); // Box 2291
		bodyModel[552] = new ModelRendererTurbo(this, 49, 337, textureX, textureY); // Box 2292
		bodyModel[553] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 2293
		bodyModel[554] = new ModelRendererTurbo(this, 97, 337, textureX, textureY); // Box 2294
		bodyModel[555] = new ModelRendererTurbo(this, 81, 337, textureX, textureY); // Box 2295
		bodyModel[556] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 2296
		bodyModel[557] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 2297
		bodyModel[558] = new ModelRendererTurbo(this, 457, 329, textureX, textureY); // Box 2298
		bodyModel[559] = new ModelRendererTurbo(this, 201, 337, textureX, textureY); // Box 2299
		bodyModel[560] = new ModelRendererTurbo(this, 153, 337, textureX, textureY); // Box 2300
		bodyModel[561] = new ModelRendererTurbo(this, 113, 337, textureX, textureY); // Box 2301
		bodyModel[562] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 2302
		bodyModel[563] = new ModelRendererTurbo(this, 337, 321, textureX, textureY); // Box 2303
		bodyModel[564] = new ModelRendererTurbo(this, 233, 337, textureX, textureY); // Box 2304
		bodyModel[565] = new ModelRendererTurbo(this, 249, 337, textureX, textureY); // Box 2305
		bodyModel[566] = new ModelRendererTurbo(this, 217, 337, textureX, textureY); // Box 2306
		bodyModel[567] = new ModelRendererTurbo(this, 78, 432, textureX, textureY); // Shape 2307
		bodyModel[568] = new ModelRendererTurbo(this, 369, 321, textureX, textureY); // Box 2308
		bodyModel[569] = new ModelRendererTurbo(this, 265, 337, textureX, textureY); // Box 2309
		bodyModel[570] = new ModelRendererTurbo(this, 281, 337, textureX, textureY); // Box 2310
		bodyModel[571] = new ModelRendererTurbo(this, 297, 337, textureX, textureY); // Box 2311
		bodyModel[572] = new ModelRendererTurbo(this, 473, 329, textureX, textureY); // Box 2312
		bodyModel[573] = new ModelRendererTurbo(this, 489, 329, textureX, textureY); // Box 2313
		bodyModel[574] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 2314
		bodyModel[575] = new ModelRendererTurbo(this, 185, 313, textureX, textureY); // Box 2315
		bodyModel[576] = new ModelRendererTurbo(this, 281, 313, textureX, textureY); // Box 2316
		bodyModel[577] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 2317
		bodyModel[578] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 2318
		bodyModel[579] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 2319
		bodyModel[580] = new ModelRendererTurbo(this, 169, 305, textureX, textureY); // Box 2320
		bodyModel[581] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 2321
		bodyModel[582] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 2322
		bodyModel[583] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 2323
		bodyModel[584] = new ModelRendererTurbo(this, 81, 321, textureX, textureY); // Box 2324
		bodyModel[585] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 2325
		bodyModel[586] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Box 2326
		bodyModel[587] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 2327
		bodyModel[588] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 2328
		bodyModel[589] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Box 2329
		bodyModel[590] = new ModelRendererTurbo(this, 385, 321, textureX, textureY); // Box 2330
		bodyModel[591] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 2331
		bodyModel[592] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Box 2332
		bodyModel[593] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 2333
		bodyModel[594] = new ModelRendererTurbo(this, 233, 321, textureX, textureY); // Box 2334
		bodyModel[595] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 2335
		bodyModel[596] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 2336
		bodyModel[597] = new ModelRendererTurbo(this, 0, 414, textureX, textureY); // Shape 2337

		bodyModel[500].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 990
		bodyModel[500].setRotationPoint(-114F, -21.65F, -34F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 991
		bodyModel[501].setRotationPoint(-98.5F, -21.65F, -34F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 992
		bodyModel[502].setRotationPoint(-98.5F, -23.65F, -34F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 993
		bodyModel[503].setRotationPoint(-98.5F, -24.65F, -34F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 994
		bodyModel[504].setRotationPoint(-114F, -21.65F, -29F);

		bodyModel[505].addBox(0F, 0F, 0F, 20, 2, 4, 0F); // Box 995
		bodyModel[505].setRotationPoint(-114F, -23.65F, -29F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 996
		bodyModel[506].setRotationPoint(-114F, -24.65F, -29F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 997
		bodyModel[507].setRotationPoint(-98.5F, -24.65F, -29F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 998
		bodyModel[508].setRotationPoint(-98.5F, -23.65F, -29F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 999
		bodyModel[509].setRotationPoint(-110.5F, -23.65F, -29F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 1000
		bodyModel[510].setRotationPoint(-110.5F, -24.65F, -29F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 1001
		bodyModel[511].setRotationPoint(-110.5F, -21.65F, -29F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 1002
		bodyModel[512].setRotationPoint(-110.5F, -21.5F, -28.5F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 1003
		bodyModel[513].setRotationPoint(-98.5F, -21.65F, -29F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 1004
		bodyModel[514].setRotationPoint(-98.5F, -21.5F, -28.5F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 1005
		bodyModel[515].setRotationPoint(-98.5F, -21.5F, -33.5F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 1006
		bodyModel[516].setRotationPoint(-110.5F, -21.5F, -33.5F);

		bodyModel[517].addShape3D(18F, -18F, 0F, new Shape2D(new Coord2D[] { new Coord2D(36, 12, 36, 12), new Coord2D(36, 24, 36, 24), new Coord2D(25, 36, 25, 36), new Coord2D(13, 36, 13, 36), new Coord2D(0, 24, 0, 24), new Coord2D(0, 13, 0, 13), new Coord2D(13, 0, 13, 0), new Coord2D(24, 0, 24, 0) }), 2, 36, 36, 117, 2, ModelRendererTurbo.MR_FRONT, new float[] {17 ,11 ,19 ,11 ,18 ,12 ,17 ,12}); // Shape 1007
		bodyModel[517].setRotationPoint(-84F, -25.5F, 0F);
		bodyModel[517].rotateAngleX = -1.57079633F;

		bodyModel[518].addShape3D(18F, -18F, 0F, new Shape2D(new Coord2D[] { new Coord2D(36, 12, 36, 12), new Coord2D(36, 24, 36, 24), new Coord2D(25, 36, 25, 36), new Coord2D(13, 36, 13, 36), new Coord2D(0, 24, 0, 24), new Coord2D(0, 13, 0, 13), new Coord2D(13, 0, 13, 0), new Coord2D(24, 0, 24, 0) }), 6, 36, 36, 117, 6, ModelRendererTurbo.MR_FRONT, new float[] {17 ,11 ,19 ,11 ,18 ,12 ,17 ,12}); // Shape 1008
		bodyModel[518].setRotationPoint(104F, -25.5F, 0F);
		bodyModel[518].rotateAngleX = -1.57079633F;

		bodyModel[519].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2259
		bodyModel[519].setRotationPoint(-8.25F, -4F, -20.5F);

		bodyModel[520].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2260
		bodyModel[520].setRotationPoint(-8.25F, -4F, -20.5F);

		bodyModel[521].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2261
		bodyModel[521].setRotationPoint(-8.25F, -4F, -20.5F);

		bodyModel[522].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2262
		bodyModel[522].setRotationPoint(11.5F, -4F, -20.5F);

		bodyModel[523].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2263
		bodyModel[523].setRotationPoint(11.5F, -4F, -20.5F);

		bodyModel[524].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2264
		bodyModel[524].setRotationPoint(11.5F, -4F, -20.5F);

		bodyModel[525].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2265
		bodyModel[525].setRotationPoint(32F, -4F, -20.5F);

		bodyModel[526].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2266
		bodyModel[526].setRotationPoint(32F, -4F, -20.5F);

		bodyModel[527].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2267
		bodyModel[527].setRotationPoint(32F, -4F, -20.5F);

		bodyModel[528].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2268
		bodyModel[528].setRotationPoint(-28.25F, -4F, -20.5F);

		bodyModel[529].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2269
		bodyModel[529].setRotationPoint(-28.25F, -4F, -20.5F);

		bodyModel[530].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2270
		bodyModel[530].setRotationPoint(-47F, -4F, -20.5F);

		bodyModel[531].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2271
		bodyModel[531].setRotationPoint(-47F, -4F, -20.5F);

		bodyModel[532].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2272
		bodyModel[532].setRotationPoint(-47F, -4F, -20.5F);

		bodyModel[533].addShapeBox(-2.5F, -3F, -2F, 5, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2273
		bodyModel[533].setRotationPoint(-64F, -4F, -20.5F);

		bodyModel[534].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2274
		bodyModel[534].setRotationPoint(-64F, -4F, -20.5F);

		bodyModel[535].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2275
		bodyModel[535].setRotationPoint(-28.25F, -4F, -20.5F);

		bodyModel[536].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2276
		bodyModel[536].setRotationPoint(-17.75F, -2F, -20F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2277
		bodyModel[537].setRotationPoint(-27.75F, 1F, -21.5F);
		bodyModel[537].rotateAngleZ = 0.40142573F;

		bodyModel[538].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2278
		bodyModel[538].setRotationPoint(-36.5F, -2F, -20F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2279
		bodyModel[539].setRotationPoint(-46.5F, 1F, -21.5F);
		bodyModel[539].rotateAngleZ = 0.40142573F;

		bodyModel[540].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2280
		bodyModel[540].setRotationPoint(-7.75F, 1F, -21.5F);
		bodyModel[540].rotateAngleZ = 0.40142573F;

		bodyModel[541].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2281
		bodyModel[541].setRotationPoint(2.25F, -2F, -20F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2282
		bodyModel[542].setRotationPoint(12F, 1F, -21.5F);
		bodyModel[542].rotateAngleZ = 0.40142573F;

		bodyModel[543].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2283
		bodyModel[543].setRotationPoint(22F, -2F, -20F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2284
		bodyModel[544].setRotationPoint(32.5F, 1F, -21.5F);
		bodyModel[544].rotateAngleZ = 0.40142573F;

		bodyModel[545].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2285
		bodyModel[545].setRotationPoint(42.5F, -2F, -20F);

		bodyModel[546].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2286
		bodyModel[546].setRotationPoint(42.5F, -2F, 20F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2287
		bodyModel[547].setRotationPoint(32.5F, 1F, 20.5F);
		bodyModel[547].rotateAngleZ = 0.40142573F;

		bodyModel[548].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2288
		bodyModel[548].setRotationPoint(32F, -4F, 22.5F);

		bodyModel[549].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2289
		bodyModel[549].setRotationPoint(32F, -4F, 20.5F);

		bodyModel[550].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 1, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2290
		bodyModel[550].setRotationPoint(22F, -2F, 20F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2291
		bodyModel[551].setRotationPoint(12F, 1F, 20.5F);
		bodyModel[551].rotateAngleZ = 0.40142573F;

		bodyModel[552].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2292
		bodyModel[552].setRotationPoint(11.5F, -4F, 22.5F);

		bodyModel[553].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2293
		bodyModel[553].setRotationPoint(2.25F, -2F, 20F);

		bodyModel[554].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2294
		bodyModel[554].setRotationPoint(-8.25F, -4F, 22.5F);

		bodyModel[555].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2295
		bodyModel[555].setRotationPoint(-8.25F, -4F, 20.5F);

		bodyModel[556].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2296
		bodyModel[556].setRotationPoint(-17.75F, -2F, 20F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2297
		bodyModel[557].setRotationPoint(-27.75F, 1F, 20.5F);
		bodyModel[557].rotateAngleZ = 0.40142573F;

		bodyModel[558].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2298
		bodyModel[558].setRotationPoint(-8.25F, -4F, 20.5F);

		bodyModel[559].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2299
		bodyModel[559].setRotationPoint(-28.25F, -4F, 22.5F);

		bodyModel[560].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2300
		bodyModel[560].setRotationPoint(-28.25F, -4F, 20.5F);

		bodyModel[561].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2301
		bodyModel[561].setRotationPoint(-28.25F, -4F, 20.5F);

		bodyModel[562].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2302
		bodyModel[562].setRotationPoint(-36.5F, -2F, 20F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2303
		bodyModel[563].setRotationPoint(-46.5F, 1F, 20.5F);
		bodyModel[563].rotateAngleZ = 0.40142573F;

		bodyModel[564].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2304
		bodyModel[564].setRotationPoint(-47F, -4F, 22.5F);

		bodyModel[565].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2305
		bodyModel[565].setRotationPoint(-47F, -4F, 20.5F);

		bodyModel[566].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2306
		bodyModel[566].setRotationPoint(-47F, -4F, 20.5F);

		bodyModel[567].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2307
		bodyModel[567].setRotationPoint(-53.5F, -2F, 20F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2308
		bodyModel[568].setRotationPoint(-63.5F, 1F, 20.5F);
		bodyModel[568].rotateAngleZ = 0.40142573F;

		bodyModel[569].addShapeBox(-2.5F, -3F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2309
		bodyModel[569].setRotationPoint(-64F, -4F, 22.5F);

		bodyModel[570].addShapeBox(-2.5F, -3F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2310
		bodyModel[570].setRotationPoint(-64F, -4F, 20.5F);

		bodyModel[571].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2311
		bodyModel[571].setRotationPoint(-64F, -4F, 20.5F);

		bodyModel[572].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2312
		bodyModel[572].setRotationPoint(11.5F, -4F, 20.5F);

		bodyModel[573].addShapeBox(-1.5F, -1F, -1F, 3, 7, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2313
		bodyModel[573].setRotationPoint(32F, -4F, 20.5F);

		bodyModel[574].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2314
		bodyModel[574].setRotationPoint(-8.25F, 2F, -20F);

		bodyModel[575].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2315
		bodyModel[575].setRotationPoint(-8.25F, 2F, -21.5F);

		bodyModel[576].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2316
		bodyModel[576].setRotationPoint(-28.25F, 2F, -21.5F);

		bodyModel[577].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2317
		bodyModel[577].setRotationPoint(-28.25F, 2F, -20F);

		bodyModel[578].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2318
		bodyModel[578].setRotationPoint(11.5F, 2F, -21.5F);

		bodyModel[579].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2319
		bodyModel[579].setRotationPoint(11.5F, 2F, -20F);

		bodyModel[580].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2320
		bodyModel[580].setRotationPoint(32F, 2F, -21.5F);

		bodyModel[581].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2321
		bodyModel[581].setRotationPoint(32F, 2F, -20F);

		bodyModel[582].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2322
		bodyModel[582].setRotationPoint(-47F, 2F, -21.5F);

		bodyModel[583].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2323
		bodyModel[583].setRotationPoint(-47F, 2F, -20F);

		bodyModel[584].addShapeBox(-1F, -1F, -8.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2324
		bodyModel[584].setRotationPoint(-64F, 2F, -21.5F);

		bodyModel[585].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2325
		bodyModel[585].setRotationPoint(-64F, 2F, -20F);

		bodyModel[586].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2326
		bodyModel[586].setRotationPoint(-47F, 2F, 20.5F);

		bodyModel[587].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2327
		bodyModel[587].setRotationPoint(-47F, 2F, 20F);

		bodyModel[588].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2328
		bodyModel[588].setRotationPoint(-28.25F, 2F, 20F);

		bodyModel[589].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2329
		bodyModel[589].setRotationPoint(-28.25F, 2F, 20.5F);

		bodyModel[590].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2330
		bodyModel[590].setRotationPoint(-64F, 2F, 20.5F);

		bodyModel[591].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2331
		bodyModel[591].setRotationPoint(-64F, 2F, 20F);

		bodyModel[592].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2332
		bodyModel[592].setRotationPoint(-8.25F, 2F, 20.5F);

		bodyModel[593].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2333
		bodyModel[593].setRotationPoint(-8.25F, 2F, 20F);

		bodyModel[594].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2334
		bodyModel[594].setRotationPoint(11.5F, 2F, 20.5F);

		bodyModel[595].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2335
		bodyModel[595].setRotationPoint(11.5F, 2F, 20F);

		bodyModel[596].addShapeBox(-1F, -1F, -0.5F, 2, 2, 10, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2336
		bodyModel[596].setRotationPoint(32F, 2F, 20.5F);

		bodyModel[597].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 2, 4, 4, 16, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 2337
		bodyModel[597].setRotationPoint(32F, 2F, 20F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 799, 188, textureX, textureY); // Box 740
		turretModel[1] = new ModelRendererTurbo(this, 696, 218, textureX, textureY); // Box 532
		turretModel[2] = new ModelRendererTurbo(this, 806, 133, textureX, textureY); // Box 533
		turretModel[3] = new ModelRendererTurbo(this, 915, 126, textureX, textureY); // Box 534
		turretModel[4] = new ModelRendererTurbo(this, 736, 152, textureX, textureY); // Box 535
		turretModel[5] = new ModelRendererTurbo(this, 922, 170, textureX, textureY); // Box 537
		turretModel[6] = new ModelRendererTurbo(this, 948, 208, textureX, textureY); // Box 538
		turretModel[7] = new ModelRendererTurbo(this, 944, 249, textureX, textureY); // Box 539
		turretModel[8] = new ModelRendererTurbo(this, 903, 253, textureX, textureY); // Box 540
		turretModel[9] = new ModelRendererTurbo(this, 865, 260, textureX, textureY); // Box 541
		turretModel[10] = new ModelRendererTurbo(this, 739, 321, textureX, textureY); // Box 542
		turretModel[11] = new ModelRendererTurbo(this, 767, 323, textureX, textureY); // Box 543
		turretModel[12] = new ModelRendererTurbo(this, 911, 331, textureX, textureY); // Box 544
		turretModel[13] = new ModelRendererTurbo(this, 767, 101, textureX, textureY); // Box 545
		turretModel[14] = new ModelRendererTurbo(this, 756, 324, textureX, textureY); // Box 546
		turretModel[15] = new ModelRendererTurbo(this, 896, 329, textureX, textureY); // Box 547
		turretModel[16] = new ModelRendererTurbo(this, 865, 325, textureX, textureY); // Box 548
		turretModel[17] = new ModelRendererTurbo(this, 850, 324, textureX, textureY); // Box 549
		turretModel[18] = new ModelRendererTurbo(this, 782, 324, textureX, textureY); // Box 567
		turretModel[19] = new ModelRendererTurbo(this, 833, 320, textureX, textureY); // Box 568
		turretModel[20] = new ModelRendererTurbo(this, 718, 293, textureX, textureY); // Box 569
		turretModel[21] = new ModelRendererTurbo(this, 884, 307, textureX, textureY); // Box 570
		turretModel[22] = new ModelRendererTurbo(this, 808, 86, textureX, textureY); // Box 571
		turretModel[23] = new ModelRendererTurbo(this, 871, 85, textureX, textureY); // Box 573
		turretModel[24] = new ModelRendererTurbo(this, 732, 104, textureX, textureY); // Box 574
		turretModel[25] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 39
		turretModel[26] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 42
		turretModel[27] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 53
		turretModel[28] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 54
		turretModel[29] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 55
		turretModel[30] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 56
		turretModel[31] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 43
		turretModel[32] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 44
		turretModel[33] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 45
		turretModel[34] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 46
		turretModel[35] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 47
		turretModel[36] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 48
		turretModel[37] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 49
		turretModel[38] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 50
		turretModel[39] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 51
		turretModel[40] = new ModelRendererTurbo(this, 369, 377, textureX, textureY); // Box 106
		turretModel[41] = new ModelRendererTurbo(this, 385, 377, textureX, textureY); // Box 107
		turretModel[42] = new ModelRendererTurbo(this, 401, 377, textureX, textureY); // Box 108
		turretModel[43] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 604
		turretModel[44] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 605
		turretModel[45] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 606
		turretModel[46] = new ModelRendererTurbo(this, 716, 270, textureX, textureY); // Box 607
		turretModel[47] = new ModelRendererTurbo(this, 825, 256, textureX, textureY); // Box 602
		turretModel[48] = new ModelRendererTurbo(this, 785, 256, textureX, textureY); // Box 603
		turretModel[49] = new ModelRendererTurbo(this, 854, 83, textureX, textureY); // Box 604
		turretModel[50] = new ModelRendererTurbo(this, 837, 84, textureX, textureY); // Box 605
		turretModel[51] = new ModelRendererTurbo(this, 821, 84, textureX, textureY); // Box 606
		turretModel[52] = new ModelRendererTurbo(this, 880, 331, textureX, textureY); // Box 607
		turretModel[53] = new ModelRendererTurbo(this, 847, 93, textureX, textureY); // Box 608
		turretModel[54] = new ModelRendererTurbo(this, 860, 93, textureX, textureY); // Box 609
		turretModel[55] = new ModelRendererTurbo(this, 703, 184, textureX, textureY); // Box 146
		turretModel[56] = new ModelRendererTurbo(this, 703, 194, textureX, textureY); // Box 147
		turretModel[57] = new ModelRendererTurbo(this, 703, 194, textureX, textureY); // Box 148
		turretModel[58] = new ModelRendererTurbo(this, 703, 184, textureX, textureY); // Box 547
		turretModel[59] = new ModelRendererTurbo(this, 703, 194, textureX, textureY); // Box 548
		turretModel[60] = new ModelRendererTurbo(this, 703, 194, textureX, textureY); // Box 549
		turretModel[61] = new ModelRendererTurbo(this, 703, 184, textureX, textureY); // Box 550
		turretModel[62] = new ModelRendererTurbo(this, 703, 194, textureX, textureY); // Box 551
		turretModel[63] = new ModelRendererTurbo(this, 703, 194, textureX, textureY); // Box 552
		turretModel[64] = new ModelRendererTurbo(this, 703, 194, textureX, textureY); // Box 553
		turretModel[65] = new ModelRendererTurbo(this, 703, 184, textureX, textureY); // Box 554
		turretModel[66] = new ModelRendererTurbo(this, 703, 194, textureX, textureY); // Box 555
		turretModel[67] = new ModelRendererTurbo(this, 703, 194, textureX, textureY); // Box 556
		turretModel[68] = new ModelRendererTurbo(this, 703, 184, textureX, textureY); // Box 557
		turretModel[69] = new ModelRendererTurbo(this, 703, 194, textureX, textureY); // Box 558
		turretModel[70] = new ModelRendererTurbo(this, 703, 194, textureX, textureY); // Box 559
		turretModel[71] = new ModelRendererTurbo(this, 703, 184, textureX, textureY); // Box 560
		turretModel[72] = new ModelRendererTurbo(this, 703, 194, textureX, textureY); // Box 561
		turretModel[73] = new ModelRendererTurbo(this, 521, 292, textureX, textureY); // Box 0
		turretModel[74] = new ModelRendererTurbo(this, 521, 292, textureX, textureY); // Box 563
		turretModel[75] = new ModelRendererTurbo(this, 836, 94, textureX, textureY); // Box 657
		turretModel[76] = new ModelRendererTurbo(this, 741, 128, textureX, textureY); // Box 681
		turretModel[77] = new ModelRendererTurbo(this, 852, 108, textureX, textureY); // Box 682

		turretModel[0].addShapeBox(-19.5F, 0F, -14F, 42, 32, 28, 0F,0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F); // Box 740
		turretModel[0].setRotationPoint(0F, -75F, 0F);

		turretModel[1].addShapeBox(-19.5F, 0F, -28F, 42, 32, 6, 0F,0F, 0F, -2F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		turretModel[1].setRotationPoint(0F, -75F, 0F);

		turretModel[2].addShapeBox(-19.5F, 0F, 22F, 42, 32, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, -2F); // Box 533
		turretModel[2].setRotationPoint(0F, -75F, 0F);

		turretModel[3].addShapeBox(-33.5F, 0F, 22F, 14, 29, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -1.15F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, -1.15F); // Box 534
		turretModel[3].setRotationPoint(0F, -75F, 0F);

		turretModel[4].addShapeBox(-33.5F, 0F, -14F, 14, 29, 28, 0F,0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, -0.5F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, -0.5F, 8F); // Box 535
		turretModel[4].setRotationPoint(0F, -75F, 0F);

		turretModel[5].addShapeBox(-33.5F, 0F, -26F, 14, 29, 4, 0F,-0.1F, 0F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 537
		turretModel[5].setRotationPoint(0F, -75F, 0F);

		turretModel[6].addShapeBox(22.5F, 1F, -7.5F, 3, 22, 15, 0F,0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F); // Box 538
		turretModel[6].setRotationPoint(0F, -75F, 0F);

		turretModel[7].addShapeBox(25.5F, 1F, -7.5F, 3, 22, 15, 0F,0F, 0F, 8F, 0F, -2F, 8F, 0F, -2F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, -2F, 8F, 0F, -2F, 8F, 0F, 0F, 8F); // Box 539
		turretModel[7].setRotationPoint(0F, -75F, 0F);

		turretModel[8].addShapeBox(28.5F, 3F, -7.5F, 2, 18, 15, 0F,0F, 0F, 8F, 0F, -3F, 8F, 0F, -3F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, -3F, 8F, 0F, -3F, 8F, 0F, 0F, 8F); // Box 540
		turretModel[8].setRotationPoint(0F, -75F, 0F);

		turretModel[9].addShapeBox(30.5F, 6F, -7.5F, 1, 12, 15, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 541
		turretModel[9].setRotationPoint(0F, -75F, 0F);

		turretModel[10].addShapeBox(22.5F, 1F, -17.5F, 3, 22, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		turretModel[10].setRotationPoint(0F, -75F, 0F);

		turretModel[11].addShapeBox(25.5F, 1F, -17.5F, 3, 22, 2, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 543
		turretModel[11].setRotationPoint(0F, -75F, 0F);

		turretModel[12].addShapeBox(28.5F, 3F, -17.5F, 2, 18, 2, 0F,0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 544
		turretModel[12].setRotationPoint(0F, -75F, 0F);

		turretModel[13].addShapeBox(30.5F, 6F, -17.5F, 1, 12, 2, 0F,0F, -2F, 0F, 0F, -4F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 545
		turretModel[13].setRotationPoint(0F, -75F, 0F);

		turretModel[14].addShapeBox(30.5F, 6F, 15.5F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, -0.5F, 0F, -2F, 0F); // Box 546
		turretModel[14].setRotationPoint(0F, -75F, 0F);

		turretModel[15].addShapeBox(28.5F, 3F, 15.5F, 2, 18, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F); // Box 547
		turretModel[15].setRotationPoint(0F, -75F, 0F);

		turretModel[16].addShapeBox(25.5F, 1F, 15.5F, 3, 22, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F); // Box 548
		turretModel[16].setRotationPoint(0F, -75F, 0F);

		turretModel[17].addShapeBox(22.5F, 1F, 15.5F, 3, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 549
		turretModel[17].setRotationPoint(0F, -75F, 0F);

		turretModel[18].addShapeBox(22.5F, 5.25F, 17.5F, 1, 13, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 567
		turretModel[18].setRotationPoint(0F, -75F, 0F);

		turretModel[19].addShapeBox(22.5F, 5.25F, -21.5F, 1, 13, 4, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 568
		turretModel[19].setRotationPoint(0F, -75F, 0F);

		turretModel[20].addShapeBox(21.5F, -0.75F, -8F, 4, 2, 16, 0F,0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 1F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 1F, 0F, 8F); // Box 569
		turretModel[20].setRotationPoint(0F, -75F, 0F);

		turretModel[21].addShapeBox(25.5F, -0.75F, -8F, 3, 1, 16, 0F,0F, 0F, 8F, 0F, -1F, 8F, 0F, -1F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 1F, 8F, 0F, 1F, 8F, 0F, 0F, 8F); // Box 570
		turretModel[21].setRotationPoint(0F, -75F, 0F);

		turretModel[22].addShapeBox(25.5F, 1.25F, -8F, 3, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		turretModel[22].setRotationPoint(0F, -75F, 0F);

		turretModel[23].addShapeBox(25.5F, 1.25F, 7F, 3, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		turretModel[23].setRotationPoint(0F, -75F, 0F);

		turretModel[24].addShapeBox(28.5F, 0.25F, -8F, 1, 1, 16, 0F,0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F); // Box 574
		turretModel[24].setRotationPoint(0F, -75F, 0F);

		turretModel[25].addShapeBox(15F, -23F, -21.5F, 4, 2, 4, 0F,0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 39
		turretModel[25].setRotationPoint(0F, -54F, 0F);
		turretModel[25].rotateAngleY = -1.68424273F;

		turretModel[26].addShapeBox(28.5F, -23F, -12F, 4, 2, 4, 0F,0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 42
		turretModel[26].setRotationPoint(0F, -54F, 0F);
		turretModel[26].rotateAngleY = 3.14159265F;

		turretModel[27].addShapeBox(14.5F, -27F, 9F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F); // Box 53
		turretModel[27].setRotationPoint(0F, -51F, 0F);

		turretModel[28].addShapeBox(14.5F, -28F, 9F, 3, 1, 3, 0F,-0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		turretModel[28].setRotationPoint(0F, -51F, 0F);

		turretModel[29].addShapeBox(12.5F, -27F, -12F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F); // Box 55
		turretModel[29].setRotationPoint(0F, -51F, 0F);

		turretModel[30].addShapeBox(12.5F, -28F, -12F, 3, 1, 3, 0F,-0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		turretModel[30].setRotationPoint(0F, -51F, 0F);

		turretModel[31].addShapeBox(31.5F, -32.75F, -14F, 3, 2, 6, 0F,0.25F, 0F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0.25F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 43
		turretModel[31].setRotationPoint(0F, -37.25F, 0F);
		turretModel[31].rotateAngleY = -3.14159265F;

		turretModel[32].addShapeBox(31.5F, -30.75F, -14F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 44
		turretModel[32].setRotationPoint(0F, -37.25F, 0F);
		turretModel[32].rotateAngleY = -3.14159265F;

		turretModel[33].addShapeBox(31.5F, -28.75F, -14F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, 0F, -2F); // Box 45
		turretModel[33].setRotationPoint(0F, -37.25F, 0F);
		turretModel[33].rotateAngleY = -3.14159265F;

		turretModel[34].addShapeBox(34F, -28.75F, -14F, 2, 2, 6, 0F,-0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F, -0.45F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -0.45F, -0.25F, -1.75F); // Box 46
		turretModel[34].setRotationPoint(0F, -37.25F, 0F);
		turretModel[34].rotateAngleY = -3.14159265F;

		turretModel[35].addShapeBox(34F, -30.75F, -14F, 2, 2, 6, 0F,-0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F); // Box 47
		turretModel[35].setRotationPoint(0F, -37.25F, 0F);
		turretModel[35].rotateAngleY = -3.14159265F;

		turretModel[36].addShapeBox(34F, -32.75F, -14F, 2, 2, 6, 0F,-0.45F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -0.45F, -0.25F, -1.75F, -0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F); // Box 48
		turretModel[36].setRotationPoint(0F, -37.25F, 0F);
		turretModel[36].rotateAngleY = -3.14159265F;

		turretModel[37].addShapeBox(32F, -30F, -11.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[37].setRotationPoint(0F, -37.25F, 0F);
		turretModel[37].rotateAngleY = -3.14159265F;

		turretModel[38].addShapeBox(37.75F, -30.25F, -11.5F, 1, 2, 1, 0F,0F, -0.125F, 0.075F, 0F, -0.125F, 0.075F, 0F, -0.125F, 0.075F, 0F, -0.125F, 0.075F, 0F, 0.275F, 0.075F, 0F, 0.275F, 0.075F, 0F, 0.275F, 0.075F, 0F, 0.275F, 0.075F); // Box 50
		turretModel[38].setRotationPoint(0F, -37.25F, 0F);
		turretModel[38].rotateAngleY = -3.14159265F;

		turretModel[39].addShapeBox(33F, -29F, -11.5F, 6, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 51
		turretModel[39].setRotationPoint(0F, -37.25F, 0F);
		turretModel[39].rotateAngleY = -3.14159265F;

		turretModel[40].addShapeBox(-34F, -33F, 8F, 1, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		turretModel[40].setRotationPoint(0F, -37F, 0F);

		turretModel[41].addShapeBox(-34F, -29F, 8F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 107
		turretModel[41].setRotationPoint(0F, -37F, 0F);

		turretModel[42].addShapeBox(-34F, -31F, 8F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		turretModel[42].setRotationPoint(0F, -37F, 0F);

		turretModel[43].addShapeBox(-20F, 0F, -14F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 604
		turretModel[43].setRotationPoint(0F, -76F, 0F);

		turretModel[44].addBox(-22F, 0F, -14F, 2, 1, 6, 0F); // Box 605
		turretModel[44].setRotationPoint(0F, -76F, 0F);

		turretModel[45].addShapeBox(-24F, 0F, -14F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 606
		turretModel[45].setRotationPoint(0F, -76F, 0F);

		turretModel[46].addShapeBox(-30.5F, -0.5F, -7F, 14, 1, 14, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		turretModel[46].setRotationPoint(0F, -75F, 0F);

		turretModel[47].addShapeBox(-34.5F, 2F, -8F, 2, 17, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		turretModel[47].setRotationPoint(0F, -73F, 0F);

		turretModel[48].addShapeBox(-33.75F, 2F, -8F, 1, 17, 15, 0F,0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F); // Box 603
		turretModel[48].setRotationPoint(0F, -73F, 0F);

		turretModel[49].addShapeBox(-34.5F, 5F, -12F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		turretModel[49].setRotationPoint(0F, -73F, 0F);
		turretModel[49].rotateAngleY = -0.08726646F;

		turretModel[50].addShapeBox(-35F, 4F, -10.5F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		turretModel[50].setRotationPoint(0F, -73F, 0F);

		turretModel[51].addShapeBox(-35F, 4F, -8.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 606
		turretModel[51].setRotationPoint(0F, -73F, 0F);

		turretModel[52].addShapeBox(-35F, 14F, -8.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 607
		turretModel[52].setRotationPoint(0F, -73F, 0F);

		turretModel[53].addShapeBox(-35F, 14F, -10.5F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		turretModel[53].setRotationPoint(0F, -73F, 0F);

		turretModel[54].addShapeBox(-34.5F, 15F, -12F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		turretModel[54].setRotationPoint(0F, -73F, 0F);
		turretModel[54].rotateAngleY = -0.08726646F;

		turretModel[55].addShapeBox(2.5F, -4.5F, 30F, 9, 1, 1, 0F,0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 146
		turretModel[55].setRotationPoint(0F, -60F, 0F);
		turretModel[55].rotateAngleY = -0.38397244F;

		turretModel[56].addShapeBox(11.5F, -4.5F, 29F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 147
		turretModel[56].setRotationPoint(0F, -60F, 0F);
		turretModel[56].rotateAngleY = -0.38397244F;

		turretModel[57].addShapeBox(1.5F, -4.5F, 29F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 148
		turretModel[57].setRotationPoint(0F, -60F, 0F);
		turretModel[57].rotateAngleY = -0.38397244F;

		turretModel[58].addShapeBox(2.5F, -12F, 30F, 9, 1, 1, 0F,0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 547
		turretModel[58].setRotationPoint(0F, -60F, 0F);
		turretModel[58].rotateAngleY = -0.38397244F;

		turretModel[59].addShapeBox(11.5F, -12F, 29F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 548
		turretModel[59].setRotationPoint(0F, -60F, 0F);
		turretModel[59].rotateAngleY = -0.38397244F;

		turretModel[60].addShapeBox(1.5F, -12F, 29F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 549
		turretModel[60].setRotationPoint(0F, -60F, 0F);
		turretModel[60].rotateAngleY = -0.38397244F;

		turretModel[61].addShapeBox(2.5F, 3F, 30F, 9, 1, 1, 0F,0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 550
		turretModel[61].setRotationPoint(0F, -60F, 0F);
		turretModel[61].rotateAngleY = -0.38397244F;

		turretModel[62].addShapeBox(11.5F, 3F, 29F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 551
		turretModel[62].setRotationPoint(0F, -60F, 0F);
		turretModel[62].rotateAngleY = -0.38397244F;

		turretModel[63].addShapeBox(1.5F, 3F, 29F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 552
		turretModel[63].setRotationPoint(0F, -60F, 0F);
		turretModel[63].rotateAngleY = -0.38397244F;

		turretModel[64].addShapeBox(11.5F, -12F, -31F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 553
		turretModel[64].setRotationPoint(0F, -60F, 0F);
		turretModel[64].rotateAngleY = 0.38397244F;

		turretModel[65].addShapeBox(2.5F, -12F, -31F, 9, 1, 1, 0F,0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 554
		turretModel[65].setRotationPoint(0F, -60F, 0F);
		turretModel[65].rotateAngleY = 0.38397244F;

		turretModel[66].addShapeBox(1.5F, -12F, -31F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 555
		turretModel[66].setRotationPoint(0F, -60F, 0F);
		turretModel[66].rotateAngleY = 0.38397244F;

		turretModel[67].addShapeBox(1.5F, -4.5F, -31F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 556
		turretModel[67].setRotationPoint(0F, -60F, 0F);
		turretModel[67].rotateAngleY = 0.38397244F;

		turretModel[68].addShapeBox(2.5F, -4.5F, -31F, 9, 1, 1, 0F,0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 557
		turretModel[68].setRotationPoint(0F, -60F, 0F);
		turretModel[68].rotateAngleY = 0.38397244F;

		turretModel[69].addShapeBox(11.5F, -4.5F, -31F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 558
		turretModel[69].setRotationPoint(0F, -60F, 0F);
		turretModel[69].rotateAngleY = 0.38397244F;

		turretModel[70].addShapeBox(11.5F, 3F, -31F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 559
		turretModel[70].setRotationPoint(0F, -60F, 0F);
		turretModel[70].rotateAngleY = 0.38397244F;

		turretModel[71].addShapeBox(2.5F, 3F, -31F, 9, 1, 1, 0F,0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 560
		turretModel[71].setRotationPoint(0F, -60F, 0F);
		turretModel[71].rotateAngleY = 0.38397244F;

		turretModel[72].addShapeBox(1.5F, 3F, -31F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 561
		turretModel[72].setRotationPoint(0F, -60F, 0F);
		turretModel[72].rotateAngleY = 0.38397244F;

		turretModel[73].addShapeBox(-28F, -17F, 26.5F, 41, 41, 1, 0F,0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, -35F, -35F, 0F, -35F, -35F, 0F, 0F, -35F, 0F); // Box 0
		turretModel[73].setRotationPoint(0F, -40F, 0F);
		turretModel[73].rotateAngleY = 0.06981317F;

		turretModel[74].addShapeBox(-28F, -17F, -27.5F, 41, 41, 1, 0F,0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, -35F, -35F, 0F, -35F, -35F, 0F, 0F, -35F, 0F); // Box 563
		turretModel[74].setRotationPoint(0F, -40F, 0F);
		turretModel[74].rotateAngleY = -0.06981317F;

		turretModel[75].addShapeBox(-35F, 9F, 5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		turretModel[75].setRotationPoint(0F, -73F, 0F);

		turretModel[76].addShapeBox(-30F, 29F, -7F, 11, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 681
		turretModel[76].setRotationPoint(0F, -75F, 0F);

		turretModel[77].addShapeBox(-30F, 28F, -7F, 11, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 682
		turretModel[77].setRotationPoint(0F, -75F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 781, 105, textureX, textureY); // Box 565
		barrelModel[1] = new ModelRendererTurbo(this, 914, 303, textureX, textureY); // Box 566
		barrelModel[2] = new ModelRendererTurbo(this, 799, 318, textureX, textureY); // Box 550
		barrelModel[3] = new ModelRendererTurbo(this, 904, 98, textureX, textureY); // Box 553
		barrelModel[4] = new ModelRendererTurbo(this, 879, 88, textureX, textureY); // Box 554
		barrelModel[5] = new ModelRendererTurbo(this, 726, 158, textureX, textureY); // Box 555
		barrelModel[6] = new ModelRendererTurbo(this, 717, 136, textureX, textureY); // Box 557
		barrelModel[7] = new ModelRendererTurbo(this, 786, 83, textureX, textureY); // Box 558
		barrelModel[8] = new ModelRendererTurbo(this, 923, 315, textureX, textureY); // Box 559
		barrelModel[9] = new ModelRendererTurbo(this, 849, 306, textureX, textureY); // Box 560
		barrelModel[10] = new ModelRendererTurbo(this, 805, 301, textureX, textureY); // Box 561
		barrelModel[11] = new ModelRendererTurbo(this, 757, 308, textureX, textureY); // Box 563
		barrelModel[12] = new ModelRendererTurbo(this, 750, 291, textureX, textureY); // Box 564
		barrelModel[13] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 75
		barrelModel[14] = new ModelRendererTurbo(this, 849, 306, textureX, textureY); // Box 1450
		barrelModel[15] = new ModelRendererTurbo(this, 805, 301, textureX, textureY); // Box 1451
		barrelModel[16] = new ModelRendererTurbo(this, 750, 291, textureX, textureY); // Box 1452
		barrelModel[17] = new ModelRendererTurbo(this, 757, 308, textureX, textureY); // Box 1453
		barrelModel[18] = new ModelRendererTurbo(this, 781, 105, textureX, textureY); // Box 1454
		barrelModel[19] = new ModelRendererTurbo(this, 914, 303, textureX, textureY); // Box 1455

		barrelModel[0].addShapeBox(22.5F, -4F, 4F, 31, 6, 6, 0F,0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F); // Box 565
		barrelModel[0].setRotationPoint(22F, -64F, 0F);

		barrelModel[1].addShapeBox(53.5F, -4F, 4F, 2, 6, 6, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 566
		barrelModel[1].setRotationPoint(22F, -64F, 0F);

		barrelModel[2].addShapeBox(9.25F, -2.5F, -7F, 2, 5, 14, 0F,0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F); // Box 550
		barrelModel[2].setRotationPoint(22F, -64F, 0F);

		barrelModel[3].addShapeBox(9.25F, -5.5F, -7F, 2, 3, 14, 0F,1F, 0F, 8F, -1F, 0F, 8F, -1F, 0F, 8F, 1F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F); // Box 553
		barrelModel[3].setRotationPoint(22F, -64F, 0F);

		barrelModel[4].addShapeBox(8.25F, -8.5F, -7F, 2, 3, 14, 0F,2F, 0F, 8F, -2F, 0F, 8F, -2F, 0F, 8F, 2F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F); // Box 554
		barrelModel[4].setRotationPoint(22F, -64F, 0F);

		barrelModel[5].addShapeBox(6.25F, -10.5F, -7F, 2, 2, 14, 0F,2.5F, 0.25F, 8F, -3F, 1F, 8F, -3F, 1F, 8F, 2.5F, 0.25F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F); // Box 555
		barrelModel[5].setRotationPoint(22F, -64F, 0F);

		barrelModel[6].addShapeBox(9.25F, 2.5F, -7F, 2, 3, 14, 0F,0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 1F, 0F, 8F, -1F, 0F, 8F, -1F, 0F, 8F, 1F, 0F, 8F); // Box 557
		barrelModel[6].setRotationPoint(22F, -64F, 0F);

		barrelModel[7].addShapeBox(8.25F, 5.5F, -7F, 2, 3, 14, 0F,0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 2F, 0F, 8F, -2F, 0F, 8F, -2F, 0F, 8F, 2F, 0F, 8F); // Box 558
		barrelModel[7].setRotationPoint(22F, -64F, 0F);

		barrelModel[8].addShapeBox(6.25F, 8.5F, -7F, 2, 2, 14, 0F,0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 2.5F, 0.25F, 8F, -3F, 1F, 8F, -3F, 1F, 8F, 2.5F, 0.25F, 8F); // Box 559
		barrelModel[8].setRotationPoint(22F, -64F, 0F);

		barrelModel[9].addShapeBox(7.5F, -3.5F, 2.5F, 15, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		barrelModel[9].setRotationPoint(22F, -64F, 0F);

		barrelModel[10].addShapeBox(7.5F, -5.5F, 2.5F, 15, 2, 8, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		barrelModel[10].setRotationPoint(22F, -64F, 0F);

		barrelModel[11].addShapeBox(7.5F, 2.5F, 2.5F, 15, 4, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 563
		barrelModel[11].setRotationPoint(22F, -64F, 0F);

		barrelModel[12].addShapeBox(7.5F, -0.5F, 1.5F, 15, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		barrelModel[12].setRotationPoint(22F, -64F, 0F);

		barrelModel[13].addShapeBox(7.2F, -0.5F, -7.25F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, 0F, 0F); // Box 75
		barrelModel[13].setRotationPoint(21F, -67.25F, 0F);

		barrelModel[14].addShapeBox(7.5F, -3.5F, -9.5F, 15, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1450
		barrelModel[14].setRotationPoint(22F, -64F, 0F);

		barrelModel[15].addShapeBox(7.5F, -5.5F, -9.5F, 15, 2, 8, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1451
		barrelModel[15].setRotationPoint(22F, -64F, 0F);

		barrelModel[16].addShapeBox(7.5F, -0.5F, -10.5F, 15, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1452
		barrelModel[16].setRotationPoint(22F, -64F, 0F);

		barrelModel[17].addShapeBox(7.5F, 2.5F, -9.5F, 15, 4, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1453
		barrelModel[17].setRotationPoint(22F, -64F, 0F);

		barrelModel[18].addShapeBox(22.5F, -4F, -8F, 31, 6, 6, 0F,0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F); // Box 1454
		barrelModel[18].setRotationPoint(22F, -64F, 0F);

		barrelModel[19].addShapeBox(53.5F, -4F, -8F, 2, 6, 6, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 1455
		barrelModel[19].setRotationPoint(22F, -64F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 48
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 49
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 50
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 51
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 52
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 53
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 54
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 55
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 56
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 57
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 58
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 59
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 60
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 61
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 62
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 63
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 65
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 66
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 67
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 68
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 69
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 56, 465, textureX, textureY); // Shape 70
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 71
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 165, 391, textureX, textureY); // Shape 2
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 55, 482, textureX, textureY); // Shape 3
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 165, 391, textureX, textureY); // Shape 4
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 462, textureX, textureY); // Shape 5
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 26
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 27
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 28
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 29
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 31
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 32
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 33
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 34
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 36
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 37
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 38
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 39
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 788
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 670
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 671
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 672
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 673
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 674
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 675
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 676
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 677
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 678
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 679
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 680
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 681
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 682
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 683
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 684
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 685
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 686
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 687
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 688
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 689
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 690
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 56, 465, textureX, textureY); // Shape 691
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 692
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 697
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 698
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 699
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 700
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 701
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 702
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 703
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 704
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 705
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 706
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 707
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 708
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 709
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 56
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 57
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 58
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 59
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 60
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 61
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 62
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 63
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 65
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 66
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 67
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 68
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 69
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 56, 465, textureX, textureY); // Shape 70
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 71
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 31
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 32
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 33
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 34
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 36
		leftTrackWheelModels[96] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 37
		leftTrackWheelModels[97] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 38
		leftTrackWheelModels[98] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 39
		leftTrackWheelModels[99] = new ModelRendererTurbo(this, 0, 462, textureX, textureY); // Shape 5
		leftTrackWheelModels[100] = new ModelRendererTurbo(this, 151, 418, textureX, textureY); // Shape 6
		leftTrackWheelModels[101] = new ModelRendererTurbo(this, 55, 482, textureX, textureY); // Shape 7
		leftTrackWheelModels[102] = new ModelRendererTurbo(this, 151, 418, textureX, textureY); // Shape 8
		leftTrackWheelModels[103] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 788

		leftTrackWheelModels[0].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 48
		leftTrackWheelModels[0].setRotationPoint(147.5F, 2F, 25F);

		leftTrackWheelModels[1].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 49
		leftTrackWheelModels[1].setRotationPoint(147.5F, 2F, 25F);

		leftTrackWheelModels[2].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 50
		leftTrackWheelModels[2].setRotationPoint(147.5F, 2F, 25F);

		leftTrackWheelModels[3].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 51
		leftTrackWheelModels[3].setRotationPoint(147.5F, 2F, 25F);

		leftTrackWheelModels[4].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 52
		leftTrackWheelModels[4].setRotationPoint(127F, 2F, 25F);

		leftTrackWheelModels[5].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 53
		leftTrackWheelModels[5].setRotationPoint(127F, 2F, 25F);

		leftTrackWheelModels[6].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 54
		leftTrackWheelModels[6].setRotationPoint(127F, 2F, 25F);

		leftTrackWheelModels[7].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 55
		leftTrackWheelModels[7].setRotationPoint(127F, 2F, 25F);

		leftTrackWheelModels[8].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 56
		leftTrackWheelModels[8].setRotationPoint(107.25F, 2F, 25F);

		leftTrackWheelModels[9].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 57
		leftTrackWheelModels[9].setRotationPoint(107.25F, 2F, 25F);

		leftTrackWheelModels[10].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 58
		leftTrackWheelModels[10].setRotationPoint(107.25F, 2F, 25F);

		leftTrackWheelModels[11].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 59
		leftTrackWheelModels[11].setRotationPoint(107.25F, 2F, 25F);

		leftTrackWheelModels[12].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 60
		leftTrackWheelModels[12].setRotationPoint(87.25F, 2F, 25F);

		leftTrackWheelModels[13].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 61
		leftTrackWheelModels[13].setRotationPoint(87.25F, 2F, 25F);

		leftTrackWheelModels[14].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 62
		leftTrackWheelModels[14].setRotationPoint(87.25F, 2F, 25F);

		leftTrackWheelModels[15].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 63
		leftTrackWheelModels[15].setRotationPoint(87.25F, 2F, 25F);

		leftTrackWheelModels[16].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 65
		leftTrackWheelModels[16].setRotationPoint(68.5F, 2F, 25F);

		leftTrackWheelModels[17].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 66
		leftTrackWheelModels[17].setRotationPoint(68.5F, 2F, 25F);

		leftTrackWheelModels[18].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 67
		leftTrackWheelModels[18].setRotationPoint(68.5F, 2F, 25F);

		leftTrackWheelModels[19].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 68
		leftTrackWheelModels[19].setRotationPoint(51.5F, 2F, 25F);

		leftTrackWheelModels[20].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 69
		leftTrackWheelModels[20].setRotationPoint(51.5F, 2F, 25F);

		leftTrackWheelModels[21].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 70
		leftTrackWheelModels[21].setRotationPoint(51.5F, 2F, 25F);

		leftTrackWheelModels[22].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 71
		leftTrackWheelModels[22].setRotationPoint(51.5F, 2F, 25F);

		leftTrackWheelModels[23].addShape3D(7.5F, -7.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 3, 15, 15, 52, 3, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Shape 2
		leftTrackWheelModels[23].setRotationPoint(161F, -8.5F, 25F);

		leftTrackWheelModels[24].addShape3D(6F, -6F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 3
		leftTrackWheelModels[24].setRotationPoint(161.5F, -8.5F, 25F);

		leftTrackWheelModels[25].addShape3D(7.5F, -7.5F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 3, 15, 15, 52, 3, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Shape 4
		leftTrackWheelModels[25].setRotationPoint(161F, -8.5F, 25F);

		leftTrackWheelModels[26].addShape3D(6F, -6F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 1, 12, 12, 44, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 5
		leftTrackWheelModels[26].setRotationPoint(161.5F, -8.5F, 25F);

		leftTrackWheelModels[27].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 26
		leftTrackWheelModels[27].setRotationPoint(133.5F, -11.5F, 23F);

		leftTrackWheelModels[28].addShape3D(3.5F, -3.5F, -4F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 27
		leftTrackWheelModels[28].setRotationPoint(133.5F, -11.5F, 23F);

		leftTrackWheelModels[29].addShape3D(4.5F, -4.5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 28
		leftTrackWheelModels[29].setRotationPoint(133.5F, -11.5F, 23F);

		leftTrackWheelModels[30].addShape3D(3.5F, -3.5F, -7.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 29
		leftTrackWheelModels[30].setRotationPoint(133.5F, -11.5F, 23F);

		leftTrackWheelModels[31].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 31
		leftTrackWheelModels[31].setRotationPoint(93.5F, -11.5F, 23F);

		leftTrackWheelModels[32].addShape3D(3.5F, -3.5F, -4F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 32
		leftTrackWheelModels[32].setRotationPoint(93.5F, -11.5F, 23F);

		leftTrackWheelModels[33].addShape3D(4.5F, -4.5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 33
		leftTrackWheelModels[33].setRotationPoint(93.5F, -11.5F, 23F);

		leftTrackWheelModels[34].addShape3D(3.5F, -3.5F, -7.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 34
		leftTrackWheelModels[34].setRotationPoint(93.5F, -11.5F, 23F);

		leftTrackWheelModels[35].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 36
		leftTrackWheelModels[35].setRotationPoint(55.5F, -11.5F, 23F);

		leftTrackWheelModels[36].addShape3D(3.5F, -3.5F, -4F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 37
		leftTrackWheelModels[36].setRotationPoint(55.5F, -11.5F, 23F);

		leftTrackWheelModels[37].addShape3D(4.5F, -4.5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 38
		leftTrackWheelModels[37].setRotationPoint(55.5F, -11.5F, 23F);

		leftTrackWheelModels[38].addShape3D(3.5F, -3.5F, -7.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 39
		leftTrackWheelModels[38].setRotationPoint(55.5F, -11.5F, 23F);

		leftTrackWheelModels[39].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 788
		leftTrackWheelModels[39].setRotationPoint(68.5F, 2F, 25F);

		leftTrackWheelModels[40].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 670
		leftTrackWheelModels[40].setRotationPoint(32F, 2F, 25F);

		leftTrackWheelModels[41].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 671
		leftTrackWheelModels[41].setRotationPoint(32F, 2F, 25F);

		leftTrackWheelModels[42].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 672
		leftTrackWheelModels[42].setRotationPoint(32F, 2F, 25F);

		leftTrackWheelModels[43].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 673
		leftTrackWheelModels[43].setRotationPoint(32F, 2F, 25F);

		leftTrackWheelModels[44].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 674
		leftTrackWheelModels[44].setRotationPoint(11.5F, 2F, 25F);

		leftTrackWheelModels[45].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 675
		leftTrackWheelModels[45].setRotationPoint(11.5F, 2F, 25F);

		leftTrackWheelModels[46].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 676
		leftTrackWheelModels[46].setRotationPoint(11.5F, 2F, 25F);

		leftTrackWheelModels[47].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 677
		leftTrackWheelModels[47].setRotationPoint(11.5F, 2F, 25F);

		leftTrackWheelModels[48].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 678
		leftTrackWheelModels[48].setRotationPoint(-8.25F, 2F, 25F);

		leftTrackWheelModels[49].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 679
		leftTrackWheelModels[49].setRotationPoint(-8.25F, 2F, 25F);

		leftTrackWheelModels[50].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 680
		leftTrackWheelModels[50].setRotationPoint(-8.25F, 2F, 25F);

		leftTrackWheelModels[51].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 681
		leftTrackWheelModels[51].setRotationPoint(-8.25F, 2F, 25F);

		leftTrackWheelModels[52].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 682
		leftTrackWheelModels[52].setRotationPoint(-28.25F, 2F, 25F);

		leftTrackWheelModels[53].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 683
		leftTrackWheelModels[53].setRotationPoint(-28.25F, 2F, 25F);

		leftTrackWheelModels[54].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 684
		leftTrackWheelModels[54].setRotationPoint(-28.25F, 2F, 25F);

		leftTrackWheelModels[55].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 685
		leftTrackWheelModels[55].setRotationPoint(-28.25F, 2F, 25F);

		leftTrackWheelModels[56].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 686
		leftTrackWheelModels[56].setRotationPoint(-47F, 2F, 25F);

		leftTrackWheelModels[57].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 687
		leftTrackWheelModels[57].setRotationPoint(-47F, 2F, 25F);

		leftTrackWheelModels[58].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 688
		leftTrackWheelModels[58].setRotationPoint(-47F, 2F, 25F);

		leftTrackWheelModels[59].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 689
		leftTrackWheelModels[59].setRotationPoint(-64F, 2F, 25F);

		leftTrackWheelModels[60].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 690
		leftTrackWheelModels[60].setRotationPoint(-64F, 2F, 25F);

		leftTrackWheelModels[61].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 691
		leftTrackWheelModels[61].setRotationPoint(-64F, 2F, 25F);

		leftTrackWheelModels[62].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 692
		leftTrackWheelModels[62].setRotationPoint(-64F, 2F, 25F);

		leftTrackWheelModels[63].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 697
		leftTrackWheelModels[63].setRotationPoint(18F, -11.5F, 23F);

		leftTrackWheelModels[64].addShape3D(3.5F, -3.5F, -4F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 698
		leftTrackWheelModels[64].setRotationPoint(18F, -11.5F, 23F);

		leftTrackWheelModels[65].addShape3D(4.5F, -4.5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 699
		leftTrackWheelModels[65].setRotationPoint(18F, -11.5F, 23F);

		leftTrackWheelModels[66].addShape3D(3.5F, -3.5F, -7.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 700
		leftTrackWheelModels[66].setRotationPoint(18F, -11.5F, 23F);

		leftTrackWheelModels[67].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 701
		leftTrackWheelModels[67].setRotationPoint(-22F, -11.5F, 23F);

		leftTrackWheelModels[68].addShape3D(3.5F, -3.5F, -4F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 702
		leftTrackWheelModels[68].setRotationPoint(-22F, -11.5F, 23F);

		leftTrackWheelModels[69].addShape3D(4.5F, -4.5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 703
		leftTrackWheelModels[69].setRotationPoint(-22F, -11.5F, 23F);

		leftTrackWheelModels[70].addShape3D(3.5F, -3.5F, -7.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 704
		leftTrackWheelModels[70].setRotationPoint(-22F, -11.5F, 23F);

		leftTrackWheelModels[71].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 705
		leftTrackWheelModels[71].setRotationPoint(-60F, -11.5F, 23F);

		leftTrackWheelModels[72].addShape3D(3.5F, -3.5F, -4F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 706
		leftTrackWheelModels[72].setRotationPoint(-60F, -11.5F, 23F);

		leftTrackWheelModels[73].addShape3D(4.5F, -4.5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 707
		leftTrackWheelModels[73].setRotationPoint(-60F, -11.5F, 23F);

		leftTrackWheelModels[74].addShape3D(3.5F, -3.5F, -7.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 708
		leftTrackWheelModels[74].setRotationPoint(-60F, -11.5F, 23F);

		leftTrackWheelModels[75].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 709
		leftTrackWheelModels[75].setRotationPoint(-47F, 2F, 25F);

		leftTrackWheelModels[76].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 56
		leftTrackWheelModels[76].setRotationPoint(-84.75F, 2F, 25F);

		leftTrackWheelModels[77].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 57
		leftTrackWheelModels[77].setRotationPoint(-84.75F, 2F, 25F);

		leftTrackWheelModels[78].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 58
		leftTrackWheelModels[78].setRotationPoint(-84.75F, 2F, 25F);

		leftTrackWheelModels[79].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 59
		leftTrackWheelModels[79].setRotationPoint(-84.75F, 2F, 25F);

		leftTrackWheelModels[80].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 60
		leftTrackWheelModels[80].setRotationPoint(-104.75F, 2F, 25F);

		leftTrackWheelModels[81].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 61
		leftTrackWheelModels[81].setRotationPoint(-104.75F, 2F, 25F);

		leftTrackWheelModels[82].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 62
		leftTrackWheelModels[82].setRotationPoint(-104.75F, 2F, 25F);

		leftTrackWheelModels[83].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 63
		leftTrackWheelModels[83].setRotationPoint(-104.75F, 2F, 25F);

		leftTrackWheelModels[84].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 65
		leftTrackWheelModels[84].setRotationPoint(-123.5F, 2F, 25F);

		leftTrackWheelModels[85].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 66
		leftTrackWheelModels[85].setRotationPoint(-123.5F, 2F, 25F);

		leftTrackWheelModels[86].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 67
		leftTrackWheelModels[86].setRotationPoint(-123.5F, 2F, 25F);

		leftTrackWheelModels[87].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 68
		leftTrackWheelModels[87].setRotationPoint(-140.5F, 2F, 25F);

		leftTrackWheelModels[88].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 69
		leftTrackWheelModels[88].setRotationPoint(-140.5F, 2F, 25F);

		leftTrackWheelModels[89].addShape3D(5F, -5F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 70
		leftTrackWheelModels[89].setRotationPoint(-140.5F, 2F, 25F);

		leftTrackWheelModels[90].addShape3D(6F, -6F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 71
		leftTrackWheelModels[90].setRotationPoint(-140.5F, 2F, 25F);

		leftTrackWheelModels[91].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 31
		leftTrackWheelModels[91].setRotationPoint(-98.5F, -11.5F, 23F);

		leftTrackWheelModels[92].addShape3D(3.5F, -3.5F, -4F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 32
		leftTrackWheelModels[92].setRotationPoint(-98.5F, -11.5F, 23F);

		leftTrackWheelModels[93].addShape3D(4.5F, -4.5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 33
		leftTrackWheelModels[93].setRotationPoint(-98.5F, -11.5F, 23F);

		leftTrackWheelModels[94].addShape3D(3.5F, -3.5F, -7.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 34
		leftTrackWheelModels[94].setRotationPoint(-98.5F, -11.5F, 23F);

		leftTrackWheelModels[95].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 36
		leftTrackWheelModels[95].setRotationPoint(-136.5F, -11.5F, 23F);

		leftTrackWheelModels[96].addShape3D(3.5F, -3.5F, -4F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 37
		leftTrackWheelModels[96].setRotationPoint(-136.5F, -11.5F, 23F);

		leftTrackWheelModels[97].addShape3D(4.5F, -4.5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 38
		leftTrackWheelModels[97].setRotationPoint(-136.5F, -11.5F, 23F);

		leftTrackWheelModels[98].addShape3D(3.5F, -3.5F, -7.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 39
		leftTrackWheelModels[98].setRotationPoint(-136.5F, -11.5F, 23F);

		leftTrackWheelModels[99].addShape3D(6F, -6F, -10.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 5
		leftTrackWheelModels[99].setRotationPoint(-158.75F, -6.25F, 20F);

		leftTrackWheelModels[100].addShape3D(7.5F, -7.5F, -10F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Shape 6
		leftTrackWheelModels[100].setRotationPoint(-158.75F, -6.25F, 20F);

		leftTrackWheelModels[101].addShape3D(6F, -6F, -9F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 5, 12, 12, 40, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 7
		leftTrackWheelModels[101].setRotationPoint(-158.75F, -6.25F, 20F);

		leftTrackWheelModels[102].addShape3D(7.5F, -7.5F, -4.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Shape 8
		leftTrackWheelModels[102].setRotationPoint(-158.75F, -6.25F, 20F);

		leftTrackWheelModels[103].addShape3D(5F, -5F, -6.75F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 788
		leftTrackWheelModels[103].setRotationPoint(-123.5F, 2F, 25F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 0
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 1
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 2
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 3
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 4
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 5
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 6
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 7
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 8
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 9
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 10
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 11
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 12
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 13
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 14
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 15
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 16
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 17
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 18
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 19
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 20
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 21
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 22
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 23
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 0, 462, textureX, textureY); // Shape 6
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 165, 391, textureX, textureY); // Shape 7
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 55, 482, textureX, textureY); // Shape 8
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 165, 391, textureX, textureY); // Shape 9
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 11
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 12
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 13
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 14
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 15
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 16
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 18
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 19
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 20
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 22
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 23
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 24
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 710
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 711
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 712
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 713
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 714
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 715
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 716
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 717
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 718
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 719
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 720
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 721
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 722
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 723
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 724
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 725
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 726
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 727
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 728
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 729
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 730
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 731
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 732
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 733
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 738
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 739
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 740
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 741
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 742
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 743
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 744
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 745
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 746
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 747
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 748
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 749
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 8
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 9
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 10
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 11
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 12
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 13
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 14
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 15
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 16
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 17
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 18
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 19
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 13, 433, textureX, textureY); // Shape 20
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 21
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 56, 464, textureX, textureY); // Shape 22
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 63, 391, textureX, textureY); // Shape 23
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 14
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 15
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 16
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 117, 395, textureX, textureY); // Shape 18
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 0, 391, textureX, textureY); // Shape 19
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 107, 420, textureX, textureY); // Shape 20
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 22
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 0, 446, textureX, textureY); // Shape 23
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 151, 418, textureX, textureY); // Shape 0
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 55, 482, textureX, textureY); // Shape 1
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 151, 418, textureX, textureY); // Shape 2
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 0, 462, textureX, textureY); // Shape 4

		rightTrackWheelModels[0].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 0
		rightTrackWheelModels[0].setRotationPoint(147.5F, 2F, -25F);

		rightTrackWheelModels[1].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 1
		rightTrackWheelModels[1].setRotationPoint(147.5F, 2F, -25F);

		rightTrackWheelModels[2].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 2
		rightTrackWheelModels[2].setRotationPoint(147.5F, 2F, -25F);

		rightTrackWheelModels[3].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 3
		rightTrackWheelModels[3].setRotationPoint(147.5F, 2F, -25F);

		rightTrackWheelModels[4].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 4
		rightTrackWheelModels[4].setRotationPoint(127F, 2F, -25F);

		rightTrackWheelModels[5].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 5
		rightTrackWheelModels[5].setRotationPoint(127F, 2F, -25F);

		rightTrackWheelModels[6].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 6
		rightTrackWheelModels[6].setRotationPoint(127F, 2F, -25F);

		rightTrackWheelModels[7].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 7
		rightTrackWheelModels[7].setRotationPoint(127F, 2F, -25F);

		rightTrackWheelModels[8].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 8
		rightTrackWheelModels[8].setRotationPoint(107.25F, 2F, -25F);

		rightTrackWheelModels[9].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 9
		rightTrackWheelModels[9].setRotationPoint(107.25F, 2F, -25F);

		rightTrackWheelModels[10].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 10
		rightTrackWheelModels[10].setRotationPoint(107.25F, 2F, -25F);

		rightTrackWheelModels[11].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 11
		rightTrackWheelModels[11].setRotationPoint(107.25F, 2F, -25F);

		rightTrackWheelModels[12].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 12
		rightTrackWheelModels[12].setRotationPoint(87.25F, 2F, -25F);

		rightTrackWheelModels[13].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 13
		rightTrackWheelModels[13].setRotationPoint(87.25F, 2F, -25F);

		rightTrackWheelModels[14].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 14
		rightTrackWheelModels[14].setRotationPoint(87.25F, 2F, -25F);

		rightTrackWheelModels[15].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 15
		rightTrackWheelModels[15].setRotationPoint(87.25F, 2F, -25F);

		rightTrackWheelModels[16].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 16
		rightTrackWheelModels[16].setRotationPoint(68.5F, 2F, -25F);

		rightTrackWheelModels[17].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 17
		rightTrackWheelModels[17].setRotationPoint(68.5F, 2F, -25F);

		rightTrackWheelModels[18].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 18
		rightTrackWheelModels[18].setRotationPoint(68.5F, 2F, -25F);

		rightTrackWheelModels[19].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 19
		rightTrackWheelModels[19].setRotationPoint(68.5F, 2F, -25F);

		rightTrackWheelModels[20].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 20
		rightTrackWheelModels[20].setRotationPoint(51.5F, 2F, -25F);

		rightTrackWheelModels[21].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 21
		rightTrackWheelModels[21].setRotationPoint(51.5F, 2F, -25F);

		rightTrackWheelModels[22].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 22
		rightTrackWheelModels[22].setRotationPoint(51.5F, 2F, -25F);

		rightTrackWheelModels[23].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 23
		rightTrackWheelModels[23].setRotationPoint(51.5F, 2F, -25F);

		rightTrackWheelModels[24].addShape3D(6F, -6F, 6F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 1, 12, 12, 44, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 6
		rightTrackWheelModels[24].setRotationPoint(161.5F, -8.5F, -25F);

		rightTrackWheelModels[25].addShape3D(7.5F, -7.5F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 3, 15, 15, 52, 3, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Shape 7
		rightTrackWheelModels[25].setRotationPoint(161F, -8.5F, -25F);

		rightTrackWheelModels[26].addShape3D(6F, -6F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 8
		rightTrackWheelModels[26].setRotationPoint(161.5F, -8.5F, -25F);

		rightTrackWheelModels[27].addShape3D(7.5F, -7.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 3, 15, 15, 52, 3, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Shape 9
		rightTrackWheelModels[27].setRotationPoint(161F, -8.5F, -25F);

		rightTrackWheelModels[28].addShape3D(3.5F, -3.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 11
		rightTrackWheelModels[28].setRotationPoint(133.5F, -11.5F, -26F);

		rightTrackWheelModels[29].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 12
		rightTrackWheelModels[29].setRotationPoint(133.5F, -11.5F, -26F);

		rightTrackWheelModels[30].addShape3D(4.5F, -4.5F, 2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 13
		rightTrackWheelModels[30].setRotationPoint(133.5F, -11.5F, -26F);

		rightTrackWheelModels[31].addShape3D(4.5F, -4.5F, 2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 14
		rightTrackWheelModels[31].setRotationPoint(93.5F, -11.5F, -26F);

		rightTrackWheelModels[32].addShape3D(3.5F, -3.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 15
		rightTrackWheelModels[32].setRotationPoint(93.5F, -11.5F, -26F);

		rightTrackWheelModels[33].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 16
		rightTrackWheelModels[33].setRotationPoint(93.5F, -11.5F, -26F);

		rightTrackWheelModels[34].addShape3D(4.5F, -4.5F, 2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 18
		rightTrackWheelModels[34].setRotationPoint(55.5F, -11.5F, -26F);

		rightTrackWheelModels[35].addShape3D(3.5F, -3.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 19
		rightTrackWheelModels[35].setRotationPoint(55.5F, -11.5F, -26F);

		rightTrackWheelModels[36].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 20
		rightTrackWheelModels[36].setRotationPoint(55.5F, -11.5F, -26F);

		rightTrackWheelModels[37].addShape3D(3.5F, -3.5F, 4.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 22
		rightTrackWheelModels[37].setRotationPoint(55.5F, -11.5F, -26F);

		rightTrackWheelModels[38].addShape3D(3.5F, -3.5F, 4.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 23
		rightTrackWheelModels[38].setRotationPoint(93.5F, -11.5F, -26F);

		rightTrackWheelModels[39].addShape3D(3.5F, -3.5F, 4.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 24
		rightTrackWheelModels[39].setRotationPoint(133.5F, -11.5F, -26F);

		rightTrackWheelModels[40].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 710
		rightTrackWheelModels[40].setRotationPoint(32F, 2F, -25F);

		rightTrackWheelModels[41].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 711
		rightTrackWheelModels[41].setRotationPoint(32F, 2F, -25F);

		rightTrackWheelModels[42].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 712
		rightTrackWheelModels[42].setRotationPoint(32F, 2F, -25F);

		rightTrackWheelModels[43].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 713
		rightTrackWheelModels[43].setRotationPoint(32F, 2F, -25F);

		rightTrackWheelModels[44].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 714
		rightTrackWheelModels[44].setRotationPoint(11.5F, 2F, -25F);

		rightTrackWheelModels[45].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 715
		rightTrackWheelModels[45].setRotationPoint(11.5F, 2F, -25F);

		rightTrackWheelModels[46].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 716
		rightTrackWheelModels[46].setRotationPoint(11.5F, 2F, -25F);

		rightTrackWheelModels[47].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 717
		rightTrackWheelModels[47].setRotationPoint(11.5F, 2F, -25F);

		rightTrackWheelModels[48].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 718
		rightTrackWheelModels[48].setRotationPoint(-8.25F, 2F, -25F);

		rightTrackWheelModels[49].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 719
		rightTrackWheelModels[49].setRotationPoint(-8.25F, 2F, -25F);

		rightTrackWheelModels[50].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 720
		rightTrackWheelModels[50].setRotationPoint(-8.25F, 2F, -25F);

		rightTrackWheelModels[51].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 721
		rightTrackWheelModels[51].setRotationPoint(-8.25F, 2F, -25F);

		rightTrackWheelModels[52].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 722
		rightTrackWheelModels[52].setRotationPoint(-28.25F, 2F, -25F);

		rightTrackWheelModels[53].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 723
		rightTrackWheelModels[53].setRotationPoint(-28.25F, 2F, -25F);

		rightTrackWheelModels[54].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 724
		rightTrackWheelModels[54].setRotationPoint(-28.25F, 2F, -25F);

		rightTrackWheelModels[55].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 725
		rightTrackWheelModels[55].setRotationPoint(-28.25F, 2F, -25F);

		rightTrackWheelModels[56].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 726
		rightTrackWheelModels[56].setRotationPoint(-47F, 2F, -25F);

		rightTrackWheelModels[57].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 727
		rightTrackWheelModels[57].setRotationPoint(-47F, 2F, -25F);

		rightTrackWheelModels[58].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 728
		rightTrackWheelModels[58].setRotationPoint(-47F, 2F, -25F);

		rightTrackWheelModels[59].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 729
		rightTrackWheelModels[59].setRotationPoint(-47F, 2F, -25F);

		rightTrackWheelModels[60].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 730
		rightTrackWheelModels[60].setRotationPoint(-64F, 2F, -25F);

		rightTrackWheelModels[61].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 731
		rightTrackWheelModels[61].setRotationPoint(-64F, 2F, -25F);

		rightTrackWheelModels[62].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 732
		rightTrackWheelModels[62].setRotationPoint(-64F, 2F, -25F);

		rightTrackWheelModels[63].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 733
		rightTrackWheelModels[63].setRotationPoint(-64F, 2F, -25F);

		rightTrackWheelModels[64].addShape3D(3.5F, -3.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 738
		rightTrackWheelModels[64].setRotationPoint(18F, -11.5F, -26F);

		rightTrackWheelModels[65].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 739
		rightTrackWheelModels[65].setRotationPoint(18F, -11.5F, -26F);

		rightTrackWheelModels[66].addShape3D(4.5F, -4.5F, 2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 740
		rightTrackWheelModels[66].setRotationPoint(18F, -11.5F, -26F);

		rightTrackWheelModels[67].addShape3D(4.5F, -4.5F, 2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 741
		rightTrackWheelModels[67].setRotationPoint(-22F, -11.5F, -26F);

		rightTrackWheelModels[68].addShape3D(3.5F, -3.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 742
		rightTrackWheelModels[68].setRotationPoint(-22F, -11.5F, -26F);

		rightTrackWheelModels[69].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 743
		rightTrackWheelModels[69].setRotationPoint(-22F, -11.5F, -26F);

		rightTrackWheelModels[70].addShape3D(4.5F, -4.5F, 2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 744
		rightTrackWheelModels[70].setRotationPoint(-60F, -11.5F, -26F);

		rightTrackWheelModels[71].addShape3D(3.5F, -3.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 745
		rightTrackWheelModels[71].setRotationPoint(-60F, -11.5F, -26F);

		rightTrackWheelModels[72].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 746
		rightTrackWheelModels[72].setRotationPoint(-60F, -11.5F, -26F);

		rightTrackWheelModels[73].addShape3D(3.5F, -3.5F, 4.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 747
		rightTrackWheelModels[73].setRotationPoint(-60F, -11.5F, -26F);

		rightTrackWheelModels[74].addShape3D(3.5F, -3.5F, 4.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 748
		rightTrackWheelModels[74].setRotationPoint(-22F, -11.5F, -26F);

		rightTrackWheelModels[75].addShape3D(3.5F, -3.5F, 4.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 749
		rightTrackWheelModels[75].setRotationPoint(18F, -11.5F, -26F);

		rightTrackWheelModels[76].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 8
		rightTrackWheelModels[76].setRotationPoint(-84.75F, 2F, -25F);

		rightTrackWheelModels[77].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 9
		rightTrackWheelModels[77].setRotationPoint(-84.75F, 2F, -25F);

		rightTrackWheelModels[78].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 10
		rightTrackWheelModels[78].setRotationPoint(-84.75F, 2F, -25F);

		rightTrackWheelModels[79].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 11
		rightTrackWheelModels[79].setRotationPoint(-84.75F, 2F, -25F);

		rightTrackWheelModels[80].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 12
		rightTrackWheelModels[80].setRotationPoint(-104.75F, 2F, -25F);

		rightTrackWheelModels[81].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 13
		rightTrackWheelModels[81].setRotationPoint(-104.75F, 2F, -25F);

		rightTrackWheelModels[82].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 14
		rightTrackWheelModels[82].setRotationPoint(-104.75F, 2F, -25F);

		rightTrackWheelModels[83].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 15
		rightTrackWheelModels[83].setRotationPoint(-104.75F, 2F, -25F);

		rightTrackWheelModels[84].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 16
		rightTrackWheelModels[84].setRotationPoint(-123.5F, 2F, -25F);

		rightTrackWheelModels[85].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 17
		rightTrackWheelModels[85].setRotationPoint(-123.5F, 2F, -25F);

		rightTrackWheelModels[86].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 18
		rightTrackWheelModels[86].setRotationPoint(-123.5F, 2F, -25F);

		rightTrackWheelModels[87].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 19
		rightTrackWheelModels[87].setRotationPoint(-123.5F, 2F, -25F);

		rightTrackWheelModels[88].addShape3D(5F, -5F, 6.25F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 20
		rightTrackWheelModels[88].setRotationPoint(-140.5F, 2F, -25F);

		rightTrackWheelModels[89].addShape3D(6F, -6F, 3.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 21
		rightTrackWheelModels[89].setRotationPoint(-140.5F, 2F, -25F);

		rightTrackWheelModels[90].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(2, 10, 2, 10), new Coord2D(0, 8, 0, 8), new Coord2D(0, 2, 0, 2) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,3 ,6 ,3 ,6 ,3 ,6}); // Shape 22
		rightTrackWheelModels[90].setRotationPoint(-140.5F, 2F, -25F);

		rightTrackWheelModels[91].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 3, 12, 12, 44, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 23
		rightTrackWheelModels[91].setRotationPoint(-140.5F, 2F, -25F);

		rightTrackWheelModels[92].addShape3D(4.5F, -4.5F, 2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 14
		rightTrackWheelModels[92].setRotationPoint(-98.5F, -11.5F, -26F);

		rightTrackWheelModels[93].addShape3D(3.5F, -3.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 15
		rightTrackWheelModels[93].setRotationPoint(-98.5F, -11.5F, -26F);

		rightTrackWheelModels[94].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 16
		rightTrackWheelModels[94].setRotationPoint(-98.5F, -11.5F, -26F);

		rightTrackWheelModels[95].addShape3D(4.5F, -4.5F, 2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 18
		rightTrackWheelModels[95].setRotationPoint(-136.5F, -11.5F, -26F);

		rightTrackWheelModels[96].addShape3D(3.5F, -3.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 2, 7, 7, 24, 2, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 19
		rightTrackWheelModels[96].setRotationPoint(-136.5F, -11.5F, -26F);

		rightTrackWheelModels[97].addShape3D(4.5F, -4.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 2, 9, 9, 32, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 20
		rightTrackWheelModels[97].setRotationPoint(-136.5F, -11.5F, -26F);

		rightTrackWheelModels[98].addShape3D(3.5F, -3.5F, 4.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 22
		rightTrackWheelModels[98].setRotationPoint(-136.5F, -11.5F, -26F);

		rightTrackWheelModels[99].addShape3D(3.5F, -3.5F, 4.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Shape 23
		rightTrackWheelModels[99].setRotationPoint(-98.5F, -11.5F, -26F);

		rightTrackWheelModels[100].addShape3D(7.5F, -7.5F, 2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Shape 0
		rightTrackWheelModels[100].setRotationPoint(-158.75F, -6.25F, -20F);

		rightTrackWheelModels[101].addShape3D(6F, -6F, 4F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 5, 12, 12, 40, 5, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 1
		rightTrackWheelModels[101].setRotationPoint(-158.75F, -6.25F, -20F);

		rightTrackWheelModels[102].addShape3D(7.5F, -7.5F, 9F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Shape 2
		rightTrackWheelModels[102].setRotationPoint(-158.75F, -6.25F, -20F);

		rightTrackWheelModels[103].addShape3D(6F, -6F, 9.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 2, 12, 12, 44, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 4
		rightTrackWheelModels[103].setRotationPoint(-158.75F, -6.25F, -20F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 908
		leftTrackModel[1] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 909
		leftTrackModel[2] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 910
		leftTrackModel[3] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 911
		leftTrackModel[4] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 912
		leftTrackModel[5] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 913
		leftTrackModel[6] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 914
		leftTrackModel[7] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 915
		leftTrackModel[8] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 916
		leftTrackModel[9] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 917
		leftTrackModel[10] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 918

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,147F, 0F, -2F, 147F, 0F, -2F, 147F, 0F, -2F, 147F, 0F, -2F, 147F, 0F, -2F, 147F, 0F, -2F, 147F, 0F, -2F, 147F, 0F, -2F); // Box 908
		leftTrackModel[0].setRotationPoint(3F, 8F, 19.75F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,5F, 0F, -2F, 13F, -7F, -2F, 13F, -7F, -2F, 5F, 0F, -2F, 5F, 0F, -2F, 13F, 7F, -2F, 13F, 7F, -2F, 5F, 0F, -2F); // Box 909
		leftTrackModel[1].setRotationPoint(-158F, 1F, 19.75F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,3F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 3F, 0F, -2F); // Box 910
		leftTrackModel[2].setRotationPoint(-164F, -3F, 19.75F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F); // Box 911
		leftTrackModel[3].setRotationPoint(-167F, -7F, 19.75F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,3F, 0F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 3F, 0F, -2F); // Box 912
		leftTrackModel[4].setRotationPoint(-164F, -10.5F, 19.75F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,5F, 0F, -2F, 20F, 3F, -2F, 20F, 3F, -2F, 5F, 0F, -2F, 5F, 0F, -2F, 20F, -3F, -2F, 20F, -3F, -2F, 5F, 0F, -2F); // Box 913
		leftTrackModel[5].setRotationPoint(-158F, -14F, 19.75F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,151F, 0F, -2F, 150F, 0F, -2F, 150F, 0F, -2F, 151F, 0F, -2F, 151F, 0F, -2F, 150F, 0F, -2F, 150F, 0F, -2F, 151F, 0F, -2F); // Box 914
		leftTrackModel[6].setRotationPoint(14F, -17F, 19.75F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, 4F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, 4F, -2F, 0F, -4F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, -4F, -2F); // Box 915
		leftTrackModel[7].setRotationPoint(165F, -13F, 19.75F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F); // Box 916
		leftTrackModel[8].setRotationPoint(168F, -9F, 19.75F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -4F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, -4F, -2F, 0F, 4F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, 4F, -2F); // Box 917
		leftTrackModel[9].setRotationPoint(165F, -5.5F, 19.75F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,8F, -7F, -2F, 5F, 2.5F, -2F, 5F, 2.5F, -2F, 8F, -7F, -2F, 8F, 7F, -2F, 5F, -2.5F, -2F, 5F, -2.5F, -2F, 8F, 7F, -2F); // Box 918
		leftTrackModel[10].setRotationPoint(159F, 1F, 19.75F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 921
		rightTrackModel[1] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 922
		rightTrackModel[2] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 923
		rightTrackModel[3] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 924
		rightTrackModel[4] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 925
		rightTrackModel[5] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 926
		rightTrackModel[6] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 927
		rightTrackModel[7] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 928
		rightTrackModel[8] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 929
		rightTrackModel[9] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 930
		rightTrackModel[10] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 931

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F); // Box 921
		rightTrackModel[0].setRotationPoint(-167F, -7F, -34.75F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,3F, 0F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 3F, 0F, -2F); // Box 922
		rightTrackModel[1].setRotationPoint(-164F, -10.5F, -34.75F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,5F, 0F, -2F, 20F, 3F, -2F, 20F, 3F, -2F, 5F, 0F, -2F, 5F, 0F, -2F, 20F, -3F, -2F, 20F, -3F, -2F, 5F, 0F, -2F); // Box 923
		rightTrackModel[2].setRotationPoint(-158F, -14F, -34.75F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,3F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 3F, 0F, -2F); // Box 924
		rightTrackModel[3].setRotationPoint(-164F, -3F, -34.75F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,5F, 0F, -2F, 13F, -7F, -2F, 13F, -7F, -2F, 5F, 0F, -2F, 5F, 0F, -2F, 13F, 7F, -2F, 13F, 7F, -2F, 5F, 0F, -2F); // Box 925
		rightTrackModel[4].setRotationPoint(-158F, 1F, -34.75F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,147F, 0F, -2F, 147F, 0F, -2F, 147F, 0F, -2F, 147F, 0F, -2F, 147F, 0F, -2F, 147F, 0F, -2F, 147F, 0F, -2F, 147F, 0F, -2F); // Box 926
		rightTrackModel[5].setRotationPoint(3F, 8F, -34.75F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,151F, 0F, -2F, 150F, 0F, -2F, 150F, 0F, -2F, 151F, 0F, -2F, 151F, 0F, -2F, 150F, 0F, -2F, 150F, 0F, -2F, 151F, 0F, -2F); // Box 927
		rightTrackModel[6].setRotationPoint(14F, -17F, -34.75F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,8F, -7F, -2F, 5F, 2.5F, -2F, 5F, 2.5F, -2F, 8F, -7F, -2F, 8F, 7F, -2F, 5F, -2.5F, -2F, 5F, -2.5F, -2F, 8F, 7F, -2F); // Box 928
		rightTrackModel[7].setRotationPoint(159F, 1F, -34.75F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -4F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, -4F, -2F, 0F, 4F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, 4F, -2F); // Box 929
		rightTrackModel[8].setRotationPoint(165F, -5.5F, -34.75F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F); // Box 930
		rightTrackModel[9].setRotationPoint(168F, -9F, -34.75F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, 4F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, 4F, -2F, 0F, -4F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, -4F, -2F); // Box 931
		rightTrackModel[10].setRotationPoint(165F, -13F, -34.75F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerMG", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[69];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 12
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 13
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 15
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 16
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 17
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 18
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 20
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 21
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 23
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 24
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 25
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 27
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 28
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 29
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 34
		gun_2_Model[0][16] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 36
		gun_2_Model[0][17] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 39
		gun_2_Model[0][18] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 40
		gun_2_Model[0][19] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 41
		gun_2_Model[0][20] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 42
		gun_2_Model[0][21] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 43
		gun_2_Model[0][22] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 44
		gun_2_Model[0][23] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 45
		gun_2_Model[0][24] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 46
		gun_2_Model[0][25] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 47
		gun_2_Model[0][26] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 48
		gun_2_Model[0][27] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 49
		gun_2_Model[0][28] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 50
		gun_2_Model[0][29] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 51
		gun_2_Model[0][30] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 53
		gun_2_Model[0][31] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 54
		gun_2_Model[0][32] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 55
		gun_2_Model[0][33] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 56
		gun_2_Model[0][34] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 57
		gun_2_Model[0][35] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 58
		gun_2_Model[0][36] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 59
		gun_2_Model[0][37] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 64
		gun_2_Model[0][38] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 65
		gun_2_Model[0][39] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 69
		gun_2_Model[0][40] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 70
		gun_2_Model[0][41] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 71
		gun_2_Model[0][42] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 72
		gun_2_Model[0][43] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 74
		gun_2_Model[0][44] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 75
		gun_2_Model[0][45] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 82
		gun_2_Model[0][46] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 83
		gun_2_Model[0][47] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Box 84
		gun_2_Model[0][48] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 85
		gun_2_Model[0][49] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 86
		gun_2_Model[0][50] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 87
		gun_2_Model[0][51] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 88
		gun_2_Model[0][52] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 89
		gun_2_Model[0][53] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 90
		gun_2_Model[0][54] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 91
		gun_2_Model[0][55] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 92
		gun_2_Model[0][56] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 93
		gun_2_Model[0][57] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 94
		gun_2_Model[0][58] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 95
		gun_2_Model[0][59] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 96
		gun_2_Model[0][60] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 97
		gun_2_Model[0][61] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 98
		gun_2_Model[0][62] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 99
		gun_2_Model[0][63] = new ModelRendererTurbo(this, 369, 377, textureX, textureY); // Box 106
		gun_2_Model[0][64] = new ModelRendererTurbo(this, 385, 377, textureX, textureY); // Box 107
		gun_2_Model[0][65] = new ModelRendererTurbo(this, 401, 377, textureX, textureY); // Box 108
		gun_2_Model[0][66] = new ModelRendererTurbo(this, 401, 377, textureX, textureY); // Box 109
		gun_2_Model[0][67] = new ModelRendererTurbo(this, 521, 292, textureX, textureY); // Box 0
		gun_2_Model[0][68] = new ModelRendererTurbo(this, 521, 292, textureX, textureY); // Box 1

		gun_2_Model[0][0].addShapeBox(0F, -7F, -15.5F, 18, 19, 31, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 4.5F, 5F, 0F, 2F, 5F, 0F, 2F, 0F, 0F, 4.5F); // Box 12

		gun_2_Model[0][1].addShapeBox(-27F, -7F, -15.5F, 27, 14, 31, 0F,1F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -2.5F, 5F, 0F, 1F, 0F, 0F, 3.05F, 0F, 0F, 3.05F, 5F, 0F, 1F); // Box 13

		gun_2_Model[0][2].addShapeBox(-10F, 7F, -18.5F, 10, 5, 9, 0F,0F, 0F, -1.5F, 0F, 0F, 0.05F, 0F, 0F, 0F, 7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 9F, 0F, 0F); // Box 14

		gun_2_Model[0][3].addShapeBox(-18F, 7F, -10F, 18, 5, 10, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 15

		gun_2_Model[0][4].addShapeBox(-18F, 7F, 0F, 18, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 16

		gun_2_Model[0][5].addShapeBox(-10F, 7F, 9.5F, 10, 5, 9, 0F,7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, -1.5F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 17

		gun_2_Model[0][6].addBox(14F, -0.5F, -8F, 13, 5, 16, 0F); // Box 18

		gun_2_Model[0][7].addShapeBox(14F, -5.5F, -8F, 13, 5, 16, 0F,-3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20

		gun_2_Model[0][8].addShapeBox(14F, 4.5F, -8F, 13, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -4F, 0F, 0F); // Box 21

		gun_2_Model[0][9].addShapeBox(14F, -5.5F, -11F, 13, 5, 3, 0F,-4F, -1F, -0.75F, -5F, -2F, -1F, -3.25F, -1.25F, 0F, -4F, -0.25F, 0F, -5F, 0F, 0F, -2F, 0F, -0.5F, -0.25F, 0F, 0F, -4F, 0F, 0F); // Box 23

		gun_2_Model[0][10].addShapeBox(14F, -5.5F, 8F, 13, 5, 3, 0F,-4F, -0.25F, 0F, -3.25F, -1.25F, 0F, -5F, -2F, -1F, -4F, -1F, -0.75F, -4F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -5F, 0F, 0F); // Box 24

		gun_2_Model[0][11].addShapeBox(14F, 4.5F, 8F, 13, 5, 3, 0F,-4F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -5F, 0F, 0F, -4F, -0.25F, 0F, -3.25F, -1.25F, 0F, -5F, -2F, -1F, -4F, -1F, -0.75F); // Box 25

		gun_2_Model[0][12].addShapeBox(14F, 4.5F, -11F, 13, 5, 3, 0F,-5.25F, 0F, 0F, -2F, 0F, -0.5F, -0.25F, 0F, 0F, -4F, 0F, 0F, -4.25F, -1F, -0.75F, -5F, -2F, -1F, -3.25F, -1.25F, 0F, -4F, -0.25F, 0F); // Box 27

		gun_2_Model[0][13].addShapeBox(14F, -0.5F, -11F, 13, 5, 3, 0F,-5F, 0F, 0F, -2F, 0F, -0.5F, -0.25F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, -0.5F, -0.25F, 0F, 0F, -4F, 0F, 0F); // Box 28

		gun_2_Model[0][14].addShapeBox(14F, -0.5F, 8F, 13, 5, 3, 0F,-4F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -5F, 0F, 0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -5F, 0F, 0F); // Box 29

		gun_2_Model[0][15].addShapeBox(2F, 24F, -8F, 2, 5, 16, 0F,-1.5F, 2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 2F, -0.5F, 4F, -5F, -0.5F, -5.75F, -4.25F, -0.5F, -5.75F, -4.25F, -0.5F, 4F, -5F, -0.5F); // Box 34

		gun_2_Model[0][16].addShapeBox(18F, -6.25F, -8F, 4, 2, 16, 0F,0F, 0F, 0.175F, 0F, -0.25F, 0.175F, 0F, -0.25F, 0.175F, 0F, 0F, 0.175F, 0F, 0F, 0.175F, 0F, 0F, 0.175F, 0F, 0F, 0.175F, 0F, 0F, 0.175F); // Box 36

		gun_2_Model[0][17].addShapeBox(10F, -6F, -4.5F, 4, 2, 4, 0F,0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 39

		gun_2_Model[0][18].addShapeBox(10F, -6F, 0.5F, 4, 2, 4, 0F,0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 40

		gun_2_Model[0][19].addShapeBox(22F, -6F, -1F, 4, 2, 4, 0F,0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 41

		gun_2_Model[0][20].addShapeBox(22F, -6F, -3F, 4, 2, 4, 0F,0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 42

		gun_2_Model[0][21].addShapeBox(28F, -3.75F, -3F, 3, 2, 6, 0F,0.25F, 0F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0.25F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 43

		gun_2_Model[0][22].addShapeBox(28F, -1.75F, -3F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 44

		gun_2_Model[0][23].addShapeBox(28F, 0.25F, -3F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, 0F, -2F); // Box 45

		gun_2_Model[0][24].addShapeBox(30.5F, 0.25F, -3F, 2, 2, 6, 0F,-0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F, -0.45F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -0.45F, -0.25F, -1.75F); // Box 46

		gun_2_Model[0][25].addShapeBox(30.5F, -1.75F, -3F, 2, 2, 6, 0F,-0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F); // Box 47

		gun_2_Model[0][26].addShapeBox(30.5F, -3.75F, -3F, 2, 2, 6, 0F,-0.45F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -0.45F, -0.25F, -1.75F, -0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F); // Box 48

		gun_2_Model[0][27].addShapeBox(28.5F, -1F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49

		gun_2_Model[0][28].addShapeBox(34.25F, -1.25F, -0.5F, 1, 2, 1, 0F,0F, -0.125F, 0.075F, 0F, -0.125F, 0.075F, 0F, -0.125F, 0.075F, 0F, -0.125F, 0.075F, 0F, 0.275F, 0.075F, 0F, 0.275F, 0.075F, 0F, 0.275F, 0.075F, 0F, 0.275F, 0.075F); // Box 50

		gun_2_Model[0][29].addShapeBox(29.5F, 0F, -0.5F, 6, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 51

		gun_2_Model[0][30].addShapeBox(12.5F, -10F, 8F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F); // Box 53

		gun_2_Model[0][31].addShapeBox(12.5F, -11F, 8F, 3, 1, 3, 0F,-0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54

		gun_2_Model[0][32].addShapeBox(12.5F, -10F, -11F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F); // Box 55

		gun_2_Model[0][33].addShapeBox(12.5F, -11F, -11F, 3, 1, 3, 0F,-0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56

		gun_2_Model[0][34].addShapeBox(8F, -7.5F, -3F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 57

		gun_2_Model[0][35].addShapeBox(12F, -7.5F, -3F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 58

		gun_2_Model[0][36].addBox(10F, -7.5F, -3F, 2, 1, 6, 0F); // Box 59

		gun_2_Model[0][37].addShapeBox(-10F, -7.5F, -6.5F, 4, 1, 13, 0F,0F, 0F, 0F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0F, 0F, 0F); // Box 64

		gun_2_Model[0][38].addBox(-14F, -7.5F, -6.5F, 4, 1, 13, 0F); // Box 65

		gun_2_Model[0][39].addShapeBox(-18F, -8F, -6F, 4, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 69

		gun_2_Model[0][40].addBox(-14F, -8F, -6F, 4, 1, 12, 0F); // Box 70

		gun_2_Model[0][41].addShapeBox(-18F, -7.5F, -6.5F, 4, 1, 13, 0F,0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4.5F); // Box 71

		gun_2_Model[0][42].addShapeBox(-10F, -8F, -6F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 72

		gun_2_Model[0][43].addShapeBox(5.45F, 16.5F, -6.75F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74

		gun_2_Model[0][44].addShapeBox(28.2F, 1.5F, -6.75F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, 0F, 0F); // Box 75

		gun_2_Model[0][45].addShapeBox(18F, -7F, 11.75F, 1, 19, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 82

		gun_2_Model[0][46].addShapeBox(0F, -7F, 15.25F, 18, 19, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -5.5F, 5F, 0F, -2.5F, 5F, 0F, 2.5F, 0F, 0F, 5.5F); // Box 83

		gun_2_Model[0][47].addShapeBox(-27F, -7F, 15.25F, 27, 14, 1, 0F,0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.75F, 4F, 0F, -2F, 0F, 0F, -4.05F, 0F, 0F, 4.05F, 4F, 0F, 1.75F); // Box 84

		gun_2_Model[0][48].addShapeBox(-28F, -7F, 13.25F, 1, 14, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.2F, 0F, 0F, 0.25F, -0.75F, 0F, 0.22F, 4F, 0F, -3.25F, -3.75F, 0F, -3.3F, -4F, 0F, 3.75F, 3.25F, 0F, 3.7F); // Box 85

		gun_2_Model[0][49].addShapeBox(-27F, -7F, 14.25F, 27, 1, 1, 0F,0F, 0F, 1.2F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.2F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, -1.5F); // Box 86

		gun_2_Model[0][50].addShapeBox(-27F, -7F, -15.25F, 27, 1, 1, 0F,0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 1.2F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 1.2F); // Box 87

		gun_2_Model[0][51].addShapeBox(-28F, -7F, -14.25F, 1, 14, 1, 0F,-0.75F, 0F, 0.22F, 0F, 0F, 0.25F, 0F, 0F, 0.2F, 0F, 0F, 0.25F, 3.25F, 0F, 3.7F, -4F, 0F, 3.75F, -3.75F, 0F, -3.3F, 4F, 0F, -3.25F); // Box 88

		gun_2_Model[0][52].addShapeBox(-27F, -7F, -16.25F, 27, 14, 1, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 4F, 0F, 1.75F, 0F, 0F, 4.05F, 0F, 0F, -4.05F, 4F, 0F, -2F); // Box 89

		gun_2_Model[0][53].addShapeBox(0F, -7F, -16.25F, 18, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 5.5F, 5F, 0F, 2.5F, 5F, 0F, -2.5F, 0F, 0F, -5.5F); // Box 90

		gun_2_Model[0][54].addShapeBox(18F, -7F, -18.75F, 1, 19, 7, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 91

		gun_2_Model[0][55].addShapeBox(14.5F, -6.9F, -13.8F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92

		gun_2_Model[0][56].addShapeBox(9.5F, -6.9F, -14.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93

		gun_2_Model[0][57].addShapeBox(3.5F, -6.9F, -15.3F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94

		gun_2_Model[0][58].addShapeBox(3.5F, -6.9F, 13.3F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 95

		gun_2_Model[0][59].addShapeBox(9.5F, -6.9F, 12.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 96

		gun_2_Model[0][60].addShapeBox(14.5F, -6.9F, 11.8F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 97

		gun_2_Model[0][61].addShapeBox(-5F, 7F, -21F, 5, 5, 1, 0F,0F, 0F, -1.05F, 0F, 0F, -0.7F, 0F, 0F, 0.7F, 0F, 0F, 1.05F, -3.8F, 0F, 0.55F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, -3.8F, 0F, -0.55F); // Box 98

		gun_2_Model[0][62].addShapeBox(-5F, 7F, 20F, 5, 5, 1, 0F,0F, 0F, 1.05F, 0F, 0F, 0.7F, 0F, 0F, -0.7F, 0F, 0F, -1.05F, -3.8F, 0F, -0.55F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, -3.8F, 0F, 0.55F); // Box 99

		gun_2_Model[0][63].addShapeBox(-30F, -3.75F, -3F, 1, 2, 6, 0F,-0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106

		gun_2_Model[0][64].addShapeBox(-31F, 0.25F, -3F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 107

		gun_2_Model[0][65].addShapeBox(-30.5F, -1.75F, -3F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108

		gun_2_Model[0][66].addShapeBox(22F, -6F, -8F, 2, 2, 16, 0F,0F, 0F, 0.175F, 0F, -0.5F, 0.175F, 0F, -0.5F, 0.175F, 0F, 0F, 0.175F, 0F, 0F, 0.175F, 0F, 0.25F, 0.175F, 0F, 0.25F, 0.175F, 0F, 0F, 0.175F); // Box 109

		gun_2_Model[0][67].addShapeBox(-12F, 2F, 16.4F, 41, 41, 1, 0F,0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, -35F, -35F, 0F, -35F, -35F, 0F, 0F, -35F, 0F); // Box 0

		gun_2_Model[0][68].addShapeBox(-12F, 2F, -17.4F, 41, 41, 1, 0F,0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, -35F, -35F, 0F, -35F, -35F, 0F, 0F, -35F, 0F); // Box 1

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(100F, -41F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[9];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 30
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 31
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 33
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 35
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 37
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 38
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 39
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 40
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 41

		gun_2_Model[1][0].addShapeBox(26.5F, -0.5F, -8F, 2, 5, 16, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 30

		gun_2_Model[1][1].addShapeBox(26.5F, -5.5F, -8F, 2, 5, 16, 0F,2F, -2.5F, -0.5F, -3.5F, -0.75F, -0.5F, -3.5F, -0.75F, -0.5F, 2F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31

		gun_2_Model[1][2].addShapeBox(23F, -10F, -8F, 2, 5, 16, 0F,3F, -5F, -0.5F, -4.75F, -4.125F, -0.5F, -4.75F, -4.125F, -0.5F, 3F, -5F, -0.5F, -1.5F, 2F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -1.5F, 2F, -0.5F); // Box 33

		gun_2_Model[1][3].addShapeBox(26.5F, 4.5F, -8F, 2, 5, 16, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, -2.5F, -0.5F, -3.5F, -0.5F, -0.5F, -3.5F, -0.5F, -0.5F, 2F, -2.5F, -0.5F); // Box 35

		gun_2_Model[1][4].addShapeBox(28.5F, 1.5F, -3.5F, 5, 3, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 37

		gun_2_Model[1][5].addShapeBox(25.5F, -2.5F, -3.5F, 8, 4, 7, 0F,0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38

		gun_2_Model[1][6].addShapeBox(25.5F, -3.5F, -3.5F, 8, 1, 7, 0F,0F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 39

		gun_2_Model[1][7].addShapeBox(25.5F, 4F, -4F, 10, 2, 8, 0F,0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 40

		gun_2_Model[1][8].addShapeBox(28.5F, -1F, -1.5F, 33, 2, 3, 0F,0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F); // Box 41

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(100F, -41F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("HeavyTurretFront", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[3];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 30
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 32
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 33

		gun_3_Model[0][0].addShapeBox(-11F, -5F, -13F, 14, 10, 25, 0F,0F, 0F, -5F, -5F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 30

		gun_3_Model[0][1].addShapeBox(3F, -5F, -13F, 8, 10, 25, 0F,5F, 0F, -4F, -8F, -0.35F, -9F, -8F, -0.35F, -9F, 5F, 0F, -4F, 0F, 0F, 2F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, 2F); // Box 32

		gun_3_Model[0][2].addShapeBox(-18F, -5F, -11.5F, 7, 9, 22, 0F,-4F, 0F, -5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -4F, 0F, -5F, 0F, 0F, -0.25F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, -0.25F); // Box 33

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(105F, -53F, -0.5F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[13];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 84
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 85
		gun_3_Model[2][2] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 86
		gun_3_Model[2][3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 87
		gun_3_Model[2][4] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 49
		gun_3_Model[2][5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 51
		gun_3_Model[2][6] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 52
		gun_3_Model[2][7] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 53
		gun_3_Model[2][8] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 54
		gun_3_Model[2][9] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 61
		gun_3_Model[2][10] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 364
		gun_3_Model[2][11] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 365
		gun_3_Model[2][12] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 366

		gun_3_Model[2][0].addBox(13F, -2F, -4.5F, 4, 3, 3, 0F); // Box 84

		gun_3_Model[2][1].addShapeBox(17F, -1.5F, -4F, 8, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 85

		gun_3_Model[2][2].addShapeBox(25F, -1.5F, -4F, 14, 2, 2, 0F,0F, -0.2F, -0.2F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 86

		gun_3_Model[2][3].addShapeBox(39F, -1.5F, -4F, 1, 2, 2, 0F,-0.25F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 87

		gun_3_Model[2][4].addBox(12F, -1.5F, -7.5F, 2, 3, 14, 0F); // Box 49

		gun_3_Model[2][5].addShapeBox(12F, -2.5F, -7.5F, 2, 1, 14, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51

		gun_3_Model[2][6].addShapeBox(11F, -3.5F, -7.5F, 2, 1, 14, 0F,1.5F, 0.5F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52

		gun_3_Model[2][7].addShapeBox(12F, 1.5F, -7.5F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 53

		gun_3_Model[2][8].addShapeBox(11F, 2.5F, -7.5F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.5F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.5F, 0.5F, 0F); // Box 54

		gun_3_Model[2][9].addShapeBox(11F, 1F, -4.5F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 61

		gun_3_Model[2][10].addShapeBox(14F, -1F, 0F, 4, 1, 1, 0F,0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F); // Box 364

		gun_3_Model[2][11].addShapeBox(13.2F, -1.23F, 3F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 365

		gun_3_Model[2][12].addShapeBox(13.2F, -1.25F, 0F, 1, 2, 1, 0F,0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F); // Box 366

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(105F, -53F, -0.5F);
		}


		registerGunModel("LightTurretOuterFront", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[3];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 30
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 32
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 33

		gun_4_Model[0][0].addShapeBox(-11F, -5F, -13F, 14, 10, 25, 0F,0F, 0F, -5F, -5F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 30

		gun_4_Model[0][1].addShapeBox(3F, -5F, -13F, 8, 10, 25, 0F,5F, 0F, -4F, -8F, -0.35F, -9F, -8F, -0.35F, -9F, 5F, 0F, -4F, 0F, 0F, 2F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, 2F); // Box 32

		gun_4_Model[0][2].addShapeBox(-18F, -5F, -11.5F, 7, 9, 22, 0F,-4F, 0F, -5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -4F, 0F, -5F, 0F, 0F, -0.25F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, -0.25F); // Box 33

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(40F, -31F, -0.5F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[0];

		gun_4_Model[2] = new ModelRendererTurbo[13];
		gun_4_Model[2][0] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 84
		gun_4_Model[2][1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 85
		gun_4_Model[2][2] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 86
		gun_4_Model[2][3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 87
		gun_4_Model[2][4] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 49
		gun_4_Model[2][5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 51
		gun_4_Model[2][6] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 52
		gun_4_Model[2][7] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 53
		gun_4_Model[2][8] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 54
		gun_4_Model[2][9] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 61
		gun_4_Model[2][10] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 364
		gun_4_Model[2][11] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 365
		gun_4_Model[2][12] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 366

		gun_4_Model[2][0].addBox(13F, -2F, -4.5F, 4, 3, 3, 0F); // Box 84

		gun_4_Model[2][1].addShapeBox(17F, -1.5F, -4F, 8, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 85

		gun_4_Model[2][2].addShapeBox(25F, -1.5F, -4F, 14, 2, 2, 0F,0F, -0.2F, -0.2F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 86

		gun_4_Model[2][3].addShapeBox(39F, -1.5F, -4F, 1, 2, 2, 0F,-0.25F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 87

		gun_4_Model[2][4].addBox(12F, -1.5F, -7.5F, 2, 3, 14, 0F); // Box 49

		gun_4_Model[2][5].addShapeBox(12F, -2.5F, -7.5F, 2, 1, 14, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51

		gun_4_Model[2][6].addShapeBox(11F, -3.5F, -7.5F, 2, 1, 14, 0F,1.5F, 0.5F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52

		gun_4_Model[2][7].addShapeBox(12F, 1.5F, -7.5F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 53

		gun_4_Model[2][8].addShapeBox(11F, 2.5F, -7.5F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.5F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.5F, 0.5F, 0F); // Box 54

		gun_4_Model[2][9].addShapeBox(11F, 1F, -4.5F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 61

		gun_4_Model[2][10].addShapeBox(14F, -1F, 0F, 4, 1, 1, 0F,0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F); // Box 364

		gun_4_Model[2][11].addShapeBox(13.2F, -1.23F, 3F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 365

		gun_4_Model[2][12].addShapeBox(13.2F, -1.25F, 0F, 1, 2, 1, 0F,0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F); // Box 366

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[2])
		{
			gunPart.setRotationPoint(40F, -31F, -0.5F);
		}


		registerGunModel("LightTurretInnerFront", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[3];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 30
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 32
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 33

		gun_5_Model[0][0].addShapeBox(-11F, -5F, -13F, 14, 10, 25, 0F,0F, 0F, -5F, -5F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 30

		gun_5_Model[0][1].addShapeBox(3F, -5F, -13F, 8, 10, 25, 0F,5F, 0F, -4F, -8F, -0.35F, -9F, -8F, -0.35F, -9F, 5F, 0F, -4F, 0F, 0F, 2F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, 2F); // Box 32

		gun_5_Model[0][2].addShapeBox(-18F, -5F, -11.5F, 7, 9, 22, 0F,-4F, 0F, -5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -4F, 0F, -5F, 0F, 0F, -0.25F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, -0.25F); // Box 33

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(0F, -80.5F, 0.5F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[0];

		gun_5_Model[2] = new ModelRendererTurbo[13];
		gun_5_Model[2][0] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 84
		gun_5_Model[2][1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 85
		gun_5_Model[2][2] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 86
		gun_5_Model[2][3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 87
		gun_5_Model[2][4] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 49
		gun_5_Model[2][5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 51
		gun_5_Model[2][6] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 52
		gun_5_Model[2][7] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 53
		gun_5_Model[2][8] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 54
		gun_5_Model[2][9] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 61
		gun_5_Model[2][10] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 364
		gun_5_Model[2][11] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 365
		gun_5_Model[2][12] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 366

		gun_5_Model[2][0].addBox(13F, -2F, -4.5F, 4, 3, 3, 0F); // Box 84

		gun_5_Model[2][1].addShapeBox(17F, -1.5F, -4F, 8, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 85

		gun_5_Model[2][2].addShapeBox(25F, -1.5F, -4F, 14, 2, 2, 0F,0F, -0.2F, -0.2F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 86

		gun_5_Model[2][3].addShapeBox(39F, -1.5F, -4F, 1, 2, 2, 0F,-0.25F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 87

		gun_5_Model[2][4].addBox(12F, -1.5F, -7.5F, 2, 3, 14, 0F); // Box 49

		gun_5_Model[2][5].addShapeBox(12F, -2.5F, -7.5F, 2, 1, 14, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51

		gun_5_Model[2][6].addShapeBox(11F, -3.5F, -7.5F, 2, 1, 14, 0F,1.5F, 0.5F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52

		gun_5_Model[2][7].addShapeBox(12F, 1.5F, -7.5F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 53

		gun_5_Model[2][8].addShapeBox(11F, 2.5F, -7.5F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.5F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.5F, 0.5F, 0F); // Box 54

		gun_5_Model[2][9].addShapeBox(11F, 1F, -4.5F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 61

		gun_5_Model[2][10].addShapeBox(14F, -1F, 0F, 4, 1, 1, 0F,0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F); // Box 364

		gun_5_Model[2][11].addShapeBox(13.2F, -1.23F, 3F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 365

		gun_5_Model[2][12].addShapeBox(13.2F, -1.25F, 0F, 1, 2, 1, 0F,0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F); // Box 366

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[2])
		{
			gunPart.setRotationPoint(0F, -80.5F, 0.5F);
		}


		registerGunModel("LightTurretCenterTop", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[69];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 12
		gun_6_Model[0][1] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 13
		gun_6_Model[0][2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		gun_6_Model[0][3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 15
		gun_6_Model[0][4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 16
		gun_6_Model[0][5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 17
		gun_6_Model[0][6] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 18
		gun_6_Model[0][7] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 20
		gun_6_Model[0][8] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 21
		gun_6_Model[0][9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 23
		gun_6_Model[0][10] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 24
		gun_6_Model[0][11] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 25
		gun_6_Model[0][12] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 27
		gun_6_Model[0][13] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 28
		gun_6_Model[0][14] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 29
		gun_6_Model[0][15] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 34
		gun_6_Model[0][16] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 36
		gun_6_Model[0][17] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 39
		gun_6_Model[0][18] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 40
		gun_6_Model[0][19] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 41
		gun_6_Model[0][20] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 42
		gun_6_Model[0][21] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 43
		gun_6_Model[0][22] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 44
		gun_6_Model[0][23] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 45
		gun_6_Model[0][24] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 46
		gun_6_Model[0][25] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 47
		gun_6_Model[0][26] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 48
		gun_6_Model[0][27] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 49
		gun_6_Model[0][28] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 50
		gun_6_Model[0][29] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 51
		gun_6_Model[0][30] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 53
		gun_6_Model[0][31] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 54
		gun_6_Model[0][32] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 55
		gun_6_Model[0][33] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 56
		gun_6_Model[0][34] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 57
		gun_6_Model[0][35] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 58
		gun_6_Model[0][36] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 59
		gun_6_Model[0][37] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 64
		gun_6_Model[0][38] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 65
		gun_6_Model[0][39] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 69
		gun_6_Model[0][40] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 70
		gun_6_Model[0][41] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 71
		gun_6_Model[0][42] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 72
		gun_6_Model[0][43] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 74
		gun_6_Model[0][44] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 75
		gun_6_Model[0][45] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 82
		gun_6_Model[0][46] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 83
		gun_6_Model[0][47] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Box 84
		gun_6_Model[0][48] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 85
		gun_6_Model[0][49] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 86
		gun_6_Model[0][50] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 87
		gun_6_Model[0][51] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 88
		gun_6_Model[0][52] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 89
		gun_6_Model[0][53] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 90
		gun_6_Model[0][54] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 91
		gun_6_Model[0][55] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 92
		gun_6_Model[0][56] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 93
		gun_6_Model[0][57] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 94
		gun_6_Model[0][58] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 95
		gun_6_Model[0][59] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 96
		gun_6_Model[0][60] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 97
		gun_6_Model[0][61] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 98
		gun_6_Model[0][62] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 99
		gun_6_Model[0][63] = new ModelRendererTurbo(this, 369, 377, textureX, textureY); // Box 106
		gun_6_Model[0][64] = new ModelRendererTurbo(this, 385, 377, textureX, textureY); // Box 107
		gun_6_Model[0][65] = new ModelRendererTurbo(this, 401, 377, textureX, textureY); // Box 108
		gun_6_Model[0][66] = new ModelRendererTurbo(this, 401, 377, textureX, textureY); // Box 109
		gun_6_Model[0][67] = new ModelRendererTurbo(this, 521, 292, textureX, textureY); // Box 0
		gun_6_Model[0][68] = new ModelRendererTurbo(this, 521, 292, textureX, textureY); // Box 1

		gun_6_Model[0][0].addShapeBox(0F, -7F, -15.5F, 18, 19, 31, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 4.5F, 5F, 0F, 2F, 5F, 0F, 2F, 0F, 0F, 4.5F); // Box 12

		gun_6_Model[0][1].addShapeBox(-27F, -7F, -15.5F, 27, 14, 31, 0F,1F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -2.5F, 5F, 0F, 1F, 0F, 0F, 3.05F, 0F, 0F, 3.05F, 5F, 0F, 1F); // Box 13

		gun_6_Model[0][2].addShapeBox(-10F, 7F, -18.5F, 10, 5, 9, 0F,0F, 0F, -1.5F, 0F, 0F, 0.05F, 0F, 0F, 0F, 7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 9F, 0F, 0F); // Box 14

		gun_6_Model[0][3].addShapeBox(-18F, 7F, -10F, 18, 5, 10, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 15

		gun_6_Model[0][4].addShapeBox(-18F, 7F, 0F, 18, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 16

		gun_6_Model[0][5].addShapeBox(-10F, 7F, 9.5F, 10, 5, 9, 0F,7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, -1.5F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 17

		gun_6_Model[0][6].addBox(14F, -0.5F, -8F, 13, 5, 16, 0F); // Box 18

		gun_6_Model[0][7].addShapeBox(14F, -5.5F, -8F, 13, 5, 16, 0F,-3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20

		gun_6_Model[0][8].addShapeBox(14F, 4.5F, -8F, 13, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -4F, 0F, 0F); // Box 21

		gun_6_Model[0][9].addShapeBox(14F, -5.5F, -11F, 13, 5, 3, 0F,-4F, -1F, -0.75F, -5F, -2F, -1F, -3.25F, -1.25F, 0F, -4F, -0.25F, 0F, -5F, 0F, 0F, -2F, 0F, -0.5F, -0.25F, 0F, 0F, -4F, 0F, 0F); // Box 23

		gun_6_Model[0][10].addShapeBox(14F, -5.5F, 8F, 13, 5, 3, 0F,-4F, -0.25F, 0F, -3.25F, -1.25F, 0F, -5F, -2F, -1F, -4F, -1F, -0.75F, -4F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -5F, 0F, 0F); // Box 24

		gun_6_Model[0][11].addShapeBox(14F, 4.5F, 8F, 13, 5, 3, 0F,-4F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -5F, 0F, 0F, -4F, -0.25F, 0F, -3.25F, -1.25F, 0F, -5F, -2F, -1F, -4F, -1F, -0.75F); // Box 25

		gun_6_Model[0][12].addShapeBox(14F, 4.5F, -11F, 13, 5, 3, 0F,-5.25F, 0F, 0F, -2F, 0F, -0.5F, -0.25F, 0F, 0F, -4F, 0F, 0F, -4.25F, -1F, -0.75F, -5F, -2F, -1F, -3.25F, -1.25F, 0F, -4F, -0.25F, 0F); // Box 27

		gun_6_Model[0][13].addShapeBox(14F, -0.5F, -11F, 13, 5, 3, 0F,-5F, 0F, 0F, -2F, 0F, -0.5F, -0.25F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, -0.5F, -0.25F, 0F, 0F, -4F, 0F, 0F); // Box 28

		gun_6_Model[0][14].addShapeBox(14F, -0.5F, 8F, 13, 5, 3, 0F,-4F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -5F, 0F, 0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -5F, 0F, 0F); // Box 29

		gun_6_Model[0][15].addShapeBox(2F, 24F, -8F, 2, 5, 16, 0F,-1.5F, 2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 2F, -0.5F, 4F, -5F, -0.5F, -5.75F, -4.25F, -0.5F, -5.75F, -4.25F, -0.5F, 4F, -5F, -0.5F); // Box 34

		gun_6_Model[0][16].addShapeBox(18F, -6.25F, -8F, 4, 2, 16, 0F,0F, 0F, 0.175F, 0F, -0.25F, 0.175F, 0F, -0.25F, 0.175F, 0F, 0F, 0.175F, 0F, 0F, 0.175F, 0F, 0F, 0.175F, 0F, 0F, 0.175F, 0F, 0F, 0.175F); // Box 36

		gun_6_Model[0][17].addShapeBox(10F, -6F, -4.5F, 4, 2, 4, 0F,0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 39

		gun_6_Model[0][18].addShapeBox(10F, -6F, 0.5F, 4, 2, 4, 0F,0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 40

		gun_6_Model[0][19].addShapeBox(22F, -6F, -1F, 4, 2, 4, 0F,0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 41

		gun_6_Model[0][20].addShapeBox(22F, -6F, -3F, 4, 2, 4, 0F,0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 42

		gun_6_Model[0][21].addShapeBox(28F, -3.75F, -3F, 3, 2, 6, 0F,0.25F, 0F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0.25F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 43

		gun_6_Model[0][22].addShapeBox(28F, -1.75F, -3F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 44

		gun_6_Model[0][23].addShapeBox(28F, 0.25F, -3F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, 0F, -2F); // Box 45

		gun_6_Model[0][24].addShapeBox(30.5F, 0.25F, -3F, 2, 2, 6, 0F,-0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F, -0.45F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -0.45F, -0.25F, -1.75F); // Box 46

		gun_6_Model[0][25].addShapeBox(30.5F, -1.75F, -3F, 2, 2, 6, 0F,-0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F); // Box 47

		gun_6_Model[0][26].addShapeBox(30.5F, -3.75F, -3F, 2, 2, 6, 0F,-0.45F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -1.5F, -0.25F, -1.75F, -0.45F, -0.25F, -1.75F, -0.45F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, -0.45F, 0F, -0.25F); // Box 48

		gun_6_Model[0][27].addShapeBox(28.5F, -1F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49

		gun_6_Model[0][28].addShapeBox(34.25F, -1.25F, -0.5F, 1, 2, 1, 0F,0F, -0.125F, 0.075F, 0F, -0.125F, 0.075F, 0F, -0.125F, 0.075F, 0F, -0.125F, 0.075F, 0F, 0.275F, 0.075F, 0F, 0.275F, 0.075F, 0F, 0.275F, 0.075F, 0F, 0.275F, 0.075F); // Box 50

		gun_6_Model[0][29].addShapeBox(29.5F, 0F, -0.5F, 6, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 51

		gun_6_Model[0][30].addShapeBox(12.5F, -10F, 8F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F); // Box 53

		gun_6_Model[0][31].addShapeBox(12.5F, -11F, 8F, 3, 1, 3, 0F,-0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54

		gun_6_Model[0][32].addShapeBox(12.5F, -10F, -11F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F); // Box 55

		gun_6_Model[0][33].addShapeBox(12.5F, -11F, -11F, 3, 1, 3, 0F,-0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56

		gun_6_Model[0][34].addShapeBox(8F, -7.5F, -3F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 57

		gun_6_Model[0][35].addShapeBox(12F, -7.5F, -3F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 58

		gun_6_Model[0][36].addBox(10F, -7.5F, -3F, 2, 1, 6, 0F); // Box 59

		gun_6_Model[0][37].addShapeBox(-10F, -7.5F, -6.5F, 4, 1, 13, 0F,0F, 0F, 0F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0F, 0F, 0F); // Box 64

		gun_6_Model[0][38].addBox(-14F, -7.5F, -6.5F, 4, 1, 13, 0F); // Box 65

		gun_6_Model[0][39].addShapeBox(-18F, -8F, -6F, 4, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 69

		gun_6_Model[0][40].addBox(-14F, -8F, -6F, 4, 1, 12, 0F); // Box 70

		gun_6_Model[0][41].addShapeBox(-18F, -7.5F, -6.5F, 4, 1, 13, 0F,0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4.5F); // Box 71

		gun_6_Model[0][42].addShapeBox(-10F, -8F, -6F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 72

		gun_6_Model[0][43].addShapeBox(5.45F, 16.5F, -6.75F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74

		gun_6_Model[0][44].addShapeBox(28.2F, 1.5F, -6.75F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, 0F, 0F); // Box 75

		gun_6_Model[0][45].addShapeBox(18F, -7F, 11.75F, 1, 19, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 82

		gun_6_Model[0][46].addShapeBox(0F, -7F, 15.25F, 18, 19, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -5.5F, 5F, 0F, -2.5F, 5F, 0F, 2.5F, 0F, 0F, 5.5F); // Box 83

		gun_6_Model[0][47].addShapeBox(-27F, -7F, 15.25F, 27, 14, 1, 0F,0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.75F, 4F, 0F, -2F, 0F, 0F, -4.05F, 0F, 0F, 4.05F, 4F, 0F, 1.75F); // Box 84

		gun_6_Model[0][48].addShapeBox(-28F, -7F, 13.25F, 1, 14, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.2F, 0F, 0F, 0.25F, -0.75F, 0F, 0.22F, 4F, 0F, -3.25F, -3.75F, 0F, -3.3F, -4F, 0F, 3.75F, 3.25F, 0F, 3.7F); // Box 85

		gun_6_Model[0][49].addShapeBox(-27F, -7F, 14.25F, 27, 1, 1, 0F,0F, 0F, 1.2F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.2F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, -1.5F); // Box 86

		gun_6_Model[0][50].addShapeBox(-27F, -7F, -15.25F, 27, 1, 1, 0F,0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 1.2F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 1.2F); // Box 87

		gun_6_Model[0][51].addShapeBox(-28F, -7F, -14.25F, 1, 14, 1, 0F,-0.75F, 0F, 0.22F, 0F, 0F, 0.25F, 0F, 0F, 0.2F, 0F, 0F, 0.25F, 3.25F, 0F, 3.7F, -4F, 0F, 3.75F, -3.75F, 0F, -3.3F, 4F, 0F, -3.25F); // Box 88

		gun_6_Model[0][52].addShapeBox(-27F, -7F, -16.25F, 27, 14, 1, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 4F, 0F, 1.75F, 0F, 0F, 4.05F, 0F, 0F, -4.05F, 4F, 0F, -2F); // Box 89

		gun_6_Model[0][53].addShapeBox(0F, -7F, -16.25F, 18, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 5.5F, 5F, 0F, 2.5F, 5F, 0F, -2.5F, 0F, 0F, -5.5F); // Box 90

		gun_6_Model[0][54].addShapeBox(18F, -7F, -18.75F, 1, 19, 7, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 91

		gun_6_Model[0][55].addShapeBox(14.5F, -6.9F, -13.8F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92

		gun_6_Model[0][56].addShapeBox(9.5F, -6.9F, -14.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93

		gun_6_Model[0][57].addShapeBox(3.5F, -6.9F, -15.3F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94

		gun_6_Model[0][58].addShapeBox(3.5F, -6.9F, 13.3F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 95

		gun_6_Model[0][59].addShapeBox(9.5F, -6.9F, 12.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 96

		gun_6_Model[0][60].addShapeBox(14.5F, -6.9F, 11.8F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 97

		gun_6_Model[0][61].addShapeBox(-5F, 7F, -21F, 5, 5, 1, 0F,0F, 0F, -1.05F, 0F, 0F, -0.7F, 0F, 0F, 0.7F, 0F, 0F, 1.05F, -3.8F, 0F, 0.55F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, -3.8F, 0F, -0.55F); // Box 98

		gun_6_Model[0][62].addShapeBox(-5F, 7F, 20F, 5, 5, 1, 0F,0F, 0F, 1.05F, 0F, 0F, 0.7F, 0F, 0F, -0.7F, 0F, 0F, -1.05F, -3.8F, 0F, -0.55F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, -3.8F, 0F, 0.55F); // Box 99

		gun_6_Model[0][63].addShapeBox(-30F, -3.75F, -3F, 1, 2, 6, 0F,-0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106

		gun_6_Model[0][64].addShapeBox(-31F, 0.25F, -3F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 107

		gun_6_Model[0][65].addShapeBox(-30.5F, -1.75F, -3F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108

		gun_6_Model[0][66].addShapeBox(22F, -6F, -8F, 2, 2, 16, 0F,0F, 0F, 0.175F, 0F, -0.5F, 0.175F, 0F, -0.5F, 0.175F, 0F, 0F, 0.175F, 0F, 0F, 0.175F, 0F, 0.25F, 0.175F, 0F, 0.25F, 0.175F, 0F, 0F, 0.175F); // Box 109

		gun_6_Model[0][67].addShapeBox(-12F, 2F, 16.4F, 41, 41, 1, 0F,0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, -35F, -35F, 0F, -35F, -35F, 0F, 0F, -35F, 0F); // Box 0

		gun_6_Model[0][68].addShapeBox(-12F, 2F, -17.4F, 41, 41, 1, 0F,0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, -35F, -35F, 0F, -35F, -35F, 0F, 0F, -35F, 0F); // Box 1

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(-86F, -39.5F, 0F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[9];
		gun_6_Model[1][0] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 30
		gun_6_Model[1][1] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 31
		gun_6_Model[1][2] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 33
		gun_6_Model[1][3] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 35
		gun_6_Model[1][4] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 37
		gun_6_Model[1][5] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 38
		gun_6_Model[1][6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 39
		gun_6_Model[1][7] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 40
		gun_6_Model[1][8] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 41

		gun_6_Model[1][0].addShapeBox(26.5F, -0.5F, -8F, 2, 5, 16, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 30

		gun_6_Model[1][1].addShapeBox(26.5F, -5.5F, -8F, 2, 5, 16, 0F,2F, -2.5F, -0.5F, -3.5F, -0.75F, -0.5F, -3.5F, -0.75F, -0.5F, 2F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31

		gun_6_Model[1][2].addShapeBox(23F, -10F, -8F, 2, 5, 16, 0F,3F, -5F, -0.5F, -4.75F, -4.125F, -0.5F, -4.75F, -4.125F, -0.5F, 3F, -5F, -0.5F, -1.5F, 2F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -1.5F, 2F, -0.5F); // Box 33

		gun_6_Model[1][3].addShapeBox(26.5F, 4.5F, -8F, 2, 5, 16, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, -2.5F, -0.5F, -3.5F, -0.5F, -0.5F, -3.5F, -0.5F, -0.5F, 2F, -2.5F, -0.5F); // Box 35

		gun_6_Model[1][4].addShapeBox(28.5F, 1.5F, -3.5F, 5, 3, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 37

		gun_6_Model[1][5].addShapeBox(25.5F, -2.5F, -3.5F, 8, 4, 7, 0F,0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38

		gun_6_Model[1][6].addShapeBox(25.5F, -3.5F, -3.5F, 8, 1, 7, 0F,0F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 39

		gun_6_Model[1][7].addShapeBox(25.5F, 4F, -4F, 10, 2, 8, 0F,0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 40

		gun_6_Model[1][8].addShapeBox(28.5F, -1F, -1.5F, 33, 2, 3, 0F,0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F); // Box 41

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[1])
		{
			gunPart.setRotationPoint(-86F, -39.5F, 0F);
		}


		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("HeavyTurretRear", gun_6_Model);

		// Passenger 8
		ModelRendererTurbo[][] gun_7_Model = new ModelRendererTurbo[3][];

		gun_7_Model[0] = new ModelRendererTurbo[3];
		gun_7_Model[0][0] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 30
		gun_7_Model[0][1] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 32
		gun_7_Model[0][2] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 33

		gun_7_Model[0][0].addShapeBox(-11F, -5F, -13F, 14, 10, 25, 0F,0F, 0F, -5F, -5F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 30

		gun_7_Model[0][1].addShapeBox(3F, -5F, -13F, 8, 10, 25, 0F,5F, 0F, -4F, -8F, -0.35F, -9F, -8F, -0.35F, -9F, 5F, 0F, -4F, 0F, 0F, 2F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, 2F); // Box 32

		gun_7_Model[0][2].addShapeBox(-18F, -5F, -11.5F, 7, 9, 22, 0F,-4F, 0F, -5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -4F, 0F, -5F, 0F, 0F, -0.25F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, -0.25F); // Box 33

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[0])
		{
			gunPart.setRotationPoint(-86F, -52F, -0.5F);
		}


		gun_7_Model[1] = new ModelRendererTurbo[0];

		gun_7_Model[2] = new ModelRendererTurbo[13];
		gun_7_Model[2][0] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 84
		gun_7_Model[2][1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 85
		gun_7_Model[2][2] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 86
		gun_7_Model[2][3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 87
		gun_7_Model[2][4] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 49
		gun_7_Model[2][5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 51
		gun_7_Model[2][6] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 52
		gun_7_Model[2][7] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 53
		gun_7_Model[2][8] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 54
		gun_7_Model[2][9] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 61
		gun_7_Model[2][10] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 364
		gun_7_Model[2][11] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 365
		gun_7_Model[2][12] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 366

		gun_7_Model[2][0].addBox(13F, -2F, -4.5F, 4, 3, 3, 0F); // Box 84

		gun_7_Model[2][1].addShapeBox(17F, -1.5F, -4F, 8, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 85

		gun_7_Model[2][2].addShapeBox(25F, -1.5F, -4F, 14, 2, 2, 0F,0F, -0.2F, -0.2F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 86

		gun_7_Model[2][3].addShapeBox(39F, -1.5F, -4F, 1, 2, 2, 0F,-0.25F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 87

		gun_7_Model[2][4].addBox(12F, -1.5F, -7.5F, 2, 3, 14, 0F); // Box 49

		gun_7_Model[2][5].addShapeBox(12F, -2.5F, -7.5F, 2, 1, 14, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51

		gun_7_Model[2][6].addShapeBox(11F, -3.5F, -7.5F, 2, 1, 14, 0F,1.5F, 0.5F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52

		gun_7_Model[2][7].addShapeBox(12F, 1.5F, -7.5F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 53

		gun_7_Model[2][8].addShapeBox(11F, 2.5F, -7.5F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.5F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.5F, 0.5F, 0F); // Box 54

		gun_7_Model[2][9].addShapeBox(11F, 1F, -4.5F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 61

		gun_7_Model[2][10].addShapeBox(14F, -1F, 0F, 4, 1, 1, 0F,0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F, 0F, -0.23F, -0.23F); // Box 364

		gun_7_Model[2][11].addShapeBox(13.2F, -1.23F, 3F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 365

		gun_7_Model[2][12].addShapeBox(13.2F, -1.25F, 0F, 1, 2, 1, 0F,0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F); // Box 366

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[2])
		{
			gunPart.setRotationPoint(-86F, -52F, -0.5F);
		}


		registerGunModel("LightTurretRear", gun_7_Model);

		// Passenger 9
		ModelRendererTurbo[][] gun_8_Model = new ModelRendererTurbo[3][];

		gun_8_Model[0] = new ModelRendererTurbo[12];
		gun_8_Model[0][0] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 2
		gun_8_Model[0][1] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 2
		gun_8_Model[0][2] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 2
		gun_8_Model[0][3] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 2
		gun_8_Model[0][4] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 2
		gun_8_Model[0][5] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 2
		gun_8_Model[0][6] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Box 2
		gun_8_Model[0][7] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 2
		gun_8_Model[0][8] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 2
		gun_8_Model[0][9] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 2
		gun_8_Model[0][10] = new ModelRendererTurbo(this, 353, 233, textureX, textureY); // Box 2
		gun_8_Model[0][11] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Box 2

		gun_8_Model[0][0].addShapeBox(-2.5F, 1.5F, 5.8F, 10, 6, 1, 0F,-3.5F, 0F, -0.2F, -5F, 0F, -0.2F, -5F, 0F, -0.2F, -3.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 2

		gun_8_Model[0][1].addShapeBox(-2.5F, 1.5F, -6.8F, 10, 6, 1, 0F,-3.5F, 0F, -0.2F, -5F, 0F, -0.2F, -5F, 0F, -0.2F, -3.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 2

		gun_8_Model[0][2].addShapeBox(-3F, 7.5F, -7F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[0][3].addShapeBox(34F, 10.5F, -4F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[0][4].addShapeBox(37F, 5.5F, -6.5F, 2, 4, 13, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[0][5].addShapeBox(-3F, 7.5F, 6F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[0][6].addShapeBox(8F, 7.5F, -7F, 20, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 2

		gun_8_Model[0][7].addShapeBox(8F, 7.5F, 6F, 20, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 2

		gun_8_Model[0][8].addShapeBox(30F, 7.5F, -3F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[0][9].addShapeBox(28F, 7.5F, -3F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2

		gun_8_Model[0][10].addShapeBox(32F, 7.5F, -3F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 2

		gun_8_Model[0][11].addShapeBox(-3F, 7.5F, -6F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_8_Model[0])
		{
			gunPart.setRotationPoint(-105.5F, -65.7F, 0F);
		}


		gun_8_Model[1] = new ModelRendererTurbo[0];

		gun_8_Model[2] = new ModelRendererTurbo[501];
		gun_8_Model[2][0] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 2
		gun_8_Model[2][1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 2
		gun_8_Model[2][2] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 2
		gun_8_Model[2][3] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 2
		gun_8_Model[2][4] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 2
		gun_8_Model[2][5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 2
		gun_8_Model[2][6] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 2
		gun_8_Model[2][7] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 2
		gun_8_Model[2][8] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 2
		gun_8_Model[2][9] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 2
		gun_8_Model[2][10] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 2
		gun_8_Model[2][11] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 2
		gun_8_Model[2][12] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 2
		gun_8_Model[2][13] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 2
		gun_8_Model[2][14] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 2
		gun_8_Model[2][15] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 2
		gun_8_Model[2][16] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 2
		gun_8_Model[2][17] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 2
		gun_8_Model[2][18] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 2
		gun_8_Model[2][19] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 2
		gun_8_Model[2][20] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 2
		gun_8_Model[2][21] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 2
		gun_8_Model[2][22] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 2
		gun_8_Model[2][23] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 2
		gun_8_Model[2][24] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 2
		gun_8_Model[2][25] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 2
		gun_8_Model[2][26] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 2
		gun_8_Model[2][27] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 2
		gun_8_Model[2][28] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 2
		gun_8_Model[2][29] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 2
		gun_8_Model[2][30] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 2
		gun_8_Model[2][31] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 2
		gun_8_Model[2][32] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 2
		gun_8_Model[2][33] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 2
		gun_8_Model[2][34] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 2
		gun_8_Model[2][35] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][36] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 2
		gun_8_Model[2][37] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 2
		gun_8_Model[2][38] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 2
		gun_8_Model[2][39] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 2
		gun_8_Model[2][40] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 2
		gun_8_Model[2][41] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 2
		gun_8_Model[2][42] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		gun_8_Model[2][43] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 2
		gun_8_Model[2][44] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 2
		gun_8_Model[2][45] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 2
		gun_8_Model[2][46] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 2
		gun_8_Model[2][47] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 2
		gun_8_Model[2][48] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 2
		gun_8_Model[2][49] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 2
		gun_8_Model[2][50] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 2
		gun_8_Model[2][51] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][52] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 2
		gun_8_Model[2][53] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 2
		gun_8_Model[2][54] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 2
		gun_8_Model[2][55] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 2
		gun_8_Model[2][56] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 2
		gun_8_Model[2][57] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 2
		gun_8_Model[2][58] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 2
		gun_8_Model[2][59] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 2
		gun_8_Model[2][60] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 2
		gun_8_Model[2][61] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 2
		gun_8_Model[2][62] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 2
		gun_8_Model[2][63] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 2
		gun_8_Model[2][64] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][65] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 2
		gun_8_Model[2][66] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 2
		gun_8_Model[2][67] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 2
		gun_8_Model[2][68] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 2
		gun_8_Model[2][69] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 2
		gun_8_Model[2][70] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 2
		gun_8_Model[2][71] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 2
		gun_8_Model[2][72] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 2
		gun_8_Model[2][73] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 2
		gun_8_Model[2][74] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 2
		gun_8_Model[2][75] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 2
		gun_8_Model[2][76] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 2
		gun_8_Model[2][77] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][78] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 2
		gun_8_Model[2][79] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 2
		gun_8_Model[2][80] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 2
		gun_8_Model[2][81] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 2
		gun_8_Model[2][82] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 2
		gun_8_Model[2][83] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 2
		gun_8_Model[2][84] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 2
		gun_8_Model[2][85] = new ModelRendererTurbo(this, 0, 113, textureX, textureY); // Box 2
		gun_8_Model[2][86] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 2
		gun_8_Model[2][87] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 2
		gun_8_Model[2][88] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 2
		gun_8_Model[2][89] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 2
		gun_8_Model[2][90] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][91] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 2
		gun_8_Model[2][92] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 2
		gun_8_Model[2][93] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 2
		gun_8_Model[2][94] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 2
		gun_8_Model[2][95] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 2
		gun_8_Model[2][96] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 2
		gun_8_Model[2][97] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 2
		gun_8_Model[2][98] = new ModelRendererTurbo(this, 0, 113, textureX, textureY); // Box 2
		gun_8_Model[2][99] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 2
		gun_8_Model[2][100] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 2
		gun_8_Model[2][101] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 2
		gun_8_Model[2][102] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 2
		gun_8_Model[2][103] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][104] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 2
		gun_8_Model[2][105] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 2
		gun_8_Model[2][106] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 2
		gun_8_Model[2][107] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 2
		gun_8_Model[2][108] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 2
		gun_8_Model[2][109] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 2
		gun_8_Model[2][110] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 2
		gun_8_Model[2][111] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 2
		gun_8_Model[2][112] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 2
		gun_8_Model[2][113] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 2
		gun_8_Model[2][114] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 2
		gun_8_Model[2][115] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 2
		gun_8_Model[2][116] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][117] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 2
		gun_8_Model[2][118] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 2
		gun_8_Model[2][119] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 2
		gun_8_Model[2][120] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 2
		gun_8_Model[2][121] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 2
		gun_8_Model[2][122] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 2
		gun_8_Model[2][123] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 2
		gun_8_Model[2][124] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 2
		gun_8_Model[2][125] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 2
		gun_8_Model[2][126] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 2
		gun_8_Model[2][127] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 2
		gun_8_Model[2][128] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 2
		gun_8_Model[2][129] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][130] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 2
		gun_8_Model[2][131] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 2
		gun_8_Model[2][132] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 2
		gun_8_Model[2][133] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 2
		gun_8_Model[2][134] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 2
		gun_8_Model[2][135] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 2
		gun_8_Model[2][136] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 2
		gun_8_Model[2][137] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 2
		gun_8_Model[2][138] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 2
		gun_8_Model[2][139] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][140] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 2
		gun_8_Model[2][141] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 2
		gun_8_Model[2][142] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 2
		gun_8_Model[2][143] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 2
		gun_8_Model[2][144] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 2
		gun_8_Model[2][145] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 2
		gun_8_Model[2][146] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 2
		gun_8_Model[2][147] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 2
		gun_8_Model[2][148] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 2
		gun_8_Model[2][149] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 2
		gun_8_Model[2][150] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 2
		gun_8_Model[2][151] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 2
		gun_8_Model[2][152] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 2
		gun_8_Model[2][153] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 2
		gun_8_Model[2][154] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 2
		gun_8_Model[2][155] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 2
		gun_8_Model[2][156] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 2
		gun_8_Model[2][157] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 2
		gun_8_Model[2][158] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 2
		gun_8_Model[2][159] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 2
		gun_8_Model[2][160] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 2
		gun_8_Model[2][161] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 2
		gun_8_Model[2][162] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 2
		gun_8_Model[2][163] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 2
		gun_8_Model[2][164] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 2
		gun_8_Model[2][165] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 2
		gun_8_Model[2][166] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][167] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 2
		gun_8_Model[2][168] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 2
		gun_8_Model[2][169] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 2
		gun_8_Model[2][170] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 2
		gun_8_Model[2][171] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 2
		gun_8_Model[2][172] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 2
		gun_8_Model[2][173] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 2
		gun_8_Model[2][174] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 2
		gun_8_Model[2][175] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 2
		gun_8_Model[2][176] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 2
		gun_8_Model[2][177] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 2
		gun_8_Model[2][178] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 2
		gun_8_Model[2][179] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 2
		gun_8_Model[2][180] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][181] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 2
		gun_8_Model[2][182] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 2
		gun_8_Model[2][183] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 2
		gun_8_Model[2][184] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 2
		gun_8_Model[2][185] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 2
		gun_8_Model[2][186] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 2
		gun_8_Model[2][187] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 2
		gun_8_Model[2][188] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 2
		gun_8_Model[2][189] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 2
		gun_8_Model[2][190] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 2
		gun_8_Model[2][191] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 2
		gun_8_Model[2][192] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 2
		gun_8_Model[2][193] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 2
		gun_8_Model[2][194] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][195] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 2
		gun_8_Model[2][196] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 2
		gun_8_Model[2][197] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 2
		gun_8_Model[2][198] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 2
		gun_8_Model[2][199] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 2
		gun_8_Model[2][200] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 2
		gun_8_Model[2][201] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 2
		gun_8_Model[2][202] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 2
		gun_8_Model[2][203] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 2
		gun_8_Model[2][204] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 2
		gun_8_Model[2][205] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 2
		gun_8_Model[2][206] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 2
		gun_8_Model[2][207] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 2
		gun_8_Model[2][208] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][209] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 2
		gun_8_Model[2][210] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 2
		gun_8_Model[2][211] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 2
		gun_8_Model[2][212] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 2
		gun_8_Model[2][213] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 2
		gun_8_Model[2][214] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 2
		gun_8_Model[2][215] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 2
		gun_8_Model[2][216] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 2
		gun_8_Model[2][217] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 2
		gun_8_Model[2][218] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 2
		gun_8_Model[2][219] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 2
		gun_8_Model[2][220] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 2
		gun_8_Model[2][221] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 2
		gun_8_Model[2][222] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][223] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 2
		gun_8_Model[2][224] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 2
		gun_8_Model[2][225] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 2
		gun_8_Model[2][226] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 2
		gun_8_Model[2][227] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 2
		gun_8_Model[2][228] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 2
		gun_8_Model[2][229] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 2
		gun_8_Model[2][230] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 2
		gun_8_Model[2][231] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 2
		gun_8_Model[2][232] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 2
		gun_8_Model[2][233] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 2
		gun_8_Model[2][234] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 2
		gun_8_Model[2][235] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 2
		gun_8_Model[2][236] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][237] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 2
		gun_8_Model[2][238] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 2
		gun_8_Model[2][239] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 2
		gun_8_Model[2][240] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 2
		gun_8_Model[2][241] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 2
		gun_8_Model[2][242] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 2
		gun_8_Model[2][243] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 2
		gun_8_Model[2][244] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 2
		gun_8_Model[2][245] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 2
		gun_8_Model[2][246] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 2
		gun_8_Model[2][247] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 2
		gun_8_Model[2][248] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 2
		gun_8_Model[2][249] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 2
		gun_8_Model[2][250] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 2
		gun_8_Model[2][251] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 2
		gun_8_Model[2][252] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 2
		gun_8_Model[2][253] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 2
		gun_8_Model[2][254] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 2
		gun_8_Model[2][255] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 2
		gun_8_Model[2][256] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 2
		gun_8_Model[2][257] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 2
		gun_8_Model[2][258] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Box 2
		gun_8_Model[2][259] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 2
		gun_8_Model[2][260] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 2
		gun_8_Model[2][261] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 2
		gun_8_Model[2][262] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 2
		gun_8_Model[2][263] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 2
		gun_8_Model[2][264] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 2
		gun_8_Model[2][265] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 2
		gun_8_Model[2][266] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 2
		gun_8_Model[2][267] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 2
		gun_8_Model[2][268] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 2
		gun_8_Model[2][269] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 2
		gun_8_Model[2][270] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Box 2
		gun_8_Model[2][271] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 2
		gun_8_Model[2][272] = new ModelRendererTurbo(this, 41, 305, textureX, textureY); // Box 563
		gun_8_Model[2][273] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 564
		gun_8_Model[2][274] = new ModelRendererTurbo(this, 201, 313, textureX, textureY); // Box 565
		gun_8_Model[2][275] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 566
		gun_8_Model[2][276] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 567
		gun_8_Model[2][277] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 568
		gun_8_Model[2][278] = new ModelRendererTurbo(this, 201, 329, textureX, textureY); // Box 569
		gun_8_Model[2][279] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 570
		gun_8_Model[2][280] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 806
		gun_8_Model[2][281] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 807
		gun_8_Model[2][282] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Box 808
		gun_8_Model[2][283] = new ModelRendererTurbo(this, 17, 233, textureX, textureY); // Box 809
		gun_8_Model[2][284] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 810
		gun_8_Model[2][285] = new ModelRendererTurbo(this, 505, 233, textureX, textureY); // Box 811
		gun_8_Model[2][286] = new ModelRendererTurbo(this, 313, 241, textureX, textureY); // Box 812
		gun_8_Model[2][287] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 813
		gun_8_Model[2][288] = new ModelRendererTurbo(this, 17, 249, textureX, textureY); // Box 814
		gun_8_Model[2][289] = new ModelRendererTurbo(this, 25, 249, textureX, textureY); // Box 815
		gun_8_Model[2][290] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // Box 816
		gun_8_Model[2][291] = new ModelRendererTurbo(this, 361, 249, textureX, textureY); // Box 817
		gun_8_Model[2][292] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 818
		gun_8_Model[2][293] = new ModelRendererTurbo(this, 265, 257, textureX, textureY); // Box 819
		gun_8_Model[2][294] = new ModelRendererTurbo(this, 401, 257, textureX, textureY); // Box 820
		gun_8_Model[2][295] = new ModelRendererTurbo(this, 409, 257, textureX, textureY); // Box 821
		gun_8_Model[2][296] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Box 822
		gun_8_Model[2][297] = new ModelRendererTurbo(this, 425, 257, textureX, textureY); // Box 823
		gun_8_Model[2][298] = new ModelRendererTurbo(this, 441, 257, textureX, textureY); // Box 824
		gun_8_Model[2][299] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Box 825
		gun_8_Model[2][300] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Box 826
		gun_8_Model[2][301] = new ModelRendererTurbo(this, 49, 265, textureX, textureY); // Box 827
		gun_8_Model[2][302] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Box 828
		gun_8_Model[2][303] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 829
		gun_8_Model[2][304] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Box 830
		gun_8_Model[2][305] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Box 831
		gun_8_Model[2][306] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 613
		gun_8_Model[2][307] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Box 614
		gun_8_Model[2][308] = new ModelRendererTurbo(this, 129, 281, textureX, textureY); // Box 615
		gun_8_Model[2][309] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 616
		gun_8_Model[2][310] = new ModelRendererTurbo(this, 145, 281, textureX, textureY); // Box 617
		gun_8_Model[2][311] = new ModelRendererTurbo(this, 329, 289, textureX, textureY); // Box 618
		gun_8_Model[2][312] = new ModelRendererTurbo(this, 361, 289, textureX, textureY); // Box 619
		gun_8_Model[2][313] = new ModelRendererTurbo(this, 369, 289, textureX, textureY); // Box 620
		gun_8_Model[2][314] = new ModelRendererTurbo(this, 409, 289, textureX, textureY); // Box 621
		gun_8_Model[2][315] = new ModelRendererTurbo(this, 417, 289, textureX, textureY); // Box 622
		gun_8_Model[2][316] = new ModelRendererTurbo(this, 41, 297, textureX, textureY); // Box 623
		gun_8_Model[2][317] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 624
		gun_8_Model[2][318] = new ModelRendererTurbo(this, 57, 297, textureX, textureY); // Box 625
		gun_8_Model[2][319] = new ModelRendererTurbo(this, 89, 297, textureX, textureY); // Box 626
		gun_8_Model[2][320] = new ModelRendererTurbo(this, 97, 297, textureX, textureY); // Box 627
		gun_8_Model[2][321] = new ModelRendererTurbo(this, 105, 297, textureX, textureY); // Box 628
		gun_8_Model[2][322] = new ModelRendererTurbo(this, 113, 297, textureX, textureY); // Box 629
		gun_8_Model[2][323] = new ModelRendererTurbo(this, 121, 297, textureX, textureY); // Box 630
		gun_8_Model[2][324] = new ModelRendererTurbo(this, 129, 297, textureX, textureY); // Box 631
		gun_8_Model[2][325] = new ModelRendererTurbo(this, 193, 297, textureX, textureY); // Box 632
		gun_8_Model[2][326] = new ModelRendererTurbo(this, 201, 297, textureX, textureY); // Box 633
		gun_8_Model[2][327] = new ModelRendererTurbo(this, 209, 297, textureX, textureY); // Box 634
		gun_8_Model[2][328] = new ModelRendererTurbo(this, 217, 297, textureX, textureY); // Box 635
		gun_8_Model[2][329] = new ModelRendererTurbo(this, 225, 297, textureX, textureY); // Box 636
		gun_8_Model[2][330] = new ModelRendererTurbo(this, 233, 297, textureX, textureY); // Box 637
		gun_8_Model[2][331] = new ModelRendererTurbo(this, 329, 297, textureX, textureY); // Box 638
		gun_8_Model[2][332] = new ModelRendererTurbo(this, 361, 297, textureX, textureY); // Box 639
		gun_8_Model[2][333] = new ModelRendererTurbo(this, 425, 297, textureX, textureY); // Box 640
		gun_8_Model[2][334] = new ModelRendererTurbo(this, 433, 297, textureX, textureY); // Box 641
		gun_8_Model[2][335] = new ModelRendererTurbo(this, 441, 297, textureX, textureY); // Box 642
		gun_8_Model[2][336] = new ModelRendererTurbo(this, 449, 297, textureX, textureY); // Box 643
		gun_8_Model[2][337] = new ModelRendererTurbo(this, 457, 297, textureX, textureY); // Box 644
		gun_8_Model[2][338] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Box 645
		gun_8_Model[2][339] = new ModelRendererTurbo(this, 473, 297, textureX, textureY); // Box 646
		gun_8_Model[2][340] = new ModelRendererTurbo(this, 481, 297, textureX, textureY); // Box 647
		gun_8_Model[2][341] = new ModelRendererTurbo(this, 489, 297, textureX, textureY); // Box 648
		gun_8_Model[2][342] = new ModelRendererTurbo(this, 497, 297, textureX, textureY); // Box 649
		gun_8_Model[2][343] = new ModelRendererTurbo(this, 505, 297, textureX, textureY); // Box 650
		gun_8_Model[2][344] = new ModelRendererTurbo(this, 241, 305, textureX, textureY); // Box 651
		gun_8_Model[2][345] = new ModelRendererTurbo(this, 249, 305, textureX, textureY); // Box 652
		gun_8_Model[2][346] = new ModelRendererTurbo(this, 257, 305, textureX, textureY); // Box 653
		gun_8_Model[2][347] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Box 654
		gun_8_Model[2][348] = new ModelRendererTurbo(this, 273, 305, textureX, textureY); // Box 655
		gun_8_Model[2][349] = new ModelRendererTurbo(this, 425, 305, textureX, textureY); // Box 656
		gun_8_Model[2][350] = new ModelRendererTurbo(this, 433, 305, textureX, textureY); // Box 657
		gun_8_Model[2][351] = new ModelRendererTurbo(this, 441, 305, textureX, textureY); // Box 658
		gun_8_Model[2][352] = new ModelRendererTurbo(this, 449, 305, textureX, textureY); // Box 659
		gun_8_Model[2][353] = new ModelRendererTurbo(this, 457, 305, textureX, textureY); // Box 660
		gun_8_Model[2][354] = new ModelRendererTurbo(this, 465, 305, textureX, textureY); // Box 661
		gun_8_Model[2][355] = new ModelRendererTurbo(this, 473, 305, textureX, textureY); // Box 662
		gun_8_Model[2][356] = new ModelRendererTurbo(this, 481, 305, textureX, textureY); // Box 663
		gun_8_Model[2][357] = new ModelRendererTurbo(this, 489, 305, textureX, textureY); // Box 664
		gun_8_Model[2][358] = new ModelRendererTurbo(this, 497, 305, textureX, textureY); // Box 665
		gun_8_Model[2][359] = new ModelRendererTurbo(this, 505, 305, textureX, textureY); // Box 666
		gun_8_Model[2][360] = new ModelRendererTurbo(this, 401, 313, textureX, textureY); // Box 667
		gun_8_Model[2][361] = new ModelRendererTurbo(this, 409, 313, textureX, textureY); // Box 668
		gun_8_Model[2][362] = new ModelRendererTurbo(this, 417, 313, textureX, textureY); // Box 669
		gun_8_Model[2][363] = new ModelRendererTurbo(this, 425, 313, textureX, textureY); // Box 670
		gun_8_Model[2][364] = new ModelRendererTurbo(this, 433, 313, textureX, textureY); // Box 671
		gun_8_Model[2][365] = new ModelRendererTurbo(this, 441, 313, textureX, textureY); // Box 672
		gun_8_Model[2][366] = new ModelRendererTurbo(this, 449, 313, textureX, textureY); // Box 673
		gun_8_Model[2][367] = new ModelRendererTurbo(this, 457, 313, textureX, textureY); // Box 674
		gun_8_Model[2][368] = new ModelRendererTurbo(this, 465, 313, textureX, textureY); // Box 675
		gun_8_Model[2][369] = new ModelRendererTurbo(this, 473, 313, textureX, textureY); // Box 676
		gun_8_Model[2][370] = new ModelRendererTurbo(this, 481, 313, textureX, textureY); // Box 677
		gun_8_Model[2][371] = new ModelRendererTurbo(this, 489, 313, textureX, textureY); // Box 678
		gun_8_Model[2][372] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // Box 679
		gun_8_Model[2][373] = new ModelRendererTurbo(this, 505, 313, textureX, textureY); // Box 680
		gun_8_Model[2][374] = new ModelRendererTurbo(this, 401, 321, textureX, textureY); // Box 681
		gun_8_Model[2][375] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 683
		gun_8_Model[2][376] = new ModelRendererTurbo(this, 425, 321, textureX, textureY); // Box 684
		gun_8_Model[2][377] = new ModelRendererTurbo(this, 433, 321, textureX, textureY); // Box 685
		gun_8_Model[2][378] = new ModelRendererTurbo(this, 441, 321, textureX, textureY); // Box 686
		gun_8_Model[2][379] = new ModelRendererTurbo(this, 449, 321, textureX, textureY); // Box 687
		gun_8_Model[2][380] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 688
		gun_8_Model[2][381] = new ModelRendererTurbo(this, 465, 321, textureX, textureY); // Box 689
		gun_8_Model[2][382] = new ModelRendererTurbo(this, 473, 321, textureX, textureY); // Box 690
		gun_8_Model[2][383] = new ModelRendererTurbo(this, 481, 321, textureX, textureY); // Box 691
		gun_8_Model[2][384] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Box 692
		gun_8_Model[2][385] = new ModelRendererTurbo(this, 497, 321, textureX, textureY); // Box 693
		gun_8_Model[2][386] = new ModelRendererTurbo(this, 505, 321, textureX, textureY); // Box 694
		gun_8_Model[2][387] = new ModelRendererTurbo(this, 401, 329, textureX, textureY); // Box 695
		gun_8_Model[2][388] = new ModelRendererTurbo(this, 409, 329, textureX, textureY); // Box 696
		gun_8_Model[2][389] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 697
		gun_8_Model[2][390] = new ModelRendererTurbo(this, 425, 329, textureX, textureY); // Box 698
		gun_8_Model[2][391] = new ModelRendererTurbo(this, 433, 329, textureX, textureY); // Box 699
		gun_8_Model[2][392] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 700
		gun_8_Model[2][393] = new ModelRendererTurbo(this, 449, 329, textureX, textureY); // Box 701
		gun_8_Model[2][394] = new ModelRendererTurbo(this, 457, 329, textureX, textureY); // Box 702
		gun_8_Model[2][395] = new ModelRendererTurbo(this, 465, 329, textureX, textureY); // Box 703
		gun_8_Model[2][396] = new ModelRendererTurbo(this, 473, 329, textureX, textureY); // Box 704
		gun_8_Model[2][397] = new ModelRendererTurbo(this, 481, 329, textureX, textureY); // Box 705
		gun_8_Model[2][398] = new ModelRendererTurbo(this, 489, 329, textureX, textureY); // Box 706
		gun_8_Model[2][399] = new ModelRendererTurbo(this, 497, 329, textureX, textureY); // Box 707
		gun_8_Model[2][400] = new ModelRendererTurbo(this, 209, 337, textureX, textureY); // Box 710
		gun_8_Model[2][401] = new ModelRendererTurbo(this, 217, 337, textureX, textureY); // Box 711
		gun_8_Model[2][402] = new ModelRendererTurbo(this, 225, 337, textureX, textureY); // Box 712
		gun_8_Model[2][403] = new ModelRendererTurbo(this, 233, 337, textureX, textureY); // Box 713
		gun_8_Model[2][404] = new ModelRendererTurbo(this, 241, 337, textureX, textureY); // Box 714
		gun_8_Model[2][405] = new ModelRendererTurbo(this, 249, 337, textureX, textureY); // Box 715
		gun_8_Model[2][406] = new ModelRendererTurbo(this, 257, 337, textureX, textureY); // Box 716
		gun_8_Model[2][407] = new ModelRendererTurbo(this, 265, 337, textureX, textureY); // Box 717
		gun_8_Model[2][408] = new ModelRendererTurbo(this, 273, 337, textureX, textureY); // Box 718
		gun_8_Model[2][409] = new ModelRendererTurbo(this, 281, 337, textureX, textureY); // Box 719
		gun_8_Model[2][410] = new ModelRendererTurbo(this, 289, 337, textureX, textureY); // Box 720
		gun_8_Model[2][411] = new ModelRendererTurbo(this, 297, 337, textureX, textureY); // Box 721
		gun_8_Model[2][412] = new ModelRendererTurbo(this, 305, 337, textureX, textureY); // Box 722
		gun_8_Model[2][413] = new ModelRendererTurbo(this, 313, 337, textureX, textureY); // Box 723
		gun_8_Model[2][414] = new ModelRendererTurbo(this, 321, 337, textureX, textureY); // Box 724
		gun_8_Model[2][415] = new ModelRendererTurbo(this, 329, 337, textureX, textureY); // Box 725
		gun_8_Model[2][416] = new ModelRendererTurbo(this, 337, 337, textureX, textureY); // Box 726
		gun_8_Model[2][417] = new ModelRendererTurbo(this, 345, 337, textureX, textureY); // Box 727
		gun_8_Model[2][418] = new ModelRendererTurbo(this, 353, 337, textureX, textureY); // Box 728
		gun_8_Model[2][419] = new ModelRendererTurbo(this, 361, 337, textureX, textureY); // Box 729
		gun_8_Model[2][420] = new ModelRendererTurbo(this, 369, 337, textureX, textureY); // Box 730
		gun_8_Model[2][421] = new ModelRendererTurbo(this, 377, 337, textureX, textureY); // Box 731
		gun_8_Model[2][422] = new ModelRendererTurbo(this, 385, 337, textureX, textureY); // Box 732
		gun_8_Model[2][423] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Box 733
		gun_8_Model[2][424] = new ModelRendererTurbo(this, 401, 337, textureX, textureY); // Box 734
		gun_8_Model[2][425] = new ModelRendererTurbo(this, 409, 337, textureX, textureY); // Box 735
		gun_8_Model[2][426] = new ModelRendererTurbo(this, 417, 337, textureX, textureY); // Box 736
		gun_8_Model[2][427] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 737
		gun_8_Model[2][428] = new ModelRendererTurbo(this, 433, 337, textureX, textureY); // Box 738
		gun_8_Model[2][429] = new ModelRendererTurbo(this, 441, 337, textureX, textureY); // Box 739
		gun_8_Model[2][430] = new ModelRendererTurbo(this, 449, 337, textureX, textureY); // Box 740
		gun_8_Model[2][431] = new ModelRendererTurbo(this, 457, 337, textureX, textureY); // Box 741
		gun_8_Model[2][432] = new ModelRendererTurbo(this, 465, 337, textureX, textureY); // Box 742
		gun_8_Model[2][433] = new ModelRendererTurbo(this, 473, 337, textureX, textureY); // Box 743
		gun_8_Model[2][434] = new ModelRendererTurbo(this, 481, 337, textureX, textureY); // Box 744
		gun_8_Model[2][435] = new ModelRendererTurbo(this, 489, 337, textureX, textureY); // Box 745
		gun_8_Model[2][436] = new ModelRendererTurbo(this, 497, 337, textureX, textureY); // Box 746
		gun_8_Model[2][437] = new ModelRendererTurbo(this, 505, 337, textureX, textureY); // Box 747
		gun_8_Model[2][438] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 748
		gun_8_Model[2][439] = new ModelRendererTurbo(this, 9, 345, textureX, textureY); // Box 749
		gun_8_Model[2][440] = new ModelRendererTurbo(this, 17, 345, textureX, textureY); // Box 750
		gun_8_Model[2][441] = new ModelRendererTurbo(this, 25, 345, textureX, textureY); // Box 751
		gun_8_Model[2][442] = new ModelRendererTurbo(this, 33, 345, textureX, textureY); // Box 752
		gun_8_Model[2][443] = new ModelRendererTurbo(this, 41, 345, textureX, textureY); // Box 753
		gun_8_Model[2][444] = new ModelRendererTurbo(this, 49, 345, textureX, textureY); // Box 754
		gun_8_Model[2][445] = new ModelRendererTurbo(this, 57, 345, textureX, textureY); // Box 755
		gun_8_Model[2][446] = new ModelRendererTurbo(this, 65, 345, textureX, textureY); // Box 756
		gun_8_Model[2][447] = new ModelRendererTurbo(this, 73, 345, textureX, textureY); // Box 757
		gun_8_Model[2][448] = new ModelRendererTurbo(this, 81, 345, textureX, textureY); // Box 758
		gun_8_Model[2][449] = new ModelRendererTurbo(this, 89, 345, textureX, textureY); // Box 759
		gun_8_Model[2][450] = new ModelRendererTurbo(this, 97, 345, textureX, textureY); // Box 760
		gun_8_Model[2][451] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 761
		gun_8_Model[2][452] = new ModelRendererTurbo(this, 113, 345, textureX, textureY); // Box 762
		gun_8_Model[2][453] = new ModelRendererTurbo(this, 121, 345, textureX, textureY); // Box 763
		gun_8_Model[2][454] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 764
		gun_8_Model[2][455] = new ModelRendererTurbo(this, 137, 345, textureX, textureY); // Box 765
		gun_8_Model[2][456] = new ModelRendererTurbo(this, 145, 345, textureX, textureY); // Box 766
		gun_8_Model[2][457] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 767
		gun_8_Model[2][458] = new ModelRendererTurbo(this, 161, 345, textureX, textureY); // Box 768
		gun_8_Model[2][459] = new ModelRendererTurbo(this, 169, 345, textureX, textureY); // Box 769
		gun_8_Model[2][460] = new ModelRendererTurbo(this, 177, 345, textureX, textureY); // Box 770
		gun_8_Model[2][461] = new ModelRendererTurbo(this, 185, 345, textureX, textureY); // Box 771
		gun_8_Model[2][462] = new ModelRendererTurbo(this, 193, 345, textureX, textureY); // Box 772
		gun_8_Model[2][463] = new ModelRendererTurbo(this, 201, 345, textureX, textureY); // Box 773
		gun_8_Model[2][464] = new ModelRendererTurbo(this, 209, 345, textureX, textureY); // Box 774
		gun_8_Model[2][465] = new ModelRendererTurbo(this, 217, 345, textureX, textureY); // Box 775
		gun_8_Model[2][466] = new ModelRendererTurbo(this, 225, 345, textureX, textureY); // Box 776
		gun_8_Model[2][467] = new ModelRendererTurbo(this, 233, 345, textureX, textureY); // Box 777
		gun_8_Model[2][468] = new ModelRendererTurbo(this, 241, 345, textureX, textureY); // Box 778
		gun_8_Model[2][469] = new ModelRendererTurbo(this, 249, 345, textureX, textureY); // Box 779
		gun_8_Model[2][470] = new ModelRendererTurbo(this, 257, 345, textureX, textureY); // Box 780
		gun_8_Model[2][471] = new ModelRendererTurbo(this, 265, 345, textureX, textureY); // Box 781
		gun_8_Model[2][472] = new ModelRendererTurbo(this, 273, 345, textureX, textureY); // Box 782
		gun_8_Model[2][473] = new ModelRendererTurbo(this, 281, 345, textureX, textureY); // Box 783
		gun_8_Model[2][474] = new ModelRendererTurbo(this, 289, 345, textureX, textureY); // Box 784
		gun_8_Model[2][475] = new ModelRendererTurbo(this, 297, 345, textureX, textureY); // Box 785
		gun_8_Model[2][476] = new ModelRendererTurbo(this, 305, 345, textureX, textureY); // Box 786
		gun_8_Model[2][477] = new ModelRendererTurbo(this, 313, 345, textureX, textureY); // Box 787
		gun_8_Model[2][478] = new ModelRendererTurbo(this, 321, 345, textureX, textureY); // Box 788
		gun_8_Model[2][479] = new ModelRendererTurbo(this, 329, 345, textureX, textureY); // Box 789
		gun_8_Model[2][480] = new ModelRendererTurbo(this, 337, 345, textureX, textureY); // Box 790
		gun_8_Model[2][481] = new ModelRendererTurbo(this, 345, 345, textureX, textureY); // Box 791
		gun_8_Model[2][482] = new ModelRendererTurbo(this, 353, 345, textureX, textureY); // Box 792
		gun_8_Model[2][483] = new ModelRendererTurbo(this, 361, 345, textureX, textureY); // Box 793
		gun_8_Model[2][484] = new ModelRendererTurbo(this, 369, 345, textureX, textureY); // Box 794
		gun_8_Model[2][485] = new ModelRendererTurbo(this, 369, 345, textureX, textureY); // Box 813
		gun_8_Model[2][486] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 814
		gun_8_Model[2][487] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 815
		gun_8_Model[2][488] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 816
		gun_8_Model[2][489] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 817
		gun_8_Model[2][490] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 818
		gun_8_Model[2][491] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 819
		gun_8_Model[2][492] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 820
		gun_8_Model[2][493] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 821
		gun_8_Model[2][494] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 822
		gun_8_Model[2][495] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 823
		gun_8_Model[2][496] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 824
		gun_8_Model[2][497] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 825
		gun_8_Model[2][498] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 797
		gun_8_Model[2][499] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 798
		gun_8_Model[2][500] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 799

		gun_8_Model[2][0].addShapeBox(3.5F, 2.5F, 7.5F, 24, 1, 1, 0F,2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F); // Box 2

		gun_8_Model[2][1].addShapeBox(28.5F, -15.5F, 7.5F, 1, 18, 1, 0F,-22F, -0.5F, 0F, 21F, -1.5F, 0F, 21F, -1.5F, 0F, -22F, -0.5F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][2].addShapeBox(0.5F, -14.5F, 7.5F, 1, 18, 1, 0F,15F, -0.5F, 0F, -16F, 0.5F, 0F, -16F, 0.5F, 0F, 15F, -0.5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][3].addShapeBox(27.5F, -0.5F, 7.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][4].addShapeBox(24.5F, -0.5F, 7.5F, 3, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][5].addShapeBox(28.5F, -0.5F, 7.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][6].addShapeBox(-1.5F, -1.5F, 7.5F, 3, 4, 1, 0F,0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -3.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.45F, 0F); // Box 2

		gun_8_Model[2][7].addShapeBox(1.5F, -1.5F, 7.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][8].addShapeBox(2.5F, -1.5F, 7.5F, 4, 4, 1, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][9].addShapeBox(27.5F, -9.5F, 7.5F, 1, 9, 1, 0F,2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][10].addShapeBox(5.5F, -10.5F, 7.5F, 1, 10, 1, 0F,-14F, 1.5F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, -14F, 1.5F, 0F, 0F, 0F, 0F, -0.6F, 0.7F, 0F, -0.6F, 0.7F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][11].addShapeBox(23.5F, -15F, 7.5F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][12].addShapeBox(19.5F, -15F, 7.5F, 4, 5, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 2

		gun_8_Model[2][13].addShapeBox(25.5F, -15F, 7.5F, 1, 5, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][14].addShapeBox(-20.5F, -17F, 20.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 2

		gun_8_Model[2][15].addShapeBox(23.5F, -15F, -21.5F, 1, 1, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][16].addShapeBox(-15.5F, -15F, -21.5F, 1, 1, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][17].addShapeBox(50.5F, -15F, -21.5F, 1, 1, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][18].addShapeBox(70.5F, -15F, -21.5F, 1, 1, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][19].addShapeBox(28.5F, -15.5F, -8.5F, 1, 18, 1, 0F,-22F, -0.5F, 0F, 21F, -1.5F, 0F, 21F, -1.5F, 0F, -22F, -0.5F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][20].addShapeBox(27.5F, -9.5F, -8.5F, 1, 9, 1, 0F,2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][21].addShapeBox(25.5F, -15F, -8.5F, 1, 5, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][22].addShapeBox(23.5F, -15F, -8.5F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][23].addShapeBox(19.5F, -15F, -8.5F, 4, 5, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 2

		gun_8_Model[2][24].addShapeBox(5.5F, -10.5F, -8.5F, 1, 10, 1, 0F,-14F, 1.5F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, -14F, 1.5F, 0F, 0F, 0F, 0F, -0.6F, 0.7F, 0F, -0.6F, 0.7F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][25].addShapeBox(2.5F, -1.5F, -8.5F, 4, 4, 1, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][26].addShapeBox(-1.5F, -1.5F, -8.5F, 3, 4, 1, 0F,0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -3.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.45F, 0F); // Box 2

		gun_8_Model[2][27].addShapeBox(1.5F, -1.5F, -8.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][28].addShapeBox(24.5F, -0.5F, -8.5F, 3, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][29].addShapeBox(28.5F, -0.5F, -8.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][30].addShapeBox(27.5F, -0.5F, -8.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][31].addShapeBox(0.5F, -14.5F, -8.5F, 1, 18, 1, 0F,15F, -0.5F, 0F, -16F, 0.5F, 0F, -16F, 0.5F, 0F, 15F, -0.5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][32].addShapeBox(3.5F, 2.5F, -8.5F, 24, 1, 1, 0F,2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F); // Box 2

		gun_8_Model[2][33].addShapeBox(1F, 2F, -8.5F, 1, 1, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2

		gun_8_Model[2][34].addShapeBox(27.5F, 2F, -7.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][35].addShapeBox(-26F, -17.5F, 19.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][36].addShapeBox(-27F, -18.75F, 21.75F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][37].addShapeBox(-26F, -18.5F, 19.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][38].addShapeBox(-26F, -16.5F, 19.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][39].addShapeBox(-3F, -18.5F, 19.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][40].addShapeBox(-3F, -17.5F, 19.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][41].addShapeBox(-3F, -16.5F, 19.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][42].addShapeBox(-27F, -18.75F, 20.25F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][43].addShapeBox(-27F, -16.25F, 20.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][44].addShapeBox(-27F, -16.25F, 21.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][45].addShapeBox(-27F, -18.75F, 21.75F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][46].addShapeBox(-27F, -18.75F, 20.25F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][47].addShapeBox(-27F, -16.25F, 20.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][48].addShapeBox(-27F, -16.25F, 21.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][49].addShapeBox(-27F, -16.25F, 14.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][50].addShapeBox(-27F, -16.25F, 15.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][51].addShapeBox(-26F, -17.5F, 13.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][52].addShapeBox(-27F, -16.25F, 15.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][53].addShapeBox(-27F, -18.75F, 15.75F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][54].addShapeBox(-27F, -18.75F, 15.75F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][55].addShapeBox(-26F, -18.5F, 13.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][56].addShapeBox(-26F, -16.5F, 13.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][57].addShapeBox(-27F, -18.75F, 14.25F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][58].addShapeBox(-27F, -18.75F, 14.25F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][59].addShapeBox(-3F, -16.5F, 13.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][60].addShapeBox(-3F, -17.5F, 13.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][61].addShapeBox(-3F, -18.5F, 13.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][62].addShapeBox(-27F, -16.25F, 8.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][63].addShapeBox(-27F, -16.25F, 9.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][64].addShapeBox(-26F, -17.5F, 7.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][65].addShapeBox(-27F, -16.25F, 9.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][66].addShapeBox(-27F, -18.75F, 9.75F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][67].addShapeBox(-27F, -18.75F, 9.75F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][68].addShapeBox(-26F, -18.5F, 7.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][69].addShapeBox(-26F, -16.5F, 7.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][70].addShapeBox(-27F, -18.75F, 8.25F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][71].addShapeBox(-27F, -18.75F, 8.25F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][72].addShapeBox(-3F, -16.5F, 7.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][73].addShapeBox(-3F, -17.5F, 7.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][74].addShapeBox(-3F, -18.5F, 7.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][75].addShapeBox(-27F, -16.25F, 2.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][76].addShapeBox(-27F, -16.25F, 3.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][77].addShapeBox(-26F, -17.5F, 1.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][78].addShapeBox(-27F, -16.25F, 3.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][79].addShapeBox(-27F, -18.75F, 3.75F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][80].addShapeBox(-27F, -18.75F, 3.75F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][81].addShapeBox(-26F, -18.5F, 1.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][82].addShapeBox(-26F, -16.5F, 1.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][83].addShapeBox(-27F, -18.75F, 2.25F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][84].addShapeBox(-27F, -18.75F, 2.25F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][85].addShapeBox(-3F, -16.5F, 1.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][86].addShapeBox(-3F, -17.5F, 1.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][87].addShapeBox(-3F, -18.5F, 1.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][88].addShapeBox(-27F, -16.25F, -3.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][89].addShapeBox(-27F, -16.25F, -2.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][90].addShapeBox(-26F, -17.5F, -4.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][91].addShapeBox(-27F, -16.25F, -2.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][92].addShapeBox(-27F, -18.75F, -2.25F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][93].addShapeBox(-27F, -18.75F, -2.25F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][94].addShapeBox(-26F, -18.5F, -4.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][95].addShapeBox(-26F, -16.5F, -4.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][96].addShapeBox(-27F, -18.75F, -3.75F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][97].addShapeBox(-27F, -18.75F, -3.75F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][98].addShapeBox(-3F, -16.5F, -4.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][99].addShapeBox(-3F, -17.5F, -4.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][100].addShapeBox(-3F, -18.5F, -4.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][101].addShapeBox(-27F, -16.25F, -9.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][102].addShapeBox(-27F, -16.25F, -8.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][103].addShapeBox(-26F, -17.5F, -10.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][104].addShapeBox(-27F, -16.25F, -8.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][105].addShapeBox(-27F, -18.75F, -8.25F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][106].addShapeBox(-27F, -18.75F, -8.25F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][107].addShapeBox(-26F, -18.5F, -10.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][108].addShapeBox(-26F, -16.5F, -10.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][109].addShapeBox(-27F, -18.75F, -9.75F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][110].addShapeBox(-27F, -18.75F, -9.75F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][111].addShapeBox(-3F, -16.5F, -10.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][112].addShapeBox(-3F, -17.5F, -10.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][113].addShapeBox(-3F, -18.5F, -10.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][114].addShapeBox(-27F, -16.25F, -15.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][115].addShapeBox(-27F, -16.25F, -14.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][116].addShapeBox(-26F, -17.5F, -16.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][117].addShapeBox(-27F, -16.25F, -14.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][118].addShapeBox(-27F, -18.75F, -14.25F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][119].addShapeBox(-27F, -18.75F, -14.25F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][120].addShapeBox(-26F, -18.5F, -16.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][121].addShapeBox(-26F, -16.5F, -16.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][122].addShapeBox(-27F, -18.75F, -15.75F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][123].addShapeBox(-27F, -18.75F, -15.75F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][124].addShapeBox(-3F, -16.5F, -16.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][125].addShapeBox(-3F, -17.5F, -16.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][126].addShapeBox(-3F, -18.5F, -16.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][127].addShapeBox(-27F, -16.25F, -21.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][128].addShapeBox(-27F, -16.25F, -20.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][129].addShapeBox(-26F, -17.5F, -22.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][130].addShapeBox(-27F, -16.25F, -20.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][131].addShapeBox(-27F, -18.75F, -20.25F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][132].addShapeBox(-27F, -18.75F, -20.25F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][133].addShapeBox(-26F, -18.5F, -22.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][134].addShapeBox(-26F, -16.5F, -22.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][135].addShapeBox(-27F, -18.75F, -21.75F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][136].addShapeBox(-27F, -18.75F, -21.75F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][137].addShapeBox(-27F, -11.25F, -21.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][138].addShapeBox(-27F, -11.25F, -20.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][139].addShapeBox(-26F, -12.5F, -22.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][140].addShapeBox(-27F, -11.25F, -20.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][141].addShapeBox(-27F, -13.75F, -20.25F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][142].addShapeBox(-27F, -13.75F, -20.25F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][143].addShapeBox(-26F, -13.5F, -22.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][144].addShapeBox(-26F, -11.5F, -22.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][145].addShapeBox(-27F, -13.75F, -21.75F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][146].addShapeBox(-27F, -13.75F, -21.75F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][147].addShapeBox(-3F, -11.5F, -22.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][148].addShapeBox(-3F, -12.5F, -22.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][149].addShapeBox(-3F, -13.5F, -22.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][150].addShapeBox(-27F, -16.25F, -21.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][151].addShapeBox(-27F, -16.25F, -15.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][152].addShapeBox(-27F, -16.25F, -9.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][153].addShapeBox(-27F, -16.25F, -3.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][154].addShapeBox(-27F, -16.25F, 2.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][155].addShapeBox(-27F, -16.25F, 8.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][156].addShapeBox(-27F, -16.25F, 14.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][157].addShapeBox(-27F, -11.25F, -21.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][158].addShapeBox(-27F, -11.25F, -15.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][159].addShapeBox(-27F, -11.25F, -15.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][160].addShapeBox(-27F, -13.75F, -15.75F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][161].addShapeBox(-27F, -13.75F, -15.75F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][162].addShapeBox(-27F, -13.75F, -14.25F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][163].addShapeBox(-27F, -13.75F, -14.25F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][164].addShapeBox(-27F, -11.25F, -14.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][165].addShapeBox(-27F, -11.25F, -14.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][166].addShapeBox(-26F, -12.5F, -16.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][167].addShapeBox(-26F, -11.5F, -16.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][168].addShapeBox(-26F, -13.5F, -16.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][169].addShapeBox(-3F, -11.5F, -16.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][170].addShapeBox(-3F, -12.5F, -16.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][171].addShapeBox(-3F, -13.5F, -16.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][172].addShapeBox(-27F, -11.25F, -9.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][173].addShapeBox(-27F, -11.25F, -9.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][174].addShapeBox(-27F, -13.75F, -9.75F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][175].addShapeBox(-27F, -13.75F, -9.75F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][176].addShapeBox(-27F, -13.75F, -8.25F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][177].addShapeBox(-27F, -13.75F, -8.25F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][178].addShapeBox(-27F, -11.25F, -8.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][179].addShapeBox(-27F, -11.25F, -8.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][180].addShapeBox(-26F, -12.5F, -10.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][181].addShapeBox(-26F, -11.5F, -10.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][182].addShapeBox(-26F, -13.5F, -10.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][183].addShapeBox(-3F, -11.5F, -10.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][184].addShapeBox(-3F, -12.5F, -10.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][185].addShapeBox(-3F, -13.5F, -10.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][186].addShapeBox(-27F, -11.25F, -3.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][187].addShapeBox(-27F, -11.25F, -3.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][188].addShapeBox(-27F, -13.75F, -3.75F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][189].addShapeBox(-27F, -13.75F, -3.75F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][190].addShapeBox(-27F, -13.75F, -2.25F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][191].addShapeBox(-27F, -13.75F, -2.25F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][192].addShapeBox(-27F, -11.25F, -2.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][193].addShapeBox(-27F, -11.25F, -2.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][194].addShapeBox(-26F, -12.5F, -4.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][195].addShapeBox(-26F, -11.5F, -4.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][196].addShapeBox(-26F, -13.5F, -4.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][197].addShapeBox(-3F, -11.5F, -4.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][198].addShapeBox(-3F, -12.5F, -4.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][199].addShapeBox(-3F, -13.5F, -4.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][200].addShapeBox(-27F, -11.25F, 2.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][201].addShapeBox(-27F, -11.25F, 2.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][202].addShapeBox(-27F, -13.75F, 2.25F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][203].addShapeBox(-27F, -13.75F, 2.25F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][204].addShapeBox(-27F, -13.75F, 3.75F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][205].addShapeBox(-27F, -13.75F, 3.75F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][206].addShapeBox(-27F, -11.25F, 3.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][207].addShapeBox(-27F, -11.25F, 3.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][208].addShapeBox(-26F, -12.5F, 1.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][209].addShapeBox(-26F, -11.5F, 1.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][210].addShapeBox(-26F, -13.5F, 1.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][211].addShapeBox(-3F, -11.5F, 1.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][212].addShapeBox(-3F, -12.5F, 1.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][213].addShapeBox(-3F, -13.5F, 1.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][214].addShapeBox(-27F, -11.25F, 8.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][215].addShapeBox(-27F, -11.25F, 8.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][216].addShapeBox(-27F, -13.75F, 8.25F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][217].addShapeBox(-27F, -13.75F, 8.25F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][218].addShapeBox(-27F, -13.75F, 9.75F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][219].addShapeBox(-27F, -13.75F, 9.75F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][220].addShapeBox(-27F, -11.25F, 9.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][221].addShapeBox(-27F, -11.25F, 9.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][222].addShapeBox(-26F, -12.5F, 7.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][223].addShapeBox(-26F, -11.5F, 7.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][224].addShapeBox(-26F, -13.5F, 7.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][225].addShapeBox(-3F, -11.5F, 7.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][226].addShapeBox(-3F, -12.5F, 7.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][227].addShapeBox(-3F, -13.5F, 7.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][228].addShapeBox(-27F, -11.25F, 14.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][229].addShapeBox(-27F, -11.25F, 14.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][230].addShapeBox(-27F, -13.75F, 14.25F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][231].addShapeBox(-27F, -13.75F, 14.25F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][232].addShapeBox(-27F, -13.75F, 15.75F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][233].addShapeBox(-27F, -13.75F, 15.75F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][234].addShapeBox(-27F, -11.25F, 15.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][235].addShapeBox(-27F, -11.25F, 15.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][236].addShapeBox(-26F, -12.5F, 13.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][237].addShapeBox(-26F, -11.5F, 13.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][238].addShapeBox(-26F, -13.5F, 13.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][239].addShapeBox(-3F, -11.5F, 13.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][240].addShapeBox(-3F, -12.5F, 13.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][241].addShapeBox(-3F, -13.5F, 13.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][242].addShapeBox(-27F, -11.25F, 20.25F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][243].addShapeBox(-27F, -11.25F, 20.25F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][244].addShapeBox(-27F, -13.75F, 20.25F, 5, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][245].addShapeBox(-27F, -13.75F, 20.25F, 1, 1, 0, 0F,0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, -0.25F, 0.25F, -1F, -0.25F, -0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][246].addShapeBox(-27F, -13.75F, 21.75F, 5, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][247].addShapeBox(-27F, -13.75F, 21.75F, 1, 1, 0, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F); // Box 2

		gun_8_Model[2][248].addShapeBox(-27F, -11.25F, 21.75F, 5, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][249].addShapeBox(-27F, -11.25F, 21.75F, 1, 1, 0, 0F,-1F, 0F, 0F, -1F, -0.25F, -0.25F, -1F, -0.25F, 0.25F, -1F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, 0F, 0F, 1F); // Box 2

		gun_8_Model[2][250].addShapeBox(-26F, -12.5F, 19.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][251].addShapeBox(-26F, -11.5F, 19.5F, 23, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][252].addShapeBox(-26F, -13.5F, 19.5F, 23, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][253].addShapeBox(-3F, -11.5F, 19.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 2

		gun_8_Model[2][254].addShapeBox(-3F, -12.5F, 19.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][255].addShapeBox(-3F, -13.5F, 19.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 2

		gun_8_Model[2][256].addShapeBox(-20.5F, -17F, 14.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 2

		gun_8_Model[2][257].addShapeBox(-20.5F, -17F, 2.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 2

		gun_8_Model[2][258].addShapeBox(-20.5F, -17F, 8.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 2

		gun_8_Model[2][259].addShapeBox(-20.5F, -17F, -9.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 2

		gun_8_Model[2][260].addShapeBox(-20.5F, -17F, -3.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 2

		gun_8_Model[2][261].addShapeBox(-20.5F, -17F, -21.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 2

		gun_8_Model[2][262].addShapeBox(-20.5F, -17F, -15.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 2

		gun_8_Model[2][263].addShapeBox(30F, -21.5F, -0.5F, 1, 27, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 2

		gun_8_Model[2][264].addShapeBox(29.25F, 3.5F, -2F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][265].addShapeBox(24.5F, -15F, -8.5F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][266].addShapeBox(40.5F, -15F, -8.5F, 10, 1, 1, 0F,0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 2

		gun_8_Model[2][267].addShapeBox(40.5F, -15F, 7.5F, 10, 1, 1, 0F,0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 2

		gun_8_Model[2][268].addShapeBox(24.5F, -15F, 7.5F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][269].addShapeBox(31.25F, 3.5F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 2

		gun_8_Model[2][270].addShapeBox(28.25F, 3.5F, -2F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2

		gun_8_Model[2][271].addShapeBox(30F, 5.5F, -0.5F, 1, 26, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 12.25F, 0F, 0.25F, -11.75F, 0F, 0.25F, -11.75F, 0F, 0.25F, 12.25F, 0F, 0.25F); // Box 2

		gun_8_Model[2][272].addShapeBox(-20.5F, -13F, 20.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 563

		gun_8_Model[2][273].addShapeBox(-20.5F, -13F, -21.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 564

		gun_8_Model[2][274].addShapeBox(-20.5F, -13F, -15.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 565

		gun_8_Model[2][275].addShapeBox(-20.5F, -13F, -9.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 566

		gun_8_Model[2][276].addShapeBox(-20.5F, -13F, -3.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 567

		gun_8_Model[2][277].addShapeBox(-20.5F, -13F, 2.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 568

		gun_8_Model[2][278].addShapeBox(-20.5F, -13F, 8.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 569

		gun_8_Model[2][279].addShapeBox(-20.5F, -13F, 14.5F, 98, 1, 1, 0F,2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F); // Box 570

		gun_8_Model[2][280].addShapeBox(76F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 806

		gun_8_Model[2][281].addShapeBox(72.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 807

		gun_8_Model[2][282].addShapeBox(68.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 808

		gun_8_Model[2][283].addShapeBox(64.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 809

		gun_8_Model[2][284].addShapeBox(60.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 810

		gun_8_Model[2][285].addShapeBox(56.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 811

		gun_8_Model[2][286].addShapeBox(52.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 812

		gun_8_Model[2][287].addShapeBox(48.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 813

		gun_8_Model[2][288].addShapeBox(44.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 814

		gun_8_Model[2][289].addShapeBox(40.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 815

		gun_8_Model[2][290].addShapeBox(-23.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 816

		gun_8_Model[2][291].addShapeBox(-19.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 817

		gun_8_Model[2][292].addShapeBox(-15.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 818

		gun_8_Model[2][293].addShapeBox(-11.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 819

		gun_8_Model[2][294].addShapeBox(-7.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 820

		gun_8_Model[2][295].addShapeBox(-3.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 821

		gun_8_Model[2][296].addShapeBox(0.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 822

		gun_8_Model[2][297].addShapeBox(8.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 823

		gun_8_Model[2][298].addShapeBox(32.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 824

		gun_8_Model[2][299].addShapeBox(28.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 825

		gun_8_Model[2][300].addShapeBox(20.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 826

		gun_8_Model[2][301].addShapeBox(16.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 827

		gun_8_Model[2][302].addShapeBox(12.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 828

		gun_8_Model[2][303].addShapeBox(4.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 829

		gun_8_Model[2][304].addShapeBox(24.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 830

		gun_8_Model[2][305].addShapeBox(36.5F, -14F, 20.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 831

		gun_8_Model[2][306].addShapeBox(76F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 613

		gun_8_Model[2][307].addShapeBox(72.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 614

		gun_8_Model[2][308].addShapeBox(68.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 615

		gun_8_Model[2][309].addShapeBox(64.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 616

		gun_8_Model[2][310].addShapeBox(60.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 617

		gun_8_Model[2][311].addShapeBox(56.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 618

		gun_8_Model[2][312].addShapeBox(52.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 619

		gun_8_Model[2][313].addShapeBox(48.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 620

		gun_8_Model[2][314].addShapeBox(44.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 621

		gun_8_Model[2][315].addShapeBox(40.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 622

		gun_8_Model[2][316].addShapeBox(-23.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 623

		gun_8_Model[2][317].addShapeBox(-19.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 624

		gun_8_Model[2][318].addShapeBox(-11.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 625

		gun_8_Model[2][319].addShapeBox(-7.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 626

		gun_8_Model[2][320].addShapeBox(-3.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 627

		gun_8_Model[2][321].addShapeBox(0.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 628

		gun_8_Model[2][322].addShapeBox(8.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 629

		gun_8_Model[2][323].addShapeBox(32.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 630

		gun_8_Model[2][324].addShapeBox(28.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 631

		gun_8_Model[2][325].addShapeBox(20.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 632

		gun_8_Model[2][326].addShapeBox(16.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 633

		gun_8_Model[2][327].addShapeBox(12.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 634

		gun_8_Model[2][328].addShapeBox(4.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 635

		gun_8_Model[2][329].addShapeBox(24.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 636

		gun_8_Model[2][330].addShapeBox(36.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 637

		gun_8_Model[2][331].addShapeBox(-15.5F, -14F, 14.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 638

		gun_8_Model[2][332].addShapeBox(76F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 639

		gun_8_Model[2][333].addShapeBox(72.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 640

		gun_8_Model[2][334].addShapeBox(68.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 641

		gun_8_Model[2][335].addShapeBox(64.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 642

		gun_8_Model[2][336].addShapeBox(60.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 643

		gun_8_Model[2][337].addShapeBox(56.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 644

		gun_8_Model[2][338].addShapeBox(52.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 645

		gun_8_Model[2][339].addShapeBox(48.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 646

		gun_8_Model[2][340].addShapeBox(44.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 647

		gun_8_Model[2][341].addShapeBox(40.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 648

		gun_8_Model[2][342].addShapeBox(-23.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 649

		gun_8_Model[2][343].addShapeBox(-19.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 650

		gun_8_Model[2][344].addShapeBox(-11.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 651

		gun_8_Model[2][345].addShapeBox(-7.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 652

		gun_8_Model[2][346].addShapeBox(-3.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 653

		gun_8_Model[2][347].addShapeBox(0.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 654

		gun_8_Model[2][348].addShapeBox(8.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 655

		gun_8_Model[2][349].addShapeBox(32.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 656

		gun_8_Model[2][350].addShapeBox(28.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 657

		gun_8_Model[2][351].addShapeBox(20.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 658

		gun_8_Model[2][352].addShapeBox(16.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 659

		gun_8_Model[2][353].addShapeBox(12.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 660

		gun_8_Model[2][354].addShapeBox(4.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 661

		gun_8_Model[2][355].addShapeBox(24.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 662

		gun_8_Model[2][356].addShapeBox(36.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 663

		gun_8_Model[2][357].addShapeBox(-15.5F, -14F, 8.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 664

		gun_8_Model[2][358].addShapeBox(76F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 665

		gun_8_Model[2][359].addShapeBox(72.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 666

		gun_8_Model[2][360].addShapeBox(68.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 667

		gun_8_Model[2][361].addShapeBox(64.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 668

		gun_8_Model[2][362].addShapeBox(60.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 669

		gun_8_Model[2][363].addShapeBox(56.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 670

		gun_8_Model[2][364].addShapeBox(52.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 671

		gun_8_Model[2][365].addShapeBox(48.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 672

		gun_8_Model[2][366].addShapeBox(44.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 673

		gun_8_Model[2][367].addShapeBox(40.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 674

		gun_8_Model[2][368].addShapeBox(-23.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 675

		gun_8_Model[2][369].addShapeBox(-19.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 676

		gun_8_Model[2][370].addShapeBox(-11.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 677

		gun_8_Model[2][371].addShapeBox(-7.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 678

		gun_8_Model[2][372].addShapeBox(-3.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 679

		gun_8_Model[2][373].addShapeBox(0.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 680

		gun_8_Model[2][374].addShapeBox(8.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 681

		gun_8_Model[2][375].addShapeBox(29.5F, -14F, -0.5F, 2, 3, 1, 0F,1F, 0F, 2.8F, 1F, 0F, 2.8F, 1F, 0F, 2.8F, 1F, 0F, 2.8F, 1F, 0F, 2.8F, 1F, 0F, 2.8F, 1F, 0F, 2.8F, 1F, 0F, 2.8F); // Box 683

		gun_8_Model[2][376].addShapeBox(20.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 684

		gun_8_Model[2][377].addShapeBox(16.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 685

		gun_8_Model[2][378].addShapeBox(12.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 686

		gun_8_Model[2][379].addShapeBox(4.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 687

		gun_8_Model[2][380].addShapeBox(24.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 688

		gun_8_Model[2][381].addShapeBox(36.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 689

		gun_8_Model[2][382].addShapeBox(-15.5F, -14F, 2.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 690

		gun_8_Model[2][383].addShapeBox(76F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 691

		gun_8_Model[2][384].addShapeBox(72.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 692

		gun_8_Model[2][385].addShapeBox(68.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 693

		gun_8_Model[2][386].addShapeBox(64.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 694

		gun_8_Model[2][387].addShapeBox(60.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 695

		gun_8_Model[2][388].addShapeBox(56.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 696

		gun_8_Model[2][389].addShapeBox(52.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 697

		gun_8_Model[2][390].addShapeBox(48.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 698

		gun_8_Model[2][391].addShapeBox(44.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 699

		gun_8_Model[2][392].addShapeBox(40.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 700

		gun_8_Model[2][393].addShapeBox(-23.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 701

		gun_8_Model[2][394].addShapeBox(-19.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 702

		gun_8_Model[2][395].addShapeBox(-11.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 703

		gun_8_Model[2][396].addShapeBox(-7.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 704

		gun_8_Model[2][397].addShapeBox(-3.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 705

		gun_8_Model[2][398].addShapeBox(0.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 706

		gun_8_Model[2][399].addShapeBox(8.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 707

		gun_8_Model[2][400].addShapeBox(20.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 710

		gun_8_Model[2][401].addShapeBox(16.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 711

		gun_8_Model[2][402].addShapeBox(12.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 712

		gun_8_Model[2][403].addShapeBox(4.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 713

		gun_8_Model[2][404].addShapeBox(24.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 714

		gun_8_Model[2][405].addShapeBox(36.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 715

		gun_8_Model[2][406].addShapeBox(-15.5F, -14F, -3.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 716

		gun_8_Model[2][407].addShapeBox(76F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 717

		gun_8_Model[2][408].addShapeBox(72.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 718

		gun_8_Model[2][409].addShapeBox(68.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 719

		gun_8_Model[2][410].addShapeBox(64.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 720

		gun_8_Model[2][411].addShapeBox(60.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 721

		gun_8_Model[2][412].addShapeBox(56.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 722

		gun_8_Model[2][413].addShapeBox(52.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 723

		gun_8_Model[2][414].addShapeBox(48.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 724

		gun_8_Model[2][415].addShapeBox(44.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 725

		gun_8_Model[2][416].addShapeBox(40.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 726

		gun_8_Model[2][417].addShapeBox(-23.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 727

		gun_8_Model[2][418].addShapeBox(-19.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 728

		gun_8_Model[2][419].addShapeBox(-11.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 729

		gun_8_Model[2][420].addShapeBox(-7.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 730

		gun_8_Model[2][421].addShapeBox(-3.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 731

		gun_8_Model[2][422].addShapeBox(0.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 732

		gun_8_Model[2][423].addShapeBox(8.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 733

		gun_8_Model[2][424].addShapeBox(32.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 734

		gun_8_Model[2][425].addShapeBox(28.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 735

		gun_8_Model[2][426].addShapeBox(20.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 736

		gun_8_Model[2][427].addShapeBox(16.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 737

		gun_8_Model[2][428].addShapeBox(12.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 738

		gun_8_Model[2][429].addShapeBox(4.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 739

		gun_8_Model[2][430].addShapeBox(24.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 740

		gun_8_Model[2][431].addShapeBox(36.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 741

		gun_8_Model[2][432].addShapeBox(-15.5F, -14F, -9.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 742

		gun_8_Model[2][433].addShapeBox(76F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 743

		gun_8_Model[2][434].addShapeBox(72.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 744

		gun_8_Model[2][435].addShapeBox(68.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 745

		gun_8_Model[2][436].addShapeBox(64.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 746

		gun_8_Model[2][437].addShapeBox(60.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 747

		gun_8_Model[2][438].addShapeBox(56.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 748

		gun_8_Model[2][439].addShapeBox(52.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 749

		gun_8_Model[2][440].addShapeBox(48.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 750

		gun_8_Model[2][441].addShapeBox(44.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 751

		gun_8_Model[2][442].addShapeBox(40.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 752

		gun_8_Model[2][443].addShapeBox(-23.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 753

		gun_8_Model[2][444].addShapeBox(-19.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 754

		gun_8_Model[2][445].addShapeBox(-11.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 755

		gun_8_Model[2][446].addShapeBox(-7.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 756

		gun_8_Model[2][447].addShapeBox(-3.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 757

		gun_8_Model[2][448].addShapeBox(0.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 758

		gun_8_Model[2][449].addShapeBox(8.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 759

		gun_8_Model[2][450].addShapeBox(32.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 760

		gun_8_Model[2][451].addShapeBox(28.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 761

		gun_8_Model[2][452].addShapeBox(20.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 762

		gun_8_Model[2][453].addShapeBox(16.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 763

		gun_8_Model[2][454].addShapeBox(12.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 764

		gun_8_Model[2][455].addShapeBox(4.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 765

		gun_8_Model[2][456].addShapeBox(24.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 766

		gun_8_Model[2][457].addShapeBox(36.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 767

		gun_8_Model[2][458].addShapeBox(-15.5F, -14F, -15.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 768

		gun_8_Model[2][459].addShapeBox(76F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 769

		gun_8_Model[2][460].addShapeBox(72.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 770

		gun_8_Model[2][461].addShapeBox(68.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 771

		gun_8_Model[2][462].addShapeBox(64.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 772

		gun_8_Model[2][463].addShapeBox(60.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 773

		gun_8_Model[2][464].addShapeBox(56.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 774

		gun_8_Model[2][465].addShapeBox(52.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 775

		gun_8_Model[2][466].addShapeBox(48.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 776

		gun_8_Model[2][467].addShapeBox(44.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 777

		gun_8_Model[2][468].addShapeBox(40.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 778

		gun_8_Model[2][469].addShapeBox(-23.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 779

		gun_8_Model[2][470].addShapeBox(-19.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 780

		gun_8_Model[2][471].addShapeBox(-11.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 781

		gun_8_Model[2][472].addShapeBox(-7.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 782

		gun_8_Model[2][473].addShapeBox(-3.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 783

		gun_8_Model[2][474].addShapeBox(0.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 784

		gun_8_Model[2][475].addShapeBox(8.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 785

		gun_8_Model[2][476].addShapeBox(32.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 786

		gun_8_Model[2][477].addShapeBox(28.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 787

		gun_8_Model[2][478].addShapeBox(20.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 788

		gun_8_Model[2][479].addShapeBox(16.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 789

		gun_8_Model[2][480].addShapeBox(12.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 790

		gun_8_Model[2][481].addShapeBox(4.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 791

		gun_8_Model[2][482].addShapeBox(24.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 792

		gun_8_Model[2][483].addShapeBox(36.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 793

		gun_8_Model[2][484].addShapeBox(-15.5F, -14F, -21.5F, 2, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 794

		gun_8_Model[2][485].addShapeBox(1.5F, -1.5F, 8.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 813

		gun_8_Model[2][486].addShapeBox(0.5F, -1.5F, 15.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 814

		gun_8_Model[2][487].addShapeBox(0.5F, -2.5F, 15.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 815

		gun_8_Model[2][488].addShapeBox(0.5F, -0.5F, 15.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 816

		gun_8_Model[2][489].addShapeBox(1F, -2F, 16.5F, 2, 2, 1, 0F,-0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Box 817

		gun_8_Model[2][490].addShapeBox(1F, -2F, 17.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 818

		gun_8_Model[2][491].addShapeBox(1.5F, -1.5F, 18.5F, 1, 1, 2, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 819

		gun_8_Model[2][492].addShapeBox(1.5F, -5.5F, 19F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 820

		gun_8_Model[2][493].addShapeBox(2.5F, -5.5F, 19F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 821

		gun_8_Model[2][494].addShapeBox(1.5F, -4.5F, 18F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 822

		gun_8_Model[2][495].addShapeBox(1.5F, -4.5F, 20F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 823

		gun_8_Model[2][496].addShapeBox(0.5F, -3F, 19F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 824

		gun_8_Model[2][497].addShapeBox(-0.1F, -3F, 19F, 1, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 825

		gun_8_Model[2][498].addShapeBox(-3F, -18.5F, -22.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F); // Box 797

		gun_8_Model[2][499].addShapeBox(-3F, -17.5F, -22.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 798

		gun_8_Model[2][500].addShapeBox(-3F, -16.5F, -22.5F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1F); // Box 799

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_8_Model[2])
		{
			gunPart.setRotationPoint(-105.5F, -65.7F, 0F);
		}


		registerGunModel("Katyusha", gun_8_Model);
	}
}