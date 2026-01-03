package pattern.structural.proxy.bank;

interface BankAccount {
    void withdraw(double amount);
    void deposit(double amount);
    double getBalance();
}
