package com.forge.NeoClient.HudMods;


import com.forge.NeoClient.Gui.Buttons.NeoButton;
import com.forge.NeoClient.Gui.ClickGui.ClickGui;
import com.forge.NeoClient.Managers.HudManager;
import com.forge.NeoClient.Util.MathUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;

import java.io.IOException;

public class HudEditor extends GuiScreen {

public int plusX;
public int plusY;

    @Override
    public void drawScreen(int mx, int my, float tick){
        for (HudMod m : HudManager.Hud) {
            Gui.drawRect(m.getX(), m.getY(), m.getWidth(), m.getHeight(), 0x26666666);
            if(m.Dragged || mx >= m.getX() && mx <= m.getWidth() && my >= m.getY() && my <= m.getHeight()){
                Gui.drawRect(m.getX(), m.getY(), m.getWidth(), m.getHeight(), 0x29999999);
            }
            if(m.Dragged == true){
                m.setX(mx - plusX);
                m.setY(my - plusY);
            }
        }
        super.drawScreen(mx, my, tick);
    }

    @Override
    public boolean doesGuiPauseGame(){
        return false;
    }
    @Override
    public void initGui() {
        ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft());
        this.buttonList.add(new NeoButton(0, (int)MathUtil.getscalledposX(900), (int)MathUtil.getscalledposY(540), "cbt"));
        super.initGui();
    }
    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0){
            this.mc.displayGuiScreen(new ClickGui());
        }
    }

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        for(HudMod m : HudManager.Hud){

            if(mouseX >= m.getX() && mouseX <= m.getWidth() && mouseY >= m.getY() && mouseY <= m.getHeight()){

                if(mouseButton ==0) {
                    plusX = (mouseX - m.getX());
                    plusY = (mouseY - m.getY());
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
