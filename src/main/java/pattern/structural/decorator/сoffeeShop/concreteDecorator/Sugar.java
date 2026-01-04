package pattern.structural.decorator.сoffeeShop.concreteDecorator;

import pattern.structural.decorator.сoffeeShop.commonDecorator.BeverageDecorator;
import pattern.structural.decorator.сoffeeShop.commonInterface.Beverage;

public class Sugar extends BeverageDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", sugar";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 1.0;
    }
}
