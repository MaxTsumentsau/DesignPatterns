package pattern.behavioral.state.bankAccount.concreteState;

import pattern.behavioral.state.bankAccount.commonState.AccountState;
import pattern.behavioral.state.bankAccount.context.BankAccount;

public class ActiveState implements AccountState {
    @Override
    public void deposit(BankAccount bankAccount, double amount) {
        bankAccount.setBalance(bankAccount.getBalance() + amount);
        System.out.println("Bank account deposit with amounts: " + amount);
    }

    @Override
    public void withdraw(BankAccount bankAccount, double amount) {
        if (bankAccount.getBalance() > amount) {
            bankAccount.setBalance(bankAccount.getBalance() - amount);
            System.out.println("Bank account withdraw with amounts: " + amount);
        } else {
            System.out.println("Bank account do not have enough funds");
        }

    }
}
