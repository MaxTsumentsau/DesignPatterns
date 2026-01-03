package pattern.behavioral.templateMethod.onlineShopping;

import pattern.behavioral.templateMethod.onlineShopping.abstractMethod.OnlineShopping;
import pattern.behavioral.templateMethod.onlineShopping.concreteMethod.PremiumShopping;
import pattern.behavioral.templateMethod.onlineShopping.concreteMethod.RegularShopping;

public class Runner {
    public static void main(String[] args) {
        OnlineShopping regular = new RegularShopping();
        regular.purchase();

        OnlineShopping vip = new PremiumShopping();
        vip.purchase();
    }
}
