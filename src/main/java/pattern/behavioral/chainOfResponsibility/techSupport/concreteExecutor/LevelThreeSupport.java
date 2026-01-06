package pattern.behavioral.chainOfResponsibility.techSupport.concreteExecutor;

import pattern.behavioral.chainOfResponsibility.techSupport.interfaceExecutor.SupportHandler;

public class LevelThreeSupport extends SupportHandler {
    @Override
    protected boolean canHandle(String issue) {
        return issue.contains("server") || issue.contains("database");
    }

    @Override
    protected void process(String issue) {
        System.out.println("Level 3 helping with: " + issue);
    }
}
