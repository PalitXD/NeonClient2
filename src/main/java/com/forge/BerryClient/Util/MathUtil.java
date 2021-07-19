package com.forge.BerryClient.Util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.MathHelper;

public class MathUtil {
    private static final double[] a = new double[65536];

    private static final double[] b = new double[360];

    static {
        int i;
        for (i = 0; i < 65536; i++)
            a[i] = Math.sin(i * Math.PI * 2.0D / 65536.0D);
        for (i = 0; i < 360; i++)
            b[i] = Math.sin(Math.toRadians(i));
    }

    public static double getAngle(int paramInt) {
        paramInt %= 360;
        return b[paramInt];
    }

    public static double getRightAngle(int paramInt) {
        paramInt += 90;
        paramInt %= 360;
        return b[paramInt];
    }

    private static float snapToStep(float value, float valueStep) {
        if (valueStep > 0.0F)
            value = valueStep * Math.round(value / valueStep);
        return value;
    }

    public static float normalizeValue(float p_148266_1_, float valueMin, float valueMax, float valueStep) {
        return MathHelper.clamp_float((snapToStepClamp(p_148266_1_, valueMin, valueMax, valueStep) - valueMin) / (valueMax - valueMin), 0.0F, 1.0F);
    }

    private static float snapToStepClamp(float value, float valueMin, float valueMax, float valueStep) {
        value = snapToStep(value, valueStep);
        return MathHelper.clamp_float(value, valueMin, valueMax);
    }

    public static float denormalizeValue(float value, float valueMin, float valueMax, float valueStep) {
        return snapToStepClamp(valueMin + (valueMax - valueMin) * MathHelper.clamp_float(value, 0.0F, 1.0F), valueMin, valueMax, valueStep);
    }

    public static int GetCenteredPositionX(){
        ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft());
        int x;
        x = sr.getScaledWidth()/2;
        return(x);
    }
    public static int GetCenteredPositionY(){
        ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft());
        int y;
        y = sr.getScaledHeight()/2;
        return (y);
    }
    public static float getscalledposX(int pos){
        ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft());
        float pos1 = (float) sr.getScaledWidth_double()/1920;
        float pos2 = pos1 * pos;
        return pos2;
    }
    public static float getscalledposY(int pos){
        ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft());
        float pos1 = (float) sr.getScaledHeight_double()/1080;
        float pos2 = pos1 * pos;
        return pos2;
    }
}

