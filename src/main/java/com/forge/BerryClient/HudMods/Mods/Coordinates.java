package com.forge.BerryClient.HudMods.Mods;


import com.forge.BerryClient.HudMods.HudMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import sun.awt.resources.awt;

import java.awt.*;

public class Coordinates extends HudMod {
    public Coordinates() {
        super("Coordinates", 10, 10,  40, 50);
    }


    @Override
    public void Render(){
        Gui.drawRect(x,y, getWidth(), getHeight(), Color);
        fr.drawString("X: " + (int) mc.thePlayer.posX, x + 2, y+5, java.awt.Color.red.getRGB());
        fr.drawString("Y: " + (int) mc.thePlayer.posY, x + 2, y + 15, java.awt.Color.red.getRGB());
        fr.drawString("Z: " + (int) mc.thePlayer.posZ, x + 2, y + 25, java.awt.Color.red.getRGB());


    }
}
