package pattern.creational.abstractFactory.car.concreteProduct;

import pattern.creational.abstractFactory.car.abstractProduct.Body;

public class SportcarBody implements Body {
    @Override
    public void design() {
        System.out.println("This is sport car body");
    }
}
