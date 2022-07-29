package me.itsnutt.pluginmodinteractionmod;

import java.util.ArrayList;
import java.util.List;

public class Intermediary {

    private final List<NPCInventoryCommunication> npcInventoryCommunications = new ArrayList<>();

    public List<NPCInventoryCommunication> getNpcInventoryCommunications() {
        return npcInventoryCommunications;
    }

    public void clearNpcInventoryCommunications(){
        npcInventoryCommunications.clear();
    }

    protected void addNpcCommunication(NPCInventoryCommunication communication){
        npcInventoryCommunications.add(communication);
    }

    private final List<RightClickBlockCommunication> blockCommunications = new ArrayList<>();

    public List<RightClickBlockCommunication> getBlockCommunications(){
        return blockCommunications;
    }

    public void clearBlockCommunications(){
        blockCommunications.clear();
    }

    protected void addBlockCommunication(RightClickBlockCommunication communication){
        blockCommunications.add(communication);
    }
}
