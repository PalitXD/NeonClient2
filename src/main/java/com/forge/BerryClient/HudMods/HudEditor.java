package com.forge.BerryClient.HudMods;


import com.forge.BerryClient.Managers.HudManager;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

public class HudEditor extends GuiScreen {



    @Override
    public void drawScreen(int mx, int my, float tick){
        for (HudMod m : HudManager.Hud) {
            if(m.Dragged == true){
                m.setX(mx);
                m.setY(my);
            }

        }
    }
    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        for(HudMod m : HudManager.Hud){

            if(mouseX >= m.getX() && mouseX <= m.getWidth() && mouseY >= m.getY() && mouseY <= m.getHeight()){

                if(mouseButton ==0) {
                    m.setDragged(true);
                }
            }
            if(mouseButton == 1){

            }
        }

    }
    @Override
    protected void mouseReleased(int mouseX, int mouseY, int state) {
        for(HudMod m : HudManager.Hud){
            m.setDragged(false);
        }
    }

}
