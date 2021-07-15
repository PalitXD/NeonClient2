package com.forge.BerryClient.HudMods;


import com.forge.BerryClient.Managers.HudManager;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

public class HudEditor extends GuiScreen {



    @Override
    public void drawScreen(int mx, int my, float tick){
        for (HudMod m : HudManager.Hud) {
            if(mx >= m.getX() && mx <= m.Width && my >= m.getY() && my <= m.Height ){
                m.setHovered(true);

            }else{
                m.setHovered(false);
            }
        }
    }
    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        for(HudMod m : HudManager.Hud){
            if(mouseX >= m.getX() && mouseX <= m.Width && mouseY >= m.getY() && mouseY <= m.Height ){
                System.out.println("e");
                if(mouseButton ==0) {
                    m.setX(mouseX);
                    m.setY(mouseY);
                }
            }
        }
        if(mouseButton == 1){

        }
    }

}
