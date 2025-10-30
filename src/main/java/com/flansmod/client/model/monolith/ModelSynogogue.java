//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Synogogue
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSynogogue extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelSynogogue() //Same as Filename
	{
		headModel = new ModelRendererTurbo[19];
		bodyModel = new ModelRendererTurbo[11];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 51
		headModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 52
		headModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 53
		headModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 54
		headModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 59
		headModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 60
		headModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 61
		headModel[8] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 62
		headModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 63
		headModel[10] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 66
		headModel[11] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 93
		headModel[12] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 51
		headModel[13] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 52
		headModel[14] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 53
		headModel[15] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 54
		headModel[16] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 55
		headModel[17] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 56
		headModel[18] = new ModelRendererTurbo(this, 74, 77, textureX, textureY); // Box 63

		headModel[0].addShapeBox(-3.5F, -10F, -4F, 7, 3, 9, 0F,-1.5F, 0.5F, -2F, -1.5F, 0.5F, -2F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 50
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-3.5F, -6F, -3.5F, 7, 1, 1, 0F,-0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, -0.2F, 1F, 0.2F, -0.2F, 1F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F); // Box 51
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-3.5F, -4.5F, -3.5F, 7, 1, 1, 0F,0.2F, 0.7F, 1F, 0.2F, 0.7F, 1F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.3F, 0.5F, 0.8F, 0.3F, 0.5F, 0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 52
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1F, -6F, -4F, 2, 1, 1, 0F,-0.2F, 1.4F, -0.2F, -0.2F, 1.4F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0.7F, -0.5F, 0F, 0.7F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F); // Box 53
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-1F, -5F, -5F, 2, 1, 1, 0F,-0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.2F, 0.5F, 1F, -0.2F, 0.5F, 1F, -0.2F, 0.7F, -0.5F, -0.2F, 0.7F, -0.5F); // Box 54
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-2.5F, -6.3F, -4.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 59
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-3.5F, -4.5F, -4F, 7, 2, 4, 0F,-0.1F, 2F, -0.5F, -0.1F, 2F, -0.5F, -0.1F, 1F, 2F, -0.1F, 1F, 2F, 0.7F, 0.5F, 1F, 0.7F, 0.5F, 1F, 0.7F, 0.5F, 1.5F, 0.7F, 0.5F, 1.5F); // Box 60
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3.5F, -5F, -4F, 7, 2, 9, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 2F, -2F, -1.5F, 2F, -2F, -0.5F, 3F, -1.5F, -0.5F, 3F, -1.5F); // Box 61
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-3.5F, -1.5F, -4F, 7, 1, 4, 0F,0.7F, 0.5F, 1F, 0.7F, 0.5F, 1F, 0.7F, 0.5F, 1.5F, 0.7F, 0.5F, 1.5F, -1F, 1F, 0.4F, -1F, 1F, 0.4F, -1F, 2F, 1F, -1F, 2F, 1F); // Box 62
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-2F, -1.5F, -4.8F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, -0.5F); // Box 63
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-2F, -3.5F, -1F, 4, 6, 4, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -0.2F, -0.5F, 1.5F, -0.2F, -0.5F, 1.5F, 0F, 1F, 1.5F, 0F, 1F); // Box 66
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(1.5F, -6.3F, -4.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 93
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-3.5F, -8.5F, -6.5F, 7, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 51
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-3.5F, -11.5F, -4F, 7, 3, 9, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 2.5F, 0.5F, 0.5F, 2.5F, 0.5F); // Box 52
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-3.5F, -10.5F, -3.5F, 4, 1, 9, 0F,-0.8F, 1.5F, -0.8F, -1.8F, 1.5F, -0.8F, -1.8F, 0.5F, -0.8F, -0.8F, 0.5F, -0.8F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 53
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.5F, -10.5F, -3.5F, 4, 1, 9, 0F,-1.8F, 1.5F, -0.8F, -0.8F, 1.5F, -0.8F, -0.8F, 0.5F, -0.8F, -1.8F, 0.5F, -0.8F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 54
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-6.5F, -8.5F, -6.5F, 3, 1, 14, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, -3F); // Box 55
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(3.5F, -8.5F, -6.5F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 2F, 0F); // Box 56
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(1F, -2.2F, -8.8F, 1, 1, 4, 0F,-1.4F, 0.5F, 0F, 1.6F, 0.5F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, -0.3F, 0F, 1.6F, -0.3F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		headModel[18].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 67
		bodyModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 68
		bodyModel[2] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 69
		bodyModel[3] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 48
		bodyModel[4] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 49
		bodyModel[5] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 57
		bodyModel[6] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 58
		bodyModel[7] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 59
		bodyModel[8] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 60
		bodyModel[9] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 61
		bodyModel[10] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 62

		bodyModel[0].addShapeBox(-4F, 1.5F, -1F, 8, 4, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 67
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 5.5F, -1F, 8, 5, 5, 0F,1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 1F, 1F, 0F, 1F, 1.5F, 0F, 2.5F, 1.5F, 0F, 2.5F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F); // Box 68
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 10.5F, -1F, 8, 3, 5, 0F,0.5F, 0F, 2.5F, 0.5F, 0F, 2.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 69
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 2.5F, -3F, 4, 4, 1, 0F,-0.3F, 0F, -1.5F, -0.2F, -1F, -1.4F, -0.2F, -1F, 1F, -0.3F, 0F, 1.5F, 0.5F, -1F, 1F, -1F, -1.2F, 1F, -1F, 1.8F, 0F, 0F, 1F, 0F); // Box 48
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, 2.5F, -3F, 4, 4, 1, 0F,-0.2F, -1F, -1.4F, -0.3F, 0F, -1.5F, -0.3F, 0F, 1.5F, -0.2F, -1F, 1F, -1F, -1.2F, 1F, 0.5F, -1F, 1F, 0F, 1F, 0F, -1F, 1.8F, 0F); // Box 49
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-5F, 10.5F, -1F, 5, 5, 1, 0F,0.5F, 0F, 2.5F, 0.5F, 0F, 2.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1F, -0.5F, 3F, -1F, 0.5F, 3F, -1F, 0.5F, 1F, 1F, -0.5F, 1F); // Box 57
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 10.5F, -1F, 5, 5, 1, 0F,0.5F, 0F, 2.5F, 0.5F, 0F, 2.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1F, 0.5F, 3F, 1F, -0.5F, 3F, 1F, -0.5F, 1F, -1F, 0.5F, 1F); // Box 58
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3F, 1.5F, -1.2F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9F, -0.5F, 1.8F, -2.9F, -0.5F, 1.8F, -2.9F, 0.5F, 0F, -2.9F, -0.5F, 0F); // Box 59
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-1F, 1.5F, -2F, 2, 1, 1, 0F,-0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 60
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-2.8F, 1.5F, -2F, 2, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.5F, 0.5F, 0F); // Box 61
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0.8F, 1.5F, -2F, 2, 1, 1, 0F,0F, 0.1F, -0.2F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.1F, -0.2F); // Box 62
		bodyModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 94
		leftArmModel[1] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 95
		leftArmModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 50

		leftArmModel[0].addShapeBox(-1F, -0.5F, -1F, 3, 6, 3, 0F,1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1.5F, 1F, -2F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 1F, -2F, 0F, 1F); // Box 94
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 5.5F, -1F, 3, 6, 3, 0F,-2F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 1F, -2F, 0F, 1F, -2.5F, 0.5F, 0F, 2F, 0F, 0F, 2F, 1F, -1F, -2.5F, 1.5F, -1F); // Box 95
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 5.5F, -1F, 3, 5, 3, 0F,-2F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 1F, -2F, 0F, 1F, -2F, -0.5F, 0.5F, 2.5F, -1F, 0.5F, 2.5F, 0F, 0F, -2F, 0.5F, 0F); // Box 50
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 74
		rightArmModel[1] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 75
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 49

		rightArmModel[0].addShapeBox(-2F, -0.5F, -1F, 3, 6, 3, 0F,0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 1.5F, 1F, 0F, 1F, 0F, 3F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, 3F, 0F, 1F); // Box 74
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-2F, 5.5F, -1F, 3, 6, 3, 0F,3F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, 3F, 0F, 1F, 2F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 1.5F, -1F, 2F, 1F, -1F); // Box 75
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-2F, 5.5F, -1F, 3, 5, 3, 0F,3F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, 3F, 0F, 1F, 2.5F, -1F, 0.5F, -2F, -0.5F, 0.5F, -2F, 0.5F, 0F, 2.5F, 0F, 0F); // Box 49
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 96
		leftLegModel[1] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 97
		leftLegModel[2] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 98

		leftLegModel[0].addShapeBox(-1.2F, -3.5F, -1F, 3, 4, 4, 0F,-1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, -2F, 0F, 1.5F, -2F, 0F, 1.5F, 0F, 3F, 1F, 0F, 3F); // Box 96
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.2F, 0.5F, -1F, 3, 6, 4, 0F,1F, 2F, 0F, 1.5F, 2F, 0F, 1.5F, 0F, 3F, 1F, 0F, 3F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, -1F); // Box 97
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.2F, 6.5F, -2F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F); // Box 98
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 70
		rightLegModel[1] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 71
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 76

		rightLegModel[0].addShapeBox(-1.8F, 0.5F, -1F, 3, 6, 4, 0F,1.5F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 3F, 1.5F, 0F, 3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 70
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.8F, 6.5F, -2F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F); // Box 71
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-1.8F, -3.5F, -1F, 3, 4, 4, 0F,0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 1.5F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 3F, 1.5F, 0F, 3F); // Box 76
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}
}