package pattern.structural.decorator.сoffeeShop;

import pattern.structural.decorator.сoffeeShop.commonInterface.Beverage;
import pattern.structural.decorator.сoffeeShop.component.Espresso;
import pattern.structural.decorator.сoffeeShop.concreteDecorator.Milk;
import pattern.structural.decorator.сoffeeShop.concreteDecorator.Sugar;

public class Runner {
    public static void main(String[] args) {
        Beverage coffee = new Espresso();
        System.out.printf("%s price: %s%n", coffee.getDescription(), coffee.getCost());

        coffee = new Sugar(coffee);
        System.out.printf("%s price: %s%n", coffee.getDescription(), coffee.getCost());

        coffee = new Milk(coffee);
        System.out.printf("%s price: %s%n", coffee.getDescription(), coffee.getCost());
    }
}
