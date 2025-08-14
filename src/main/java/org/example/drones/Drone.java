package org.example.drones;

public abstract class Drone {
    private String callsign;

    public Drone(String callsign) {
        this.callsign = callsign;
    }

    // Concrete method: All drones take off the same way.
    public void takeOff() {
        System.out.println(callsign + " is taking off.");
    }

    // Concrete method: All drones land the same way.
    public void land() {
        System.out.println(callsign + " is landing.");
    }

    // Abstract method: The flight pattern is specific to the drone model.
    // We force subclasses to define how they fly.
    public abstract void fly();

    public String getCallsign() {
        return this.callsign;
    }
}