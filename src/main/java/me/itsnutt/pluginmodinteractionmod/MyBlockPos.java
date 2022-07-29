package me.itsnutt.pluginmodinteractionmod;

public class MyBlockPos {

    private final double x;
    private final double y;
    private final double z;

    public MyBlockPos (Double x, Double y, Double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
