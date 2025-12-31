package pattern.creational.abstractFactory.car;

import pattern.creational.abstractFactory.car.abstractFactory.CarFactory;
import pattern.creational.abstractFactory.car.concreteFactory.SportcarFactory;
import pattern.creational.abstractFactory.car.concreteFactory.TruckFactory;

public class Runner {
    public static void main(String[] args) {
        CarFactory factory;

        factory = new TruckFactory();
        var engine = factory.createEngine();
        var body = factory.createBody();
        engine.design();
        body.design();

        factory = new SportcarFactory();
        engine = factory.createEngine();
        body = factory.createBody();
        engine.design();
        body.design();
    }
}
