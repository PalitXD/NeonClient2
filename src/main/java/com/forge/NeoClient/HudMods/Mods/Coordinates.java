package com.forge.NeoClient.HudMods.Mods;


import com.forge.NeoClient.HudMods.HudMod;
import net.minecraft.client.gui.Gui;

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
