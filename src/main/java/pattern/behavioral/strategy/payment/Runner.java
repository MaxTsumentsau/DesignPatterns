package pattern.behavioral.strategy.payment;

import pattern.behavioral.strategy.payment.concreteStrategy.CreditCardPayment;
import pattern.behavioral.strategy.payment.concreteStrategy.CryptoPayment;
import pattern.behavioral.strategy.payment.concreteStrategy.PayPalPayment;
import pattern.behavioral.strategy.payment.context.ShoppingCart;

public class Runner {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new CreditCardPayment("CN22213552"));
        cart.checkout(5000);

        cart = new ShoppingCart(new PayPalPayment("max@gmail.com"));
        cart.checkout(5000);

        cart = new ShoppingCart(new CryptoPayment("qwetttersv123487vsdg"));
        cart.checkout(5000);
    }
}
