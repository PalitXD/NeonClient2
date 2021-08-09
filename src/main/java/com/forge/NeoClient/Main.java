package com.forge.NeoClient;


import com.forge.NeoClient.HudMods.HudRender;
import com.forge.NeoClient.Managers.HudManager;
import com.forge.NeoClient.Managers.ModuleManager;
import com.forge.NeoClient.Managers.SettingsManager;
import com.forge.NeoClient.Mixins.SessionUtil;
import com.forge.NeoClient.Mods.Module;
import com.forge.NeoClient.Util.Helper;
import com.forge.NeoClient.Util.SessionChanger;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

import java.util.Set;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "BerryClientBeta";
    public static final String VERSION = "1.0";

    private HudRender hudRender;
    private HudManager hudManager;
    private ModuleManager moduleManager;
    private static SettingsManager settingsManager = new SettingsManager();
    public static SettingsManager getSettingsManager(){return settingsManager;}
    private static CapeInstances capeInstances = new CapeInstances();
    public static CapeInstances getCapeInstances() { return capeInstances; }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
        hudRender = new HudRender();
        hudManager = new HudManager();
        moduleManager = new ModuleManager();
        capeInstances = new CapeInstances();
        settingsManager = new SettingsManager();
        MinecraftForge.EVENT_BUS.register(moduleManager);
        MinecraftForge.EVENT_BUS.register(hudManager);
        MinecraftForge.EVENT_BUS.register(hudRender);
        SessionChanger.getInstance().setUser("halop56yt@gmail.com", "bhfwb*^GYD7HNj");
    }
    @SubscribeEvent
    public void key(InputEvent e) {
        if(Helper.getMC().theWorld == null || Helper.getMC().thePlayer == null)
            return;
        try {
            if(Keyboard.isCreated()) {
                if(Keyboard.getEventKeyState()) {
                    int keyCode = Keyboard.getEventKey();
                    if(keyCode <= 0)
                        return;
                    for(Module m : moduleManager.modules) {
                        if(m.getKey() == keyCode && keyCode > 0) {
                            m.toggle();
                        }
                    }
                }
            }
        } catch (Exception q) { q.printStackTrace(); }
    }
}
