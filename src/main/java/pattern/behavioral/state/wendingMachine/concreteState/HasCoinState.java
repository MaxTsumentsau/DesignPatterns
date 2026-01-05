package pattern.behavioral.state.wendingMachine.concreteState;

import pattern.behavioral.state.wendingMachine.commonState.VendingState;
import pattern.behavioral.state.wendingMachine.context.VendingMachine;

public class HasCoinState implements VendingState {
    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Coin already inserted");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Drink dispensing");
        vendingMachine.setState(new NoCoinState());
    }
}
