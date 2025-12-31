package pattern.creational.abstractFactory.car.concreteFactory;

import pattern.creational.abstractFactory.car.abstractFactory.CarFactory;
import pattern.creational.abstractFactory.car.abstractProduct.Body;
import pattern.creational.abstractFactory.car.abstractProduct.Engine;
import pattern.creational.abstractFactory.car.concreteProduct.SportEngine;
import pattern.creational.abstractFactory.car.concreteProduct.SportcarBody;

public class SportcarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new SportEngine();
    }

    @Override
    public Body createBody() {
        return new SportcarBody();
    }
}
