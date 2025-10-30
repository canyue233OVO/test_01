//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: T95
// Model Creator: 
// Created on: 06.07.2017 - 00:34:39
// Last changed on: 06.07.2017 - 00:34:39

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelT95Aoba extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelT95Aoba() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[371];
		barrelModel = new ModelRendererTurbo[36];
		leftTrackWheelModels = new ModelRendererTurbo[40];
		rightTrackWheelModels = new ModelRendererTurbo[40];
		leftTrackModel = new ModelRendererTurbo[164];
		rightTrackModel = new ModelRendererTurbo[164];

		initbodyModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 832, 229, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 309, 25, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 39
		bodyModel[33] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 40
		bodyModel[34] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 41
		bodyModel[35] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 42
		bodyModel[36] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 46
		bodyModel[38] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 49
		bodyModel[39] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 50
		bodyModel[40] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Box 53
		bodyModel[41] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 54
		bodyModel[42] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 57
		bodyModel[43] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 58
		bodyModel[44] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 61
		bodyModel[45] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 63
		bodyModel[46] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 65
		bodyModel[47] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 67
		bodyModel[48] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 70
		bodyModel[49] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 71
		bodyModel[50] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 73
		bodyModel[51] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 74
		bodyModel[52] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 75
		bodyModel[53] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 78
		bodyModel[54] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 79
		bodyModel[55] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Box 80
		bodyModel[56] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 81
		bodyModel[57] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 82
		bodyModel[58] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 83
		bodyModel[59] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 84
		bodyModel[60] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 85
		bodyModel[61] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 86
		bodyModel[62] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 87
		bodyModel[63] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 88
		bodyModel[64] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 89
		bodyModel[65] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 90
		bodyModel[66] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 91
		bodyModel[67] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 92
		bodyModel[68] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 93
		bodyModel[69] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 94
		bodyModel[70] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 95
		bodyModel[71] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 96
		bodyModel[72] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 133
		bodyModel[73] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 134
		bodyModel[74] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 135
		bodyModel[75] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Box 136
		bodyModel[76] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Box 137
		bodyModel[77] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 138
		bodyModel[78] = new ModelRendererTurbo(this, 745, 89, textureX, textureY); // Box 139
		bodyModel[79] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 140
		bodyModel[80] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 141
		bodyModel[81] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 142
		bodyModel[82] = new ModelRendererTurbo(this, 569, 121, textureX, textureY); // Box 143
		bodyModel[83] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 144
		bodyModel[84] = new ModelRendererTurbo(this, 697, 121, textureX, textureY); // Box 145
		bodyModel[85] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 146
		bodyModel[86] = new ModelRendererTurbo(this, 713, 121, textureX, textureY); // Box 147
		bodyModel[87] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Box 148
		bodyModel[88] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 149
		bodyModel[89] = new ModelRendererTurbo(this, 825, 129, textureX, textureY); // Box 150
		bodyModel[90] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 151
		bodyModel[91] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 152
		bodyModel[92] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 153
		bodyModel[93] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 154
		bodyModel[94] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 155
		bodyModel[95] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 156
		bodyModel[96] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Box 157
		bodyModel[97] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 158
		bodyModel[98] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 159
		bodyModel[99] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 160
		bodyModel[100] = new ModelRendererTurbo(this, 569, 129, textureX, textureY); // Box 161
		bodyModel[101] = new ModelRendererTurbo(this, 649, 129, textureX, textureY); // Box 163
		bodyModel[102] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 143
		bodyModel[103] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 144
		bodyModel[104] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 146
		bodyModel[105] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 147
		bodyModel[106] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 148
		bodyModel[107] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Box 149
		bodyModel[108] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Box 150
		bodyModel[109] = new ModelRendererTurbo(this, 673, 137, textureX, textureY); // Box 151
		bodyModel[110] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Box 152
		bodyModel[111] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 153
		bodyModel[112] = new ModelRendererTurbo(this, 865, 145, textureX, textureY); // Box 154
		bodyModel[113] = new ModelRendererTurbo(this, 929, 145, textureX, textureY); // Box 155
		bodyModel[114] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 156
		bodyModel[115] = new ModelRendererTurbo(this, 969, 129, textureX, textureY); // Box 157
		bodyModel[116] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 158
		bodyModel[117] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 163
		bodyModel[118] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 164
		bodyModel[119] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 165
		bodyModel[120] = new ModelRendererTurbo(this, 252, 205, textureX, textureY); // Box 166
		bodyModel[121] = new ModelRendererTurbo(this, 905, 145, textureX, textureY); // Box 167
		bodyModel[122] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Box 168
		bodyModel[123] = new ModelRendererTurbo(this, 769, 169, textureX, textureY); // Box 169
		bodyModel[124] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Box 171
		bodyModel[125] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Box 172
		bodyModel[126] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 173
		bodyModel[127] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 174
		bodyModel[128] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 175
		bodyModel[129] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 176
		bodyModel[130] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 177
		bodyModel[131] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 178
		bodyModel[132] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Box 179
		bodyModel[133] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 180
		bodyModel[134] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 181
		bodyModel[135] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 182
		bodyModel[136] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 183
		bodyModel[137] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Box 187
		bodyModel[138] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 188
		bodyModel[139] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 189
		bodyModel[140] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 190
		bodyModel[141] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 191
		bodyModel[142] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 192
		bodyModel[143] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 193
		bodyModel[144] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 194
		bodyModel[145] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 195
		bodyModel[146] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 196
		bodyModel[147] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 197
		bodyModel[148] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 198
		bodyModel[149] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 199
		bodyModel[150] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 200
		bodyModel[151] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 201
		bodyModel[152] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 202
		bodyModel[153] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 203
		bodyModel[154] = new ModelRendererTurbo(this, 713, 129, textureX, textureY); // Box 204
		bodyModel[155] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 205
		bodyModel[156] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 206
		bodyModel[157] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 207
		bodyModel[158] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 208
		bodyModel[159] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 209
		bodyModel[160] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 210
		bodyModel[161] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Box 211
		bodyModel[162] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Box 212
		bodyModel[163] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 213
		bodyModel[164] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 214
		bodyModel[165] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 216
		bodyModel[166] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 217
		bodyModel[167] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 220
		bodyModel[168] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 222
		bodyModel[169] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 223
		bodyModel[170] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 224
		bodyModel[171] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 225
		bodyModel[172] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 226
		bodyModel[173] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 227
		bodyModel[174] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Box 228
		bodyModel[175] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 229
		bodyModel[176] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 230
		bodyModel[177] = new ModelRendererTurbo(this, 937, 97, textureX, textureY); // Box 231
		bodyModel[178] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 232
		bodyModel[179] = new ModelRendererTurbo(this, 529, 97, textureX, textureY); // Box 233
		bodyModel[180] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 234
		bodyModel[181] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 235
		bodyModel[182] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 236
		bodyModel[183] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 237
		bodyModel[184] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 238
		bodyModel[185] = new ModelRendererTurbo(this, 569, 129, textureX, textureY); // Box 239
		bodyModel[186] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 240
		bodyModel[187] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 241
		bodyModel[188] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 242
		bodyModel[189] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 243
		bodyModel[190] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 244
		bodyModel[191] = new ModelRendererTurbo(this, 649, 129, textureX, textureY); // Box 245
		bodyModel[192] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 246
		bodyModel[193] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 247
		bodyModel[194] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Box 248
		bodyModel[195] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 249
		bodyModel[196] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 250
		bodyModel[197] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 251
		bodyModel[198] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Box 252
		bodyModel[199] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 253
		bodyModel[200] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 254
		bodyModel[201] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Box 255
		bodyModel[202] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 256
		bodyModel[203] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Box 257
		bodyModel[204] = new ModelRendererTurbo(this, 761, 129, textureX, textureY); // Box 258
		bodyModel[205] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 259
		bodyModel[206] = new ModelRendererTurbo(this, 969, 97, textureX, textureY); // Box 260
		bodyModel[207] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 261
		bodyModel[208] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Box 262
		bodyModel[209] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 263
		bodyModel[210] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 264
		bodyModel[211] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 265
		bodyModel[212] = new ModelRendererTurbo(this, 553, 121, textureX, textureY); // Box 266
		bodyModel[213] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Box 267
		bodyModel[214] = new ModelRendererTurbo(this, 1017, 113, textureX, textureY); // Box 268
		bodyModel[215] = new ModelRendererTurbo(this, 617, 121, textureX, textureY); // Box 269
		bodyModel[216] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 270
		bodyModel[217] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 271
		bodyModel[218] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 272
		bodyModel[219] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 294
		bodyModel[220] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Box 295
		bodyModel[221] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 296
		bodyModel[222] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 297
		bodyModel[223] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Box 298
		bodyModel[224] = new ModelRendererTurbo(this, 737, 129, textureX, textureY); // Box 299
		bodyModel[225] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 300
		bodyModel[226] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 301
		bodyModel[227] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 302
		bodyModel[228] = new ModelRendererTurbo(this, 777, 129, textureX, textureY); // Box 303
		bodyModel[229] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 304
		bodyModel[230] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 305
		bodyModel[231] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Box 306
		bodyModel[232] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 307
		bodyModel[233] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 308
		bodyModel[234] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 309
		bodyModel[235] = new ModelRendererTurbo(this, 513, 129, textureX, textureY); // Box 310
		bodyModel[236] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 311
		bodyModel[237] = new ModelRendererTurbo(this, 689, 129, textureX, textureY); // Box 312
		bodyModel[238] = new ModelRendererTurbo(this, 705, 129, textureX, textureY); // Box 313
		bodyModel[239] = new ModelRendererTurbo(this, 729, 129, textureX, textureY); // Box 314
		bodyModel[240] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 315
		bodyModel[241] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 316
		bodyModel[242] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 317
		bodyModel[243] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 318
		bodyModel[244] = new ModelRendererTurbo(this, 769, 97, textureX, textureY); // Box 319
		bodyModel[245] = new ModelRendererTurbo(this, 569, 129, textureX, textureY); // Box 320
		bodyModel[246] = new ModelRendererTurbo(this, 937, 129, textureX, textureY); // Box 321
		bodyModel[247] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Box 322
		bodyModel[248] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Box 323
		bodyModel[249] = new ModelRendererTurbo(this, 529, 137, textureX, textureY); // Box 324
		bodyModel[250] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Box 325
		bodyModel[251] = new ModelRendererTurbo(this, 969, 129, textureX, textureY); // Box 326
		bodyModel[252] = new ModelRendererTurbo(this, 977, 129, textureX, textureY); // Box 327
		bodyModel[253] = new ModelRendererTurbo(this, 1009, 129, textureX, textureY); // Box 328
		bodyModel[254] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Box 329
		bodyModel[255] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 330
		bodyModel[256] = new ModelRendererTurbo(this, 753, 137, textureX, textureY); // Box 331
		bodyModel[257] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Box 332
		bodyModel[258] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 333
		bodyModel[259] = new ModelRendererTurbo(this, 865, 137, textureX, textureY); // Box 334
		bodyModel[260] = new ModelRendererTurbo(this, 577, 129, textureX, textureY); // Box 335
		bodyModel[261] = new ModelRendererTurbo(this, 649, 129, textureX, textureY); // Box 336
		bodyModel[262] = new ModelRendererTurbo(this, 657, 129, textureX, textureY); // Box 337
		bodyModel[263] = new ModelRendererTurbo(this, 881, 137, textureX, textureY); // Box 338
		bodyModel[264] = new ModelRendererTurbo(this, 889, 137, textureX, textureY); // Box 339
		bodyModel[265] = new ModelRendererTurbo(this, 897, 137, textureX, textureY); // Box 340
		bodyModel[266] = new ModelRendererTurbo(this, 1009, 137, textureX, textureY); // Box 341
		bodyModel[267] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 342
		bodyModel[268] = new ModelRendererTurbo(this, 905, 137, textureX, textureY); // Box 343
		bodyModel[269] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 344
		bodyModel[270] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 345
		bodyModel[271] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 346
		bodyModel[272] = new ModelRendererTurbo(this, 977, 177, textureX, textureY); // Box 347
		bodyModel[273] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 348
		bodyModel[274] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 349
		bodyModel[275] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 350
		bodyModel[276] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 351
		bodyModel[277] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 352
		bodyModel[278] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 353
		bodyModel[279] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 354
		bodyModel[280] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 355
		bodyModel[281] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Box 356
		bodyModel[282] = new ModelRendererTurbo(this, 761, 129, textureX, textureY); // Box 357
		bodyModel[283] = new ModelRendererTurbo(this, 753, 97, textureX, textureY); // Box 358
		bodyModel[284] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 359
		bodyModel[285] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Box 360
		bodyModel[286] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 361
		bodyModel[287] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 362
		bodyModel[288] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 363
		bodyModel[289] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 364
		bodyModel[290] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 365
		bodyModel[291] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 366
		bodyModel[292] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 367
		bodyModel[293] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 368
		bodyModel[294] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 369
		bodyModel[295] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 370
		bodyModel[296] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 371
		bodyModel[297] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 372
		bodyModel[298] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 373
		bodyModel[299] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 374
		bodyModel[300] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 375
		bodyModel[301] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 376
		bodyModel[302] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 377
		bodyModel[303] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 378
		bodyModel[304] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Box 379
		bodyModel[305] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 380
		bodyModel[306] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 381
		bodyModel[307] = new ModelRendererTurbo(this, 529, 145, textureX, textureY); // Box 382
		bodyModel[308] = new ModelRendererTurbo(this, 537, 145, textureX, textureY); // Box 383
		bodyModel[309] = new ModelRendererTurbo(this, 545, 145, textureX, textureY); // Box 384
		bodyModel[310] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Box 385
		bodyModel[311] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Box 386
		bodyModel[312] = new ModelRendererTurbo(this, 625, 145, textureX, textureY); // Box 387
		bodyModel[313] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Box 388
		bodyModel[314] = new ModelRendererTurbo(this, 713, 145, textureX, textureY); // Box 389
		bodyModel[315] = new ModelRendererTurbo(this, 721, 145, textureX, textureY); // Box 390
		bodyModel[316] = new ModelRendererTurbo(this, 729, 145, textureX, textureY); // Box 391
		bodyModel[317] = new ModelRendererTurbo(this, 737, 145, textureX, textureY); // Box 392
		bodyModel[318] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Box 393
		bodyModel[319] = new ModelRendererTurbo(this, 761, 145, textureX, textureY); // Box 394
		bodyModel[320] = new ModelRendererTurbo(this, 769, 145, textureX, textureY); // Box 395
		bodyModel[321] = new ModelRendererTurbo(this, 777, 145, textureX, textureY); // Box 396
		bodyModel[322] = new ModelRendererTurbo(this, 881, 145, textureX, textureY); // Box 397
		bodyModel[323] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 398
		bodyModel[324] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 399
		bodyModel[325] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 400
		bodyModel[326] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 401
		bodyModel[327] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 402
		bodyModel[328] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 403
		bodyModel[329] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 404
		bodyModel[330] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 405
		bodyModel[331] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 406
		bodyModel[332] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 407
		bodyModel[333] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 408
		bodyModel[334] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 409
		bodyModel[335] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 410
		bodyModel[336] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 411
		bodyModel[337] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 412
		bodyModel[338] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 413
		bodyModel[339] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 414
		bodyModel[340] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 415
		bodyModel[341] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 416
		bodyModel[342] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 417
		bodyModel[343] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 418
		bodyModel[344] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 419
		bodyModel[345] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 420
		bodyModel[346] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 421
		bodyModel[347] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 422
		bodyModel[348] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 423
		bodyModel[349] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 424
		bodyModel[350] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 425
		bodyModel[351] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 426
		bodyModel[352] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 427
		bodyModel[353] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 428
		bodyModel[354] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 429
		bodyModel[355] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 430
		bodyModel[356] = new ModelRendererTurbo(this, 769, 185, textureX, textureY); // Box 431
		bodyModel[357] = new ModelRendererTurbo(this, 833, 185, textureX, textureY); // Box 432
		bodyModel[358] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Box 433
		bodyModel[359] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 486
		bodyModel[360] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 487
		bodyModel[361] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 488
		bodyModel[362] = new ModelRendererTurbo(this, 769, 185, textureX, textureY); // Box 489
		bodyModel[363] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 774
		bodyModel[364] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Box 775
		bodyModel[365] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 1239
		bodyModel[366] = new ModelRendererTurbo(this, 832, 229, textureX, textureY); // Box 1240
		bodyModel[367] = new ModelRendererTurbo(this, 309, 25, textureX, textureY); // Box 1241
		bodyModel[368] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 1242
		bodyModel[369] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 1243
		bodyModel[370] = new ModelRendererTurbo(this, 447, 212, textureX, textureY); // Box 1253

		bodyModel[0].addBox(0F, 0F, 0F, 112, 12, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(-111F, -13F, -45F);

		bodyModel[1].addBox(0F, 0F, 0F, 110, 2, 2, 0F); // Box 1
		bodyModel[1].setRotationPoint(-109F, -1F, -45F);

		bodyModel[2].addBox(0F, 0F, 0F, 23, 14, 1, 0F); // Box 2
		bodyModel[2].setRotationPoint(2F, -13F, -44F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(25F, -13F, -44F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(1F, -13F, -45F);

		bodyModel[5].addBox(0F, 0F, 0F, 18, 1, 23, 0F); // Box 6
		bodyModel[5].setRotationPoint(7F, -13F, -43F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(25F, -13F, -43F);

		bodyModel[7].addBox(0F, 0F, 0F, 118, 1, 24, 0F); // Box 8
		bodyModel[7].setRotationPoint(-111F, -13F, -43F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 23, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 5.75F, 0F, -1F, 5.75F, 0F, 1F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(34F, -13F, -43F);

		bodyModel[9].addBox(0F, 0F, 0F, 18, 14, 1, 0F); // Box 10
		bodyModel[9].setRotationPoint(7F, -13F, -20F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(25F, -13F, -20F);

		bodyModel[11].addBox(0F, 0F, 0F, 118, 1, 24, 0F); // Box 11
		bodyModel[11].setRotationPoint(-111F, -13F, 19F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 118, 11, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-111F, -13F, -19F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 113, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-107F, -2F, -19F);

		bodyModel[14].addBox(0F, 0F, 0F, 112, 12, 2, 0F); // Box 14
		bodyModel[14].setRotationPoint(-111F, -13F, 43F);

		bodyModel[15].addBox(0F, 0F, 0F, 110, 2, 2, 0F); // Box 15
		bodyModel[15].setRotationPoint(-109F, -1F, 43F);

		bodyModel[16].addBox(0F, 0F, 0F, 23, 14, 1, 0F); // Box 16
		bodyModel[16].setRotationPoint(2F, -13F, 43F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(25F, -13F, 43F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(1F, -13F, 43F);

		bodyModel[19].addBox(0F, 0F, 0F, 18, 1, 23, 0F); // Box 19
		bodyModel[19].setRotationPoint(7F, -13F, 20F);

		bodyModel[20].addBox(0F, 0F, 0F, 18, 14, 1, 0F); // Box 20
		bodyModel[20].setRotationPoint(7F, -13F, 19F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(25F, -13F, 19F);

		bodyModel[22].addBox(0F, 0F, 0F, 56, 17, 36, 0F); // Box 22
		bodyModel[22].setRotationPoint(-59F, -30F, -18F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 17, 36, 0F,0F, 0F, 0F, 0F, -2F, -10F, 0F, -2F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-3F, -30F, -18F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(-20F, -23F, 31F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 91, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(-111F, -23F, 31F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 52, 10, 62, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(-111F, -23F, -31F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 52, 7, 13, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Box 32
		bodyModel[27].setRotationPoint(-111F, -30F, -31F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 56, 17, 13, 0F,0F, -7F, 0F, -10F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(-59F, -30F, -31F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 52, 7, 1, 0F,0F, -7F, 13F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 34
		bodyModel[29].setRotationPoint(-111F, -30F, -18F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 10, 17, 12, 0F,10F, -7F, 11F, 0F, -17F, 0F, 0F, -2F, 0F, 0F, 0F, -10F, 10F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 35
		bodyModel[30].setRotationPoint(-3F, -30F, -20F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 10, 14, 0F,0F, 0F, 0F, 13F, -10F, 11F, -14F, -10F, 0F, 7F, -10F, 0F, 0F, 0F, 0F, 13F, 0F, 11F, -14F, 0F, 0F, 7F, 0F, 0F); // Box 37
		bodyModel[31].setRotationPoint(-13F, -23F, 31F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[32].setRotationPoint(-1F, -14F, 31F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[33].setRotationPoint(-1F, -17F, 31F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[34].setRotationPoint(-1F, -14F, 29F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[35].setRotationPoint(-1F, -17F, 29F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[36].setRotationPoint(-20F, -27F, 29F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[37].setRotationPoint(-20F, -27F, 31F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[38].setRotationPoint(-40F, -27F, 29F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[39].setRotationPoint(-40F, -27F, 31F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[40].setRotationPoint(-61F, -27F, 29F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[41].setRotationPoint(-61F, -27F, 31F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[42].setRotationPoint(-109F, -27F, 29F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[43].setRotationPoint(-109F, -27F, 31F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[44].setRotationPoint(-1F, -17F, -32F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[45].setRotationPoint(-1F, -17F, -31F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[46].setRotationPoint(-20F, -27F, -31F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[47].setRotationPoint(-20F, -27F, -32F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[48].setRotationPoint(-40F, -27F, -31F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[49].setRotationPoint(-40F, -27F, -32F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 73
		bodyModel[50].setRotationPoint(-61F, -24F, -32F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[51].setRotationPoint(-61F, -27F, -31F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[52].setRotationPoint(-61F, -27F, -32F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[53].setRotationPoint(-109F, -27F, -31F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[54].setRotationPoint(-109F, -27F, -32F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 9, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[55].setRotationPoint(25F, -13F, 20F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 23, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 5.75F, 0F, -1F, 5.75F, 0F, 1F, 0F, 0F); // Box 81
		bodyModel[56].setRotationPoint(34F, -13F, 20F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 82
		bodyModel[57].setRotationPoint(-61F, -24F, -31F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 83
		bodyModel[58].setRotationPoint(-61F, -24F, 31F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 84
		bodyModel[59].setRotationPoint(-61F, -24F, 29F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 85
		bodyModel[60].setRotationPoint(-40F, -24F, 31F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 86
		bodyModel[61].setRotationPoint(-40F, -24F, 29F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 87
		bodyModel[62].setRotationPoint(-40F, -24F, -32F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 88
		bodyModel[63].setRotationPoint(-40F, -24F, -31F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 89
		bodyModel[64].setRotationPoint(-20F, -24F, -32F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 90
		bodyModel[65].setRotationPoint(-20F, -24F, -31F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 91
		bodyModel[66].setRotationPoint(-20F, -24F, 31F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 92
		bodyModel[67].setRotationPoint(-20F, -24F, 29F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 93
		bodyModel[68].setRotationPoint(-109F, -24F, 31F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 94
		bodyModel[69].setRotationPoint(-109F, -24F, 29F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 95
		bodyModel[70].setRotationPoint(-109F, -24F, -31F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 96
		bodyModel[71].setRotationPoint(-109F, -24F, -32F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 49, 2, 36, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 133
		bodyModel[72].setRotationPoint(-108F, -28F, -18F);

		bodyModel[73].addShapeBox(2F, 0F, 0F, 17, 2, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[73].setRotationPoint(-107F, -24F, -17F);
		bodyModel[73].rotateAngleZ = 0.13962634F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 34, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 135
		bodyModel[74].setRotationPoint(-107F, -24F, -17F);
		bodyModel[74].rotateAngleZ = 0.13962634F;

		bodyModel[75].addShapeBox(19F, 0F, 0F, 2, 2, 34, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 136
		bodyModel[75].setRotationPoint(-107F, -24F, -17F);
		bodyModel[75].rotateAngleZ = 0.13962634F;

		bodyModel[76].addShapeBox(-0.5F, -0.5F, 4F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[76].setRotationPoint(-107F, -24F, -17F);
		bodyModel[76].rotateAngleZ = 0.13962634F;

		bodyModel[77].addShapeBox(-0.5F, -0.5F, 10F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[77].setRotationPoint(-107F, -24F, -17F);
		bodyModel[77].rotateAngleZ = 0.13962634F;

		bodyModel[78].addShapeBox(-0.5F, -0.5F, -10F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[78].setRotationPoint(-107F, -24F, 16F);
		bodyModel[78].rotateAngleZ = 0.13962634F;

		bodyModel[79].addShapeBox(-0.5F, -0.5F, -4F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[79].setRotationPoint(-107F, -24F, 16F);
		bodyModel[79].rotateAngleZ = 0.13962634F;

		bodyModel[80].addShapeBox(-0.5F, -0.5F, -16.5F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[80].setRotationPoint(-107F, -24F, 16F);
		bodyModel[80].rotateAngleZ = 0.13962634F;

		bodyModel[81].addShapeBox(24.5F, -0.5F, -16.5F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[81].setRotationPoint(-107F, -24F, 16F);
		bodyModel[81].rotateAngleZ = 0.13962634F;

		bodyModel[82].addShapeBox(24.5F, -0.5F, 4F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[82].setRotationPoint(-107F, -24F, -17F);
		bodyModel[82].rotateAngleZ = 0.13962634F;

		bodyModel[83].addShapeBox(24.5F, -0.5F, 10F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[83].setRotationPoint(-107F, -24F, -17F);
		bodyModel[83].rotateAngleZ = 0.13962634F;

		bodyModel[84].addShapeBox(24.5F, -0.5F, -10F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[84].setRotationPoint(-107F, -24F, 16F);
		bodyModel[84].rotateAngleZ = 0.13962634F;

		bodyModel[85].addShapeBox(24.5F, -0.5F, -4F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[85].setRotationPoint(-107F, -24F, 16F);
		bodyModel[85].rotateAngleZ = 0.13962634F;

		bodyModel[86].addShapeBox(25F, 0F, 0F, 2, 2, 34, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 147
		bodyModel[86].setRotationPoint(-107F, -24F, -17F);
		bodyModel[86].rotateAngleZ = 0.13962634F;

		bodyModel[87].addShapeBox(27F, 0F, 0F, 17, 2, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[87].setRotationPoint(-107F, -24F, -17F);
		bodyModel[87].rotateAngleZ = 0.13962634F;

		bodyModel[88].addShapeBox(44F, 0F, 0F, 2, 2, 34, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 149
		bodyModel[88].setRotationPoint(-107F, -24F, -17F);
		bodyModel[88].rotateAngleZ = 0.13962634F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 150
		bodyModel[89].setRotationPoint(-111F, -31F, -19F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 151
		bodyModel[90].setRotationPoint(-111F, -31F, 18F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[91].setRotationPoint(-59F, -31F, 4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[92].setRotationPoint(-59F, -31F, -18F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[93].setRotationPoint(-58F, -31F, 4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[94].setRotationPoint(-58F, -31F, -5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[95].setRotationPoint(-55F, -31F, -4F);

		bodyModel[96].addShapeBox(0F, -0.5F, 0F, 1, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[96].setRotationPoint(-111.5F, -23F, -18F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[97].setRotationPoint(-112F, -24F, -19F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[98].setRotationPoint(-112F, -24F, 18F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[99].setRotationPoint(-112F, -18F, -18F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 7, 10, 14, 0F,0F, -10F, 0F, -7F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[100].setRotationPoint(-20F, -23F, -45F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 10, 14, 0F,7F, -10F, 0F, -14F, -10F, 0F, 13F, -10F, 11F, 0F, 0F, 0F, 7F, 0F, 0F, -14F, 0F, 0F, 13F, 0F, 11F, 0F, 0F, 0F); // Box 163
		bodyModel[101].setRotationPoint(-13F, -23F, -45F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[102].setRotationPoint(-36F, -39F, -17F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[103].setRotationPoint(-49F, -39F, -23F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0.5F, 0F, -5F, 0F, 0F, 0.5F, 1F, 0F, -6F, 0F, 0F, 0F, 0.5F, 0F, -5F, 0F, 0F, 0.5F, 1F, 0F, -6F, 0F, 0F, 0F); // Box 146
		bodyModel[104].setRotationPoint(-41F, -39F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[105].setRotationPoint(-49F, -39F, -4F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 1F, 0F, -6F, 0F, 0F, 0.5F, 0.5F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, -6F, 0F, 0F, 0.5F, 0.5F, 0F, -5F); // Box 148
		bodyModel[106].setRotationPoint(-41F, -39F, -23F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,1F, 0F, -6F, 0F, 0F, 0F, 0.5F, 0F, -5F, 0F, 0F, 0.5F, 1F, 0F, -6F, 0F, 0F, 0F, 0.5F, 0F, -5F, 0F, 0F, 0.5F); // Box 149
		bodyModel[107].setRotationPoint(-54F, -39F, -23F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0.5F, 0.5F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, -6F, 0F, 0F, 0.5F, 0.5F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, -6F); // Box 150
		bodyModel[108].setRotationPoint(-54F, -39F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[109].setRotationPoint(-48.5F, -33F, -23.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 7, 2, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 152
		bodyModel[110].setRotationPoint(-55.5F, -33F, -23.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 153
		bodyModel[111].setRotationPoint(-41.5F, -33F, -23.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 7, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 154
		bodyModel[112].setRotationPoint(-40.5F, -31F, -24.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 7, 1, 23, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 155
		bodyModel[113].setRotationPoint(-56.5F, -31F, -24.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[114].setRotationPoint(-49.5F, -31F, -24.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 2, 19, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 157
		bodyModel[115].setRotationPoint(-25.5F, -31F, 5.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 9, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[116].setRotationPoint(-20.5F, -31F, 5.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 26, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -7F, 0F, 2F, -7F, 0F, 2F); // Box 163
		bodyModel[117].setRotationPoint(-28.5F, -30F, 18F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 26, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[118].setRotationPoint(-28.5F, -30F, 9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 5, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 165
		bodyModel[119].setRotationPoint(-11.5F, -31F, 5.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 7, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[120].setRotationPoint(-19.5F, -33F, 6.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 5, 2, 17, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 167
		bodyModel[121].setRotationPoint(-24.5F, -33F, 6.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 168
		bodyModel[122].setRotationPoint(-12.5F, -33F, 6.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 16, 9, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, 2F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 169
		bodyModel[123].setRotationPoint(-18.5F, -30F, -23F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 16, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[124].setRotationPoint(-18.5F, -30F, -18F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[125].setRotationPoint(-53F, -38F, -19F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[126].setRotationPoint(-53F, -38F, -8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[127].setRotationPoint(-39F, -38F, -7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[128].setRotationPoint(-39F, -38F, -20F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[129].setRotationPoint(-46F, -38F, -23F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[130].setRotationPoint(-46F, -38F, -4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 178
		bodyModel[131].setRotationPoint(-116F, -21F, -4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 13, 4, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 179
		bodyModel[132].setRotationPoint(-113F, -7F, -19F);
		bodyModel[132].rotateAngleZ = 0.34906585F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 13, 4, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 180
		bodyModel[133].setRotationPoint(-113F, -7F, 15F);
		bodyModel[133].rotateAngleZ = 0.34906585F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[134].setRotationPoint(-50F, -31F, 1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 182
		bodyModel[135].setRotationPoint(-48F, -31F, 1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 183
		bodyModel[136].setRotationPoint(-51F, -31F, 1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[137].setRotationPoint(-50F, -35F, 2F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,-0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[138].setRotationPoint(-49.5F, -62F, 2.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[139].setRotationPoint(-45F, -31F, 15F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 190
		bodyModel[140].setRotationPoint(-46F, -31F, 15F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 191
		bodyModel[141].setRotationPoint(-43F, -31F, 15F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[142].setRotationPoint(-45F, -35F, 16F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,-0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 193
		bodyModel[143].setRotationPoint(-44.5F, -62F, 16.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[144].setRotationPoint(-27F, -31F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 195
		bodyModel[145].setRotationPoint(-28F, -31F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 196
		bodyModel[146].setRotationPoint(-25F, -31F, -1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[147].setRotationPoint(-27F, -35F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,-0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 198
		bodyModel[148].setRotationPoint(-26.5F, -62F, 0.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 199
		bodyModel[149].setRotationPoint(-56F, -31F, 9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[150].setRotationPoint(-54F, -31F, 9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 201
		bodyModel[151].setRotationPoint(-49F, -31F, 9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 202
		bodyModel[152].setRotationPoint(-15F, -31F, -18F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[153].setRotationPoint(-13F, -31F, -18F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 204
		bodyModel[154].setRotationPoint(-8F, -31F, -18F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[155].setRotationPoint(-1F, -14F, -32F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[156].setRotationPoint(-1F, -14F, -31F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[157].setRotationPoint(-89F, -25F, 28F);

		bodyModel[158].addShapeBox(0F, 0F, -1F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[158].setRotationPoint(-11F, -25F, 29F);
		bodyModel[158].rotateAngleY = -0.76794487F;
		bodyModel[158].rotateAngleZ = 0.10471976F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[159].setRotationPoint(7F, -28F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[160].setRotationPoint(-89F, -25F, -29F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[161].setRotationPoint(-11F, -25F, -29F);
		bodyModel[161].rotateAngleY = 0.76794487F;
		bodyModel[161].rotateAngleZ = 0.10471976F;

		bodyModel[162].addShapeBox(0F, -0.5F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[162].setRotationPoint(-95F, -25F, 28F);
		bodyModel[162].rotateAngleX = -0.50614548F;

		bodyModel[163].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 213
		bodyModel[163].setRotationPoint(-96F, -25F, 28F);
		bodyModel[163].rotateAngleX = -0.50614548F;

		bodyModel[164].addShapeBox(0F, -0.5F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[164].setRotationPoint(-95F, -24F, -29F);
		bodyModel[164].rotateAngleX = 0.50614548F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[165].setRotationPoint(-103F, -27F, 18F);

		bodyModel[166].addShapeBox(0F, -4F, 9F, 1, 7, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[166].setRotationPoint(-103F, -27F, 18F);

		bodyModel[167].addShapeBox(0F, -5F, 11F, 1, 4, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 220
		bodyModel[167].setRotationPoint(-103F, -27F, 18F);

		bodyModel[168].addShapeBox(0F, -2F, 6F, 1, 4, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[168].setRotationPoint(-103F, -27F, 18F);

		bodyModel[169].addShapeBox(0F, -2F, 3F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 223
		bodyModel[169].setRotationPoint(-103F, -27F, 18F);

		bodyModel[170].addShapeBox(0F, 1F, 3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[170].setRotationPoint(-103F, -27F, 18F);

		bodyModel[171].addShapeBox(0F, 1F, 7F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[171].setRotationPoint(-103F, -27F, 18F);

		bodyModel[172].addShapeBox(0F, -4F, 7F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[172].setRotationPoint(-103F, -27F, 18F);

		bodyModel[173].addShapeBox(5F, -5F, 11F, 1, 4, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 227
		bodyModel[173].setRotationPoint(-103F, -27F, 18F);

		bodyModel[174].addShapeBox(5F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[174].setRotationPoint(-103F, -27F, 18F);

		bodyModel[175].addShapeBox(5F, -2F, 3F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 229
		bodyModel[175].setRotationPoint(-103F, -27F, 18F);

		bodyModel[176].addShapeBox(5F, -4F, 7F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[176].setRotationPoint(-103F, -27F, 18F);

		bodyModel[177].addShapeBox(5F, -4F, 9F, 1, 7, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[177].setRotationPoint(-103F, -27F, 18F);

		bodyModel[178].addShapeBox(5F, 1F, 7F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[178].setRotationPoint(-103F, -27F, 18F);

		bodyModel[179].addShapeBox(5F, 1F, 3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[179].setRotationPoint(-103F, -27F, 18F);

		bodyModel[180].addShapeBox(5F, -2F, 6F, 1, 4, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[180].setRotationPoint(-103F, -27F, 18F);

		bodyModel[181].addFlexTrapezoid(0F, -8F, 16F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 235
		bodyModel[181].setRotationPoint(-103F, -27F, 18F);

		bodyModel[182].addShapeBox(1F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[182].setRotationPoint(-103F, -27F, 18F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[183].setRotationPoint(-103F, -27F, -21F);

		bodyModel[184].addShapeBox(0F, -4F, -9F, 1, 7, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[184].setRotationPoint(-103F, -27F, -20F);

		bodyModel[185].addShapeBox(0F, -5F, -11F, 1, 4, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[185].setRotationPoint(-103F, -27F, -23F);

		bodyModel[186].addShapeBox(0F, -2F, -6F, 1, 4, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[186].setRotationPoint(-103F, -27F, -19F);

		bodyModel[187].addShapeBox(0F, -2F, -4F, 1, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 241
		bodyModel[187].setRotationPoint(-103F, -27F, -18F);

		bodyModel[188].addShapeBox(0F, 1F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[188].setRotationPoint(-103F, -27F, -21F);

		bodyModel[189].addShapeBox(0F, 1F, -7F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[189].setRotationPoint(-103F, -27F, -20F);

		bodyModel[190].addShapeBox(0F, -4F, -7F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[190].setRotationPoint(-103F, -27F, -20F);

		bodyModel[191].addShapeBox(5F, -5F, -11F, 1, 4, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[191].setRotationPoint(-103F, -27F, -23F);

		bodyModel[192].addShapeBox(5F, 0F, 0F, 1, 2, 3, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[192].setRotationPoint(-103F, -27F, -21F);

		bodyModel[193].addShapeBox(5F, -2F, -4F, 1, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 247
		bodyModel[193].setRotationPoint(-103F, -27F, -18F);

		bodyModel[194].addShapeBox(5F, -4F, -7F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[194].setRotationPoint(-103F, -27F, -20F);

		bodyModel[195].addShapeBox(5F, -4F, -9F, 1, 7, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[195].setRotationPoint(-103F, -27F, -20F);

		bodyModel[196].addShapeBox(5F, 1F, -7F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[196].setRotationPoint(-103F, -27F, -20F);

		bodyModel[197].addShapeBox(5F, 1F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[197].setRotationPoint(-103F, -27F, -21F);

		bodyModel[198].addShapeBox(5F, -2F, -6F, 1, 4, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[198].setRotationPoint(-103F, -27F, -19F);

		bodyModel[199].addFlexTrapezoid(0F, -8F, -16F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 253
		bodyModel[199].setRotationPoint(-103F, -27F, -19F);

		bodyModel[200].addShapeBox(1F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[200].setRotationPoint(-103F, -27F, -19F);

		bodyModel[201].addShapeBox(0F, -4F, -11F, 1, 7, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[201].setRotationPoint(23F, -15F, -31F);
		bodyModel[201].rotateAngleY = 2.16420827F;

		bodyModel[202].addFlexTrapezoid(0F, -8F, -17F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 256
		bodyModel[202].setRotationPoint(23F, -15F, -31F);
		bodyModel[202].rotateAngleY = 2.16420827F;

		bodyModel[203].addShapeBox(0F, -5F, -16F, 1, 4, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[203].setRotationPoint(23F, -15F, -31F);
		bodyModel[203].rotateAngleY = 2.16420827F;

		bodyModel[204].addShapeBox(5F, -5F, -16F, 1, 4, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[204].setRotationPoint(23F, -15F, -31F);
		bodyModel[204].rotateAngleY = 2.16420827F;

		bodyModel[205].addShapeBox(5F, -4F, -11F, 1, 7, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[205].setRotationPoint(23F, -15F, -31F);
		bodyModel[205].rotateAngleY = 2.16420827F;

		bodyModel[206].addShapeBox(5F, 1F, -9F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[206].setRotationPoint(23F, -15F, -31F);
		bodyModel[206].rotateAngleY = 2.16420827F;

		bodyModel[207].addShapeBox(0F, 1F, -9F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[207].setRotationPoint(23F, -15F, -31F);
		bodyModel[207].rotateAngleY = 2.16420827F;

		bodyModel[208].addShapeBox(0F, -2F, -7F, 1, 4, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[208].setRotationPoint(23F, -15F, -31F);
		bodyModel[208].rotateAngleY = 2.16420827F;

		bodyModel[209].addShapeBox(5F, 1F, -6F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[209].setRotationPoint(23F, -15F, -31F);
		bodyModel[209].rotateAngleY = 2.16420827F;

		bodyModel[210].addShapeBox(0F, 1F, -6F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[210].setRotationPoint(23F, -15F, -31F);
		bodyModel[210].rotateAngleY = 2.16420827F;

		bodyModel[211].addShapeBox(0F, 0F, -3F, 1, 2, 3, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[211].setRotationPoint(23F, -15F, -31F);
		bodyModel[211].rotateAngleY = 2.16420827F;

		bodyModel[212].addShapeBox(5F, 0F, -3F, 1, 2, 3, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[212].setRotationPoint(23F, -15F, -31F);
		bodyModel[212].rotateAngleY = 2.16420827F;

		bodyModel[213].addShapeBox(0F, -2F, -4F, 1, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 267
		bodyModel[213].setRotationPoint(23F, -15F, -31F);
		bodyModel[213].rotateAngleY = 2.16420827F;

		bodyModel[214].addShapeBox(0F, -4F, -9F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[214].setRotationPoint(23F, -15F, -31F);
		bodyModel[214].rotateAngleY = 2.16420827F;

		bodyModel[215].addShapeBox(5F, -4F, -9F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[215].setRotationPoint(23F, -15F, -31F);
		bodyModel[215].rotateAngleY = 2.16420827F;

		bodyModel[216].addShapeBox(5F, -2F, -7F, 1, 4, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[216].setRotationPoint(23F, -15F, -31F);
		bodyModel[216].rotateAngleY = 2.16420827F;

		bodyModel[217].addShapeBox(5F, -2F, -4F, 1, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 271
		bodyModel[217].setRotationPoint(23F, -15F, -31F);
		bodyModel[217].rotateAngleY = 2.16420827F;

		bodyModel[218].addShapeBox(1F, 0F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[218].setRotationPoint(23F, -15F, -31F);
		bodyModel[218].rotateAngleY = 2.16420827F;

		bodyModel[219].addShapeBox(-5F, 0F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[219].setRotationPoint(24F, -15F, 31F);
		bodyModel[219].rotateAngleY = 0.97738438F;

		bodyModel[220].addShapeBox(-6F, 0F, -3F, 1, 2, 3, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[220].setRotationPoint(24F, -15F, 31F);
		bodyModel[220].rotateAngleY = 0.97738438F;

		bodyModel[221].addShapeBox(-6F, -2F, -4F, 1, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 296
		bodyModel[221].setRotationPoint(24F, -15F, 31F);
		bodyModel[221].rotateAngleY = 0.97738438F;

		bodyModel[222].addShapeBox(-6F, -4F, -9F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[222].setRotationPoint(24F, -15F, 31F);
		bodyModel[222].rotateAngleY = 0.97738438F;

		bodyModel[223].addShapeBox(-6F, -2F, -7F, 1, 4, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[223].setRotationPoint(24F, -15F, 31F);
		bodyModel[223].rotateAngleY = 0.97738438F;

		bodyModel[224].addShapeBox(-6F, -4F, -11F, 1, 7, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[224].setRotationPoint(24F, -15F, 31F);
		bodyModel[224].rotateAngleY = 0.97738438F;

		bodyModel[225].addShapeBox(-6F, -5F, -16F, 1, 4, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[225].setRotationPoint(24F, -15F, 31F);
		bodyModel[225].rotateAngleY = 0.97738438F;

		bodyModel[226].addFlexTrapezoid(-6F, -8F, -17F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 301
		bodyModel[226].setRotationPoint(24F, -15F, 31F);
		bodyModel[226].rotateAngleY = 0.97738438F;

		bodyModel[227].addShapeBox(-1F, -5F, -16F, 1, 4, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[227].setRotationPoint(24F, -15F, 31F);
		bodyModel[227].rotateAngleY = 0.97738438F;

		bodyModel[228].addShapeBox(-1F, -4F, -11F, 1, 7, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[228].setRotationPoint(24F, -15F, 31F);
		bodyModel[228].rotateAngleY = 0.97738438F;

		bodyModel[229].addShapeBox(-1F, -4F, -9F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[229].setRotationPoint(24F, -15F, 31F);
		bodyModel[229].rotateAngleY = 0.97738438F;

		bodyModel[230].addShapeBox(-1F, -2F, -7F, 1, 4, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[230].setRotationPoint(24F, -15F, 31F);
		bodyModel[230].rotateAngleY = 0.97738438F;

		bodyModel[231].addShapeBox(-1F, -2F, -4F, 1, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 306
		bodyModel[231].setRotationPoint(24F, -15F, 31F);
		bodyModel[231].rotateAngleY = 0.97738438F;

		bodyModel[232].addShapeBox(-1F, 0F, -3F, 1, 2, 3, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[232].setRotationPoint(24F, -15F, 31F);
		bodyModel[232].rotateAngleY = 0.97738438F;

		bodyModel[233].addShapeBox(-6F, 1F, -6F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[233].setRotationPoint(24F, -15F, 31F);
		bodyModel[233].rotateAngleY = 0.97738438F;

		bodyModel[234].addShapeBox(-6F, 1F, -9F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[234].setRotationPoint(24F, -15F, 31F);
		bodyModel[234].rotateAngleY = 0.97738438F;

		bodyModel[235].addShapeBox(-1F, 1F, -6F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[235].setRotationPoint(24F, -15F, 31F);
		bodyModel[235].rotateAngleY = 0.97738438F;

		bodyModel[236].addShapeBox(-1F, 1F, -9F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[236].setRotationPoint(24F, -15F, 31F);
		bodyModel[236].rotateAngleY = 0.97738438F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[237].setRotationPoint(30F, -14F, 30F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[238].setRotationPoint(30F, -14F, 35F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[239].setRotationPoint(29F, -14F, 35F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[240].setRotationPoint(29F, -14F, 30F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 316
		bodyModel[241].setRotationPoint(30.5F, -17F, 29.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 317
		bodyModel[242].setRotationPoint(30.5F, -17F, 34.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[243].setRotationPoint(33F, -16F, 38F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[244].setRotationPoint(33F, -16F, 33F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[245].setRotationPoint(33F, -16F, 28F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 321
		bodyModel[246].setRotationPoint(32F, -18F, 28F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 322
		bodyModel[247].setRotationPoint(32F, -18F, 33F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 323
		bodyModel[248].setRotationPoint(32F, -18F, 38F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 324
		bodyModel[249].setRotationPoint(30F, -19F, 33F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 325
		bodyModel[250].setRotationPoint(30F, -19F, 28F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[251].setRotationPoint(30F, -15F, 38F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[252].setRotationPoint(30F, -15F, 33F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[253].setRotationPoint(30F, -15F, 28F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[254].setRotationPoint(30F, -14F, -32F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[255].setRotationPoint(30F, -14F, -37F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[256].setRotationPoint(29F, -14F, -37F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[257].setRotationPoint(29F, -14F, -32F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 333
		bodyModel[258].setRotationPoint(30.5F, -17F, -32.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 334
		bodyModel[259].setRotationPoint(30.5F, -17F, -37.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[260].setRotationPoint(33F, -16F, -39F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[261].setRotationPoint(33F, -16F, -34F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[262].setRotationPoint(33F, -16F, -29F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 338
		bodyModel[263].setRotationPoint(32F, -18F, -29F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 339
		bodyModel[264].setRotationPoint(32F, -18F, -34F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 340
		bodyModel[265].setRotationPoint(32F, -18F, -39F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 341
		bodyModel[266].setRotationPoint(30F, -19F, -39F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 342
		bodyModel[267].setRotationPoint(30F, -19F, -34F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[268].setRotationPoint(30F, -15F, -39F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[269].setRotationPoint(30F, -15F, -34F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[270].setRotationPoint(30F, -15F, -29F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 12, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[271].setRotationPoint(-63F, -17F, -43F);
		bodyModel[271].rotateAngleX = 0.62831853F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 12, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[272].setRotationPoint(-45F, -17F, -43F);
		bodyModel[272].rotateAngleX = 0.62831853F;

		bodyModel[273].addShapeBox(0F, -2F, 0F, 12, 2, 11, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[273].setRotationPoint(-63F, -17F, -43F);
		bodyModel[273].rotateAngleX = 0.62831853F;

		bodyModel[274].addShapeBox(0F, -2F, 0F, 12, 2, 11, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[274].setRotationPoint(-45F, -17F, -43F);
		bodyModel[274].rotateAngleX = 0.62831853F;

		bodyModel[275].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[275].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[275].rotateAngleX = 0.99483767F;

		bodyModel[276].addShapeBox(1F, 7F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[276].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[276].rotateAngleX = 0.99483767F;

		bodyModel[277].addShapeBox(12F, -2F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[277].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[277].rotateAngleX = 0.99483767F;

		bodyModel[278].addShapeBox(16F, -2F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[278].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[278].rotateAngleX = 0.99483767F;

		bodyModel[279].addShapeBox(-3F, 5F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[279].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[279].rotateAngleX = 0.99483767F;

		bodyModel[280].addShapeBox(-4F, 5F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 355
		bodyModel[280].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[280].rotateAngleX = 0.99483767F;

		bodyModel[281].addShapeBox(-1F, -1F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[281].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[281].rotateAngleX = 0.99483767F;

		bodyModel[282].addShapeBox(-4F, -1F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[282].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[282].rotateAngleX = 0.99483767F;

		bodyModel[283].addShapeBox(-3F, -1F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[283].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[283].rotateAngleX = 0.99483767F;

		bodyModel[284].addShapeBox(-3F, 1F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[284].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[284].rotateAngleX = 0.99483767F;

		bodyModel[285].addShapeBox(14F, 8F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[285].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[285].rotateAngleX = 0.99483767F;

		bodyModel[286].addShapeBox(13F, 6F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[286].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[286].rotateAngleX = 0.99483767F;

		bodyModel[287].addShapeBox(14F, 6F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[287].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[287].rotateAngleX = 0.99483767F;

		bodyModel[288].addShapeBox(16F, 6F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[288].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[288].rotateAngleX = 0.99483767F;

		bodyModel[289].addShapeBox(-6F, 7F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[289].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[289].rotateAngleX = 0.99483767F;
		bodyModel[289].rotateAngleY = -0.06981317F;
		bodyModel[289].rotateAngleZ = 0.05235988F;

		bodyModel[290].addShapeBox(-6F, 8F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 365
		bodyModel[290].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[290].rotateAngleX = 0.99483767F;
		bodyModel[290].rotateAngleY = -0.06981317F;
		bodyModel[290].rotateAngleZ = 0.05235988F;

		bodyModel[291].addShapeBox(-6F, 2F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[291].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[291].rotateAngleX = 0.99483767F;

		bodyModel[292].addShapeBox(-11F, -2F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[292].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[292].rotateAngleX = 0.99483767F;

		bodyModel[293].addShapeBox(-15F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[293].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[293].rotateAngleX = 0.99483767F;

		bodyModel[294].addShapeBox(-19F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[294].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[294].rotateAngleX = 0.99483767F;

		bodyModel[295].addShapeBox(-23F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[295].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[295].rotateAngleX = 0.99483767F;

		bodyModel[296].addShapeBox(-27F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[296].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[296].rotateAngleX = 0.99483767F;

		bodyModel[297].addShapeBox(-31F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[297].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[297].rotateAngleX = 0.99483767F;

		bodyModel[298].addShapeBox(-31F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[298].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[298].rotateAngleX = 0.99483767F;

		bodyModel[299].addShapeBox(-27F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[299].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[299].rotateAngleX = 0.99483767F;

		bodyModel[300].addShapeBox(-23F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[300].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[300].rotateAngleX = 0.99483767F;

		bodyModel[301].addShapeBox(-19F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[301].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[301].rotateAngleX = 0.99483767F;

		bodyModel[302].addShapeBox(-15F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[302].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[302].rotateAngleX = 0.99483767F;

		bodyModel[303].addShapeBox(-29F, -5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[303].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[303].rotateAngleX = 0.99483767F;

		bodyModel[304].addShapeBox(-29F, 5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[304].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[304].rotateAngleX = 0.99483767F;

		bodyModel[305].addShapeBox(-25F, 5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[305].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[305].rotateAngleX = 0.99483767F;

		bodyModel[306].addShapeBox(-25F, -5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[306].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[306].rotateAngleX = 0.99483767F;

		bodyModel[307].addShapeBox(-21F, 5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[307].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[307].rotateAngleX = 0.99483767F;

		bodyModel[308].addShapeBox(-21F, -5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[308].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[308].rotateAngleX = 0.99483767F;

		bodyModel[309].addShapeBox(-17F, 5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[309].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[309].rotateAngleX = 0.99483767F;

		bodyModel[310].addShapeBox(-17F, -5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[310].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[310].rotateAngleX = 0.99483767F;

		bodyModel[311].addShapeBox(-13F, 5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[311].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[311].rotateAngleX = 0.99483767F;

		bodyModel[312].addShapeBox(-13F, -5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[312].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[312].rotateAngleX = 0.99483767F;

		bodyModel[313].addShapeBox(-29F, 1F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[313].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[313].rotateAngleX = 0.99483767F;

		bodyModel[314].addShapeBox(-29F, 11F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[314].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[314].rotateAngleX = 0.99483767F;

		bodyModel[315].addShapeBox(-25F, 11F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[315].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[315].rotateAngleX = 0.99483767F;

		bodyModel[316].addShapeBox(-25F, 1F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[316].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[316].rotateAngleX = 0.99483767F;

		bodyModel[317].addShapeBox(-21F, 11F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[317].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[317].rotateAngleX = 0.99483767F;

		bodyModel[318].addShapeBox(-21F, 1F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[318].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[318].rotateAngleX = 0.99483767F;

		bodyModel[319].addShapeBox(-17F, 11F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[319].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[319].rotateAngleX = 0.99483767F;

		bodyModel[320].addShapeBox(-17F, 1F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[320].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[320].rotateAngleX = 0.99483767F;

		bodyModel[321].addShapeBox(-13F, 11F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[321].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[321].rotateAngleX = 0.99483767F;

		bodyModel[322].addShapeBox(-13F, 1F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[322].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[322].rotateAngleX = 0.99483767F;

		bodyModel[323].addShapeBox(-15F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[323].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[323].rotateAngleX = -0.99483767F;

		bodyModel[324].addShapeBox(-19F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[324].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[324].rotateAngleX = -0.99483767F;

		bodyModel[325].addShapeBox(-23F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[325].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[325].rotateAngleX = -0.99483767F;

		bodyModel[326].addShapeBox(-27F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[326].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[326].rotateAngleX = -0.99483767F;

		bodyModel[327].addShapeBox(-31F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[327].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[327].rotateAngleX = -0.99483767F;

		bodyModel[328].addShapeBox(-31F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[328].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[328].rotateAngleX = -0.99483767F;

		bodyModel[329].addShapeBox(-27F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[329].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[329].rotateAngleX = -0.99483767F;

		bodyModel[330].addShapeBox(-23F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[330].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[330].rotateAngleX = -0.99483767F;

		bodyModel[331].addShapeBox(-19F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[331].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[331].rotateAngleX = -0.99483767F;

		bodyModel[332].addShapeBox(-15F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[332].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[332].rotateAngleX = -0.99483767F;

		bodyModel[333].addShapeBox(-29F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[333].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[333].rotateAngleX = -0.99483767F;

		bodyModel[334].addShapeBox(-29F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[334].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[334].rotateAngleX = -0.99483767F;

		bodyModel[335].addShapeBox(-25F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[335].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[335].rotateAngleX = -0.99483767F;

		bodyModel[336].addShapeBox(-25F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[336].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[336].rotateAngleX = -0.99483767F;

		bodyModel[337].addShapeBox(-21F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[337].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[337].rotateAngleX = -0.99483767F;

		bodyModel[338].addShapeBox(-21F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[338].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[338].rotateAngleX = -0.99483767F;

		bodyModel[339].addShapeBox(-17F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[339].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[339].rotateAngleX = -0.99483767F;

		bodyModel[340].addShapeBox(-17F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[340].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[340].rotateAngleX = -0.99483767F;

		bodyModel[341].addShapeBox(-13F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[341].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[341].rotateAngleX = -0.99483767F;

		bodyModel[342].addShapeBox(-13F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[342].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[342].rotateAngleX = -0.99483767F;

		bodyModel[343].addShapeBox(-29F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[343].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[343].rotateAngleX = -0.99483767F;

		bodyModel[344].addShapeBox(-29F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[344].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[344].rotateAngleX = -0.99483767F;

		bodyModel[345].addShapeBox(-25F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[345].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[345].rotateAngleX = -0.99483767F;

		bodyModel[346].addShapeBox(-25F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[346].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[346].rotateAngleX = -0.99483767F;

		bodyModel[347].addShapeBox(-21F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[347].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[347].rotateAngleX = -0.99483767F;

		bodyModel[348].addShapeBox(-21F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[348].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[348].rotateAngleX = -0.99483767F;

		bodyModel[349].addShapeBox(-17F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[349].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[349].rotateAngleX = -0.99483767F;

		bodyModel[350].addShapeBox(-17F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[350].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[350].rotateAngleX = -0.99483767F;

		bodyModel[351].addShapeBox(-13F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[351].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[351].rotateAngleX = -0.99483767F;

		bodyModel[352].addShapeBox(-13F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[352].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[352].rotateAngleX = -0.99483767F;

		bodyModel[353].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 428
		bodyModel[353].setRotationPoint(21F, -7F, -45F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[354].setRotationPoint(25F, -7F, -45F);

		bodyModel[355].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 430
		bodyModel[355].setRotationPoint(21F, -7F, 44F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[356].setRotationPoint(25F, -7F, 44F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 3, 25, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 432
		bodyModel[357].setRotationPoint(7F, -27F, -5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 10, 25, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[358].setRotationPoint(7F, -19.5F, -12.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[359].setRotationPoint(25F, -7F, 18F);

		bodyModel[360].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 487
		bodyModel[360].setRotationPoint(21F, -7F, 18F);

		bodyModel[361].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 488
		bodyModel[361].setRotationPoint(21F, -7F, -19F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[362].setRotationPoint(25F, -7F, -19F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 9, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 774
		bodyModel[363].setRotationPoint(-109F, -8F, 15F);
		bodyModel[363].rotateAngleZ = 0.34906585F;

		bodyModel[364].addFlexTrapezoid(0F, 0F, 0F, 9, 13, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 775
		bodyModel[364].setRotationPoint(-109F, -8F, -19F);
		bodyModel[364].rotateAngleZ = 0.34906585F;

		bodyModel[365].addShapeBox(0F, 0F, 0F, 52, 7, 13, 0F,0F, -7F, -13F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1239
		bodyModel[365].setRotationPoint(-111F, -30F, 18F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 56, 17, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 1240
		bodyModel[366].setRotationPoint(-59F, -30F, 18F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 52, 7, 1, 0F,0F, -7F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -7F, 13F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 13F); // Box 1241
		bodyModel[367].setRotationPoint(-111F, -30F, 17F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 10, 17, 12, 0F,0F, 0F, -10F, 0F, -2F, 0F, 0F, -17F, 0F, 10F, -7F, 11F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 11F); // Box 1242
		bodyModel[368].setRotationPoint(-3F, -30F, 8F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 91, 10, 14, 0F,0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1243
		bodyModel[369].setRotationPoint(-111F, -23F, -45F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 23, 4, 7, 0F,-7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1253
		bodyModel[370].setRotationPoint(-56.5F, -30F, -24.5F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 434
		barrelModel[1] = new ModelRendererTurbo(this, 865, 185, textureX, textureY); // Box 435
		barrelModel[2] = new ModelRendererTurbo(this, 929, 185, textureX, textureY); // Box 436
		barrelModel[3] = new ModelRendererTurbo(this, 761, 185, textureX, textureY); // Box 404
		barrelModel[4] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 405
		barrelModel[5] = new ModelRendererTurbo(this, 905, 185, textureX, textureY); // Box 406
		barrelModel[6] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 407
		barrelModel[7] = new ModelRendererTurbo(this, 585, 193, textureX, textureY); // Box 408
		barrelModel[8] = new ModelRendererTurbo(this, 577, 201, textureX, textureY); // Box 409
		barrelModel[9] = new ModelRendererTurbo(this, 697, 129, textureX, textureY); // Box 410
		barrelModel[10] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 411
		barrelModel[11] = new ModelRendererTurbo(this, 857, 161, textureX, textureY); // Box 412
		barrelModel[12] = new ModelRendererTurbo(this, 825, 169, textureX, textureY); // Box 413
		barrelModel[13] = new ModelRendererTurbo(this, 857, 185, textureX, textureY); // Box 415
		barrelModel[14] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 416
		barrelModel[15] = new ModelRendererTurbo(this, 849, 169, textureX, textureY); // Box 421
		barrelModel[16] = new ModelRendererTurbo(this, 905, 185, textureX, textureY); // Box 422
		barrelModel[17] = new ModelRendererTurbo(this, 937, 185, textureX, textureY); // Box 423
		barrelModel[18] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Box 424
		barrelModel[19] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 425
		barrelModel[20] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 426
		barrelModel[21] = new ModelRendererTurbo(this, 793, 193, textureX, textureY); // Box 427
		barrelModel[22] = new ModelRendererTurbo(this, 865, 193, textureX, textureY); // Box 428
		barrelModel[23] = new ModelRendererTurbo(this, 969, 193, textureX, textureY); // Box 429
		barrelModel[24] = new ModelRendererTurbo(this, 993, 193, textureX, textureY); // Box 430
		barrelModel[25] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 431
		barrelModel[26] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 432
		barrelModel[27] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 433
		barrelModel[28] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 434
		barrelModel[29] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 435
		barrelModel[30] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 436
		barrelModel[31] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Box 437
		barrelModel[32] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 438
		barrelModel[33] = new ModelRendererTurbo(this, 817, 193, textureX, textureY); // Box 439
		barrelModel[34] = new ModelRendererTurbo(this, 937, 193, textureX, textureY); // Box 440
		barrelModel[35] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 441

		barrelModel[0].addShapeBox(3F, -8.5F, -13F, 5, 18, 26, 0F,0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F); // Box 434
		barrelModel[0].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[1].addShapeBox(3F, -12.5F, -13F, 5, 4, 26, 0F,0F, 0F, -4F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F); // Box 435
		barrelModel[1].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[2].addShapeBox(3F, 9.5F, -13F, 5, 4, 26, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -4F); // Box 436
		barrelModel[2].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[3].addShapeBox(8F, 6.5F, -10F, 3, 4, 20, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 2F, -4F); // Box 404
		barrelModel[3].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[4].addShapeBox(8F, -5.5F, -10F, 3, 12, 20, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 405
		barrelModel[4].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[5].addShapeBox(8F, -9.5F, -10F, 3, 4, 20, 0F,0F, 2F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 406
		barrelModel[5].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[6].addShapeBox(11F, -1F, -2F, 79, 3, 5, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 407
		barrelModel[6].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[7].addShapeBox(11F, -2F, -2F, 79, 1, 5, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 408
		barrelModel[7].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[8].addShapeBox(11F, 2F, -2F, 79, 1, 5, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F); // Box 409
		barrelModel[8].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[9].addShapeBox(90F, 0F, -1.5F, 1, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F); // Box 410
		barrelModel[9].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[10].addShapeBox(90F, -1F, -1.5F, 1, 1, 4, 0F,0F, 0F, -1.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F); // Box 411
		barrelModel[10].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[11].addShapeBox(90F, 1F, -1.5F, 1, 1, 4, 0F,0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -1.5F); // Box 412
		barrelModel[11].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[12].addShapeBox(91F, -0.5F, -1.5F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		barrelModel[12].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[13].addShapeBox(91F, -1.5F, -1.5F, 9, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		barrelModel[13].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[14].addShapeBox(91F, 1.5F, -1.5F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 416
		barrelModel[14].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[15].addShapeBox(100F, 2F, -2.5F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1F); // Box 421
		barrelModel[15].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[16].addShapeBox(100F, -1F, -2.5F, 1, 3, 6, 0F,0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F); // Box 422
		barrelModel[16].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[17].addShapeBox(100F, -2F, -2.5F, 1, 1, 6, 0F,0F, 0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F); // Box 423
		barrelModel[17].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[18].addShapeBox(-2F, -8.5F, -13F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 424
		barrelModel[18].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[19].addShapeBox(-2F, -12.5F, -9F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 425
		barrelModel[19].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[20].addShapeBox(-2F, -12.5F, -13F, 5, 4, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		barrelModel[20].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[21].addShapeBox(-2F, -12.5F, 9F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		barrelModel[21].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[22].addShapeBox(-2F, -8.5F, 9F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 428
		barrelModel[22].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[23].addShapeBox(-2F, -12.5F, 5F, 5, 4, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		barrelModel[23].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[24].addShapeBox(-2F, 9.5F, -9F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 430
		barrelModel[24].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[25].addShapeBox(-2F, 9.5F, 5F, 5, 4, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		barrelModel[25].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[26].addShapeBox(-2F, 9.5F, 9F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 432
		barrelModel[26].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[27].addShapeBox(-2F, 9.5F, -13F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		barrelModel[27].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[28].addShapeBox(-2F, 5.5F, 9F, 5, 4, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		barrelModel[28].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[29].addShapeBox(-2F, 5.5F, -13F, 5, 4, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		barrelModel[29].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[30].addShapeBox(-3F, -1F, -2F, 8, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		barrelModel[30].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[31].addShapeBox(-3F, -2F, -2F, 8, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		barrelModel[31].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[32].addShapeBox(-3F, 2F, -2F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 438
		barrelModel[32].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[33].addShapeBox(97F, 2F, -2.5F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1F); // Box 439
		barrelModel[33].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[34].addShapeBox(97F, -1F, -2.5F, 1, 3, 6, 0F,0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F); // Box 440
		barrelModel[34].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[35].addShapeBox(97F, -2F, -2.5F, 1, 1, 6, 0F,0F, 0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F); // Box 441
		barrelModel[35].setRotationPoint(10F, -14.5F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 758
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 759
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 760
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 761
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 762
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 763
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 764
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 765
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 800
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 801
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 802
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 803
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 804
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 805
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 806
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 807
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 808
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 809
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 810
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 811
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 812
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 813
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 814
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 815
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 816
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 817
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 818
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 819
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 820
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 821
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 822
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 823
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 824
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 825
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 826
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 827
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 828
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 829
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 830
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 831

		leftTrackWheelModels[0].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 758
		leftTrackWheelModels[0].setRotationPoint(26.5F, -2F, 41F);

		leftTrackWheelModels[1].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 759
		leftTrackWheelModels[1].setRotationPoint(26.5F, -2F, 36F);

		leftTrackWheelModels[2].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 760
		leftTrackWheelModels[2].setRotationPoint(26.5F, -2F, 25F);

		leftTrackWheelModels[3].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 761
		leftTrackWheelModels[3].setRotationPoint(26.5F, -2F, 30F);

		leftTrackWheelModels[4].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 762
		leftTrackWheelModels[4].setRotationPoint(-106.5F, -2F, 41F);

		leftTrackWheelModels[5].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 763
		leftTrackWheelModels[5].setRotationPoint(-106.5F, -2F, 36F);

		leftTrackWheelModels[6].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 764
		leftTrackWheelModels[6].setRotationPoint(-106.5F, -2F, 25F);

		leftTrackWheelModels[7].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 765
		leftTrackWheelModels[7].setRotationPoint(-106.5F, -2F, 30F);

		leftTrackWheelModels[8].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 800
		leftTrackWheelModels[8].setRotationPoint(-45F, 4.5F, 41F);

		leftTrackWheelModels[9].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 801
		leftTrackWheelModels[9].setRotationPoint(-45F, 4.5F, 36F);

		leftTrackWheelModels[10].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 802
		leftTrackWheelModels[10].setRotationPoint(-64F, 4.5F, 41F);

		leftTrackWheelModels[11].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 803
		leftTrackWheelModels[11].setRotationPoint(-64F, 4.5F, 36F);

		leftTrackWheelModels[12].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 804
		leftTrackWheelModels[12].setRotationPoint(-64F, 4.5F, 29F);

		leftTrackWheelModels[13].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 805
		leftTrackWheelModels[13].setRotationPoint(-64F, 4.5F, 24F);

		leftTrackWheelModels[14].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 806
		leftTrackWheelModels[14].setRotationPoint(-45F, 4.5F, 24F);

		leftTrackWheelModels[15].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 807
		leftTrackWheelModels[15].setRotationPoint(-45F, 4.5F, 29F);

		leftTrackWheelModels[16].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 808
		leftTrackWheelModels[16].setRotationPoint(-33F, 4.5F, 41F);

		leftTrackWheelModels[17].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 809
		leftTrackWheelModels[17].setRotationPoint(-33F, 4.5F, 36F);

		leftTrackWheelModels[18].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 810
		leftTrackWheelModels[18].setRotationPoint(-33F, 4.5F, 29F);

		leftTrackWheelModels[19].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 811
		leftTrackWheelModels[19].setRotationPoint(-33F, 4.5F, 24F);

		leftTrackWheelModels[20].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 812
		leftTrackWheelModels[20].setRotationPoint(-14F, 4.5F, 24F);

		leftTrackWheelModels[21].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 813
		leftTrackWheelModels[21].setRotationPoint(-14F, 4.5F, 29F);

		leftTrackWheelModels[22].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 814
		leftTrackWheelModels[22].setRotationPoint(-14F, 4.5F, 36F);

		leftTrackWheelModels[23].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 815
		leftTrackWheelModels[23].setRotationPoint(-14F, 4.5F, 41F);

		leftTrackWheelModels[24].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 816
		leftTrackWheelModels[24].setRotationPoint(16F, 4.5F, 24F);

		leftTrackWheelModels[25].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 817
		leftTrackWheelModels[25].setRotationPoint(16F, 4.5F, 29F);

		leftTrackWheelModels[26].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 818
		leftTrackWheelModels[26].setRotationPoint(16F, 4.5F, 36F);

		leftTrackWheelModels[27].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 819
		leftTrackWheelModels[27].setRotationPoint(16F, 4.5F, 41F);

		leftTrackWheelModels[28].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 820
		leftTrackWheelModels[28].setRotationPoint(-3F, 4.5F, 24F);

		leftTrackWheelModels[29].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 821
		leftTrackWheelModels[29].setRotationPoint(-3F, 4.5F, 29F);

		leftTrackWheelModels[30].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 822
		leftTrackWheelModels[30].setRotationPoint(-3F, 4.5F, 36F);

		leftTrackWheelModels[31].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 823
		leftTrackWheelModels[31].setRotationPoint(-3F, 4.5F, 41F);

		leftTrackWheelModels[32].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 824
		leftTrackWheelModels[32].setRotationPoint(-75F, 4.5F, 24F);

		leftTrackWheelModels[33].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 825
		leftTrackWheelModels[33].setRotationPoint(-75F, 4.5F, 29F);

		leftTrackWheelModels[34].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 826
		leftTrackWheelModels[34].setRotationPoint(-75F, 4.5F, 36F);

		leftTrackWheelModels[35].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 827
		leftTrackWheelModels[35].setRotationPoint(-75F, 4.5F, 41F);

		leftTrackWheelModels[36].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 828
		leftTrackWheelModels[36].setRotationPoint(-94F, 4.5F, 24F);

		leftTrackWheelModels[37].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 829
		leftTrackWheelModels[37].setRotationPoint(-94F, 4.5F, 29F);

		leftTrackWheelModels[38].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 830
		leftTrackWheelModels[38].setRotationPoint(-94F, 4.5F, 36F);

		leftTrackWheelModels[39].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 831
		leftTrackWheelModels[39].setRotationPoint(-94F, 4.5F, 41F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 7
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 466
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 467
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 471
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 472
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 473
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 474
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 475
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 476
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 477
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 478
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 479
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 768
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 770
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 771
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 773
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 776
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 777
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 778
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 779
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 780
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 781
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 782
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 783
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 784
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 785
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 786
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 787
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 788
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 789
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 790
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 791
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 792
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 793
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 794
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 795
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 796
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 797
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 798
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 799

		rightTrackWheelModels[0].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 7
		rightTrackWheelModels[0].setRotationPoint(26.5F, -2F, -38F);

		rightTrackWheelModels[1].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 466
		rightTrackWheelModels[1].setRotationPoint(-45F, 4.5F, -38F);

		rightTrackWheelModels[2].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 467
		rightTrackWheelModels[2].setRotationPoint(-45F, 4.5F, -33F);

		rightTrackWheelModels[3].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 471
		rightTrackWheelModels[3].setRotationPoint(-64F, 4.5F, -38F);

		rightTrackWheelModels[4].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 472
		rightTrackWheelModels[4].setRotationPoint(-64F, 4.5F, -33F);

		rightTrackWheelModels[5].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 473
		rightTrackWheelModels[5].setRotationPoint(26.5F, -2F, -33F);

		rightTrackWheelModels[6].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 474
		rightTrackWheelModels[6].setRotationPoint(26.5F, -2F, -22F);

		rightTrackWheelModels[7].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 475
		rightTrackWheelModels[7].setRotationPoint(26.5F, -2F, -27F);

		rightTrackWheelModels[8].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 476
		rightTrackWheelModels[8].setRotationPoint(-64F, 4.5F, -26F);

		rightTrackWheelModels[9].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 477
		rightTrackWheelModels[9].setRotationPoint(-64F, 4.5F, -21F);

		rightTrackWheelModels[10].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 478
		rightTrackWheelModels[10].setRotationPoint(-45F, 4.5F, -21F);

		rightTrackWheelModels[11].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 479
		rightTrackWheelModels[11].setRotationPoint(-45F, 4.5F, -26F);

		rightTrackWheelModels[12].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 768
		rightTrackWheelModels[12].setRotationPoint(-106.5F, -2F, -27F);

		rightTrackWheelModels[13].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 770
		rightTrackWheelModels[13].setRotationPoint(-106.5F, -2F, -33F);

		rightTrackWheelModels[14].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 771
		rightTrackWheelModels[14].setRotationPoint(-106.5F, -2F, -38F);

		rightTrackWheelModels[15].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 773
		rightTrackWheelModels[15].setRotationPoint(-106.5F, -2F, -22F);

		rightTrackWheelModels[16].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 776
		rightTrackWheelModels[16].setRotationPoint(-33F, 4.5F, -38F);

		rightTrackWheelModels[17].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 777
		rightTrackWheelModels[17].setRotationPoint(-33F, 4.5F, -33F);

		rightTrackWheelModels[18].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 778
		rightTrackWheelModels[18].setRotationPoint(-33F, 4.5F, -26F);

		rightTrackWheelModels[19].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 779
		rightTrackWheelModels[19].setRotationPoint(-33F, 4.5F, -21F);

		rightTrackWheelModels[20].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 780
		rightTrackWheelModels[20].setRotationPoint(-14F, 4.5F, -21F);

		rightTrackWheelModels[21].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 781
		rightTrackWheelModels[21].setRotationPoint(-14F, 4.5F, -26F);

		rightTrackWheelModels[22].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 782
		rightTrackWheelModels[22].setRotationPoint(-14F, 4.5F, -33F);

		rightTrackWheelModels[23].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 783
		rightTrackWheelModels[23].setRotationPoint(-14F, 4.5F, -38F);

		rightTrackWheelModels[24].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 784
		rightTrackWheelModels[24].setRotationPoint(16F, 4.5F, -21F);

		rightTrackWheelModels[25].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 785
		rightTrackWheelModels[25].setRotationPoint(16F, 4.5F, -26F);

		rightTrackWheelModels[26].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 786
		rightTrackWheelModels[26].setRotationPoint(16F, 4.5F, -33F);

		rightTrackWheelModels[27].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 787
		rightTrackWheelModels[27].setRotationPoint(16F, 4.5F, -38F);

		rightTrackWheelModels[28].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 788
		rightTrackWheelModels[28].setRotationPoint(-3F, 4.5F, -21F);

		rightTrackWheelModels[29].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 789
		rightTrackWheelModels[29].setRotationPoint(-3F, 4.5F, -26F);

		rightTrackWheelModels[30].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 790
		rightTrackWheelModels[30].setRotationPoint(-3F, 4.5F, -33F);

		rightTrackWheelModels[31].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 791
		rightTrackWheelModels[31].setRotationPoint(-3F, 4.5F, -38F);

		rightTrackWheelModels[32].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 792
		rightTrackWheelModels[32].setRotationPoint(-75F, 4.5F, -21F);

		rightTrackWheelModels[33].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 793
		rightTrackWheelModels[33].setRotationPoint(-75F, 4.5F, -26F);

		rightTrackWheelModels[34].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 794
		rightTrackWheelModels[34].setRotationPoint(-75F, 4.5F, -33F);

		rightTrackWheelModels[35].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 795
		rightTrackWheelModels[35].setRotationPoint(-75F, 4.5F, -38F);

		rightTrackWheelModels[36].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 796
		rightTrackWheelModels[36].setRotationPoint(-94F, 4.5F, -21F);

		rightTrackWheelModels[37].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 797
		rightTrackWheelModels[37].setRotationPoint(-94F, 4.5F, -26F);

		rightTrackWheelModels[38].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 798
		rightTrackWheelModels[38].setRotationPoint(-94F, 4.5F, -33F);

		rightTrackWheelModels[39].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 799
		rightTrackWheelModels[39].setRotationPoint(-94F, 4.5F, -38F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 1203
		leftTrackModel[1] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 1204
		leftTrackModel[2] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1205
		leftTrackModel[3] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1206
		leftTrackModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1207
		leftTrackModel[5] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1208
		leftTrackModel[6] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1209
		leftTrackModel[7] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1210
		leftTrackModel[8] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1211
		leftTrackModel[9] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1212
		leftTrackModel[10] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1213
		leftTrackModel[11] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1214
		leftTrackModel[12] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1215
		leftTrackModel[13] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1216
		leftTrackModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1217
		leftTrackModel[15] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1218
		leftTrackModel[16] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1219
		leftTrackModel[17] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1220
		leftTrackModel[18] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1221
		leftTrackModel[19] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1222
		leftTrackModel[20] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1223
		leftTrackModel[21] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1224
		leftTrackModel[22] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1225
		leftTrackModel[23] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1226
		leftTrackModel[24] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1227
		leftTrackModel[25] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1228
		leftTrackModel[26] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1229
		leftTrackModel[27] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1230
		leftTrackModel[28] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1231
		leftTrackModel[29] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1232
		leftTrackModel[30] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1233
		leftTrackModel[31] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1234
		leftTrackModel[32] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1235
		leftTrackModel[33] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1236
		leftTrackModel[34] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1237
		leftTrackModel[35] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1238
		leftTrackModel[36] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1239
		leftTrackModel[37] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1240
		leftTrackModel[38] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1241
		leftTrackModel[39] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1242
		leftTrackModel[40] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 1243
		leftTrackModel[41] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 1244
		leftTrackModel[42] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1245
		leftTrackModel[43] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1246
		leftTrackModel[44] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1247
		leftTrackModel[45] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1248
		leftTrackModel[46] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1249
		leftTrackModel[47] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1250
		leftTrackModel[48] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1251
		leftTrackModel[49] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1252
		leftTrackModel[50] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1253
		leftTrackModel[51] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1254
		leftTrackModel[52] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1255
		leftTrackModel[53] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1256
		leftTrackModel[54] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1257
		leftTrackModel[55] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1258
		leftTrackModel[56] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1259
		leftTrackModel[57] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1260
		leftTrackModel[58] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1261
		leftTrackModel[59] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1262
		leftTrackModel[60] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1263
		leftTrackModel[61] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1264
		leftTrackModel[62] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1265
		leftTrackModel[63] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1266
		leftTrackModel[64] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1267
		leftTrackModel[65] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1268
		leftTrackModel[66] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1269
		leftTrackModel[67] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1270
		leftTrackModel[68] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1271
		leftTrackModel[69] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1272
		leftTrackModel[70] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1273
		leftTrackModel[71] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1274
		leftTrackModel[72] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1275
		leftTrackModel[73] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1276
		leftTrackModel[74] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1277
		leftTrackModel[75] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1278
		leftTrackModel[76] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1279
		leftTrackModel[77] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1280
		leftTrackModel[78] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 1281
		leftTrackModel[79] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 1282
		leftTrackModel[80] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1283
		leftTrackModel[81] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1284
		leftTrackModel[82] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1285
		leftTrackModel[83] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1286
		leftTrackModel[84] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1287
		leftTrackModel[85] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1288
		leftTrackModel[86] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1289
		leftTrackModel[87] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1290
		leftTrackModel[88] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1291
		leftTrackModel[89] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1292
		leftTrackModel[90] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1293
		leftTrackModel[91] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1294
		leftTrackModel[92] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1295
		leftTrackModel[93] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1296
		leftTrackModel[94] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1297
		leftTrackModel[95] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1298
		leftTrackModel[96] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1299
		leftTrackModel[97] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1300
		leftTrackModel[98] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1301
		leftTrackModel[99] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1302
		leftTrackModel[100] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1303
		leftTrackModel[101] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1304
		leftTrackModel[102] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1305
		leftTrackModel[103] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1306
		leftTrackModel[104] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1307
		leftTrackModel[105] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1308
		leftTrackModel[106] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1309
		leftTrackModel[107] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1310
		leftTrackModel[108] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1311
		leftTrackModel[109] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1312
		leftTrackModel[110] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1313
		leftTrackModel[111] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1314
		leftTrackModel[112] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1315
		leftTrackModel[113] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1316
		leftTrackModel[114] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1317
		leftTrackModel[115] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1318
		leftTrackModel[116] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 1319
		leftTrackModel[117] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 1320
		leftTrackModel[118] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1321
		leftTrackModel[119] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1322
		leftTrackModel[120] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1323
		leftTrackModel[121] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1324
		leftTrackModel[122] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1325
		leftTrackModel[123] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1326
		leftTrackModel[124] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1327
		leftTrackModel[125] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1328
		leftTrackModel[126] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1329
		leftTrackModel[127] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1330
		leftTrackModel[128] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1331
		leftTrackModel[129] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1332
		leftTrackModel[130] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1333
		leftTrackModel[131] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1334
		leftTrackModel[132] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1335
		leftTrackModel[133] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1336
		leftTrackModel[134] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1337
		leftTrackModel[135] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1338
		leftTrackModel[136] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1339
		leftTrackModel[137] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1340
		leftTrackModel[138] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1341
		leftTrackModel[139] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1342
		leftTrackModel[140] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1343
		leftTrackModel[141] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1344
		leftTrackModel[142] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1345
		leftTrackModel[143] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1346
		leftTrackModel[144] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1347
		leftTrackModel[145] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1348
		leftTrackModel[146] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1349
		leftTrackModel[147] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1350
		leftTrackModel[148] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1351
		leftTrackModel[149] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1352
		leftTrackModel[150] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1353
		leftTrackModel[151] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1354
		leftTrackModel[152] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1355
		leftTrackModel[153] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1356
		leftTrackModel[154] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1357
		leftTrackModel[155] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1358
		leftTrackModel[156] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 800
		leftTrackModel[157] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 801
		leftTrackModel[158] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 802
		leftTrackModel[159] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 803
		leftTrackModel[160] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 804
		leftTrackModel[161] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 805
		leftTrackModel[162] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 806
		leftTrackModel[163] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 807

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1203
		leftTrackModel[0].setRotationPoint(-59F, -4F, 19F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1204
		leftTrackModel[1].setRotationPoint(-59F, -1F, 19F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1205
		leftTrackModel[2].setRotationPoint(-57F, 4F, 41F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1206
		leftTrackModel[3].setRotationPoint(-57F, 1F, 41F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1207
		leftTrackModel[4].setRotationPoint(-62F, 1F, 41F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1208
		leftTrackModel[5].setRotationPoint(-64F, 3F, 41F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1209
		leftTrackModel[6].setRotationPoint(-52F, 1F, 41F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1210
		leftTrackModel[7].setRotationPoint(-45F, 3F, 41F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1211
		leftTrackModel[8].setRotationPoint(-47F, 3F, 41F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1212
		leftTrackModel[9].setRotationPoint(-65F, 3F, 41F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1213
		leftTrackModel[10].setRotationPoint(-45F, 3F, 20F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1214
		leftTrackModel[11].setRotationPoint(-47F, 3F, 20F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1215
		leftTrackModel[12].setRotationPoint(-52F, 1F, 20F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1216
		leftTrackModel[13].setRotationPoint(-57F, 1F, 20F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1217
		leftTrackModel[14].setRotationPoint(-62F, 1F, 20F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1218
		leftTrackModel[15].setRotationPoint(-64F, 3F, 20F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1219
		leftTrackModel[16].setRotationPoint(-65F, 3F, 20F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1220
		leftTrackModel[17].setRotationPoint(-57F, 4F, 20F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1221
		leftTrackModel[18].setRotationPoint(-45F, 3F, 29F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1222
		leftTrackModel[19].setRotationPoint(-47F, 3F, 29F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1223
		leftTrackModel[20].setRotationPoint(-52F, 1F, 29F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1224
		leftTrackModel[21].setRotationPoint(-57F, 1F, 29F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1225
		leftTrackModel[22].setRotationPoint(-57F, 4F, 29F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1226
		leftTrackModel[23].setRotationPoint(-62F, 1F, 29F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1227
		leftTrackModel[24].setRotationPoint(-65F, 3F, 29F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1228
		leftTrackModel[25].setRotationPoint(-64F, 3F, 29F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1229
		leftTrackModel[26].setRotationPoint(-45F, 3F, 32F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1230
		leftTrackModel[27].setRotationPoint(-47F, 3F, 32F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1231
		leftTrackModel[28].setRotationPoint(-52F, 1F, 32F);

		leftTrackModel[29].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1232
		leftTrackModel[29].setRotationPoint(-57F, 1F, 32F);

		leftTrackModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1233
		leftTrackModel[30].setRotationPoint(-57F, 4F, 32F);

		leftTrackModel[31].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1234
		leftTrackModel[31].setRotationPoint(-62F, 1F, 32F);

		leftTrackModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1235
		leftTrackModel[32].setRotationPoint(-65F, 3F, 32F);

		leftTrackModel[33].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1236
		leftTrackModel[33].setRotationPoint(-64F, 3F, 32F);

		leftTrackModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1237
		leftTrackModel[34].setRotationPoint(-46F, 3.5F, 31.5F);

		leftTrackModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1238
		leftTrackModel[35].setRotationPoint(-65F, 3.5F, 31.5F);

		leftTrackModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1239
		leftTrackModel[36].setRotationPoint(-46F, 3.5F, 19.5F);

		leftTrackModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1240
		leftTrackModel[37].setRotationPoint(-65F, 3.5F, 19.5F);

		leftTrackModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1241
		leftTrackModel[38].setRotationPoint(25.5F, -3F, 32.5F);

		leftTrackModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1242
		leftTrackModel[39].setRotationPoint(25.5F, -3F, 19.5F);

		leftTrackModel[40].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1243
		leftTrackModel[40].setRotationPoint(-89F, -4F, 19F);

		leftTrackModel[41].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1244
		leftTrackModel[41].setRotationPoint(-89F, -1F, 19F);

		leftTrackModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1245
		leftTrackModel[42].setRotationPoint(-87F, 4F, 41F);

		leftTrackModel[43].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1246
		leftTrackModel[43].setRotationPoint(-87F, 1F, 41F);

		leftTrackModel[44].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1247
		leftTrackModel[44].setRotationPoint(-92F, 1F, 41F);

		leftTrackModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1248
		leftTrackModel[45].setRotationPoint(-94F, 3F, 41F);

		leftTrackModel[46].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1249
		leftTrackModel[46].setRotationPoint(-82F, 1F, 41F);

		leftTrackModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1250
		leftTrackModel[47].setRotationPoint(-75F, 3F, 41F);

		leftTrackModel[48].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1251
		leftTrackModel[48].setRotationPoint(-77F, 3F, 41F);

		leftTrackModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1252
		leftTrackModel[49].setRotationPoint(-95F, 3F, 41F);

		leftTrackModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1253
		leftTrackModel[50].setRotationPoint(-75F, 3F, 20F);

		leftTrackModel[51].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1254
		leftTrackModel[51].setRotationPoint(-77F, 3F, 20F);

		leftTrackModel[52].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1255
		leftTrackModel[52].setRotationPoint(-82F, 1F, 20F);

		leftTrackModel[53].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1256
		leftTrackModel[53].setRotationPoint(-87F, 1F, 20F);

		leftTrackModel[54].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1257
		leftTrackModel[54].setRotationPoint(-92F, 1F, 20F);

		leftTrackModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1258
		leftTrackModel[55].setRotationPoint(-94F, 3F, 20F);

		leftTrackModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1259
		leftTrackModel[56].setRotationPoint(-95F, 3F, 20F);

		leftTrackModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1260
		leftTrackModel[57].setRotationPoint(-87F, 4F, 20F);

		leftTrackModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1261
		leftTrackModel[58].setRotationPoint(-75F, 3F, 29F);

		leftTrackModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1262
		leftTrackModel[59].setRotationPoint(-77F, 3F, 29F);

		leftTrackModel[60].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1263
		leftTrackModel[60].setRotationPoint(-82F, 1F, 29F);

		leftTrackModel[61].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1264
		leftTrackModel[61].setRotationPoint(-87F, 1F, 29F);

		leftTrackModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1265
		leftTrackModel[62].setRotationPoint(-87F, 4F, 29F);

		leftTrackModel[63].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1266
		leftTrackModel[63].setRotationPoint(-92F, 1F, 29F);

		leftTrackModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1267
		leftTrackModel[64].setRotationPoint(-95F, 3F, 29F);

		leftTrackModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1268
		leftTrackModel[65].setRotationPoint(-94F, 3F, 29F);

		leftTrackModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1269
		leftTrackModel[66].setRotationPoint(-75F, 3F, 32F);

		leftTrackModel[67].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1270
		leftTrackModel[67].setRotationPoint(-77F, 3F, 32F);

		leftTrackModel[68].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1271
		leftTrackModel[68].setRotationPoint(-82F, 1F, 32F);

		leftTrackModel[69].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1272
		leftTrackModel[69].setRotationPoint(-87F, 1F, 32F);

		leftTrackModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1273
		leftTrackModel[70].setRotationPoint(-87F, 4F, 32F);

		leftTrackModel[71].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1274
		leftTrackModel[71].setRotationPoint(-92F, 1F, 32F);

		leftTrackModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1275
		leftTrackModel[72].setRotationPoint(-95F, 3F, 32F);

		leftTrackModel[73].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1276
		leftTrackModel[73].setRotationPoint(-94F, 3F, 32F);

		leftTrackModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1277
		leftTrackModel[74].setRotationPoint(-76F, 3.5F, 31.5F);

		leftTrackModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1278
		leftTrackModel[75].setRotationPoint(-95F, 3.5F, 31.5F);

		leftTrackModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1279
		leftTrackModel[76].setRotationPoint(-76F, 3.5F, 19.5F);

		leftTrackModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1280
		leftTrackModel[77].setRotationPoint(-95F, 3.5F, 19.5F);

		leftTrackModel[78].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1281
		leftTrackModel[78].setRotationPoint(-28F, -4F, 19F);

		leftTrackModel[79].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1282
		leftTrackModel[79].setRotationPoint(-28F, -1F, 19F);

		leftTrackModel[80].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1283
		leftTrackModel[80].setRotationPoint(-26F, 4F, 41F);

		leftTrackModel[81].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1284
		leftTrackModel[81].setRotationPoint(-26F, 1F, 41F);

		leftTrackModel[82].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1285
		leftTrackModel[82].setRotationPoint(-31F, 1F, 41F);

		leftTrackModel[83].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1286
		leftTrackModel[83].setRotationPoint(-33F, 3F, 41F);

		leftTrackModel[84].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1287
		leftTrackModel[84].setRotationPoint(-21F, 1F, 41F);

		leftTrackModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1288
		leftTrackModel[85].setRotationPoint(-14F, 3F, 41F);

		leftTrackModel[86].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1289
		leftTrackModel[86].setRotationPoint(-16F, 3F, 41F);

		leftTrackModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1290
		leftTrackModel[87].setRotationPoint(-34F, 3F, 41F);

		leftTrackModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1291
		leftTrackModel[88].setRotationPoint(-14F, 3F, 20F);

		leftTrackModel[89].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1292
		leftTrackModel[89].setRotationPoint(-16F, 3F, 20F);

		leftTrackModel[90].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1293
		leftTrackModel[90].setRotationPoint(-21F, 1F, 20F);

		leftTrackModel[91].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1294
		leftTrackModel[91].setRotationPoint(-26F, 1F, 20F);

		leftTrackModel[92].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1295
		leftTrackModel[92].setRotationPoint(-31F, 1F, 20F);

		leftTrackModel[93].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1296
		leftTrackModel[93].setRotationPoint(-33F, 3F, 20F);

		leftTrackModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1297
		leftTrackModel[94].setRotationPoint(-34F, 3F, 20F);

		leftTrackModel[95].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1298
		leftTrackModel[95].setRotationPoint(-26F, 4F, 20F);

		leftTrackModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1299
		leftTrackModel[96].setRotationPoint(-14F, 3F, 29F);

		leftTrackModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1300
		leftTrackModel[97].setRotationPoint(-16F, 3F, 29F);

		leftTrackModel[98].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1301
		leftTrackModel[98].setRotationPoint(-21F, 1F, 29F);

		leftTrackModel[99].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1302
		leftTrackModel[99].setRotationPoint(-26F, 1F, 29F);

		leftTrackModel[100].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1303
		leftTrackModel[100].setRotationPoint(-26F, 4F, 29F);

		leftTrackModel[101].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1304
		leftTrackModel[101].setRotationPoint(-31F, 1F, 29F);

		leftTrackModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1305
		leftTrackModel[102].setRotationPoint(-34F, 3F, 29F);

		leftTrackModel[103].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1306
		leftTrackModel[103].setRotationPoint(-33F, 3F, 29F);

		leftTrackModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1307
		leftTrackModel[104].setRotationPoint(-14F, 3F, 32F);

		leftTrackModel[105].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1308
		leftTrackModel[105].setRotationPoint(-16F, 3F, 32F);

		leftTrackModel[106].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1309
		leftTrackModel[106].setRotationPoint(-21F, 1F, 32F);

		leftTrackModel[107].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1310
		leftTrackModel[107].setRotationPoint(-26F, 1F, 32F);

		leftTrackModel[108].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1311
		leftTrackModel[108].setRotationPoint(-26F, 4F, 32F);

		leftTrackModel[109].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1312
		leftTrackModel[109].setRotationPoint(-31F, 1F, 32F);

		leftTrackModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1313
		leftTrackModel[110].setRotationPoint(-34F, 3F, 32F);

		leftTrackModel[111].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1314
		leftTrackModel[111].setRotationPoint(-33F, 3F, 32F);

		leftTrackModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1315
		leftTrackModel[112].setRotationPoint(-15F, 3.5F, 31.5F);

		leftTrackModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1316
		leftTrackModel[113].setRotationPoint(-34F, 3.5F, 31.5F);

		leftTrackModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1317
		leftTrackModel[114].setRotationPoint(-15F, 3.5F, 19.5F);

		leftTrackModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1318
		leftTrackModel[115].setRotationPoint(-34F, 3.5F, 19.5F);

		leftTrackModel[116].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1319
		leftTrackModel[116].setRotationPoint(2F, -4F, 19F);

		leftTrackModel[117].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1320
		leftTrackModel[117].setRotationPoint(2F, -1F, 19F);

		leftTrackModel[118].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1321
		leftTrackModel[118].setRotationPoint(4F, 4F, 41F);

		leftTrackModel[119].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1322
		leftTrackModel[119].setRotationPoint(4F, 1F, 41F);

		leftTrackModel[120].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1323
		leftTrackModel[120].setRotationPoint(-1F, 1F, 41F);

		leftTrackModel[121].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1324
		leftTrackModel[121].setRotationPoint(-3F, 3F, 41F);

		leftTrackModel[122].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1325
		leftTrackModel[122].setRotationPoint(9F, 1F, 41F);

		leftTrackModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1326
		leftTrackModel[123].setRotationPoint(16F, 3F, 41F);

		leftTrackModel[124].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1327
		leftTrackModel[124].setRotationPoint(14F, 3F, 41F);

		leftTrackModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1328
		leftTrackModel[125].setRotationPoint(-4F, 3F, 41F);

		leftTrackModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1329
		leftTrackModel[126].setRotationPoint(16F, 3F, 20F);

		leftTrackModel[127].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1330
		leftTrackModel[127].setRotationPoint(14F, 3F, 20F);

		leftTrackModel[128].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1331
		leftTrackModel[128].setRotationPoint(9F, 1F, 20F);

		leftTrackModel[129].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1332
		leftTrackModel[129].setRotationPoint(4F, 1F, 20F);

		leftTrackModel[130].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1333
		leftTrackModel[130].setRotationPoint(-1F, 1F, 20F);

		leftTrackModel[131].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1334
		leftTrackModel[131].setRotationPoint(-3F, 3F, 20F);

		leftTrackModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1335
		leftTrackModel[132].setRotationPoint(-4F, 3F, 20F);

		leftTrackModel[133].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1336
		leftTrackModel[133].setRotationPoint(4F, 4F, 20F);

		leftTrackModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1337
		leftTrackModel[134].setRotationPoint(16F, 3F, 29F);

		leftTrackModel[135].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1338
		leftTrackModel[135].setRotationPoint(14F, 3F, 29F);

		leftTrackModel[136].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1339
		leftTrackModel[136].setRotationPoint(9F, 1F, 29F);

		leftTrackModel[137].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1340
		leftTrackModel[137].setRotationPoint(4F, 1F, 29F);

		leftTrackModel[138].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1341
		leftTrackModel[138].setRotationPoint(4F, 4F, 29F);

		leftTrackModel[139].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1342
		leftTrackModel[139].setRotationPoint(-1F, 1F, 29F);

		leftTrackModel[140].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1343
		leftTrackModel[140].setRotationPoint(-4F, 3F, 29F);

		leftTrackModel[141].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1344
		leftTrackModel[141].setRotationPoint(-3F, 3F, 29F);

		leftTrackModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1345
		leftTrackModel[142].setRotationPoint(16F, 3F, 32F);

		leftTrackModel[143].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1346
		leftTrackModel[143].setRotationPoint(14F, 3F, 32F);

		leftTrackModel[144].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1347
		leftTrackModel[144].setRotationPoint(9F, 1F, 32F);

		leftTrackModel[145].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1348
		leftTrackModel[145].setRotationPoint(4F, 1F, 32F);

		leftTrackModel[146].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1349
		leftTrackModel[146].setRotationPoint(4F, 4F, 32F);

		leftTrackModel[147].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1350
		leftTrackModel[147].setRotationPoint(-1F, 1F, 32F);

		leftTrackModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1351
		leftTrackModel[148].setRotationPoint(-4F, 3F, 32F);

		leftTrackModel[149].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1352
		leftTrackModel[149].setRotationPoint(-3F, 3F, 32F);

		leftTrackModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		leftTrackModel[150].setRotationPoint(15F, 3.5F, 31.5F);

		leftTrackModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		leftTrackModel[151].setRotationPoint(-4F, 3.5F, 31.5F);

		leftTrackModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		leftTrackModel[152].setRotationPoint(15F, 3.5F, 19.5F);

		leftTrackModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		leftTrackModel[153].setRotationPoint(-4F, 3.5F, 19.5F);

		leftTrackModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		leftTrackModel[154].setRotationPoint(-107.5F, -3F, 19.5F);

		leftTrackModel[155].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		leftTrackModel[155].setRotationPoint(-107.5F, -3F, 32.5F);

		leftTrackModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,57F, 0F, -1F, 58F, 0F, -1F, 58F, 0F, -1F, 57F, 0F, -1F, 57F, 0F, -1F, 58F, 0F, -1F, 58F, 0F, -1F, 57F, 0F, -1F); // Box 800
		leftTrackModel[156].setRotationPoint(-40F, 9F, 20F);

		leftTrackModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,7F, 0F, -1F, 7F, -9F, -1F, 7F, -9F, -1F, 7F, 0F, -1F, 7F, 0F, -1F, 7F, 9F, -1F, 7F, 9F, -1F, 7F, 0F, -1F); // Box 801
		leftTrackModel[157].setRotationPoint(-105F, 0F, 20F);

		leftTrackModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 3F, -1F); // Box 802
		leftTrackModel[158].setRotationPoint(-112.5F, -3.5F, 20F);

		leftTrackModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,1F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 1F, 0F, -1F); // Box 803
		leftTrackModel[159].setRotationPoint(-111F, -6F, 20F);

		leftTrackModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,69F, 0F, -1F, 69F, 0F, -1F, 69F, 0F, -1F, 69F, 0F, -1F, 69F, 0F, -1F, 69F, 0F, -1F, 69F, 0F, -1F, 69F, 0F, -1F); // Box 804
		leftTrackModel[160].setRotationPoint(-41F, -8F, 20F);

		leftTrackModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,6F, -9F, -1F, 6F, 0F, -1F, 6F, 0F, -1F, 6F, -9F, -1F, 6F, 9F, -1F, 6F, 0F, -1F, 6F, 0F, -1F, 6F, 9F, -1F); // Box 805
		leftTrackModel[161].setRotationPoint(25F, 0F, 20F);

		leftTrackModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 2F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 2F, -1F, 0F, -2F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, -2F, -1F); // Box 806
		leftTrackModel[162].setRotationPoint(30F, -6F, 20F);

		leftTrackModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 3F, -1F); // Box 807
		leftTrackModel[163].setRotationPoint(31.5F, -3.5F, 20F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 97
		rightTrackModel[1] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 98
		rightTrackModel[2] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 99
		rightTrackModel[3] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 100
		rightTrackModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 101
		rightTrackModel[5] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 102
		rightTrackModel[6] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 103
		rightTrackModel[7] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 104
		rightTrackModel[8] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 105
		rightTrackModel[9] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 106
		rightTrackModel[10] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 442
		rightTrackModel[11] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 443
		rightTrackModel[12] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 444
		rightTrackModel[13] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 445
		rightTrackModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 446
		rightTrackModel[15] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 447
		rightTrackModel[16] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 448
		rightTrackModel[17] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 449
		rightTrackModel[18] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 450
		rightTrackModel[19] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 451
		rightTrackModel[20] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 452
		rightTrackModel[21] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 453
		rightTrackModel[22] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 454
		rightTrackModel[23] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 455
		rightTrackModel[24] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 456
		rightTrackModel[25] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 457
		rightTrackModel[26] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 458
		rightTrackModel[27] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 459
		rightTrackModel[28] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 460
		rightTrackModel[29] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 461
		rightTrackModel[30] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 462
		rightTrackModel[31] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 463
		rightTrackModel[32] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 464
		rightTrackModel[33] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 465
		rightTrackModel[34] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 469
		rightTrackModel[35] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 470
		rightTrackModel[36] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 480
		rightTrackModel[37] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 481
		rightTrackModel[38] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 483
		rightTrackModel[39] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 485
		rightTrackModel[40] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 490
		rightTrackModel[41] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 491
		rightTrackModel[42] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 492
		rightTrackModel[43] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 493
		rightTrackModel[44] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 494
		rightTrackModel[45] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 495
		rightTrackModel[46] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 496
		rightTrackModel[47] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 497
		rightTrackModel[48] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 498
		rightTrackModel[49] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 499
		rightTrackModel[50] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 500
		rightTrackModel[51] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 501
		rightTrackModel[52] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 502
		rightTrackModel[53] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 503
		rightTrackModel[54] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 504
		rightTrackModel[55] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 505
		rightTrackModel[56] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 506
		rightTrackModel[57] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 507
		rightTrackModel[58] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 508
		rightTrackModel[59] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 509
		rightTrackModel[60] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 510
		rightTrackModel[61] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 511
		rightTrackModel[62] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 512
		rightTrackModel[63] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 513
		rightTrackModel[64] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 514
		rightTrackModel[65] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 515
		rightTrackModel[66] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 516
		rightTrackModel[67] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 517
		rightTrackModel[68] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 518
		rightTrackModel[69] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 519
		rightTrackModel[70] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 520
		rightTrackModel[71] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 521
		rightTrackModel[72] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 522
		rightTrackModel[73] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 523
		rightTrackModel[74] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 524
		rightTrackModel[75] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 525
		rightTrackModel[76] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 526
		rightTrackModel[77] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 527
		rightTrackModel[78] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 528
		rightTrackModel[79] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 529
		rightTrackModel[80] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 530
		rightTrackModel[81] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 531
		rightTrackModel[82] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 532
		rightTrackModel[83] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 533
		rightTrackModel[84] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 534
		rightTrackModel[85] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 535
		rightTrackModel[86] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 536
		rightTrackModel[87] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 537
		rightTrackModel[88] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 538
		rightTrackModel[89] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 539
		rightTrackModel[90] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 540
		rightTrackModel[91] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 541
		rightTrackModel[92] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 542
		rightTrackModel[93] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 543
		rightTrackModel[94] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 544
		rightTrackModel[95] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 545
		rightTrackModel[96] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 546
		rightTrackModel[97] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 547
		rightTrackModel[98] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 548
		rightTrackModel[99] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 549
		rightTrackModel[100] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 550
		rightTrackModel[101] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 551
		rightTrackModel[102] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 552
		rightTrackModel[103] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 553
		rightTrackModel[104] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 554
		rightTrackModel[105] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 555
		rightTrackModel[106] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 556
		rightTrackModel[107] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 557
		rightTrackModel[108] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 558
		rightTrackModel[109] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 559
		rightTrackModel[110] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 560
		rightTrackModel[111] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 561
		rightTrackModel[112] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 562
		rightTrackModel[113] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 563
		rightTrackModel[114] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 564
		rightTrackModel[115] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 565
		rightTrackModel[116] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 566
		rightTrackModel[117] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 567
		rightTrackModel[118] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 568
		rightTrackModel[119] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 569
		rightTrackModel[120] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 570
		rightTrackModel[121] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 571
		rightTrackModel[122] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 572
		rightTrackModel[123] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 573
		rightTrackModel[124] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 574
		rightTrackModel[125] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 575
		rightTrackModel[126] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 576
		rightTrackModel[127] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 577
		rightTrackModel[128] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 578
		rightTrackModel[129] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 579
		rightTrackModel[130] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 580
		rightTrackModel[131] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 581
		rightTrackModel[132] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 582
		rightTrackModel[133] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 583
		rightTrackModel[134] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 584
		rightTrackModel[135] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 585
		rightTrackModel[136] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 586
		rightTrackModel[137] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 587
		rightTrackModel[138] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 588
		rightTrackModel[139] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 589
		rightTrackModel[140] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 590
		rightTrackModel[141] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 591
		rightTrackModel[142] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 592
		rightTrackModel[143] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 593
		rightTrackModel[144] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 594
		rightTrackModel[145] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 595
		rightTrackModel[146] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 596
		rightTrackModel[147] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 597
		rightTrackModel[148] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 598
		rightTrackModel[149] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 599
		rightTrackModel[150] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 600
		rightTrackModel[151] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 601
		rightTrackModel[152] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 602
		rightTrackModel[153] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 603
		rightTrackModel[154] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 769
		rightTrackModel[155] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 772
		rightTrackModel[156] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 808
		rightTrackModel[157] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 809
		rightTrackModel[158] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 810
		rightTrackModel[159] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 811
		rightTrackModel[160] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 812
		rightTrackModel[161] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 813
		rightTrackModel[162] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 814
		rightTrackModel[163] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 815

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		rightTrackModel[0].setRotationPoint(-59F, -4F, -43F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 98
		rightTrackModel[1].setRotationPoint(-59F, -1F, -43F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 99
		rightTrackModel[2].setRotationPoint(-57F, 4F, -42F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		rightTrackModel[3].setRotationPoint(-57F, 1F, -42F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 101
		rightTrackModel[4].setRotationPoint(-62F, 1F, -42F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		rightTrackModel[5].setRotationPoint(-64F, 3F, -42F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 103
		rightTrackModel[6].setRotationPoint(-52F, 1F, -42F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 104
		rightTrackModel[7].setRotationPoint(-45F, 3F, -42F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		rightTrackModel[8].setRotationPoint(-47F, 3F, -42F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 106
		rightTrackModel[9].setRotationPoint(-65F, 3F, -42F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 442
		rightTrackModel[10].setRotationPoint(-45F, 3F, -21F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		rightTrackModel[11].setRotationPoint(-47F, 3F, -21F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 444
		rightTrackModel[12].setRotationPoint(-52F, 1F, -21F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		rightTrackModel[13].setRotationPoint(-57F, 1F, -21F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 446
		rightTrackModel[14].setRotationPoint(-62F, 1F, -21F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		rightTrackModel[15].setRotationPoint(-64F, 3F, -21F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 448
		rightTrackModel[16].setRotationPoint(-65F, 3F, -21F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 449
		rightTrackModel[17].setRotationPoint(-57F, 4F, -21F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 450
		rightTrackModel[18].setRotationPoint(-45F, 3F, -30F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		rightTrackModel[19].setRotationPoint(-47F, 3F, -30F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 452
		rightTrackModel[20].setRotationPoint(-52F, 1F, -30F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		rightTrackModel[21].setRotationPoint(-57F, 1F, -30F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 454
		rightTrackModel[22].setRotationPoint(-57F, 4F, -30F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 455
		rightTrackModel[23].setRotationPoint(-62F, 1F, -30F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 456
		rightTrackModel[24].setRotationPoint(-65F, 3F, -30F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		rightTrackModel[25].setRotationPoint(-64F, 3F, -30F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 458
		rightTrackModel[26].setRotationPoint(-45F, 3F, -33F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		rightTrackModel[27].setRotationPoint(-47F, 3F, -33F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 460
		rightTrackModel[28].setRotationPoint(-52F, 1F, -33F);

		rightTrackModel[29].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		rightTrackModel[29].setRotationPoint(-57F, 1F, -33F);

		rightTrackModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 462
		rightTrackModel[30].setRotationPoint(-57F, 4F, -33F);

		rightTrackModel[31].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 463
		rightTrackModel[31].setRotationPoint(-62F, 1F, -33F);

		rightTrackModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 464
		rightTrackModel[32].setRotationPoint(-65F, 3F, -33F);

		rightTrackModel[33].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		rightTrackModel[33].setRotationPoint(-64F, 3F, -33F);

		rightTrackModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		rightTrackModel[34].setRotationPoint(-46F, 3.5F, -42.5F);

		rightTrackModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		rightTrackModel[35].setRotationPoint(-65F, 3.5F, -42.5F);

		rightTrackModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		rightTrackModel[36].setRotationPoint(-46F, 3.5F, -30.5F);

		rightTrackModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		rightTrackModel[37].setRotationPoint(-65F, 3.5F, -30.5F);

		rightTrackModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		rightTrackModel[38].setRotationPoint(25.5F, -3F, -43.5F);

		rightTrackModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		rightTrackModel[39].setRotationPoint(25.5F, -3F, -30.5F);

		rightTrackModel[40].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		rightTrackModel[40].setRotationPoint(-89F, -4F, -43F);

		rightTrackModel[41].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 491
		rightTrackModel[41].setRotationPoint(-89F, -1F, -43F);

		rightTrackModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 492
		rightTrackModel[42].setRotationPoint(-87F, 4F, -42F);

		rightTrackModel[43].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		rightTrackModel[43].setRotationPoint(-87F, 1F, -42F);

		rightTrackModel[44].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 494
		rightTrackModel[44].setRotationPoint(-92F, 1F, -42F);

		rightTrackModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		rightTrackModel[45].setRotationPoint(-94F, 3F, -42F);

		rightTrackModel[46].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 496
		rightTrackModel[46].setRotationPoint(-82F, 1F, -42F);

		rightTrackModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 497
		rightTrackModel[47].setRotationPoint(-75F, 3F, -42F);

		rightTrackModel[48].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		rightTrackModel[48].setRotationPoint(-77F, 3F, -42F);

		rightTrackModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 499
		rightTrackModel[49].setRotationPoint(-95F, 3F, -42F);

		rightTrackModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 500
		rightTrackModel[50].setRotationPoint(-75F, 3F, -21F);

		rightTrackModel[51].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		rightTrackModel[51].setRotationPoint(-77F, 3F, -21F);

		rightTrackModel[52].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 502
		rightTrackModel[52].setRotationPoint(-82F, 1F, -21F);

		rightTrackModel[53].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		rightTrackModel[53].setRotationPoint(-87F, 1F, -21F);

		rightTrackModel[54].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 504
		rightTrackModel[54].setRotationPoint(-92F, 1F, -21F);

		rightTrackModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		rightTrackModel[55].setRotationPoint(-94F, 3F, -21F);

		rightTrackModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 506
		rightTrackModel[56].setRotationPoint(-95F, 3F, -21F);

		rightTrackModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 507
		rightTrackModel[57].setRotationPoint(-87F, 4F, -21F);

		rightTrackModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 508
		rightTrackModel[58].setRotationPoint(-75F, 3F, -30F);

		rightTrackModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		rightTrackModel[59].setRotationPoint(-77F, 3F, -30F);

		rightTrackModel[60].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 510
		rightTrackModel[60].setRotationPoint(-82F, 1F, -30F);

		rightTrackModel[61].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		rightTrackModel[61].setRotationPoint(-87F, 1F, -30F);

		rightTrackModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 512
		rightTrackModel[62].setRotationPoint(-87F, 4F, -30F);

		rightTrackModel[63].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 513
		rightTrackModel[63].setRotationPoint(-92F, 1F, -30F);

		rightTrackModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 514
		rightTrackModel[64].setRotationPoint(-95F, 3F, -30F);

		rightTrackModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		rightTrackModel[65].setRotationPoint(-94F, 3F, -30F);

		rightTrackModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 516
		rightTrackModel[66].setRotationPoint(-75F, 3F, -33F);

		rightTrackModel[67].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		rightTrackModel[67].setRotationPoint(-77F, 3F, -33F);

		rightTrackModel[68].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 518
		rightTrackModel[68].setRotationPoint(-82F, 1F, -33F);

		rightTrackModel[69].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		rightTrackModel[69].setRotationPoint(-87F, 1F, -33F);

		rightTrackModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 520
		rightTrackModel[70].setRotationPoint(-87F, 4F, -33F);

		rightTrackModel[71].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 521
		rightTrackModel[71].setRotationPoint(-92F, 1F, -33F);

		rightTrackModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 522
		rightTrackModel[72].setRotationPoint(-95F, 3F, -33F);

		rightTrackModel[73].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		rightTrackModel[73].setRotationPoint(-94F, 3F, -33F);

		rightTrackModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		rightTrackModel[74].setRotationPoint(-76F, 3.5F, -42.5F);

		rightTrackModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		rightTrackModel[75].setRotationPoint(-95F, 3.5F, -42.5F);

		rightTrackModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		rightTrackModel[76].setRotationPoint(-76F, 3.5F, -30.5F);

		rightTrackModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		rightTrackModel[77].setRotationPoint(-95F, 3.5F, -30.5F);

		rightTrackModel[78].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		rightTrackModel[78].setRotationPoint(-28F, -4F, -43F);

		rightTrackModel[79].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 529
		rightTrackModel[79].setRotationPoint(-28F, -1F, -43F);

		rightTrackModel[80].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 530
		rightTrackModel[80].setRotationPoint(-26F, 4F, -42F);

		rightTrackModel[81].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		rightTrackModel[81].setRotationPoint(-26F, 1F, -42F);

		rightTrackModel[82].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 532
		rightTrackModel[82].setRotationPoint(-31F, 1F, -42F);

		rightTrackModel[83].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		rightTrackModel[83].setRotationPoint(-33F, 3F, -42F);

		rightTrackModel[84].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 534
		rightTrackModel[84].setRotationPoint(-21F, 1F, -42F);

		rightTrackModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 535
		rightTrackModel[85].setRotationPoint(-14F, 3F, -42F);

		rightTrackModel[86].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		rightTrackModel[86].setRotationPoint(-16F, 3F, -42F);

		rightTrackModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 537
		rightTrackModel[87].setRotationPoint(-34F, 3F, -42F);

		rightTrackModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 538
		rightTrackModel[88].setRotationPoint(-14F, 3F, -21F);

		rightTrackModel[89].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		rightTrackModel[89].setRotationPoint(-16F, 3F, -21F);

		rightTrackModel[90].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 540
		rightTrackModel[90].setRotationPoint(-21F, 1F, -21F);

		rightTrackModel[91].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		rightTrackModel[91].setRotationPoint(-26F, 1F, -21F);

		rightTrackModel[92].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 542
		rightTrackModel[92].setRotationPoint(-31F, 1F, -21F);

		rightTrackModel[93].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		rightTrackModel[93].setRotationPoint(-33F, 3F, -21F);

		rightTrackModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 544
		rightTrackModel[94].setRotationPoint(-34F, 3F, -21F);

		rightTrackModel[95].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 545
		rightTrackModel[95].setRotationPoint(-26F, 4F, -21F);

		rightTrackModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 546
		rightTrackModel[96].setRotationPoint(-14F, 3F, -30F);

		rightTrackModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		rightTrackModel[97].setRotationPoint(-16F, 3F, -30F);

		rightTrackModel[98].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 548
		rightTrackModel[98].setRotationPoint(-21F, 1F, -30F);

		rightTrackModel[99].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		rightTrackModel[99].setRotationPoint(-26F, 1F, -30F);

		rightTrackModel[100].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 550
		rightTrackModel[100].setRotationPoint(-26F, 4F, -30F);

		rightTrackModel[101].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 551
		rightTrackModel[101].setRotationPoint(-31F, 1F, -30F);

		rightTrackModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 552
		rightTrackModel[102].setRotationPoint(-34F, 3F, -30F);

		rightTrackModel[103].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		rightTrackModel[103].setRotationPoint(-33F, 3F, -30F);

		rightTrackModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 554
		rightTrackModel[104].setRotationPoint(-14F, 3F, -33F);

		rightTrackModel[105].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		rightTrackModel[105].setRotationPoint(-16F, 3F, -33F);

		rightTrackModel[106].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 556
		rightTrackModel[106].setRotationPoint(-21F, 1F, -33F);

		rightTrackModel[107].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		rightTrackModel[107].setRotationPoint(-26F, 1F, -33F);

		rightTrackModel[108].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 558
		rightTrackModel[108].setRotationPoint(-26F, 4F, -33F);

		rightTrackModel[109].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 559
		rightTrackModel[109].setRotationPoint(-31F, 1F, -33F);

		rightTrackModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 560
		rightTrackModel[110].setRotationPoint(-34F, 3F, -33F);

		rightTrackModel[111].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		rightTrackModel[111].setRotationPoint(-33F, 3F, -33F);

		rightTrackModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		rightTrackModel[112].setRotationPoint(-15F, 3.5F, -42.5F);

		rightTrackModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		rightTrackModel[113].setRotationPoint(-34F, 3.5F, -42.5F);

		rightTrackModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		rightTrackModel[114].setRotationPoint(-15F, 3.5F, -30.5F);

		rightTrackModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		rightTrackModel[115].setRotationPoint(-34F, 3.5F, -30.5F);

		rightTrackModel[116].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		rightTrackModel[116].setRotationPoint(2F, -4F, -43F);

		rightTrackModel[117].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 567
		rightTrackModel[117].setRotationPoint(2F, -1F, -43F);

		rightTrackModel[118].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 568
		rightTrackModel[118].setRotationPoint(4F, 4F, -42F);

		rightTrackModel[119].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		rightTrackModel[119].setRotationPoint(4F, 1F, -42F);

		rightTrackModel[120].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 570
		rightTrackModel[120].setRotationPoint(-1F, 1F, -42F);

		rightTrackModel[121].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		rightTrackModel[121].setRotationPoint(-3F, 3F, -42F);

		rightTrackModel[122].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 572
		rightTrackModel[122].setRotationPoint(9F, 1F, -42F);

		rightTrackModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 573
		rightTrackModel[123].setRotationPoint(16F, 3F, -42F);

		rightTrackModel[124].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		rightTrackModel[124].setRotationPoint(14F, 3F, -42F);

		rightTrackModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 575
		rightTrackModel[125].setRotationPoint(-4F, 3F, -42F);

		rightTrackModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 576
		rightTrackModel[126].setRotationPoint(16F, 3F, -21F);

		rightTrackModel[127].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		rightTrackModel[127].setRotationPoint(14F, 3F, -21F);

		rightTrackModel[128].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 578
		rightTrackModel[128].setRotationPoint(9F, 1F, -21F);

		rightTrackModel[129].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		rightTrackModel[129].setRotationPoint(4F, 1F, -21F);

		rightTrackModel[130].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 580
		rightTrackModel[130].setRotationPoint(-1F, 1F, -21F);

		rightTrackModel[131].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		rightTrackModel[131].setRotationPoint(-3F, 3F, -21F);

		rightTrackModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 582
		rightTrackModel[132].setRotationPoint(-4F, 3F, -21F);

		rightTrackModel[133].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 583
		rightTrackModel[133].setRotationPoint(4F, 4F, -21F);

		rightTrackModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 584
		rightTrackModel[134].setRotationPoint(16F, 3F, -30F);

		rightTrackModel[135].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		rightTrackModel[135].setRotationPoint(14F, 3F, -30F);

		rightTrackModel[136].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 586
		rightTrackModel[136].setRotationPoint(9F, 1F, -30F);

		rightTrackModel[137].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		rightTrackModel[137].setRotationPoint(4F, 1F, -30F);

		rightTrackModel[138].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 588
		rightTrackModel[138].setRotationPoint(4F, 4F, -30F);

		rightTrackModel[139].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 589
		rightTrackModel[139].setRotationPoint(-1F, 1F, -30F);

		rightTrackModel[140].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 590
		rightTrackModel[140].setRotationPoint(-4F, 3F, -30F);

		rightTrackModel[141].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		rightTrackModel[141].setRotationPoint(-3F, 3F, -30F);

		rightTrackModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 592
		rightTrackModel[142].setRotationPoint(16F, 3F, -33F);

		rightTrackModel[143].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		rightTrackModel[143].setRotationPoint(14F, 3F, -33F);

		rightTrackModel[144].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 594
		rightTrackModel[144].setRotationPoint(9F, 1F, -33F);

		rightTrackModel[145].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		rightTrackModel[145].setRotationPoint(4F, 1F, -33F);

		rightTrackModel[146].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 596
		rightTrackModel[146].setRotationPoint(4F, 4F, -33F);

		rightTrackModel[147].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 597
		rightTrackModel[147].setRotationPoint(-1F, 1F, -33F);

		rightTrackModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 598
		rightTrackModel[148].setRotationPoint(-4F, 3F, -33F);

		rightTrackModel[149].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		rightTrackModel[149].setRotationPoint(-3F, 3F, -33F);

		rightTrackModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		rightTrackModel[150].setRotationPoint(15F, 3.5F, -42.5F);

		rightTrackModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601
		rightTrackModel[151].setRotationPoint(-4F, 3.5F, -42.5F);

		rightTrackModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		rightTrackModel[152].setRotationPoint(15F, 3.5F, -30.5F);

		rightTrackModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		rightTrackModel[153].setRotationPoint(-4F, 3.5F, -30.5F);

		rightTrackModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
		rightTrackModel[154].setRotationPoint(-107.5F, -3F, -30.5F);

		rightTrackModel[155].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 772
		rightTrackModel[155].setRotationPoint(-107.5F, -3F, -43.5F);

		rightTrackModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 3F, -1F); // Box 808
		rightTrackModel[156].setRotationPoint(31.5F, -3.5F, -42F);

		rightTrackModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,6F, -9F, -1F, 6F, 0F, -1F, 6F, 0F, -1F, 6F, -9F, -1F, 6F, 9F, -1F, 6F, 0F, -1F, 6F, 0F, -1F, 6F, 9F, -1F); // Box 809
		rightTrackModel[157].setRotationPoint(25F, 0F, -42F);

		rightTrackModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,57F, 0F, -1F, 58F, 0F, -1F, 58F, 0F, -1F, 57F, 0F, -1F, 57F, 0F, -1F, 58F, 0F, -1F, 58F, 0F, -1F, 57F, 0F, -1F); // Box 810
		rightTrackModel[158].setRotationPoint(-40F, 9F, -42F);

		rightTrackModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 2F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 2F, -1F, 0F, -2F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, -2F, -1F); // Box 811
		rightTrackModel[159].setRotationPoint(30F, -6F, -42F);

		rightTrackModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,69F, 0F, -1F, 69F, 0F, -1F, 69F, 0F, -1F, 69F, 0F, -1F, 69F, 0F, -1F, 69F, 0F, -1F, 69F, 0F, -1F, 69F, 0F, -1F); // Box 812
		rightTrackModel[160].setRotationPoint(-41F, -8F, -42F);

		rightTrackModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,1F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 1F, 0F, -1F); // Box 813
		rightTrackModel[161].setRotationPoint(-111F, -6F, -42F);

		rightTrackModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 3F, -1F); // Box 814
		rightTrackModel[162].setRotationPoint(-112.5F, -3.5F, -42F);

		rightTrackModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,7F, 0F, -1F, 7F, -9F, -1F, 7F, -9F, -1F, 7F, 0F, -1F, 7F, 0F, -1F, 7F, 9F, -1F, 7F, 9F, -1F, 7F, 0F, -1F); // Box 815
		rightTrackModel[163].setRotationPoint(-105F, 0F, -42F);
	}
}