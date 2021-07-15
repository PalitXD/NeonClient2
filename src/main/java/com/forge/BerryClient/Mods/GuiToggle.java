package com.forge.BerryClient.Mods;



import com.forge.BerryClient.HudMods.HudEditor;
import net.minecraft.client.Minecraft;
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
