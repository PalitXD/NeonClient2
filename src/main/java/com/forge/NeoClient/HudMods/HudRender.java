package com.forge.NeoClient.HudMods;


import com.forge.NeoClient.Managers.HudManager;
import net.minecraft.client.gui.Gui;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class HudRender extends Gui {
    @SubscribeEvent
    public void Render(RenderGameOverlayEvent event){
        if(event.type == RenderGameOverlayEvent.ElementType.TEXT) {
            for (HudMod m : HudManager.Hud) {
                if(m.Toggled == true) {
                    m.Render();
                }
            }
        }
    }

}
