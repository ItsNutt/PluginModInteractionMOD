package me.itsnutt.pluginmodinteractionmod;

import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PlayerRightClickListener {

    private final Intermediary intermediary = PluginModInteractionMOD.INSTANCE.getIntermediary();

    @SubscribeEvent
    public void onPlayerRightClick(PlayerInteractEvent.RightClickBlock event){

        /*
        Here, we add a new instance of our object to the List in our Intermediary class with the information we want to have for our Spigot plugin
         */
        intermediary.addBlockCommunication(new RightClickBlockCommunication(event.getPos(), event.getEntityPlayer().getUniqueID()));
    }
}
