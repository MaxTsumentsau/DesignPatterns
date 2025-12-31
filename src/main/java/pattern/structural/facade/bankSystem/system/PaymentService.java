package pattern.structural.facade.bankSystem.system;

public class PaymentService {
    public void makePayment(String from, String to, double amount) {
        System.out.println("Make transaction " + amount + " from account " + from + " to account " + to);
    }
}
