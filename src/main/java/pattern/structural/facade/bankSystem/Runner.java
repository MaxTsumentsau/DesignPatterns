package pattern.structural.facade.bankSystem;

import pattern.structural.facade.bankSystem.facade.BankFacade;

public class Runner {
    public static void main(String[] args) {
        BankFacade bank = new BankFacade();
        bank.transferMoney("ACC123", "ACC456", 500.0);
    }
}
