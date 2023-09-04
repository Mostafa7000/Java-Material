package SOLID;

// High level policy should not depend on low level implementation, both should depend on high level abstractions

interface Switchable {
    void turnOn();
}

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        // Turn on the light
    }
}

class Switch {
    private final Switchable device;

    Switch(Switchable device) {
        this.device = device;
    }

    void operate() {
        device.turnOn();
    }
}

public class DependencyInversion {
}
