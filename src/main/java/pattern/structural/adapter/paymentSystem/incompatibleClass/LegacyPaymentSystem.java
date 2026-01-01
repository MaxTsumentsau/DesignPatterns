package pattern.structural.adapter.paymentSystem.incompatibleClass;

public class LegacyPaymentSystem {
    public void makeTransaction(String account, double amount) {
        System.out.printf("Your bank account %s receive %f%n", account, amount);
    }
}
