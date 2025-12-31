package pattern.creational.abstractFactory.car.concreteProduct;

import pattern.creational.abstractFactory.car.abstractProduct.Engine;

public class SportEngine implements Engine {
    @Override
    public void design() {
        System.out.println("This is sport engine");
    }
}
