package pattern.behavioral.observer.messageBroker.subscriberInterface;

public interface Subscriber {
    void handleEvent(String eventType, String data);
}
