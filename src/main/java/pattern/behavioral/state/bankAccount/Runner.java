package pattern.behavioral.state.bankAccount;

import pattern.behavioral.state.bankAccount.concreteState.ActiveState;
import pattern.behavioral.state.bankAccount.concreteState.BlockedState;
import pattern.behavioral.state.bankAccount.concreteState.ClosedState;
import pattern.behavioral.state.bankAccount.context.BankAccount;

public class Runner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500.00);
        account.setState(new ActiveState());
        account.deposit(500.00);
        account.withdraw(200.00);
        account.setState(new BlockedState());
        account.deposit(500.00);
        account.setState(new ClosedState());
        account.deposit(100.00);
    }
}
