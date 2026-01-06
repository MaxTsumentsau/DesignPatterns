package pattern.behavioral.chainOfResponsibility.logger.concreteExecutor;

import pattern.behavioral.chainOfResponsibility.logger.interfaceExecutor.Logger;

public class InfoLogger extends Logger {
    @Override
    protected boolean canHandle(int level) {
        return 1 == level;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}
