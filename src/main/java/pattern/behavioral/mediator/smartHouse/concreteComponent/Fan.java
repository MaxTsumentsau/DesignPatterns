package pattern.behavioral.mediator.smartHouse.concreteComponent;

import pattern.behavioral.mediator.smartHouse.abstractComponent.Device;
import pattern.behavioral.mediator.smartHouse.mediatorInerface.SmartHomeMediator;

public class Fan extends Device {
    public Fan(SmartHomeMediator mediator) {
        super(mediator);
    }

    public void turnOn() {
        System.out.println("Fan is turn on");
    }

    public void turnOff() {
        System.out.println("Fan is turn off");
    }
}
