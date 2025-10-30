//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: bodysuitstarwars
// Model Creator: 
// Created on: 31.08.2024 - 18:12:45
// Last changed on: 31.08.2024 - 18:12:45

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelbodysuitstarwars extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public Modelbodysuitstarwars() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[2];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[1];
		rightLegModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 5

		bodyModel[0].addShapeBox(-4F, -0.1F, -2F, 8, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 4
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-1.5F, 1.9F, -2.1F, 19, 19, 1, 0F,0.1F, 0F, 0.1F, -15.9F, 0F, 0.1F, -15.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -16F, 0.1F, -15.9F, -16F, 0.1F, -15.9F, -16F, 0.1F, 0.1F, -16F, 0.1F); // Box 5
		bodyModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F); // Import Box1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box2

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F); // Import Box2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box99

		leftLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box99
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box98

		rightLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box98
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
	}
}