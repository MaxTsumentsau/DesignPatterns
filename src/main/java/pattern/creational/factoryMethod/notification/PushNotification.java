package pattern.creational.factoryMethod.notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending with push: " + message);
    }
}
