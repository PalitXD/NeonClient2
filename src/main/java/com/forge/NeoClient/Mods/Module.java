package com.forge.NeoClient.Mods;

import com.forge.NeoClient.Main;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Module {


    public String Name;
    public String Description;
    public Category category;
    public boolean Toggled;
    public int Key;
    public static Minecraft mc = Minecraft.getMinecraft();
    public Module(String name, String description, Category category){
        this.Name = name;
        this.Description = description;
        this.category = category;
        this.Toggled = false;
        this.Key = -1;

    }

    public String getName() {
        return this.Name;
    }

    public String getDescription(){
        return this.Description;
    }

    public Module.Category getCategory() {
        return category;
    }

    public boolean isEnabled() {
        return Toggled;
    }

    public void setEnabled(boolean e){
        this.Toggled = e;
    }

    public void toggle() {
        this.Toggled = !this.Toggled;

        if(this.Toggled) {
            this.onEnable();
        } else {
            this.onDisable();
        }

    }

    public void onEnable() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void onDisable() {
        MinecraftForge.EVENT_BUS.unregister(this);
    }

    public int getKey(){
        return Key;
    }

    public void setKey(int k) {
        Key = k;
    }
    public Settings create(String name, Object value, Settings.Type type){
        return Main.getSettingsManager().register(new Settings(this, name, value, type));
    }
    protected List<String> combobox(String... item) {
        return new ArrayList<>(Arrays.asList(item));
    }
    public enum Category {
        RENDER("Render"),
        HUD("HUD"),
        QUALITY("Quality");


        String name;

        Category(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }


    }


}
