//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CargoShippu
// Model Creator: 
// Created on: 30.03.2024 - 16:22:34
// Last changed on: 30.03.2024 - 16:22:34

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTrueLiberty extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelTrueLiberty() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[54];
		leftFrontWheelModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftFrontWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1
		bodyModel[1] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box2
		bodyModel[2] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box4
		bodyModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box5
		bodyModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box6
		bodyModel[5] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import Box7
		bodyModel[6] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box8
		bodyModel[7] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Import Box9
		bodyModel[8] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import Box10
		bodyModel[9] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Import Box11
		bodyModel[10] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Import Box12
		bodyModel[11] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box13
		bodyModel[12] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Import Box14
		bodyModel[13] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Import Box15
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box16
		bodyModel[15] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box17
		bodyModel[16] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box259
		bodyModel[17] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box260
		bodyModel[18] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box261
		bodyModel[19] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box262
		bodyModel[20] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Import Box23
		bodyModel[21] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Import Box24
		bodyModel[22] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Import Box25
		bodyModel[23] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import Box26
		bodyModel[24] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box27
		bodyModel[25] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box28
		bodyModel[26] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box29
		bodyModel[27] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Import Box30
		bodyModel[28] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box31
		bodyModel[29] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Import Box32
		bodyModel[30] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box33
		bodyModel[31] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box34
		bodyModel[32] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Import Box35
		bodyModel[33] = new ModelRendererTurbo(this, 7, 188, textureX, textureY); // Import Box36
		bodyModel[34] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import Box37
		bodyModel[35] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Import Box38
		bodyModel[36] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Import Box39
		bodyModel[37] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Import Box42
		bodyModel[38] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Import Box43
		bodyModel[39] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Import Box47
		bodyModel[40] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Import Box48
		bodyModel[41] = new ModelRendererTurbo(this, 153, 184, textureX, textureY); // Import Box49
		bodyModel[42] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Import Box50
		bodyModel[43] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Import Box51
		bodyModel[44] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box53
		bodyModel[45] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Import Box54
		bodyModel[46] = new ModelRendererTurbo(this, 153, 184, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 153, 184, textureX, textureY); // Box 1
		bodyModel[48] = new ModelRendererTurbo(this, 153, 184, textureX, textureY); // Box 2
		bodyModel[49] = new ModelRendererTurbo(this, 153, 184, textureX, textureY); // Box 3
		bodyModel[50] = new ModelRendererTurbo(this, 153, 184, textureX, textureY); // Box 4
		bodyModel[51] = new ModelRendererTurbo(this, 153, 184, textureX, textureY); // Box 5
		bodyModel[52] = new ModelRendererTurbo(this, 153, 184, textureX, textureY); // Box 6
		bodyModel[53] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 7

		bodyModel[0].addShapeBox(0F, 0F, 0F, 120, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box1
		bodyModel[0].setRotationPoint(-60F, 0F, -15F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 22, 10, 30, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -9F); // Import Box2
		bodyModel[1].setRotationPoint(-82F, 0F, -15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 15, 10, 30, 0F,0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, -1F, -13F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, -13F); // Import Box4
		bodyModel[2].setRotationPoint(-97F, 0F, -15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 10, 9, 18, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, -5F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, -1F, -5F, -8F); // Import Box5
		bodyModel[3].setRotationPoint(-107F, 0F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 22, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F); // Import Box6
		bodyModel[4].setRotationPoint(60F, 0F, -15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 15, 10, 30, 0F,0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -7F); // Import Box7
		bodyModel[5].setRotationPoint(82F, 0F, -15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 10, 18, 0F,0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -6F, -2F, 0F, -8F, -2F, 0F, -8F, 0F, 0F, -6F); // Import Box8
		bodyModel[6].setRotationPoint(97F, 0F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 10, 8, 18, 0F,0F, 0F, -6F, -2F, 0F, -8F, -2F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, -8F, -5F, 0F, -9F, -5F, 0F, -9F, 0F, 0F, -8F); // Import Box9
		bodyModel[7].setRotationPoint(97F, 10F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 8, 30, 0F,0F, 0F, -7F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -7F, 0F, 0F, -12F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -12F); // Import Box10
		bodyModel[8].setRotationPoint(82F, 10F, -15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 22, 8, 30, 0F,0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -10F); // Import Box11
		bodyModel[9].setRotationPoint(60F, 10F, -15F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 60, 8, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -8F); // Import Box12
		bodyModel[10].setRotationPoint(0F, 10F, -15F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 60, 8, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -10F); // Import Box13
		bodyModel[11].setRotationPoint(-60F, 10F, -15F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 22, 8, 30, 0F,0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -9F, 0F, 0F, -13F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -13F); // Import Box14
		bodyModel[12].setRotationPoint(-82F, 10F, -15F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 15, 8, 30, 0F,0F, 1F, -13F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 1F, -13F, -2.5F, 0F, -14F, 0F, 0F, -13F, 0F, 0F, -13F, -2.5F, 0F, -14F); // Import Box15
		bodyModel[13].setRotationPoint(-97F, 10F, -15F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box16
		bodyModel[14].setRotationPoint(-103F, 16F, -1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box17
		bodyModel[15].setRotationPoint(-102.5F, 5F, -0.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box259
		bodyModel[16].setRotationPoint(-101F, 11F, -0.5F);

		bodyModel[17].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box260
		bodyModel[17].setRotationPoint(-100F, 11.5F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box261
		bodyModel[18].setRotationPoint(-100F, 11.5F, 0F);
		bodyModel[18].rotateAngleX = 4.1887902F;

		bodyModel[19].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box262
		bodyModel[19].setRotationPoint(-100F, 11.5F, 0F);
		bodyModel[19].rotateAngleX = 2.0943951F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 38, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[20].setRotationPoint(-26F, -6F, -13F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 32, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		bodyModel[21].setRotationPoint(-23F, -9F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 23, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		bodyModel[22].setRotationPoint(-13.9F, -13F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 9, 4, 8, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Import Box26
		bodyModel[23].setRotationPoint(1F, -16F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[24].setRotationPoint(6F, -16F, -14F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[25].setRotationPoint(6F, -12F, -14F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		bodyModel[26].setRotationPoint(6F, -12F, 13F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		bodyModel[27].setRotationPoint(-29F, -6F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		bodyModel[28].setRotationPoint(-3.7F, -25F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box32
		bodyModel[29].setRotationPoint(3.3F, -32F, -0.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Import Box33
		bodyModel[30].setRotationPoint(3.3F, -37F, -0.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F); // Import Box34
		bodyModel[31].setRotationPoint(3.3F, -30.3F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F); // Import Box35
		bodyModel[32].setRotationPoint(1.8F, -30.7F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 64, 24, 1, 0F,0.5F, -2F, -0.45F, -56.4F, 0F, -0.45F, -56.4F, 0F, -0.45F, 0.5F, -2F, -0.45F, 0F, -17F, -0.45F, -56.4F, -19F, -0.45F, -56.4F, -19F, -0.45F, 0F, -17F, -0.45F); // Import Box36
		bodyModel[33].setRotationPoint(-3.9F, -36.5F, -0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 22, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box37
		bodyModel[34].setRotationPoint(60F, -3F, -15F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 15, 5, 30, 0F,0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -4F); // Import Box38
		bodyModel[35].setRotationPoint(82F, -5F, -15F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 10, 5, 18, 0F,0F, 0F, -3F, 1F, 0F, -8F, 1F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -3F); // Import Box39
		bodyModel[36].setRotationPoint(97F, -5F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		bodyModel[37].setRotationPoint(-76F, -1F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box43
		bodyModel[38].setRotationPoint(-50F, -1F, -8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		bodyModel[39].setRotationPoint(18F, -8F, -7F);
		bodyModel[39].rotateAngleY = 0.20943951F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		bodyModel[40].setRotationPoint(40F, -8F, -1F);
		bodyModel[40].rotateAngleY = 1.32645023F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 32, 32, 32, 0F,-12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F); // Import Box49
		bodyModel[41].setRotationPoint(49F, -20F, -16F);
		bodyModel[41].rotateAngleY = 0.78539816F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		bodyModel[42].setRotationPoint(39F, -8F, -10F);
		bodyModel[42].rotateAngleY = 0.08726646F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		bodyModel[43].setRotationPoint(22F, -8F, 5F);
		bodyModel[43].rotateAngleY = -0.43633231F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 50, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[44].setRotationPoint(10F, -3F, 14F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 50, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box54
		bodyModel[45].setRotationPoint(10F, -3F, -15F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 32, 32, 32, 0F,-12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F); // Box 0
		bodyModel[46].setRotationPoint(30F, -20F, -27F);
		bodyModel[46].rotateAngleY = 0.68067841F;

		bodyModel[47].addShapeBox(-12F, 0F, -12F, 32, 32, 32, 0F,-12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F); // Box 1
		bodyModel[47].setRotationPoint(13F, -20F, 4F);
		bodyModel[47].rotateAngleY = -0.17453293F;

		bodyModel[48].addShapeBox(-12F, 0F, -12F, 32, 32, 32, 0F,-12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F); // Box 2
		bodyModel[48].setRotationPoint(19F, -28F, 4F);
		bodyModel[48].rotateAngleY = -0.62831853F;

		bodyModel[49].addShapeBox(-12F, 0F, -12F, 32, 32, 32, 0F,-12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F); // Box 3
		bodyModel[49].setRotationPoint(69F, -23F, 4F);
		bodyModel[49].rotateAngleY = -1.37881011F;

		bodyModel[50].addShapeBox(-12F, 0F, -12F, 32, 32, 32, 0F,-12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F); // Box 4
		bodyModel[50].setRotationPoint(-72F, -21F, 4F);
		bodyModel[50].rotateAngleY = -1.37881011F;

		bodyModel[51].addShapeBox(-12F, 0F, -12F, 32, 32, 32, 0F,-12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F); // Box 5
		bodyModel[51].setRotationPoint(-42F, -21F, 5F);
		bodyModel[51].rotateAngleY = -2.35619449F;

		bodyModel[52].addShapeBox(-12F, 0F, -12F, 32, 32, 32, 0F,-12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F, -12F); // Box 6
		bodyModel[52].setRotationPoint(48F, -28F, -4F);
		bodyModel[52].rotateAngleY = 0.78539816F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[53].setRotationPoint(48F, -8F, -5F);
		bodyModel[53].rotateAngleY = -0.54105207F;
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box18

		leftFrontWheelModel[0].addShapeBox(-4F, -3F, -0.5F, 4, 9, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box18
		leftFrontWheelModel[0].setRotationPoint(-102F, 10F, 0F);
	}
}