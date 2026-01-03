package pattern.behavioral.templateMethod.beverage.concreteMethod;

import pattern.behavioral.templateMethod.beverage.abstractMethod.Beverage;

public class Tea extends Beverage {
    @Override
    protected void addCondiments() {
        System.out.println("We are adding lemon and sugar");
    }

    @Override
    protected void brew() {
        System.out.println("We are brewing tea");
    }
}
