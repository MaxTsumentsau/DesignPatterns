package pattern.proxy;

class RealBankAccount implements BankAccount {
    private double balance;
    private final String owner;

    public RealBankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(owner + ": снято " + amount);
        }
        else {
            System.out.println("ОШИБКА: Недостаточно средств на счете!");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(owner + ": пополнено на " + amount);
    }

    public double getBalance() {
        return balance;
    }
}
