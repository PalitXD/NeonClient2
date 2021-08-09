package com.forge.NeoClient.Managers;



import com.forge.NeoClient.Mods.GuiToggle;
import com.forge.NeoClient.Mods.Module;
import com.forge.NeoClient.Mods.impl.OldAnimations;
import com.forge.NeoClient.Mods.impl.SprintMod;

import java.util.ArrayList;

public class ModuleManager {
    public static ArrayList<Module> modules = new ArrayList<>();
    private static OldAnimations oldAnimations;

    public ModuleManager(){
        Add(new GuiToggle());
        Add(new SprintMod());
        Add(new OldAnimations());
        oldAnimations = new OldAnimations();

    }
    public void Add(Module mod){
        modules.add(mod);
    }
    public Module getMod(Module m){
        return m;
    }
    public Module getMod(){
        return oldAnimations;
    }

    public static OldAnimations getModOldAnimations() {
        return oldAnimations;
    }
}
