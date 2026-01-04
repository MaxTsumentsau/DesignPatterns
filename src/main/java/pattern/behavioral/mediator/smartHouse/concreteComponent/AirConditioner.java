package pattern.behavioral.mediator.smartHouse.concreteComponent;

import pattern.behavioral.mediator.smartHouse.abstractComponent.Device;
import pattern.behavioral.mediator.smartHouse.mediatorInerface.SmartHomeMediator;

public class AirConditioner extends Device {
    public AirConditioner(SmartHomeMediator mediator) {
        super(mediator);
    }

    public void turnOn() {
        System.out.println("Air conditioner is turn on");
    }

    public void turnOff() {
        System.out.println("Air conditioner is turn off");
    }
}
