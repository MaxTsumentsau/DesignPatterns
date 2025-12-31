package pattern.creational.factoryMethod.notification;

public class SMSFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
