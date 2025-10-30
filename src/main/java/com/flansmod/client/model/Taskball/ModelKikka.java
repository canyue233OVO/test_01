//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kikka
// Model Creator: 
// Created on: 18.05.2023 - 19:23:11
// Last changed on: 18.05.2023 - 19:23:11

package com.flansmod.client.model.Taskball; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKikka extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelKikka() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[54];
		noseModel = new ModelRendererTurbo[16];
		tailModel = new ModelRendererTurbo[14];
		bayModel = new ModelRendererTurbo[26];
		leftWingModel = new ModelRendererTurbo[41];
		rightWingModel = new ModelRendererTurbo[41];
		yawFlapModel = new ModelRendererTurbo[8];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[19];
		leftWingWheelModel = new ModelRendererTurbo[13];
		rightWingWheelModel = new ModelRendererTurbo[13];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initbayModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 60
		bodyModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 61
		bodyModel[15] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 62
		bodyModel[16] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 63
		bodyModel[17] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 64
		bodyModel[18] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 65
		bodyModel[19] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 66
		bodyModel[20] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 67
		bodyModel[21] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 68
		bodyModel[22] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 69
		bodyModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 70
		bodyModel[24] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 71
		bodyModel[25] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 72
		bodyModel[26] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 84
		bodyModel[27] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 157
		bodyModel[28] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 158
		bodyModel[29] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 159
		bodyModel[30] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 160
		bodyModel[31] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 161
		bodyModel[32] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 162
		bodyModel[33] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 163
		bodyModel[34] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 164
		bodyModel[35] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 165
		bodyModel[36] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 166
		bodyModel[37] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 169
		bodyModel[38] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 170
		bodyModel[39] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 171
		bodyModel[40] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 207
		bodyModel[41] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 208
		bodyModel[42] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 209
		bodyModel[43] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 210
		bodyModel[44] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 211
		bodyModel[45] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 212
		bodyModel[46] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 213
		bodyModel[47] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 214
		bodyModel[48] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 215
		bodyModel[49] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 216
		bodyModel[50] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 217
		bodyModel[51] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 218
		bodyModel[52] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 219
		bodyModel[53] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 233

		bodyModel[0].addShapeBox(0F, 0F, 0F, 40, 11, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-24F, -38F, -15F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 1
		bodyModel[1].setRotationPoint(-14F, -40F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 2
		bodyModel[2].setRotationPoint(-19F, -40F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, 0F, -8F, 0F, -1F, -5F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 3
		bodyModel[3].setRotationPoint(-24F, -41F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 4
		bodyModel[4].setRotationPoint(3F, -40F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 3, 11, 0F,0F, -1F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F); // Box 7
		bodyModel[5].setRotationPoint(9F, -41F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 40, 10, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 8
		bodyModel[6].setRotationPoint(-24F, -27F, -15F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 21, 11, 15, 0F,0F, 0F, -4F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[7].setRotationPoint(16F, -38F, -15F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -6F, 0F, 1F, 0F, 0F, 3F, 0F); // Box 10
		bodyModel[8].setRotationPoint(16F, -27F, -15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 21, 3, 11, 0F,0F, 0F, -9.9999F, 0F, -1.9999F, -10.9999F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9999F, -2.9999F, 0F, 0.9999F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(16F, -41F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 22, 11, 15, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[10].setRotationPoint(-46F, -38F, -15F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 22, 3, 11, 0F,0F, -0.9999F, -10.9999F, 0F, 0F, -7.9999F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0.9999F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9999F, 0F); // Box 15
		bodyModel[11].setRotationPoint(-46F, -41F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 22, 10, 15, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 16
		bodyModel[12].setRotationPoint(-46F, -27F, -15F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[13].setRotationPoint(-14F, -48F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 61
		bodyModel[14].setRotationPoint(-14F, -48F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 62
		bodyModel[15].setRotationPoint(2F, -48F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 63
		bodyModel[16].setRotationPoint(-14F, -50F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[17].setRotationPoint(-14F, -51F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 65
		bodyModel[18].setRotationPoint(-16F, -48F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 66
		bodyModel[19].setRotationPoint(-18F, -48F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 67
		bodyModel[20].setRotationPoint(-24F, -48F, -3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -8F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, 8F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -1F); // Box 68
		bodyModel[21].setRotationPoint(-19F, -48F, -5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[22].setRotationPoint(2F, -51F, -2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 70
		bodyModel[23].setRotationPoint(2F, -50F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[24].setRotationPoint(3F, -51F, -1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[25].setRotationPoint(9F, -48F, -1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[26].setRotationPoint(-18F, -48F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 40, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[27].setRotationPoint(-24F, -38F, 10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[28].setRotationPoint(-14F, -40F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[29].setRotationPoint(-19F, -40F, 5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -5F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[30].setRotationPoint(-24F, -41F, 2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[31].setRotationPoint(3F, -40F, 5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 3, 11, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -1F, -5F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[32].setRotationPoint(9F, -41F, 0F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 40, 10, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 163
		bodyModel[33].setRotationPoint(-24F, -27F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 21, 11, 15, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 164
		bodyModel[34].setRotationPoint(16F, -38F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 21, 10, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, -6F, 0F, 0F, -4F); // Box 165
		bodyModel[35].setRotationPoint(16F, -27F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 21, 3, 11, 0F,0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, -10.9999F, 0F, 0F, -9.9999F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, 0.9999F, -2.9999F, 0F, 0F, 0F); // Box 166
		bodyModel[36].setRotationPoint(16F, -41F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 22, 11, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 169
		bodyModel[37].setRotationPoint(-46F, -38F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 22, 3, 11, 0F,0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -7.9999F, 0F, -0.9999F, -10.9999F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9999F, -0.9999F); // Box 170
		bodyModel[38].setRotationPoint(-46F, -41F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 22, 10, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -4F, 0F, 0F, -5F); // Box 171
		bodyModel[39].setRotationPoint(-46F, -27F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[40].setRotationPoint(-14F, -48F, 5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 208
		bodyModel[41].setRotationPoint(-14F, -48F, 5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 209
		bodyModel[42].setRotationPoint(2F, -48F, 5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 210
		bodyModel[43].setRotationPoint(-14F, -50F, 2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[44].setRotationPoint(-14F, -51F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 212
		bodyModel[45].setRotationPoint(-16F, -48F, 5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 213
		bodyModel[46].setRotationPoint(-18F, -48F, 4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 214
		bodyModel[47].setRotationPoint(-24F, -48F, 2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 1F, 0F, 8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 1F); // Box 215
		bodyModel[48].setRotationPoint(-19F, -48F, 4F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[49].setRotationPoint(2F, -51F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 217
		bodyModel[50].setRotationPoint(2F, -50F, 2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[51].setRotationPoint(3F, -51F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[52].setRotationPoint(9F, -48F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[53].setRotationPoint(-18F, -48F, 0F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 17
		noseModel[1] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 18
		noseModel[2] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 19
		noseModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 20
		noseModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 21
		noseModel[5] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 22
		noseModel[6] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 23
		noseModel[7] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 24
		noseModel[8] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 172
		noseModel[9] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Box 173
		noseModel[10] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 174
		noseModel[11] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 175
		noseModel[12] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 176
		noseModel[13] = new ModelRendererTurbo(this, 145, 233, textureX, textureY); // Box 177
		noseModel[14] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 178
		noseModel[15] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 179

		noseModel[0].addShapeBox(0F, 0F, 0F, 15, 10, 14, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		noseModel[0].setRotationPoint(-61F, -37F, -14F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 15, 10, 14, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 18
		noseModel[1].setRotationPoint(-61F, -27F, -14F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 14, 10, 12, 0F,0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, -3F, 0F, 3F, 0F, 0F, 1F, 0F); // Box 19
		noseModel[2].setRotationPoint(-75F, -27F, -12F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 9, 8, 9, 0F,0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 20
		noseModel[3].setRotationPoint(-84F, -26F, -9F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -5F, -4F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 21
		noseModel[4].setRotationPoint(-89F, -25F, -6F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 14, 9, 12, 0F,0F, -3F, -6F, 0F, 0F, -3F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 22
		noseModel[5].setRotationPoint(-75F, -36F, -12F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 9, 7, 9, 0F,0F, -3F, -5F, 0F, 0F, -3F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 23
		noseModel[6].setRotationPoint(-84F, -33F, -9F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, -5F, -4F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 24
		noseModel[7].setRotationPoint(-89F, -32F, -6F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 15, 10, 14, 0F,0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 172
		noseModel[8].setRotationPoint(-61F, -37F, 0F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 15, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -4F, 0F, 0F, -5F); // Box 173
		noseModel[9].setRotationPoint(-61F, -27F, 0F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 14, 10, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, -3F, 0F, -1F, -6F); // Box 174
		noseModel[10].setRotationPoint(-75F, -27F, 0F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 9, 8, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, -1F, -5F); // Box 175
		noseModel[11].setRotationPoint(-84F, -26F, 0F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -5F, -4F); // Box 176
		noseModel[12].setRotationPoint(-89F, -25F, 0F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 14, 9, 12, 0F,0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, -3F, 0F, -3F, -6F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F); // Box 177
		noseModel[13].setRotationPoint(-75F, -36F, 0F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 9, 7, 9, 0F,0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, -3F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F); // Box 178
		noseModel[14].setRotationPoint(-84F, -33F, 0F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, -2F, 0F, -5F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 179
		noseModel[15].setRotationPoint(-89F, -32F, 0F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 12
		tailModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 13
		tailModel[2] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 25
		tailModel[3] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 26
		tailModel[4] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 30
		tailModel[5] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 33
		tailModel[6] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 34
		tailModel[7] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 167
		tailModel[8] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 168
		tailModel[9] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 180
		tailModel[10] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 181
		tailModel[11] = new ModelRendererTurbo(this, 457, 241, textureX, textureY); // Box 185
		tailModel[12] = new ModelRendererTurbo(this, 361, 249, textureX, textureY); // Box 188
		tailModel[13] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 189

		tailModel[0].addShapeBox(0F, 0F, 0F, 31, 10, 12, 0F,0F, 0F, -4F, 0F, -1F, -7F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 12
		tailModel[0].setRotationPoint(37F, -37F, -12F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 31, 9, 12, 0F,0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -7F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 13
		tailModel[1].setRotationPoint(37F, -27F, -12F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 25, 9, 7, 0F,0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3.5F, -5F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 25
		tailModel[2].setRotationPoint(68F, -28F, -7F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 25, 8, 7, 0F,0F, 0F, -2F, 0F, 1F, -5F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 26
		tailModel[3].setRotationPoint(68F, -36F, -7F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 23, 23, 2, 0F,-15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		tailModel[4].setRotationPoint(70F, -59F, -2F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 14, 1, 41, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		tailModel[5].setRotationPoint(66F, -36F, -43F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		tailModel[6].setRotationPoint(74F, -36F, -46F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 31, 10, 12, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, 0F); // Box 167
		tailModel[7].setRotationPoint(37F, -37F, 0F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 31, 9, 12, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -3F, -7F, 0F, 0F, -3F); // Box 168
		tailModel[8].setRotationPoint(37F, -27F, 0F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 25, 9, 7, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, -5F, 0F, -2F, -2F); // Box 180
		tailModel[9].setRotationPoint(68F, -28F, 0F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 25, 8, 7, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, 0F); // Box 181
		tailModel[10].setRotationPoint(68F, -36F, 0F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 23, 23, 2, 0F,-13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 185
		tailModel[11].setRotationPoint(70F, -59F, 0F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 14, 1, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 188
		tailModel[12].setRotationPoint(66F, -36F, 2F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 189
		tailModel[13].setRotationPoint(74F, -36F, 43F);
	}

	private void initbayModel_1()
	{
		bayModel[0] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 73
		bayModel[1] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 74
		bayModel[2] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 75
		bayModel[3] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 76
		bayModel[4] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 77
		bayModel[5] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 78
		bayModel[6] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 79
		bayModel[7] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 80
		bayModel[8] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 81
		bayModel[9] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 82
		bayModel[10] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 83
		bayModel[11] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 84
		bayModel[12] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 85
		bayModel[13] = new ModelRendererTurbo(this, 25, 257, textureX, textureY); // Box 220
		bayModel[14] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 221
		bayModel[15] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 222
		bayModel[16] = new ModelRendererTurbo(this, 433, 273, textureX, textureY); // Box 223
		bayModel[17] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 224
		bayModel[18] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 225
		bayModel[19] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 226
		bayModel[20] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 227
		bayModel[21] = new ModelRendererTurbo(this, 433, 281, textureX, textureY); // Box 228
		bayModel[22] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Box 229
		bayModel[23] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 230
		bayModel[24] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 231
		bayModel[25] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 232

		bayModel[0].addShapeBox(0F, 0F, 0F, 24, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bayModel[0].setRotationPoint(-41F, -13F, -10F);

		bayModel[1].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -2.9999F, -3.9999F, 0F, 0F, -0.9999F, 0F, 0.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bayModel[1].setRotationPoint(-44F, -13F, -10F);

		bayModel[2].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, -3.9999F, 0F, 0F, -0.9999F, 0F, 0.9999F, 0F, 0F, -2.9999F, 0F); // Box 75
		bayModel[2].setRotationPoint(-44F, -10F, -10F);

		bayModel[3].addShapeBox(0F, 0F, 0F, 24, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 76
		bayModel[3].setRotationPoint(-41F, -10F, -10F);

		bayModel[4].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, -0.9999F, 0F, -2.9999F, -3.9999F, 0F, -2.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bayModel[4].setRotationPoint(-17F, -13F, -10F);

		bayModel[5].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -2.9999F, -3.9999F, 0F, -2.9999F, 0F, 0F, 0.9999F, 0F); // Box 78
		bayModel[5].setRotationPoint(-17F, -10F, -10F);

		bayModel[6].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -3.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F); // Box 79
		bayModel[6].setRotationPoint(-17F, -13F, -6F);

		bayModel[7].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -3.9999F, 0F, 0F, -0.9999F); // Box 80
		bayModel[7].setRotationPoint(-17F, -10F, -6F);

		bayModel[8].addShapeBox(0F, 0F, 0F, 24, 3, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bayModel[8].setRotationPoint(-41F, -13F, -6F);

		bayModel[9].addShapeBox(0F, 0F, 0F, 24, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 82
		bayModel[9].setRotationPoint(-41F, -10F, -6F);

		bayModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -2.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, -0.9999F, 0F, -2.9999F, -3.9999F); // Box 83
		bayModel[10].setRotationPoint(-44F, -10F, -6F);

		bayModel[11].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -2.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, -0.9999F, 0F, -2.9999F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F); // Box 84
		bayModel[11].setRotationPoint(-44F, -13F, -6F);

		bayModel[12].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bayModel[12].setRotationPoint(-35F, -16F, -6.5F);

		bayModel[13].addShapeBox(0F, 0F, 0F, 24, 3, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bayModel[13].setRotationPoint(-41F, -13F, 6F);

		bayModel[14].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -2.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, -0.9999F, 0F, -2.9999F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F); // Box 221
		bayModel[14].setRotationPoint(-44F, -13F, 6F);

		bayModel[15].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -2.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, -0.9999F, 0F, -2.9999F, -3.9999F); // Box 222
		bayModel[15].setRotationPoint(-44F, -10F, 6F);

		bayModel[16].addShapeBox(0F, 0F, 0F, 24, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 223
		bayModel[16].setRotationPoint(-41F, -10F, 6F);

		bayModel[17].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -3.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F); // Box 224
		bayModel[17].setRotationPoint(-17F, -13F, 6F);

		bayModel[18].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0.9999F, 0F, 0F, -2.9999F, 0F, 0F, -2.9999F, -3.9999F, 0F, 0F, -0.9999F); // Box 225
		bayModel[18].setRotationPoint(-17F, -10F, 6F);

		bayModel[19].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, -0.9999F, 0F, -2.9999F, -3.9999F, 0F, -2.9999F, 0F, 0F, 0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bayModel[19].setRotationPoint(-17F, -13F, 2F);

		bayModel[20].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -2.9999F, -3.9999F, 0F, -2.9999F, 0F, 0F, 0.9999F, 0F); // Box 227
		bayModel[20].setRotationPoint(-17F, -10F, 2F);

		bayModel[21].addShapeBox(0F, 0F, 0F, 24, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bayModel[21].setRotationPoint(-41F, -13F, 2F);

		bayModel[22].addShapeBox(0F, 0F, 0F, 24, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 229
		bayModel[22].setRotationPoint(-41F, -10F, 2F);

		bayModel[23].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, -3.9999F, 0F, 0F, -0.9999F, 0F, 0.9999F, 0F, 0F, -2.9999F, 0F); // Box 230
		bayModel[23].setRotationPoint(-44F, -10F, 2F);

		bayModel[24].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -2.9999F, -3.9999F, 0F, 0F, -0.9999F, 0F, 0.9999F, 0F, 0F, -2.9999F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bayModel[24].setRotationPoint(-44F, -13F, 2F);

		bayModel[25].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bayModel[25].setRotationPoint(-35F, -16F, 5.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 35
		leftWingModel[1] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 36
		leftWingModel[2] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 37
		leftWingModel[3] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 38
		leftWingModel[4] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 39
		leftWingModel[5] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 41
		leftWingModel[6] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 42
		leftWingModel[7] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 43
		leftWingModel[8] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 44
		leftWingModel[9] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 45
		leftWingModel[10] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 49
		leftWingModel[11] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 50
		leftWingModel[12] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 54
		leftWingModel[13] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 55
		leftWingModel[14] = new ModelRendererTurbo(this, 297, 193, textureX, textureY); // Box 56
		leftWingModel[15] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 57
		leftWingModel[16] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 85
		leftWingModel[17] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 86
		leftWingModel[18] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 87
		leftWingModel[19] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 88
		leftWingModel[20] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 89
		leftWingModel[21] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 90
		leftWingModel[22] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 91
		leftWingModel[23] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 92
		leftWingModel[24] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 93
		leftWingModel[25] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 94
		leftWingModel[26] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 95
		leftWingModel[27] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 96
		leftWingModel[28] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 97
		leftWingModel[29] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 98
		leftWingModel[30] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 99
		leftWingModel[31] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 100
		leftWingModel[32] = new ModelRendererTurbo(this, 241, 337, textureX, textureY); // Import LW_54
		leftWingModel[33] = new ModelRendererTurbo(this, 457, 337, textureX, textureY); // Import LW_55
		leftWingModel[34] = new ModelRendererTurbo(this, 137, 345, textureX, textureY); // Import LW_56
		leftWingModel[35] = new ModelRendererTurbo(this, 169, 345, textureX, textureY); // Import LW_57
		leftWingModel[36] = new ModelRendererTurbo(this, 265, 345, textureX, textureY); // Import LW_58
		leftWingModel[37] = new ModelRendererTurbo(this, 353, 345, textureX, textureY); // Import LW_59
		leftWingModel[38] = new ModelRendererTurbo(this, 65, 361, textureX, textureY); // Import LW_61
		leftWingModel[39] = new ModelRendererTurbo(this, 137, 361, textureX, textureY); // Import LW_62
		leftWingModel[40] = new ModelRendererTurbo(this, 465, 361, textureX, textureY); // Import LW_64

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 22, 4, 41, 0F,-4F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		leftWingModel[0].setRotationPoint(-25F, -21F, -52F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 14, 4, 41, 0F,-6F, 1F, 0F, 0F, 2F, 0F, -4F, 0F, 0F, 0F, -2.5F, 0F, -6F, -4F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, -0.5F, 1F); // Box 36
		leftWingModel[1].setRotationPoint(-35F, -21F, -52F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 19, 4, 41, 0F,0F, 0F, 0F, -9F, -2F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -9F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 37
		leftWingModel[2].setRotationPoint(-3F, -23F, -52F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 18, 4, 73, 0F,-6F, 0F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, -2F, 0F, -5F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 38
		leftWingModel[3].setRotationPoint(-21F, -26F, -125F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 8, 4, 73, 0F,-10F, 0F, 0F, 6F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, -10F, -3F, 0F, 6F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 39
		leftWingModel[4].setRotationPoint(-29F, -26F, -125F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		leftWingModel[5].setRotationPoint(-15F, -27F, -134F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,-1F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 42
		leftWingModel[6].setRotationPoint(-19F, -27F, -134F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, -3F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -3F, -2F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 43
		leftWingModel[7].setRotationPoint(-8F, -27F, -134F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 47, 9, 8, 0F,0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		leftWingModel[8].setRotationPoint(-36F, -21F, -60F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 11, 9, 8, 0F,0F, -3F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		leftWingModel[9].setRotationPoint(-47F, -21F, -60F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 47, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftWingModel[10].setRotationPoint(-36F, -12F, -60F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 11, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 50
		leftWingModel[11].setRotationPoint(-47F, -12F, -60F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 11, 9, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		leftWingModel[12].setRotationPoint(-47F, -21F, -52F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 11, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3F, -2F); // Box 55
		leftWingModel[13].setRotationPoint(-47F, -12F, -52F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 47, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 56
		leftWingModel[14].setRotationPoint(-36F, -12F, -52F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 47, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		leftWingModel[15].setRotationPoint(-36F, -21F, -52F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 85
		leftWingModel[16].setRotationPoint(-53F, -18F, -60F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 86
		leftWingModel[17].setRotationPoint(-53F, -20F, -58F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 2F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 87
		leftWingModel[18].setRotationPoint(-53F, -6F, -58F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 88
		leftWingModel[19].setRotationPoint(-53F, -12F, -60F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -2F, 0F, 0F, -4F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 89
		leftWingModel[20].setRotationPoint(11F, -21F, -58F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, 1F, -2F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 90
		leftWingModel[21].setRotationPoint(11F, -18F, -60F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 91
		leftWingModel[22].setRotationPoint(11F, -12F, -60F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 1F, 0F, 0F, 3F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, -2F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 92
		leftWingModel[23].setRotationPoint(11F, -5F, -58F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 93
		leftWingModel[24].setRotationPoint(-53F, -18F, -49F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, -2F); // Box 94
		leftWingModel[25].setRotationPoint(-53F, -20F, -52F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -2F); // Box 95
		leftWingModel[26].setRotationPoint(-53F, -6F, -52F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F); // Box 96
		leftWingModel[27].setRotationPoint(-53F, -12F, -49F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, -2F, 0F, 1F, 0F); // Box 97
		leftWingModel[28].setRotationPoint(11F, -21F, -52F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 98
		leftWingModel[29].setRotationPoint(11F, -18F, -49F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 1F, -2F); // Box 99
		leftWingModel[30].setRotationPoint(11F, -12F, -49F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -2F, 0F, -2F, 0F); // Box 100
		leftWingModel[31].setRotationPoint(11F, -5F, -52F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import LW_54
		leftWingModel[32].setRotationPoint(-48F, -10.5F, -56.5F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -3F); // Import LW_55
		leftWingModel[33].setRotationPoint(-53F, -10.5F, -56.5F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import LW_56
		leftWingModel[34].setRotationPoint(-53F, -13.5F, -56.5F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LW_57
		leftWingModel[35].setRotationPoint(-48F, -13.5F, -56.5F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LW_58
		leftWingModel[36].setRotationPoint(-48F, -16.5F, -56.5F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import LW_59
		leftWingModel[37].setRotationPoint(-53F, -16.5F, -56.5F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, -1.5F, -4.5F, 0F, -1.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4.5F, 0F, -1.5F, -4.5F, 0F, 0F, 0F); // Import LW_61
		leftWingModel[38].setRotationPoint(11F, -13.5F, -56.5F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,0F, 0F, -3F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1.5F, -4.5F, 0F, 1.5F, -4.5F, 0F, 0F, 0F); // Import LW_62
		leftWingModel[39].setRotationPoint(11F, -16.5F, -56.5F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 1.5F, -4.5F, 0F, 1.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, 0F, -3F); // Import LW_64
		leftWingModel[40].setRotationPoint(11F, -10.5F, -56.5F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Box 190
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 191
		rightWingModel[2] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Box 192
		rightWingModel[3] = new ModelRendererTurbo(this, 241, 289, textureX, textureY); // Box 193
		rightWingModel[4] = new ModelRendererTurbo(this, 41, 305, textureX, textureY); // Box 194
		rightWingModel[5] = new ModelRendererTurbo(this, 361, 249, textureX, textureY); // Box 196
		rightWingModel[6] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box 197
		rightWingModel[7] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 198
		rightWingModel[8] = new ModelRendererTurbo(this, 353, 297, textureX, textureY); // Box 199
		rightWingModel[9] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Box 200
		rightWingModel[10] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 201
		rightWingModel[11] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Box 202
		rightWingModel[12] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Box 203
		rightWingModel[13] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 204
		rightWingModel[14] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Box 205
		rightWingModel[15] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 206
		rightWingModel[16] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 234
		rightWingModel[17] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Box 235
		rightWingModel[18] = new ModelRendererTurbo(this, 313, 257, textureX, textureY); // Box 236
		rightWingModel[19] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Box 237
		rightWingModel[20] = new ModelRendererTurbo(this, 113, 265, textureX, textureY); // Box 238
		rightWingModel[21] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 239
		rightWingModel[22] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 240
		rightWingModel[23] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Box 241
		rightWingModel[24] = new ModelRendererTurbo(this, 473, 289, textureX, textureY); // Box 242
		rightWingModel[25] = new ModelRendererTurbo(this, 193, 289, textureX, textureY); // Box 243
		rightWingModel[26] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 244
		rightWingModel[27] = new ModelRendererTurbo(this, 137, 305, textureX, textureY); // Box 245
		rightWingModel[28] = new ModelRendererTurbo(this, 73, 297, textureX, textureY); // Box 246
		rightWingModel[29] = new ModelRendererTurbo(this, 161, 305, textureX, textureY); // Box 247
		rightWingModel[30] = new ModelRendererTurbo(this, 465, 305, textureX, textureY); // Box 248
		rightWingModel[31] = new ModelRendererTurbo(this, 273, 297, textureX, textureY); // Box 249
		rightWingModel[32] = new ModelRendererTurbo(this, 385, 345, textureX, textureY); // Box 288
		rightWingModel[33] = new ModelRendererTurbo(this, 417, 345, textureX, textureY); // Box 289
		rightWingModel[34] = new ModelRendererTurbo(this, 481, 345, textureX, textureY); // Box 290
		rightWingModel[35] = new ModelRendererTurbo(this, 441, 353, textureX, textureY); // Box 291
		rightWingModel[36] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 292
		rightWingModel[37] = new ModelRendererTurbo(this, 33, 361, textureX, textureY); // Box 293
		rightWingModel[38] = new ModelRendererTurbo(this, 241, 369, textureX, textureY); // Box 297
		rightWingModel[39] = new ModelRendererTurbo(this, 281, 369, textureX, textureY); // Box 298
		rightWingModel[40] = new ModelRendererTurbo(this, 321, 369, textureX, textureY); // Box 299

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 22, 4, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F); // Box 190
		rightWingModel[0].setRotationPoint(-25F, -21F, 11F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 14, 4, 41, 0F,0F, -2.5F, 0F, -4F, 0F, 0F, 0F, 2F, 0F, -6F, 1F, 0F, 0F, -0.5F, 1F, -4F, 0F, 0F, 0F, -3F, 0F, -6F, -4F, 0F); // Box 191
		rightWingModel[1].setRotationPoint(-35F, -21F, 11F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 19, 4, 41, 0F,0F, -2F, 0F, 0F, -5F, 0F, -9F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -9F, -1F, 0F, 0F, -1F, 0F); // Box 192
		rightWingModel[2].setRotationPoint(-3F, -23F, 11F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 18, 4, 73, 0F,0F, -3F, 0F, 0F, -3F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -5F, -2F, 0F, -6F, -2F, 0F); // Box 193
		rightWingModel[3].setRotationPoint(-21F, -26F, 52F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 8, 4, 73, 0F,0F, -4F, 0F, 0F, -3F, 0F, 6F, 0F, 0F, -10F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 6F, -2F, 0F, -10F, -3F, 0F); // Box 194
		rightWingModel[4].setRotationPoint(-29F, -26F, 52F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 196
		rightWingModel[5].setRotationPoint(-15F, -27F, 125F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, -3F); // Box 197
		rightWingModel[6].setRotationPoint(-19F, -27F, 125F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, -3F, 0F, -2F, 0F); // Box 198
		rightWingModel[7].setRotationPoint(-8F, -27F, 125F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 47, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		rightWingModel[8].setRotationPoint(-36F, -21F, 52F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 11, 9, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		rightWingModel[9].setRotationPoint(-47F, -21F, 52F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 47, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 201
		rightWingModel[10].setRotationPoint(-36F, -12F, 52F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 11, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3F, -2F); // Box 202
		rightWingModel[11].setRotationPoint(-47F, -12F, 52F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 11, 9, 8, 0F,0F, -3F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		rightWingModel[12].setRotationPoint(-47F, -21F, 44F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 11, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 204
		rightWingModel[13].setRotationPoint(-47F, -12F, 44F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 47, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		rightWingModel[14].setRotationPoint(-36F, -12F, 44F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 47, 9, 8, 0F,0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		rightWingModel[15].setRotationPoint(-36F, -21F, 44F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 234
		rightWingModel[16].setRotationPoint(-53F, -18F, 55F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, -2F); // Box 235
		rightWingModel[17].setRotationPoint(-53F, -20F, 52F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -2F); // Box 236
		rightWingModel[18].setRotationPoint(-53F, -6F, 52F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F); // Box 237
		rightWingModel[19].setRotationPoint(-53F, -12F, 55F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, -2F, 0F, 1F, 0F); // Box 238
		rightWingModel[20].setRotationPoint(11F, -21F, 52F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 239
		rightWingModel[21].setRotationPoint(11F, -18F, 55F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 1F, -2F); // Box 240
		rightWingModel[22].setRotationPoint(11F, -12F, 55F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -2F, 0F, -2F, 0F); // Box 241
		rightWingModel[23].setRotationPoint(11F, -5F, 52F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 242
		rightWingModel[24].setRotationPoint(-53F, -18F, 44F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 243
		rightWingModel[25].setRotationPoint(-53F, -20F, 46F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 2F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 244
		rightWingModel[26].setRotationPoint(-53F, -6F, 46F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 245
		rightWingModel[27].setRotationPoint(-53F, -12F, 44F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -2F, 0F, 0F, -4F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 246
		rightWingModel[28].setRotationPoint(11F, -21F, 46F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, 1F, -2F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 247
		rightWingModel[29].setRotationPoint(11F, -18F, 44F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 248
		rightWingModel[30].setRotationPoint(11F, -12F, 44F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 1F, 0F, 0F, 3F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, -2F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 249
		rightWingModel[31].setRotationPoint(11F, -5F, 46F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 288
		rightWingModel[32].setRotationPoint(-48F, -10.5F, 47.5F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -3F); // Box 289
		rightWingModel[33].setRotationPoint(-53F, -10.5F, 47.5F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 290
		rightWingModel[34].setRotationPoint(-53F, -13.5F, 47.5F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightWingModel[35].setRotationPoint(-48F, -13.5F, 47.5F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		rightWingModel[36].setRotationPoint(-48F, -16.5F, 47.5F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 293
		rightWingModel[37].setRotationPoint(-53F, -16.5F, 47.5F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, -1.5F, -4.5F, 0F, -1.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4.5F, 0F, -1.5F, -4.5F, 0F, 0F, 0F); // Box 297
		rightWingModel[38].setRotationPoint(11F, -13.5F, 47.5F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,0F, 0F, -3F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1.5F, -4.5F, 0F, 1.5F, -4.5F, 0F, 0F, 0F); // Box 298
		rightWingModel[39].setRotationPoint(11F, -16.5F, 47.5F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 1.5F, -4.5F, 0F, 1.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, 0F, -3F); // Box 299
		rightWingModel[40].setRotationPoint(11F, -10.5F, 47.5F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 27
		yawFlapModel[1] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 28
		yawFlapModel[2] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 29
		yawFlapModel[3] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 31
		yawFlapModel[4] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Box 182
		yawFlapModel[5] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 183
		yawFlapModel[6] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 184
		yawFlapModel[7] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 186

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		yawFlapModel[0].setRotationPoint(93F, -37F, -2F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -5F, -2F, 0F, -2F, -1F, 0F, 0F, 0.5F, 0F); // Box 28
		yawFlapModel[1].setRotationPoint(93F, -26F, -2F);

		yawFlapModel[2].addShapeBox(0F, 0F, 0F, 9, 22, 2, 0F,0F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		yawFlapModel[2].setRotationPoint(93F, -59F, -2F);

		yawFlapModel[3].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,-6F, 0F, -1F, -6F, 0F, -1F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		yawFlapModel[3].setRotationPoint(83F, -62F, -2F);

		yawFlapModel[4].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 182
		yawFlapModel[4].setRotationPoint(93F, -37F, 0F);

		yawFlapModel[5].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, -1F, 0F, -5F, -2F, 0F, 0F, -0.5F, 0F); // Box 183
		yawFlapModel[5].setRotationPoint(93F, -26F, 0F);

		yawFlapModel[6].addShapeBox(0F, 0F, 0F, 9, 22, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 184
		yawFlapModel[6].setRotationPoint(93F, -59F, 0F);

		yawFlapModel[7].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,-4F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F); // Box 186
		yawFlapModel[7].setRotationPoint(83F, -62F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 32

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 9, 1, 41, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		pitchFlapLeftModel[0].setRotationPoint(80F, -36F, -43F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Box 187

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 9, 1, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 187
		pitchFlapRightModel[0].setRotationPoint(80F, -36F, 2F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 40

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 15, 4, 73, 0F,0F, 0F, 0F, -9F, 0F, 0F, 0F, -5F, 0F, -5F, -3F, 0F, 0F, -2F, 0F, -9F, -3F, 0F, 0F, 2F, 0F, -5F, 2F, 0F); // Box 40
		pitchFlapLeftWingModel[0].setRotationPoint(-8F, -26F, -125F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 195

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 15, 4, 73, 0F,-5F, -3F, 0F, 0F, -5F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, -9F, -3F, 0F, 0F, -2F, 0F); // Box 195
		pitchFlapRightWingModel[0].setRotationPoint(-8F, -26F, 52F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 281, 313, textureX, textureY); // Import CW_01
		bodyWheelModel[1] = new ModelRendererTurbo(this, 177, 329, textureX, textureY); // Import CW_02
		bodyWheelModel[2] = new ModelRendererTurbo(this, 281, 329, textureX, textureY); // Import CW_03
		bodyWheelModel[3] = new ModelRendererTurbo(this, 137, 337, textureX, textureY); // Import CW_04
		bodyWheelModel[4] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Import CW_05
		bodyWheelModel[5] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Import CW_06
		bodyWheelModel[6] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Import CW_07
		bodyWheelModel[7] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Import CW_08
		bodyWheelModel[8] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Import CW_09
		bodyWheelModel[9] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import CW_10
		bodyWheelModel[10] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Import CW_11
		bodyWheelModel[11] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Import CW_12
		bodyWheelModel[12] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Import CW_13
		bodyWheelModel[13] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import CW_14
		bodyWheelModel[14] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Import CW_15
		bodyWheelModel[15] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Import CW_16
		bodyWheelModel[16] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import CW_17
		bodyWheelModel[17] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Import CW_18
		bodyWheelModel[18] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Import CW_19

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import CW_01
		bodyWheelModel[0].setRotationPoint(-91F, 6F, -2F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CW_02
		bodyWheelModel[1].setRotationPoint(-91F, 2F, -2F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CW_03
		bodyWheelModel[2].setRotationPoint(-91F, -2F, -2F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import CW_04
		bodyWheelModel[3].setRotationPoint(-62F, -17F, -3F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import CW_05
		bodyWheelModel[4].setRotationPoint(-71F, -17F, -3F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0F, -1.875F, -0.5F, 0F, 1.875F, -0.5F, 0F, 1.875F, -0.5F, 0F, -1.875F, -0.5F, 0F); // Import CW_06
		bodyWheelModel[5].setRotationPoint(-86F, -4F, -3F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0F); // Import CW_07
		bodyWheelModel[6].setRotationPoint(-86F, -11F, -1F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-4.25F, 0F, 0F, 4.25F, 0F, 0F, 4.25F, 0F, 0F, -4.25F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Import CW_08
		bodyWheelModel[7].setRotationPoint(-86.5F, -12F, -1.5F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -4.25F, 0F, 0F, 4.25F, 0F, 0F, 4.25F, 0F, 0F, -4.25F, 0F, 0F); // Import CW_09
		bodyWheelModel[8].setRotationPoint(-86F, -19F, -1F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1.875F, 0.5F, -0.25F, 1.875F, 0.5F, -0.25F, 1.875F, 0.5F, 0F, -1.875F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CW_10
		bodyWheelModel[9].setRotationPoint(-86F, -2F, 2F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,-4.375F, 0F, 0F, 4.375F, 0F, 0F, 4.375F, 0F, 0F, -4.375F, 0F, 0F, -1.875F, -0.5F, 0F, 1.875F, -0.5F, 0F, 1.875F, -0.5F, 0F, -1.875F, -0.5F, 0F); // Import CW_11
		bodyWheelModel[10].setRotationPoint(-83.5F, -12F, -1F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,-4.375F, 0F, 0F, 4.375F, 0F, 0F, 4.375F, 0F, 0F, -4.375F, 0F, 0F, -5.75F, 0F, 0F, 5.75F, 0F, 0F, 5.75F, 0F, 0F, -5.75F, 0F, 0F); // Import CW_12
		bodyWheelModel[11].setRotationPoint(-83.5F, -12F, -1F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-5.75F, 0F, 0F, 5.75F, 0F, 0F, 5.75F, 0F, 0F, -5.75F, 0F, 0F, -1.875F, -0.5F, 0F, 1.875F, -0.5F, 0F, 1.875F, -0.5F, 0F, -1.875F, -0.5F, 0F); // Import CW_13
		bodyWheelModel[12].setRotationPoint(-83.5F, -6F, -1F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-2.125F, 0F, 0F, 2.125F, 0F, 0F, 2.125F, 0F, 0F, -2.125F, 0F, 0F, -1.875F, 0F, 0F, 1.875F, 0F, 0F, 1.875F, 0F, 0F, -1.875F, 0F, 0F); // Import CW_14
		bodyWheelModel[13].setRotationPoint(-84.5F, -3.5F, -1F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CW_15
		bodyWheelModel[14].setRotationPoint(-86F, 3F, -3F);

		bodyWheelModel[15].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,-6F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, -6F, 0F, 0F, -4F, -1F, 0F, 3.5F, -1F, 0F, 3.25F, 0F, 0F, -3.75F, 0F, 0F); // Import CW_16
		bodyWheelModel[15].setRotationPoint(-87F, -19F, 0F);

		bodyWheelModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-2.125F, 0F, 0F, 2.125F, 0F, 0F, 2.125F, 0F, 0F, -2.125F, 0F, 0F, -1.875F, 0F, 0F, 1.875F, 0F, 0F, 1.875F, 0F, 0F, -1.875F, 0F, 0F); // Import CW_17
		bodyWheelModel[16].setRotationPoint(-81.5F, -12F, -1F);

		bodyWheelModel[17].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1.875F, 0.5F, 0F, 1.875F, 0.5F, 0F, 1.875F, 0.5F, -0.25F, -1.875F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import CW_18
		bodyWheelModel[17].setRotationPoint(-86F, -2F, -3F);

		bodyWheelModel[18].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,-6F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, -6F, 0F, 0F, -3.75F, 0F, 0F, 3.25F, 0F, 0F, 3.5F, -1F, 0F, -4F, -1F, 0F); // Import CW_19
		bodyWheelModel[18].setRotationPoint(-87F, -19F, -2F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Import LWW_02
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Import LWW_03
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Import LWW_04
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Import LWW_05
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Import LWW_06
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Import LWW_07
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Import LWW_08
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Import LWW_09
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Import LWW_10
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import LWW_11
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Import LWW_12
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import LWW_13
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Import LWW_14

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_02
		leftWingWheelModel[0].setRotationPoint(-13F, -4F, -26F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_03
		leftWingWheelModel[1].setRotationPoint(-13F, 0F, -26F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LWW_04
		leftWingWheelModel[2].setRotationPoint(-13F, 6F, -26F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_05
		leftWingWheelModel[3].setRotationPoint(-8F, 1F, -29.5F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,-0.3F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Import LWW_06
		leftWingWheelModel[4].setRotationPoint(-8F, -3F, -29.5F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,-1.1F, 0F, -1.1F, 0.9F, 0F, -1.1F, 0.9F, 0F, 0.9F, -1.1F, 0F, 0.9F, -0.55F, 0F, -0.55F, 0.35F, 0F, -0.55F, 0.35F, 0F, 0.35F, -0.55F, 0F, 0.35F); // Import LWW_07
		leftWingWheelModel[5].setRotationPoint(-8F, -19F, -29.5F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.9F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.65F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.25F, -0.65F, 0F, -0.25F); // Import LWW_08
		leftWingWheelModel[6].setRotationPoint(-8F, -8F, -29.5F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Import LWW_09
		leftWingWheelModel[7].setRotationPoint(-6.7F, -16F, -28.5F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 7, 13, 1, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.11904762F, 0F, 0F, 0.11904762F, 0F, 0F, -0.61904762F, 0F, 0F, -0.61904762F); // Import LWW_10
		leftWingWheelModel[8].setRotationPoint(-10.5F, -19F, -30.5F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 17, 5, 1, 0F,-2F, 0F, 0.26190476F, -1F, 0F, 0.26190476F, -1F, 0F, -0.76190476F, -2F, 0F, -0.76190476F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Import LWW_11
		leftWingWheelModel[9].setRotationPoint(-15F, -3F, -30.5F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,-3F, 0F, 0.11904762F, -4.5F, 0F, 0.11904762F, -4.5F, 0F, -0.61904762F, -3F, 0F, -0.61904762F, 0F, 0F, 0.26190476F, 0F, 0F, 0.26190476F, 0F, 0F, -0.76190476F, 0F, 0F, -0.76190476F); // Import LWW_12
		leftWingWheelModel[10].setRotationPoint(-13F, -6F, -30.5F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,0F, -9F, -0.07142857F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -9F, -0.42857143F, 0F, -4F, -0.07142857F, 0F, 0F, 0.11904762F, 0F, 0F, -0.61904762F, 0F, -4F, -0.42857143F); // Import LWW_13
		leftWingWheelModel[11].setRotationPoint(-12.5F, -19F, -30.5F);

		leftWingWheelModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_14
		leftWingWheelModel[12].setRotationPoint(-7.4F, -12F, -30F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 241, 313, textureX, textureY); // Box 250
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 137, 321, textureX, textureY); // Box 251
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 465, 321, textureX, textureY); // Box 252
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 253
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 254
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 255
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 256
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 257
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 385, 265, textureX, textureY); // Box 258
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 241, 329, textureX, textureY); // Box 259
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 260
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 261
		rightWingWheelModel[12] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 262

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		rightWingWheelModel[0].setRotationPoint(-13F, -4F, 22F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		rightWingWheelModel[1].setRotationPoint(-13F, 0F, 22F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 252
		rightWingWheelModel[2].setRotationPoint(-13F, 6F, 22F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		rightWingWheelModel[3].setRotationPoint(-8F, 1F, 21.5F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,-0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 254
		rightWingWheelModel[4].setRotationPoint(-8F, -3F, 26.5F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,-1.1F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, -1.1F, -1.1F, 0F, -1.1F, -0.55F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, -0.55F, -0.55F, 0F, -0.55F); // Box 255
		rightWingWheelModel[5].setRotationPoint(-8F, -19F, 26.5F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.65F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.65F, -0.65F, 0F, -0.65F); // Box 256
		rightWingWheelModel[6].setRotationPoint(-8F, -8F, 26.5F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		rightWingWheelModel[7].setRotationPoint(-6.7F, -16F, 19.5F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 7, 13, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.61904762F, 0F, 0F, -0.61904762F, 0F, 0F, 0.11904762F, 0F, 0F, 0.11904762F); // Box 258
		rightWingWheelModel[8].setRotationPoint(-10.5F, -19F, 29.5F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 17, 5, 1, 0F,-2F, 0F, -0.76190476F, -1F, 0F, -0.76190476F, -1F, 0F, 0.26190476F, -2F, 0F, 0.26190476F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 259
		rightWingWheelModel[9].setRotationPoint(-15F, -3F, 29.5F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,-3F, 0F, -0.61904762F, -4.5F, 0F, -0.61904762F, -4.5F, 0F, 0.11904762F, -3F, 0F, 0.11904762F, 0F, 0F, -0.76190476F, 0F, 0F, -0.76190476F, 0F, 0F, 0.26190476F, 0F, 0F, 0.26190476F); // Box 260
		rightWingWheelModel[10].setRotationPoint(-13F, -6F, 29.5F);

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,0F, -9F, -0.42857143F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -9F, -0.07142857F, 0F, -4F, -0.42857143F, 0F, 0F, -0.61904762F, 0F, 0F, 0.11904762F, 0F, -4F, -0.07142857F); // Box 261
		rightWingWheelModel[11].setRotationPoint(-12.5F, -19F, 29.5F);

		rightWingWheelModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		rightWingWheelModel[12].setRotationPoint(-7.4F, -12F, 27F);
	}
}