package pattern.behavioral.state.wendingMachine.concreteState;

import pattern.behavioral.state.wendingMachine.commonState.VendingState;
import pattern.behavioral.state.wendingMachine.context.VendingMachine;

public class NoCoinState implements VendingState {
    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Coin inserted");
        vendingMachine.setState(new HasCoinState());
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Insert coin please");
    }
}
