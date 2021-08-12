package com.forge.NeoClient.Managers;


import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;
import net.minecraft.client.Minecraft;

import java.util.Objects;

public class DiscordHandler {

    private DiscordRichPresence discordRichPresence = new DiscordRichPresence();
    private Minecraft mc = Minecraft.getMinecraft();
    private Thread thread = null;
    public DiscordHandler() {
        Start();
    }

    public void Start() {
        DiscordRPC lib = DiscordRPC.INSTANCE;
        String steamId = "";
        DiscordEventHandlers handlers = new DiscordEventHandlers();
        handlers.ready = (user) -> System.out.println("Client rpc is now ready preparing the hyper drive!");
        lib.Discord_Initialize("874392205542961184", handlers, true, steamId);
        lib.Discord_UpdatePresence(discordRichPresence);
        discordRichPresence.largeImageKey = "neo1";
        thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                lib.Discord_RunCallbacks();
                discordRichPresence.details = setDetails();
                discordRichPresence.state = setState();


                lib.Discord_UpdatePresence(discordRichPresence);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {
                }
            }
        }, "RPC-Callback-Handler");

        thread.start();
    }

    private String setDetails() {

        return "1.8.9, Beta v1";
    }

    private String setState() {
        return "Singleplayer";
    }
}