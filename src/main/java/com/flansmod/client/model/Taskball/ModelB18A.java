//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: B18A
// Model Creator: TaskForce51
// Created on: 15.04.2023 - 23:32:41
// Last changed on: 15.04.2023 - 23:32:41

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelB18A extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelB18A() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[308];
		noseModel = new ModelRendererTurbo[112];
		tailModel = new ModelRendererTurbo[72];
		leftWingModel = new ModelRendererTurbo[70];
		rightWingModel = new ModelRendererTurbo[68];
		yawFlapModel = new ModelRendererTurbo[20];
		pitchFlapLeftModel = new ModelRendererTurbo[3];
		pitchFlapRightModel = new ModelRendererTurbo[3];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		leftWingWheelModel = new ModelRendererTurbo[10];
		rightWingWheelModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 878, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 73, 878, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 792, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 81, 792, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 161, 792, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 137, 878, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 209, 878, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 289, 792, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 369, 792, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 449, 792, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 273, 878, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 377, 878, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 577, 792, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 697, 792, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 809, 792, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 953, 792, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1073, 792, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 1177, 792, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 457, 878, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 553, 878, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 649, 878, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 729, 878, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 1, 968, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 57, 968, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 113, 968, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 865, 878, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 1001, 878, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 1105, 878, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 1265, 792, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 169, 968, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 1385, 792, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 1497, 792, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 241, 968, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 1185, 878, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 1249, 878, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 353, 878, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 529, 878, textureX, textureY); // Box 56
		bodyModel[37] = new ModelRendererTurbo(this, 841, 878, textureX, textureY); // Box 57
		bodyModel[38] = new ModelRendererTurbo(this, 585, 968, textureX, textureY); // Box 68
		bodyModel[39] = new ModelRendererTurbo(this, 1641, 792, textureX, textureY); // Box 69
		bodyModel[40] = new ModelRendererTurbo(this, 1705, 792, textureX, textureY); // Box 70
		bodyModel[41] = new ModelRendererTurbo(this, 673, 792, textureX, textureY); // Box 71
		bodyModel[42] = new ModelRendererTurbo(this, 1761, 792, textureX, textureY); // Box 72
		bodyModel[43] = new ModelRendererTurbo(this, 65, 878, textureX, textureY); // Box 106
		bodyModel[44] = new ModelRendererTurbo(this, 977, 878, textureX, textureY); // Box 107
		bodyModel[45] = new ModelRendererTurbo(this, 1081, 878, textureX, textureY); // Box 131
		bodyModel[46] = new ModelRendererTurbo(this, 273, 878, textureX, textureY); // Box 132
		bodyModel[47] = new ModelRendererTurbo(this, 377, 878, textureX, textureY); // Box 133
		bodyModel[48] = new ModelRendererTurbo(this, 1105, 878, textureX, textureY); // Box 134
		bodyModel[49] = new ModelRendererTurbo(this, 281, 878, textureX, textureY); // Box 135
		bodyModel[50] = new ModelRendererTurbo(this, 1, 112, textureX, textureY); // Box 136
		bodyModel[51] = new ModelRendererTurbo(this, 289, 878, textureX, textureY); // Box 137
		bodyModel[52] = new ModelRendererTurbo(this, 201, 878, textureX, textureY); // Box 138
		bodyModel[53] = new ModelRendererTurbo(this, 1297, 878, textureX, textureY); // Box 139
		bodyModel[54] = new ModelRendererTurbo(this, 1329, 878, textureX, textureY); // Box 140
		bodyModel[55] = new ModelRendererTurbo(this, 1345, 878, textureX, textureY); // Box 141
		bodyModel[56] = new ModelRendererTurbo(this, 457, 878, textureX, textureY); // Box 142
		bodyModel[57] = new ModelRendererTurbo(this, 1, 923, textureX, textureY); // Box 216
		bodyModel[58] = new ModelRendererTurbo(this, 73, 923, textureX, textureY); // Box 217
		bodyModel[59] = new ModelRendererTurbo(this, 1, 835, textureX, textureY); // Box 218
		bodyModel[60] = new ModelRendererTurbo(this, 81, 835, textureX, textureY); // Box 219
		bodyModel[61] = new ModelRendererTurbo(this, 161, 835, textureX, textureY); // Box 220
		bodyModel[62] = new ModelRendererTurbo(this, 137, 923, textureX, textureY); // Box 221
		bodyModel[63] = new ModelRendererTurbo(this, 209, 923, textureX, textureY); // Box 222
		bodyModel[64] = new ModelRendererTurbo(this, 289, 835, textureX, textureY); // Box 223
		bodyModel[65] = new ModelRendererTurbo(this, 369, 835, textureX, textureY); // Box 224
		bodyModel[66] = new ModelRendererTurbo(this, 449, 835, textureX, textureY); // Box 225
		bodyModel[67] = new ModelRendererTurbo(this, 273, 923, textureX, textureY); // Box 226
		bodyModel[68] = new ModelRendererTurbo(this, 377, 923, textureX, textureY); // Box 227
		bodyModel[69] = new ModelRendererTurbo(this, 577, 835, textureX, textureY); // Box 228
		bodyModel[70] = new ModelRendererTurbo(this, 697, 835, textureX, textureY); // Box 229
		bodyModel[71] = new ModelRendererTurbo(this, 809, 835, textureX, textureY); // Box 230
		bodyModel[72] = new ModelRendererTurbo(this, 953, 835, textureX, textureY); // Box 231
		bodyModel[73] = new ModelRendererTurbo(this, 1073, 835, textureX, textureY); // Box 232
		bodyModel[74] = new ModelRendererTurbo(this, 1177, 835, textureX, textureY); // Box 233
		bodyModel[75] = new ModelRendererTurbo(this, 457, 923, textureX, textureY); // Box 234
		bodyModel[76] = new ModelRendererTurbo(this, 553, 923, textureX, textureY); // Box 235
		bodyModel[77] = new ModelRendererTurbo(this, 649, 923, textureX, textureY); // Box 236
		bodyModel[78] = new ModelRendererTurbo(this, 729, 923, textureX, textureY); // Box 237
		bodyModel[79] = new ModelRendererTurbo(this, 1, 996, textureX, textureY); // Box 238
		bodyModel[80] = new ModelRendererTurbo(this, 57, 996, textureX, textureY); // Box 239
		bodyModel[81] = new ModelRendererTurbo(this, 113, 996, textureX, textureY); // Box 240
		bodyModel[82] = new ModelRendererTurbo(this, 865, 923, textureX, textureY); // Box 244
		bodyModel[83] = new ModelRendererTurbo(this, 1001, 923, textureX, textureY); // Box 245
		bodyModel[84] = new ModelRendererTurbo(this, 1105, 923, textureX, textureY); // Box 246
		bodyModel[85] = new ModelRendererTurbo(this, 1265, 835, textureX, textureY); // Box 247
		bodyModel[86] = new ModelRendererTurbo(this, 169, 996, textureX, textureY); // Box 248
		bodyModel[87] = new ModelRendererTurbo(this, 1385, 835, textureX, textureY); // Box 249
		bodyModel[88] = new ModelRendererTurbo(this, 1497, 835, textureX, textureY); // Box 250
		bodyModel[89] = new ModelRendererTurbo(this, 241, 996, textureX, textureY); // Box 251
		bodyModel[90] = new ModelRendererTurbo(this, 1185, 923, textureX, textureY); // Box 254
		bodyModel[91] = new ModelRendererTurbo(this, 1249, 923, textureX, textureY); // Box 255
		bodyModel[92] = new ModelRendererTurbo(this, 353, 923, textureX, textureY); // Box 256
		bodyModel[93] = new ModelRendererTurbo(this, 529, 923, textureX, textureY); // Box 272
		bodyModel[94] = new ModelRendererTurbo(this, 841, 923, textureX, textureY); // Box 273
		bodyModel[95] = new ModelRendererTurbo(this, 585, 996, textureX, textureY); // Box 284
		bodyModel[96] = new ModelRendererTurbo(this, 1641, 835, textureX, textureY); // Box 285
		bodyModel[97] = new ModelRendererTurbo(this, 1705, 835, textureX, textureY); // Box 286
		bodyModel[98] = new ModelRendererTurbo(this, 673, 835, textureX, textureY); // Box 287
		bodyModel[99] = new ModelRendererTurbo(this, 1761, 835, textureX, textureY); // Box 288
		bodyModel[100] = new ModelRendererTurbo(this, 65, 923, textureX, textureY); // Box 322
		bodyModel[101] = new ModelRendererTurbo(this, 977, 923, textureX, textureY); // Box 323
		bodyModel[102] = new ModelRendererTurbo(this, 1081, 923, textureX, textureY); // Box 347
		bodyModel[103] = new ModelRendererTurbo(this, 273, 923, textureX, textureY); // Box 348
		bodyModel[104] = new ModelRendererTurbo(this, 377, 923, textureX, textureY); // Box 349
		bodyModel[105] = new ModelRendererTurbo(this, 1105, 923, textureX, textureY); // Box 350
		bodyModel[106] = new ModelRendererTurbo(this, 281, 923, textureX, textureY); // Box 351
		bodyModel[107] = new ModelRendererTurbo(this, 393, 878, textureX, textureY); // Box 352
		bodyModel[108] = new ModelRendererTurbo(this, 289, 923, textureX, textureY); // Box 353
		bodyModel[109] = new ModelRendererTurbo(this, 201, 923, textureX, textureY); // Box 354
		bodyModel[110] = new ModelRendererTurbo(this, 1297, 923, textureX, textureY); // Box 355
		bodyModel[111] = new ModelRendererTurbo(this, 1329, 923, textureX, textureY); // Box 356
		bodyModel[112] = new ModelRendererTurbo(this, 1345, 923, textureX, textureY); // Box 357
		bodyModel[113] = new ModelRendererTurbo(this, 457, 923, textureX, textureY); // Box 358
		bodyModel[114] = new ModelRendererTurbo(this, 393, 923, textureX, textureY); // Box 443
		bodyModel[115] = new ModelRendererTurbo(this, 553, 923, textureX, textureY); // Box 444
		bodyModel[116] = new ModelRendererTurbo(this, 1185, 923, textureX, textureY); // Box 445
		bodyModel[117] = new ModelRendererTurbo(this, 1369, 923, textureX, textureY); // Box 446
		bodyModel[118] = new ModelRendererTurbo(this, 1393, 923, textureX, textureY); // Box 447
		bodyModel[119] = new ModelRendererTurbo(this, 633, 923, textureX, textureY); // Box 448
		bodyModel[120] = new ModelRendererTurbo(this, 1001, 923, textureX, textureY); // Box 449
		bodyModel[121] = new ModelRendererTurbo(this, 1417, 923, textureX, textureY); // Box 450
		bodyModel[122] = new ModelRendererTurbo(this, 1433, 923, textureX, textureY); // Box 451
		bodyModel[123] = new ModelRendererTurbo(this, 1449, 923, textureX, textureY); // Box 452
		bodyModel[124] = new ModelRendererTurbo(this, 1465, 923, textureX, textureY); // Box 453
		bodyModel[125] = new ModelRendererTurbo(this, 457, 923, textureX, textureY); // Box 454
		bodyModel[126] = new ModelRendererTurbo(this, 641, 923, textureX, textureY); // Box 455
		bodyModel[127] = new ModelRendererTurbo(this, 745, 923, textureX, textureY); // Box 456
		bodyModel[128] = new ModelRendererTurbo(this, 1585, 923, textureX, textureY); // Box 457
		bodyModel[129] = new ModelRendererTurbo(this, 1673, 923, textureX, textureY); // Box 458
		bodyModel[130] = new ModelRendererTurbo(this, 809, 112, textureX, textureY); // Box 470
		bodyModel[131] = new ModelRendererTurbo(this, 1014, 154, textureX, textureY); // Box 471
		bodyModel[132] = new ModelRendererTurbo(this, 985, 112, textureX, textureY); // Box 472
		bodyModel[133] = new ModelRendererTurbo(this, 1081, 112, textureX, textureY); // Box 473
		bodyModel[134] = new ModelRendererTurbo(this, 857, 112, textureX, textureY); // Box 474
		bodyModel[135] = new ModelRendererTurbo(this, 889, 112, textureX, textureY); // Box 239
		bodyModel[136] = new ModelRendererTurbo(this, 793, 112, textureX, textureY); // Box 240
		bodyModel[137] = new ModelRendererTurbo(this, 65, 112, textureX, textureY); // Box 241
		bodyModel[138] = new ModelRendererTurbo(this, 368, 105, textureX, textureY); // Box 242
		bodyModel[139] = new ModelRendererTurbo(this, 993, 91, textureX, textureY); // Box 243
		bodyModel[140] = new ModelRendererTurbo(this, 963, 75, textureX, textureY); // Box 244
		bodyModel[141] = new ModelRendererTurbo(this, 636, 118, textureX, textureY); // Box 245
		bodyModel[142] = new ModelRendererTurbo(this, 993, 112, textureX, textureY); // Box 246
		bodyModel[143] = new ModelRendererTurbo(this, 1041, 112, textureX, textureY); // Box 247
		bodyModel[144] = new ModelRendererTurbo(this, 1049, 112, textureX, textureY); // Box 248
		bodyModel[145] = new ModelRendererTurbo(this, 1083, 119, textureX, textureY); // Box 250
		bodyModel[146] = new ModelRendererTurbo(this, 1065, 112, textureX, textureY); // Box 251
		bodyModel[147] = new ModelRendererTurbo(this, 1024, 91, textureX, textureY); // Box 252
		bodyModel[148] = new ModelRendererTurbo(this, 1142, 131, textureX, textureY); // Box 253
		bodyModel[149] = new ModelRendererTurbo(this, 1092, 88, textureX, textureY); // Box 263
		bodyModel[150] = new ModelRendererTurbo(this, 321, 112, textureX, textureY); // Box 962
		bodyModel[151] = new ModelRendererTurbo(this, 889, 112, textureX, textureY); // Box 964
		bodyModel[152] = new ModelRendererTurbo(this, 921, 112, textureX, textureY); // Box 966
		bodyModel[153] = new ModelRendererTurbo(this, 1161, 112, textureX, textureY); // Box 782
		bodyModel[154] = new ModelRendererTurbo(this, 1169, 112, textureX, textureY); // Box 783
		bodyModel[155] = new ModelRendererTurbo(this, 961, 112, textureX, textureY); // Box 789
		bodyModel[156] = new ModelRendererTurbo(this, 178, 148, textureX, textureY); // Box 791
		bodyModel[157] = new ModelRendererTurbo(this, 305, 112, textureX, textureY); // Box 792
		bodyModel[158] = new ModelRendererTurbo(this, 1240, 169, textureX, textureY); // Box 381
		bodyModel[159] = new ModelRendererTurbo(this, 985, 112, textureX, textureY); // Box 382
		bodyModel[160] = new ModelRendererTurbo(this, 1229, 129, textureX, textureY); // Box 383
		bodyModel[161] = new ModelRendererTurbo(this, 457, 112, textureX, textureY); // Box 922
		bodyModel[162] = new ModelRendererTurbo(this, 976, 177, textureX, textureY); // Box 927
		bodyModel[163] = new ModelRendererTurbo(this, 681, 112, textureX, textureY); // Box 929
		bodyModel[164] = new ModelRendererTurbo(this, 881, 112, textureX, textureY); // Box 930
		bodyModel[165] = new ModelRendererTurbo(this, 976, 177, textureX, textureY); // Box 440
		bodyModel[166] = new ModelRendererTurbo(this, 961, 112, textureX, textureY); // Box 441
		bodyModel[167] = new ModelRendererTurbo(this, 1009, 112, textureX, textureY); // Box 778
		bodyModel[168] = new ModelRendererTurbo(this, 1224, 120, textureX, textureY); // Box 779
		bodyModel[169] = new ModelRendererTurbo(this, 1233, 112, textureX, textureY); // Import 
		bodyModel[170] = new ModelRendererTurbo(this, 1241, 112, textureX, textureY); // Import 
		bodyModel[171] = new ModelRendererTurbo(this, 1249, 112, textureX, textureY); // Box 905
		bodyModel[172] = new ModelRendererTurbo(this, 1252, 130, textureX, textureY); // Box 906
		bodyModel[173] = new ModelRendererTurbo(this, 1265, 112, textureX, textureY); // Box 1116
		bodyModel[174] = new ModelRendererTurbo(this, 1265, 112, textureX, textureY); // Box 514
		bodyModel[175] = new ModelRendererTurbo(this, 1313, 112, textureX, textureY); // Box 515
		bodyModel[176] = new ModelRendererTurbo(this, 1297, 112, textureX, textureY); // Box 516
		bodyModel[177] = new ModelRendererTurbo(this, 1329, 112, textureX, textureY); // Box 517
		bodyModel[178] = new ModelRendererTurbo(this, 1345, 112, textureX, textureY); // Box 518
		bodyModel[179] = new ModelRendererTurbo(this, 1363, 150, textureX, textureY); // Box 519
		bodyModel[180] = new ModelRendererTurbo(this, 1393, 112, textureX, textureY); // Box 520
		bodyModel[181] = new ModelRendererTurbo(this, 1409, 112, textureX, textureY); // Box 521
		bodyModel[182] = new ModelRendererTurbo(this, 1433, 112, textureX, textureY); // Box 522
		bodyModel[183] = new ModelRendererTurbo(this, 1441, 112, textureX, textureY); // Box 523
		bodyModel[184] = new ModelRendererTurbo(this, 1449, 112, textureX, textureY); // Box 524
		bodyModel[185] = new ModelRendererTurbo(this, 1457, 112, textureX, textureY); // Box 525
		bodyModel[186] = new ModelRendererTurbo(this, 1465, 112, textureX, textureY); // Box 526
		bodyModel[187] = new ModelRendererTurbo(this, 1489, 112, textureX, textureY); // Box 527
		bodyModel[188] = new ModelRendererTurbo(this, 1503, 158, textureX, textureY); // Box 528
		bodyModel[189] = new ModelRendererTurbo(this, 1313, 112, textureX, textureY); // Box 529
		bodyModel[190] = new ModelRendererTurbo(this, 1345, 112, textureX, textureY); // Box 530
		bodyModel[191] = new ModelRendererTurbo(this, 1361, 112, textureX, textureY); // Box 531
		bodyModel[192] = new ModelRendererTurbo(this, 1529, 112, textureX, textureY); // Box 532
		bodyModel[193] = new ModelRendererTurbo(this, 1537, 112, textureX, textureY); // Box 533
		bodyModel[194] = new ModelRendererTurbo(this, 1545, 112, textureX, textureY); // Box 534
		bodyModel[195] = new ModelRendererTurbo(this, 1385, 112, textureX, textureY); // Box 535
		bodyModel[196] = new ModelRendererTurbo(this, 1393, 112, textureX, textureY); // Box 536
		bodyModel[197] = new ModelRendererTurbo(this, 1409, 112, textureX, textureY); // Box 537
		bodyModel[198] = new ModelRendererTurbo(this, 1425, 112, textureX, textureY); // Box 538
		bodyModel[199] = new ModelRendererTurbo(this, 1545, 112, textureX, textureY); // Box 539
		bodyModel[200] = new ModelRendererTurbo(this, 1520, 91, textureX, textureY); // Box 540
		bodyModel[201] = new ModelRendererTurbo(this, 1569, 112, textureX, textureY); // Box 541
		bodyModel[202] = new ModelRendererTurbo(this, 1505, 112, textureX, textureY); // Box 542
		bodyModel[203] = new ModelRendererTurbo(this, 1561, 112, textureX, textureY); // Box 544
		bodyModel[204] = new ModelRendererTurbo(this, 1577, 62, textureX, textureY); // Box 545
		bodyModel[205] = new ModelRendererTurbo(this, 1633, 112, textureX, textureY); // Box 546
		bodyModel[206] = new ModelRendererTurbo(this, 1657, 112, textureX, textureY); // Box 547
		bodyModel[207] = new ModelRendererTurbo(this, 1585, 112, textureX, textureY); // Box 676
		bodyModel[208] = new ModelRendererTurbo(this, 1681, 112, textureX, textureY); // Box 677
		bodyModel[209] = new ModelRendererTurbo(this, 1697, 112, textureX, textureY); // Box 678
		bodyModel[210] = new ModelRendererTurbo(this, 1737, 112, textureX, textureY); // Box 239
		bodyModel[211] = new ModelRendererTurbo(this, 1617, 112, textureX, textureY); // Box 241
		bodyModel[212] = new ModelRendererTurbo(this, 1769, 112, textureX, textureY); // Box 242
		bodyModel[213] = new ModelRendererTurbo(this, 1785, 112, textureX, textureY); // Box 243
		bodyModel[214] = new ModelRendererTurbo(this, 1803, 68, textureX, textureY); // Box 244
		bodyModel[215] = new ModelRendererTurbo(this, 1833, 112, textureX, textureY); // Box 246
		bodyModel[216] = new ModelRendererTurbo(this, 1857, 112, textureX, textureY); // Box 690
		bodyModel[217] = new ModelRendererTurbo(this, 1737, 112, textureX, textureY); // Box 691
		bodyModel[218] = new ModelRendererTurbo(this, 1649, 112, textureX, textureY); // Box 1
		bodyModel[219] = new ModelRendererTurbo(this, 1801, 112, textureX, textureY); // Box 2
		bodyModel[220] = new ModelRendererTurbo(this, 1657, 112, textureX, textureY); // Box 3
		bodyModel[221] = new ModelRendererTurbo(this, 1873, 112, textureX, textureY); // Box 4
		bodyModel[222] = new ModelRendererTurbo(this, 1861, 81, textureX, textureY); // Box 5
		bodyModel[223] = new ModelRendererTurbo(this, 1892, 91, textureX, textureY); // Box 6
		bodyModel[224] = new ModelRendererTurbo(this, 1849, 112, textureX, textureY); // Box 7
		bodyModel[225] = new ModelRendererTurbo(this, 1913, 87, textureX, textureY); // Box 8
		bodyModel[226] = new ModelRendererTurbo(this, 1369, 112, textureX, textureY); // Box 9
		bodyModel[227] = new ModelRendererTurbo(this, 1673, 112, textureX, textureY); // Box 10
		bodyModel[228] = new ModelRendererTurbo(this, 1801, 112, textureX, textureY); // Box 11
		bodyModel[229] = new ModelRendererTurbo(this, 1825, 112, textureX, textureY); // Box 12
		bodyModel[230] = new ModelRendererTurbo(this, 1833, 112, textureX, textureY); // Box 13
		bodyModel[231] = new ModelRendererTurbo(this, 1873, 112, textureX, textureY); // Box 14
		bodyModel[232] = new ModelRendererTurbo(this, 1913, 112, textureX, textureY); // Box 15
		bodyModel[233] = new ModelRendererTurbo(this, 1929, 112, textureX, textureY); // Box 16
		bodyModel[234] = new ModelRendererTurbo(this, 1937, 112, textureX, textureY); // Box 17
		bodyModel[235] = new ModelRendererTurbo(this, 1961, 112, textureX, textureY); // Box 18
		bodyModel[236] = new ModelRendererTurbo(this, 1969, 112, textureX, textureY); // Box 19
		bodyModel[237] = new ModelRendererTurbo(this, 1977, 112, textureX, textureY); // Box 20
		bodyModel[238] = new ModelRendererTurbo(this, 1985, 112, textureX, textureY); // Box 21
		bodyModel[239] = new ModelRendererTurbo(this, 1993, 112, textureX, textureY); // Box 22
		bodyModel[240] = new ModelRendererTurbo(this, 2001, 112, textureX, textureY); // Box 23
		bodyModel[241] = new ModelRendererTurbo(this, 2009, 112, textureX, textureY); // Box 24
		bodyModel[242] = new ModelRendererTurbo(this, 2017, 112, textureX, textureY); // Box 25
		bodyModel[243] = new ModelRendererTurbo(this, 2025, 112, textureX, textureY); // Box 27
		bodyModel[244] = new ModelRendererTurbo(this, 100, 126, textureX, textureY); // Box 28
		bodyModel[245] = new ModelRendererTurbo(this, 2033, 112, textureX, textureY); // Box 29
		bodyModel[246] = new ModelRendererTurbo(this, 1, 112, textureX, textureY); // Box 30
		bodyModel[247] = new ModelRendererTurbo(this, 1, 112, textureX, textureY); // Box 31
		bodyModel[248] = new ModelRendererTurbo(this, 1, 112, textureX, textureY); // Box 32
		bodyModel[249] = new ModelRendererTurbo(this, 1, 112, textureX, textureY); // Box 33
		bodyModel[250] = new ModelRendererTurbo(this, 324, 163, textureX, textureY); // Box 725
		bodyModel[251] = new ModelRendererTurbo(this, 576, 130, textureX, textureY); // Box 726
		bodyModel[252] = new ModelRendererTurbo(this, 161, 112, textureX, textureY); // Box 594
		bodyModel[253] = new ModelRendererTurbo(this, 524, 141, textureX, textureY); // Box 595
		bodyModel[254] = new ModelRendererTurbo(this, 780, 166, textureX, textureY); // Box 596
		bodyModel[255] = new ModelRendererTurbo(this, 701, 148, textureX, textureY); // Box 597
		bodyModel[256] = new ModelRendererTurbo(this, 204, 127, textureX, textureY); // Box 598
		bodyModel[257] = new ModelRendererTurbo(this, 729, 112, textureX, textureY); // Box 599
		bodyModel[258] = new ModelRendererTurbo(this, 1151, 55, textureX, textureY); // Box 600
		bodyModel[259] = new ModelRendererTurbo(this, 1059, 73, textureX, textureY); // Box 601
		bodyModel[260] = new ModelRendererTurbo(this, 1128, 83, textureX, textureY); // Box 602
		bodyModel[261] = new ModelRendererTurbo(this, 529, 112, textureX, textureY); // Box 603
		bodyModel[262] = new ModelRendererTurbo(this, 1943, 81, textureX, textureY); // Box 674
		bodyModel[263] = new ModelRendererTurbo(this, 763, 84, textureX, textureY); // Box 683
		bodyModel[264] = new ModelRendererTurbo(this, 1235, 68, textureX, textureY); // Box 724
		bodyModel[265] = new ModelRendererTurbo(this, 844, 69, textureX, textureY); // Box 607
		bodyModel[266] = new ModelRendererTurbo(this, 1275, 75, textureX, textureY); // Box 608
		bodyModel[267] = new ModelRendererTurbo(this, 1455, 159, textureX, textureY); // Box 609
		bodyModel[268] = new ModelRendererTurbo(this, 281, 166, textureX, textureY); // Box 610
		bodyModel[269] = new ModelRendererTurbo(this, 1536, 166, textureX, textureY); // Box 1469
		bodyModel[270] = new ModelRendererTurbo(this, 2041, 112, textureX, textureY); // Box 1470
		bodyModel[271] = new ModelRendererTurbo(this, 617, 112, textureX, textureY); // Box 1471
		bodyModel[272] = new ModelRendererTurbo(this, 625, 112, textureX, textureY); // Box 1472
		bodyModel[273] = new ModelRendererTurbo(this, 1752, 49, textureX, textureY); // Box 1473
		bodyModel[274] = new ModelRendererTurbo(this, 1929, 112, textureX, textureY); // Box 1474
		bodyModel[275] = new ModelRendererTurbo(this, 1180, 144, textureX, textureY); // Box 1475
		bodyModel[276] = new ModelRendererTurbo(this, 1357, 56, textureX, textureY); // Box 1476
		bodyModel[277] = new ModelRendererTurbo(this, 697, 62, textureX, textureY); // Box 1477
		bodyModel[278] = new ModelRendererTurbo(this, 1398, 167, textureX, textureY); // Box 1479
		bodyModel[279] = new ModelRendererTurbo(this, 1431, 59, textureX, textureY); // Box 721
		bodyModel[280] = new ModelRendererTurbo(this, 1654, 46, textureX, textureY); // Box 722
		bodyModel[281] = new ModelRendererTurbo(this, 1754, 146, textureX, textureY); // Box 723
		bodyModel[282] = new ModelRendererTurbo(this, 40, 53, textureX, textureY); // Box 724
		bodyModel[283] = new ModelRendererTurbo(this, 34, 144, textureX, textureY); // Box 725
		bodyModel[284] = new ModelRendererTurbo(this, 1672, 161, textureX, textureY); // Box 726
		bodyModel[285] = new ModelRendererTurbo(this, 1841, 167, textureX, textureY); // Box 727
		bodyModel[286] = new ModelRendererTurbo(this, 281, 112, textureX, textureY); // Box 728
		bodyModel[287] = new ModelRendererTurbo(this, 753, 112, textureX, textureY); // Box 729
		bodyModel[288] = new ModelRendererTurbo(this, 363, 118, textureX, textureY); // Box 730
		bodyModel[289] = new ModelRendererTurbo(this, 1826, 84, textureX, textureY); // Box 731
		bodyModel[290] = new ModelRendererTurbo(this, 950, 47, textureX, textureY); // Box 732
		bodyModel[291] = new ModelRendererTurbo(this, 329, 112, textureX, textureY); // Box 633
		bodyModel[292] = new ModelRendererTurbo(this, 243, 164, textureX, textureY); // Box 634
		bodyModel[293] = new ModelRendererTurbo(this, 434, 169, textureX, textureY); // Box 635
		bodyModel[294] = new ModelRendererTurbo(this, 721, 112, textureX, textureY); // Box 636
		bodyModel[295] = new ModelRendererTurbo(this, 1018, 53, textureX, textureY); // Box 637
		bodyModel[296] = new ModelRendererTurbo(this, 433, 112, textureX, textureY); // Box 638
		bodyModel[297] = new ModelRendererTurbo(this, 1233, 148, textureX, textureY); // Box 639
		bodyModel[298] = new ModelRendererTurbo(this, 629, 96, textureX, textureY); // Box 640
		bodyModel[299] = new ModelRendererTurbo(this, 225, 112, textureX, textureY); // Box 641
		bodyModel[300] = new ModelRendererTurbo(this, 1389, 137, textureX, textureY); // Box 642
		bodyModel[301] = new ModelRendererTurbo(this, 1050, 57, textureX, textureY); // Box 643
		bodyModel[302] = new ModelRendererTurbo(this, 1097, 112, textureX, textureY); // Box 644
		bodyModel[303] = new ModelRendererTurbo(this, 694, 124, textureX, textureY); // Box 645
		bodyModel[304] = new ModelRendererTurbo(this, 1486, 56, textureX, textureY); // Box 646
		bodyModel[305] = new ModelRendererTurbo(this, 1163, 103, textureX, textureY); // Box 647
		bodyModel[306] = new ModelRendererTurbo(this, 992, 70, textureX, textureY); // Box 648
		bodyModel[307] = new ModelRendererTurbo(this, 185, 112, textureX, textureY); // Box 649

		bodyModel[0].addShapeBox(0F, 0F, 0F, 28, 12, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 0
		bodyModel[0].setRotationPoint(-93F, -74F, -19F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 27, 12, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 1
		bodyModel[1].setRotationPoint(-65F, -74F, -19F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 35, 12, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 2
		bodyModel[2].setRotationPoint(-38F, -74F, -19F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 34, 12, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 3
		bodyModel[3].setRotationPoint(-3F, -74F, -19F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 59, 12, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 4
		bodyModel[4].setRotationPoint(31F, -74F, -19F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 28, 17, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 5
		bodyModel[5].setRotationPoint(-93F, -62F, -21F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 27, 17, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-65F, -62F, -21F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 35, 17, 4, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-38F, -62F, -21F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 34, 17, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-3F, -62F, -21F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 59, 17, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(31F, -62F, -21F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 28, 23, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-93F, -45F, -21F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 27, 23, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-65F, -45F, -21F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 35, 21, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-38F, -45F, -21F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 34, 18, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-3F, -45F, -21F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 59, 13, 21, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(31F, -45F, -21F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 59, 2, 8, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(31F, -76F, -17F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 34, 2, 17, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-3F, -76F, -17F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 35, 2, 17, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-38F, -76F, -17F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 27, 2, 17, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-65F, -76F, -17F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 28, 2, 17, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-93F, -76F, -17F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 44, 17, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(-137F, -62F, -21F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 44, 23, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-137F, -45F, -21F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 19, 13, 6, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-156F, -45F, -21F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 19, 10, 7, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-156F, -32F, -21F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 19, 17, 6, 0F,0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(-156F, -62F, -21F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 44, 12, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(-137F, -22F, -21F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 28, 12, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(-93F, -22F, -21F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 27, 12, 21, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[27].setRotationPoint(-65F, -22F, -21F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 35, 10, 21, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, -5F, -6F, 0F, -5F, 0F, 0F, 1F, 0F); // Box 31
		bodyModel[28].setRotationPoint(-38F, -24F, -21F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 19, 12, 15, 0F,0F, 3F, -6F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 3F, -8F, 0F, -5F, -14F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 32
		bodyModel[29].setRotationPoint(-156F, -22F, -21F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 34, 8, 21, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -7F, -6F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[30].setRotationPoint(-3F, -27F, -21F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 59, 6, 21, 0F,0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -11F, -6F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[31].setRotationPoint(31F, -32F, -21F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 19, 5, 19, 0F,0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[32].setRotationPoint(-156F, -67F, -19F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 20, 2, 17, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[33].setRotationPoint(-113F, -76F, -17F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 20, 12, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 39
		bodyModel[34].setRotationPoint(-113F, -74F, -19F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, -5F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(-137F, -67F, -19F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[36].setRotationPoint(-125F, -65F, -19F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, -2F, 4F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 4F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[37].setRotationPoint(-137F, -67F, -14F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 19, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 68
		bodyModel[38].setRotationPoint(-156F, -16F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 23, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[39].setRotationPoint(31F, -76F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 23, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 70
		bodyModel[40].setRotationPoint(67F, -76F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 18, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[41].setRotationPoint(31F, -76F, -3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 19, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[42].setRotationPoint(71F, -76F, -5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[43].setRotationPoint(-137F, -67F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[44].setRotationPoint(-137F, -67F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[45].setRotationPoint(-124F, -74F, -17F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, -1F); // Box 132
		bodyModel[46].setRotationPoint(-124F, -74F, -17F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 133
		bodyModel[47].setRotationPoint(-124F, -74F, -17F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 134
		bodyModel[48].setRotationPoint(-128F, -74F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[49].setRotationPoint(-133F, -74F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[50].setRotationPoint(-132F, -74F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 137
		bodyModel[51].setRotationPoint(-132F, -74F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-6F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[52].setRotationPoint(-132F, -76F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[53].setRotationPoint(-126F, -76F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[54].setRotationPoint(-124F, -76F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 141
		bodyModel[55].setRotationPoint(-124F, -76F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[56].setRotationPoint(-124F, -76F, -17F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 28, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[57].setRotationPoint(-93F, -74F, 15F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 27, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[58].setRotationPoint(-65F, -74F, 15F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 35, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 218
		bodyModel[59].setRotationPoint(-38F, -74F, 15F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 34, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 219
		bodyModel[60].setRotationPoint(-3F, -74F, 15F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 59, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 220
		bodyModel[61].setRotationPoint(31F, -74F, 15F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 28, 17, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[62].setRotationPoint(-93F, -62F, 17F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 27, 17, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[63].setRotationPoint(-65F, -62F, 17F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 35, 17, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[64].setRotationPoint(-38F, -62F, 17F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 34, 17, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[65].setRotationPoint(-3F, -62F, 17F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 59, 17, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[66].setRotationPoint(31F, -62F, 17F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 28, 23, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[67].setRotationPoint(-93F, -45F, 0F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 27, 23, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[68].setRotationPoint(-65F, -45F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 35, 21, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[69].setRotationPoint(-38F, -45F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 34, 18, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[70].setRotationPoint(-3F, -45F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 59, 13, 21, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[71].setRotationPoint(31F, -45F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 59, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[72].setRotationPoint(31F, -76F, 9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 34, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[73].setRotationPoint(-3F, -76F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 35, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[74].setRotationPoint(-38F, -76F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 27, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[75].setRotationPoint(-65F, -76F, 0F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 28, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[76].setRotationPoint(-93F, -76F, 0F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 44, 17, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[77].setRotationPoint(-137F, -62F, 18F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 44, 23, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[78].setRotationPoint(-137F, -45F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 19, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 238
		bodyModel[79].setRotationPoint(-156F, -45F, 15F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 19, 10, 7, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F); // Box 239
		bodyModel[80].setRotationPoint(-156F, -32F, 14F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 19, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 240
		bodyModel[81].setRotationPoint(-156F, -62F, 15F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 44, 12, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 244
		bodyModel[82].setRotationPoint(-137F, -22F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 28, 12, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 245
		bodyModel[83].setRotationPoint(-93F, -22F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 27, 12, 21, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -6F, 0F, 0F, -6F); // Box 246
		bodyModel[84].setRotationPoint(-65F, -22F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 35, 10, 21, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -5F, -6F, 0F, 1F, -6F); // Box 247
		bodyModel[85].setRotationPoint(-38F, -24F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 19, 12, 15, 0F,0F, 3F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 3F, -6F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -5F, -14F); // Box 248
		bodyModel[86].setRotationPoint(-156F, -22F, 6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 34, 8, 21, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -6F, 0F, 0F, -6F); // Box 249
		bodyModel[87].setRotationPoint(-3F, -27F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 59, 6, 21, 0F,0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -6F, 0F, 0F, -6F); // Box 250
		bodyModel[88].setRotationPoint(31F, -32F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 19, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 251
		bodyModel[89].setRotationPoint(-156F, -67F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 20, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[90].setRotationPoint(-113F, -76F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 20, 12, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[91].setRotationPoint(-113F, -74F, 15F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 5F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[92].setRotationPoint(-137F, -67F, 18F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[93].setRotationPoint(-125F, -65F, 18F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, -7F, 0F, 0F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 2F, 4F, 0F, 0F, 0F); // Box 273
		bodyModel[94].setRotationPoint(-137F, -67F, 9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 19, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 284
		bodyModel[95].setRotationPoint(-156F, -16F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 23, 2, 6, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[96].setRotationPoint(31F, -76F, 3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 23, 2, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[97].setRotationPoint(67F, -76F, 5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 18, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[98].setRotationPoint(31F, -76F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 19, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[99].setRotationPoint(71F, -76F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[100].setRotationPoint(-137F, -67F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[101].setRotationPoint(-137F, -67F, 1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[102].setRotationPoint(-124F, -74F, 16F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 1F, 0F, 1F); // Box 348
		bodyModel[103].setRotationPoint(-124F, -74F, 16F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[104].setRotationPoint(-124F, -74F, 9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[105].setRotationPoint(-128F, -74F, 1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[106].setRotationPoint(-133F, -74F, 8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[107].setRotationPoint(-132F, -74F, 0F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 353
		bodyModel[108].setRotationPoint(-132F, -74F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-6F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[109].setRotationPoint(-132F, -76F, 0F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[110].setRotationPoint(-126F, -76F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[111].setRotationPoint(-124F, -76F, 9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[112].setRotationPoint(-124F, -76F, 1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 358
		bodyModel[113].setRotationPoint(-124F, -76F, 10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[114].setRotationPoint(-83F, -88F, -9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 444
		bodyModel[115].setRotationPoint(-83F, -94F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 445
		bodyModel[116].setRotationPoint(-83F, -82F, -9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 446
		bodyModel[117].setRotationPoint(-83F, -82F, 2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[118].setRotationPoint(-83F, -94F, 2F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[119].setRotationPoint(-83F, -88F, 8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[120].setRotationPoint(-83F, -94F, -3F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[121].setRotationPoint(-83F, -77F, -3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 21, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[122].setRotationPoint(-93F, -97F, -0.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 5, 21, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[123].setRotationPoint(-34F, -97F, -0.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 58, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 453
		bodyModel[124].setRotationPoint(-90F, -96F, -0.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[125].setRotationPoint(-145F, -12F, -0.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[126].setRotationPoint(-118F, -10F, -0.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[127].setRotationPoint(-78F, -10F, -0.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 457
		bodyModel[128].setRotationPoint(-117F, -5F, -0.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 2.75F, -0.25F, 0F, -3.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -3.25F, -0.25F); // Box 458
		bodyModel[129].setRotationPoint(-144F, -5F, -0.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 17, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[130].setRotationPoint(-137F, -62F, -18F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 4, 36, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[131].setRotationPoint(-137F, -66F, -18F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 8, 4, 36, 0F,0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[132].setRotationPoint(-132F, -66F, -18F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 8, 8, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[133].setRotationPoint(-132F, -62F, -18F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 8, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[134].setRotationPoint(-132F, -54F, -2F);

		bodyModel[135].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[135].setRotationPoint(-119F, -53F, -13F);
		bodyModel[135].rotateAngleZ = -0.10471976F;

		bodyModel[136].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[136].setRotationPoint(-119F, -53F, -13F);
		bodyModel[136].rotateAngleZ = -0.10471976F;

		bodyModel[137].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[137].setRotationPoint(-119F, -53F, -13F);
		bodyModel[137].rotateAngleZ = -0.10471976F;

		bodyModel[138].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[138].setRotationPoint(-119F, -53F, -4F);
		bodyModel[138].rotateAngleZ = -0.10471976F;

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[139].setRotationPoint(-119F, -53F, -13F);
		bodyModel[139].rotateAngleZ = -0.10471976F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[140].setRotationPoint(-110F, -65F, -13F);
		bodyModel[140].rotateAngleZ = -1E-08F;

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[141].setRotationPoint(-108F, -69F, -11F);
		bodyModel[141].rotateAngleZ = -1E-08F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[142].setRotationPoint(-111F, -64F, -12F);
		bodyModel[142].rotateAngleZ = -1E-08F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[143].setRotationPoint(-111.3F, -64.3F, -10F);
		bodyModel[143].rotateAngleZ = -1E-08F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[144].setRotationPoint(-111.3F, -64.3F, -7F);
		bodyModel[144].rotateAngleZ = -1E-08F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[145].setRotationPoint(-110F, -62F, -12F);
		bodyModel[145].rotateAngleZ = -1E-08F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[146].setRotationPoint(-110F, -62F, -5F);
		bodyModel[146].rotateAngleZ = -1E-08F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[147].setRotationPoint(-116F, -52F, -14F);
		bodyModel[147].rotateAngleZ = 0.78539815F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[148].setRotationPoint(-116F, -52F, -3F);
		bodyModel[148].rotateAngleZ = 0.78539815F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[149].setRotationPoint(-122.5F, -56.25F, -7F);
		bodyModel[149].rotateAngleZ = -1.13446402F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[150].setRotationPoint(-108.5F, -68.5F, -9.5F);
		bodyModel[150].rotateAngleZ = -1E-08F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[151].setRotationPoint(-108.5F, -67.5F, -9.5F);
		bodyModel[151].rotateAngleZ = -1E-08F;

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[152].setRotationPoint(-108.5F, -66.5F, -9.5F);
		bodyModel[152].rotateAngleZ = -1E-08F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 782
		bodyModel[153].setRotationPoint(-115F, -51F, -12F);
		bodyModel[153].rotateAngleZ = -1E-08F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 783
		bodyModel[154].setRotationPoint(-115F, -51F, -5F);
		bodyModel[154].rotateAngleZ = -1E-08F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		bodyModel[155].setRotationPoint(-121F, -58.75F, -9.5F);
		bodyModel[155].rotateAngleZ = -1E-08F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		bodyModel[156].setRotationPoint(-121F, -61.75F, -9.5F);
		bodyModel[156].rotateAngleZ = -1E-08F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		bodyModel[157].setRotationPoint(-121F, -61.75F, -3.5F);
		bodyModel[157].rotateAngleZ = -1E-08F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 12, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[158].setRotationPoint(-126F, -52F, -2F);
		bodyModel[158].rotateAngleZ = -1E-08F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[159].setRotationPoint(-116F, -54F, -2F);
		bodyModel[159].rotateAngleZ = -1E-08F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[160].setRotationPoint(-118F, -54F, -2F);
		bodyModel[160].rotateAngleZ = -1E-08F;

		bodyModel[161].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 922
		bodyModel[161].setRotationPoint(-116F, -56.25F, 0.4F);
		bodyModel[161].rotateAngleZ = -1E-08F;

		bodyModel[162].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 927
		bodyModel[162].setRotationPoint(-116F, -56F, 0.4F);
		bodyModel[162].rotateAngleZ = -1E-08F;

		bodyModel[163].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 929
		bodyModel[163].setRotationPoint(-116F, -56.25F, -0.35F);
		bodyModel[163].rotateAngleZ = -1E-08F;

		bodyModel[164].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 930
		bodyModel[164].setRotationPoint(-116F, -56F, -0.35F);
		bodyModel[164].rotateAngleZ = -1E-08F;

		bodyModel[165].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 440
		bodyModel[165].setRotationPoint(-116F, -56F, 1.15F);
		bodyModel[165].rotateAngleZ = -1E-08F;

		bodyModel[166].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 441
		bodyModel[166].setRotationPoint(-116F, -56.25F, 1.15F);
		bodyModel[166].rotateAngleZ = -1E-08F;

		bodyModel[167].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 778
		bodyModel[167].setRotationPoint(-116F, -56F, -1.1F);
		bodyModel[167].rotateAngleZ = -1E-08F;

		bodyModel[168].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 779
		bodyModel[168].setRotationPoint(-116F, -56.25F, -1.1F);
		bodyModel[168].rotateAngleZ = -1E-08F;

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[169].setRotationPoint(-126.4F, -47.5F, -6F);
		bodyModel[169].rotateAngleZ = 0.41887902F;

		bodyModel[170].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[170].setRotationPoint(-126.4F, -47.5F, -6F);
		bodyModel[170].rotateAngleZ = 0.41887902F;

		bodyModel[171].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 905
		bodyModel[171].setRotationPoint(-126.4F, -47.5F, -12F);
		bodyModel[171].rotateAngleZ = 0.41887902F;

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 906
		bodyModel[172].setRotationPoint(-126.4F, -47.5F, -12F);
		bodyModel[172].rotateAngleZ = 0.41887902F;

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.15F, -0.25F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 1116
		bodyModel[173].setRotationPoint(-121F, -59F, -6.5F);
		bodyModel[173].rotateAngleZ = -0.43633232F;

		bodyModel[174].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[174].setRotationPoint(-119F, -53F, 3F);
		bodyModel[174].rotateAngleZ = -0.10471976F;

		bodyModel[175].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[175].setRotationPoint(-119F, -53F, 3F);
		bodyModel[175].rotateAngleZ = -0.10471976F;

		bodyModel[176].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[176].setRotationPoint(-119F, -53F, 12F);
		bodyModel[176].rotateAngleZ = -0.10471976F;

		bodyModel[177].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[177].setRotationPoint(-119F, -53F, 3F);
		bodyModel[177].rotateAngleZ = -0.10471976F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[178].setRotationPoint(-119F, -53F, 3F);
		bodyModel[178].rotateAngleZ = -0.10471976F;

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[179].setRotationPoint(-110F, -65F, 3F);
		bodyModel[179].rotateAngleZ = -1E-08F;

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[180].setRotationPoint(-108F, -69F, 5F);
		bodyModel[180].rotateAngleZ = -1E-08F;

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[181].setRotationPoint(-111F, -64F, 4F);
		bodyModel[181].rotateAngleZ = -1E-08F;

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[182].setRotationPoint(-111.3F, -64.3F, 9F);
		bodyModel[182].rotateAngleZ = -1E-08F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[183].setRotationPoint(-111.3F, -64.3F, 6F);
		bodyModel[183].rotateAngleZ = -1E-08F;

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 524
		bodyModel[184].setRotationPoint(-110F, -62F, 11F);
		bodyModel[184].rotateAngleZ = -1E-08F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[185].setRotationPoint(-110F, -62F, 4F);
		bodyModel[185].rotateAngleZ = -1E-08F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526
		bodyModel[186].setRotationPoint(-116F, -52F, 13F);
		bodyModel[186].rotateAngleZ = 0.78539815F;

		bodyModel[187].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[187].setRotationPoint(-116F, -52F, 2F);
		bodyModel[187].rotateAngleZ = 0.78539815F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F,-0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 528
		bodyModel[188].setRotationPoint(-122.5F, -56.25F, 5F);
		bodyModel[188].rotateAngleZ = -1.13446402F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[189].setRotationPoint(-108.5F, -68.5F, 6.5F);
		bodyModel[189].rotateAngleZ = -1E-08F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[190].setRotationPoint(-108.5F, -67.5F, 6.5F);
		bodyModel[190].rotateAngleZ = -1E-08F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 531
		bodyModel[191].setRotationPoint(-108.5F, -66.5F, 6.5F);
		bodyModel[191].rotateAngleZ = -1E-08F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[192].setRotationPoint(-115F, -51F, 11F);
		bodyModel[192].rotateAngleZ = -1E-08F;

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 533
		bodyModel[193].setRotationPoint(-115F, -51F, 4F);
		bodyModel[193].rotateAngleZ = -1E-08F;

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[194].setRotationPoint(-121F, -58.75F, 2.5F);
		bodyModel[194].rotateAngleZ = -1E-08F;

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[195].setRotationPoint(-121F, -61.75F, 8.5F);
		bodyModel[195].rotateAngleZ = -1E-08F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[196].setRotationPoint(-121F, -61.75F, 2.5F);
		bodyModel[196].rotateAngleZ = -1E-08F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 537
		bodyModel[197].setRotationPoint(-126.4F, -50.5F, 4F);
		bodyModel[197].rotateAngleZ = 0.41887902F;

		bodyModel[198].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 538
		bodyModel[198].setRotationPoint(-126.4F, -50.5F, 4F);
		bodyModel[198].rotateAngleZ = 0.41887902F;

		bodyModel[199].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 539
		bodyModel[199].setRotationPoint(-126.4F, -50.5F, 10F);
		bodyModel[199].rotateAngleZ = 0.41887902F;

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 540
		bodyModel[200].setRotationPoint(-126.4F, -50.5F, 10F);
		bodyModel[200].rotateAngleZ = 0.41887902F;

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.15F, -0.25F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 541
		bodyModel[201].setRotationPoint(-121F, -59F, 5.5F);
		bodyModel[201].rotateAngleZ = -0.43633232F;

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 17, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[202].setRotationPoint(-93F, -62F, -18F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 12, 17, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[203].setRotationPoint(-93F, -74F, -18F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[204].setRotationPoint(-93F, -74F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 17, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[205].setRotationPoint(-93F, -62F, 11F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 12, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		bodyModel[206].setRotationPoint(-93F, -74F, 11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 11, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		bodyModel[207].setRotationPoint(-92F, -55F, -16.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 11, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 677
		bodyModel[208].setRotationPoint(-92F, -55F, -3.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 11, 1, 15, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 678
		bodyModel[209].setRotationPoint(-92F, -56F, -17.5F);

		bodyModel[210].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[210].setRotationPoint(-80F, -53F, -15F);
		bodyModel[210].rotateAngleZ = -0.10471976F;

		bodyModel[211].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[211].setRotationPoint(-80F, -53F, -15F);
		bodyModel[211].rotateAngleZ = -0.10471976F;

		bodyModel[212].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[212].setRotationPoint(-80F, -53F, -6F);
		bodyModel[212].rotateAngleZ = -0.10471976F;

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[213].setRotationPoint(-80F, -53F, -15F);
		bodyModel[213].rotateAngleZ = -0.10471976F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[214].setRotationPoint(-71F, -65F, -15F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[215].setRotationPoint(-72F, -64F, -14F);

		bodyModel[216].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		bodyModel[216].setRotationPoint(-80F, -53F, -15F);
		bodyModel[216].rotateAngleZ = -0.10471976F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[217].setRotationPoint(-76F, -51F, -11F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[218].setRotationPoint(-83.5F, -60.5F, -11.75F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 2
		bodyModel[219].setRotationPoint(-83.5F, -61.5F, -10.75F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[220].setRotationPoint(-83.5F, -60.5F, -3.75F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[221].setRotationPoint(-83.5F, -57.5F, -10.75F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 8, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[222].setRotationPoint(-91F, -62F, -12.25F);

		bodyModel[223].addShapeBox(0.5F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[223].setRotationPoint(-89F, -60F, -17.75F);
		bodyModel[223].rotateAngleY = 0.05235988F;

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[224].setRotationPoint(-88.5F, -63F, -16.75F);
		bodyModel[224].rotateAngleY = -0.05235988F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0.3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.3F, -0.25F, 0F); // Box 8
		bodyModel[225].setRotationPoint(-90F, -65F, -11.75F);
		bodyModel[225].rotateAngleY = -0.06981317F;
		bodyModel[225].rotateAngleZ = 0.05235988F;

		bodyModel[226].addShapeBox(0.5F, 0F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[226].setRotationPoint(-90F, -62.5F, -11.75F);
		bodyModel[226].rotateAngleY = -0.06981317F;

		bodyModel[227].addShapeBox(4.5F, 0F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[227].setRotationPoint(-90F, -62.5F, -11.75F);
		bodyModel[227].rotateAngleY = -0.06981317F;

		bodyModel[228].addShapeBox(4.5F, 0F, 7.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[228].setRotationPoint(-90F, -62.5F, -11.75F);
		bodyModel[228].rotateAngleY = -0.06981317F;

		bodyModel[229].addShapeBox(0.5F, 0F, 7.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[229].setRotationPoint(-90F, -62.5F, -11.75F);
		bodyModel[229].rotateAngleY = -0.06981317F;

		bodyModel[230].addShapeBox(5.2F, 0.5F, 0.8F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[230].setRotationPoint(-90F, -64F, -11.75F);
		bodyModel[230].rotateAngleY = -0.06981317F;
		bodyModel[230].rotateAngleZ = 0.05235988F;

		bodyModel[231].addShapeBox(5.2F, 0.5F, 3.3F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[231].setRotationPoint(-90F, -64F, -11.75F);
		bodyModel[231].rotateAngleY = -0.06981317F;
		bodyModel[231].rotateAngleZ = 0.05235988F;

		bodyModel[232].addShapeBox(5.25F, 0.5F, 5.7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 15
		bodyModel[232].setRotationPoint(-90F, -65F, -11.75F);
		bodyModel[232].rotateAngleY = -0.06981317F;
		bodyModel[232].rotateAngleZ = 0.05235988F;

		bodyModel[233].addShapeBox(5.25F, 1.5F, 5.7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 16
		bodyModel[233].setRotationPoint(-90F, -65F, -11.75F);
		bodyModel[233].rotateAngleY = -0.06981317F;
		bodyModel[233].rotateAngleZ = 0.05235988F;

		bodyModel[234].addShapeBox(5.25F, 1.5F, 7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 17
		bodyModel[234].setRotationPoint(-90F, -65F, -11.75F);
		bodyModel[234].rotateAngleY = -0.06981317F;
		bodyModel[234].rotateAngleZ = 0.05235988F;

		bodyModel[235].addShapeBox(5.25F, 0.5F, 7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 18
		bodyModel[235].setRotationPoint(-90F, -65F, -11.75F);
		bodyModel[235].rotateAngleY = -0.06981317F;
		bodyModel[235].rotateAngleZ = 0.05235988F;

		bodyModel[236].addShapeBox(5.2F, 0.5F, 3.3F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[236].setRotationPoint(-90F, -65F, -11.75F);
		bodyModel[236].rotateAngleY = -0.06981317F;
		bodyModel[236].rotateAngleZ = 0.05235988F;

		bodyModel[237].addShapeBox(5.2F, 0.5F, 0.8F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[237].setRotationPoint(-90F, -65F, -11.75F);
		bodyModel[237].rotateAngleY = -0.06981317F;
		bodyModel[237].rotateAngleZ = 0.05235988F;

		bodyModel[238].addShapeBox(5.2F, 1F, 0.8F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[238].setRotationPoint(-89F, -60F, -11F);

		bodyModel[239].addShapeBox(5.2F, 1F, 0.8F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[239].setRotationPoint(-89F, -61F, -11F);

		bodyModel[240].addShapeBox(5.2F, 1F, 0.8F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[240].setRotationPoint(-89F, -60F, -8.5F);

		bodyModel[241].addShapeBox(5.2F, 1F, 0.8F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[241].setRotationPoint(-89F, -61F, -8.5F);

		bodyModel[242].addShapeBox(5.25F, 1.5F, 7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 25
		bodyModel[242].setRotationPoint(-89F, -61.5F, -12F);

		bodyModel[243].addShapeBox(5.25F, 1.5F, 7F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 27
		bodyModel[243].setRotationPoint(-89F, -60.5F, -12F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[244].setRotationPoint(-88.5F, -64F, -16.75F);
		bodyModel[244].rotateAngleY = -0.05235988F;

		bodyModel[245].addShapeBox(1F, 0F, 1F, 1, 8, 1, 0F,-0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F, -0.37F, 0F, -0.37F); // Box 29
		bodyModel[245].setRotationPoint(-90.5F, -72F, -5F);
		bodyModel[245].rotateAngleY = -0.08726646F;
		bodyModel[245].rotateAngleZ = 0.03490659F;

		bodyModel[246].addShapeBox(5.3F, -1.3F, 1.25F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 30
		bodyModel[246].setRotationPoint(-90F, -62.5F, -11.75F);
		bodyModel[246].rotateAngleY = -0.06981317F;

		bodyModel[247].addShapeBox(5.3F, -0.3F, 3.8F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 31
		bodyModel[247].setRotationPoint(-90F, -62.5F, -11.75F);
		bodyModel[247].rotateAngleX = 0.2443461F;
		bodyModel[247].rotateAngleY = -0.06981317F;

		bodyModel[248].addShapeBox(0F, 0F, -0.3F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 32
		bodyModel[248].setRotationPoint(-83.7F, -58.9F, -9.75F);
		bodyModel[248].rotateAngleX = 0.50614548F;

		bodyModel[249].addShapeBox(0F, 0F, -0.3F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 33
		bodyModel[249].setRotationPoint(-83.7F, -59F, -6.4F);
		bodyModel[249].rotateAngleX = -0.50614548F;

		bodyModel[250].addShapeBox(0F, 0F, 0F, 8, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		bodyModel[250].setRotationPoint(-56.25F, -65F, -15F);
		bodyModel[250].rotateAngleY = 0.03490659F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 10, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[251].setRotationPoint(-67.25F, -65F, -15F);
		bodyModel[251].rotateAngleY = -0.03490659F;

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 12, 17, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[252].setRotationPoint(-48F, -74F, -18F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 17, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[253].setRotationPoint(-48F, -62F, -18F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 17, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
		bodyModel[254].setRotationPoint(-48F, -62F, 11F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 12, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597
		bodyModel[255].setRotationPoint(-48F, -74F, 11F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		bodyModel[256].setRotationPoint(-48F, -74F, -1F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 12, 17, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[257].setRotationPoint(30F, -74F, -18F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 17, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		bodyModel[258].setRotationPoint(30F, -62F, -18F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 17, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601
		bodyModel[259].setRotationPoint(30F, -62F, 11F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 12, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[260].setRotationPoint(30F, -74F, 11F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[261].setRotationPoint(30F, -74F, -1F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 25, 10, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 674
		bodyModel[262].setRotationPoint(-11F, -55F, 7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 25, 1, 11, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F); // Box 683
		bodyModel[263].setRotationPoint(-11F, -55.25F, 7F);
		bodyModel[263].rotateAngleX = 0.01745329F;

		bodyModel[264].addShapeBox(0F, 0F, 0F, 5, 20, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 724
		bodyModel[264].setRotationPoint(-47.25F, -65F, -14F);
		bodyModel[264].rotateAngleY = 0.03490659F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 25, 1, 11, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F); // Box 607
		bodyModel[265].setRotationPoint(-83F, -55.25F, 7F);
		bodyModel[265].rotateAngleX = 0.01745329F;

		bodyModel[266].addShapeBox(0F, 0F, 0F, 25, 10, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		bodyModel[266].setRotationPoint(-83F, -55F, 7F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 8, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		bodyModel[267].setRotationPoint(21.75F, -65F, -15F);
		bodyModel[267].rotateAngleY = 0.03490659F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 10, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		bodyModel[268].setRotationPoint(10.75F, -65F, -15F);
		bodyModel[268].rotateAngleY = -0.03490659F;

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 36, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1469
		bodyModel[269].setRotationPoint(54F, -75F, -10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 36, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1470
		bodyModel[270].setRotationPoint(66F, -75F, -10F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 36, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1471
		bodyModel[271].setRotationPoint(54F, -75F, 9F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 36, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1472
		bodyModel[272].setRotationPoint(66F, -75F, 9F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 35, 5, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1473
		bodyModel[273].setRotationPoint(67F, -74F, 5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 35, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 1474
		bodyModel[274].setRotationPoint(67F, -74F, -10F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 35, 5, 0F,5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1475
		bodyModel[275].setRotationPoint(53F, -74F, 5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 35, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 1476
		bodyModel[276].setRotationPoint(53F, -74F, -10F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 11, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1477
		bodyModel[277].setRotationPoint(55F, -51F, 9F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1479
		bodyModel[278].setRotationPoint(48F, -51F, -5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 25, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 721
		bodyModel[279].setRotationPoint(52F, -75F, -3F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 25, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 722
		bodyModel[280].setRotationPoint(50F, -75F, -3F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 25, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 723
		bodyModel[281].setRotationPoint(55F, -75F, -3F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 24, 4, 9, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 724
		bodyModel[282].setRotationPoint(49F, -55F, -4F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 24, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		bodyModel[283].setRotationPoint(49F, -51F, -4F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[284].setRotationPoint(58.25F, -75.5F, -5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 12, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 727
		bodyModel[285].setRotationPoint(59.25F, -74.5F, -4F);

		bodyModel[286].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 728
		bodyModel[286].setRotationPoint(58.25F, -63.5F, -5F);
		bodyModel[286].rotateAngleZ = 0.10471976F;

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		bodyModel[287].setRotationPoint(58.25F, -63.5F, -5F);
		bodyModel[287].rotateAngleZ = 0.10471976F;

		bodyModel[288].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		bodyModel[288].setRotationPoint(58.25F, -63.5F, 4F);
		bodyModel[288].rotateAngleZ = 0.10471976F;

		bodyModel[289].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		bodyModel[289].setRotationPoint(58.25F, -63.5F, -5F);
		bodyModel[289].rotateAngleZ = 0.10471976F;

		bodyModel[290].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 732
		bodyModel[290].setRotationPoint(58.25F, -63.5F, -5F);
		bodyModel[290].rotateAngleZ = 0.10471976F;

		bodyModel[291].addShapeBox(0F, 0F, 0F, 11, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 633
		bodyModel[291].setRotationPoint(55F, -51F, -10F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		bodyModel[292].setRotationPoint(-161F, -52F, -4F);

		bodyModel[293].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 635
		bodyModel[293].setRotationPoint(-169F, -41F, -5F);
		bodyModel[293].rotateAngleZ = -0.10471976F;

		bodyModel[294].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		bodyModel[294].setRotationPoint(-169F, -41F, 4F);
		bodyModel[294].rotateAngleZ = -0.10471976F;

		bodyModel[295].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 637
		bodyModel[295].setRotationPoint(-169F, -41F, -5F);
		bodyModel[295].rotateAngleZ = -0.10471976F;

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 638
		bodyModel[296].setRotationPoint(-160F, -53F, -5F);

		bodyModel[297].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		bodyModel[297].setRotationPoint(-169F, -41F, -5F);
		bodyModel[297].rotateAngleZ = -0.10471976F;

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		bodyModel[298].setRotationPoint(-169F, -41F, -5F);
		bodyModel[298].rotateAngleZ = -0.10471976F;

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		bodyModel[299].setRotationPoint(-165F, -39F, -1F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
		bodyModel[300].setRotationPoint(-146F, -30F, -4F);

		bodyModel[301].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643
		bodyModel[301].setRotationPoint(-154F, -19F, -5F);
		bodyModel[301].rotateAngleZ = -0.10471976F;

		bodyModel[302].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[302].setRotationPoint(-154F, -19F, 4F);
		bodyModel[302].rotateAngleZ = -0.10471976F;

		bodyModel[303].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		bodyModel[303].setRotationPoint(-154F, -19F, -5F);
		bodyModel[303].rotateAngleZ = -0.10471976F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		bodyModel[304].setRotationPoint(-145F, -31F, -5F);

		bodyModel[305].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		bodyModel[305].setRotationPoint(-154F, -19F, -5F);
		bodyModel[305].rotateAngleZ = -0.10471976F;

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
		bodyModel[306].setRotationPoint(-154F, -19F, -5F);
		bodyModel[306].rotateAngleZ = -0.10471976F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 649
		bodyModel[307].setRotationPoint(-150F, -17F, -1F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 305, 968, textureX, textureY); // Box 50
		noseModel[1] = new ModelRendererTurbo(this, 353, 968, textureX, textureY); // Box 51
		noseModel[2] = new ModelRendererTurbo(this, 409, 968, textureX, textureY); // Box 52
		noseModel[3] = new ModelRendererTurbo(this, 457, 968, textureX, textureY); // Box 53
		noseModel[4] = new ModelRendererTurbo(this, 529, 968, textureX, textureY); // Box 54
		noseModel[5] = new ModelRendererTurbo(this, 225, 968, textureX, textureY); // Box 55
		noseModel[6] = new ModelRendererTurbo(this, 161, 968, textureX, textureY); // Box 108
		noseModel[7] = new ModelRendererTurbo(this, 449, 968, textureX, textureY); // Box 109
		noseModel[8] = new ModelRendererTurbo(this, 353, 968, textureX, textureY); // Box 110
		noseModel[9] = new ModelRendererTurbo(this, 1, 968, textureX, textureY); // Box 111
		noseModel[10] = new ModelRendererTurbo(this, 401, 968, textureX, textureY); // Box 112
		noseModel[11] = new ModelRendererTurbo(this, 49, 968, textureX, textureY); // Box 113
		noseModel[12] = new ModelRendererTurbo(this, 105, 968, textureX, textureY); // Box 114
		noseModel[13] = new ModelRendererTurbo(this, 113, 968, textureX, textureY); // Box 115
		noseModel[14] = new ModelRendererTurbo(this, 513, 968, textureX, textureY); // Box 116
		noseModel[15] = new ModelRendererTurbo(this, 521, 968, textureX, textureY); // Box 117
		noseModel[16] = new ModelRendererTurbo(this, 225, 968, textureX, textureY); // Box 118
		noseModel[17] = new ModelRendererTurbo(this, 249, 968, textureX, textureY); // Box 119
		noseModel[18] = new ModelRendererTurbo(this, 305, 968, textureX, textureY); // Box 120
		noseModel[19] = new ModelRendererTurbo(this, 409, 968, textureX, textureY); // Box 121
		noseModel[20] = new ModelRendererTurbo(this, 513, 968, textureX, textureY); // Box 122
		noseModel[21] = new ModelRendererTurbo(this, 569, 968, textureX, textureY); // Box 123
		noseModel[22] = new ModelRendererTurbo(this, 577, 968, textureX, textureY); // Box 124
		noseModel[23] = new ModelRendererTurbo(this, 585, 968, textureX, textureY); // Box 125
		noseModel[24] = new ModelRendererTurbo(this, 633, 968, textureX, textureY); // Box 126
		noseModel[25] = new ModelRendererTurbo(this, 649, 968, textureX, textureY); // Box 127
		noseModel[26] = new ModelRendererTurbo(this, 657, 968, textureX, textureY); // Box 128
		noseModel[27] = new ModelRendererTurbo(this, 673, 968, textureX, textureY); // Box 129
		noseModel[28] = new ModelRendererTurbo(this, 689, 968, textureX, textureY); // Box 130
		noseModel[29] = new ModelRendererTurbo(this, 665, 968, textureX, textureY); // Box 143
		noseModel[30] = new ModelRendererTurbo(this, 689, 968, textureX, textureY); // Box 144
		noseModel[31] = new ModelRendererTurbo(this, 705, 968, textureX, textureY); // Box 145
		noseModel[32] = new ModelRendererTurbo(this, 713, 968, textureX, textureY); // Box 146
		noseModel[33] = new ModelRendererTurbo(this, 745, 968, textureX, textureY); // Box 147
		noseModel[34] = new ModelRendererTurbo(this, 753, 968, textureX, textureY); // Box 148
		noseModel[35] = new ModelRendererTurbo(this, 761, 968, textureX, textureY); // Box 149
		noseModel[36] = new ModelRendererTurbo(this, 777, 968, textureX, textureY); // Box 150
		noseModel[37] = new ModelRendererTurbo(this, 801, 968, textureX, textureY); // Box 151
		noseModel[38] = new ModelRendererTurbo(this, 833, 968, textureX, textureY); // Box 152
		noseModel[39] = new ModelRendererTurbo(this, 305, 996, textureX, textureY); // Box 266
		noseModel[40] = new ModelRendererTurbo(this, 353, 996, textureX, textureY); // Box 267
		noseModel[41] = new ModelRendererTurbo(this, 409, 996, textureX, textureY); // Box 268
		noseModel[42] = new ModelRendererTurbo(this, 457, 996, textureX, textureY); // Box 269
		noseModel[43] = new ModelRendererTurbo(this, 529, 996, textureX, textureY); // Box 270
		noseModel[44] = new ModelRendererTurbo(this, 225, 996, textureX, textureY); // Box 271
		noseModel[45] = new ModelRendererTurbo(this, 161, 996, textureX, textureY); // Box 324
		noseModel[46] = new ModelRendererTurbo(this, 449, 996, textureX, textureY); // Box 325
		noseModel[47] = new ModelRendererTurbo(this, 353, 996, textureX, textureY); // Box 326
		noseModel[48] = new ModelRendererTurbo(this, 1, 996, textureX, textureY); // Box 327
		noseModel[49] = new ModelRendererTurbo(this, 401, 996, textureX, textureY); // Box 328
		noseModel[50] = new ModelRendererTurbo(this, 49, 996, textureX, textureY); // Box 329
		noseModel[51] = new ModelRendererTurbo(this, 105, 996, textureX, textureY); // Box 330
		noseModel[52] = new ModelRendererTurbo(this, 113, 996, textureX, textureY); // Box 331
		noseModel[53] = new ModelRendererTurbo(this, 513, 996, textureX, textureY); // Box 332
		noseModel[54] = new ModelRendererTurbo(this, 521, 996, textureX, textureY); // Box 333
		noseModel[55] = new ModelRendererTurbo(this, 225, 996, textureX, textureY); // Box 334
		noseModel[56] = new ModelRendererTurbo(this, 249, 996, textureX, textureY); // Box 335
		noseModel[57] = new ModelRendererTurbo(this, 305, 996, textureX, textureY); // Box 336
		noseModel[58] = new ModelRendererTurbo(this, 409, 996, textureX, textureY); // Box 337
		noseModel[59] = new ModelRendererTurbo(this, 513, 996, textureX, textureY); // Box 338
		noseModel[60] = new ModelRendererTurbo(this, 569, 996, textureX, textureY); // Box 339
		noseModel[61] = new ModelRendererTurbo(this, 577, 996, textureX, textureY); // Box 340
		noseModel[62] = new ModelRendererTurbo(this, 585, 996, textureX, textureY); // Box 341
		noseModel[63] = new ModelRendererTurbo(this, 633, 996, textureX, textureY); // Box 342
		noseModel[64] = new ModelRendererTurbo(this, 649, 996, textureX, textureY); // Box 343
		noseModel[65] = new ModelRendererTurbo(this, 657, 996, textureX, textureY); // Box 344
		noseModel[66] = new ModelRendererTurbo(this, 673, 996, textureX, textureY); // Box 345
		noseModel[67] = new ModelRendererTurbo(this, 689, 996, textureX, textureY); // Box 346
		noseModel[68] = new ModelRendererTurbo(this, 665, 996, textureX, textureY); // Box 359
		noseModel[69] = new ModelRendererTurbo(this, 689, 996, textureX, textureY); // Box 360
		noseModel[70] = new ModelRendererTurbo(this, 705, 996, textureX, textureY); // Box 361
		noseModel[71] = new ModelRendererTurbo(this, 713, 996, textureX, textureY); // Box 362
		noseModel[72] = new ModelRendererTurbo(this, 745, 996, textureX, textureY); // Box 363
		noseModel[73] = new ModelRendererTurbo(this, 753, 996, textureX, textureY); // Box 364
		noseModel[74] = new ModelRendererTurbo(this, 761, 996, textureX, textureY); // Box 365
		noseModel[75] = new ModelRendererTurbo(this, 777, 996, textureX, textureY); // Box 366
		noseModel[76] = new ModelRendererTurbo(this, 801, 996, textureX, textureY); // Box 367
		noseModel[77] = new ModelRendererTurbo(this, 833, 996, textureX, textureY); // Box 368
		noseModel[78] = new ModelRendererTurbo(this, 873, 968, textureX, textureY); // Box 466
		noseModel[79] = new ModelRendererTurbo(this, 889, 968, textureX, textureY); // Box 467
		noseModel[80] = new ModelRendererTurbo(this, 857, 996, textureX, textureY); // Box 468
		noseModel[81] = new ModelRendererTurbo(this, 873, 996, textureX, textureY); // Box 469
		noseModel[82] = new ModelRendererTurbo(this, 857, 968, textureX, textureY); // Box 650
		noseModel[83] = new ModelRendererTurbo(this, 1549, 81, textureX, textureY); // Box 1405
		noseModel[84] = new ModelRendererTurbo(this, 481, 112, textureX, textureY); // Box 1406
		noseModel[85] = new ModelRendererTurbo(this, 1616, 81, textureX, textureY); // Box 1407
		noseModel[86] = new ModelRendererTurbo(this, 505, 112, textureX, textureY); // Box 1408
		noseModel[87] = new ModelRendererTurbo(this, 1341, 137, textureX, textureY); // Box 1409
		noseModel[88] = new ModelRendererTurbo(this, 417, 112, textureX, textureY); // Box 1410
		noseModel[89] = new ModelRendererTurbo(this, 488, 167, textureX, textureY); // Box 1411
		noseModel[90] = new ModelRendererTurbo(this, 209, 112, textureX, textureY); // Box 1412
		noseModel[91] = new ModelRendererTurbo(this, 529, 112, textureX, textureY); // Box 1413
		noseModel[92] = new ModelRendererTurbo(this, 545, 112, textureX, textureY); // Box 1414
		noseModel[93] = new ModelRendererTurbo(this, 257, 112, textureX, textureY); // Box 1415
		noseModel[94] = new ModelRendererTurbo(this, 481, 112, textureX, textureY); // Box 1416
		noseModel[95] = new ModelRendererTurbo(this, 155, 144, textureX, textureY); // Box 1417
		noseModel[96] = new ModelRendererTurbo(this, 1785, 112, textureX, textureY); // Box 1418
		noseModel[97] = new ModelRendererTurbo(this, 457, 112, textureX, textureY); // Box 1419
		noseModel[98] = new ModelRendererTurbo(this, 577, 112, textureX, textureY); // Box 1420
		noseModel[99] = new ModelRendererTurbo(this, 609, 112, textureX, textureY); // Box 1421
		noseModel[100] = new ModelRendererTurbo(this, 697, 112, textureX, textureY); // Box 1423
		noseModel[101] = new ModelRendererTurbo(this, 753, 112, textureX, textureY); // Box 1424
		noseModel[102] = new ModelRendererTurbo(this, 1561, 112, textureX, textureY); // Box 1426
		noseModel[103] = new ModelRendererTurbo(this, 1616, 129, textureX, textureY); // Box 1427
		noseModel[104] = new ModelRendererTurbo(this, 194, 153, textureX, textureY); // Box 1428
		noseModel[105] = new ModelRendererTurbo(this, 1073, 112, textureX, textureY); // Box 1429
		noseModel[106] = new ModelRendererTurbo(this, 702, 92, textureX, textureY); // Box 1430
		noseModel[107] = new ModelRendererTurbo(this, 1089, 112, textureX, textureY); // Box 1431
		noseModel[108] = new ModelRendererTurbo(this, 1137, 112, textureX, textureY); // Box 1432
		noseModel[109] = new ModelRendererTurbo(this, 1153, 112, textureX, textureY); // Box 1433
		noseModel[110] = new ModelRendererTurbo(this, 737, 112, textureX, textureY); // Box 1434
		noseModel[111] = new ModelRendererTurbo(this, 1272, 147, textureX, textureY); // Box 1435

		noseModel[0].addShapeBox(0F, 0F, 0F, 17, 7, 6, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 50
		noseModel[0].setRotationPoint(-173F, -45F, -17F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 17, 6, 10, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 51
		noseModel[1].setRotationPoint(-173F, -38F, -17F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 17, 17, 5, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 52
		noseModel[2].setRotationPoint(-173F, -62F, -17F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 17, 5, 16, 0F,0F, -1F, -9F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		noseModel[3].setRotationPoint(-173F, -67F, -16F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 13, 0F,0F, -1F, -9F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		noseModel[4].setRotationPoint(-185F, -66F, -13F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,-1F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		noseModel[5].setRotationPoint(-192F, -65F, -7F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 108
		noseModel[6].setRotationPoint(-181F, -56F, -13F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 109
		noseModel[7].setRotationPoint(-180F, -46F, -13F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		noseModel[8].setRotationPoint(-181F, -59F, -11F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		noseModel[9].setRotationPoint(-181F, -62F, -11F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, -1F, 0F, 1F); // Box 112
		noseModel[10].setRotationPoint(-181F, -51F, -11F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 113
		noseModel[11].setRotationPoint(-186F, -46F, -10F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 114
		noseModel[12].setRotationPoint(-185F, -49F, -5F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 115
		noseModel[13].setRotationPoint(-188F, -52F, -5F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		noseModel[14].setRotationPoint(-192F, -53F, -5F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 2F); // Box 117
		noseModel[15].setRotationPoint(-190F, -56F, -10F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		noseModel[16].setRotationPoint(-190F, -56F, -8F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 3F, -1F, 0F, 3F); // Box 119
		noseModel[17].setRotationPoint(-190F, -53F, -8F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		noseModel[18].setRotationPoint(-190F, -59F, -8F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-2F, 0F, -2.7F, 2F, 0F, -2.2F, 2F, 0F, 2.2F, -2F, 0F, 2.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		noseModel[19].setRotationPoint(-190F, -62F, -8F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		noseModel[20].setRotationPoint(-192F, -55F, -1F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		noseModel[21].setRotationPoint(-194F, -58F, -1F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		noseModel[22].setRotationPoint(-194F, -62F, -1F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		noseModel[23].setRotationPoint(-194F, -56F, -3F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 126
		noseModel[24].setRotationPoint(-194F, -56F, -8F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 127
		noseModel[25].setRotationPoint(-186F, -45F, -5F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 128
		noseModel[26].setRotationPoint(-180F, -38F, -5F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,-7F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -3F, 6F, 0F, -4F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 129
		noseModel[27].setRotationPoint(-180F, -38F, -11F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 3F, -2F, 0F, 3F); // Box 130
		noseModel[28].setRotationPoint(-180F, -45F, -10F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1.4F, 0F, 0F, 0.8F, 0F, 0F, -0.8F, 0F, 0F, 1.3F, 0F, 0F, -1.4F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F); // Box 143
		noseModel[29].setRotationPoint(-160F, -28F, -15F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-4F, 0F, -1.4F, 4F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1.4F, 4F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		noseModel[30].setRotationPoint(-164F, -28F, -15F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		noseModel[31].setRotationPoint(-164F, -28F, -5F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 146
		noseModel[32].setRotationPoint(-161F, -18F, -7F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 147
		noseModel[33].setRotationPoint(-164F, -27F, -5F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 148
		noseModel[34].setRotationPoint(-161F, -23F, -10F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 3.4F, 0F, 0F, -3.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.6F, 0F, 0F, -2.6F, 0F, 0F, 0F); // Box 149
		noseModel[35].setRotationPoint(-161F, -23F, -10F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -3F, 0F, -5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F); // Box 150
		noseModel[36].setRotationPoint(-173F, -28F, -5F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F); // Box 151
		noseModel[37].setRotationPoint(-177F, -28F, -4F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 152
		noseModel[38].setRotationPoint(-177F, -28F, -1F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 17, 7, 6, 0F,0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 266
		noseModel[39].setRotationPoint(-173F, -45F, 11F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 17, 6, 10, 0F,0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 267
		noseModel[40].setRotationPoint(-173F, -38F, 7F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 17, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 268
		noseModel[41].setRotationPoint(-173F, -62F, 12F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 17, 5, 16, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 269
		noseModel[42].setRotationPoint(-173F, -67F, 0F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 12, 4, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 270
		noseModel[43].setRotationPoint(-185F, -66F, 0F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,-1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 271
		noseModel[44].setRotationPoint(-192F, -65F, 0F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 324
		noseModel[45].setRotationPoint(-181F, -56F, 12F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 325
		noseModel[46].setRotationPoint(-180F, -46F, 12F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		noseModel[47].setRotationPoint(-181F, -59F, 10F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		noseModel[48].setRotationPoint(-181F, -62F, 10F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, -1F); // Box 328
		noseModel[49].setRotationPoint(-181F, -51F, 10F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 329
		noseModel[50].setRotationPoint(-186F, -46F, 9F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 330
		noseModel[51].setRotationPoint(-185F, -49F, 4F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 331
		noseModel[52].setRotationPoint(-188F, -52F, 4F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		noseModel[53].setRotationPoint(-192F, -53F, 0F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F); // Box 333
		noseModel[54].setRotationPoint(-190F, -56F, 9F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		noseModel[55].setRotationPoint(-190F, -56F, 7F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -3F, -1F, 0F, -3F); // Box 335
		noseModel[56].setRotationPoint(-190F, -53F, 7F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		noseModel[57].setRotationPoint(-190F, -59F, 7F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-2F, 0F, 2.7F, 2F, 0F, 2.2F, 2F, 0F, -2.2F, -2F, 0F, -2.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		noseModel[58].setRotationPoint(-190F, -62F, 7F);

		noseModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		noseModel[59].setRotationPoint(-192F, -55F, 0F);

		noseModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		noseModel[60].setRotationPoint(-194F, -58F, 0F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		noseModel[61].setRotationPoint(-194F, -62F, 0F);

		noseModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		noseModel[62].setRotationPoint(-194F, -56F, 1F);

		noseModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 342
		noseModel[63].setRotationPoint(-194F, -56F, 7F);

		noseModel[64].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 343
		noseModel[64].setRotationPoint(-186F, -45F, 4F);

		noseModel[65].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 344
		noseModel[65].setRotationPoint(-180F, -38F, 0F);

		noseModel[66].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 1F, -3F, 0F, 0F, 3F, 0F, 0F, 6F, 0F, -4F, -7F, 0F, -3F); // Box 345
		noseModel[66].setRotationPoint(-180F, -38F, 5F);

		noseModel[67].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, -3F, -2F, 0F, -3F); // Box 346
		noseModel[67].setRotationPoint(-180F, -45F, 9F);

		noseModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 1.3F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, 0F, -1.4F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.4F); // Box 359
		noseModel[68].setRotationPoint(-160F, -28F, 14F);

		noseModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1.6F, -4F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1.6F, -4F, 0F, -1.4F); // Box 360
		noseModel[69].setRotationPoint(-164F, -28F, 5F);

		noseModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		noseModel[70].setRotationPoint(-164F, -28F, 0F);

		noseModel[71].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -2F); // Box 362
		noseModel[71].setRotationPoint(-161F, -18F, 0F);

		noseModel[72].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 363
		noseModel[72].setRotationPoint(-164F, -27F, 4F);

		noseModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		noseModel[73].setRotationPoint(-161F, -23F, 5F);

		noseModel[74].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -3.4F, 0F, 0F, 3.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.6F, 0F, 0F, 2.6F, 0F, 0F, 0F); // Box 365
		noseModel[74].setRotationPoint(-161F, -23F, 9F);

		noseModel[75].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 3F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 3F); // Box 366
		noseModel[75].setRotationPoint(-173F, -28F, 4F);

		noseModel[76].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F); // Box 367
		noseModel[76].setRotationPoint(-177F, -28F, 3F);

		noseModel[77].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 368
		noseModel[77].setRotationPoint(-177F, -28F, 0F);

		noseModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 466
		noseModel[78].setRotationPoint(-177F, -33F, -5F);

		noseModel[79].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F,0F, 0F, 1F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		noseModel[79].setRotationPoint(-173F, -33F, -7F);

		noseModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F); // Box 468
		noseModel[80].setRotationPoint(-177F, -33F, 0F);

		noseModel[81].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F); // Box 469
		noseModel[81].setRotationPoint(-173F, -33F, 0F);

		noseModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 650
		noseModel[82].setRotationPoint(-163F, -23F, -4F);

		noseModel[83].addShapeBox(0F, 0F, 0F, 3, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1405
		noseModel[83].setRotationPoint(-174F, -42F, -3F);

		noseModel[84].addShapeBox(0F, 0F, 0F, 2, 9, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1406
		noseModel[84].setRotationPoint(-176F, -42F, -3F);

		noseModel[85].addShapeBox(0F, 0F, 0F, 2, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 1407
		noseModel[85].setRotationPoint(-171F, -42F, -3F);

		noseModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1408
		noseModel[86].setRotationPoint(-180F, -42F, -1F);

		noseModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1409
		noseModel[87].setRotationPoint(-181F, -43F, -4F);

		noseModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1410
		noseModel[88].setRotationPoint(-181F, -44F, -4F);

		noseModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1411
		noseModel[89].setRotationPoint(-181F, -45F, -4F);

		noseModel[90].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1412
		noseModel[90].setRotationPoint(-181F, -46F, -2F);

		noseModel[91].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1413
		noseModel[91].setRotationPoint(-181F, -46F, -1F);

		noseModel[92].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1414
		noseModel[92].setRotationPoint(-181F, -46F, -3F);

		noseModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1415
		noseModel[93].setRotationPoint(-181F, -47F, -2F);

		noseModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1416
		noseModel[94].setRotationPoint(-179F, -46F, 1F);

		noseModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1417
		noseModel[95].setRotationPoint(-180F, -44F, 3F);

		noseModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 1418
		noseModel[96].setRotationPoint(-177F, -42F, 1F);

		noseModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1419
		noseModel[97].setRotationPoint(-177F, -42F, 4F);

		noseModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1420
		noseModel[98].setRotationPoint(-179F, -44F, -5F);

		noseModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1421
		noseModel[99].setRotationPoint(-178F, -44F, -3F);

		noseModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1423
		noseModel[100].setRotationPoint(-187F, -60F, -3F);

		noseModel[101].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1424
		noseModel[101].setRotationPoint(-187F, -62F, -3F);

		noseModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1426
		noseModel[102].setRotationPoint(-187F, -60F, 2F);

		noseModel[103].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1427
		noseModel[103].setRotationPoint(-187F, -62F, 2F);

		noseModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 1428
		noseModel[104].setRotationPoint(-186F, -59F, -3F);

		noseModel[105].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1429
		noseModel[105].setRotationPoint(-186F, -59F, -3F);

		noseModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1430
		noseModel[106].setRotationPoint(-187F, -56F, -3F);

		noseModel[107].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1431
		noseModel[107].setRotationPoint(-186F, -59F, 2F);

		noseModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 1432
		noseModel[108].setRotationPoint(-186.75F, -57F, -1F);

		noseModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1433
		noseModel[109].setRotationPoint(-186.75F, -57F, 0F);

		noseModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 1434
		noseModel[110].setRotationPoint(-186.75F, -57F, -1F);

		noseModel[111].addShapeBox(0F, 0F, -1.5F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.75F, -0.2F, -0.4F, -0.75F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 1435
		noseModel[111].setRotationPoint(-186.75F, -57F, 0.55F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 720, textureX, textureY); // Box 25
		tailModel[1] = new ModelRendererTurbo(this, 129, 720, textureX, textureY); // Box 26
		tailModel[2] = new ModelRendererTurbo(this, 257, 720, textureX, textureY); // Box 27
		tailModel[3] = new ModelRendererTurbo(this, 361, 720, textureX, textureY); // Box 36
		tailModel[4] = new ModelRendererTurbo(this, 497, 720, textureX, textureY); // Box 37
		tailModel[5] = new ModelRendererTurbo(this, 633, 720, textureX, textureY); // Box 41
		tailModel[6] = new ModelRendererTurbo(this, 737, 720, textureX, textureY); // Box 42
		tailModel[7] = new ModelRendererTurbo(this, 841, 720, textureX, textureY); // Box 43
		tailModel[8] = new ModelRendererTurbo(this, 945, 720, textureX, textureY); // Box 44
		tailModel[9] = new ModelRendererTurbo(this, 1049, 720, textureX, textureY); // Box 45
		tailModel[10] = new ModelRendererTurbo(this, 1145, 720, textureX, textureY); // Box 46
		tailModel[11] = new ModelRendererTurbo(this, 1233, 720, textureX, textureY); // Box 47
		tailModel[12] = new ModelRendererTurbo(this, 1321, 720, textureX, textureY); // Box 48
		tailModel[13] = new ModelRendererTurbo(this, 1409, 720, textureX, textureY); // Box 49
		tailModel[14] = new ModelRendererTurbo(this, 1, 600, textureX, textureY); // Box 153
		tailModel[15] = new ModelRendererTurbo(this, 57, 600, textureX, textureY); // Box 154
		tailModel[16] = new ModelRendererTurbo(this, 249, 600, textureX, textureY); // Box 155
		tailModel[17] = new ModelRendererTurbo(this, 201, 600, textureX, textureY); // Box 156
		tailModel[18] = new ModelRendererTurbo(this, 369, 600, textureX, textureY); // Box 158
		tailModel[19] = new ModelRendererTurbo(this, 513, 600, textureX, textureY); // Box 160
		tailModel[20] = new ModelRendererTurbo(this, 577, 600, textureX, textureY); // Box 161
		tailModel[21] = new ModelRendererTurbo(this, 633, 600, textureX, textureY); // Box 162
		tailModel[22] = new ModelRendererTurbo(this, 265, 600, textureX, textureY); // Box 164
		tailModel[23] = new ModelRendererTurbo(this, 745, 600, textureX, textureY); // Box 165
		tailModel[24] = new ModelRendererTurbo(this, 1, 522, textureX, textureY); // Box 188
		tailModel[25] = new ModelRendererTurbo(this, 97, 522, textureX, textureY); // Box 189
		tailModel[26] = new ModelRendererTurbo(this, 529, 522, textureX, textureY); // Box 200
		tailModel[27] = new ModelRendererTurbo(this, 601, 522, textureX, textureY); // Box 201
		tailModel[28] = new ModelRendererTurbo(this, 657, 522, textureX, textureY); // Box 202
		tailModel[29] = new ModelRendererTurbo(this, 689, 522, textureX, textureY); // Box 203
		tailModel[30] = new ModelRendererTurbo(this, 745, 522, textureX, textureY); // Box 204
		tailModel[31] = new ModelRendererTurbo(this, 793, 522, textureX, textureY); // Box 205
		tailModel[32] = new ModelRendererTurbo(this, 1, 756, textureX, textureY); // Box 241
		tailModel[33] = new ModelRendererTurbo(this, 129, 756, textureX, textureY); // Box 242
		tailModel[34] = new ModelRendererTurbo(this, 257, 756, textureX, textureY); // Box 243
		tailModel[35] = new ModelRendererTurbo(this, 361, 756, textureX, textureY); // Box 252
		tailModel[36] = new ModelRendererTurbo(this, 497, 756, textureX, textureY); // Box 253
		tailModel[37] = new ModelRendererTurbo(this, 633, 756, textureX, textureY); // Box 257
		tailModel[38] = new ModelRendererTurbo(this, 737, 756, textureX, textureY); // Box 258
		tailModel[39] = new ModelRendererTurbo(this, 841, 756, textureX, textureY); // Box 259
		tailModel[40] = new ModelRendererTurbo(this, 945, 756, textureX, textureY); // Box 260
		tailModel[41] = new ModelRendererTurbo(this, 1049, 756, textureX, textureY); // Box 261
		tailModel[42] = new ModelRendererTurbo(this, 1145, 756, textureX, textureY); // Box 262
		tailModel[43] = new ModelRendererTurbo(this, 1233, 756, textureX, textureY); // Box 263
		tailModel[44] = new ModelRendererTurbo(this, 1321, 756, textureX, textureY); // Box 264
		tailModel[45] = new ModelRendererTurbo(this, 1409, 756, textureX, textureY); // Box 265
		tailModel[46] = new ModelRendererTurbo(this, 1, 660, textureX, textureY); // Box 369
		tailModel[47] = new ModelRendererTurbo(this, 57, 660, textureX, textureY); // Box 370
		tailModel[48] = new ModelRendererTurbo(this, 249, 660, textureX, textureY); // Box 371
		tailModel[49] = new ModelRendererTurbo(this, 201, 660, textureX, textureY); // Box 372
		tailModel[50] = new ModelRendererTurbo(this, 369, 660, textureX, textureY); // Box 374
		tailModel[51] = new ModelRendererTurbo(this, 513, 660, textureX, textureY); // Box 376
		tailModel[52] = new ModelRendererTurbo(this, 577, 660, textureX, textureY); // Box 377
		tailModel[53] = new ModelRendererTurbo(this, 633, 660, textureX, textureY); // Box 378
		tailModel[54] = new ModelRendererTurbo(this, 265, 660, textureX, textureY); // Box 380
		tailModel[55] = new ModelRendererTurbo(this, 745, 660, textureX, textureY); // Box 381
		tailModel[56] = new ModelRendererTurbo(this, 1, 561, textureX, textureY); // Box 404
		tailModel[57] = new ModelRendererTurbo(this, 97, 561, textureX, textureY); // Box 405
		tailModel[58] = new ModelRendererTurbo(this, 529, 561, textureX, textureY); // Box 416
		tailModel[59] = new ModelRendererTurbo(this, 601, 561, textureX, textureY); // Box 417
		tailModel[60] = new ModelRendererTurbo(this, 657, 561, textureX, textureY); // Box 418
		tailModel[61] = new ModelRendererTurbo(this, 689, 561, textureX, textureY); // Box 419
		tailModel[62] = new ModelRendererTurbo(this, 745, 561, textureX, textureY); // Box 420
		tailModel[63] = new ModelRendererTurbo(this, 793, 561, textureX, textureY); // Box 421
		tailModel[64] = new ModelRendererTurbo(this, 648, 40, textureX, textureY); // Box 433
		tailModel[65] = new ModelRendererTurbo(this, 738, 165, textureX, textureY); // Box 434
		tailModel[66] = new ModelRendererTurbo(this, 305, 112, textureX, textureY); // Box 435
		tailModel[67] = new ModelRendererTurbo(this, 770, 150, textureX, textureY); // Box 436
		tailModel[68] = new ModelRendererTurbo(this, 743, 85, textureX, textureY); // Box 437
		tailModel[69] = new ModelRendererTurbo(this, 0, 102, textureX, textureY); // Box 438
		tailModel[70] = new ModelRendererTurbo(this, 769, 112, textureX, textureY); // Box 439
		tailModel[71] = new ModelRendererTurbo(this, 809, 112, textureX, textureY); // Box 440

		tailModel[0].addShapeBox(0F, 0F, 0F, 43, 12, 19, 0F,0F, 0F, -2F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		tailModel[0].setRotationPoint(90F, -74F, -19F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 43, 16, 19, 0F,0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -8F, -2F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 26
		tailModel[1].setRotationPoint(90F, -62F, -19F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 43, 2, 17, 0F,0F, 0F, -7F, 0F, -2F, -9F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 27
		tailModel[2].setRotationPoint(90F, -76F, -17F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 43, 4, 21, 0F,0F, 0F, 0F, 0F, 8F, -4F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -4F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 36
		tailModel[3].setRotationPoint(90F, -46F, -21F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 43, 5, 21, 0F,0F, 0F, 0F, 0F, 9F, -4F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -11F, -10F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 37
		tailModel[4].setRotationPoint(90F, -42F, -21F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 32, 9, 17, 0F,0F, 0F, -2F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 41
		tailModel[5].setRotationPoint(133F, -71F, -17F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 32, 8, 17, 0F,0F, 0F, 0F, 0F, 2F, -6F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -6F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 42
		tailModel[6].setRotationPoint(133F, -62F, -17F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 32, 3, 17, 0F,0F, 0F, 0F, 0F, 7F, -6F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -6F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 43
		tailModel[7].setRotationPoint(133F, -54F, -17F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 32, 3, 17, 0F,0F, 0F, 0F, 0F, 7F, -6F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -8F, -11F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 44
		tailModel[8].setRotationPoint(133F, -51F, -17F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 32, 3, 15, 0F,0F, 0F, -7F, 0F, -2F, -10F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 45
		tailModel[9].setRotationPoint(133F, -74F, -15F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 32, 6, 11, 0F,0F, 0F, 0F, 0F, 2F, -9F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -9F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 46
		tailModel[10].setRotationPoint(165F, -64F, -11F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 32, 5, 11, 0F,0F, 0F, -1F, 0F, -2F, -9F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -9F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 47
		tailModel[11].setRotationPoint(165F, -69F, -11F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 32, 3, 10, 0F,0F, 0F, -5F, 0F, -4F, -9F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -8F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 48
		tailModel[12].setRotationPoint(165F, -72F, -10F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 32, 2, 11, 0F,0F, 0F, 0F, 0F, 7F, -9F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -8F, -10F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 49
		tailModel[13].setRotationPoint(165F, -58F, -11F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 42, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		tailModel[14].setRotationPoint(127F, -69F, -16F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 42, 6, 53, 0F,-19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		tailModel[15].setRotationPoint(127F, -69F, -69F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 30, 6, 53, 0F,-24F, -2F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, -2F, 0F, -24F, -2F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, -2F, 0F); // Box 155
		tailModel[16].setRotationPoint(116F, -69F, -69F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 23, 6, 13, 0F,-5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		tailModel[17].setRotationPoint(146F, -69F, -82F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 18, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, -3F, 0F, 0F, 0F, 0F); // Box 158
		tailModel[18].setRotationPoint(169F, -69F, -16F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 18, 3, 10, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 160
		tailModel[19].setRotationPoint(151F, -68F, -92F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 11, 6, 13, 0F,-6F, -1.5F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, -6F, -2.5F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, 0F, -2F, 0F); // Box 161
		tailModel[20].setRotationPoint(140F, -69F, -82F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F,-9F, -1F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -0.5F, 0F, -9F, -1F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -0.5F, 0F); // Box 162
		tailModel[21].setRotationPoint(146F, -68F, -92F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 13, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 164
		tailModel[22].setRotationPoint(169F, -69F, -13F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 19, 6, 6, 0F,0F, 0F, 0F, -6F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 165
		tailModel[23].setRotationPoint(169F, -69F, -10F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 40, 32, 4, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		tailModel[24].setRotationPoint(118F, -104F, -4F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 26, 32, 4, 0F,-25F, 0F, -3F, 9F, 0F, 0F, 9F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		tailModel[25].setRotationPoint(92F, -104F, -4F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 31, 22, 4, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		tailModel[26].setRotationPoint(127F, -126F, -4F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 20, 12, 4, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		tailModel[27].setRotationPoint(138F, -138F, -4F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 11, 4, 4, 0F,-4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		tailModel[28].setRotationPoint(147F, -142F, -4F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 21, 22, 4, 0F,-14F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, -3F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 203
		tailModel[29].setRotationPoint(117F, -126F, -4F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 16, 12, 4, 0F,-10F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -3F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 204
		tailModel[30].setRotationPoint(131F, -138F, -4F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,-4F, -2F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 205
		tailModel[31].setRotationPoint(141F, -142F, -4F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 43, 12, 19, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F); // Box 241
		tailModel[32].setRotationPoint(90F, -74F, 0F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 43, 16, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -2F, 0F, 0F, 2F); // Box 242
		tailModel[33].setRotationPoint(90F, -62F, 0F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 43, 2, 17, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -9F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, 0F); // Box 243
		tailModel[34].setRotationPoint(90F, -76F, 0F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 43, 4, 21, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -4F, 0F, 0F, 0F); // Box 252
		tailModel[35].setRotationPoint(90F, -46F, 0F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 43, 5, 21, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -10F, 0F, 0F, -6F); // Box 253
		tailModel[36].setRotationPoint(90F, -42F, 0F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 32, 9, 17, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, 0F); // Box 257
		tailModel[37].setRotationPoint(133F, -71F, 0F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 32, 8, 17, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -6F, 0F, 0F, 0F); // Box 258
		tailModel[38].setRotationPoint(133F, -62F, 0F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 32, 3, 17, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -6F, 0F, 0F, 0F); // Box 259
		tailModel[39].setRotationPoint(133F, -54F, 0F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 32, 3, 17, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -11F, 0F, 0F, -6F); // Box 260
		tailModel[40].setRotationPoint(133F, -51F, 0F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 32, 3, 15, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -10F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -5F, 0F, 0F, 0F); // Box 261
		tailModel[41].setRotationPoint(133F, -74F, 0F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 32, 6, 11, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -9F, 0F, 0F, 0F); // Box 262
		tailModel[42].setRotationPoint(165F, -64F, 0F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 32, 5, 11, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -9F, 0F, 0F, 0F); // Box 263
		tailModel[43].setRotationPoint(165F, -69F, 0F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 32, 3, 10, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -9F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -8F, 0F, 0F, 0F); // Box 264
		tailModel[44].setRotationPoint(165F, -72F, 0F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 32, 2, 11, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -10F, 0F, 0F, -5F); // Box 265
		tailModel[45].setRotationPoint(165F, -58F, 0F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 42, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		tailModel[46].setRotationPoint(127F, -69F, 4F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 42, 6, 53, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F); // Box 370
		tailModel[47].setRotationPoint(127F, -69F, 16F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 30, 6, 53, 0F,0F, -2F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, -24F, -2F, 0F, 0F, -2F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, -24F, -2F, 0F); // Box 371
		tailModel[48].setRotationPoint(116F, -69F, 16F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 23, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -2F, 0F); // Box 372
		tailModel[49].setRotationPoint(146F, -69F, 69F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 18, 6, 3, 0F,0F, 0F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 374
		tailModel[50].setRotationPoint(169F, -69F, 13F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 18, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 376
		tailModel[51].setRotationPoint(151F, -68F, 82F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 11, 6, 13, 0F,0F, -2F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, -6F, -1.5F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, -6F, -2.5F, 0F); // Box 377
		tailModel[52].setRotationPoint(140F, -69F, 69F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F,0F, -0.5F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, -1F, 0F, 0F, -0.5F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, -1F, 0F); // Box 378
		tailModel[53].setRotationPoint(146F, -68F, 82F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 13, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 380
		tailModel[54].setRotationPoint(169F, -69F, 10F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 19, 6, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -3F, 0F, 0F, 0F, 0F); // Box 381
		tailModel[55].setRotationPoint(169F, -69F, 4F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 40, 32, 4, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		tailModel[56].setRotationPoint(118F, -104F, 0F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 26, 32, 4, 0F,-25F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, -25F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 405
		tailModel[57].setRotationPoint(92F, -104F, 0F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 31, 22, 4, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		tailModel[58].setRotationPoint(127F, -126F, 0F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 20, 12, 4, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		tailModel[59].setRotationPoint(138F, -138F, 0F);

		tailModel[60].addShapeBox(0F, 0F, 0F, 11, 4, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		tailModel[60].setRotationPoint(147F, -142F, 0F);

		tailModel[61].addShapeBox(0F, 0F, 0F, 21, 22, 4, 0F,-14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -3F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, -3F); // Box 419
		tailModel[61].setRotationPoint(117F, -126F, 0F);

		tailModel[62].addShapeBox(0F, 0F, 0F, 16, 12, 4, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -3F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -3F); // Box 420
		tailModel[62].setRotationPoint(131F, -138F, 0F);

		tailModel[63].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,-4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, -2F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -3F); // Box 421
		tailModel[63].setRotationPoint(141F, -142F, 0F);

		tailModel[64].addShapeBox(0F, 0F, 0F, 16, 7, 4, 0F,0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 433
		tailModel[64].setRotationPoint(106F, -46F, -2F);

		tailModel[65].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 434
		tailModel[65].setRotationPoint(114F, -39F, -2F);

		tailModel[66].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		tailModel[66].setRotationPoint(120F, -37F, -3F);

		tailModel[67].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 436
		tailModel[67].setRotationPoint(120F, -37F, -3F);

		tailModel[68].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-4F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 437
		tailModel[68].setRotationPoint(120F, -37F, 2F);

		tailModel[69].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		tailModel[69].setRotationPoint(123F, -35F, -2F);

		tailModel[70].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		tailModel[70].setRotationPoint(123F, -39F, -2F);

		tailModel[71].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 440
		tailModel[71].setRotationPoint(123F, -31F, -2F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 224, textureX, textureY); // Box 58
		leftWingModel[1] = new ModelRendererTurbo(this, 73, 224, textureX, textureY); // Box 59
		leftWingModel[2] = new ModelRendererTurbo(this, 145, 224, textureX, textureY); // Box 60
		leftWingModel[3] = new ModelRendererTurbo(this, 209, 224, textureX, textureY); // Box 61
		leftWingModel[4] = new ModelRendererTurbo(this, 281, 224, textureX, textureY); // Box 62
		leftWingModel[5] = new ModelRendererTurbo(this, 289, 224, textureX, textureY); // Box 63
		leftWingModel[6] = new ModelRendererTurbo(this, 441, 224, textureX, textureY); // Box 64
		leftWingModel[7] = new ModelRendererTurbo(this, 593, 224, textureX, textureY); // Box 65
		leftWingModel[8] = new ModelRendererTurbo(this, 737, 224, textureX, textureY); // Box 66
		leftWingModel[9] = new ModelRendererTurbo(this, 865, 224, textureX, textureY); // Box 67
		leftWingModel[10] = new ModelRendererTurbo(this, 393, 224, textureX, textureY); // Box 58
		leftWingModel[11] = new ModelRendererTurbo(this, 945, 224, textureX, textureY); // Box 59
		leftWingModel[12] = new ModelRendererTurbo(this, 545, 224, textureX, textureY); // Box 61
		leftWingModel[13] = new ModelRendererTurbo(this, 1057, 224, textureX, textureY); // Box 62
		leftWingModel[14] = new ModelRendererTurbo(this, 689, 224, textureX, textureY); // Box 63
		leftWingModel[15] = new ModelRendererTurbo(this, 817, 224, textureX, textureY); // Box 64
		leftWingModel[16] = new ModelRendererTurbo(this, 1153, 224, textureX, textureY); // Box 65
		leftWingModel[17] = new ModelRendererTurbo(this, 1297, 224, textureX, textureY); // Box 66
		leftWingModel[18] = new ModelRendererTurbo(this, 1401, 224, textureX, textureY); // Box 67
		leftWingModel[19] = new ModelRendererTurbo(this, 1489, 224, textureX, textureY); // Box 68
		leftWingModel[20] = new ModelRendererTurbo(this, 1617, 224, textureX, textureY); // Box 69
		leftWingModel[21] = new ModelRendererTurbo(this, 393, 224, textureX, textureY); // Box 70
		leftWingModel[22] = new ModelRendererTurbo(this, 457, 224, textureX, textureY); // Box 71
		leftWingModel[23] = new ModelRendererTurbo(this, 545, 224, textureX, textureY); // Box 72
		leftWingModel[24] = new ModelRendererTurbo(this, 601, 224, textureX, textureY); // Box 73
		leftWingModel[25] = new ModelRendererTurbo(this, 817, 224, textureX, textureY); // Box 74
		leftWingModel[26] = new ModelRendererTurbo(this, 689, 224, textureX, textureY); // Box 75
		leftWingModel[27] = new ModelRendererTurbo(this, 761, 224, textureX, textureY); // Box 76
		leftWingModel[28] = new ModelRendererTurbo(this, 881, 224, textureX, textureY); // Box 77
		leftWingModel[29] = new ModelRendererTurbo(this, 65, 224, textureX, textureY); // Import Box0
		leftWingModel[30] = new ModelRendererTurbo(this, 617, 224, textureX, textureY); // Box 242
		leftWingModel[31] = new ModelRendererTurbo(this, 137, 224, textureX, textureY); // Box 243
		leftWingModel[32] = new ModelRendererTurbo(this, 1, 224, textureX, textureY); // Box 244
		leftWingModel[33] = new ModelRendererTurbo(this, 201, 224, textureX, textureY); // Box 245
		leftWingModel[34] = new ModelRendererTurbo(this, 209, 224, textureX, textureY); // Box 246
		leftWingModel[35] = new ModelRendererTurbo(this, 273, 224, textureX, textureY); // Box 247
		leftWingModel[36] = new ModelRendererTurbo(this, 409, 224, textureX, textureY); // Box 248
		leftWingModel[37] = new ModelRendererTurbo(this, 473, 224, textureX, textureY); // Box 249
		leftWingModel[38] = new ModelRendererTurbo(this, 1665, 224, textureX, textureY); // Box 589
		leftWingModel[39] = new ModelRendererTurbo(this, 1753, 224, textureX, textureY); // Box 590
		leftWingModel[40] = new ModelRendererTurbo(this, 1825, 224, textureX, textureY); // Box 591
		leftWingModel[41] = new ModelRendererTurbo(this, 1913, 224, textureX, textureY); // Box 592
		leftWingModel[42] = new ModelRendererTurbo(this, 193, 248, textureX, textureY); // Box 105
		leftWingModel[43] = new ModelRendererTurbo(this, 1025, 256, textureX, textureY); // Box 166
		leftWingModel[44] = new ModelRendererTurbo(this, 1337, 256, textureX, textureY); // Box 167
		leftWingModel[45] = new ModelRendererTurbo(this, 1505, 256, textureX, textureY); // Box 168
		leftWingModel[46] = new ModelRendererTurbo(this, 1729, 256, textureX, textureY); // Box 169
		leftWingModel[47] = new ModelRendererTurbo(this, 1889, 256, textureX, textureY); // Box 170
		leftWingModel[48] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Box 171
		leftWingModel[49] = new ModelRendererTurbo(this, 273, 78, textureX, textureY); // Box 172
		leftWingModel[50] = new ModelRendererTurbo(this, 537, 78, textureX, textureY); // Box 173
		leftWingModel[51] = new ModelRendererTurbo(this, 1081, 78, textureX, textureY); // Box 175
		leftWingModel[52] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Box 176
		leftWingModel[53] = new ModelRendererTurbo(this, 57, 78, textureX, textureY); // Box 177
		leftWingModel[54] = new ModelRendererTurbo(this, 153, 78, textureX, textureY); // Box 178
		leftWingModel[55] = new ModelRendererTurbo(this, 209, 78, textureX, textureY); // Box 179
		leftWingModel[56] = new ModelRendererTurbo(this, 265, 78, textureX, textureY); // Box 180
		leftWingModel[57] = new ModelRendererTurbo(this, 313, 78, textureX, textureY); // Box 181
		leftWingModel[58] = new ModelRendererTurbo(this, 417, 78, textureX, textureY); // Box 182
		leftWingModel[59] = new ModelRendererTurbo(this, 473, 78, textureX, textureY); // Box 183
		leftWingModel[60] = new ModelRendererTurbo(this, 529, 78, textureX, textureY); // Box 184
		leftWingModel[61] = new ModelRendererTurbo(this, 449, 78, textureX, textureY); // Box 185
		leftWingModel[62] = new ModelRendererTurbo(this, 505, 78, textureX, textureY); // Box 186
		leftWingModel[63] = new ModelRendererTurbo(this, 577, 78, textureX, textureY); // Box 187
		leftWingModel[64] = new ModelRendererTurbo(this, 833, 224, textureX, textureY); // Box 316
		leftWingModel[65] = new ModelRendererTurbo(this, 609, 78, textureX, textureY); // Box 441
		leftWingModel[66] = new ModelRendererTurbo(this, 945, 224, textureX, textureY); // Box 269
		leftWingModel[67] = new ModelRendererTurbo(this, 953, 224, textureX, textureY); // Box 271
		leftWingModel[68] = new ModelRendererTurbo(this, 961, 224, textureX, textureY); // Box 273
		leftWingModel[69] = new ModelRendererTurbo(this, 969, 224, textureX, textureY); // Box 275

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 25, 21, 10, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		leftWingModel[0].setRotationPoint(-98F, -49F, -30F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 25, 21, 10, 0F,0F, -3F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		leftWingModel[1].setRotationPoint(-73F, -49F, -30F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 20, 17, 10, 0F,0F, -3F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 60
		leftWingModel[2].setRotationPoint(-48F, -45F, -30F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 24, 11, 10, 0F,0F, -3F, 0F, -11F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -11F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 61
		leftWingModel[3].setRotationPoint(-28F, -41F, -30F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 15, 21, 10, 0F,-2F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 62
		leftWingModel[4].setRotationPoint(-113F, -49F, -30F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 25, 15, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		leftWingModel[5].setRotationPoint(-98F, -46F, -80F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 25, 15, 50, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftWingModel[6].setRotationPoint(-73F, -46F, -80F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 20, 11, 50, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 65
		leftWingModel[7].setRotationPoint(-48F, -42F, -80F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 13, 6, 50, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 66
		leftWingModel[8].setRotationPoint(-28F, -38F, -80F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 13, 15, 50, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 67
		leftWingModel[9].setRotationPoint(-111F, -46F, -80F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 15, 12, 32, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 58
		leftWingModel[10].setRotationPoint(-144F, -49F, -79F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 37, 12, 32, 0F,0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 59
		leftWingModel[11].setRotationPoint(-102F, -49F, -79F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 15, 5, 24, 0F,0F, -1F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -1F, -12F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 61
		leftWingModel[12].setRotationPoint(-144F, -53F, -75F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 37, 7, 24, 0F,0F, 0F, -12F, 0F, -3F, -12F, 0F, -3F, -12F, 0F, 0F, -12F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F); // Box 62
		leftWingModel[13].setRotationPoint(-102F, -53F, -75F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 22, 9, 20, 0F,0F, 1F, -9.9999F, 0F, -8.9999F, -0.9999F, 0F, -8.9999F, -0.9999F, 0F, 1F, -9.9999F, 0F, -5.9999F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, -5.9999F, 0F); // Box 63
		leftWingModel[14].setRotationPoint(-65F, -49F, -73F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 15, 12, 32, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 64
		leftWingModel[15].setRotationPoint(-144F, -37F, -79F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 37, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F); // Box 65
		leftWingModel[16].setRotationPoint(-102F, -37F, -79F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 22, 9, 26, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, -3F); // Box 66
		leftWingModel[17].setRotationPoint(-65F, -37F, -76F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 22, 9, 20, 0F,0F, -5.9999F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, -5.9999F, 0F, 0F, 0F, -9.9999F, 0F, -6.9999F, -5.9999F, 0F, -6.9999F, -5.9999F, 0F, 0F, -9.9999F); // Box 67
		leftWingModel[18].setRotationPoint(-65F, -34F, -73F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 37, 7, 24, 0F,0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, -12F, 0F, -4F, -12F, 0F, -4F, -12F, 0F, 0F, -12F); // Box 68
		leftWingModel[19].setRotationPoint(-102F, -28F, -75F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 15, 5, 24, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -1F, -12F); // Box 69
		leftWingModel[20].setRotationPoint(-144F, -26F, -75F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 70
		leftWingModel[21].setRotationPoint(-146F, -52F, -74F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 71
		leftWingModel[22].setRotationPoint(-146F, -48F, -78F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 72
		leftWingModel[23].setRotationPoint(-146F, -37F, -78F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 73
		leftWingModel[24].setRotationPoint(-146F, -28F, -74F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 74
		leftWingModel[25].setRotationPoint(-146F, -52F, -63F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 75
		leftWingModel[26].setRotationPoint(-146F, -48F, -54F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 76
		leftWingModel[27].setRotationPoint(-146F, -37F, -54F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F); // Box 77
		leftWingModel[28].setRotationPoint(-146F, -28F, -63F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		leftWingModel[29].setRotationPoint(-156F, -39.5F, -65.5F);

		leftWingModel[30].addBox(0F, 0F, 0F, 7, 5, 3, 0F); // Box 242
		leftWingModel[30].setRotationPoint(-156F, -39.5F, -64.5F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 243
		leftWingModel[31].setRotationPoint(-156F, -39.5F, -61.5F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F); // Box 244
		leftWingModel[32].setRotationPoint(-157F, -39.5F, -65.5F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F); // Box 245
		leftWingModel[33].setRotationPoint(-157F, -39.5F, -61.5F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 246
		leftWingModel[34].setRotationPoint(-157F, -39.5F, -64.5F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		leftWingModel[35].setRotationPoint(-150F, -38.5F, -63.5F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		leftWingModel[36].setRotationPoint(-150F, -38.5F, -64.5F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 249
		leftWingModel[37].setRotationPoint(-150F, -38.5F, -62.5F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 27, 12, 32, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		leftWingModel[38].setRotationPoint(-129F, -49F, -79F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 27, 4, 24, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftWingModel[39].setRotationPoint(-129F, -53F, -75F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 27, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 591
		leftWingModel[40].setRotationPoint(-129F, -37F, -79F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 27, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F); // Box 592
		leftWingModel[41].setRotationPoint(-129F, -25F, -75F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 22, 9, 20, 0F,0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F); // Box 105
		leftWingModel[42].setRotationPoint(-65F, -46F, -73F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 21, 14, 61, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, -5F, 0F, 14F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 6F, 0F, 14F, 6F, 0F); // Box 166
		leftWingModel[43].setRotationPoint(-84F, -51F, -141F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 20, 14, 61, 0F,0F, 0F, 0F, 0F, -3F, 0F, -5F, -9F, 0F, 10F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, 6F, 0F, 10F, 6F, 0F); // Box 167
		leftWingModel[44].setRotationPoint(-63F, -51F, -141F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 20, 14, 61, 0F,0F, -3F, 0F, -6F, -6F, 0F, -5F, -13F, 0F, 5F, -9F, 0F, 0F, -1F, 0F, -6F, -2F, 0F, -5F, 5F, 0F, 5F, 6F, 0F); // Box 168
		leftWingModel[45].setRotationPoint(-43F, -51F, -141F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 13, 14, 61, 0F,-2F, -4F, 0F, 0F, 0F, 0F, -14F, -5F, 0F, 14F, -10F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, -14F, 6F, 0F, 14F, 0F, 0F); // Box 169
		leftWingModel[46].setRotationPoint(-97F, -51F, -141F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 14, 12, 61, 0F,0F, 1F, 0F, 0F, -3F, 0F, 0F, -9F, 0F, -1F, -6F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, -1F, 0F, 0F); // Box 170
		leftWingModel[47].setRotationPoint(-29F, -44F, -141F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 12, 22, 123, 0F,0F, 0F, 0F, 0F, 0F, 0F, -21F, -8F, 0F, 30F, -8F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, -21F, 0F, 0F, 30F, 0F, 0F); // Box 171
		leftWingModel[48].setRotationPoint(-54F, -59F, -264F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 8, 22, 123, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, -9F, -11F, 0F, 21F, -8F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, -9F, -1F, 0F, 21F, 0F, 0F); // Box 172
		leftWingModel[49].setRotationPoint(-42F, -59F, -264F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 9, 22, 123, 0F,0F, -0.5F, 0F, 0F, -2F, 0F, -4F, -14F, 0F, 9F, -11F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, -4F, -2F, 0F, 9F, -1F, 0F); // Box 173
		leftWingModel[50].setRotationPoint(-34F, -59F, -264F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 6, 22, 123, 0F,0F, -2F, 0F, 0F, 0F, 0F, -30F, -8F, 0F, 35F, -12F, 0F, 0F, -18F, 0F, 0F, -16F, 0F, -30F, 0F, 0F, 35F, -6F, 0F); // Box 175
		leftWingModel[51].setRotationPoint(-60F, -59F, -264F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 10, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 176
		leftWingModel[52].setRotationPoint(-50F, -59F, -280F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 177
		leftWingModel[53].setRotationPoint(-40F, -59F, -280F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -2F, 0F, 2F, -0.5F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 2F, 0F, 0F); // Box 178
		leftWingModel[54].setRotationPoint(-32F, -59F, -280F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 11, 6, 16, 0F,0F, -1F, 0F, -2F, -2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 179
		leftWingModel[55].setRotationPoint(-25F, -59F, -280F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 6, 6, 16, 0F,-1F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, -2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 4F, -2F, 0F); // Box 180
		leftWingModel[56].setRotationPoint(-56F, -59F, -280F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 18, 4, 17, 0F,-7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		leftWingModel[57].setRotationPoint(-50F, -59F, -297F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 7, 4, 17, 0F,2F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		leftWingModel[58].setRotationPoint(-32F, -59F, -297F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 7, 4, 17, 0F,0F, 0F, 0F, -2F, -0.5F, 0F, 7F, -2F, 0F, -5F, -1F, 0F, 0F, -2F, 0F, -2F, -2.5F, 0F, 7F, -1F, 0F, -5F, 0F, 0F); // Box 183
		leftWingModel[59].setRotationPoint(-30F, -59F, -297F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 14, 4, 17, 0F,-8F, -0.5F, 0F, -2F, 0F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, -8F, -2.5F, 0F, -2F, -2F, 0F, -9F, 0F, 0F, 0F, -2F, 0F); // Box 184
		leftWingModel[60].setRotationPoint(-55F, -59F, -297F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,-5F, -0.5F, 0F, -6.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, -6.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		leftWingModel[61].setRotationPoint(-43F, -59F, -302F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,-8F, -0.75F, 0F, -4F, -0.5F, 0F, -9F, 0F, 0F, 0F, -0.5F, 0F, -8F, -0.75F, 0F, -4F, -0.5F, 0F, -9F, 0F, 0F, 0F, -0.5F, 0F); // Box 186
		leftWingModel[62].setRotationPoint(-47F, -59F, -302F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,0.5F, -0.5F, 0F, -12.5F, -0.75F, 0F, -2F, -0.5F, 0F, -6F, 0F, 0F, 0.5F, -0.5F, 0F, -12.5F, -0.75F, 0F, -2F, -0.5F, 0F, -6F, 0F, 0F); // Box 187
		leftWingModel[63].setRotationPoint(-36F, -59F, -302F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		leftWingModel[64].setRotationPoint(-150F, -38.5F, 61.5F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		leftWingModel[65].setRotationPoint(-92F, -52F, -222F);

		leftWingModel[66].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		leftWingModel[66].setRotationPoint(-145F, -37F, -63F);

		leftWingModel[67].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		leftWingModel[67].setRotationPoint(-145F, -37F, -63F);
		leftWingModel[67].rotateAngleX = 1.57079633F;

		leftWingModel[68].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		leftWingModel[68].setRotationPoint(-145F, -37F, -63F);
		leftWingModel[68].rotateAngleX = 0.78539816F;

		leftWingModel[69].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		leftWingModel[69].setRotationPoint(-145F, -37F, -63F);
		leftWingModel[69].rotateAngleX = -0.78539816F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 446, textureX, textureY); // Box 274
		rightWingModel[1] = new ModelRendererTurbo(this, 73, 446, textureX, textureY); // Box 275
		rightWingModel[2] = new ModelRendererTurbo(this, 145, 446, textureX, textureY); // Box 276
		rightWingModel[3] = new ModelRendererTurbo(this, 209, 446, textureX, textureY); // Box 277
		rightWingModel[4] = new ModelRendererTurbo(this, 281, 446, textureX, textureY); // Box 278
		rightWingModel[5] = new ModelRendererTurbo(this, 289, 446, textureX, textureY); // Box 279
		rightWingModel[6] = new ModelRendererTurbo(this, 441, 446, textureX, textureY); // Box 280
		rightWingModel[7] = new ModelRendererTurbo(this, 593, 446, textureX, textureY); // Box 281
		rightWingModel[8] = new ModelRendererTurbo(this, 737, 446, textureX, textureY); // Box 282
		rightWingModel[9] = new ModelRendererTurbo(this, 865, 446, textureX, textureY); // Box 283
		rightWingModel[10] = new ModelRendererTurbo(this, 393, 446, textureX, textureY); // Box 289
		rightWingModel[11] = new ModelRendererTurbo(this, 945, 446, textureX, textureY); // Box 290
		rightWingModel[12] = new ModelRendererTurbo(this, 545, 446, textureX, textureY); // Box 291
		rightWingModel[13] = new ModelRendererTurbo(this, 1057, 446, textureX, textureY); // Box 292
		rightWingModel[14] = new ModelRendererTurbo(this, 689, 446, textureX, textureY); // Box 293
		rightWingModel[15] = new ModelRendererTurbo(this, 817, 446, textureX, textureY); // Box 294
		rightWingModel[16] = new ModelRendererTurbo(this, 1153, 446, textureX, textureY); // Box 295
		rightWingModel[17] = new ModelRendererTurbo(this, 1297, 446, textureX, textureY); // Box 296
		rightWingModel[18] = new ModelRendererTurbo(this, 1401, 446, textureX, textureY); // Box 297
		rightWingModel[19] = new ModelRendererTurbo(this, 1489, 446, textureX, textureY); // Box 298
		rightWingModel[20] = new ModelRendererTurbo(this, 1617, 446, textureX, textureY); // Box 299
		rightWingModel[21] = new ModelRendererTurbo(this, 393, 446, textureX, textureY); // Box 300
		rightWingModel[22] = new ModelRendererTurbo(this, 457, 446, textureX, textureY); // Box 301
		rightWingModel[23] = new ModelRendererTurbo(this, 545, 446, textureX, textureY); // Box 302
		rightWingModel[24] = new ModelRendererTurbo(this, 601, 446, textureX, textureY); // Box 303
		rightWingModel[25] = new ModelRendererTurbo(this, 817, 446, textureX, textureY); // Box 304
		rightWingModel[26] = new ModelRendererTurbo(this, 689, 446, textureX, textureY); // Box 305
		rightWingModel[27] = new ModelRendererTurbo(this, 761, 446, textureX, textureY); // Box 306
		rightWingModel[28] = new ModelRendererTurbo(this, 881, 446, textureX, textureY); // Box 307
		rightWingModel[29] = new ModelRendererTurbo(this, 65, 446, textureX, textureY); // Box 308
		rightWingModel[30] = new ModelRendererTurbo(this, 617, 446, textureX, textureY); // Box 309
		rightWingModel[31] = new ModelRendererTurbo(this, 137, 446, textureX, textureY); // Box 310
		rightWingModel[32] = new ModelRendererTurbo(this, 1, 446, textureX, textureY); // Box 311
		rightWingModel[33] = new ModelRendererTurbo(this, 201, 446, textureX, textureY); // Box 312
		rightWingModel[34] = new ModelRendererTurbo(this, 209, 446, textureX, textureY); // Box 313
		rightWingModel[35] = new ModelRendererTurbo(this, 273, 446, textureX, textureY); // Box 314
		rightWingModel[36] = new ModelRendererTurbo(this, 409, 446, textureX, textureY); // Box 315
		rightWingModel[37] = new ModelRendererTurbo(this, 1665, 446, textureX, textureY); // Box 317
		rightWingModel[38] = new ModelRendererTurbo(this, 1753, 446, textureX, textureY); // Box 318
		rightWingModel[39] = new ModelRendererTurbo(this, 1825, 446, textureX, textureY); // Box 319
		rightWingModel[40] = new ModelRendererTurbo(this, 1913, 446, textureX, textureY); // Box 320
		rightWingModel[41] = new ModelRendererTurbo(this, 193, 470, textureX, textureY); // Box 321
		rightWingModel[42] = new ModelRendererTurbo(this, 1025, 478, textureX, textureY); // Box 382
		rightWingModel[43] = new ModelRendererTurbo(this, 1337, 478, textureX, textureY); // Box 383
		rightWingModel[44] = new ModelRendererTurbo(this, 1505, 478, textureX, textureY); // Box 384
		rightWingModel[45] = new ModelRendererTurbo(this, 1729, 478, textureX, textureY); // Box 385
		rightWingModel[46] = new ModelRendererTurbo(this, 1889, 478, textureX, textureY); // Box 386
		rightWingModel[47] = new ModelRendererTurbo(this, 1, 300, textureX, textureY); // Box 387
		rightWingModel[48] = new ModelRendererTurbo(this, 273, 300, textureX, textureY); // Box 388
		rightWingModel[49] = new ModelRendererTurbo(this, 537, 300, textureX, textureY); // Box 389
		rightWingModel[50] = new ModelRendererTurbo(this, 1081, 300, textureX, textureY); // Box 391
		rightWingModel[51] = new ModelRendererTurbo(this, 1, 300, textureX, textureY); // Box 392
		rightWingModel[52] = new ModelRendererTurbo(this, 57, 300, textureX, textureY); // Box 393
		rightWingModel[53] = new ModelRendererTurbo(this, 153, 300, textureX, textureY); // Box 394
		rightWingModel[54] = new ModelRendererTurbo(this, 209, 300, textureX, textureY); // Box 395
		rightWingModel[55] = new ModelRendererTurbo(this, 265, 300, textureX, textureY); // Box 396
		rightWingModel[56] = new ModelRendererTurbo(this, 313, 300, textureX, textureY); // Box 397
		rightWingModel[57] = new ModelRendererTurbo(this, 417, 300, textureX, textureY); // Box 398
		rightWingModel[58] = new ModelRendererTurbo(this, 473, 300, textureX, textureY); // Box 399
		rightWingModel[59] = new ModelRendererTurbo(this, 529, 300, textureX, textureY); // Box 400
		rightWingModel[60] = new ModelRendererTurbo(this, 449, 300, textureX, textureY); // Box 401
		rightWingModel[61] = new ModelRendererTurbo(this, 505, 300, textureX, textureY); // Box 402
		rightWingModel[62] = new ModelRendererTurbo(this, 577, 300, textureX, textureY); // Box 403
		rightWingModel[63] = new ModelRendererTurbo(this, 609, 300, textureX, textureY); // Box 442
		rightWingModel[64] = new ModelRendererTurbo(this, 481, 446, textureX, textureY); // Box 463
		rightWingModel[65] = new ModelRendererTurbo(this, 945, 446, textureX, textureY); // Box 464
		rightWingModel[66] = new ModelRendererTurbo(this, 953, 446, textureX, textureY); // Box 465
		rightWingModel[67] = new ModelRendererTurbo(this, 961, 446, textureX, textureY); // Box 466

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 25, 21, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 274
		rightWingModel[0].setRotationPoint(-98F, -49F, 20F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 25, 21, 10, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 275
		rightWingModel[1].setRotationPoint(-73F, -49F, 20F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 20, 17, 10, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 276
		rightWingModel[2].setRotationPoint(-48F, -45F, 20F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 24, 11, 10, 0F,0F, 0F, 0F, 0F, -5F, 0F, -11F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -11F, -4F, 0F, 0F, -2F, 0F); // Box 277
		rightWingModel[3].setRotationPoint(-28F, -41F, 20F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 15, 21, 10, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -8F, 0F); // Box 278
		rightWingModel[4].setRotationPoint(-113F, -49F, 20F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 25, 15, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		rightWingModel[5].setRotationPoint(-98F, -46F, 30F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 25, 15, 50, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		rightWingModel[6].setRotationPoint(-73F, -46F, 30F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 20, 11, 50, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 281
		rightWingModel[7].setRotationPoint(-48F, -42F, 30F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 13, 6, 50, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 282
		rightWingModel[8].setRotationPoint(-28F, -38F, 30F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 13, 15, 50, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 283
		rightWingModel[9].setRotationPoint(-111F, -46F, 30F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 15, 12, 32, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 289
		rightWingModel[10].setRotationPoint(-144F, -49F, 47F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 37, 12, 32, 0F,0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 290
		rightWingModel[11].setRotationPoint(-102F, -49F, 47F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 15, 5, 24, 0F,0F, -1F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -1F, -12F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 291
		rightWingModel[12].setRotationPoint(-144F, -53F, 51F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 37, 7, 24, 0F,0F, 0F, -12F, 0F, -3F, -12F, 0F, -3F, -12F, 0F, 0F, -12F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F); // Box 292
		rightWingModel[13].setRotationPoint(-102F, -53F, 51F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 22, 9, 20, 0F,0F, 1F, -9.9999F, 0F, -8.9999F, -0.9999F, 0F, -8.9999F, -0.9999F, 0F, 1F, -9.9999F, 0F, -5.9999F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, -5.9999F, 0F); // Box 293
		rightWingModel[14].setRotationPoint(-65F, -49F, 53F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 15, 12, 32, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 294
		rightWingModel[15].setRotationPoint(-144F, -37F, 47F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 37, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F); // Box 295
		rightWingModel[16].setRotationPoint(-102F, -37F, 47F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 22, 9, 26, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, -3F); // Box 296
		rightWingModel[17].setRotationPoint(-65F, -37F, 50F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 22, 9, 20, 0F,0F, -5.9999F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, -5.9999F, 0F, 0F, 0F, -9.9999F, 0F, -6.9999F, -5.9999F, 0F, -6.9999F, -5.9999F, 0F, 0F, -9.9999F); // Box 297
		rightWingModel[18].setRotationPoint(-65F, -34F, 53F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 37, 7, 24, 0F,0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, -12F, 0F, -4F, -12F, 0F, -4F, -12F, 0F, 0F, -12F); // Box 298
		rightWingModel[19].setRotationPoint(-102F, -28F, 51F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 15, 5, 24, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -1F, -12F); // Box 299
		rightWingModel[20].setRotationPoint(-144F, -26F, 51F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 300
		rightWingModel[21].setRotationPoint(-146F, -52F, 63F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 301
		rightWingModel[22].setRotationPoint(-146F, -48F, 72F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F); // Box 302
		rightWingModel[23].setRotationPoint(-146F, -37F, 72F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F); // Box 303
		rightWingModel[24].setRotationPoint(-146F, -28F, 63F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 304
		rightWingModel[25].setRotationPoint(-146F, -52F, 52F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 305
		rightWingModel[26].setRotationPoint(-146F, -48F, 48F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 306
		rightWingModel[27].setRotationPoint(-146F, -37F, 48F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 307
		rightWingModel[28].setRotationPoint(-146F, -28F, 52F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 308
		rightWingModel[29].setRotationPoint(-156F, -39.5F, 64.5F);

		rightWingModel[30].addBox(0F, 0F, 0F, 7, 5, 3, 0F); // Box 309
		rightWingModel[30].setRotationPoint(-156F, -39.5F, 61.5F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		rightWingModel[31].setRotationPoint(-156F, -39.5F, 60.5F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F); // Box 311
		rightWingModel[32].setRotationPoint(-157F, -39.5F, 64.5F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, -0.9999F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F); // Box 312
		rightWingModel[33].setRotationPoint(-157F, -39.5F, 60.5F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 313
		rightWingModel[34].setRotationPoint(-157F, -39.5F, 61.5F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		rightWingModel[35].setRotationPoint(-150F, -38.5F, 62.5F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 315
		rightWingModel[36].setRotationPoint(-150F, -38.5F, 63.5F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 27, 12, 32, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		rightWingModel[37].setRotationPoint(-129F, -49F, 47F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 27, 4, 24, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		rightWingModel[38].setRotationPoint(-129F, -53F, 51F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 27, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 319
		rightWingModel[39].setRotationPoint(-129F, -37F, 47F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 27, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F); // Box 320
		rightWingModel[40].setRotationPoint(-129F, -25F, 51F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 22, 9, 20, 0F,0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F); // Box 321
		rightWingModel[41].setRotationPoint(-65F, -46F, 53F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 21, 14, 61, 0F,14F, -5F, 0F, -10F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 6F, 0F, -10F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		rightWingModel[42].setRotationPoint(-84F, -51F, 80F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 20, 14, 61, 0F,10F, -5F, 0F, -5F, -9F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 10F, 6F, 0F, -5F, 6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 383
		rightWingModel[43].setRotationPoint(-63F, -51F, 80F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 20, 14, 61, 0F,5F, -9F, 0F, -5F, -13F, 0F, -6F, -6F, 0F, 0F, -3F, 0F, 5F, 6F, 0F, -5F, 5F, 0F, -6F, -2F, 0F, 0F, -1F, 0F); // Box 384
		rightWingModel[44].setRotationPoint(-43F, -51F, 80F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 13, 14, 61, 0F,14F, -10F, 0F, -14F, -5F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 14F, 0F, 0F, -14F, 6F, 0F, 0F, 0F, 0F, -2F, -6F, 0F); // Box 385
		rightWingModel[45].setRotationPoint(-97F, -51F, 80F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 14, 12, 61, 0F,-1F, -6F, 0F, 0F, -9F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -7F, 0F); // Box 386
		rightWingModel[46].setRotationPoint(-29F, -44F, 80F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 12, 22, 123, 0F,30F, -8F, 0F, -21F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, -21F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F); // Box 387
		rightWingModel[47].setRotationPoint(-54F, -59F, 141F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 8, 22, 123, 0F,21F, -8F, 0F, -9F, -11F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, -9F, -1F, 0F, 0F, -16F, 0F, 0F, -16F, 0F); // Box 388
		rightWingModel[48].setRotationPoint(-42F, -59F, 141F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 9, 22, 123, 0F,9F, -11F, 0F, -4F, -14F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 9F, -1F, 0F, -4F, -2F, 0F, 0F, -16F, 0F, 0F, -16F, 0F); // Box 389
		rightWingModel[49].setRotationPoint(-34F, -59F, 141F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 6, 22, 123, 0F,35F, -12F, 0F, -30F, -8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 35F, -6F, 0F, -30F, 0F, 0F, 0F, -16F, 0F, 0F, -18F, 0F); // Box 391
		rightWingModel[50].setRotationPoint(-60F, -59F, 141F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 10, 6, 16, 0F,4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 392
		rightWingModel[51].setRotationPoint(-50F, -59F, 264F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F,2F, 0F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 393
		rightWingModel[52].setRotationPoint(-40F, -59F, 264F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F,2F, -0.5F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F); // Box 394
		rightWingModel[53].setRotationPoint(-32F, -59F, 264F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 11, 6, 16, 0F,0F, -2F, 0F, -1F, -4F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -3F, 0F, 0F, -2F, 0F); // Box 395
		rightWingModel[54].setRotationPoint(-25F, -59F, 264F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 6, 6, 16, 0F,4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 4F, -2F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, -1F, -4F, 0F); // Box 396
		rightWingModel[55].setRotationPoint(-56F, -59F, 264F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 18, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -7F, -2F, 0F); // Box 397
		rightWingModel[56].setRotationPoint(-50F, -59F, 280F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 7, 4, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 2F, -2F, 0F); // Box 398
		rightWingModel[57].setRotationPoint(-32F, -59F, 280F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 7, 4, 17, 0F,-5F, -1F, 0F, 7F, -2F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 7F, -1F, 0F, -2F, -2.5F, 0F, 0F, -2F, 0F); // Box 399
		rightWingModel[58].setRotationPoint(-30F, -59F, 280F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 14, 4, 17, 0F,0F, -1F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, -8F, -0.5F, 0F, 0F, -2F, 0F, -9F, 0F, 0F, -2F, -2F, 0F, -8F, -2.5F, 0F); // Box 400
		rightWingModel[59].setRotationPoint(-55F, -59F, 280F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6.5F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, -0.5F, 0F, -5F, -0.5F, 0F); // Box 401
		rightWingModel[60].setRotationPoint(-43F, -59F, 297F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,0F, -0.5F, 0F, -9F, 0F, 0F, -4F, -0.5F, 0F, -8F, -0.75F, 0F, 0F, -0.5F, 0F, -9F, 0F, 0F, -4F, -0.5F, 0F, -8F, -0.75F, 0F); // Box 402
		rightWingModel[61].setRotationPoint(-47F, -59F, 297F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,-6F, 0F, 0F, -2F, -0.5F, 0F, -12.5F, -0.75F, 0F, 0.5F, -0.5F, 0F, -6F, 0F, 0F, -2F, -0.5F, 0F, -12.5F, -0.75F, 0F, 0.5F, -0.5F, 0F); // Box 403
		rightWingModel[62].setRotationPoint(-36F, -59F, 297F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		rightWingModel[63].setRotationPoint(-92F, -52F, 221F);

		rightWingModel[64].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		rightWingModel[64].setRotationPoint(-145F, -37F, 63F);

		rightWingModel[65].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		rightWingModel[65].setRotationPoint(-145F, -37F, 63F);
		rightWingModel[65].rotateAngleX = 0.78539816F;

		rightWingModel[66].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		rightWingModel[66].setRotationPoint(-145F, -37F, 63F);
		rightWingModel[66].rotateAngleX = 1.57079633F;

		rightWingModel[67].addShapeBox(0F, -12.5F, -1F, 1, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		rightWingModel[67].setRotationPoint(-145F, -37F, 63F);
		rightWingModel[67].rotateAngleX = -0.78539816F;
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 161, 522, textureX, textureY); // Box 190
		yawFlapModel[1] = new ModelRendererTurbo(this, 209, 522, textureX, textureY); // Box 191
		yawFlapModel[2] = new ModelRendererTurbo(this, 241, 522, textureX, textureY); // Box 192
		yawFlapModel[3] = new ModelRendererTurbo(this, 273, 522, textureX, textureY); // Box 193
		yawFlapModel[4] = new ModelRendererTurbo(this, 297, 522, textureX, textureY); // Box 194
		yawFlapModel[5] = new ModelRendererTurbo(this, 329, 522, textureX, textureY); // Box 195
		yawFlapModel[6] = new ModelRendererTurbo(this, 377, 522, textureX, textureY); // Box 196
		yawFlapModel[7] = new ModelRendererTurbo(this, 409, 522, textureX, textureY); // Box 197
		yawFlapModel[8] = new ModelRendererTurbo(this, 457, 522, textureX, textureY); // Box 198
		yawFlapModel[9] = new ModelRendererTurbo(this, 481, 522, textureX, textureY); // Box 199
		yawFlapModel[10] = new ModelRendererTurbo(this, 161, 561, textureX, textureY); // Box 406
		yawFlapModel[11] = new ModelRendererTurbo(this, 209, 561, textureX, textureY); // Box 407
		yawFlapModel[12] = new ModelRendererTurbo(this, 241, 561, textureX, textureY); // Box 408
		yawFlapModel[13] = new ModelRendererTurbo(this, 273, 561, textureX, textureY); // Box 409
		yawFlapModel[14] = new ModelRendererTurbo(this, 297, 561, textureX, textureY); // Box 410
		yawFlapModel[15] = new ModelRendererTurbo(this, 329, 561, textureX, textureY); // Box 411
		yawFlapModel[16] = new ModelRendererTurbo(this, 377, 561, textureX, textureY); // Box 412
		yawFlapModel[17] = new ModelRendererTurbo(this, 409, 561, textureX, textureY); // Box 413
		yawFlapModel[18] = new ModelRendererTurbo(this, 457, 561, textureX, textureY); // Box 414
		yawFlapModel[19] = new ModelRendererTurbo(this, 481, 561, textureX, textureY); // Box 415

		yawFlapModel[0].addShapeBox(0F, 38F, -4F, 19, 34, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		yawFlapModel[0].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[1].addShapeBox(19F, 38F, -2F, 10, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		yawFlapModel[1].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[2].addShapeBox(19F, 59F, -2F, 10, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 192
		yawFlapModel[2].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[3].addShapeBox(19F, 66F, -2F, 8, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		yawFlapModel[3].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[4].addShapeBox(19F, 70F, -2F, 11, 4, 2, 0F,0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		yawFlapModel[4].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[5].addShapeBox(0F, 16F, -4F, 19, 22, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		yawFlapModel[5].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[6].addShapeBox(19F, 16F, -2F, 10, 22, 2, 0F,0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		yawFlapModel[6].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[7].addShapeBox(0F, 4F, -4F, 19, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		yawFlapModel[7].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[8].addShapeBox(19F, 4F, -2F, 8, 12, 2, 0F,0F, 0F, 0F, -1F, -2F, -1F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		yawFlapModel[8].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[9].addShapeBox(0F, 0F, -4F, 19, 4, 4, 0F,0F, 0F, -1F, -11F, 0F, -2F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		yawFlapModel[9].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[10].addShapeBox(0F, 38F, 0F, 19, 34, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 406
		yawFlapModel[10].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[11].addShapeBox(19F, 38F, 0F, 10, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 407
		yawFlapModel[11].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[12].addShapeBox(19F, 59F, 0F, 10, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F); // Box 408
		yawFlapModel[12].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[13].addShapeBox(19F, 66F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 409
		yawFlapModel[13].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[14].addShapeBox(19F, 70F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 410
		yawFlapModel[14].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[15].addShapeBox(0F, 16F, 0F, 19, 22, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 411
		yawFlapModel[15].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[16].addShapeBox(19F, 16F, 0F, 10, 22, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 412
		yawFlapModel[16].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[17].addShapeBox(0F, 4F, 0F, 19, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 413
		yawFlapModel[17].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[18].addShapeBox(19F, 4F, 0F, 8, 12, 2, 0F,0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 414
		yawFlapModel[18].setRotationPoint(158F, -142F, 0F);

		yawFlapModel[19].addShapeBox(0F, 0F, 0F, 19, 4, 4, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 415
		yawFlapModel[19].setRotationPoint(158F, -142F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 417, 600, textureX, textureY); // Box 157
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 401, 600, textureX, textureY); // Box 159
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 689, 600, textureX, textureY); // Box 163

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 18, 6, 53, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 157
		pitchFlapLeftModel[0].setRotationPoint(169F, -69F, -69F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 18, 6, 13, 0F,0F, -1F, 0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 159
		pitchFlapLeftModel[1].setRotationPoint(169F, -69F, -82F);

		pitchFlapLeftModel[2].addShapeBox(0F, 1F, 0F, 14, 3, 10, 0F,0F, 0F, 0F, -6F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, -3F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 163
		pitchFlapLeftModel[2].setRotationPoint(169F, -69F, -92F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 417, 660, textureX, textureY); // Box 373
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 401, 660, textureX, textureY); // Box 375
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 689, 660, textureX, textureY); // Box 379

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 18, 6, 53, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 373
		pitchFlapRightModel[0].setRotationPoint(169F, -69F, 16F);

		pitchFlapRightModel[1].addShapeBox(0F, 0F, 0F, 18, 6, 13, 0F,0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, 0F, -1F, 0F); // Box 375
		pitchFlapRightModel[1].setRotationPoint(169F, -69F, 69F);

		pitchFlapRightModel[2].addShapeBox(0F, 1F, 0F, 14, 3, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -6F, -1F, -3F, 0F, 0F, 0F); // Box 379
		pitchFlapRightModel[2].setRotationPoint(169F, -69F, 82F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 809, 78, textureX, textureY); // Box 174

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 10, 22, 123, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -18F, 0F, 4F, -14F, 0F, 0F, -16F, 0F, 0F, -17F, 0F, 0F, -3F, 0F, 4F, -2F, 0F); // Box 174
		pitchFlapLeftWingModel[0].setRotationPoint(-25F, -59F, -264F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 809, 300, textureX, textureY); // Box 390

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 10, 22, 123, 0F,4F, -14F, 0F, 0F, -18F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 4F, -2F, 0F, 0F, -3F, 0F, 0F, -17F, 0F, 0F, -16F, 0F); // Box 390
		pitchFlapRightWingModel[0].setRotationPoint(-25F, -59F, 141F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 0, 112, textureX, textureY); // Box 206
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 42, 169, textureX, textureY); // Box 207
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 42, 169, textureX, textureY); // Box 208
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 163, 156, textureX, textureY); // Box 209
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 158, 104, textureX, textureY); // Box 210
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 202, 167, textureX, textureY); // Box 211
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 204, 104, textureX, textureY); // Box 212
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 241, 112, textureX, textureY); // Box 213
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 241, 151, textureX, textureY); // Box 214
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 289, 112, textureX, textureY); // Box 215

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftWingWheelModel[0].setRotationPoint(-105F, -6F, -68F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		leftWingWheelModel[1].setRotationPoint(-105F, -14F, -68F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 208
		leftWingWheelModel[2].setRotationPoint(-105F, 2F, -68F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		leftWingWheelModel[3].setRotationPoint(-94F, -25F, -70F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 210
		leftWingWheelModel[4].setRotationPoint(-92F, 0F, -70F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		leftWingWheelModel[5].setRotationPoint(-75F, -16F, -70F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 212
		leftWingWheelModel[6].setRotationPoint(-75F, -16F, -64F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		leftWingWheelModel[7].setRotationPoint(-94F, -25F, -57F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 214
		leftWingWheelModel[8].setRotationPoint(-92F, 0F, -57F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		leftWingWheelModel[9].setRotationPoint(-94F, -18F, -68F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 0, 112, textureX, textureY); // Box 422
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 294, 134, textureX, textureY); // Box 423
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 398, 36, textureX, textureY); // Box 424
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 465, 112, textureX, textureY); // Box 425
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 460, 104, textureX, textureY); // Box 426
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 490, 136, textureX, textureY); // Box 427
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 522, 104, textureX, textureY); // Box 428
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 561, 112, textureX, textureY); // Box 429
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 579, 103, textureX, textureY); // Box 430
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 627, 161, textureX, textureY); // Box 431

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		rightWingWheelModel[0].setRotationPoint(-105F, -6F, 57F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		rightWingWheelModel[1].setRotationPoint(-105F, -14F, 57F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 24, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 424
		rightWingWheelModel[2].setRotationPoint(-105F, 2F, 57F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		rightWingWheelModel[3].setRotationPoint(-94F, -25F, 68F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 426
		rightWingWheelModel[4].setRotationPoint(-92F, 0F, 68F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		rightWingWheelModel[5].setRotationPoint(-75F, -16F, 55F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 428
		rightWingWheelModel[6].setRotationPoint(-75F, -16F, 62F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		rightWingWheelModel[7].setRotationPoint(-94F, -25F, 55F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 430
		rightWingWheelModel[8].setRotationPoint(-92F, 0F, 55F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		rightWingWheelModel[9].setRotationPoint(-94F, -18F, 57F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-149F, -37F, -63F);
		propellerModels[1] = makeProp2(-149F, -37F, 63F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 15, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 15, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 15, textureX, textureY);
		prop[0].addBox(-1F, -35F, -2F, 2, 35, 4, 0.0F);
		prop[1].addBox(-1F, -35F, -2F, 2, 35, 4, 0.0F);
		prop[2].addBox(-1F, -35F, -2F, 2, 35, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 15, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 15, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 15, textureX, textureY);
		prop[0].addBox(-1F, -35F, -2F, 2, 35, 4, 0.0F);
		prop[1].addBox(-1F, -35F, -2F, 2, 35, 4, 0.0F);
		prop[2].addBox(-1F, -35F, -2F, 2, 35, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private void initGuns() {
	}
	{

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[0];

		gun_3_Model[1] = new ModelRendererTurbo[12];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 875, 576, textureX, textureY); // MG1
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 875, 579, textureX, textureY); // MG1 Innen
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 875, 582, textureX, textureY); // MG1 Lauf
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 875, 585, textureX, textureY); // MG2
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 875, 590, textureX, textureY); // MG3
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 882, 590, textureX, textureY); // MG4
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 889, 590, textureX, textureY); // MG5
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 902, 576, textureX, textureY); // MG6
		gun_3_Model[1][8] = new ModelRendererTurbo(this, 902, 580, textureX, textureY); // MG7
		gun_3_Model[1][9] = new ModelRendererTurbo(this, 896, 585, textureX, textureY); // MG8
		gun_3_Model[1][10] = new ModelRendererTurbo(this, 908, 585, textureX, textureY); // MG9
		gun_3_Model[1][11] = new ModelRendererTurbo(this, 898, 585, textureX, textureY); // Ammo

		gun_3_Model[1][0].addBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F); // MG1

		gun_3_Model[1][1].addBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F); // MG1 Innen

		gun_3_Model[1][2].addShapeBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // MG1 Lauf

		gun_3_Model[1][3].addBox(-7.5F, -1.5F, -1F, 8, 2, 2, 0F); // MG2

		gun_3_Model[1][4].addBox(-9.5F, -1F, -0.5F, 2, 1, 1, 0F); // MG3

		gun_3_Model[1][5].addShapeBox(-10.5F, 0F, -0.5F, 2, 2, 1, 0F,-1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, 0F, 0F, -0.15F, -0.6F, 0F, -0.15F, -0.6F, 0F, -0.15F, 0F, 0F, -0.15F); // MG4

		gun_3_Model[1][6].addBox(-2.5F, -1F, -0.9F, 2, 1, 2, 0F); // MG5

		gun_3_Model[1][7].addBox(-2.5F, -1F, -1.1F, 2, 1, 2, 0F); // MG6

		gun_3_Model[1][8].addShapeBox(-3.5F, -1F, -3F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // MG7

		gun_3_Model[1][9].addShapeBox(-0.6F, -2F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.4F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG8

		gun_3_Model[1][10].addShapeBox(-6.5F, -2F, -0.5F, 2, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG9

		gun_3_Model[1][11].addBox(-2.5F, -3F, 1F, 2, 3, 5, 0F); // Ammo

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(73F, -77.5F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("TailGun", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[0];

		gun_4_Model[1] = new ModelRendererTurbo[12];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 875, 576, textureX, textureY); // MG1
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 875, 579, textureX, textureY); // MG1 Innen
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 875, 582, textureX, textureY); // MG1 Lauf
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 875, 585, textureX, textureY); // MG2
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 875, 590, textureX, textureY); // MG3
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 882, 590, textureX, textureY); // MG4
		gun_4_Model[1][6] = new ModelRendererTurbo(this, 889, 590, textureX, textureY); // MG5
		gun_4_Model[1][7] = new ModelRendererTurbo(this, 902, 576, textureX, textureY); // MG6
		gun_4_Model[1][8] = new ModelRendererTurbo(this, 902, 580, textureX, textureY); // MG7
		gun_4_Model[1][9] = new ModelRendererTurbo(this, 896, 585, textureX, textureY); // MG8
		gun_4_Model[1][10] = new ModelRendererTurbo(this, 908, 585, textureX, textureY); // MG9
		gun_4_Model[1][11] = new ModelRendererTurbo(this, 898, 585, textureX, textureY); // Ammo

		gun_4_Model[1][0].addBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F); // MG1

		gun_4_Model[1][1].addBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F); // MG1 Innen

		gun_4_Model[1][2].addShapeBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // MG1 Lauf

		gun_4_Model[1][3].addBox(-7.5F, -1.5F, -1F, 8, 2, 2, 0F); // MG2

		gun_4_Model[1][4].addBox(-9.5F, -1F, -0.5F, 2, 1, 1, 0F); // MG3

		gun_4_Model[1][5].addShapeBox(-10.5F, 0F, -0.5F, 2, 2, 1, 0F,-1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, 0F, 0F, -0.15F, -0.6F, 0F, -0.15F, -0.6F, 0F, -0.15F, 0F, 0F, -0.15F); // MG4

		gun_4_Model[1][6].addBox(-2.5F, -1F, -0.9F, 2, 1, 2, 0F); // MG5

		gun_4_Model[1][7].addBox(-2.5F, -1F, -1.1F, 2, 1, 2, 0F); // MG6

		gun_4_Model[1][8].addShapeBox(-3.5F, -1F, -3F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // MG7

		gun_4_Model[1][9].addShapeBox(-0.6F, -2F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.4F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG8

		gun_4_Model[1][10].addShapeBox(-6.5F, -2F, -0.5F, 2, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG9

		gun_4_Model[1][11].addBox(-2.5F, -3F, 1F, 2, 3, 5, 0F); // Ammo

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-188F, -46F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("NoseGun", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[0];

		gun_5_Model[1] = new ModelRendererTurbo[12];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 875, 576, textureX, textureY); // MG1
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 875, 579, textureX, textureY); // MG1 Innen
		gun_5_Model[1][2] = new ModelRendererTurbo(this, 875, 582, textureX, textureY); // MG1 Lauf
		gun_5_Model[1][3] = new ModelRendererTurbo(this, 875, 585, textureX, textureY); // MG2
		gun_5_Model[1][4] = new ModelRendererTurbo(this, 875, 590, textureX, textureY); // MG3
		gun_5_Model[1][5] = new ModelRendererTurbo(this, 882, 590, textureX, textureY); // MG4
		gun_5_Model[1][6] = new ModelRendererTurbo(this, 889, 590, textureX, textureY); // MG5
		gun_5_Model[1][7] = new ModelRendererTurbo(this, 902, 576, textureX, textureY); // MG6
		gun_5_Model[1][8] = new ModelRendererTurbo(this, 902, 580, textureX, textureY); // MG7
		gun_5_Model[1][9] = new ModelRendererTurbo(this, 896, 585, textureX, textureY); // MG8
		gun_5_Model[1][10] = new ModelRendererTurbo(this, 908, 585, textureX, textureY); // MG9
		gun_5_Model[1][11] = new ModelRendererTurbo(this, 898, 585, textureX, textureY); // Ammo

		gun_5_Model[1][0].addBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F); // MG1

		gun_5_Model[1][1].addBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F); // MG1 Innen

		gun_5_Model[1][2].addShapeBox(0.5F, -1F, -0.5F, 12, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // MG1 Lauf

		gun_5_Model[1][3].addBox(-7.5F, -1.5F, -1F, 8, 2, 2, 0F); // MG2

		gun_5_Model[1][4].addBox(-9.5F, -1F, -0.5F, 2, 1, 1, 0F); // MG3

		gun_5_Model[1][5].addShapeBox(-10.5F, 0F, -0.5F, 2, 2, 1, 0F,-1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, 0F, 0F, -0.15F, -0.6F, 0F, -0.15F, -0.6F, 0F, -0.15F, 0F, 0F, -0.15F); // MG4

		gun_5_Model[1][6].addBox(-2.5F, -1F, -0.9F, 2, 1, 2, 0F); // MG5

		gun_5_Model[1][7].addBox(-2.5F, -1F, -1.1F, 2, 1, 2, 0F); // MG6

		gun_5_Model[1][8].addShapeBox(-3.5F, -1F, -3F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // MG7

		gun_5_Model[1][9].addShapeBox(-0.6F, -2F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.4F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG8

		gun_5_Model[1][10].addShapeBox(-6.5F, -2F, -0.5F, 2, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG9

		gun_5_Model[1][11].addBox(-2.5F, -3F, 1F, 2, 3, 5, 0F); // Ammo

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-165F, -22F, 0F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("ChinGun", gun_5_Model);
	}
}