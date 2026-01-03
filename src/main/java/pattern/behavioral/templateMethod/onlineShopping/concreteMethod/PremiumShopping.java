package pattern.behavioral.templateMethod.onlineShopping.concreteMethod;

import pattern.behavioral.templateMethod.onlineShopping.abstractMethod.OnlineShopping;

public class PremiumShopping extends OnlineShopping {
    @Override
    protected void selectItems() {
        System.out.println("You select premium shopping");
    }

    @Override
    protected void pay() {
        System.out.println("You pay by PayPal");
    }

    @Override
    protected void deliver() {
        System.out.println("Deliver by express courier");
    }

    @Override
    protected void applyDiscount(){
        System.out.println("You have 10% discount");
    }

    @Override
    protected void thankCostumer(){
        System.out.println("Thank you vip client");
    }
}
