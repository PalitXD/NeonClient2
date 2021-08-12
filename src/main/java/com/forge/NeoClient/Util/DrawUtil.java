package com.forge.NeoClient.Util;

import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

import static java.lang.Math.*;
import static org.lwjgl.opengl.GL11.*;

public class DrawUtil {
    public static void drawRectOutline(float x, float y, float x2, float y2, float width, int color){
        float f1c = (color >> 24 & 0xFF) / 255.0F;
        float f2c = (color >> 16 & 0xFF) / 255.0F;
        float f3c = (color >> 8 & 0xFF) / 255.0F;
        float f4c = (color & 0xFF) / 255.0F;
        GlStateManager.color(f2c, f3c, f4c, f1c);
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        GlStateManager.enableColorMaterial();
        GlStateManager.blendFunc(770, 771);
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        glBegin(3);
        glVertex2f(x, y);
        glVertex2f(x2, y);
        glEnd();
        glBegin(3);
        glVertex2f(x2, y);
        glVertex2f(x2, y2);
        glEnd();
        glBegin(3);
        glVertex2f(x2, y2 );
        glVertex2f(x, y2 );
        glEnd();
        glBegin(3);
        glVertex2f(x, y2 );
        glVertex2f(x, y );
        glEnd();
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.disableColorMaterial();
        GlStateManager.enableTexture2D();
    }
    public static void DrawCircle(int color){
        float f1c = (color >> 24 & 0xFF) / 255.0F;
        float f2c = (color >> 16 & 0xFF) / 255.0F;
        float f3c = (color >> 8 & 0xFF) / 255.0F;
        float f4c = (color & 0xFF) / 255.0F;
        GlStateManager.color(f2c, f3c, f4c, f1c);
        float num_segments = 100;
        float r = 10;
        glLineWidth(10.0f);
        glBegin(GL_LINE_LOOP);
        for (int ii = 0; ii < num_segments; ii++)   {
            float theta = 2.0f * 3.14159265f * (float)(ii) / (float)(num_segments);//get the current angle
            float x = r * (float) cos(theta);//calculate the x component
            float y = r * (float)sin(theta);//calculate the y component
            glVertex2f(x + 50, y + 50);//output vertex
        }
        glEnd();
    }

    public static void drawRoundedOutlineFloat(float x, float y, float x2, float y2, float radius, float width, int color) {
        float f1c = (color >> 24 & 0xFF) / 255.0F;
        float f2c = (color >> 16 & 0xFF) / 255.0F;
        float f3c = (color >> 8 & 0xFF) / 255.0F;
        float f4c = (color & 0xFF) / 255.0F;
        GlStateManager.color(f2c, f3c, f4c, f1c);
        int i = 18;
        int j = 90 / i;
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        GlStateManager.enableColorMaterial();
        GlStateManager.blendFunc(770, 771);
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        if (width != 1.0F)
            GL11.glLineWidth(width);
        GL11.glBegin(3);
        GL11.glVertex2f(x + radius, y);
        GL11.glVertex2f(x2 - radius, y);
        GL11.glEnd();
        GL11.glBegin(3);
        GL11.glVertex2f(x2, y + radius);
        GL11.glVertex2f(x2, y2 - radius);
        GL11.glEnd();
        GL11.glBegin(3);
        GL11.glVertex2f(x2 - radius, y2 - 0.1F);
        GL11.glVertex2f(x + radius, y2 - 0.1F);
        GL11.glEnd();
        GL11.glBegin(3);
        GL11.glVertex2f(x + 0.1F, y2 - radius);
        GL11.glVertex2f(x + 0.1F, y + radius);
        GL11.glEnd();
        float f1 = x2 - radius;
        float f2 = y + radius;
        GL11.glBegin(3);
        int k;
        for (k = 0; k <= i; k++) {
            int m = 90 - k * j;
            GL11.glVertex2f((float)(f1 + radius * MathUtil.getRightAngle(m)), (float)(f2 - radius * MathUtil.getAngle(m)));
        }
        GL11.glEnd();
        f1 = x2 - radius;
        f2 = y2 - radius;
        GL11.glBegin(3);
        for (k = 0; k <= i; k++) {
            int m = k * j + 270;
            GL11.glVertex2f((float)(f1 + radius * MathUtil.getRightAngle(m)), (float)(f2 - radius * MathUtil.getAngle(m)));
        }
        GL11.glEnd();
        GL11.glBegin(3);
        f1 = x + radius;
        f2 = y2 - radius;
        for (k = 0; k <= i; k++) {
            int m = k * j + 90;
            GL11.glVertex2f((float)(f1 + radius * MathUtil.getRightAngle(m)), (float)(f2 + radius * MathUtil.getAngle(m)));
        }
        GL11.glEnd();
        GL11.glBegin(3);
        f1 = x + radius;
        f2 = y + radius;
        for (k = 0; k <= i; k++) {
            int m = 270 - k * j;
            GL11.glVertex2f((float)(f1 + radius * MathUtil.getRightAngle(m)), (float)(f2 + radius * MathUtil.getAngle(m)));
        }
        GL11.glEnd();
        if (width != 1.0F)
            GL11.glLineWidth(1.0F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.disableColorMaterial();
        GlStateManager.enableTexture2D();
    }
}
