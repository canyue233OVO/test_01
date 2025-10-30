package com.flansmod.common.network;

import java.util.Random;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;

public class PacketShakeRecoil extends PacketBase 
{

	public int strength;

	public PacketShakeRecoil() {}

	public static void sendShakePacket(double x, double y, double z, int strength, float range, int dimension)
	{	
		FlansMod.getPacketHandler().sendToAllAround(new PacketShakeRecoil(strength), x, y, z, range, dimension);
	}
	

	public PacketShakeRecoil(int strength)
	{
		this.strength = strength;
	}
	

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{

		data.writeInt(strength);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{

		strength = data.readInt();

	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		FlansMod.log("Received recoil screen shake packet on server. Skipping.");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{           	
		FlansModClient.screenShaker(strength);
	}

}
