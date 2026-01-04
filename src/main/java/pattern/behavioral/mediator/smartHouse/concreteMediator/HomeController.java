package pattern.behavioral.mediator.smartHouse.concreteMediator;

import pattern.behavioral.mediator.smartHouse.abstractComponent.Device;
import pattern.behavioral.mediator.smartHouse.concreteComponent.AirConditioner;
import pattern.behavioral.mediator.smartHouse.concreteComponent.Button;
import pattern.behavioral.mediator.smartHouse.concreteComponent.Fan;
import pattern.behavioral.mediator.smartHouse.concreteComponent.Light;
import pattern.behavioral.mediator.smartHouse.mediatorInerface.SmartHomeMediator;

public class HomeController implements SmartHomeMediator {
    private Light light;
    private AirConditioner ac;
    private Fan fan;

    public void setLight(Light light) {
        this.light = light;
    }

    public void setAc(AirConditioner ac) {
        this.ac = ac;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void notify(Device sender, String event) {
        if (sender instanceof Button && "press".equals(event)) {
            System.out.println("Button is pressed, turn on the devices");
            light.turnOn();
            ac.turnOn();
            fan.turnOn();
        }
        if (sender instanceof Button && "release".equals(event)) {
            System.out.println("Button is pressed, turn on the devices");
            light.turnOff();
            ac.turnOff();
            fan.turnOff();
        }
    }
}
