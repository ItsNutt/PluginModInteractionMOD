package me.itsnutt.pluginmodinteractionmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import noppes.npcs.api.event.DialogEvent;

public class DialogOptionListener{

    private final Intermediary intermediary = PluginModInteractionMOD.INSTANCE.getIntermediary();

    @SubscribeEvent
    public void onDialogOption(DialogEvent.OptionEvent event){

        EntityPlayer player = event.player.getMCEntity();

        if (event.option.getName().equalsIgnoreCase("Show Me Your Inventory")){
            if (!player.world.isRemote){
                event.player.closeGui();
                player.closeScreen();
            }
            intermediary.addNpcCommunication(new NPCInventoryCommunication(event.npc.getName(), player.getUniqueID()));
        }
    }
}
