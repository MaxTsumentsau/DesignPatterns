package pattern.behavioral.chainOfResponsibility.logger.concreteExecutor;

import pattern.behavioral.chainOfResponsibility.logger.interfaceExecutor.Logger;

public class WarningLogger extends Logger {
    @Override
    protected boolean canHandle(int level) {
        return 2 == level;
    }

    @Override
    protected void write(String message) {
        System.out.println("WARNING: " + message);
    }
}
