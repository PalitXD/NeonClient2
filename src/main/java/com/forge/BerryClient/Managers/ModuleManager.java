package com.forge.BerryClient.Managers;



import com.forge.BerryClient.Mods.GuiToggle;
import com.forge.BerryClient.Mods.Module;

import java.util.ArrayList;

public class ModuleManager {
    public static ArrayList<Module> modules = new ArrayList<>();

    public ModuleManager(){
    Add(new GuiToggle());
    }
    public void Add(GuiToggle m) { modules.add(m);
    }
}
