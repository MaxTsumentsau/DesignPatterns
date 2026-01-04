package pattern.behavioral.observer.notificationSystem.subscriber;

import pattern.behavioral.observer.notificationSystem.subscriberInterface.Observer;

public class SmsSubscriber implements Observer {
    private String phoneNumber;

    @Override
    public void update(String message) {
        System.out.printf("Sending sms at phone number %s with message %s%n", phoneNumber, message);
    }

    public SmsSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
