package pattern.structural.decorator.сoffeeShop.concreteDecorator;

import pattern.structural.decorator.сoffeeShop.commonDecorator.BeverageDecorator;
import pattern.structural.decorator.сoffeeShop.commonInterface.Beverage;

public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", milk";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 2.0;
    }
}
