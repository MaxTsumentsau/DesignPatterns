package pattern.structural.adapter.paymentSystem.adapter;

import pattern.structural.adapter.paymentSystem.incompatibleClass.LegacyPaymentSystem;
import pattern.structural.adapter.paymentSystem.newInterface.PaymentProcessor;

public class PaymentAdapter implements PaymentProcessor {
    private LegacyPaymentSystem legacyPaymentSystem;

    public PaymentAdapter(LegacyPaymentSystem legacyPaymentSystem) {
        this.legacyPaymentSystem = legacyPaymentSystem;
    }

    @Override
    public void pay(String userId, double amount) {
        legacyPaymentSystem.makeTransaction(userId, amount);
    }
}
