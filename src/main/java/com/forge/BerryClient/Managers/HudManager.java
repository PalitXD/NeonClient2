package com.forge.BerryClient.Managers;



import com.forge.BerryClient.HudMods.HudMod;
import com.forge.BerryClient.HudMods.Mods.Coordinates;
import com.forge.BerryClient.HudMods.Mods.FPS;
import com.forge.BerryClient.HudMods.Mods.Keystrokes.Keystrokes;

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
