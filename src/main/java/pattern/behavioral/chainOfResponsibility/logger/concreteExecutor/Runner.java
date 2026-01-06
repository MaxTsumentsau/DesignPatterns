package pattern.behavioral.chainOfResponsibility.logger.concreteExecutor;

import pattern.behavioral.chainOfResponsibility.logger.interfaceExecutor.Logger;

public class Runner {
    public static void main(String[] args) {
        Logger info = new InfoLogger();
        Logger warning = new WarningLogger();
        Logger error = new ErrorLogger();

        info.setNext(warning);
        warning.setNext(error);

        info.log("Hello world", 1);
        info.log("Ciao tutti", 2);
        info.log("Всем привет", 3);
    }
}
