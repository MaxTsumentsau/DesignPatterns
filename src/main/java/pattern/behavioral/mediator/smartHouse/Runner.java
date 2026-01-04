package pattern.behavioral.mediator.smartHouse;

import pattern.behavioral.mediator.smartHouse.concreteComponent.AirConditioner;
import pattern.behavioral.mediator.smartHouse.concreteComponent.Button;
import pattern.behavioral.mediator.smartHouse.concreteComponent.Fan;
import pattern.behavioral.mediator.smartHouse.concreteComponent.Light;
import pattern.behavioral.mediator.smartHouse.concreteMediator.HomeController;

public class Runner {
    public static void main(String[] args) {
        HomeController homeController = new HomeController();

        Button button = new Button(homeController);
        Fan fan = new Fan(homeController);
        AirConditioner ac = new AirConditioner(homeController);
        Light light = new Light(homeController);

        homeController.setAc(ac);
        homeController.setFan(fan);
        homeController.setLight(light);

        button.press();
        button.release();
    }
}
