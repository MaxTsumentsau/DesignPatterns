package pattern.structural.proxy.bank;

public class ProtectionProxy implements BankAccount {
    private final RealBankAccount realAccount;
    private final UserRole userRole;
    private final String accountOwner;

    public ProtectionProxy(String owner, double balance, UserRole userRole) {
        this.accountOwner = owner;
        this.userRole = userRole;
        this.realAccount = new RealBankAccount(owner, balance);
    }

    public void withdraw(double amount) {
        if (!userRole.canWithdraw()) {
            System.out.println("ОШИБКА: Только владелец может снимать деньги!");
            return;
        }
        realAccount.withdraw(amount);
    }

    public void deposit(double amount) {
        if (!userRole.canDeposit()) {
            System.out.println("ОШИБКА: Недостаточно прав для пополнения!");
            return;
        }
        realAccount.deposit(amount);
    }

    public double getBalance() {
        return realAccount.getBalance();
    }
}
