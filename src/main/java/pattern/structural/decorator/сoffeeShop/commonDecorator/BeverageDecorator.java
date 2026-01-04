package pattern.structural.decorator.сoffeeShop.commonDecorator;

import pattern.structural.decorator.сoffeeShop.commonInterface.Beverage;

public abstract class BeverageDecorator implements Beverage {
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public Double getCost() {
        return beverage.getCost();
    }
}
