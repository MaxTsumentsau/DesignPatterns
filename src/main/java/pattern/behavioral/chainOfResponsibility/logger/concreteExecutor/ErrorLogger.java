package pattern.behavioral.chainOfResponsibility.logger.concreteExecutor;

import pattern.behavioral.chainOfResponsibility.logger.interfaceExecutor.Logger;

public class ErrorLogger extends Logger {
    @Override
    protected boolean canHandle(int level) {
        return 3 == level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
