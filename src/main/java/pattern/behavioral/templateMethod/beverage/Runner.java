package pattern.behavioral.templateMethod.beverage;

import pattern.behavioral.templateMethod.beverage.abstractMethod.Beverage;
import pattern.behavioral.templateMethod.beverage.concreteMethod.Coffee;
import pattern.behavioral.templateMethod.beverage.concreteMethod.Tea;

public class Runner {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepareRecipe();

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
