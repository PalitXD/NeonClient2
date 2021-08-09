package com.forge.NeoClient.Util;

import java.awt.Color;

public class ColorUtil {
	
	public static int getRainbow(Float seconds, float saturation, float brightness) {
		float hue = (System.currentTimeMillis() % (int)(seconds * 1000)) / (float)(seconds * 1000);
		int color = Color.HSBtoRGB(hue, saturation, brightness);
		return color;
		
	}

	public static int getRainbow(Float seconds, float saturation, float brightness, long index) {
		float hue = (System.currentTimeMillis() + (index)% (int)(seconds * 1000)) / (float)(seconds * 1000);
		int color = Color.HSBtoRGB(hue, saturation, brightness);
		return color;
		
	}

	public static int Rainbow(int delay) { // example Rainbow(counter[0] * 300)
		double RainbowState = Math.ceil((System.currentTimeMillis() + delay) / 20.0);
		RainbowState %= 360;
		return Color.getHSBColor((float) (RainbowState / 360.0f), 0.5f, 1.0f).getRGB();
	}

}
