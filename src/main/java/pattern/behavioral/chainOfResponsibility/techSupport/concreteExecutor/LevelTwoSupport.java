package pattern.behavioral.chainOfResponsibility.techSupport.concreteExecutor;

import pattern.behavioral.chainOfResponsibility.techSupport.interfaceExecutor.SupportHandler;

public class LevelTwoSupport extends SupportHandler {
    @Override
    protected boolean canHandle(String issue) {
        return issue.contains("wifi") || issue.contains("internet");
    }

    @Override
    protected void process(String issue) {
        System.out.println("Level 2 helping with: " + issue);
    }
}
