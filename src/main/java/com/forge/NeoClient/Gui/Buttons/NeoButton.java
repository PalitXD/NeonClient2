package com.forge.NeoClient.Gui.Buttons;

import com.forge.NeoClient.Util.DrawUtil;
import com.forge.NeoClient.Util.MathUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;

import java.awt.*;

public class NeoButton extends GuiButton {
    public NeoButton(int buttonId, int x, int y, String buttonText) {
        super(buttonId, x, y, buttonText);
    }
    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY) {

            FontRenderer fr = mc.fontRendererObj;
            this.hovered = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height + 10;
            DrawUtil.drawRoundedOutlineFloat(this.xPosition, this.yPosition, this.xPosition + MathUtil.getscalledposX(120), this.yPosition + MathUtil.getscalledposY(50), 4f, 5f, Color.pink.getRGB());

    }
}
