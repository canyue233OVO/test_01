//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Algerie
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAlgerie extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelAlgerie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[325];
		leftFrontWheelModel = new ModelRendererTurbo[3];

		initbodyModel_1();
		initleftFrontWheelModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 194
		bodyModel[23] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 195
		bodyModel[24] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 196
		bodyModel[25] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 197
		bodyModel[26] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 198
		bodyModel[27] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 199
		bodyModel[28] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 200
		bodyModel[29] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 202
		bodyModel[30] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 203
		bodyModel[31] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 204
		bodyModel[32] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 205
		bodyModel[33] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 206
		bodyModel[34] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Box 210
		bodyModel[35] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Box 211
		bodyModel[36] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 212
		bodyModel[37] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 260
		bodyModel[38] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 261
		bodyModel[39] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 262
		bodyModel[40] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 263
		bodyModel[41] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 264
		bodyModel[42] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 265
		bodyModel[43] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Box 266
		bodyModel[44] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 267
		bodyModel[45] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 268
		bodyModel[46] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 269
		bodyModel[47] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 270
		bodyModel[48] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 271
		bodyModel[49] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 272
		bodyModel[50] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 273
		bodyModel[51] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 274
		bodyModel[52] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Box 275
		bodyModel[53] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 276
		bodyModel[54] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 277
		bodyModel[55] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 278
		bodyModel[56] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 279
		bodyModel[57] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 280
		bodyModel[58] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 281
		bodyModel[59] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 282
		bodyModel[60] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 283
		bodyModel[61] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 284
		bodyModel[62] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 285
		bodyModel[63] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 286
		bodyModel[64] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 287
		bodyModel[65] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 288
		bodyModel[66] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 289
		bodyModel[67] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 290
		bodyModel[68] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 291
		bodyModel[69] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 292
		bodyModel[70] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 293
		bodyModel[71] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 294
		bodyModel[72] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 295
		bodyModel[73] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 296
		bodyModel[74] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 297
		bodyModel[75] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 298
		bodyModel[76] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 299
		bodyModel[77] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 300
		bodyModel[78] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 301
		bodyModel[79] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 302
		bodyModel[80] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 303
		bodyModel[81] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 304
		bodyModel[82] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 305
		bodyModel[83] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 306
		bodyModel[84] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 307
		bodyModel[85] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 308
		bodyModel[86] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 309
		bodyModel[87] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 310
		bodyModel[88] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 311
		bodyModel[89] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 312
		bodyModel[90] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 313
		bodyModel[91] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 314
		bodyModel[92] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 315
		bodyModel[93] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 316
		bodyModel[94] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 317
		bodyModel[95] = new ModelRendererTurbo(this, 473, 241, textureX, textureY); // Box 318
		bodyModel[96] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Box 319
		bodyModel[97] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 320
		bodyModel[98] = new ModelRendererTurbo(this, 57, 249, textureX, textureY); // Box 321
		bodyModel[99] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // Box 322
		bodyModel[100] = new ModelRendererTurbo(this, 489, 257, textureX, textureY); // Box 323
		bodyModel[101] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 324
		bodyModel[102] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 325
		bodyModel[103] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 326
		bodyModel[104] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Box 327
		bodyModel[105] = new ModelRendererTurbo(this, 369, 273, textureX, textureY); // Box 328
		bodyModel[106] = new ModelRendererTurbo(this, 401, 273, textureX, textureY); // Box 329
		bodyModel[107] = new ModelRendererTurbo(this, 433, 273, textureX, textureY); // Box 330
		bodyModel[108] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 331
		bodyModel[109] = new ModelRendererTurbo(this, 457, 273, textureX, textureY); // Box 332
		bodyModel[110] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Box 333
		bodyModel[111] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 334
		bodyModel[112] = new ModelRendererTurbo(this, 241, 289, textureX, textureY); // Box 335
		bodyModel[113] = new ModelRendererTurbo(this, 281, 289, textureX, textureY); // Box 336
		bodyModel[114] = new ModelRendererTurbo(this, 305, 289, textureX, textureY); // Box 337
		bodyModel[115] = new ModelRendererTurbo(this, 465, 289, textureX, textureY); // Box 338
		bodyModel[116] = new ModelRendererTurbo(this, 417, 297, textureX, textureY); // Box 339
		bodyModel[117] = new ModelRendererTurbo(this, 313, 305, textureX, textureY); // Box 340
		bodyModel[118] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 341
		bodyModel[119] = new ModelRendererTurbo(this, 201, 289, textureX, textureY); // Box 342
		bodyModel[120] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 343
		bodyModel[121] = new ModelRendererTurbo(this, 73, 313, textureX, textureY); // Box 344
		bodyModel[122] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 345
		bodyModel[123] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 346
		bodyModel[124] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 347
		bodyModel[125] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 348
		bodyModel[126] = new ModelRendererTurbo(this, 377, 305, textureX, textureY); // Box 349
		bodyModel[127] = new ModelRendererTurbo(this, 225, 305, textureX, textureY); // Box 350
		bodyModel[128] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Box 351
		bodyModel[129] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 352
		bodyModel[130] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 353
		bodyModel[131] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 354
		bodyModel[132] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 355
		bodyModel[133] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 356
		bodyModel[134] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 357
		bodyModel[135] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 358
		bodyModel[136] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 359
		bodyModel[137] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 360
		bodyModel[138] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 361
		bodyModel[139] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 362
		bodyModel[140] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 363
		bodyModel[141] = new ModelRendererTurbo(this, 153, 313, textureX, textureY); // Box 364
		bodyModel[142] = new ModelRendererTurbo(this, 201, 313, textureX, textureY); // Box 365
		bodyModel[143] = new ModelRendererTurbo(this, 225, 321, textureX, textureY); // Box 366
		bodyModel[144] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 367
		bodyModel[145] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 368
		bodyModel[146] = new ModelRendererTurbo(this, 265, 289, textureX, textureY); // Box 369
		bodyModel[147] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 370
		bodyModel[148] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 371
		bodyModel[149] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 372
		bodyModel[150] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 373
		bodyModel[151] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 374
		bodyModel[152] = new ModelRendererTurbo(this, 57, 313, textureX, textureY); // Box 375
		bodyModel[153] = new ModelRendererTurbo(this, 345, 321, textureX, textureY); // Box 376
		bodyModel[154] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 377
		bodyModel[155] = new ModelRendererTurbo(this, 465, 321, textureX, textureY); // Box 378
		bodyModel[156] = new ModelRendererTurbo(this, 345, 305, textureX, textureY); // Box 379
		bodyModel[157] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 380
		bodyModel[158] = new ModelRendererTurbo(this, 17, 289, textureX, textureY); // Box 381
		bodyModel[159] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Box 382
		bodyModel[160] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 383
		bodyModel[161] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 384
		bodyModel[162] = new ModelRendererTurbo(this, 489, 289, textureX, textureY); // Box 385
		bodyModel[163] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 386
		bodyModel[164] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 387
		bodyModel[165] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 388
		bodyModel[166] = new ModelRendererTurbo(this, 409, 305, textureX, textureY); // Box 389
		bodyModel[167] = new ModelRendererTurbo(this, 185, 313, textureX, textureY); // Box 390
		bodyModel[168] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 391
		bodyModel[169] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 392
		bodyModel[170] = new ModelRendererTurbo(this, 289, 321, textureX, textureY); // Box 393
		bodyModel[171] = new ModelRendererTurbo(this, 313, 329, textureX, textureY); // Box 394
		bodyModel[172] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 395
		bodyModel[173] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 396
		bodyModel[174] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 397
		bodyModel[175] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 398
		bodyModel[176] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 399
		bodyModel[177] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 400
		bodyModel[178] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 401
		bodyModel[179] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 402
		bodyModel[180] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 403
		bodyModel[181] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 404
		bodyModel[182] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 405
		bodyModel[183] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 406
		bodyModel[184] = new ModelRendererTurbo(this, 273, 321, textureX, textureY); // Box 407
		bodyModel[185] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 408
		bodyModel[186] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 409
		bodyModel[187] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 410
		bodyModel[188] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 411
		bodyModel[189] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 412
		bodyModel[190] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 413
		bodyModel[191] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 414
		bodyModel[192] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 415
		bodyModel[193] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 416
		bodyModel[194] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box 417
		bodyModel[195] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 418
		bodyModel[196] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Box 419
		bodyModel[197] = new ModelRendererTurbo(this, 449, 321, textureX, textureY); // Box 420
		bodyModel[198] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 421
		bodyModel[199] = new ModelRendererTurbo(this, 25, 337, textureX, textureY); // Box 422
		bodyModel[200] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 423
		bodyModel[201] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 424
		bodyModel[202] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 425
		bodyModel[203] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 426
		bodyModel[204] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 427
		bodyModel[205] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 428
		bodyModel[206] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 429
		bodyModel[207] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 430
		bodyModel[208] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 431
		bodyModel[209] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 432
		bodyModel[210] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Box 433
		bodyModel[211] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 434
		bodyModel[212] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 435
		bodyModel[213] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 436
		bodyModel[214] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 437
		bodyModel[215] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 449
		bodyModel[216] = new ModelRendererTurbo(this, 97, 337, textureX, textureY); // Box 450
		bodyModel[217] = new ModelRendererTurbo(this, 441, 281, textureX, textureY); // Box 451
		bodyModel[218] = new ModelRendererTurbo(this, 129, 337, textureX, textureY); // Box 452
		bodyModel[219] = new ModelRendererTurbo(this, 161, 337, textureX, textureY); // Box 453
		bodyModel[220] = new ModelRendererTurbo(this, 193, 337, textureX, textureY); // Box 454
		bodyModel[221] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 455
		bodyModel[222] = new ModelRendererTurbo(this, 385, 337, textureX, textureY); // Box 456
		bodyModel[223] = new ModelRendererTurbo(this, 9, 345, textureX, textureY); // Box 457
		bodyModel[224] = new ModelRendererTurbo(this, 33, 337, textureX, textureY); // Box 458
		bodyModel[225] = new ModelRendererTurbo(this, 81, 345, textureX, textureY); // Box 459
		bodyModel[226] = new ModelRendererTurbo(this, 113, 345, textureX, textureY); // Box 460
		bodyModel[227] = new ModelRendererTurbo(this, 145, 345, textureX, textureY); // Box 461
		bodyModel[228] = new ModelRendererTurbo(this, 177, 345, textureX, textureY); // Box 462
		bodyModel[229] = new ModelRendererTurbo(this, 209, 345, textureX, textureY); // Box 463
		bodyModel[230] = new ModelRendererTurbo(this, 241, 345, textureX, textureY); // Box 464
		bodyModel[231] = new ModelRendererTurbo(this, 273, 345, textureX, textureY); // Box 465
		bodyModel[232] = new ModelRendererTurbo(this, 345, 345, textureX, textureY); // Box 466
		bodyModel[233] = new ModelRendererTurbo(this, 401, 345, textureX, textureY); // Box 467
		bodyModel[234] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 468
		bodyModel[235] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 469
		bodyModel[236] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 470
		bodyModel[237] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 471
		bodyModel[238] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 472
		bodyModel[239] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 473
		bodyModel[240] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Box 474
		bodyModel[241] = new ModelRendererTurbo(this, 473, 241, textureX, textureY); // Box 475
		bodyModel[242] = new ModelRendererTurbo(this, 49, 249, textureX, textureY); // Box 476
		bodyModel[243] = new ModelRendererTurbo(this, 73, 249, textureX, textureY); // Box 477
		bodyModel[244] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 478
		bodyModel[245] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Box 479
		bodyModel[246] = new ModelRendererTurbo(this, 97, 249, textureX, textureY); // Box 480
		bodyModel[247] = new ModelRendererTurbo(this, 113, 249, textureX, textureY); // Box 481
		bodyModel[248] = new ModelRendererTurbo(this, 129, 249, textureX, textureY); // Box 482
		bodyModel[249] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Box 483
		bodyModel[250] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 484
		bodyModel[251] = new ModelRendererTurbo(this, 433, 345, textureX, textureY); // Box 485
		bodyModel[252] = new ModelRendererTurbo(this, 465, 345, textureX, textureY); // Box 486
		bodyModel[253] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // Box 487
		bodyModel[254] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 488
		bodyModel[255] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Box 489
		bodyModel[256] = new ModelRendererTurbo(this, 33, 353, textureX, textureY); // Box 490
		bodyModel[257] = new ModelRendererTurbo(this, 297, 353, textureX, textureY); // Box 491
		bodyModel[258] = new ModelRendererTurbo(this, 273, 265, textureX, textureY); // Box 492
		bodyModel[259] = new ModelRendererTurbo(this, 337, 329, textureX, textureY); // Box 493
		bodyModel[260] = new ModelRendererTurbo(this, 113, 337, textureX, textureY); // Box 494
		bodyModel[261] = new ModelRendererTurbo(this, 145, 337, textureX, textureY); // Box 495
		bodyModel[262] = new ModelRendererTurbo(this, 177, 337, textureX, textureY); // Box 496
		bodyModel[263] = new ModelRendererTurbo(this, 225, 345, textureX, textureY); // Box 497
		bodyModel[264] = new ModelRendererTurbo(this, 313, 249, textureX, textureY); // Box 498
		bodyModel[265] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 499
		bodyModel[266] = new ModelRendererTurbo(this, 505, 249, textureX, textureY); // Box 500
		bodyModel[267] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Box 501
		bodyModel[268] = new ModelRendererTurbo(this, 377, 345, textureX, textureY); // Box 502
		bodyModel[269] = new ModelRendererTurbo(this, 33, 273, textureX, textureY); // Box 503
		bodyModel[270] = new ModelRendererTurbo(this, 497, 345, textureX, textureY); // Box 504
		bodyModel[271] = new ModelRendererTurbo(this, 505, 273, textureX, textureY); // Box 505
		bodyModel[272] = new ModelRendererTurbo(this, 337, 233, textureX, textureY); // Box 506
		bodyModel[273] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 507
		bodyModel[274] = new ModelRendererTurbo(this, 449, 297, textureX, textureY); // Box 508
		bodyModel[275] = new ModelRendererTurbo(this, 241, 313, textureX, textureY); // Box 509
		bodyModel[276] = new ModelRendererTurbo(this, 377, 321, textureX, textureY); // Box 510
		bodyModel[277] = new ModelRendererTurbo(this, 409, 321, textureX, textureY); // Box 511
		bodyModel[278] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 513
		bodyModel[279] = new ModelRendererTurbo(this, 321, 273, textureX, textureY); // Box 514
		bodyModel[280] = new ModelRendererTurbo(this, 361, 273, textureX, textureY); // Box 515
		bodyModel[281] = new ModelRendererTurbo(this, 393, 273, textureX, textureY); // Box 516
		bodyModel[282] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Box 517
		bodyModel[283] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 518
		bodyModel[284] = new ModelRendererTurbo(this, 201, 289, textureX, textureY); // Box 519
		bodyModel[285] = new ModelRendererTurbo(this, 57, 353, textureX, textureY); // Box 520
		bodyModel[286] = new ModelRendererTurbo(this, 297, 289, textureX, textureY); // Box 521
		bodyModel[287] = new ModelRendererTurbo(this, 489, 313, textureX, textureY); // Box 522
		bodyModel[288] = new ModelRendererTurbo(this, 449, 305, textureX, textureY); // Box 524
		bodyModel[289] = new ModelRendererTurbo(this, 497, 305, textureX, textureY); // Box 525
		bodyModel[290] = new ModelRendererTurbo(this, 89, 361, textureX, textureY); // Box 526
		bodyModel[291] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 527
		bodyModel[292] = new ModelRendererTurbo(this, 425, 273, textureX, textureY); // Box 528
		bodyModel[293] = new ModelRendererTurbo(this, 449, 273, textureX, textureY); // Box 529
		bodyModel[294] = new ModelRendererTurbo(this, 57, 329, textureX, textureY); // Box 530
		bodyModel[295] = new ModelRendererTurbo(this, 401, 337, textureX, textureY); // Box 531
		bodyModel[296] = new ModelRendererTurbo(this, 129, 361, textureX, textureY); // Box 532
		bodyModel[297] = new ModelRendererTurbo(this, 385, 361, textureX, textureY); // Box 147
		bodyModel[298] = new ModelRendererTurbo(this, 217, 361, textureX, textureY); // Box 18
		bodyModel[299] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 21
		bodyModel[300] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 22
		bodyModel[301] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 23
		bodyModel[302] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Box 220
		bodyModel[303] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 539
		bodyModel[304] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 540
		bodyModel[305] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 541
		bodyModel[306] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 542
		bodyModel[307] = new ModelRendererTurbo(this, 297, 265, textureX, textureY); // Box 543
		bodyModel[308] = new ModelRendererTurbo(this, 249, 289, textureX, textureY); // Box 544
		bodyModel[309] = new ModelRendererTurbo(this, 65, 369, textureX, textureY); // Box 545
		bodyModel[310] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Box 546
		bodyModel[311] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Box 547
		bodyModel[312] = new ModelRendererTurbo(this, 473, 273, textureX, textureY); // Box 548
		bodyModel[313] = new ModelRendererTurbo(this, 321, 289, textureX, textureY); // Box 549
		bodyModel[314] = new ModelRendererTurbo(this, 217, 369, textureX, textureY); // Box 550
		bodyModel[315] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Box 551
		bodyModel[316] = new ModelRendererTurbo(this, 497, 273, textureX, textureY); // Box 552
		bodyModel[317] = new ModelRendererTurbo(this, 17, 289, textureX, textureY); // Box 553
		bodyModel[318] = new ModelRendererTurbo(this, 281, 369, textureX, textureY); // Box 554
		bodyModel[319] = new ModelRendererTurbo(this, 57, 313, textureX, textureY); // Box 555
		bodyModel[320] = new ModelRendererTurbo(this, 81, 313, textureX, textureY); // Box 556
		bodyModel[321] = new ModelRendererTurbo(this, 161, 313, textureX, textureY); // Box 557
		bodyModel[322] = new ModelRendererTurbo(this, 273, 265, textureX, textureY); // Box 558
		bodyModel[323] = new ModelRendererTurbo(this, 337, 329, textureX, textureY); // Box 559
		bodyModel[324] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 560

		bodyModel[0].addShapeBox(0F, 0F, 0F, 44, 10, 29, 0F,0F, 1.5F, -0.5F, 0F, 3F, -6.5F, 0F, 3F, -6.5F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -0.5F); // Box 1
		bodyModel[0].setRotationPoint(115F, -7F, -14.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 10, 15, 0F,0F, 0F, 0.5F, 6.5F, 0F, -7F, 6.5F, 0F, -7F, 0F, 0F, 0.5F, 0F, 0F, 0F, 3F, 0F, -7F, 3F, 0F, -7F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(159F, -7F, -7.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 4, 15, 0F,0F, -1F, 0.5F, 4.5F, 0.2F, -6.5F, 4.5F, 0.2F, -6.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 2.5F, 0F, -7F, 2.5F, 0F, -7F, 0F, 0F, 0.5F); // Box 3
		bodyModel[2].setRotationPoint(159F, -11F, -7.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F); // Box 4
		bodyModel[3].setRotationPoint(178F, -25F, -0.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 73, 10, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-43F, -7F, -19F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 50, 10, 38, 0F,0F, 0F, 0F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(30F, -7F, -19F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 78, 10, 38, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 7
		bodyModel[6].setRotationPoint(-121F, -7F, -19F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 45, 10, 28, 0F,0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F); // Box 8
		bodyModel[7].setRotationPoint(-166F, -7F, -14F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 11, 8, 16, 0F,0F, 0.5F, -5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -5F, 1.5F, -1F, -5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.5F, -1F, -5F); // Box 9
		bodyModel[8].setRotationPoint(-177F, -7.5F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 35, 10, 32, 0F,0F, 0.5F, -0.5F, 0F, 1.5F, -2F, 0F, 1.5F, -2F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 10
		bodyModel[9].setRotationPoint(80F, -7F, -16F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-77.25F, -12F, -2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-77.25F, -12F, 2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 8, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-77.25F, -12F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-95F, -7.5F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(-95F, -7.5F, -2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-95F, -7.5F, 2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(92F, -8.5F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(92F, -8.5F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(92F, -8.5F, 2F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 12, 6, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(74F, -13.25F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 12, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(74F, -13.25F, -2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 12, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(74F, -13.25F, 2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 78, 7, 38, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -10F); // Box 194
		bodyModel[22].setRotationPoint(-121F, 3F, -19F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 73, 5, 38, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 195
		bodyModel[23].setRotationPoint(-43F, 10F, -19F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 50, 4, 38, 0F,0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 1F, -8F, 0F, 0F, -10.5F, 0F, 0F, -10.5F, 0F, 1F, -8F); // Box 196
		bodyModel[24].setRotationPoint(30F, 10F, -19F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 35, 11, 32, 0F,0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -7.3F, 0F, 0F, -11.5F, 0F, 0F, -11.5F, 0F, 0F, -7.3F); // Box 197
		bodyModel[25].setRotationPoint(80F, 3F, -16F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 44, 11, 31, 0F,0F, 0F, -1.5F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -1.5F, 0F, 0F, -11F, 0F, -1F, -14F, 0F, -1F, -14F, 0F, 0F, -11F); // Box 198
		bodyModel[26].setRotationPoint(115F, 3F, -15.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 10, 17, 0F,0F, 0F, -1F, 3F, 0F, -8F, 3F, 0F, -8F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -7F); // Box 199
		bodyModel[27].setRotationPoint(159F, 3F, -8.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 45, 7, 28, 0F,0F, 2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -6F, 0F, -4.5F, -11F, 0F, 3F, -8F, 0F, 3F, -8F, 0F, -4.5F, -11F); // Box 200
		bodyModel[28].setRotationPoint(-166F, 3F, -14F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 3, 12, 0F,1.5F, 1.5F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 1.5F, 1.5F, -3F, -2F, -1F, -4F, 0F, 1.5F, -3F, 0F, 1.5F, -3F, -2F, -1F, -4F); // Box 202
		bodyModel[29].setRotationPoint(-177F, 1F, -6F);

		bodyModel[30].addShapeBox(-10F, 0F, -2.5F, 10, 3, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 203
		bodyModel[30].setRotationPoint(-44F, -15F, -8.5F);

		bodyModel[31].addShapeBox(0F, 0F, -2.5F, 13, 3, 5, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 204
		bodyModel[31].setRotationPoint(-44F, -15F, -8.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 205
		bodyModel[32].setRotationPoint(-179.5F, -23F, -0.5F);
		bodyModel[32].rotateAngleZ = 0.2443461F;

		bodyModel[33].addShapeBox(-20.7F, -5.5F, 0F, 30, 19, 1, 0F,-13F, -10F, -0.35F, -9F, -6F, -0.35F, -9F, -6F, -0.35F, -13F, -10F, -0.35F, -12.5F, -3F, -0.35F, -9F, -6F, -0.35F, -9F, -6F, -0.35F, -12.5F, -3F, -0.35F); // Box 206
		bodyModel[33].setRotationPoint(-179.5F, -23F, -0.5F);
		bodyModel[33].rotateAngleZ = 0.2443461F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 73, 7, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 210
		bodyModel[34].setRotationPoint(-43F, 3F, -19F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 50, 7, 38, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F); // Box 211
		bodyModel[35].setRotationPoint(30F, 3F, -19F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 78, 4, 38, 0F,0F, 0.5F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -10F, 0F, -1F, -13F, 0F, 1F, -8F, 0F, 1F, -8F, 0F, -1F, -13F); // Box 212
		bodyModel[36].setRotationPoint(-121F, 10F, -19F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[37].setRotationPoint(133.5F, -10.5F, -4.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[38].setRotationPoint(133.5F, -10.5F, 2.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F); // Box 262
		bodyModel[39].setRotationPoint(150F, -10F, -4F);
		bodyModel[39].rotateAngleZ = 0.01745329F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F); // Box 263
		bodyModel[40].setRotationPoint(150F, -10F, 3F);
		bodyModel[40].rotateAngleZ = 0.01745329F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, -10F, -1F, 0F, 9.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 1F, 0F, 10F, 1F, 0F); // Box 264
		bodyModel[41].setRotationPoint(114F, -9.5F, 0F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,9.2F, -1F, 0F, -10F, -1F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 10F, 1F, 0F, -10F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[42].setRotationPoint(114F, -9.5F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 53, 4, 9, 0F,50F, 0.2F, 5F, 50F, 0.5F, 6F, 50F, 0.5F, 6F, 50F, 0.2F, 5F, 50F, 0F, 5F, 50F, 0F, 6F, 50F, 0F, 6F, 50F, 0F, 5F); // Box 266
		bodyModel[43].setRotationPoint(-23F, -10.5F, -4.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 267
		bodyModel[44].setRotationPoint(-78F, -10.7F, -9.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 268
		bodyModel[45].setRotationPoint(-78F, -10.7F, 2.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,40F, 0F, 0F, 40F, 0.3F, -0.5F, 40F, 0.3F, -0.5F, 40F, 0F, 0F, 40F, -0.5F, 0F, 40F, -0.8F, -0.5F, 40F, -0.8F, -0.5F, 40F, -0.5F, 0F); // Box 269
		bodyModel[46].setRotationPoint(2.5F, -10.7F, -17.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,40F, 0F, 0F, 40F, 0.3F, -0.5F, 40F, 0.3F, -0.5F, 40F, 0F, 0F, 40F, -0.5F, 0F, 40F, -0.8F, -0.5F, 40F, -0.8F, -0.5F, 40F, -0.5F, 0F); // Box 270
		bodyModel[47].setRotationPoint(2.5F, -10.7F, 9.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[48].setRotationPoint(-58F, -17.5F, -5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[49].setRotationPoint(-50F, -17.5F, -4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, 0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0F, 0F, 0F); // Box 273
		bodyModel[50].setRotationPoint(-58F, -19.5F, -5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[51].setRotationPoint(-54.5F, -19.5F, -8.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[52].setRotationPoint(-47.5F, -23.5F, -8.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 276
		bodyModel[53].setRotationPoint(-43.5F, -23.5F, -8.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[54].setRotationPoint(-42.5F, -23.5F, -6.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 278
		bodyModel[55].setRotationPoint(-39.5F, -23.5F, -6.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 2, 17, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 279
		bodyModel[56].setRotationPoint(-50.5F, -23.5F, -8.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 280
		bodyModel[57].setRotationPoint(-54.5F, -10.7F, -11.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 281
		bodyModel[58].setRotationPoint(-54.5F, -10.7F, 9.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[59].setRotationPoint(-26.5F, -25.5F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[60].setRotationPoint(-26.5F, -27.5F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[61].setRotationPoint(-25.5F, -27.5F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 285
		bodyModel[62].setRotationPoint(-25.5F, -27.5F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[63].setRotationPoint(-25.5F, -31.5F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[64].setRotationPoint(-25.5F, -31.5F, -3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 288
		bodyModel[65].setRotationPoint(-25.5F, -31.5F, 2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 15F, -0.2F, -0.2F, 15F, -0.2F, -0.2F, 15F, -0.2F, -0.2F, 15F, -0.2F, -0.2F, 15F, -0.2F, -0.2F, 15F, -0.2F, -0.2F, 15F, -0.2F, -0.2F, 15F, -0.2F); // Box 289
		bodyModel[66].setRotationPoint(-18.8F, -40.5F, -0.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 290
		bodyModel[67].setRotationPoint(-18.5F, -52.7F, -4.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 291
		bodyModel[68].setRotationPoint(-24.5F, -23.5F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 292
		bodyModel[69].setRotationPoint(-24.5F, -23.5F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 293
		bodyModel[70].setRotationPoint(-24.5F, -23.5F, 2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F); // Box 294
		bodyModel[71].setRotationPoint(-24.5F, -23.5F, 6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 295
		bodyModel[72].setRotationPoint(-26.5F, -25.5F, -6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F); // Box 296
		bodyModel[73].setRotationPoint(-26.5F, -25.5F, 2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 297
		bodyModel[74].setRotationPoint(-19.5F, -25.5F, -8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F); // Box 298
		bodyModel[75].setRotationPoint(-19.5F, -25.5F, 2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[76].setRotationPoint(-23F, -29.8F, -7.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[77].setRotationPoint(-23F, -30.8F, -7.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 301
		bodyModel[78].setRotationPoint(-23F, -28.8F, -7.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 302
		bodyModel[79].setRotationPoint(-23F, -27.8F, -6.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[80].setRotationPoint(-23F, -29.8F, 4.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[81].setRotationPoint(-23F, -30.8F, 4.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 305
		bodyModel[82].setRotationPoint(-23F, -28.8F, 4.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 306
		bodyModel[83].setRotationPoint(-23F, -27.8F, 5.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[84].setRotationPoint(-23F, -33.8F, -1.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[85].setRotationPoint(-23F, -34.8F, -1.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 309
		bodyModel[86].setRotationPoint(-23F, -32.8F, -1.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 310
		bodyModel[87].setRotationPoint(-23F, -31.8F, -0.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[88].setRotationPoint(15.5F, -15.5F, -3.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 312
		bodyModel[89].setRotationPoint(15F, -16.2F, -4F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 5, 15, 9, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[90].setRotationPoint(26F, -25.5F, -4.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 15, 9, 0F,1.5F, 0F, -2.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 314
		bodyModel[91].setRotationPoint(24F, -25.5F, -4.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 15, 9, 0F,1F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, 0F, 0F, 0F); // Box 315
		bodyModel[92].setRotationPoint(31F, -25.5F, -4.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[93].setRotationPoint(25.5F, -26.5F, -5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-0.4F, 0.2F, -3.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, -0.4F, 0.2F, -3.5F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F); // Box 317
		bodyModel[94].setRotationPoint(22.5F, -26.5F, -5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0.2F, -1.5F, -0.7F, 0.2F, -3.5F, -0.7F, 0.2F, -3.5F, 0F, 0.2F, -1.5F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F); // Box 318
		bodyModel[95].setRotationPoint(29.5F, -26.5F, -5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[96].setRotationPoint(25.5F, -30F, -3.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, 1F, 0F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F); // Box 320
		bodyModel[97].setRotationPoint(29.5F, -29F, -3.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, -1.5F, -2F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1.5F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F); // Box 321
		bodyModel[98].setRotationPoint(23F, -29F, -3.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,-2F, -0.4F, -2F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, -2F, -0.4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[99].setRotationPoint(25.5F, -33F, -3.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, -2.5F, -1F, -0.5F, -2.5F, -1F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, -2F, 0F, 0F, 0F); // Box 323
		bodyModel[100].setRotationPoint(29.5F, -32F, -3.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[101].setRotationPoint(21F, -15F, -6.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 16, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[102].setRotationPoint(23F, -15F, -6.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 16, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[103].setRotationPoint(23F, -15F, 4.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 9, 15, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[104].setRotationPoint(50F, -25.5F, -5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 5, 33, 10, 0F,0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F); // Box 328
		bodyModel[105].setRotationPoint(45F, -43.5F, -5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 19, 10, 0F,0F, 0F, 0F, 0.5F, 0F, -1.8F, 0.5F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.8F, 0.5F, 0F, -1.8F, 0F, 0F, 0F); // Box 329
		bodyModel[106].setRotationPoint(50F, -43.5F, -5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[107].setRotationPoint(51.3F, -56F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 331
		bodyModel[108].setRotationPoint(53.3F, -52F, -3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 13, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 332
		bodyModel[109].setRotationPoint(49.3F, -56F, -3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 333
		bodyModel[110].setRotationPoint(53.3F, -55F, -3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 334
		bodyModel[111].setRotationPoint(50.7F, -52F, -3.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 335
		bodyModel[112].setRotationPoint(50.7F, -51.5F, -8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 336
		bodyModel[113].setRotationPoint(59F, -25.5F, -5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 15, 10, 0F,0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 337
		bodyModel[114].setRotationPoint(63F, -25.5F, -5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 15, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[115].setRotationPoint(60F, -25.5F, -5.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 6, 3, 19, 0F,0F, 0F, 0F, 0.2F, 0F, -6.2F, 0.2F, 0F, -6.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, -6.2F, 0.2F, 0.2F, -6.2F, 0F, 0.2F, 0F); // Box 339
		bodyModel[116].setRotationPoint(62.5F, -20F, -9.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 6, 3, 19, 0F,0F, 0F, 0F, 0.2F, 0F, -6.2F, 0.2F, 0F, -6.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -6.2F, 0.2F, 0F, -6.2F, 0F, 0F, 0F); // Box 340
		bodyModel[117].setRotationPoint(62.5F, -24F, -9.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 15, 3, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[118].setRotationPoint(47.5F, -24F, -9.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 15, 2, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[119].setRotationPoint(42F, -23F, -5.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 343
		bodyModel[120].setRotationPoint(40F, -23F, -5.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 20, 3, 19, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[121].setRotationPoint(42.3F, -19.8F, -9.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[122].setRotationPoint(39.3F, -19.8F, -11.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[123].setRotationPoint(39.3F, -19.8F, -12.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[124].setRotationPoint(39.3F, -19.8F, 9.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F); // Box 348
		bodyModel[125].setRotationPoint(39.3F, -19.8F, 11.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 23, 0F,0F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[126].setRotationPoint(38.3F, -17.8F, -11.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 350
		bodyModel[127].setRotationPoint(64.5F, -25.5F, -5.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0.2F, -0.8F, -2F, 0.2F, -0.8F, -2F, 0F, -0.8F, 0F); // Box 351
		bodyModel[128].setRotationPoint(66.5F, -25.5F, -5.5F);

		bodyModel[129].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 352
		bodyModel[129].setRotationPoint(68.5F, -25.3F, -3F);

		bodyModel[130].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 353
		bodyModel[130].setRotationPoint(68.5F, -25.3F, -1F);

		bodyModel[131].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 354
		bodyModel[131].setRotationPoint(68.5F, -25.3F, 3F);

		bodyModel[132].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 355
		bodyModel[132].setRotationPoint(68.5F, -25.3F, 1F);

		bodyModel[133].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 356
		bodyModel[133].setRotationPoint(68.5F, -21.3F, 3F);

		bodyModel[134].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 357
		bodyModel[134].setRotationPoint(68.5F, -21.3F, 1F);

		bodyModel[135].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 358
		bodyModel[135].setRotationPoint(68.5F, -21.3F, -1F);

		bodyModel[136].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 359
		bodyModel[136].setRotationPoint(68.5F, -21.3F, -3F);

		bodyModel[137].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 360
		bodyModel[137].setRotationPoint(66.2F, -21.3F, 5.5F);

		bodyModel[138].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 361
		bodyModel[138].setRotationPoint(66.2F, -21.3F, -5.5F);

		bodyModel[139].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 362
		bodyModel[139].setRotationPoint(64.2F, -21.3F, -7.5F);

		bodyModel[140].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 363
		bodyModel[140].setRotationPoint(64.2F, -21.3F, 7.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[141].setRotationPoint(56F, -33.5F, -8.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 365
		bodyModel[142].setRotationPoint(61F, -33.5F, -8.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 13, 2, 17, 0F,-0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F); // Box 366
		bodyModel[143].setRotationPoint(43F, -33.5F, -8.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 367
		bodyModel[144].setRotationPoint(60.5F, -31.5F, -5.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 368
		bodyModel[145].setRotationPoint(60.5F, -31.5F, 4.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F); // Box 369
		bodyModel[146].setRotationPoint(54.5F, -39.5F, -3.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, -0.3F, 0F); // Box 370
		bodyModel[147].setRotationPoint(58.5F, -39.5F, -2.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[148].setRotationPoint(57.5F, -42F, -1.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[149].setRotationPoint(57.5F, -43F, -1.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 373
		bodyModel[150].setRotationPoint(57.5F, -41F, -1.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 374
		bodyModel[151].setRotationPoint(57.5F, -40F, -0.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F,0F, -0.3F, 0F, 0F, -0.3F, -1.5F, 0F, -0.3F, -1.5F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 375
		bodyModel[152].setRotationPoint(51F, -46.5F, -5.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 3, 19, 0F,0F, -0.3F, 0F, 0F, -0.3F, -4F, 0F, -0.3F, -4F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 376
		bodyModel[153].setRotationPoint(48F, -46.5F, -9.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 3, 19, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[154].setRotationPoint(45F, -46.5F, -9.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 3, 19, 0F,0.3F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, -2F, 0.3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -2F); // Box 378
		bodyModel[155].setRotationPoint(42F, -46.5F, -9.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 7, 5, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 2F, -0.3F, 0F, 0F, -0.3F, 0F, -3F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, 1F, -2F, 0F, 1F); // Box 379
		bodyModel[156].setRotationPoint(44F, -43.8F, -8.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 5, 7, 5, 0F,0F, -0.3F, 0F, 2F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, -5F, -3F, 0F, -5F); // Box 380
		bodyModel[157].setRotationPoint(44F, -43.8F, 3.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 381
		bodyModel[158].setRotationPoint(46F, -49F, -9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 382
		bodyModel[159].setRotationPoint(44F, -49F, -9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[160].setRotationPoint(43.5F, -50F, -8.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 384
		bodyModel[161].setRotationPoint(46.4F, -48.5F, -10.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 385
		bodyModel[162].setRotationPoint(46F, -49F, 3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 386
		bodyModel[163].setRotationPoint(44F, -49F, 3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[164].setRotationPoint(43.5F, -50F, 3.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 388
		bodyModel[165].setRotationPoint(46.4F, -48.5F, 1.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 389
		bodyModel[166].setRotationPoint(50.5F, -48F, -4F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, -0.8F, -2F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.8F, -2F); // Box 390
		bodyModel[167].setRotationPoint(47.5F, -48F, -4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -2F, 0F, -0.8F, -2F, 0F, -0.8F, 0F); // Box 391
		bodyModel[168].setRotationPoint(55.5F, -48F, -4F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 392
		bodyModel[169].setRotationPoint(47.3F, -65.5F, -0.5F);
		bodyModel[169].rotateAngleZ = 0.08726646F;

		bodyModel[170].addShapeBox(0F, 0F, -4F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[170].setRotationPoint(42F, -43.5F, 7F);
		bodyModel[170].rotateAngleY = 0.64577182F;

		bodyModel[171].addShapeBox(0F, 0F, -14F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[171].setRotationPoint(42F, -43.5F, -7F);
		bodyModel[171].rotateAngleY = -0.64577182F;

		bodyModel[172].addShapeBox(-0.5F, 10F, -0.5F, 1, 11, 1, 0F,-0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F); // Box 395
		bodyModel[172].setRotationPoint(34F, -43F, -18F);
		bodyModel[172].rotateAngleX = 0.54105207F;
		bodyModel[172].rotateAngleZ = 0.17453293F;

		bodyModel[173].addShapeBox(-0.5F, 10F, -0.5F, 1, 9, 1, 0F,-0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F); // Box 396
		bodyModel[173].setRotationPoint(37F, -43F, -14F);
		bodyModel[173].rotateAngleX = 0.41887902F;
		bodyModel[173].rotateAngleZ = 0.08726646F;

		bodyModel[174].addShapeBox(-0.5F, 10F, -0.5F, 1, 8, 1, 0F,-0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F); // Box 397
		bodyModel[174].setRotationPoint(40F, -43F, -10F);
		bodyModel[174].rotateAngleX = 0.31415927F;
		bodyModel[174].rotateAngleZ = -0.03490659F;

		bodyModel[175].addShapeBox(-0.5F, 10F, -0.5F, 1, 8, 1, 0F,-0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F); // Box 398
		bodyModel[175].setRotationPoint(40F, -43F, 10F);
		bodyModel[175].rotateAngleX = -0.31415927F;
		bodyModel[175].rotateAngleZ = -0.03490659F;

		bodyModel[176].addShapeBox(-0.5F, 10F, -0.5F, 1, 9, 1, 0F,-0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F); // Box 399
		bodyModel[176].setRotationPoint(37F, -43F, 14F);
		bodyModel[176].rotateAngleX = -0.41887902F;
		bodyModel[176].rotateAngleZ = 0.08726646F;

		bodyModel[177].addShapeBox(-0.5F, 10F, -0.5F, 1, 11, 1, 0F,-0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F); // Box 400
		bodyModel[177].setRotationPoint(34F, -43F, 18F);
		bodyModel[177].rotateAngleX = -0.54105207F;
		bodyModel[177].rotateAngleZ = 0.17453293F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[178].setRotationPoint(64F, -28.5F, -0.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[179].setRotationPoint(57F, -26.5F, -1.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[180].setRotationPoint(57F, -26.5F, -2.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 404
		bodyModel[181].setRotationPoint(57F, -26.5F, 1.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[182].setRotationPoint(58.5F, -29.5F, -0.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[183].setRotationPoint(58.5F, -30F, -0.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 6, 7, 5, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 407
		bodyModel[184].setRotationPoint(62.5F, -17F, -2.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 408
		bodyModel[185].setRotationPoint(61.8F, -16.8F, -9.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 409
		bodyModel[186].setRotationPoint(61.8F, -16.8F, 8.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 410
		bodyModel[187].setRotationPoint(56.8F, -16.8F, 8.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 411
		bodyModel[188].setRotationPoint(56.8F, -16.8F, -9.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 412
		bodyModel[189].setRotationPoint(52.8F, -16.8F, 8.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 413
		bodyModel[190].setRotationPoint(52.8F, -16.8F, -9.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 414
		bodyModel[191].setRotationPoint(41.8F, -16.8F, 8.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 415
		bodyModel[192].setRotationPoint(41.8F, -16.8F, -9.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 416
		bodyModel[193].setRotationPoint(40.4F, -16.8F, 10.2F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 417
		bodyModel[194].setRotationPoint(40.4F, -16.8F, -11.2F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[195].setRotationPoint(13F, -10.7F, -17.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[196].setRotationPoint(13F, -10.7F, 16.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[197].setRotationPoint(8.5F, -12F, 12F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 421
		bodyModel[198].setRotationPoint(10.5F, -12F, 12F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 422
		bodyModel[199].setRotationPoint(6.5F, -12F, 12F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F); // Box 423
		bodyModel[200].setRotationPoint(8.5F, -13F, 13.5F);
		bodyModel[200].rotateAngleZ = 0.01745329F;

		bodyModel[201].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F); // Box 424
		bodyModel[201].setRotationPoint(8.5F, -14.5F, 13.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[202].setRotationPoint(8.5F, -16F, 13F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 426
		bodyModel[203].setRotationPoint(56F, -10.7F, -17F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 427
		bodyModel[204].setRotationPoint(56F, -10.7F, 16F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 428
		bodyModel[205].setRotationPoint(47F, -10.7F, -17F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 429
		bodyModel[206].setRotationPoint(47F, -10.7F, 16F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 430
		bodyModel[207].setRotationPoint(34F, -10.7F, -17F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 431
		bodyModel[208].setRotationPoint(34F, -10.7F, 16F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 432
		bodyModel[209].setRotationPoint(6F, -10.7F, -17.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 433
		bodyModel[210].setRotationPoint(6F, -10.7F, 16.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 434
		bodyModel[211].setRotationPoint(-21F, -10.7F, -17.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 435
		bodyModel[212].setRotationPoint(-21F, -10.7F, 16.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 436
		bodyModel[213].setRotationPoint(-36.5F, -10.7F, -17.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 437
		bodyModel[214].setRotationPoint(-36.5F, -10.7F, 16.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[215].setRotationPoint(-6F, -7.7F, -17F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.3F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 450
		bodyModel[216].setRotationPoint(-5F, -8.8F, -24.25F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 451
		bodyModel[217].setRotationPoint(-5F, -9.2F, -25F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 452
		bodyModel[218].setRotationPoint(-5F, -8.4F, -24F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 453
		bodyModel[219].setRotationPoint(-3.9F, -8.4F, -24F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.3F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 454
		bodyModel[220].setRotationPoint(-3.9F, -8.8F, -24.25F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 455
		bodyModel[221].setRotationPoint(-3.9F, -9.2F, -25F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 456
		bodyModel[222].setRotationPoint(-6.1F, -8.4F, -24F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.3F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 457
		bodyModel[223].setRotationPoint(-6.1F, -8.8F, -24.25F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 458
		bodyModel[224].setRotationPoint(-6.1F, -9.2F, -25F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 459
		bodyModel[225].setRotationPoint(-5F, -8.8F, 13.25F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 460
		bodyModel[226].setRotationPoint(-5F, -9.2F, 13F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F); // Box 461
		bodyModel[227].setRotationPoint(-5F, -8.4F, 13F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F); // Box 462
		bodyModel[228].setRotationPoint(-3.9F, -8.4F, 13F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 463
		bodyModel[229].setRotationPoint(-3.9F, -8.8F, 13.25F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 464
		bodyModel[230].setRotationPoint(-3.9F, -9.2F, 13F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F); // Box 465
		bodyModel[231].setRotationPoint(-6.1F, -8.4F, 13F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 466
		bodyModel[232].setRotationPoint(-6.1F, -8.8F, 13.25F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 467
		bodyModel[233].setRotationPoint(-6.1F, -9.2F, 13F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[234].setRotationPoint(-6F, -7.7F, 14F);

		bodyModel[235].addShapeBox(-3F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 469
		bodyModel[235].setRotationPoint(-54.5F, -20.5F, -4.5F);
		bodyModel[235].rotateAngleY = 0.78539816F;
		bodyModel[235].rotateAngleZ = -0.52359878F;

		bodyModel[236].addShapeBox(-3F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 470
		bodyModel[236].setRotationPoint(-54.5F, -20.5F, 4.5F);
		bodyModel[236].rotateAngleY = -0.78539816F;
		bodyModel[236].rotateAngleZ = -0.52359878F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 471
		bodyModel[237].setRotationPoint(-54.5F, -20.5F, -4.5F);
		bodyModel[237].rotateAngleY = 0.78539816F;
		bodyModel[237].rotateAngleZ = -0.52359878F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 472
		bodyModel[238].setRotationPoint(-54.5F, -20.5F, 4.5F);
		bodyModel[238].rotateAngleY = -0.78539816F;
		bodyModel[238].rotateAngleZ = -0.52359878F;

		bodyModel[239].addShapeBox(-3F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 473
		bodyModel[239].setRotationPoint(-46.5F, -24.5F, 4.5F);
		bodyModel[239].rotateAngleY = -0.78539816F;
		bodyModel[239].rotateAngleZ = -0.52359878F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 474
		bodyModel[240].setRotationPoint(-46.5F, -24.5F, 4.5F);
		bodyModel[240].rotateAngleY = -0.78539816F;
		bodyModel[240].rotateAngleZ = -0.52359878F;

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 475
		bodyModel[241].setRotationPoint(-46.5F, -24.5F, -4.5F);
		bodyModel[241].rotateAngleY = 0.78539816F;
		bodyModel[241].rotateAngleZ = -0.52359878F;

		bodyModel[242].addShapeBox(-3F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 476
		bodyModel[242].setRotationPoint(-46.5F, -24.5F, -4.5F);
		bodyModel[242].rotateAngleY = 0.78539816F;
		bodyModel[242].rotateAngleZ = -0.52359878F;

		bodyModel[243].addShapeBox(-3F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 477
		bodyModel[243].setRotationPoint(-40.5F, -24.5F, 4.5F);
		bodyModel[243].rotateAngleY = -0.78539816F;
		bodyModel[243].rotateAngleZ = -0.52359878F;

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 478
		bodyModel[244].setRotationPoint(-40.5F, -24.5F, 4.5F);
		bodyModel[244].rotateAngleY = -0.78539816F;
		bodyModel[244].rotateAngleZ = -0.52359878F;

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 479
		bodyModel[245].setRotationPoint(-40.5F, -24.5F, -4.5F);
		bodyModel[245].rotateAngleY = 0.78539816F;
		bodyModel[245].rotateAngleZ = -0.52359878F;

		bodyModel[246].addShapeBox(-3F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 480
		bodyModel[246].setRotationPoint(-40.5F, -24.5F, -4.5F);
		bodyModel[246].rotateAngleY = 0.78539816F;
		bodyModel[246].rotateAngleZ = -0.52359878F;

		bodyModel[247].addShapeBox(-3F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 481
		bodyModel[247].setRotationPoint(61F, -35.5F, -4.5F);
		bodyModel[247].rotateAngleY = -4.10152374F;
		bodyModel[247].rotateAngleZ = -0.52359878F;

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 482
		bodyModel[248].setRotationPoint(61F, -35.5F, -4.5F);
		bodyModel[248].rotateAngleY = -4.10152374F;
		bodyModel[248].rotateAngleZ = -0.52359878F;

		bodyModel[249].addShapeBox(-3F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 483
		bodyModel[249].setRotationPoint(60F, -35.5F, 4.5F);
		bodyModel[249].rotateAngleY = 4.10152374F;
		bodyModel[249].rotateAngleZ = -0.52359878F;

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 484
		bodyModel[250].setRotationPoint(60F, -35.5F, 4.5F);
		bodyModel[250].rotateAngleY = 4.10152374F;
		bodyModel[250].rotateAngleZ = -0.52359878F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 7, 4, 8, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 485
		bodyModel[251].setRotationPoint(80F, -11F, 2.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 7, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 486
		bodyModel[252].setRotationPoint(80F, -11F, -10.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.3F, 1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 1F, 0F, 1.5F, 1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, 1.5F, 1F); // Box 487
		bodyModel[253].setRotationPoint(54.5F, -39.2F, -1.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[254].setRotationPoint(-28F, -15F, -5.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[255].setRotationPoint(-28F, -15F, 3.5F);

		bodyModel[256].addShapeBox(-10F, 0F, 2.5F, 10, 3, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 490
		bodyModel[256].setRotationPoint(-44F, -15F, 3.5F);

		bodyModel[257].addShapeBox(0F, 0F, 2.5F, 13, 3, 5, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 491
		bodyModel[257].setRotationPoint(-44F, -15F, 3.5F);

		bodyModel[258].addShapeBox(-10F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 492
		bodyModel[258].setRotationPoint(30F, -9F, -21.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 493
		bodyModel[259].setRotationPoint(26F, -9F, -21.5F);

		bodyModel[260].addShapeBox(-10F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 494
		bodyModel[260].setRotationPoint(29F, -15F, -16.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 495
		bodyModel[261].setRotationPoint(25F, -15F, -16.5F);

		bodyModel[262].addShapeBox(-10F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 496
		bodyModel[262].setRotationPoint(29F, -15F, -12.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 497
		bodyModel[263].setRotationPoint(25F, -15F, -12.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 498
		bodyModel[264].setRotationPoint(54F, -13F, -14.5F);
		bodyModel[264].rotateAngleY = -4.10152374F;
		bodyModel[264].rotateAngleZ = -0.52359878F;

		bodyModel[265].addShapeBox(-3F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 499
		bodyModel[265].setRotationPoint(54F, -13F, -14.5F);
		bodyModel[265].rotateAngleY = -4.10152374F;
		bodyModel[265].rotateAngleZ = -0.52359878F;

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 500
		bodyModel[266].setRotationPoint(53F, -13F, 14.5F);
		bodyModel[266].rotateAngleY = 4.10152374F;
		bodyModel[266].rotateAngleZ = -0.52359878F;

		bodyModel[267].addShapeBox(-3F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 501
		bodyModel[267].setRotationPoint(53F, -13F, 14.5F);
		bodyModel[267].rotateAngleY = 4.10152374F;
		bodyModel[267].rotateAngleZ = -0.52359878F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[268].setRotationPoint(-46.5F, -40.5F, -1F);
		bodyModel[268].rotateAngleZ = 0.62831853F;

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 503
		bodyModel[269].setRotationPoint(-46.5F, -40.5F, -0.5F);
		bodyModel[269].rotateAngleZ = 0.27925268F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 33, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[270].setRotationPoint(10.5F, -28F, -1F);
		bodyModel[270].rotateAngleZ = -1.1693706F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[271].setRotationPoint(10.5F, -27F, -1F);
		bodyModel[271].rotateAngleZ = 1.22173048F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 506
		bodyModel[272].setRotationPoint(20.5F, -24F, -0.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 507
		bodyModel[273].setRotationPoint(10F, -29F, -0.5F);

		bodyModel[274].addShapeBox(-20F, 0F, -0.5F, 10, 1, 1, 0F,10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F); // Box 508
		bodyModel[274].setRotationPoint(10F, -29F, 0F);
		bodyModel[274].rotateAngleY = -0.29670597F;
		bodyModel[274].rotateAngleZ = 0.05235988F;

		bodyModel[275].addShapeBox(-20F, 0F, -0.5F, 10, 1, 1, 0F,10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F); // Box 509
		bodyModel[275].setRotationPoint(10F, -29F, 0F);
		bodyModel[275].rotateAngleY = 0.29670597F;
		bodyModel[275].rotateAngleZ = 0.05235988F;

		bodyModel[276].addShapeBox(-20F, 0F, -0.5F, 10, 1, 1, 0F,10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F); // Box 510
		bodyModel[276].setRotationPoint(10F, -29F, 0F);
		bodyModel[276].rotateAngleY = -0.29670597F;
		bodyModel[276].rotateAngleZ = 0.07853982F;

		bodyModel[277].addShapeBox(-20F, 0F, -0.5F, 10, 1, 1, 0F,10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F); // Box 511
		bodyModel[277].setRotationPoint(10F, -29F, 0F);
		bodyModel[277].rotateAngleY = 0.29670597F;
		bodyModel[277].rotateAngleZ = 0.07853982F;

		bodyModel[278].addShapeBox(10F, 0F, -0.5F, 5, 1, 1, 0F,10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F); // Box 513
		bodyModel[278].setRotationPoint(-44F, -38.5F, 0F);
		bodyModel[278].rotateAngleY = -0.34906585F;
		bodyModel[278].rotateAngleZ = -0.48869219F;

		bodyModel[279].addShapeBox(10F, 0F, -0.5F, 5, 1, 1, 0F,10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F); // Box 514
		bodyModel[279].setRotationPoint(-44F, -38.5F, 0F);
		bodyModel[279].rotateAngleY = -0.34906585F;
		bodyModel[279].rotateAngleZ = -0.52359878F;

		bodyModel[280].addShapeBox(10F, 0F, -0.5F, 5, 1, 1, 0F,10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F); // Box 515
		bodyModel[280].setRotationPoint(-44F, -38.5F, 0F);
		bodyModel[280].rotateAngleY = 0.34906585F;
		bodyModel[280].rotateAngleZ = -0.52359878F;

		bodyModel[281].addShapeBox(10F, 0F, -0.5F, 5, 1, 1, 0F,10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F); // Box 516
		bodyModel[281].setRotationPoint(-44F, -38.5F, 0F);
		bodyModel[281].rotateAngleY = 0.34906585F;
		bodyModel[281].rotateAngleZ = -0.48869219F;

		bodyModel[282].addShapeBox(0.6F, -1.2F, -1F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[282].setRotationPoint(44.5F, -10.3F, -13.5F);

		bodyModel[283].addShapeBox(0.6F, -1.2F, -1F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[283].setRotationPoint(-16.5F, -10.3F, -13.5F);

		bodyModel[284].addShapeBox(0.6F, -1.2F, -1F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[284].setRotationPoint(-28.5F, -10.3F, -13.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[285].setRotationPoint(-12F, -14F, -5.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[286].setRotationPoint(-16F, -12F, -2.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[287].setRotationPoint(-32F, -11.5F, -2.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		bodyModel[288].setRotationPoint(-34F, -12.5F, -2.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[289].setRotationPoint(-15F, -12.5F, -2F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 15, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[290].setRotationPoint(21F, -15F, 10.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[291].setRotationPoint(56.5F, -45.5F, -1.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		bodyModel[292].setRotationPoint(56.5F, -46.5F, -1.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 529
		bodyModel[293].setRotationPoint(56.5F, -44.5F, -1.5F);

		bodyModel[294].addShapeBox(-14.5F, -0.5F, -0.5F, 15, 1, 1, 0F,40F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 40F, -0.3F, -0.3F); // Box 530
		bodyModel[294].setRotationPoint(34F, -43.5F, 18F);
		bodyModel[294].rotateAngleY = 0.26179939F;
		bodyModel[294].rotateAngleZ = -0.16057029F;

		bodyModel[295].addShapeBox(-14.5F, -0.5F, -0.5F, 15, 1, 1, 0F,40F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 40F, -0.3F, -0.3F); // Box 531
		bodyModel[295].setRotationPoint(34F, -43.5F, -18F);
		bodyModel[295].rotateAngleY = -0.26179939F;
		bodyModel[295].rotateAngleZ = -0.16057029F;

		bodyModel[296].addShapeBox(0F, 0F, 0F, 40, 6, 2, 0F,13F, 2F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 13F, 2F, 0F, 0F, -0.5F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 0F, -0.5F, 0F); // Box 532
		bodyModel[296].setRotationPoint(-135F, 10F, -1F);
		bodyModel[296].rotateAngleZ = 0.01745329F;

		bodyModel[297].addShapeBox(0F, 0F, 0F, 41, 4, 1, 0F,30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0.5F, 30F, 0F, 0.5F, 10F, -0.5F, 3F, 10F, -0.5F, 3F, 10F, -0.3F, -3.8F, 10F, -0.3F, -3.8F); // Box 147
		bodyModel[297].setRotationPoint(-25F, 10F, -15F);

		bodyModel[298].addShapeBox(-3F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[298].setRotationPoint(-126.5F, 11.9F, -12.8F);
		bodyModel[298].rotateAngleZ = 0.03490659F;

		bodyModel[299].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[299].setRotationPoint(-126.5F, 12.4F, -12.3F);
		bodyModel[299].rotateAngleZ = 0.05235988F;

		bodyModel[300].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[300].setRotationPoint(-126.5F, 12.4F, -12.3F);
		bodyModel[300].rotateAngleX = 2.0943951F;
		bodyModel[300].rotateAngleZ = 0.05235988F;

		bodyModel[301].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[301].setRotationPoint(-126.5F, 12.4F, -12.3F);
		bodyModel[301].rotateAngleX = 4.1887902F;
		bodyModel[301].rotateAngleZ = 0.05235988F;

		bodyModel[302].addShapeBox(0F, -2F, 0F, 2, 6, 1, 0F,-0.5F, 0F, -2.25F, 2F, 0F, -2.25F, 2F, 0F, 1.75F, -0.5F, 0F, 1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 220
		bodyModel[302].setRotationPoint(-125.5F, 7.9F, -12.8F);
		bodyModel[302].rotateAngleZ = 0.05235988F;

		bodyModel[303].addShapeBox(-3F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[303].setRotationPoint(-126.5F, 11.9F, 12.2F);
		bodyModel[303].rotateAngleZ = 0.03490659F;

		bodyModel[304].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[304].setRotationPoint(-126.5F, 12.4F, 12.7F);
		bodyModel[304].rotateAngleX = 4.1887902F;
		bodyModel[304].rotateAngleZ = 0.05235988F;

		bodyModel[305].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[305].setRotationPoint(-126.5F, 12.4F, 12.7F);
		bodyModel[305].rotateAngleX = 2.0943951F;
		bodyModel[305].rotateAngleZ = 0.05235988F;

		bodyModel[306].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[306].setRotationPoint(-126.5F, 12.4F, 12.7F);
		bodyModel[306].rotateAngleZ = 0.05235988F;

		bodyModel[307].addShapeBox(0F, -2F, 0F, 2, 6, 1, 0F,-0.5F, 0F, 1.75F, 2F, 0F, 1.75F, 2F, 0F, -2.25F, -0.5F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 543
		bodyModel[307].setRotationPoint(-125.5F, 7.9F, 12.2F);
		bodyModel[307].rotateAngleZ = 0.05235988F;

		bodyModel[308].addShapeBox(0F, -2F, 0F, 2, 6, 1, 0F,-0.5F, 0F, 1.75F, 2F, 0F, 1.75F, 2F, 0F, -2.25F, -0.5F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 544
		bodyModel[308].setRotationPoint(-151.5F, 7.9F, 5.5F);
		bodyModel[308].rotateAngleZ = 0.05235988F;

		bodyModel[309].addShapeBox(-3F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[309].setRotationPoint(-152.5F, 11.9F, 5.5F);
		bodyModel[309].rotateAngleZ = 0.03490659F;

		bodyModel[310].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[310].setRotationPoint(-152.5F, 12.4F, 6F);
		bodyModel[310].rotateAngleX = 4.1887902F;
		bodyModel[310].rotateAngleZ = 0.05235988F;

		bodyModel[311].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		bodyModel[311].setRotationPoint(-152.5F, 12.4F, 6F);
		bodyModel[311].rotateAngleX = 2.0943951F;
		bodyModel[311].rotateAngleZ = 0.05235988F;

		bodyModel[312].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[312].setRotationPoint(-152.5F, 12.4F, 6F);
		bodyModel[312].rotateAngleZ = 0.05235988F;

		bodyModel[313].addShapeBox(0F, -2F, 0F, 2, 6, 1, 0F,-0.5F, 0F, -2.25F, 2F, 0F, -2.25F, 2F, 0F, 1.75F, -0.5F, 0F, 1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 549
		bodyModel[313].setRotationPoint(-151.5F, 7.9F, -6.5F);
		bodyModel[313].rotateAngleZ = 0.05235988F;

		bodyModel[314].addShapeBox(-3F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 0F, 0F, 0F); // Box 550
		bodyModel[314].setRotationPoint(-152.5F, 11.9F, -6.5F);
		bodyModel[314].rotateAngleZ = 0.03490659F;

		bodyModel[315].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[315].setRotationPoint(-152.5F, 12.4F, -6F);
		bodyModel[315].rotateAngleX = 4.1887902F;
		bodyModel[315].rotateAngleZ = 0.05235988F;

		bodyModel[316].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[316].setRotationPoint(-152.5F, 12.4F, -6F);
		bodyModel[316].rotateAngleX = 2.0943951F;
		bodyModel[316].rotateAngleZ = 0.05235988F;

		bodyModel[317].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[317].setRotationPoint(-152.5F, 12.4F, -6F);
		bodyModel[317].rotateAngleZ = 0.05235988F;

		bodyModel[318].addShapeBox(0F, 0F, 0F, 41, 4, 1, 0F,30F, 0F, 0.5F, 30F, 0F, 0.5F, 30F, 0F, 0F, 30F, 0F, 0F, 10F, -0.3F, -3.8F, 10F, -0.3F, -3.8F, 10F, -0.5F, 3F, 10F, -0.5F, 3F); // Box 554
		bodyModel[318].setRotationPoint(-25F, 10F, 14F);

		bodyModel[319].addShapeBox(0.6F, -1.2F, -1F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		bodyModel[319].setRotationPoint(44.5F, -10.3F, 13.5F);

		bodyModel[320].addShapeBox(0.6F, -1.2F, -1F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[320].setRotationPoint(-16.5F, -10.3F, 13.5F);

		bodyModel[321].addShapeBox(0.6F, -1.2F, -1F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[321].setRotationPoint(-28.5F, -10.3F, 13.5F);

		bodyModel[322].addShapeBox(-10F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 558
		bodyModel[322].setRotationPoint(30F, -9F, 17.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 559
		bodyModel[323].setRotationPoint(26F, -9F, 17.5F);

		bodyModel[324].addShapeBox(-20.7F, -5.5F, 0F, 30, 19, 1, 0F,-13F, -10F, -0.35F, -9F, -6F, -0.35F, -9F, -6F, -0.35F, -13F, -10F, -0.35F, -12.5F, -3F, -0.35F, -9F, -6F, -0.35F, -9F, -6F, -0.35F, -12.5F, -3F, -0.35F); // Box 560
		bodyModel[324].setRotationPoint(178F, -25F, -0.5F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 201
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 208
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 209

		leftFrontWheelModel[0].addShapeBox(-14F, 0F, -0.5F, 18, 6, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 201
		leftFrontWheelModel[0].setRotationPoint(-148F, 6F, 0F);

		leftFrontWheelModel[1].addShapeBox(-7F, 0F, -0.5F, 7, 6, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 208
		leftFrontWheelModel[1].setRotationPoint(-162F, 6F, 0F);

		leftFrontWheelModel[2].addShapeBox(-7F, 0F, -0.5F, 12, 4, 1, 0F,0F, 0F, -0.3F, 2F, 0F, -0.3F, 2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 209
		leftFrontWheelModel[2].setRotationPoint(-162F, 12F, 0F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[37];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 216
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 217
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 218
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 219
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 220
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 221
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 222
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 223
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 224
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 225
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 226
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 227
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 228
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 229
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 230
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 231
		gun_2_Model[0][16] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 233
		gun_2_Model[0][17] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 234
		gun_2_Model[0][18] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 235
		gun_2_Model[0][19] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 236
		gun_2_Model[0][20] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 237
		gun_2_Model[0][21] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 238
		gun_2_Model[0][22] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 239
		gun_2_Model[0][23] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 240
		gun_2_Model[0][24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 241
		gun_2_Model[0][25] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 242
		gun_2_Model[0][26] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 243
		gun_2_Model[0][27] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 244
		gun_2_Model[0][28] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 245
		gun_2_Model[0][29] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 246
		gun_2_Model[0][30] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 247
		gun_2_Model[0][31] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 248
		gun_2_Model[0][32] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 249
		gun_2_Model[0][33] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 250
		gun_2_Model[0][34] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 251
		gun_2_Model[0][35] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 252
		gun_2_Model[0][36] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 253

		gun_2_Model[0][0].addShapeBox(-5.5F, -0.75F, -6F, 8, 3, 12, 0F,0F, 1.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216

		gun_2_Model[0][1].addShapeBox(-5.5F, -2.75F, -6F, 8, 1, 6, 0F,-1.3F, 0.4F, -2.5F, 0F, -0.7F, -2.5F, 0F, -0.7F, 0F, -1.3F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.5F, 0F); // Box 217

		gun_2_Model[0][2].addShapeBox(2.5F, -1.75F, -6F, 1, 4, 3, 0F,0F, -0.6F, 0F, 0.1F, -0.7F, -0.3F, -0.2F, 0.1F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, 1.8F, 0F, -1.2F, 1.8F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 218

		gun_2_Model[0][3].addShapeBox(-5.5F, -2.75F, 0F, 8, 1, 6, 0F,-1.3F, 0.4F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -2.5F, -1.3F, 0.4F, -2.5F, 0F, -0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.5F, 0F); // Box 219

		gun_2_Model[0][4].addShapeBox(2.5F, -1.75F, 3F, 1, 4, 3, 0F,0F, 0.3F, -0.5F, -0.2F, 0.1F, -0.5F, 0.1F, -0.7F, -0.3F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, 1.7F, 0F, -0.5F, 1.7F, 0F, -1.2F, 0F, 0F, 0F); // Box 220

		gun_2_Model[0][5].addShapeBox(-7.5F, -3.25F, -4F, 3, 5, 4, 0F,0F, -0.2F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, 0F, 0.7F, -0.2F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.7F, 0.5F, 0F); // Box 221

		gun_2_Model[0][6].addShapeBox(-7.5F, -3.25F, 0F, 3, 5, 4, 0F,0.7F, -0.2F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, -0.5F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 222

		gun_2_Model[0][7].addShapeBox(2.5F, -1.75F, -3.5F, 1, 4, 1, 0F,0F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, -0.2F, 0F, 0F, 0.2F); // Box 223

		gun_2_Model[0][8].addShapeBox(2.5F, -1.75F, -1F, 1, 4, 2, 0F,0F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F); // Box 224

		gun_2_Model[0][9].addShapeBox(2.5F, -1.75F, 2.5F, 1, 4, 1, 0F,0F, 0.3F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.2F, 1.8F, 0F, -0.2F, 1.8F, 0F, 0F, 0F, 0F, 0F); // Box 225

		gun_2_Model[0][10].addShapeBox(-8F, -3.45F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226

		gun_2_Model[0][11].addShapeBox(-8F, -3.45F, -1.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227

		gun_2_Model[0][12].addShapeBox(-8F, -3.45F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 228

		gun_2_Model[0][13].addShapeBox(-8F, -4.75F, -0.5F, 3, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 229

		gun_2_Model[0][14].addShapeBox(-8F, -4.75F, -1.3F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 230

		gun_2_Model[0][15].addShapeBox(-8F, -4.75F, 0.3F, 3, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 231

		gun_2_Model[0][16].addShapeBox(-8F, -5.75F, -0.5F, 3, 1, 1, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 233

		gun_2_Model[0][17].addShapeBox(-8F, -5.75F, -1.3F, 3, 1, 1, 0F,-1F, -0.5F, -0.79F, -1F, -0.5F, -0.79F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 234

		gun_2_Model[0][18].addShapeBox(-8F, -5.75F, 0.3F, 3, 1, 1, 0F,-1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.79F, -1F, -0.5F, -0.79F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 235

		gun_2_Model[0][19].addShapeBox(-7F, -4.75F, -5.5F, 1, 1, 11, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 236

		gun_2_Model[0][20].addShapeBox(-7F, -4.75F, -6.2F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 237

		gun_2_Model[0][21].addShapeBox(-7F, -4.75F, 5.2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 238

		gun_2_Model[0][22].addShapeBox(-7F, -4.75F, -3.5F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 239

		gun_2_Model[0][23].addShapeBox(-7F, -4.75F, 2.5F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 240

		gun_2_Model[0][24].addShapeBox(-7.5F, -3.25F, -6F, 2, 5, 2, 0F,-0.7F, -0.7F, -1F, 0F, -1F, 0F, 1.3F, -0.1F, 0.5F, 0F, -0.2F, 0.5F, -0.7F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 241

		gun_2_Model[0][25].addShapeBox(-7.5F, -3.25F, 4F, 2, 5, 2, 0F,0F, -0.2F, 0.5F, 1.3F, -0.1F, 0.5F, 0F, -1F, 0F, -0.7F, -0.7F, -1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -0.7F, 0.5F, -1F); // Box 242

		gun_2_Model[0][26].addShapeBox(3.5F, 0.25F, -2.5F, 1, 2, 1, 0F,0F, -0.5F, 0.2F, 0.05F, -0.5F, 0.2F, 0.05F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 243

		gun_2_Model[0][27].addShapeBox(3.5F, 0.25F, 1.5F, 1, 2, 1, 0F,0F, -0.5F, 0.5F, 0.05F, -0.5F, 0.5F, 0.05F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 244

		gun_2_Model[0][28].addShapeBox(2.5F, -0.25F, -2.5F, 2, 1, 1, 0F,0F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -1.19F, 0F, -0.5F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 245

		gun_2_Model[0][29].addShapeBox(2.5F, -0.25F, -2.5F, 2, 1, 1, 0F,0F, 0F, 0.2F, -0.45F, 0F, 0.2F, -0.45F, 0F, -1.19F, 0F, 0F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 246

		gun_2_Model[0][30].addShapeBox(2.5F, -0.25F, -2.2F, 2, 1, 1, 0F,0F, -0.5F, -1.19F, -0.2F, -0.5F, -1.19F, -0.2F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 247

		gun_2_Model[0][31].addShapeBox(2.5F, -0.25F, -2.2F, 2, 1, 1, 0F,0F, 0F, -1.19F, -0.45F, 0F, -1.19F, -0.45F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.7F, 0.05F, 0F, -0.7F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 248

		gun_2_Model[0][32].addShapeBox(2.5F, -0.25F, 1.5F, 2, 1, 1, 0F,0F, -0.5F, -1.19F, -0.2F, -0.5F, -1.19F, -0.2F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 249

		gun_2_Model[0][33].addShapeBox(2.5F, -0.25F, 1.5F, 2, 1, 1, 0F,0F, 0F, -1.19F, -0.45F, 0F, -1.19F, -0.45F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.7F, 0.05F, 0F, -0.7F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 250

		gun_2_Model[0][34].addShapeBox(2.5F, -0.25F, 1.2F, 2, 1, 1, 0F,0F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -1.19F, 0F, -0.5F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 251

		gun_2_Model[0][35].addShapeBox(2.5F, -0.25F, 1.2F, 2, 1, 1, 0F,0F, 0F, 0.2F, -0.45F, 0F, 0.2F, -0.45F, 0F, -1.19F, 0F, 0F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 252

		gun_2_Model[0][36].addShapeBox(2.5F, -1F, -3F, 1, 2, 6, 0F,0F, 0.7F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F); // Box 253

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(80F, -15.5F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[2];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 256
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 257

		gun_2_Model[1][0].addShapeBox(7.3F, -0.6F, -2.35F, 9, 1, 1, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 256

		gun_2_Model[1][1].addShapeBox(7.3F, -0.6F, 1.35F, 9, 1, 1, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 257

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(80F, -15.5F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[4];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 254
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 255
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 258
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 259

		gun_2_Model[2][0].addShapeBox(0.3F, -0.6F, -2.35F, 6, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 254

		gun_2_Model[2][1].addShapeBox(6.3F, -0.6F, -2.35F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F); // Box 255

		gun_2_Model[2][2].addShapeBox(6.3F, -0.6F, 1.35F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F); // Box 258

		gun_2_Model[2][3].addShapeBox(0.3F, -0.6F, 1.35F, 6, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 259

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(80F, -15.5F, 0F);
		}


		registerGunModel("FrontUpperGun", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[37];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 216
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 217
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 218
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 219
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 220
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 221
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 222
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 223
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 224
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 225
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 226
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 227
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 228
		gun_3_Model[0][13] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 229
		gun_3_Model[0][14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 230
		gun_3_Model[0][15] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 231
		gun_3_Model[0][16] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 233
		gun_3_Model[0][17] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 234
		gun_3_Model[0][18] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 235
		gun_3_Model[0][19] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 236
		gun_3_Model[0][20] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 237
		gun_3_Model[0][21] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 238
		gun_3_Model[0][22] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 239
		gun_3_Model[0][23] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 240
		gun_3_Model[0][24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 241
		gun_3_Model[0][25] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 242
		gun_3_Model[0][26] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 243
		gun_3_Model[0][27] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 244
		gun_3_Model[0][28] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 245
		gun_3_Model[0][29] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 246
		gun_3_Model[0][30] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 247
		gun_3_Model[0][31] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 248
		gun_3_Model[0][32] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 249
		gun_3_Model[0][33] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 250
		gun_3_Model[0][34] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 251
		gun_3_Model[0][35] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 252
		gun_3_Model[0][36] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 253

		gun_3_Model[0][0].addShapeBox(-5.5F, -0.75F, -6F, 8, 3, 12, 0F,0F, 1.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216

		gun_3_Model[0][1].addShapeBox(-5.5F, -2.75F, -6F, 8, 1, 6, 0F,-1.3F, 0.4F, -2.5F, 0F, -0.7F, -2.5F, 0F, -0.7F, 0F, -1.3F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.5F, 0F); // Box 217

		gun_3_Model[0][2].addShapeBox(2.5F, -1.75F, -6F, 1, 4, 3, 0F,0F, -0.6F, 0F, 0.1F, -0.7F, -0.3F, -0.2F, 0.1F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, 1.8F, 0F, -1.2F, 1.8F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 218

		gun_3_Model[0][3].addShapeBox(-5.5F, -2.75F, 0F, 8, 1, 6, 0F,-1.3F, 0.4F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -2.5F, -1.3F, 0.4F, -2.5F, 0F, -0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.5F, 0F); // Box 219

		gun_3_Model[0][4].addShapeBox(2.5F, -1.75F, 3F, 1, 4, 3, 0F,0F, 0.3F, -0.5F, -0.2F, 0.1F, -0.5F, 0.1F, -0.7F, -0.3F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, 1.7F, 0F, -0.5F, 1.7F, 0F, -1.2F, 0F, 0F, 0F); // Box 220

		gun_3_Model[0][5].addShapeBox(-7.5F, -3.25F, -4F, 3, 5, 4, 0F,0F, -0.2F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, 0F, 0.7F, -0.2F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.7F, 0.5F, 0F); // Box 221

		gun_3_Model[0][6].addShapeBox(-7.5F, -3.25F, 0F, 3, 5, 4, 0F,0.7F, -0.2F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, -0.5F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 222

		gun_3_Model[0][7].addShapeBox(2.5F, -1.75F, -3.5F, 1, 4, 1, 0F,0F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, -0.2F, 0F, 0F, 0.2F); // Box 223

		gun_3_Model[0][8].addShapeBox(2.5F, -1.75F, -1F, 1, 4, 2, 0F,0F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F); // Box 224

		gun_3_Model[0][9].addShapeBox(2.5F, -1.75F, 2.5F, 1, 4, 1, 0F,0F, 0.3F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.2F, 1.8F, 0F, -0.2F, 1.8F, 0F, 0F, 0F, 0F, 0F); // Box 225

		gun_3_Model[0][10].addShapeBox(-8F, -3.45F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226

		gun_3_Model[0][11].addShapeBox(-8F, -3.45F, -1.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227

		gun_3_Model[0][12].addShapeBox(-8F, -3.45F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 228

		gun_3_Model[0][13].addShapeBox(-8F, -4.75F, -0.5F, 3, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 229

		gun_3_Model[0][14].addShapeBox(-8F, -4.75F, -1.3F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 230

		gun_3_Model[0][15].addShapeBox(-8F, -4.75F, 0.3F, 3, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 231

		gun_3_Model[0][16].addShapeBox(-8F, -5.75F, -0.5F, 3, 1, 1, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 233

		gun_3_Model[0][17].addShapeBox(-8F, -5.75F, -1.3F, 3, 1, 1, 0F,-1F, -0.5F, -0.79F, -1F, -0.5F, -0.79F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 234

		gun_3_Model[0][18].addShapeBox(-8F, -5.75F, 0.3F, 3, 1, 1, 0F,-1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.79F, -1F, -0.5F, -0.79F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 235

		gun_3_Model[0][19].addShapeBox(-7F, -4.75F, -5.5F, 1, 1, 11, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 236

		gun_3_Model[0][20].addShapeBox(-7F, -4.75F, -6.2F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 237

		gun_3_Model[0][21].addShapeBox(-7F, -4.75F, 5.2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 238

		gun_3_Model[0][22].addShapeBox(-7F, -4.75F, -3.5F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 239

		gun_3_Model[0][23].addShapeBox(-7F, -4.75F, 2.5F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 240

		gun_3_Model[0][24].addShapeBox(-7.5F, -3.25F, -6F, 2, 5, 2, 0F,-0.7F, -0.7F, -1F, 0F, -1F, 0F, 1.3F, -0.1F, 0.5F, 0F, -0.2F, 0.5F, -0.7F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 241

		gun_3_Model[0][25].addShapeBox(-7.5F, -3.25F, 4F, 2, 5, 2, 0F,0F, -0.2F, 0.5F, 1.3F, -0.1F, 0.5F, 0F, -1F, 0F, -0.7F, -0.7F, -1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -0.7F, 0.5F, -1F); // Box 242

		gun_3_Model[0][26].addShapeBox(3.5F, 0.25F, -2.5F, 1, 2, 1, 0F,0F, -0.5F, 0.2F, 0.05F, -0.5F, 0.2F, 0.05F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 243

		gun_3_Model[0][27].addShapeBox(3.5F, 0.25F, 1.5F, 1, 2, 1, 0F,0F, -0.5F, 0.5F, 0.05F, -0.5F, 0.5F, 0.05F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 244

		gun_3_Model[0][28].addShapeBox(2.5F, -0.25F, -2.5F, 2, 1, 1, 0F,0F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -1.19F, 0F, -0.5F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 245

		gun_3_Model[0][29].addShapeBox(2.5F, -0.25F, -2.5F, 2, 1, 1, 0F,0F, 0F, 0.2F, -0.45F, 0F, 0.2F, -0.45F, 0F, -1.19F, 0F, 0F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 246

		gun_3_Model[0][30].addShapeBox(2.5F, -0.25F, -2.2F, 2, 1, 1, 0F,0F, -0.5F, -1.19F, -0.2F, -0.5F, -1.19F, -0.2F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 247

		gun_3_Model[0][31].addShapeBox(2.5F, -0.25F, -2.2F, 2, 1, 1, 0F,0F, 0F, -1.19F, -0.45F, 0F, -1.19F, -0.45F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.7F, 0.05F, 0F, -0.7F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 248

		gun_3_Model[0][32].addShapeBox(2.5F, -0.25F, 1.5F, 2, 1, 1, 0F,0F, -0.5F, -1.19F, -0.2F, -0.5F, -1.19F, -0.2F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 249

		gun_3_Model[0][33].addShapeBox(2.5F, -0.25F, 1.5F, 2, 1, 1, 0F,0F, 0F, -1.19F, -0.45F, 0F, -1.19F, -0.45F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.7F, 0.05F, 0F, -0.7F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 250

		gun_3_Model[0][34].addShapeBox(2.5F, -0.25F, 1.2F, 2, 1, 1, 0F,0F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -1.19F, 0F, -0.5F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 251

		gun_3_Model[0][35].addShapeBox(2.5F, -0.25F, 1.2F, 2, 1, 1, 0F,0F, 0F, 0.2F, -0.45F, 0F, 0.2F, -0.45F, 0F, -1.19F, 0F, 0F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 252

		gun_3_Model[0][36].addShapeBox(2.5F, -1F, -3F, 1, 2, 6, 0F,0F, 0.7F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F); // Box 253

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(97.9F, -10.8F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[2];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 256
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 257

		gun_3_Model[1][0].addShapeBox(7.3F, -0.6F, -2.35F, 9, 1, 1, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 256

		gun_3_Model[1][1].addShapeBox(7.3F, -0.6F, 1.35F, 9, 1, 1, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 257

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(97.9F, -10.8F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[4];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 254
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 255
		gun_3_Model[2][2] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 258
		gun_3_Model[2][3] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 259

		gun_3_Model[2][0].addShapeBox(0.3F, -0.6F, -2.35F, 6, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 254

		gun_3_Model[2][1].addShapeBox(6.3F, -0.6F, -2.35F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F); // Box 255

		gun_3_Model[2][2].addShapeBox(6.3F, -0.6F, 1.35F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F); // Box 258

		gun_3_Model[2][3].addShapeBox(0.3F, -0.6F, 1.35F, 6, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 259

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(97.9F, -10.8F, 0F);
		}


		registerGunModel("FrontLowerGun", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[37];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 216
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 217
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 218
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 219
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 220
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 221
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 222
		gun_4_Model[0][7] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 223
		gun_4_Model[0][8] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 224
		gun_4_Model[0][9] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 225
		gun_4_Model[0][10] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 226
		gun_4_Model[0][11] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 227
		gun_4_Model[0][12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 228
		gun_4_Model[0][13] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 229
		gun_4_Model[0][14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 230
		gun_4_Model[0][15] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 231
		gun_4_Model[0][16] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 233
		gun_4_Model[0][17] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 234
		gun_4_Model[0][18] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 235
		gun_4_Model[0][19] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 236
		gun_4_Model[0][20] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 237
		gun_4_Model[0][21] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 238
		gun_4_Model[0][22] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 239
		gun_4_Model[0][23] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 240
		gun_4_Model[0][24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 241
		gun_4_Model[0][25] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 242
		gun_4_Model[0][26] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 243
		gun_4_Model[0][27] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 244
		gun_4_Model[0][28] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 245
		gun_4_Model[0][29] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 246
		gun_4_Model[0][30] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 247
		gun_4_Model[0][31] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 248
		gun_4_Model[0][32] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 249
		gun_4_Model[0][33] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 250
		gun_4_Model[0][34] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 251
		gun_4_Model[0][35] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 252
		gun_4_Model[0][36] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 253

		gun_4_Model[0][0].addShapeBox(-5.5F, -0.75F, -6F, 8, 3, 12, 0F,0F, 1.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216

		gun_4_Model[0][1].addShapeBox(-5.5F, -2.75F, -6F, 8, 1, 6, 0F,-1.3F, 0.4F, -2.5F, 0F, -0.7F, -2.5F, 0F, -0.7F, 0F, -1.3F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.5F, 0F); // Box 217

		gun_4_Model[0][2].addShapeBox(2.5F, -1.75F, -6F, 1, 4, 3, 0F,0F, -0.6F, 0F, 0.1F, -0.7F, -0.3F, -0.2F, 0.1F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, 1.8F, 0F, -1.2F, 1.8F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 218

		gun_4_Model[0][3].addShapeBox(-5.5F, -2.75F, 0F, 8, 1, 6, 0F,-1.3F, 0.4F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -2.5F, -1.3F, 0.4F, -2.5F, 0F, -0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.5F, 0F); // Box 219

		gun_4_Model[0][4].addShapeBox(2.5F, -1.75F, 3F, 1, 4, 3, 0F,0F, 0.3F, -0.5F, -0.2F, 0.1F, -0.5F, 0.1F, -0.7F, -0.3F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, 1.7F, 0F, -0.5F, 1.7F, 0F, -1.2F, 0F, 0F, 0F); // Box 220

		gun_4_Model[0][5].addShapeBox(-7.5F, -3.25F, -4F, 3, 5, 4, 0F,0F, -0.2F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, 0F, 0.7F, -0.2F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.7F, 0.5F, 0F); // Box 221

		gun_4_Model[0][6].addShapeBox(-7.5F, -3.25F, 0F, 3, 5, 4, 0F,0.7F, -0.2F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, -0.5F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 222

		gun_4_Model[0][7].addShapeBox(2.5F, -1.75F, -3.5F, 1, 4, 1, 0F,0F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, -0.2F, 0F, 0F, 0.2F); // Box 223

		gun_4_Model[0][8].addShapeBox(2.5F, -1.75F, -1F, 1, 4, 2, 0F,0F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F); // Box 224

		gun_4_Model[0][9].addShapeBox(2.5F, -1.75F, 2.5F, 1, 4, 1, 0F,0F, 0.3F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.2F, 1.8F, 0F, -0.2F, 1.8F, 0F, 0F, 0F, 0F, 0F); // Box 225

		gun_4_Model[0][10].addShapeBox(-8F, -3.45F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226

		gun_4_Model[0][11].addShapeBox(-8F, -3.45F, -1.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227

		gun_4_Model[0][12].addShapeBox(-8F, -3.45F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 228

		gun_4_Model[0][13].addShapeBox(-8F, -4.75F, -0.5F, 3, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 229

		gun_4_Model[0][14].addShapeBox(-8F, -4.75F, -1.3F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 230

		gun_4_Model[0][15].addShapeBox(-8F, -4.75F, 0.3F, 3, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 231

		gun_4_Model[0][16].addShapeBox(-8F, -5.75F, -0.5F, 3, 1, 1, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 233

		gun_4_Model[0][17].addShapeBox(-8F, -5.75F, -1.3F, 3, 1, 1, 0F,-1F, -0.5F, -0.79F, -1F, -0.5F, -0.79F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 234

		gun_4_Model[0][18].addShapeBox(-8F, -5.75F, 0.3F, 3, 1, 1, 0F,-1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.79F, -1F, -0.5F, -0.79F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 235

		gun_4_Model[0][19].addShapeBox(-7F, -4.75F, -5.5F, 1, 1, 11, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 236

		gun_4_Model[0][20].addShapeBox(-7F, -4.75F, -6.2F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 237

		gun_4_Model[0][21].addShapeBox(-7F, -4.75F, 5.2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 238

		gun_4_Model[0][22].addShapeBox(-7F, -4.75F, -3.5F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 239

		gun_4_Model[0][23].addShapeBox(-7F, -4.75F, 2.5F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 240

		gun_4_Model[0][24].addShapeBox(-7.5F, -3.25F, -6F, 2, 5, 2, 0F,-0.7F, -0.7F, -1F, 0F, -1F, 0F, 1.3F, -0.1F, 0.5F, 0F, -0.2F, 0.5F, -0.7F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 241

		gun_4_Model[0][25].addShapeBox(-7.5F, -3.25F, 4F, 2, 5, 2, 0F,0F, -0.2F, 0.5F, 1.3F, -0.1F, 0.5F, 0F, -1F, 0F, -0.7F, -0.7F, -1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -0.7F, 0.5F, -1F); // Box 242

		gun_4_Model[0][26].addShapeBox(3.5F, 0.25F, -2.5F, 1, 2, 1, 0F,0F, -0.5F, 0.2F, 0.05F, -0.5F, 0.2F, 0.05F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 243

		gun_4_Model[0][27].addShapeBox(3.5F, 0.25F, 1.5F, 1, 2, 1, 0F,0F, -0.5F, 0.5F, 0.05F, -0.5F, 0.5F, 0.05F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 244

		gun_4_Model[0][28].addShapeBox(2.5F, -0.25F, -2.5F, 2, 1, 1, 0F,0F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -1.19F, 0F, -0.5F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 245

		gun_4_Model[0][29].addShapeBox(2.5F, -0.25F, -2.5F, 2, 1, 1, 0F,0F, 0F, 0.2F, -0.45F, 0F, 0.2F, -0.45F, 0F, -1.19F, 0F, 0F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 246

		gun_4_Model[0][30].addShapeBox(2.5F, -0.25F, -2.2F, 2, 1, 1, 0F,0F, -0.5F, -1.19F, -0.2F, -0.5F, -1.19F, -0.2F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 247

		gun_4_Model[0][31].addShapeBox(2.5F, -0.25F, -2.2F, 2, 1, 1, 0F,0F, 0F, -1.19F, -0.45F, 0F, -1.19F, -0.45F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.7F, 0.05F, 0F, -0.7F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 248

		gun_4_Model[0][32].addShapeBox(2.5F, -0.25F, 1.5F, 2, 1, 1, 0F,0F, -0.5F, -1.19F, -0.2F, -0.5F, -1.19F, -0.2F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 249

		gun_4_Model[0][33].addShapeBox(2.5F, -0.25F, 1.5F, 2, 1, 1, 0F,0F, 0F, -1.19F, -0.45F, 0F, -1.19F, -0.45F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.7F, 0.05F, 0F, -0.7F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 250

		gun_4_Model[0][34].addShapeBox(2.5F, -0.25F, 1.2F, 2, 1, 1, 0F,0F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -1.19F, 0F, -0.5F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 251

		gun_4_Model[0][35].addShapeBox(2.5F, -0.25F, 1.2F, 2, 1, 1, 0F,0F, 0F, 0.2F, -0.45F, 0F, 0.2F, -0.45F, 0F, -1.19F, 0F, 0F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 252

		gun_4_Model[0][36].addShapeBox(2.5F, -1F, -3F, 1, 2, 6, 0F,0F, 0.7F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F); // Box 253

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-71.2F, -14.2F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[2];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 256
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 257

		gun_4_Model[1][0].addShapeBox(7.3F, -0.6F, -2.35F, 9, 1, 1, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 256

		gun_4_Model[1][1].addShapeBox(7.3F, -0.6F, 1.35F, 9, 1, 1, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 257

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-71.2F, -14.2F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[4];
		gun_4_Model[2][0] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 254
		gun_4_Model[2][1] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 255
		gun_4_Model[2][2] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 258
		gun_4_Model[2][3] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 259

		gun_4_Model[2][0].addShapeBox(0.3F, -0.6F, -2.35F, 6, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 254

		gun_4_Model[2][1].addShapeBox(6.3F, -0.6F, -2.35F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F); // Box 255

		gun_4_Model[2][2].addShapeBox(6.3F, -0.6F, 1.35F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F); // Box 258

		gun_4_Model[2][3].addShapeBox(0.3F, -0.6F, 1.35F, 6, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 259

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[2])
		{
			gunPart.setRotationPoint(-71.2F, -14.2F, 0F);
		}


		registerGunModel("RearUpperGun", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[37];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 216
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 217
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 218
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 219
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 220
		gun_5_Model[0][5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 221
		gun_5_Model[0][6] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 222
		gun_5_Model[0][7] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 223
		gun_5_Model[0][8] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 224
		gun_5_Model[0][9] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 225
		gun_5_Model[0][10] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 226
		gun_5_Model[0][11] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 227
		gun_5_Model[0][12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 228
		gun_5_Model[0][13] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 229
		gun_5_Model[0][14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 230
		gun_5_Model[0][15] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 231
		gun_5_Model[0][16] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 233
		gun_5_Model[0][17] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 234
		gun_5_Model[0][18] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 235
		gun_5_Model[0][19] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 236
		gun_5_Model[0][20] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 237
		gun_5_Model[0][21] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 238
		gun_5_Model[0][22] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 239
		gun_5_Model[0][23] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 240
		gun_5_Model[0][24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 241
		gun_5_Model[0][25] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 242
		gun_5_Model[0][26] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 243
		gun_5_Model[0][27] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 244
		gun_5_Model[0][28] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 245
		gun_5_Model[0][29] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 246
		gun_5_Model[0][30] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 247
		gun_5_Model[0][31] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 248
		gun_5_Model[0][32] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 249
		gun_5_Model[0][33] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 250
		gun_5_Model[0][34] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 251
		gun_5_Model[0][35] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 252
		gun_5_Model[0][36] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 253

		gun_5_Model[0][0].addShapeBox(-5.5F, -0.75F, -6F, 8, 3, 12, 0F,0F, 1.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216

		gun_5_Model[0][1].addShapeBox(-5.5F, -2.75F, -6F, 8, 1, 6, 0F,-1.3F, 0.4F, -2.5F, 0F, -0.7F, -2.5F, 0F, -0.7F, 0F, -1.3F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.5F, 0F); // Box 217

		gun_5_Model[0][2].addShapeBox(2.5F, -1.75F, -6F, 1, 4, 3, 0F,0F, -0.6F, 0F, 0.1F, -0.7F, -0.3F, -0.2F, 0.1F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, 1.8F, 0F, -1.2F, 1.8F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 218

		gun_5_Model[0][3].addShapeBox(-5.5F, -2.75F, 0F, 8, 1, 6, 0F,-1.3F, 0.4F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -2.5F, -1.3F, 0.4F, -2.5F, 0F, -0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.5F, 0F); // Box 219

		gun_5_Model[0][4].addShapeBox(2.5F, -1.75F, 3F, 1, 4, 3, 0F,0F, 0.3F, -0.5F, -0.2F, 0.1F, -0.5F, 0.1F, -0.7F, -0.3F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, 1.7F, 0F, -0.5F, 1.7F, 0F, -1.2F, 0F, 0F, 0F); // Box 220

		gun_5_Model[0][5].addShapeBox(-7.5F, -3.25F, -4F, 3, 5, 4, 0F,0F, -0.2F, -0.5F, 0.3F, -0.1F, -0.5F, 0.3F, -0.1F, 0F, 0.7F, -0.2F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.7F, 0.5F, 0F); // Box 221

		gun_5_Model[0][6].addShapeBox(-7.5F, -3.25F, 0F, 3, 5, 4, 0F,0.7F, -0.2F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, -0.5F, 0F, -0.2F, -0.5F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 222

		gun_5_Model[0][7].addShapeBox(2.5F, -1.75F, -3.5F, 1, 4, 1, 0F,0F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, -0.2F, 0F, 0F, 0.2F); // Box 223

		gun_5_Model[0][8].addShapeBox(2.5F, -1.75F, -1F, 1, 4, 2, 0F,0F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F); // Box 224

		gun_5_Model[0][9].addShapeBox(2.5F, -1.75F, 2.5F, 1, 4, 1, 0F,0F, 0.3F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.2F, 1.8F, 0F, -0.2F, 1.8F, 0F, 0F, 0F, 0F, 0F); // Box 225

		gun_5_Model[0][10].addShapeBox(-8F, -3.45F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226

		gun_5_Model[0][11].addShapeBox(-8F, -3.45F, -1.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227

		gun_5_Model[0][12].addShapeBox(-8F, -3.45F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 228

		gun_5_Model[0][13].addShapeBox(-8F, -4.75F, -0.5F, 3, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 229

		gun_5_Model[0][14].addShapeBox(-8F, -4.75F, -1.3F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 230

		gun_5_Model[0][15].addShapeBox(-8F, -4.75F, 0.3F, 3, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 231

		gun_5_Model[0][16].addShapeBox(-8F, -5.75F, -0.5F, 3, 1, 1, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 233

		gun_5_Model[0][17].addShapeBox(-8F, -5.75F, -1.3F, 3, 1, 1, 0F,-1F, -0.5F, -0.79F, -1F, -0.5F, -0.79F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 234

		gun_5_Model[0][18].addShapeBox(-8F, -5.75F, 0.3F, 3, 1, 1, 0F,-1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.79F, -1F, -0.5F, -0.79F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 235

		gun_5_Model[0][19].addShapeBox(-7F, -4.75F, -5.5F, 1, 1, 11, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 236

		gun_5_Model[0][20].addShapeBox(-7F, -4.75F, -6.2F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 237

		gun_5_Model[0][21].addShapeBox(-7F, -4.75F, 5.2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 238

		gun_5_Model[0][22].addShapeBox(-7F, -4.75F, -3.5F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 239

		gun_5_Model[0][23].addShapeBox(-7F, -4.75F, 2.5F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 240

		gun_5_Model[0][24].addShapeBox(-7.5F, -3.25F, -6F, 2, 5, 2, 0F,-0.7F, -0.7F, -1F, 0F, -1F, 0F, 1.3F, -0.1F, 0.5F, 0F, -0.2F, 0.5F, -0.7F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 241

		gun_5_Model[0][25].addShapeBox(-7.5F, -3.25F, 4F, 2, 5, 2, 0F,0F, -0.2F, 0.5F, 1.3F, -0.1F, 0.5F, 0F, -1F, 0F, -0.7F, -0.7F, -1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -0.7F, 0.5F, -1F); // Box 242

		gun_5_Model[0][26].addShapeBox(3.5F, 0.25F, -2.5F, 1, 2, 1, 0F,0F, -0.5F, 0.2F, 0.05F, -0.5F, 0.2F, 0.05F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 243

		gun_5_Model[0][27].addShapeBox(3.5F, 0.25F, 1.5F, 1, 2, 1, 0F,0F, -0.5F, 0.5F, 0.05F, -0.5F, 0.5F, 0.05F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 244

		gun_5_Model[0][28].addShapeBox(2.5F, -0.25F, -2.5F, 2, 1, 1, 0F,0F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -1.19F, 0F, -0.5F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 245

		gun_5_Model[0][29].addShapeBox(2.5F, -0.25F, -2.5F, 2, 1, 1, 0F,0F, 0F, 0.2F, -0.45F, 0F, 0.2F, -0.45F, 0F, -1.19F, 0F, 0F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 246

		gun_5_Model[0][30].addShapeBox(2.5F, -0.25F, -2.2F, 2, 1, 1, 0F,0F, -0.5F, -1.19F, -0.2F, -0.5F, -1.19F, -0.2F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 247

		gun_5_Model[0][31].addShapeBox(2.5F, -0.25F, -2.2F, 2, 1, 1, 0F,0F, 0F, -1.19F, -0.45F, 0F, -1.19F, -0.45F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.7F, 0.05F, 0F, -0.7F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 248

		gun_5_Model[0][32].addShapeBox(2.5F, -0.25F, 1.5F, 2, 1, 1, 0F,0F, -0.5F, -1.19F, -0.2F, -0.5F, -1.19F, -0.2F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 249

		gun_5_Model[0][33].addShapeBox(2.5F, -0.25F, 1.5F, 2, 1, 1, 0F,0F, 0F, -1.19F, -0.45F, 0F, -1.19F, -0.45F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.7F, 0.05F, 0F, -0.7F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 250

		gun_5_Model[0][34].addShapeBox(2.5F, -0.25F, 1.2F, 2, 1, 1, 0F,0F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -1.19F, 0F, -0.5F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 251

		gun_5_Model[0][35].addShapeBox(2.5F, -0.25F, 1.2F, 2, 1, 1, 0F,0F, 0F, 0.2F, -0.45F, 0F, 0.2F, -0.45F, 0F, -1.19F, 0F, 0F, -1.19F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 252

		gun_5_Model[0][36].addShapeBox(2.5F, -1F, -3F, 1, 2, 6, 0F,0F, 0.7F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F); // Box 253

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-89F, -9.5F, 0F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[2];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 256
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 257

		gun_5_Model[1][0].addShapeBox(7.3F, -0.6F, -2.35F, 9, 1, 1, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 256

		gun_5_Model[1][1].addShapeBox(7.3F, -0.6F, 1.35F, 9, 1, 1, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 257

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-89F, -9.5F, 0F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[4];
		gun_5_Model[2][0] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 254
		gun_5_Model[2][1] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 255
		gun_5_Model[2][2] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 258
		gun_5_Model[2][3] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 259

		gun_5_Model[2][0].addShapeBox(0.3F, -0.6F, -2.35F, 6, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 254

		gun_5_Model[2][1].addShapeBox(6.3F, -0.6F, -2.35F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F); // Box 255

		gun_5_Model[2][2].addShapeBox(6.3F, -0.6F, 1.35F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.1F); // Box 258

		gun_5_Model[2][3].addShapeBox(0.3F, -0.6F, 1.35F, 6, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 259

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[2])
		{
			gunPart.setRotationPoint(-89F, -9.5F, 0F);
		}


		registerGunModel("RearLowerGun", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[7];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 49, 337, textureX, textureY); // Box 438
		gun_6_Model[0][1] = new ModelRendererTurbo(this, 73, 337, textureX, textureY); // Box 439
		gun_6_Model[0][2] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 440
		gun_6_Model[0][3] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 441
		gun_6_Model[0][4] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 442
		gun_6_Model[0][5] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 445
		gun_6_Model[0][6] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 446

		gun_6_Model[0][0].addShapeBox(-2F, -1.2F, -3.5F, 3, 4, 7, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 438

		gun_6_Model[0][1].addShapeBox(0.6F, -1.2F, -3.5F, 2, 4, 7, 0F,-0.2F, 0F, -0.2F, -0.2F, -2F, -0.4F, -0.2F, -2F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F); // Box 439

		gun_6_Model[0][2].addShapeBox(2.2F, 0.8F, -3F, 1, 2, 6, 0F,-0.2F, 0F, 0.1F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.1F); // Box 440

		gun_6_Model[0][3].addShapeBox(0F, -1.4F, -1.1F, 2, 2, 1, 0F,0F, -0.1F, -0.2F, -1.2F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0.6F, 0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0F, 0F, -0.2F); // Box 441

		gun_6_Model[0][4].addShapeBox(0F, -1.4F, 0.1F, 2, 2, 1, 0F,0F, -0.1F, -0.2F, -1.2F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0.6F, 0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0F, 0F, -0.2F); // Box 442

		gun_6_Model[0][5].addShapeBox(-2F, -1F, -1.1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445

		gun_6_Model[0][6].addShapeBox(-2F, -1F, 0.1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(46F, -14.3F, -13.5F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[2];
		gun_6_Model[1][0] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 444
		gun_6_Model[1][1] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 448

		gun_6_Model[1][0].addShapeBox(2.2F, -0.5F, -1.1F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 444

		gun_6_Model[1][1].addShapeBox(2.2F, -0.5F, 0.1F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[1])
		{
			gunPart.setRotationPoint(46F, -14.3F, -13.5F);
		}


		gun_6_Model[2] = new ModelRendererTurbo[2];
		gun_6_Model[2][0] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 443
		gun_6_Model[2][1] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 447

		gun_6_Model[2][0].addShapeBox(1.5F, -0.5F, -1.1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 443

		gun_6_Model[2][1].addShapeBox(1.5F, -0.5F, 0.1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 447

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[2])
		{
			gunPart.setRotationPoint(46F, -14.3F, -13.5F);
		}


		registerGunModel("Secondary1", gun_6_Model);

		// Passenger 8
		ModelRendererTurbo[][] gun_7_Model = new ModelRendererTurbo[3][];

		gun_7_Model[0] = new ModelRendererTurbo[7];
		gun_7_Model[0][0] = new ModelRendererTurbo(this, 49, 337, textureX, textureY); // Box 438
		gun_7_Model[0][1] = new ModelRendererTurbo(this, 73, 337, textureX, textureY); // Box 439
		gun_7_Model[0][2] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 440
		gun_7_Model[0][3] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 441
		gun_7_Model[0][4] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 442
		gun_7_Model[0][5] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 445
		gun_7_Model[0][6] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 446

		gun_7_Model[0][0].addShapeBox(-2F, -1.2F, -3.5F, 3, 4, 7, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 438

		gun_7_Model[0][1].addShapeBox(0.6F, -1.2F, -3.5F, 2, 4, 7, 0F,-0.2F, 0F, -0.2F, -0.2F, -2F, -0.4F, -0.2F, -2F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F); // Box 439

		gun_7_Model[0][2].addShapeBox(2.2F, 0.8F, -3F, 1, 2, 6, 0F,-0.2F, 0F, 0.1F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.1F); // Box 440

		gun_7_Model[0][3].addShapeBox(0F, -1.4F, -1.1F, 2, 2, 1, 0F,0F, -0.1F, -0.2F, -1.2F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0.6F, 0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0F, 0F, -0.2F); // Box 441

		gun_7_Model[0][4].addShapeBox(0F, -1.4F, 0.1F, 2, 2, 1, 0F,0F, -0.1F, -0.2F, -1.2F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0.6F, 0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0F, 0F, -0.2F); // Box 442

		gun_7_Model[0][5].addShapeBox(-2F, -1F, -1.1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445

		gun_7_Model[0][6].addShapeBox(-2F, -1F, 0.1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[0])
		{
			gunPart.setRotationPoint(-14.8F, -13.9F, 14.3F);
		}


		gun_7_Model[1] = new ModelRendererTurbo[2];
		gun_7_Model[1][0] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 444
		gun_7_Model[1][1] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 448

		gun_7_Model[1][0].addShapeBox(2.2F, -0.5F, -1.1F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 444

		gun_7_Model[1][1].addShapeBox(2.2F, -0.5F, 0.1F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[1])
		{
			gunPart.setRotationPoint(-14.8F, -13.9F, 14.3F);
		}


		gun_7_Model[2] = new ModelRendererTurbo[2];
		gun_7_Model[2][0] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 443
		gun_7_Model[2][1] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 447

		gun_7_Model[2][0].addShapeBox(1.5F, -0.5F, -1.1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 443

		gun_7_Model[2][1].addShapeBox(1.5F, -0.5F, 0.1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 447

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[2])
		{
			gunPart.setRotationPoint(-14.8F, -13.9F, 14.3F);
		}


		registerGunModel("Secondary2", gun_7_Model);

		// Passenger 9
		ModelRendererTurbo[][] gun_8_Model = new ModelRendererTurbo[3][];

		gun_8_Model[0] = new ModelRendererTurbo[7];
		gun_8_Model[0][0] = new ModelRendererTurbo(this, 49, 337, textureX, textureY); // Box 438
		gun_8_Model[0][1] = new ModelRendererTurbo(this, 73, 337, textureX, textureY); // Box 439
		gun_8_Model[0][2] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 440
		gun_8_Model[0][3] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 441
		gun_8_Model[0][4] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 442
		gun_8_Model[0][5] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 445
		gun_8_Model[0][6] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 446

		gun_8_Model[0][0].addShapeBox(-2F, -1.2F, -3.5F, 3, 4, 7, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 438

		gun_8_Model[0][1].addShapeBox(0.6F, -1.2F, -3.5F, 2, 4, 7, 0F,-0.2F, 0F, -0.2F, -0.2F, -2F, -0.4F, -0.2F, -2F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F); // Box 439

		gun_8_Model[0][2].addShapeBox(2.2F, 0.8F, -3F, 1, 2, 6, 0F,-0.2F, 0F, 0.1F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.1F); // Box 440

		gun_8_Model[0][3].addShapeBox(0F, -1.4F, -1.1F, 2, 2, 1, 0F,0F, -0.1F, -0.2F, -1.2F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0.6F, 0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0F, 0F, -0.2F); // Box 441

		gun_8_Model[0][4].addShapeBox(0F, -1.4F, 0.1F, 2, 2, 1, 0F,0F, -0.1F, -0.2F, -1.2F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0.6F, 0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0F, 0F, -0.2F); // Box 442

		gun_8_Model[0][5].addShapeBox(-2F, -1F, -1.1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445

		gun_8_Model[0][6].addShapeBox(-2F, -1F, 0.1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_8_Model[0])
		{
			gunPart.setRotationPoint(-26.8F, -13.9F, 14.3F);
		}


		gun_8_Model[1] = new ModelRendererTurbo[2];
		gun_8_Model[1][0] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 444
		gun_8_Model[1][1] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 448

		gun_8_Model[1][0].addShapeBox(2.2F, -0.5F, -1.1F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 444

		gun_8_Model[1][1].addShapeBox(2.2F, -0.5F, 0.1F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_8_Model[1])
		{
			gunPart.setRotationPoint(-26.8F, -13.9F, 14.3F);
		}


		gun_8_Model[2] = new ModelRendererTurbo[2];
		gun_8_Model[2][0] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 443
		gun_8_Model[2][1] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 447

		gun_8_Model[2][0].addShapeBox(1.5F, -0.5F, -1.1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 443

		gun_8_Model[2][1].addShapeBox(1.5F, -0.5F, 0.1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 447

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_8_Model[2])
		{
			gunPart.setRotationPoint(-26.8F, -13.9F, 14.3F);
		}


		registerGunModel("Secondary3", gun_8_Model);

		// Passenger 10
		ModelRendererTurbo[][] gun_9_Model = new ModelRendererTurbo[3][];

		gun_9_Model[0] = new ModelRendererTurbo[7];
		gun_9_Model[0][0] = new ModelRendererTurbo(this, 49, 337, textureX, textureY); // Box 438
		gun_9_Model[0][1] = new ModelRendererTurbo(this, 73, 337, textureX, textureY); // Box 439
		gun_9_Model[0][2] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 440
		gun_9_Model[0][3] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 441
		gun_9_Model[0][4] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 442
		gun_9_Model[0][5] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 445
		gun_9_Model[0][6] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 446

		gun_9_Model[0][0].addShapeBox(-2F, -1.2F, -3.5F, 3, 4, 7, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 438

		gun_9_Model[0][1].addShapeBox(0.6F, -1.2F, -3.5F, 2, 4, 7, 0F,-0.2F, 0F, -0.2F, -0.2F, -2F, -0.4F, -0.2F, -2F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F); // Box 439

		gun_9_Model[0][2].addShapeBox(2.2F, 0.8F, -3F, 1, 2, 6, 0F,-0.2F, 0F, 0.1F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.1F); // Box 440

		gun_9_Model[0][3].addShapeBox(0F, -1.4F, -1.1F, 2, 2, 1, 0F,0F, -0.1F, -0.2F, -1.2F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0.6F, 0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0F, 0F, -0.2F); // Box 441

		gun_9_Model[0][4].addShapeBox(0F, -1.4F, 0.1F, 2, 2, 1, 0F,0F, -0.1F, -0.2F, -1.2F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0.6F, 0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0F, 0F, -0.2F); // Box 442

		gun_9_Model[0][5].addShapeBox(-2F, -1F, -1.1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445

		gun_9_Model[0][6].addShapeBox(-2F, -1F, 0.1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_9_Model[0])
		{
			gunPart.setRotationPoint(46F, -14.3F, 13.5F);
		}


		gun_9_Model[1] = new ModelRendererTurbo[2];
		gun_9_Model[1][0] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 444
		gun_9_Model[1][1] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 448

		gun_9_Model[1][0].addShapeBox(2.2F, -0.5F, -1.1F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 444

		gun_9_Model[1][1].addShapeBox(2.2F, -0.5F, 0.1F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_9_Model[1])
		{
			gunPart.setRotationPoint(46F, -14.3F, 13.5F);
		}


		gun_9_Model[2] = new ModelRendererTurbo[2];
		gun_9_Model[2][0] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 443
		gun_9_Model[2][1] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 447

		gun_9_Model[2][0].addShapeBox(1.5F, -0.5F, -1.1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 443

		gun_9_Model[2][1].addShapeBox(1.5F, -0.5F, 0.1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 447

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_9_Model[2])
		{
			gunPart.setRotationPoint(46F, -14.3F, 13.5F);
		}


		registerGunModel("Secondary4", gun_9_Model);

		// Passenger 11
		ModelRendererTurbo[][] gun_10_Model = new ModelRendererTurbo[3][];

		gun_10_Model[0] = new ModelRendererTurbo[7];
		gun_10_Model[0][0] = new ModelRendererTurbo(this, 49, 337, textureX, textureY); // Box 438
		gun_10_Model[0][1] = new ModelRendererTurbo(this, 73, 337, textureX, textureY); // Box 439
		gun_10_Model[0][2] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 440
		gun_10_Model[0][3] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 441
		gun_10_Model[0][4] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 442
		gun_10_Model[0][5] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 445
		gun_10_Model[0][6] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 446

		gun_10_Model[0][0].addShapeBox(-2F, -1.2F, -3.5F, 3, 4, 7, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 438

		gun_10_Model[0][1].addShapeBox(0.6F, -1.2F, -3.5F, 2, 4, 7, 0F,-0.2F, 0F, -0.2F, -0.2F, -2F, -0.4F, -0.2F, -2F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F); // Box 439

		gun_10_Model[0][2].addShapeBox(2.2F, 0.8F, -3F, 1, 2, 6, 0F,-0.2F, 0F, 0.1F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.1F); // Box 440

		gun_10_Model[0][3].addShapeBox(0F, -1.4F, -1.1F, 2, 2, 1, 0F,0F, -0.1F, -0.2F, -1.2F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0.6F, 0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0F, 0F, -0.2F); // Box 441

		gun_10_Model[0][4].addShapeBox(0F, -1.4F, 0.1F, 2, 2, 1, 0F,0F, -0.1F, -0.2F, -1.2F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0.6F, 0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0F, 0F, -0.2F); // Box 442

		gun_10_Model[0][5].addShapeBox(-2F, -1F, -1.1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445

		gun_10_Model[0][6].addShapeBox(-2F, -1F, 0.1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_10_Model[0])
		{
			gunPart.setRotationPoint(-14.8F, -13.9F, -14.3F);
		}


		gun_10_Model[1] = new ModelRendererTurbo[2];
		gun_10_Model[1][0] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 444
		gun_10_Model[1][1] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 448

		gun_10_Model[1][0].addShapeBox(2.2F, -0.5F, -1.1F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 444

		gun_10_Model[1][1].addShapeBox(2.2F, -0.5F, 0.1F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_10_Model[1])
		{
			gunPart.setRotationPoint(-14.8F, -13.9F, -14.3F);
		}


		gun_10_Model[2] = new ModelRendererTurbo[2];
		gun_10_Model[2][0] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 443
		gun_10_Model[2][1] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 447

		gun_10_Model[2][0].addShapeBox(1.5F, -0.5F, -1.1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 443

		gun_10_Model[2][1].addShapeBox(1.5F, -0.5F, 0.1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 447

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_10_Model[2])
		{
			gunPart.setRotationPoint(-14.8F, -13.9F, -14.3F);
		}


		registerGunModel("Secondary5", gun_10_Model);

		// Passenger 12
		ModelRendererTurbo[][] gun_11_Model = new ModelRendererTurbo[3][];

		gun_11_Model[0] = new ModelRendererTurbo[7];
		gun_11_Model[0][0] = new ModelRendererTurbo(this, 49, 337, textureX, textureY); // Box 438
		gun_11_Model[0][1] = new ModelRendererTurbo(this, 73, 337, textureX, textureY); // Box 439
		gun_11_Model[0][2] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 440
		gun_11_Model[0][3] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 441
		gun_11_Model[0][4] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 442
		gun_11_Model[0][5] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 445
		gun_11_Model[0][6] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 446

		gun_11_Model[0][0].addShapeBox(-2F, -1.2F, -3.5F, 3, 4, 7, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 438

		gun_11_Model[0][1].addShapeBox(0.6F, -1.2F, -3.5F, 2, 4, 7, 0F,-0.2F, 0F, -0.2F, -0.2F, -2F, -0.4F, -0.2F, -2F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F); // Box 439

		gun_11_Model[0][2].addShapeBox(2.2F, 0.8F, -3F, 1, 2, 6, 0F,-0.2F, 0F, 0.1F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.1F); // Box 440

		gun_11_Model[0][3].addShapeBox(0F, -1.4F, -1.1F, 2, 2, 1, 0F,0F, -0.1F, -0.2F, -1.2F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0.6F, 0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0F, 0F, -0.2F); // Box 441

		gun_11_Model[0][4].addShapeBox(0F, -1.4F, 0.1F, 2, 2, 1, 0F,0F, -0.1F, -0.2F, -1.2F, 0.1F, -0.2F, -1.2F, 0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0.6F, 0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0F, 0F, -0.2F); // Box 442

		gun_11_Model[0][5].addShapeBox(-2F, -1F, -1.1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445

		gun_11_Model[0][6].addShapeBox(-2F, -1F, 0.1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_11_Model[0])
		{
			gunPart.setRotationPoint(-26.8F, -13.9F, -14.3F);
		}


		gun_11_Model[1] = new ModelRendererTurbo[2];
		gun_11_Model[1][0] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 444
		gun_11_Model[1][1] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 448

		gun_11_Model[1][0].addShapeBox(2.2F, -0.5F, -1.1F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 444

		gun_11_Model[1][1].addShapeBox(2.2F, -0.5F, 0.1F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_11_Model[1])
		{
			gunPart.setRotationPoint(-26.8F, -13.9F, -14.3F);
		}


		gun_11_Model[2] = new ModelRendererTurbo[2];
		gun_11_Model[2][0] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 443
		gun_11_Model[2][1] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 447

		gun_11_Model[2][0].addShapeBox(1.5F, -0.5F, -1.1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 443

		gun_11_Model[2][1].addShapeBox(1.5F, -0.5F, 0.1F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 447

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_11_Model[2])
		{
			gunPart.setRotationPoint(-26.8F, -13.9F, -14.3F);
		}


		registerGunModel("Secondary6", gun_11_Model);
	}
}