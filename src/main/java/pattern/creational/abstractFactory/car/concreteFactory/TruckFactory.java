package pattern.creational.abstractFactory.car.concreteFactory;

import pattern.creational.abstractFactory.car.abstractFactory.CarFactory;
import pattern.creational.abstractFactory.car.abstractProduct.Body;
import pattern.creational.abstractFactory.car.abstractProduct.Engine;
import pattern.creational.abstractFactory.car.concreteProduct.TruckBody;
import pattern.creational.abstractFactory.car.concreteProduct.TruckEngine;

public class TruckFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new TruckEngine();
    }

    @Override
    public Body createBody() {
        return new TruckBody();
    }
}
