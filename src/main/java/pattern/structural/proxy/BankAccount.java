package pattern.structural.proxy;

interface BankAccount {
    void withdraw(double amount);
    void deposit(double amount);
    double getBalance();
}
