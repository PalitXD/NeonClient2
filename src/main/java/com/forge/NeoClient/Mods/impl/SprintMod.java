package com.forge.NeoClient.Mods.impl;

import com.forge.NeoClient.Mods.Module;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

public class SprintMod extends Module {
    public SprintMod() {
        super("Sprint", "halal", Category.QUALITY);
        setKey(Keyboard.KEY_N);
    }

    @SubscribeEvent
    public void onTick(TickEvent event){
        if (mc.thePlayer.moveForward != 0.0f || mc.thePlayer.moveStrafing != 0.0f & !mc.thePlayer.isCollidedHorizontally
                & !mc.thePlayer.isEating()
                & !mc.thePlayer.isBlocking()){
            mc.thePlayer.setSprinting(true);
        }
    }

    @Override
    public void onDisable() {
        mc.thePlayer.setSprinting(false);
    }

}
