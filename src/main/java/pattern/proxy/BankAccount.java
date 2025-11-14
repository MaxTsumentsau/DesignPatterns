package pattern.proxy;

interface BankAccount {
    void withdraw(double amount);
    void deposit(double amount);
    double getBalance();
}
