package pattern.structural.facade.bankSystem.facade;

import pattern.structural.facade.bankSystem.system.AccountService;
import pattern.structural.facade.bankSystem.system.NotificationService;
import pattern.structural.facade.bankSystem.system.PaymentService;

public class BankFacade {
    private AccountService accountService;
    private PaymentService paymentService;
    private NotificationService notificationService;

    public BankFacade() {
        this.accountService = new AccountService();
        this.paymentService = new PaymentService();
        this.notificationService = new NotificationService();
    }

    public void transferMoney(String from, String to, double amount) {
        accountService.checkBalance(from);
        paymentService.makePayment(from, to, amount);
        notificationService.sendNotification("Transaction is successful!");
    }
}
