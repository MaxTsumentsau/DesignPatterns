package pattern.behavioral.chainOfResponsibility.techSupport.concreteExecutor;

import pattern.behavioral.chainOfResponsibility.techSupport.interfaceExecutor.SupportHandler;

public class LevelOneSupport extends SupportHandler {
    @Override
    protected boolean canHandle(String issue) {
        return issue.contains("password") || issue.contains("login");
    }

    @Override
    protected void process(String issue) {
        System.out.println("Level 1 helping with: " + issue);
    }
}
