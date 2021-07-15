package com.forge.BerryClient.HudMods;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import sun.font.TrueTypeFont;

import java.awt.*;

public class HudMod {

    public String Name;

    public int x;
    public int y;
    public int Width;
    public int Height;

    public int Color;
    public boolean Toggled;
    public boolean Hovered;
    public boolean Dragged;

    protected Minecraft mc = Minecraft.getMinecraft();
    protected FontRenderer fr = mc.fontRendererObj;
    public HudMod(String name, int x, int y, int width, int height){
        this.Name = name;
        this.x = x;
        this.y = y;
        this.Width = width;
        this.Height = height;
        this.Color = 0x30000000;
        this.Toggled = true;
        this.Dragged = false;
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
    public int getWidth(){
        return Width + getX();
    }
    public int getColor(){
        return Color;
    }
    public void setColor(int c){this.Color = c;}
    public int getHeight(){
        return Height + getY();
    }
    public void setDragged(boolean d){
        this.Dragged = d;
    }
    public boolean getToggled(){
        return Toggled;
    }
    public void setToggled(boolean e){
        this.Toggled = e;
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
    public void toggle() {
        this.Toggled = !this.Toggled;
    }

}
