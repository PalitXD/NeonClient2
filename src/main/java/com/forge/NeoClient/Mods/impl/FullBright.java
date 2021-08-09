package com.forge.NeoClient.Mods.impl;

import com.forge.NeoClient.Mods.Module;

public class FullBright extends Module {
    public FullBright() {
        super("FullBright", "Makes light", Category.RENDER);
        toggle();
    }
    @Override
    public void onEnable(){
        mc.gameSettings.gammaSetting = 10000;
    }
}
