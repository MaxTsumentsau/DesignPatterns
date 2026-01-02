package pattern.behavioral.strategy.payment.concreteStrategy;

import pattern.behavioral.strategy.payment.interfaceStrategy.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cartNumber) {
        this.cardNumber = cartNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Payment from credit card: %s with amount: %.2f%n", cardNumber, amount);
    }
}
