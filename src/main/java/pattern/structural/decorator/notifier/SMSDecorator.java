package pattern.structural.decorator.notifier;

class SMSDecorator extends NotifierDecorator {
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);
        System.out.println("Отправка SMS: " + message);
    }
}
