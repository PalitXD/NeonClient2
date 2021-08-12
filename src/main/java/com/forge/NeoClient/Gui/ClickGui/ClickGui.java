package com.forge.NeoClient.Gui.ClickGui;

import com.forge.NeoClient.HudMods.HudMod;
import com.forge.NeoClient.Managers.HudManager;
import com.forge.NeoClient.Util.DrawUtil;
import com.forge.NeoClient.Util.MathUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;

import java.awt.*;

public class ClickGui extends GuiScreen {

    @Override
    public void drawScreen(int mx, int my, float tick){
        DrawUtil.drawRoundedOutlineFloat(MathUtil.getscalledposX(480), MathUtil.getscalledposY(270), MathUtil.getscalledposX(1440), MathUtil.getscalledposY(810), MathUtil.getscalledpos(40), 5f, 0x70000000);
        DrawUtil.drawRoundedOutlineFloat(MathUtil.getscalledposX(470), MathUtil.getscalledposY(260), MathUtil.getscalledposX(1450), MathUtil.getscalledposY(820), MathUtil.getscalledpos(40), 5f, 0x77777777);
    }
   public ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft());
    public void guiscreen(){

    }



}
