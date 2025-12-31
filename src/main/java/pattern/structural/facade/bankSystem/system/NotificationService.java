package pattern.structural.facade.bankSystem.system;

public class NotificationService {
    public void sendNotification(String message) {
        System.out.println("Notification for client: " + message);
    }
}
