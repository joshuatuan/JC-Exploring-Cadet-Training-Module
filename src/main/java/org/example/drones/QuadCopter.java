package org.example.drones;

import org.example.capabilities.VisualRecon;

public class QuadCopter extends Drone implements VisualRecon {
    public QuadCopter(String callsign) {
        super(callsign); // Call the parent constructor
    }

    // Implementing the abstract method from the Drone class
    @Override
    public void fly() {
        System.out.println(getCallsign() + " is hovering with four rotors.");
    }

    // Implementing the abstract method from the VisualRecon interface
    @Override
    public void takePicture() {
        System.out.println(getCallsign() + " takes a picture with its " + SENSOR_TYPE);
    }
}