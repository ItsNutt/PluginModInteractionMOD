package me.itsnutt.pluginmodinteractionmod;

import net.minecraft.util.math.BlockPos;

import java.util.UUID;

public class RightClickBlockCommunication {

    private final MyBlockPos blockPos;

    private final UUID playerUUID;

    public RightClickBlockCommunication (BlockPos blockPos, UUID playerUUID){
        this.blockPos = new MyBlockPos((double) blockPos.getX(),(double) blockPos.getY(),(double) blockPos.getZ());
        this.playerUUID = playerUUID;
    }

    public MyBlockPos getBlockPos() {
        return blockPos;
    }

    public UUID getPlayerUUID() {
        return playerUUID;
    }
}
