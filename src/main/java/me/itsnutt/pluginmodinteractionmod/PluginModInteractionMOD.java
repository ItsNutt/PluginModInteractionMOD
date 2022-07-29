package me.itsnutt.pluginmodinteractionmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import noppes.npcs.api.NpcAPI;

@Mod(
        modid = PluginModInteractionMOD.MOD_ID,
        name = PluginModInteractionMOD.MOD_NAME,
        version = PluginModInteractionMOD.VERSION
)
public class PluginModInteractionMOD {

    public static final String MOD_ID = "pluginmodinteractionmod";
    public static final String MOD_NAME = "PluginModInteractionMOD";
    public static final String VERSION = "1.0";

    private final Intermediary intermediary = new Intermediary();
    public Intermediary getIntermediary(){
        return intermediary;
    }

    @Mod.Instance(MOD_ID)
    public static PluginModInteractionMOD INSTANCE;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {}

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new PlayerRightClickListener());
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        NpcAPI.Instance().events().register(new DialogOptionListener());
    }

}
