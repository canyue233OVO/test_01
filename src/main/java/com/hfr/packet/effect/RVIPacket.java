package com.hfr.packet.effect;

import java.util.Arrays;

import com.hfr.main.MainRegistry;
import com.hfr.rvi.RVICommon.Indicator;
import com.hfr.rvi.RVICommon.RVIType;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;

public class RVIPacket implements IMessage {

	Indicator[] indicators;

	public RVIPacket() { }

	public RVIPacket(Indicator[] indicators) {
		
		if(indicators == null)
			indicators = new Indicator[0];
		
		this.indicators = indicators;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		
		indicators = new Indicator[buf.readInt()];
		
		for(int i = 0; i < indicators.length; i++) {
			indicators[i] = new Indicator(
			ByteBufUtils.readUTF8String(buf),
			RVIType.values()[buf.readInt()],
			buf.readDouble(), buf.readDouble(), buf.readDouble(), // position
			buf.readDouble(), buf.readDouble(), buf.readDouble(), // rotation
			
			buf.readDouble(), buf.readDouble(), buf.readDouble(), // motion
			buf.readLong()
			);
		}
	}

	@Override
	public void toBytes(ByteBuf buf) {
		
		buf.writeInt(indicators.length);
		
		for(int i = 0; i < indicators.length; i++) {
			ByteBufUtils.writeUTF8String(buf, indicators[i].vehicleName);
			buf.writeInt(indicators[i].type.ordinal());
			buf.writeDouble(indicators[i].x);
			buf.writeDouble(indicators[i].y);
			buf.writeDouble(indicators[i].z);
			buf.writeDouble(indicators[i].rx);
			buf.writeDouble(indicators[i].ry);
			buf.writeDouble(indicators[i].rz);
			buf.writeDouble(indicators[i].mx);
			buf.writeDouble(indicators[i].my);
			buf.writeDouble(indicators[i].mz);
			buf.writeLong(indicators[i].lastUpdate);
		}
	}

	public static class Handler implements IMessageHandler<RVIPacket, IMessage> {

		@Override
		@SideOnly(Side.CLIENT)
		public IMessage onMessage(RVIPacket m, MessageContext ctx) {
			
			MainRegistry.proxy.addRVIs(Arrays.asList(m.indicators));
			
			return null;
		}
	}
}