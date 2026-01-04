package pattern.behavioral.observer.notificationSystem.subscriber;

import pattern.behavioral.observer.notificationSystem.subscriberInterface.Observer;

public class EmailSubscriber implements Observer {
    private String email;

    @Override
    public void update(String message) {
        System.out.printf("Sending at email %s message: %s%n", email, message);
    }

    public EmailSubscriber(String email) {
        this.email = email;
    }
}
