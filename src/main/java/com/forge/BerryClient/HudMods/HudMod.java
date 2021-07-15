package com.forge.BerryClient.HudMods;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.awt.*;

public class HudMod {

    public String Name;

    public int x;
    public int y;
    public int Width;
    public int Height;

    public int Color;
    public boolean Enabled;
    public boolean Hovered;

    protected Minecraft mc = Minecraft.getMinecraft();
    protected FontRenderer fr = mc.fontRendererObj;
    public HudMod(String name, int x, int y, int width, int height, boolean enabled){
        this.Name = name;
        this.x = x;
        this.y = y;
        this.Width = width;
        this.Height = height;
        this.Color = 1;
        this.Enabled = enabled;
    }

    public void Render(){

    }
    public String getName() {
        return Name;
    }

    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }
    public boolean getEnabled(){
        return Enabled;
    }
    public void setEnabled(boolean e){
        this.Enabled = e;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setHovered(boolean h){
        this.Hovered = h;
    }
    public boolean getHovered(){
        return Hovered;
    }
}
