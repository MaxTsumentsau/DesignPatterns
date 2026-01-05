package pattern.behavioral.state.wendingMachine.context;

import pattern.behavioral.state.wendingMachine.commonState.VendingState;
import pattern.behavioral.state.wendingMachine.concreteState.NoCoinState;

public class VendingMachine {
    private VendingState state;

    public void setState(VendingState state) {
        this.state = state;
    }

    public VendingMachine() {
        this.state = new NoCoinState();
    }

    public void insertCoin(){
        state.insertCoin(this);
    }

    public void dispense(){
        state.dispense(this);
    }
}
