package pattern.behavioral.strategy.payment.context;

import pattern.behavioral.strategy.payment.interfaceStrategy.PaymentStrategy;

public class ShoppingCart {
    private PaymentStrategy strategy;

    public ShoppingCart(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(double amount) {
        strategy.pay(amount);
    }
}
