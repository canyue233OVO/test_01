//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Mussolini
// Model Creator: 
// Created on: 19.05.2020 - 08:09:04
// Last changed on: 19.05.2020 - 08:09:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMussolini extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelMussolini() //Same as Filename
	{
		headModel = new ModelRendererTurbo[22];
		bodyModel = new ModelRendererTurbo[6];
		leftArmModel = new ModelRendererTurbo[10];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 22
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 26
		headModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		headModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 28
		headModel[4] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 63
		headModel[5] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 34
		headModel[6] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 36
		headModel[7] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 37
		headModel[8] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 38
		headModel[9] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 39
		headModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 40
		headModel[11] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 41
		headModel[12] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 42
		headModel[13] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 43
		headModel[14] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 44
		headModel[15] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 45
		headModel[16] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 46
		headModel[17] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 47
		headModel[18] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 48
		headModel[19] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 49
		headModel[20] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 50
		headModel[21] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 51

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 8, 8, 0F,0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.3F, 0.5F, 0.05F, 0.3F, 0.5F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F, 0.05F); // Box 22
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-3F, -5F, -4.2F, 2, 1, 1, 0F,-0.7F, 0F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, -0.7F, 0F, 0F, -0.2F, -0.5F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, -0.5F, 0F); // Box 26
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-3.8F, -5F, -4.2F, 1, 1, 1, 0F,-0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F); // Box 27
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -4F, -4F, 1, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0.5F, 1.2F, 0F, 0.5F, 1.2F, 0F); // Box 28
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-3F, -0.8F, -3.8F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -0.2F, 1.5F, -1F, -0.2F, 1.5F); // Box 63
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -9.5F, -4.5F, 9, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0.1F, -0.5F, 0.3F, 0.1F, -0.5F, 0.3F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 34
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, -10.5F, -4.5F, 9, 2, 9, 0F,-0.9F, 0.3F, -1.4F, -0.9F, 0.3F, -1.4F, -0.9F, -0.5F, -0.8F, -0.9F, -0.5F, -0.8F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 36
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-6F, -9.5F, -1.5F, 3, 3, 4, 0F,-1F, 0.5F, -1F, 1F, 0.5F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 37
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-6F, -6.5F, -1.5F, 3, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 38
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-3.5F, -10F, -4.7F, 1, 3, 1, 0F,-0.7F, -0.2F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.7F, -0.2F, 0F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 39
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4.5F, -7.5F, -4.7F, 2, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 40
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4.8F, -7.5F, -4.7F, 1, 1, 9, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 1F, 0.3F, 0F, 1F, 0.3F); // Box 41
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-3.5F, -9F, 3.8F, 1, 3, 1, 0F,-0.7F, -0.2F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.7F, -0.2F, 0F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 42
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4.5F, -6.5F, 3.5F, 2, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 43
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(1F, -5F, -4.2F, 2, 1, 1, 0F,0.3F, -0.4F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.3F, -0.4F, 0F, 0.4F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.4F, 0F, 0F); // Box 44
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(2.8F, -5F, -4.2F, 1, 1, 1, 0F,0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F); // Box 45
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-0.5F, -10F, -4.7F, 1, 2, 1, 0F,-0.2F, -0.3F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.2F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-0.5F, -8F, -4.7F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 47
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-1.1F, -9.9F, -4.7F, 1, 1, 1, 0F,0F, -0.8F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 48
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-0.5F, -7F, -4.9F, 1, 1, 1, 0F,0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F); // Box 49
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-1.5F, -8.5F, -4.7F, 1, 1, 1, 0F,0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0.3F, 0F, 0.1F, -0.8F, 1.2F, 0.1F, -0.8F, 1.2F, 0.1F, 0.3F, 0F, 0.1F); // Box 50
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(0.5F, -8.5F, -4.7F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, -0.8F, 1.2F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, -0.8F, 1.2F, 0.1F); // Box 51
		headModel[21].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 58
		bodyModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 14
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 24
		bodyModel[4] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 31
		bodyModel[5] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 59

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 7, 4, 0F,1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 8F, -2F, 4, 4, 4, 0F,0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.5F, 0F, 0.1F, 1F, -0.5F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, -0.5F, 0.3F); // Box 58
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4.5F, 7F, -2F, 9, 1, 4, 0F,0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 14
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, 8F, -2F, 4, 4, 4, 0F,0F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.5F, 1F, -0.5F, 0.3F, 1F, -0.5F, 0.3F, 0F, 0F, 0.5F); // Box 24
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-2.5F, -0.5F, -2.5F, 1, 8, 5, 0F,1.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 1.1F, 0F, 0F, -1.9F, -0.5F, -0.25F, 2.1F, -0.5F, -0.25F, 2.1F, 0F, -0.25F, -1.9F, -0.5F, -0.25F); // Box 31
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-2F, -0.5F, -2.3F, 4, 4, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.98F, 0F, -0.1F, -1.98F, 0F, -0.1F, -1.98F, 0F, 0F, -1.98F, 0F, 0F); // Box 59
		bodyModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 32
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 35
		leftArmModel[2] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 52
		leftArmModel[3] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 60
		leftArmModel[4] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 61
		leftArmModel[5] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 62
		leftArmModel[6] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 63
		leftArmModel[7] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 64
		leftArmModel[8] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 65
		leftArmModel[9] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 66

		leftArmModel[0].addShapeBox(-0.5F, -3F, -1.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F); // Box 32
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 7F, -2F, 4, 3, 4, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 35
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F); // Box 52
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.3F, 1.4F, 0.5F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.1F, 1.2F, -0.8F, 0.1F, 1.2F, -0.8F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F); // Box 60
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(2.3F, -0.0999999999999996F, -0.5F, 1, 2, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2.3F, 0F, -1F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 62
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(2.3F, 1.4F, -1.5F, 1, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 1.2F, -0.8F, 0.1F, 1.2F, -0.8F); // Box 63
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(2.3F, 1.9F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 64
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(2.3F, 2.9F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F); // Box 65
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(2.2F, -0.7F, -0.5F, 1, 5, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.5F, 1.8F, 0.1F, -0.5F, 1.8F, 0.1F, -0.5F, 1.8F, 0F, -0.5F, 1.8F); // Box 66
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 61
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 33
		rightArmModel[2] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 34

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F); // Box 61
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3.5F, -3F, -1.5F, 4, 1, 3, 0F,0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F); // Box 33
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 7F, -2F, 4, 3, 4, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 34
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 27
		leftLegModel[1] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 28
		leftLegModel[2] = new ModelRendererTurbo(this, 37, 52, textureX, textureY); // Box 24
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 25
		leftLegModel[4] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 26

		leftLegModel[0].addShapeBox(-2F, 10F, -4F, 4, 2, 2, 0F,0.1F, -0.9F, 0.1F, 0.1F, -0.9F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 27
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 28
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, -3F, -2F, 4, 7, 4, 0F,0.1F, -0.5F, 0.1F, 0.5F, -0.5F, 0.1F, 0.5F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.3F, 0F, 0.3F, 1.5F, -0.5F, 0.3F, 1.5F, -0.5F, 0.3F, 0.3F, 0F, 0.3F); // Box 24
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 4F, -2F, 4, 2, 4, 0F,0.3F, 0F, 0.3F, 1.5F, 0.5F, 0.3F, 1.5F, 0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 6F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 26
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 18
		rightLegModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 19
		rightLegModel[2] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 58
		rightLegModel[3] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 16
		rightLegModel[4] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 17

		rightLegModel[0].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 18
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10F, -4F, 4, 2, 2, 0F,0.1F, -0.9F, 0.1F, 0.1F, -0.9F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 19
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, -3F, -2F, 4, 7, 4, 0F,0.5F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.5F, -0.5F, 0.1F, 1.5F, -0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 1.5F, -0.5F, 0.3F); // Box 58
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 4F, -2F, 4, 2, 4, 0F,1.5F, 0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 1.5F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 16
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 6F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 17
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}