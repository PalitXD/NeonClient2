package com.forge.NeoClient.HudMods.Mods.Keystrokes;

import com.forge.NeoClient.HudMods.HudMod;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.settings.KeyBinding;

import java.util.ArrayList;

public class Keystrokes extends HudMod {

    ArrayList<Key> keys = new ArrayList<>();


    public Keystrokes() {
        super("Keystrokes", 95, 125, 70, 45);
        keys.add(new Key("W",  25, 0, mc.gameSettings.keyBindForward));
        keys.add(new Key("A", 0,  25, mc.gameSettings.keyBindLeft));
        keys.add(new Key("S", 25, 25, mc.gameSettings.keyBindBack));
        keys.add(new Key("D", 50, 25, mc.gameSettings.keyBindRight));
    }

    public static class Key{


        String Name;
        int X;
        int Y;
        KeyBinding KeyBind;

        public Key(String name, int x, int y, KeyBinding keyBind){
            this.Name = name;
            this.X = x;
            this.Y = y;
            this.KeyBind = keyBind;
        }

        public String getName(){
            return Name;
        }

        public int getX() {
            return X ;
        }

        public int getY() {
            return Y;
        }

        public boolean iskeydown(){
           return this.KeyBind.isKeyDown();
        }

    }
    @Override
    public void Render(){
        for(Key k : keys){
            Gui.drawRect( getX() + k.getX(), getY() + k.getY(), getX() + k.getX() + 20, getY() + k.getY() + 20, k.iskeydown() ? 0x30000000 : 0);
            fr.drawString(k.getName(),  getX()+ k.getX() + 7, getY() + k.getY() + 7, k.iskeydown() ? java.awt.Color.red.getRGB() : java.awt.Color.red.getRGB());
        }
    }
}
