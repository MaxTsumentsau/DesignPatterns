package pattern.behavioral.observer.messageBroker.subscriber;

import pattern.behavioral.observer.messageBroker.subscriberInterface.Subscriber;

public class EmailService implements Subscriber {
    @Override
    public void handleEvent(String eventType, String data) {
        System.out.printf("Email service handle event %s with data %s%n", eventType, data);
    }
}
