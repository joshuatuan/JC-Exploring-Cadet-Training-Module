package org.example.app;

import org.example.capabilities.VisualRecon;
import org.example.drones.Drone;
import org.example.drones.FixedWingDrone;
import org.example.drones.QuadCopter;

public class MissionControl {
    public static void main(String[] args) {
        System.out.println("--- Deploying QuadCopter Unit ---");
        QuadCopter bravo_1 = new QuadCopter("Bravo-1");

        // Methods from the abstract Drone class
        bravo_1.takeOff();
        bravo_1.fly();

        System.out.println("\n--- Engaging Recon Capabilities ---");

        // Method from the VisualRecon interface (implemented in QuadCopter)
        bravo_1.takePicture();

        // Default method from the VisualRecon interface
        bravo_1.record4kVideo();

        // Static method from the VisualRecon interface
        System.out.println("Standard Lens Type: " + VisualRecon.getStandardLensType());

        // Method from the abstract Drone class
        bravo_1.land();

        System.out.println("\n\n--- Deploying Advanced Fixed-Wing Unit ---\n");
        FixedWingDrone phoenix_7 = new FixedWingDrone("Phoenix-7");

        phoenix_7.takeOff();
        phoenix_7.fly();
        phoenix_7.takePicture();
        phoenix_7.interceptSignal();
        phoenix_7.record4kVideo(); // Calls the overridden version
        phoenix_7.land();

//      Cannot instantiate the type Drone Fix:
        Drone bravo2 = new QuadCopter("Bravo-2");
        VisualRecon bravo2Recon = new QuadCopter("Bravo-1");

        System.out.println("\n--- Engaging Bravo 2 Capabilities ---\n");
        bravo2Recon.takePicture();
        bravo2Recon.record4kVideo();
        bravo2.land();
    }
}