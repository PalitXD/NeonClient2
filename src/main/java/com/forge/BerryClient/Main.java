package com.forge.BerryClient;


import com.forge.BerryClient.HudMods.HudRender;
import com.forge.BerryClient.Managers.HudManager;
import com.forge.BerryClient.Managers.ModuleManager;
import com.forge.BerryClient.Mods.Module;
import com.forge.BerryClient.Util.Helper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    private HudRender hudRender;
    private HudManager hudManager;
    private ModuleManager moduleManager;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
        hudRender = new HudRender();
        hudManager = new HudManager();
        moduleManager = new ModuleManager();
        MinecraftForge.EVENT_BUS.register(moduleManager);
        MinecraftForge.EVENT_BUS.register(hudManager);
        MinecraftForge.EVENT_BUS.register(hudRender);
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
