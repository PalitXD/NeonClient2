package com.forge.BerryClient.Mixins;

import com.forge.BerryClient.Util.Helper;
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
        fr.drawStringWithShadow("Berry Client :)", 6, 6, 0x92312323);

    }
}
