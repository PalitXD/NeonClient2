package com.forge.NeoClient.Managers;

import com.forge.NeoClient.Mods.Settings;

import java.util.ArrayList;
import java.util.Set;

public class SettingsManager {
    ArrayList<Settings> settings = new ArrayList<>();

    public Settings register(Settings settings){
        this.settings.add(settings);
        return settings;
    }

}
