package com.forge.NeoClient.Mods;

import com.forge.NeoClient.Mods.Module;

import java.lang.reflect.Type;
import java.util.List;

public class Settings<T> {


    private Module Module;

    private String Name;
    private List<String>combobox;

    private T Value;

    private Type Type;
    public Settings(Module module, String name, T value, Type type){
        this.Module = module;
        this.Name = name;
        this.Value = value;
        this.Type = type;
    }
    public static enum Type{
        combobox,
        slider,
        button
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Module getModule() {
        return Module;
    }

    public void setModule(Module module) {
        this.Module = module;
    }

    public T getValue() {
        return Value;
    }

    public void setValue(T value) {
        this.Value = value;
    }
}
