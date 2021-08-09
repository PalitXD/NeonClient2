package com.forge.NeoClient.Mods;



import com.forge.NeoClient.HudMods.HudEditor;
import org.lwjgl.input.Keyboard;

public class GuiToggle extends Module {
    public GuiToggle() {
        super("GuiToggle", "e ", Category.HUD);
        setKey(Keyboard.KEY_RSHIFT);
    }

    @Override
    public void onEnable(){
        mc.displayGuiScreen(new HudEditor());
        System.out.println("enabled");
    }
}
