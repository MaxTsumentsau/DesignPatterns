package pattern.behavioral.state.bankAccount.commonState;

import pattern.behavioral.state.bankAccount.context.BankAccount;

public interface AccountState {
    void deposit(BankAccount bankAccount, double amount);

    void withdraw(BankAccount bankAccount, double amount);
}
