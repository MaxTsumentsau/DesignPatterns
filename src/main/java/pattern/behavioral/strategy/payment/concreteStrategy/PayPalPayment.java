package pattern.behavioral.strategy.payment.concreteStrategy;

import pattern.behavioral.strategy.payment.interfaceStrategy.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Payment from PayPal: %s with amount: %.2f%n", email, amount);
    }
}
