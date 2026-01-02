package pattern.behavioral.chainOfResponsibility;

abstract class AuthHandler {
    protected AuthHandler nextHandler;

    public AuthHandler setNext(AuthHandler handler) {
        this.nextHandler = handler;
        return handler;
    }

    public abstract boolean handle(AuthRequest request);

    protected boolean handleNext(AuthRequest request) {
        if (nextHandler == null) {
            return true;
        }
        return nextHandler.handle(request);
    }
}
