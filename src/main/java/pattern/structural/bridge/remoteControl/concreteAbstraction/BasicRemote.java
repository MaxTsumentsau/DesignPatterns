package pattern.structural.bridge.remoteControl.concreteAbstraction;

import pattern.structural.bridge.remoteControl.abstraction.Remote;
import pattern.structural.bridge.remoteControl.implementation.Device;

public class BasicRemote extends Remote {
    private boolean isOn = false;
    private int volume = 10;

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        if (isOn) {
            isOn = false;
            device.turnOff();
        } else {
            isOn = true;
            device.turnOn();
        }
    }

    @Override
    public void volumeUp() {
        volume++;
        device.setVolume(volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        device.setVolume(volume);
    }
}
