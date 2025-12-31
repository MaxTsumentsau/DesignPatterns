package pattern.creational.abstractFactory.car.concreteProduct;

import pattern.creational.abstractFactory.car.abstractProduct.Engine;

public class TruckEngine implements Engine {
    @Override
    public void design() {
        System.out.println("This is truck engine");
    }
}
