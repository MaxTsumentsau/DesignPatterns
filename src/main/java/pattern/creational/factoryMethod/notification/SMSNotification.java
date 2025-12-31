package pattern.creational.factoryMethod.notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending with sms: " + message);
    }
}
