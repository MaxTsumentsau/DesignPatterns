package pattern.behavioral.mediator.smartHouse.concreteComponent;

import pattern.behavioral.mediator.smartHouse.abstractComponent.Device;
import pattern.behavioral.mediator.smartHouse.mediatorInerface.SmartHomeMediator;

public class Light extends Device {
    public Light(SmartHomeMediator mediator) {
        super(mediator);
    }

    public void turnOn() {
        System.out.println("Light is turn on");
    }

    public void turnOff() {
        System.out.println("Light is turn off");
    }
}
