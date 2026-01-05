package pattern.behavioral.state.wendingMachine.commonState;

import pattern.behavioral.state.wendingMachine.context.VendingMachine;

public interface VendingState {
    void insertCoin(VendingMachine vendingMachine);

    void dispense(VendingMachine vendingMachine);
}
