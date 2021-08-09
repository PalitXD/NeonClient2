package com.forge.NeoClient.Mods.impl;

import com.forge.NeoClient.Mods.Module;
import com.forge.NeoClient.Mods.Settings;

import java.util.ArrayList;

public class OldAnimations extends Module {
    public OldAnimations() {
        super("OldAnimation", "a", Category.RENDER);
        Toggled = true;
        Settings<String> mode = create("Mode", combobox("Old", "Push", "Slide"), Settings.Type.combobox );
    }




}
