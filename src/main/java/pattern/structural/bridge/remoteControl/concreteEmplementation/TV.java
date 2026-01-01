package pattern.structural.bridge.remoteControl.concreteEmplementation;

import pattern.structural.bridge.remoteControl.implementation.Device;

public class TV implements Device {
    private boolean isActive;

    @Override
    public void turnOff() {
        System.out.println("TV is turn off.");
        isActive = false;
    }

    @Override
    public void turnOn() {
        System.out.println("TV is turn on.");
        isActive = true;
    }

    @Override
    public void setVolume(int volume) {
        System.out.printf("Set TV volume to: %d.%n", volume);
    }
}
