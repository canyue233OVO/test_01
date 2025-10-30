//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: A5M4
// Model Creator: 
// Created on: 18.05.2023 - 17:54:52
// Last changed on: 18.05.2023 - 17:54:52

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelA5M4 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelA5M4() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[218];
		noseModel = new ModelRendererTurbo[10];
		leftWingModel = new ModelRendererTurbo[3];
		tailWheelModel = new ModelRendererTurbo[7];

		initbodyModel_1();
		initnoseModel_1();
		initleftWingModel_1();
		inittailWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 729, 33, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Box 114
		bodyModel[65] = new ModelRendererTurbo(this, 737, 41, textureX, textureY); // Box 115
		bodyModel[66] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 116
		bodyModel[67] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 117
		bodyModel[68] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 118
		bodyModel[69] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 70
		bodyModel[71] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 80
		bodyModel[72] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 81
		bodyModel[73] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Import 
		bodyModel[74] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Import 
		bodyModel[75] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Import 
		bodyModel[76] = new ModelRendererTurbo(this, 873, 41, textureX, textureY); // Import 
		bodyModel[77] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import 
		bodyModel[78] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Import 
		bodyModel[79] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Import 
		bodyModel[80] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 89
		bodyModel[81] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 90
		bodyModel[82] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 91
		bodyModel[83] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 92
		bodyModel[84] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 93
		bodyModel[85] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 94
		bodyModel[86] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Box 95
		bodyModel[87] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 96
		bodyModel[88] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 97
		bodyModel[89] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 98
		bodyModel[90] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 99
		bodyModel[91] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 100
		bodyModel[92] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Box 101
		bodyModel[93] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 102
		bodyModel[94] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Box 103
		bodyModel[95] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box 104
		bodyModel[96] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 105
		bodyModel[97] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 106
		bodyModel[98] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Box 107
		bodyModel[99] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 108
		bodyModel[100] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 109
		bodyModel[101] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 110
		bodyModel[102] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Box 111
		bodyModel[103] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Box 112
		bodyModel[104] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 113
		bodyModel[105] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 114
		bodyModel[106] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Box 115
		bodyModel[107] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 116
		bodyModel[108] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 117
		bodyModel[109] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 118
		bodyModel[110] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 119
		bodyModel[111] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 120
		bodyModel[112] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 121
		bodyModel[113] = new ModelRendererTurbo(this, 513, 89, textureX, textureY); // Box 122
		bodyModel[114] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 123
		bodyModel[115] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 124
		bodyModel[116] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 125
		bodyModel[117] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 126
		bodyModel[118] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 127
		bodyModel[119] = new ModelRendererTurbo(this, 937, 97, textureX, textureY); // Box 132
		bodyModel[120] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 133
		bodyModel[121] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 134
		bodyModel[122] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 135
		bodyModel[123] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 136
		bodyModel[124] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 137
		bodyModel[125] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 138
		bodyModel[126] = new ModelRendererTurbo(this, 641, 97, textureX, textureY); // Box 139
		bodyModel[127] = new ModelRendererTurbo(this, 809, 97, textureX, textureY); // Box 140
		bodyModel[128] = new ModelRendererTurbo(this, 529, 113, textureX, textureY); // Box 141
		bodyModel[129] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Box 142
		bodyModel[130] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 143
		bodyModel[131] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 144
		bodyModel[132] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 145
		bodyModel[133] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 146
		bodyModel[134] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 147
		bodyModel[135] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Box 148
		bodyModel[136] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 149
		bodyModel[137] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 150
		bodyModel[138] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 151
		bodyModel[139] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 152
		bodyModel[140] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 153
		bodyModel[141] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 154
		bodyModel[142] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 155
		bodyModel[143] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 156
		bodyModel[144] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 157
		bodyModel[145] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 158
		bodyModel[146] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 159
		bodyModel[147] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 162
		bodyModel[148] = new ModelRendererTurbo(this, 553, 113, textureX, textureY); // Box 163
		bodyModel[149] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 164
		bodyModel[150] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 165
		bodyModel[151] = new ModelRendererTurbo(this, 1017, 113, textureX, textureY); // Box 166
		bodyModel[152] = new ModelRendererTurbo(this, 1009, 97, textureX, textureY); // Box 167
		bodyModel[153] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 168
		bodyModel[154] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 169
		bodyModel[155] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 170
		bodyModel[156] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 171
		bodyModel[157] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 172
		bodyModel[158] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 173
		bodyModel[159] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 174
		bodyModel[160] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 175
		bodyModel[161] = new ModelRendererTurbo(this, 625, 89, textureX, textureY); // Box 176
		bodyModel[162] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 177
		bodyModel[163] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 178
		bodyModel[164] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 179
		bodyModel[165] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Box 180
		bodyModel[166] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 172
		bodyModel[167] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 173
		bodyModel[168] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 84
		bodyModel[169] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 85
		bodyModel[170] = new ModelRendererTurbo(this, 729, 65, textureX, textureY); // Box 86
		bodyModel[171] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 87
		bodyModel[172] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 88
		bodyModel[173] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 145
		bodyModel[174] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 180
		bodyModel[175] = new ModelRendererTurbo(this, 641, 49, textureX, textureY); // Box 181
		bodyModel[176] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 182
		bodyModel[177] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 183
		bodyModel[178] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 184
		bodyModel[179] = new ModelRendererTurbo(this, 649, 137, textureX, textureY); // Box 185
		bodyModel[180] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 186
		bodyModel[181] = new ModelRendererTurbo(this, 585, 89, textureX, textureY); // Box 187
		bodyModel[182] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 592
		bodyModel[183] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import 
		bodyModel[184] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 905
		bodyModel[185] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 906
		bodyModel[186] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 444
		bodyModel[187] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 445
		bodyModel[188] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 638
		bodyModel[189] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 639
		bodyModel[190] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 640
		bodyModel[191] = new ModelRendererTurbo(this, 529, 137, textureX, textureY); // Box 641
		bodyModel[192] = new ModelRendererTurbo(this, 561, 137, textureX, textureY); // Box 642
		bodyModel[193] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 643
		bodyModel[194] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 644
		bodyModel[195] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 645
		bodyModel[196] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 646
		bodyModel[197] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 210
		bodyModel[198] = new ModelRendererTurbo(this, 609, 137, textureX, textureY); // Box 211
		bodyModel[199] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 212
		bodyModel[200] = new ModelRendererTurbo(this, 713, 137, textureX, textureY); // Box 214
		bodyModel[201] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 215
		bodyModel[202] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 217
		bodyModel[203] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 675
		bodyModel[204] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 676
		bodyModel[205] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 677
		bodyModel[206] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 400
		bodyModel[207] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 401
		bodyModel[208] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 402
		bodyModel[209] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 415
		bodyModel[210] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Box 416
		bodyModel[211] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 417
		bodyModel[212] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box 227
		bodyModel[213] = new ModelRendererTurbo(this, 753, 33, textureX, textureY); // Box 228
		bodyModel[214] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Box 229
		bodyModel[215] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 230
		bodyModel[216] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 231
		bodyModel[217] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 232

		bodyModel[0].addShapeBox(0F, 0F, 0F, 17, 5, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 0
		bodyModel[0].setRotationPoint(-42F, -40F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 17, 7, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1
		bodyModel[1].setRotationPoint(-42F, -35F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 17, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-42F, -28F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 37, 7, 11, 0F,0F, 0F, -2F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-25F, -35F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 37, 6, 9, 0F,0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(12F, -34F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 37, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-25F, -28F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 37, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(12F, -28F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 37, 5, 9, 0F,0F, 0F, -3F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-25F, -40F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 37, 7, 6, 0F,0F, 0F, -4F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-25F, -47F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 37, 4, 6, 0F,0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(12F, -38F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 10
		bodyModel[10].setRotationPoint(-48F, -35F, -12F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 11
		bodyModel[11].setRotationPoint(-48F, -40F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-48F, -28F, -12F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 13, 5, 10, 0F,0F, -1F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-61F, -40F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 13, 7, 13, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-61F, -35F, -13F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 13, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-61F, -28F, -13F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 37, 2, 2, 0F,-4F, 0F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-25F, -49F, -2F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 37, 6, 2, 0F,0F, 0F, -1F, -10F, -4F, -1F, -10F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(12F, -44F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 37, 4, 8, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 18
		bodyModel[18].setRotationPoint(12F, -23F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 37, 5, 9, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-25F, -22F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 17, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 20
		bodyModel[20].setRotationPoint(-42F, -22F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-48F, -22F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 13, 5, 10, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-61F, -22F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 13, 3, 6, 0F,-3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-61F, -43F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, -2F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(-61F, -43F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 8, 15, 0F,0F, 0F, -2F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[25].setRotationPoint(-66F, -36F, -15F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F,0F, 0F, -2F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[26].setRotationPoint(-66F, -41F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[27].setRotationPoint(-66F, -28F, -15F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F,0F, 0F, 3F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 28
		bodyModel[28].setRotationPoint(-66F, -20F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 7, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(-73F, -28F, -15F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 8, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[30].setRotationPoint(-73F, -36F, -15F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 5, 13, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-73F, -41F, -13F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 32
		bodyModel[32].setRotationPoint(-73F, -20F, -13F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 5, 10, 0F,0F, 2F, 1F, 0F, 0F, 3F, 0F, 2F, -10F, 0F, 2F, -10F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[33].setRotationPoint(-77F, -20F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 34
		bodyModel[34].setRotationPoint(-77F, -28F, -15F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, -1F, -5F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(-77F, -36F, -15F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 5, 10, 0F,0F, -2F, -3F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, -9F, 0F, 1F, -9F); // Box 36
		bodyModel[36].setRotationPoint(-77F, -41F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 30, 4, 5, 0F,0F, 0F, -1F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[37].setRotationPoint(49F, -32F, -5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 30, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[38].setRotationPoint(49F, -28F, -5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 30, 2, 4, 0F,0F, 0F, -2F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[39].setRotationPoint(49F, -34F, -4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 30, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[40].setRotationPoint(49F, -25F, -4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 19, 9, 19, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[41].setRotationPoint(-51F, -24F, -19F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 30, 9, 19, 0F,0F, -2F, 0F, -11F, -5F, 0F, 6F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -3F, 0F, 6F, -3.5F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[42].setRotationPoint(-32F, -24F, -19F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 9, 9, 19, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 43
		bodyModel[43].setRotationPoint(-60F, -24F, -19F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 9, 9, 12, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 44
		bodyModel[44].setRotationPoint(-60F, -24F, -31F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 19, 9, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[45].setRotationPoint(-51F, -24F, -31F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 19, 7, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[46].setRotationPoint(-32F, -22F, -31F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 47
		bodyModel[47].setRotationPoint(-48F, -43F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[48].setRotationPoint(-37F, -48F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 49
		bodyModel[49].setRotationPoint(-41F, -48F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[50].setRotationPoint(-41F, -48F, -3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 51
		bodyModel[51].setRotationPoint(-41F, -48F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 52
		bodyModel[52].setRotationPoint(-37F, -48F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 53
		bodyModel[53].setRotationPoint(-48F, -48F, -3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[54].setRotationPoint(79F, -30F, -2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, -1F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[55].setRotationPoint(79F, -32F, -2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 23, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[56].setRotationPoint(-48F, -25F, -9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 19, 9, 79, 0F,-1.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, -1.5F, -7.25F, 0F, -2.5F, -7.25F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 57
		bodyModel[57].setRotationPoint(-51F, -28F, -110F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 23, 9, 79, 0F,-1.5F, -0.5F, 0F, -18.5F, -0.75F, 0.25F, 0F, -9F, 0F, -4F, -6F, 0F, -1.5F, -7.25F, 0F, -18.5F, -7.75F, 0.25F, 0F, 1F, 0F, -4F, 4F, 0F); // Box 58
		bodyModel[58].setRotationPoint(-36F, -28F, -110F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 9, 2, 78, 0F,-5.75F, -1.25F, 0F, -0.5F, -0.5F, 1F, -2F, -4F, 0F, 2F, -8F, 0F, -5.75F, -0.5F, 0F, -0.5F, -0.25F, 1F, -2F, 11F, 0F, 2F, 10F, 0F); // Box 59
		bodyModel[59].setRotationPoint(-58F, -28F, -109F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 14, 2, 0F,0F, -6.25F, -1.5F, 0F, 0.5F, -1.75F, 0F, 0.5F, 0F, 0F, -6.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[60].setRotationPoint(49F, -48F, -2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 21, 2, 0F,0F, -6.5F, -1.75F, 0F, 2.5F, -1.75F, 0F, 2.5F, 0F, 0F, -6.5F, 0F, 0F, 0.75F, -0.25F, 0F, 1.25F, -0.5F, 0F, 1.25F, 0F, 0F, 0.75F, 0F); // Box 61
		bodyModel[61].setRotationPoint(58F, -55F, -2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 25, 1, 0F,0F, -0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.25F, 0F); // Box 62
		bodyModel[62].setRotationPoint(67F, -58F, -1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 8, 1, 0F,0F, -2F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 63
		bodyModel[63].setRotationPoint(39F, -42F, -1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 11, 1, 21, 0F,-2F, 0F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Box 114
		bodyModel[64].setRotationPoint(56F, -29F, -25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 1, 18, 0F,-2.25F, -0.5F, -3.25F, -3.5F, -0.25F, -0.25F, -1.5F, 0.25F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2.5F, -3.5F, 0F, 0.25F, -1.5F, 0F, 0F, 1.25F, 0F, 0F); // Box 115
		bodyModel[65].setRotationPoint(58F, -29F, -43F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 9, 1, 18, 0F,-1.5F, 0F, -2.5F, -3.5F, 0F, 0.25F, -1.5F, 0F, 0F, 1.25F, 0F, 0F, -2.5F, -0.5F, -2.75F, -3.5F, -0.5F, -0.75F, -1.5F, 0.25F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[66].setRotationPoint(58F, -28F, -43F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 11, 1, 21, 0F,-0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F); // Box 117
		bodyModel[67].setRotationPoint(56F, -28F, -25F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 1, 39, 0F,3.5F, 0.25F, 0.75F, -1.75F, 0F, -8.5F, 4F, 0F, -3.25F, 0F, 0F, 0F, 3.5F, -0.25F, 0.75F, -1.75F, 0F, -8.25F, 3.75F, 0F, -3.5F, 0F, 0F, 0F); // Box 118
		bodyModel[68].setRotationPoint(67F, -28.5F, -42F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 25, 1, 0F,0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.75F, 0.25F, 0F, 0.5F, 0F, 0F, 0.25F, 0F); // Box 69
		bodyModel[69].setRotationPoint(69F, -58F, -1F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 25, 1, 0F,0F, 0.5F, -0.75F, 0F, -2.5F, -0.75F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.75F, 0F); // Box 70
		bodyModel[70].setRotationPoint(73F, -58F, -1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 22, 1, 0F,0F, 0.5F, -0.75F, 1F, -2.5F, -0.75F, 1F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0.75F, 0F); // Box 80
		bodyModel[71].setRotationPoint(77F, -55F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F,0F, 0.5F, -0.75F, 1.5F, -7.5F, -0.75F, 1.5F, -7.5F, 0F, 0F, 0.5F, 0F, 2F, 0F, 0F, -2.25F, 0F, -0.75F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[72].setRotationPoint(80F, -52F, -1F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 13, 3, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[73].setRotationPoint(-56.5F, -6F, -30F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 13, 3, 0F,0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[74].setRotationPoint(-60.5F, -6F, -30F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,-0.5F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F); // Import 
		bodyModel[75].setRotationPoint(-63.5F, -4F, -30F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 13, 3, 0F,0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[76].setRotationPoint(-49.5F, -6F, -30F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 11, 11, 3, 0F,0F, 0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import 
		bodyModel[77].setRotationPoint(-45.5F, -4F, -30F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import 
		bodyModel[78].setRotationPoint(-56.5F, 8F, -29.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[79].setRotationPoint(-58F, 6F, -29.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 7, 10, 2, 0F,0F, 0F, -0.5F, 2.5F, 0F, -0.75F, 2.5F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.75F, -0.75F, 0F, 1F, -0.75F, 0F, 0F, -0.5F); // Box 89
		bodyModel[80].setRotationPoint(-54.5F, -16F, -29.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,-2.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, 0F, 0.25F, -1.25F, 1F, -2.75F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.5F, -0.25F, 0F, 0.25F, -0.5F, 1F); // Box 90
		bodyModel[81].setRotationPoint(-52F, -28F, -119F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 91
		bodyModel[82].setRotationPoint(-46F, -29F, -122F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0.25F, -1F, -3.25F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.25F, -1F, -3.25F, 0F, -1.75F, 0F, 0F, 0.75F, 0F, 0.5F, 0.75F, 0F); // Box 92
		bodyModel[83].setRotationPoint(-49F, -29F, -122F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0F, -0.25F, 0F, 0F, -0.75F, -3.75F, 1.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, -3.75F, 1.5F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 93
		bodyModel[84].setRotationPoint(-42F, -29F, -122F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0.25F, 0.25F, -3F, 0.25F, 0.25F, 1.5F, -0.75F, -0.25F, -1.5F, -0.5F, 0F, 0F, -2.25F, 0.25F, -3F, -2.25F, 0.25F, 1.5F, -0.75F, -0.25F, -1.5F, -0.25F, 0F); // Box 94
		bodyModel[85].setRotationPoint(-36F, -28F, -118F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 17, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[86].setRotationPoint(-42F, -40F, 5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 17, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 96
		bodyModel[87].setRotationPoint(-42F, -35F, 8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 17, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 97
		bodyModel[88].setRotationPoint(-42F, -28F, 9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 37, 7, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 98
		bodyModel[89].setRotationPoint(-25F, -35F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 37, 6, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 99
		bodyModel[90].setRotationPoint(12F, -34F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 37, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -2F); // Box 100
		bodyModel[91].setRotationPoint(-25F, -28F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 37, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, -1F); // Box 101
		bodyModel[92].setRotationPoint(12F, -28F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 37, 5, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 0F, 0F); // Box 102
		bodyModel[93].setRotationPoint(-25F, -40F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 37, 7, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0F, 0F); // Box 103
		bodyModel[94].setRotationPoint(-25F, -47F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 37, 4, 6, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 104
		bodyModel[95].setRotationPoint(12F, -38F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 105
		bodyModel[96].setRotationPoint(-48F, -35F, 8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 106
		bodyModel[97].setRotationPoint(-48F, -40F, 5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 107
		bodyModel[98].setRotationPoint(-48F, -28F, 9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 13, 5, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[99].setRotationPoint(-61F, -40F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 13, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[100].setRotationPoint(-61F, -35F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 13, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 110
		bodyModel[101].setRotationPoint(-61F, -28F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 37, 2, 2, 0F,-4F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F); // Box 111
		bodyModel[102].setRotationPoint(-25F, -49F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 37, 6, 2, 0F,0F, 0F, 0F, -10F, -4F, 0F, -10F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[103].setRotationPoint(12F, -44F, 0F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 37, 4, 8, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, 0F, -2F); // Box 113
		bodyModel[104].setRotationPoint(12F, -23F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 37, 5, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, -3F, 0F, 0F, -3F); // Box 114
		bodyModel[105].setRotationPoint(-25F, -22F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 17, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 115
		bodyModel[106].setRotationPoint(-42F, -22F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 116
		bodyModel[107].setRotationPoint(-48F, -22F, 0F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 13, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 117
		bodyModel[108].setRotationPoint(-61F, -22F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 13, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 118
		bodyModel[109].setRotationPoint(-61F, -43F, 0F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -7F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[110].setRotationPoint(-61F, -43F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 8, 15, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 120
		bodyModel[111].setRotationPoint(-66F, -36F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 3F); // Box 121
		bodyModel[112].setRotationPoint(-66F, -41F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -2F); // Box 122
		bodyModel[113].setRotationPoint(-66F, -28F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F, 3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, -2F); // Box 123
		bodyModel[114].setRotationPoint(-66F, -20F, 0F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 7, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 124
		bodyModel[115].setRotationPoint(-73F, -28F, 0F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 7, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[116].setRotationPoint(-73F, -36F, 0F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 7, 5, 13, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[117].setRotationPoint(-73F, -41F, 0F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 7, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 127
		bodyModel[118].setRotationPoint(-73F, -20F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 30, 4, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 132
		bodyModel[119].setRotationPoint(49F, -32F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 30, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -1F); // Box 133
		bodyModel[120].setRotationPoint(49F, -28F, 0F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 30, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 134
		bodyModel[121].setRotationPoint(49F, -34F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 30, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, 0F, -3F); // Box 135
		bodyModel[122].setRotationPoint(49F, -25F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 19, 9, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[123].setRotationPoint(-51F, -24F, 0F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 30, 9, 19, 0F,0F, 0F, 0F, 6F, -5F, 0F, -11F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 6F, -3.5F, 0F, -11F, -3F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[124].setRotationPoint(-32F, -24F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 9, 9, 19, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 138
		bodyModel[125].setRotationPoint(-60F, -24F, 0F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 9, 9, 12, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 139
		bodyModel[126].setRotationPoint(-60F, -24F, 19F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 19, 9, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[127].setRotationPoint(-51F, -24F, 19F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 19, 7, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[128].setRotationPoint(-32F, -22F, 19F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[129].setRotationPoint(-48F, -43F, 2F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[130].setRotationPoint(-37F, -48F, 5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 144
		bodyModel[131].setRotationPoint(-41F, -48F, 5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[132].setRotationPoint(-41F, -48F, 2F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[133].setRotationPoint(-41F, -48F, 0F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[134].setRotationPoint(-37F, -48F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 148
		bodyModel[135].setRotationPoint(-48F, -48F, 2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 149
		bodyModel[136].setRotationPoint(79F, -30F, 0F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 150
		bodyModel[137].setRotationPoint(79F, -32F, 0F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 23, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[138].setRotationPoint(-48F, -25F, 0F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 19, 9, 79, 0F,0F, -4F, 0F, 0F, -6F, 0F, -2.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -2.5F, -7.25F, 0F, -1.5F, -7.25F, 0F); // Box 152
		bodyModel[139].setRotationPoint(-51F, -28F, 31F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 23, 9, 79, 0F,-4F, -6F, 0F, 0F, -9F, 0F, -18.5F, -0.75F, 0.25F, -1.5F, -0.5F, 0F, -4F, 4F, 0F, 0F, 1F, 0F, -18.5F, -7.75F, 0.25F, -1.5F, -7.25F, 0F); // Box 153
		bodyModel[140].setRotationPoint(-36F, -28F, 31F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 9, 2, 78, 0F,2F, -8F, 0F, -2F, -4F, 0F, -0.5F, -0.5F, 1F, -5.75F, -1.25F, 0F, 2F, 10F, 0F, -2F, 11F, 0F, -0.5F, -0.25F, 1F, -5.75F, -0.5F, 0F); // Box 154
		bodyModel[141].setRotationPoint(-58F, -28F, 31F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 9, 14, 2, 0F,0F, -6.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.75F, 0F, -6.25F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, 0F); // Box 155
		bodyModel[142].setRotationPoint(49F, -48F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 9, 21, 2, 0F,0F, -6.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, -1.75F, 0F, -6.5F, -1.75F, 0F, 0.75F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 0.75F, -0.25F); // Box 156
		bodyModel[143].setRotationPoint(58F, -55F, 0F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 25, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.5F); // Box 157
		bodyModel[144].setRotationPoint(67F, -58F, 0F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 10, 8, 1, 0F,0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -2F, 0F, 0F, -5.75F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F, 0F); // Box 158
		bodyModel[145].setRotationPoint(39F, -42F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 11, 1, 21, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -2F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, 0F, 0F); // Box 159
		bodyModel[146].setRotationPoint(56F, -29F, 4F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 11, 1, 21, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, -1.75F, 0.25F, 0F, -2F, 0F, 0F); // Box 162
		bodyModel[147].setRotationPoint(56F, -28F, 4F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 8, 1, 39, 0F,0F, 0F, 0F, 4F, 0F, -3.25F, -1.75F, 0F, -8.5F, 3.5F, 0.25F, 0.75F, 0F, 0F, 0F, 3.75F, 0F, -3.5F, -1.75F, 0F, -8.25F, 3.5F, -0.25F, 0.75F); // Box 163
		bodyModel[148].setRotationPoint(67F, -28.5F, 3F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 25, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0.25F, 0F, 0.5F, 0.5F); // Box 164
		bodyModel[149].setRotationPoint(69F, -58F, 0F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 25, 1, 0F,0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.75F, 0.25F); // Box 165
		bodyModel[150].setRotationPoint(73F, -58F, 0F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 22, 1, 0F,0F, 0.5F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.75F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 166
		bodyModel[151].setRotationPoint(77F, -55F, 0F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F,0F, 0.5F, 0F, 1.5F, -7.5F, 0F, 1.5F, -7.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2.25F, 0F, -0.75F, 2F, 0F, 0F); // Box 167
		bodyModel[152].setRotationPoint(80F, -52F, 0F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 7, 13, 3, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 168
		bodyModel[153].setRotationPoint(-56.5F, -6F, 27F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 13, 3, 0F,0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 169
		bodyModel[154].setRotationPoint(-60.5F, -6F, 27F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,-0.5F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F); // Box 170
		bodyModel[155].setRotationPoint(-63.5F, -4F, 27F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 13, 3, 0F,0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 171
		bodyModel[156].setRotationPoint(-49.5F, -6F, 27F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 11, 11, 3, 0F,0F, 0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[157].setRotationPoint(-45.5F, -4F, 27F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Box 173
		bodyModel[158].setRotationPoint(-56.5F, 8F, 27.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 174
		bodyModel[159].setRotationPoint(-58F, 6F, 27.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 7, 10, 2, 0F,0F, 0F, -0.5F, 2.5F, 0F, -0.75F, 2.5F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0F, -0.5F); // Box 175
		bodyModel[160].setRotationPoint(-54.5F, -16F, 27.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0.25F, -1.25F, 1F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -2.75F, 0F, -0.25F, 0.25F, -0.5F, 1F, -0.5F, -0.25F, 0F, -0.25F, -2F, -0.25F, -2.75F, -2F, -0.25F); // Box 176
		bodyModel[161].setRotationPoint(-52F, -28F, 110F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F); // Box 177
		bodyModel[162].setRotationPoint(-46F, -29F, 110F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0.25F, -1F, -3.25F, 0.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.75F, 0F, 0.25F, -1F, -3.25F); // Box 178
		bodyModel[163].setRotationPoint(-49F, -29F, 110F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, -0.75F, -3.75F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 1.5F, 0.75F, 0F, 0F, -1.25F, -3.75F, 0F, -1.75F, 0F); // Box 179
		bodyModel[164].setRotationPoint(-42F, -29F, 110F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-1.5F, -0.5F, 0F, 1.5F, -0.75F, -0.25F, -3F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -1.5F, -0.25F, 0F, 1.5F, -0.75F, -0.25F, -3F, -2.25F, 0.25F, 0F, -2.25F, 0.25F); // Box 180
		bodyModel[165].setRotationPoint(-36F, -28F, 110F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 9, 1, 18, 0F,0F, 0F, 0F, -1.5F, 0.25F, 0F, -3.5F, -0.25F, -0.25F, -2.25F, -0.5F, -3.25F, 1.25F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0.25F, -1.5F, 0F, -2.5F); // Box 172
		bodyModel[166].setRotationPoint(58F, -29F, 25F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 9, 1, 18, 0F,1.25F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0.25F, -1.5F, 0F, -2.5F, 0F, 0F, 0F, -1.5F, 0.25F, 0F, -3.5F, -0.5F, -0.75F, -2.5F, -0.5F, -2.75F); // Box 173
		bodyModel[167].setRotationPoint(58F, -28F, 25F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 84
		bodyModel[168].setRotationPoint(-59F, -43.5F, -0.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 85
		bodyModel[169].setRotationPoint(-60F, -45.1F, -0.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 86
		bodyModel[170].setRotationPoint(-60F, -44.6F, 0.05F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 87
		bodyModel[171].setRotationPoint(-60F, -44F, -0.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 88
		bodyModel[172].setRotationPoint(-60F, -44.6F, -1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 145
		bodyModel[173].setRotationPoint(-53F, -43.5F, -0.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[174].setRotationPoint(-77F, -41F, -5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[175].setRotationPoint(-77F, -18F, -5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 5, 10, 0F,0F, 2F, -10F, 0F, 2F, -10F, 0F, 0F, 3F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, -2F, -3F); // Box 182
		bodyModel[176].setRotationPoint(-77F, -20F, 0F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F); // Box 183
		bodyModel[177].setRotationPoint(-77F, -28F, 10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F,0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 184
		bodyModel[178].setRotationPoint(-77F, -36F, 10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 5, 10, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, 1F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 1F, 0F); // Box 185
		bodyModel[179].setRotationPoint(-77F, -41F, 0F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 186
		bodyModel[180].setRotationPoint(-77F, -41F, 0F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 187
		bodyModel[181].setRotationPoint(-77F, -18F, 0F);

		bodyModel[182].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 592
		bodyModel[182].setRotationPoint(-44F, -34.5F, 0F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[183].setRotationPoint(-44.5F, -26F, -1F);

		bodyModel[184].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 905
		bodyModel[184].setRotationPoint(-48F, -27.5F, -4F);
		bodyModel[184].rotateAngleZ = 0.41887903F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 906
		bodyModel[185].setRotationPoint(-48F, -27.5F, -4F);
		bodyModel[185].rotateAngleZ = 0.41887903F;

		bodyModel[186].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 444
		bodyModel[186].setRotationPoint(-48F, -27.5F, 2F);
		bodyModel[186].rotateAngleZ = 0.41887903F;

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 445
		bodyModel[187].setRotationPoint(-48F, -27.5F, 2F);
		bodyModel[187].rotateAngleZ = 0.41887903F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 638
		bodyModel[188].setRotationPoint(-25.5F, -39.5F, -4F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 639
		bodyModel[189].setRotationPoint(-28.5F, -28.5F, -6F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 640
		bodyModel[190].setRotationPoint(-31.5F, -26.5F, -6F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		bodyModel[191].setRotationPoint(-37.5F, -25.5F, -6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 642
		bodyModel[192].setRotationPoint(-40.5F, -27.5F, -6F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 643
		bodyModel[193].setRotationPoint(-35.5F, -28.5F, -6F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 644
		bodyModel[194].setRotationPoint(-40.5F, -28.5F, -6F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 645
		bodyModel[195].setRotationPoint(-35.5F, -28.5F, 5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 646
		bodyModel[196].setRotationPoint(-40.5F, -28.5F, 5F);

		bodyModel[197].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[197].setRotationPoint(-44F, -37.5F, 0F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[198].setRotationPoint(-48F, -40F, -9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[199].setRotationPoint(-48F, -43F, -6F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 214
		bodyModel[200].setRotationPoint(-48F, -40F, 0F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[201].setRotationPoint(-48F, -43F, 0F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[202].setRotationPoint(-25.5F, -45F, -2.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 675
		bodyModel[203].setRotationPoint(-45.75F, -41F, 2.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 676
		bodyModel[204].setRotationPoint(-45.75F, -40.5F, 2.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 677
		bodyModel[205].setRotationPoint(-45.75F, -40.5F, 2.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 400
		bodyModel[206].setRotationPoint(-45.75F, -41F, -4F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 401
		bodyModel[207].setRotationPoint(-45.75F, -40.5F, -4F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 402
		bodyModel[208].setRotationPoint(-45.75F, -40.5F, -4F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 415
		bodyModel[209].setRotationPoint(-45.75F, -42F, -1.25F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 416
		bodyModel[210].setRotationPoint(-45.75F, -41.5F, -1.25F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		bodyModel[211].setRotationPoint(-45.75F, -40.5F, -1.25F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 227
		bodyModel[212].setRotationPoint(-45.75F, -39F, 1.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 228
		bodyModel[213].setRotationPoint(-45.75F, -38.5F, 1.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 229
		bodyModel[214].setRotationPoint(-45.75F, -38.5F, 1.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 230
		bodyModel[215].setRotationPoint(-45.75F, -39F, -3.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 231
		bodyModel[216].setRotationPoint(-45.75F, -38.5F, -3.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 232
		bodyModel[217].setRotationPoint(-45.75F, -38.5F, -3.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 247
		noseModel[1] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Box 248
		noseModel[2] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Box 249
		noseModel[3] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 506
		noseModel[4] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 508
		noseModel[5] = new ModelRendererTurbo(this, 681, 137, textureX, textureY); // Box 509
		noseModel[6] = new ModelRendererTurbo(this, 697, 137, textureX, textureY); // Box 510
		noseModel[7] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 242
		noseModel[8] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Box 243
		noseModel[9] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 244

		noseModel[0].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		noseModel[0].setRotationPoint(-79F, -29.5F, -0.5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		noseModel[1].setRotationPoint(-79F, -29.5F, -1.5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 249
		noseModel[2].setRotationPoint(-79F, -29.5F, 0.5F);

		noseModel[3].addShapeBox(-1F, -15F, -1.5F, 1, 24, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 506
		noseModel[3].setRotationPoint(-75F, -24F, 0F);

		noseModel[4].addShapeBox(-1F, -13F, -1.5F, 1, 26, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 508
		noseModel[4].setRotationPoint(-75F, -28F, 0F);
		noseModel[4].rotateAngleX = 1.55334303F;

		noseModel[5].addShapeBox(-1F, -12F, -1.5F, 1, 23, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 509
		noseModel[5].setRotationPoint(-75F, -28F, 0F);
		noseModel[5].rotateAngleX = 0.78539816F;

		noseModel[6].addShapeBox(-1F, -11F, -1.5F, 1, 23, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 510
		noseModel[6].setRotationPoint(-75F, -28F, 0F);
		noseModel[6].rotateAngleX = -0.78539816F;

		noseModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		noseModel[7].setRotationPoint(-84F, -29.5F, -1.5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		noseModel[8].setRotationPoint(-84F, -29.5F, -0.5F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 244
		noseModel[9].setRotationPoint(-84F, -29.5F, 0.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 975
		leftWingModel[1] = new ModelRendererTurbo(this, 553, 137, textureX, textureY); // Box 976
		leftWingModel[2] = new ModelRendererTurbo(this, 625, 137, textureX, textureY); // Box 977

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 975
		leftWingModel[0].setRotationPoint(-82F, -29F, -3F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 976
		leftWingModel[1].setRotationPoint(-82F, -31F, -3F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 977
		leftWingModel[2].setRotationPoint(-82F, -27F, -3F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Import TW_6
		tailWheelModel[1] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 202
		tailWheelModel[2] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Import TW_1
		tailWheelModel[3] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Import TW_2
		tailWheelModel[4] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Import TW_3
		tailWheelModel[5] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import TW_4
		tailWheelModel[6] = new ModelRendererTurbo(this, 601, 57, textureX, textureY); // Import TW_5

		tailWheelModel[0].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Import TW_6
		tailWheelModel[0].setRotationPoint(60F, -21.5F, -2F);
		tailWheelModel[0].rotateAngleZ = 0.13962634F;

		tailWheelModel[1].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		tailWheelModel[1].setRotationPoint(60F, -21.5F, 1F);
		tailWheelModel[1].rotateAngleZ = 0.13962634F;

		tailWheelModel[2].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Import TW_1
		tailWheelModel[2].setRotationPoint(69F, -19F, -0.5F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, -3F, 0F, -0.25F); // Import TW_2
		tailWheelModel[3].setRotationPoint(68F, -23F, -1F);

		tailWheelModel[4].addShapeBox(0F, -4F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import TW_3
		tailWheelModel[4].setRotationPoint(68F, -23F, -1F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TW_4
		tailWheelModel[5].setRotationPoint(69F, -20F, -0.5F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import TW_5
		tailWheelModel[6].setRotationPoint(69F, -16F, -0.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-80F, -29F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 162, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 162, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 162, textureX, textureY);
		prop[0].addBox(-0.5F, -30F, -1.5F, 1, 30, 3, 0.0F);
		prop[1].addBox(-0.5F, -30F, -1.5F, 1, 30, 3, 0.0F);
		prop[2].addBox(-0.5F, -30F, -1.5F, 1, 30, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}