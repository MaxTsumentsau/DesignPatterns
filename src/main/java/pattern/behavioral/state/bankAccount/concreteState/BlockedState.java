package pattern.behavioral.state.bankAccount.concreteState;

import pattern.behavioral.state.bankAccount.commonState.AccountState;
import pattern.behavioral.state.bankAccount.context.BankAccount;

public class BlockedState implements AccountState {
    @Override
    public void deposit(BankAccount bankAccount, double amount) {
        System.out.println("Bank account is locked. Operation impossible");
    }

    @Override
    public void withdraw(BankAccount bankAccount, double amount) {
        System.out.println("Bank account is locked. Operation impossible");
    }
}
