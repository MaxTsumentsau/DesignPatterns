package pattern.structural.bridge.remoteControl.abstraction;

import pattern.structural.bridge.remoteControl.implementation.Device;

public abstract class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public abstract void togglePower();

    public abstract void volumeUp();

    public abstract void volumeDown();
}
