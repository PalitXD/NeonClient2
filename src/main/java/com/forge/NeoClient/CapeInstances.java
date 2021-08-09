package com.forge.NeoClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CapeInstances {
    List<UUID> uuids = new ArrayList<>();
    List<UUID> devUUID = new ArrayList<>();

    public CapeInstances() {
       NeoCapes();

    }

    public void NeoCapes() {
        try {
            URL capesList = new URL("https://pastebin.com/raw/cjBMmBQQ");
            BufferedReader in = new BufferedReader(new InputStreamReader(capesList.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                uuids.add(UUID.fromString(inputLine));
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public boolean hasCape(UUID id) {
        return uuids.contains(id);
    }

    public boolean hasDevCape(UUID id) {
        return devUUID.contains(id);
    }

}




