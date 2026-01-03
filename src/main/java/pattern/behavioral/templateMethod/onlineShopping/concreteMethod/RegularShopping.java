package pattern.behavioral.templateMethod.onlineShopping.concreteMethod;

import pattern.behavioral.templateMethod.onlineShopping.abstractMethod.OnlineShopping;

public class RegularShopping extends OnlineShopping {
    @Override
    protected void selectItems() {
        System.out.println("You select regular shopping");
    }

    @Override
    protected void pay() {
        System.out.println("You pay by cart");
    }

    @Override
    protected void deliver() {
        System.out.println("Deliver by courier");
    }
}
