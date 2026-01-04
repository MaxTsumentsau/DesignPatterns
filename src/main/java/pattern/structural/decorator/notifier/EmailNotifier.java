package pattern.structural.decorator.notifier;

class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}
