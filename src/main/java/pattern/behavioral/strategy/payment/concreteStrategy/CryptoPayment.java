package pattern.behavioral.strategy.payment.concreteStrategy;

import pattern.behavioral.strategy.payment.interfaceStrategy.PaymentStrategy;

public class CryptoPayment implements PaymentStrategy {
    private String cryptoWallet;

    public CryptoPayment(String cryptoWallet) {
        this.cryptoWallet = cryptoWallet;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Payment from credit card: %s with amount: %.2f%n", cryptoWallet, amount);
    }
}
