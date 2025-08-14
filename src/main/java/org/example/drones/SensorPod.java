package org.example.drones;

interface Camera {
    default void diagnostics() { System.out.println("Running camera diagnostics."); }
}
interface Radio {
    default void diagnostics() { System.out.println("Running radio diagnostics."); }
}

public class SensorPod implements Camera, Radio{
    @Override
    public void diagnostics(){
        Camera.super.diagnostics();
        Radio.super.diagnostics();
    }
}
