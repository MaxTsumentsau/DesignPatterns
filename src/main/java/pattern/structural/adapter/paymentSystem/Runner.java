package pattern.structural.adapter.paymentSystem;

import pattern.structural.adapter.paymentSystem.adapter.PaymentAdapter;
import pattern.structural.adapter.paymentSystem.incompatibleClass.LegacyPaymentSystem;
import pattern.structural.adapter.paymentSystem.newInterface.PaymentProcessor;

public class Runner {
    public static void main(String[] args) {
        LegacyPaymentSystem legacyPaymentSystem = new LegacyPaymentSystem();
        PaymentProcessor paymentProcessor=new PaymentAdapter(legacyPaymentSystem);

        paymentProcessor.pay("ACC0077818",5900.58);
    }
}
