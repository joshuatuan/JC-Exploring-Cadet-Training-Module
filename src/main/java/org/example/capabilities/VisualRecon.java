package org.example.capabilities;

public interface VisualRecon {
    // 1. Variable: All variables in an interface are public, static, and final by default.
    String SENSOR_TYPE = "High-Resolution Optical Camera";

    // 2. Abstract Method: The core capability this interface guarantees.
    //    Any class implementing this must provide a body for this method.
    void takePicture();

    // 3. Default Method: Provides a default implementation.
    //    A class can use this directly or choose to override it.
    default void record4kVideo() {
        System.out.println("Recording 4K video using default settings.");
    }

    // 4. Static Method: A utility function related to the interface.
    //    It is called on the interface itself (VisualRecon.getStandardLensType()).
    static String getStandardLensType() {
        return "50mm Standard Lens";
    }
}