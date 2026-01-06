package pattern.behavioral.chainOfResponsibility.logger.interfaceExecutor;

public abstract class Logger {
    protected Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    public void log(String message, int level) {
        if (canHandle(level)) {
            write(message);
        } else if (next != null) {
            next.log(message, level);
        }
    }

    protected abstract boolean canHandle(int level);

    protected abstract void write(String message);
}
