package com.forge.BerryClient.Gui.Buttons;

import com.forge.BerryClient.Util.DrawUtil;
import com.forge.BerryClient.Util.MathUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;

import java.awt.*;

public class BerryButton extends GuiButton {
    public BerryButton(int buttonId, int x, int y, String buttonText) {
        super(buttonId, x, y, buttonText);
    }
    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY) {

            FontRenderer fr = mc.fontRendererObj;
            this.hovered = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height + 10;
            DrawUtil.drawRoundedOutlineFloat(this.xPosition, this.yPosition, this.xPosition + MathUtil.getscalledposX(120), this.yPosition + MathUtil.getscalledposY(50), 4f, 5f, Color.pink.getRGB());






    }
}
