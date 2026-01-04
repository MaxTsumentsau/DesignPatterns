package pattern.behavioral.mediator.smartHouse.abstractComponent;

import pattern.behavioral.mediator.smartHouse.mediatorInerface.SmartHomeMediator;

public abstract class Device {
    protected SmartHomeMediator mediator;

    public Device(SmartHomeMediator mediator) {
        this.mediator = mediator;
    }
}
