package pattern.structural.bridge.remoteControl.concreteEmplementation;

import pattern.structural.bridge.remoteControl.implementation.Device;

public class Radio implements Device {
    private boolean isActive;

    @Override
    public void turnOff() {
        System.out.println("Radio is turn off.");
        isActive = false;
    }

    @Override
    public void turnOn() {
        System.out.println("Radio is turn on.");
        isActive = true;
    }

    @Override
    public void setVolume(int volume) {
        System.out.printf("Set radio volume to: %d.%n", volume);
    }
}
