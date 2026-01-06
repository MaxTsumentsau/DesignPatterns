package pattern.behavioral.chainOfResponsibility.techSupport.interfaceExecutor;

public abstract class SupportHandler {
    protected SupportHandler next;

    public SupportHandler setNext(SupportHandler next) {
        this.next = next;
        return next;
    }

    public void handleRequest(String issue) {
        if (canHandle(issue)) {
            process(issue);
        } else if (next != null) {
            next.handleRequest(issue);
        } else {
            System.out.println("Process can't handle");
        }
    }

    protected abstract boolean canHandle(String issue);

    protected abstract void process(String issue);
}
