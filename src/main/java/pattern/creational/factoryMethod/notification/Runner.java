package pattern.creational.factoryMethod.notification;

public class Runner {
    public static void main(String[] args) {
        NotificationFactory factory;
        factory = new EmailFactory();
        factory.send("N1");

        factory = new SMSFactory();
        factory.send("N2");

        factory = new PushFactory();
        factory.send("N3");
    }
}
