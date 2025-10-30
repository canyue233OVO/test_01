package com.flansmod.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.google.common.collect.LinkedHashMultimap;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import bariss26.remastered.Ana;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInterModComms;

/**
 * 
 * // TODO YOU WILL NEED TO CHANGE PACKAGE PATH TO WHEREVER YOU WANT AT THE FIRST LINE AFTER PASTING THIS FILE INTO YOUR SRC
 * @author Baris - Irenchin
 *
 */

public class BarisTechTreeHandler {

	/*
	 * Not to be ignored.
	 */

	//TODO this may change
	private static final String BARISMODID = "barismodremaster";

	//TODO change this function to get mod instance from main class
	public static Object getModInstance() {
		return Ana.mod;
	}

	//TODO cut and paste this into the main class, or better copy then comment this one
	@EventHandler
	public void imcCallback(FMLInterModComms.IMCEvent event) {
		BarisTechTreeHandler._messageReceived(event);
	}

	// TODO handle messages here. you can call your own functions from inside of this function
	private static void messageReceived(JsonObject o) {
		// when you get elements you will receive them as objects
		// you need to get them as something to make them useful
//		if(o.has("elementName")) System.out.println(o.get("elementName").getAsDouble());
	}

	private static void exampleSendMessage() {
		BarisPacket myCustomPacket = new BarisPacket();
		myCustomPacket.add("type", "addXP");
		myCustomPacket.add("parameter1", "air");
		myCustomPacket.add("parameter2", "RealIrenchin");
		myCustomPacket.add("parameter3", 12345);
		myCustomPacket.add("sentAt", System.currentTimeMillis());
		BarisTechTreeHandler.sendMessage(myCustomPacket);

		BarisPacket myCustomPacket2 = new BarisPacket();
		myCustomPacket2.add("you can", "put ( most likely ) anything");
		myCustomPacket2.add("string here", "anything here");
		myCustomPacket2.add("key", "value");
		myCustomPacket2.add("try to use", "basic stuff like primitives or basic arrays or basic lists");
		myCustomPacket2.add("random thing which will probably turn into a basic list interface", LinkedHashMultimap.create());
		BarisTechTreeHandler.sendMessage(myCustomPacket2);
	}
	
	// top level end


	/*
	 * Dont change stuff here unless told so.
	 * To be ignored:
	 */

	// ignore start

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.FIELD)
	public @interface Skip {}
	public static Gson gson = new GsonBuilder().setPrettyPrinting().setExclusionStrategies(new ExclusionStrategy() {
		@Override public boolean shouldSkipField(FieldAttributes f) { return f.getAnnotation(Skip.class) != null; }
		@Override public boolean shouldSkipClass(Class<?> clazz) { return false; }
	}).create();
	private static class BarisPair {
		String left;
		Object right;
		private BarisPair(String left, Object right) {
			this.left = left;
			this.right = right;
		}
	}
	public static class BarisPacket {
		public HashMap<String, Object> elements = new HashMap<>();
		public void add(String key, Object value) {
			elements.put(key, value);
		}
	}
	public static void sendMessage(BarisPacket data) {
		FMLInterModComms.sendRuntimeMessage(getModInstance(), BARISMODID, "", gson.toJson(data));
	}

	public static void _messageReceived(FMLInterModComms.IMCEvent event) {
		for (final FMLInterModComms.IMCMessage imcMessage : event.getMessages()) {
			if(!imcMessage.getSender().equals(BARISMODID)) continue;
			if(!imcMessage.isStringMessage()) continue;
			JsonObject o = gson.fromJson(imcMessage.getStringValue(), JsonObject.class);
			if(o==null) continue;
			messageReceived(o);
		}
	}

	// ignore end 

}
