package pattern.behavioral.mediator.smartHouse.mediatorInerface;

import pattern.behavioral.mediator.smartHouse.abstractComponent.Device;

public interface SmartHomeMediator {
    void notify(Device sender, String event);
}
