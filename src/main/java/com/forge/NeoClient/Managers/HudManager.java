package com.forge.NeoClient.Managers;



import com.forge.NeoClient.HudMods.HudMod;
import com.forge.NeoClient.HudMods.Mods.Coordinates;
import com.forge.NeoClient.HudMods.Mods.FPS;
import com.forge.NeoClient.HudMods.Mods.Keystrokes.Keystrokes;

import java.util.ArrayList;

public class HudManager {
    public static ArrayList<HudMod> Hud = new ArrayList<>();

    public HudManager(){
        Add(new Coordinates());
        Add(new FPS());
        Add(new Keystrokes());
    }
    public void Add(HudMod m) { Hud.add(m);
    }
}
