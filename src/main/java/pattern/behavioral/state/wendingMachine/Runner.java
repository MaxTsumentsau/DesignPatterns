package pattern.behavioral.state.wendingMachine;

import pattern.behavioral.state.wendingMachine.context.VendingMachine;

public class Runner {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.dispense();
        vendingMachine.insertCoin();
        vendingMachine.insertCoin();
        vendingMachine.dispense();
    }
}
