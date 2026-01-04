package pattern.structural.decorator.notifier;

public class Runner {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier.send("Ваш заказ готов");

        Notifier notifier2 = new SMSDecorator(new EmailNotifier());
        notifier2.send("Ваш заказ готов");

        Notifier notifier3 = new SlackDecorator(new SMSDecorator(new EmailNotifier()));
        notifier3.send("СРОЧНО: Сервер упал!");
    }
}
