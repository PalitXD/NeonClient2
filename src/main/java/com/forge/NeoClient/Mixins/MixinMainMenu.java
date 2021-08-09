package com.forge.NeoClient.Mixins;

import com.forge.NeoClient.Util.DrawUtil;
import com.forge.NeoClient.Util.Helper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.ScaledResolution;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.awt.*;

@Mixin(GuiMainMenu.class)
public class MixinMainMenu {

    @Inject(method = "drawScreen", at = @At("TAIL"), cancellable = true)
    public void drawScreen(int mouseX, int mouseY, float partialTicks, CallbackInfo ci) {

        FontRenderer fr = Minecraft.getMinecraft().fontRendererObj;
        ScaledResolution sc = new ScaledResolution(Helper.getMC());
        fr.drawStringWithShadow("Neo Client", 6, 6, 0x92312323);
        DrawUtil.drawCircle( 50, 50, Color.green.getRGB());
    }
}
