package me.itsnutt.pluginmodinteractionmod;

import java.util.UUID;

public class NPCInventoryCommunication {

    private final String npcName;

    private final UUID playerUUID;

    public NPCInventoryCommunication(String npcName, UUID uuid){
        this.npcName = npcName;
        this.playerUUID = uuid;
    }

    public String getNpcName(){
        return npcName;
    }

    public UUID getPlayerUUID() {
        return playerUUID;
    }
}
