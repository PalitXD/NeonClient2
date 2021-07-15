package com.forge.BerryClient.HudMods.Mods;


import com.forge.BerryClient.HudMods.HudMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;

public class FPS extends HudMod {
    public FPS() {
        super("FPS", 89,89, 50, 50);
    }

    @Override
    public void Render(){
        Gui.drawRect(x,y, getWidth(), getHeight(), Color);
        fr.drawString("FPS " + String.valueOf(Minecraft.getDebugFPS()), getX(), getY(), 1);
    }
}
