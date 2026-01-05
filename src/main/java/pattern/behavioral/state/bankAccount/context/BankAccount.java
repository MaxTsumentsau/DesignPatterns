package pattern.behavioral.state.bankAccount.context;

import pattern.behavioral.state.bankAccount.commonState.AccountState;
import pattern.behavioral.state.bankAccount.concreteState.BlockedState;

public class BankAccount {
    private double balance = 0;
    private AccountState state = new BlockedState();

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(double amount) {
        state.deposit(this, amount);
    }

    public void withdraw(double amount) {
        state.withdraw(this, amount);
    }
}
