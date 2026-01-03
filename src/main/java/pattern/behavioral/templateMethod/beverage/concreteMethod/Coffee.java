package pattern.behavioral.templateMethod.beverage.concreteMethod;

import pattern.behavioral.templateMethod.beverage.abstractMethod.Beverage;

public class Coffee extends Beverage {
    @Override
    protected void addCondiments() {
        System.out.println("We are adding milk");
    }

    @Override
    protected void brew() {
        System.out.println("We are brewing coffee");
    }
}
