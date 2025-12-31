package pattern.creational.abstractFactory.car.abstractFactory;

import pattern.creational.abstractFactory.car.abstractProduct.Body;
import pattern.creational.abstractFactory.car.abstractProduct.Engine;

public interface CarFactory {
    Engine createEngine();
    Body createBody();
}
