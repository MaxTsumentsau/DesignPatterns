package pattern.behavioral.mediator.smartHouse.concreteComponent;

import pattern.behavioral.mediator.smartHouse.abstractComponent.Device;
import pattern.behavioral.mediator.smartHouse.mediatorInerface.SmartHomeMediator;

public class Button extends Device {
    public Button(SmartHomeMediator mediator) {
        super(mediator);
    }

    public void press(){
        mediator.notify(this, "press");
    }

    public void release(){
        mediator.notify(this,"release");
    }
}
