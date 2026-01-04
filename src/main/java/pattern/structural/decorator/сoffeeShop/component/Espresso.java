package pattern.structural.decorator.сoffeeShop.component;

import pattern.structural.decorator.сoffeeShop.commonInterface.Beverage;

public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public Double getCost() {
        return 5.0;
    }
}
