package com.forge.NeoClient.Util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;

public class Helper {

    public static Minecraft mc = Minecraft.getMinecraft();

    public static Minecraft getMC(){return mc;}

    public static EntityPlayerSP GetPlayer (){return mc.thePlayer;}
}
