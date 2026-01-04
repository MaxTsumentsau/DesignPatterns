package pattern.behavioral.observer.messageBroker.publisher;

import pattern.behavioral.observer.messageBroker.broker.EventBus;

public class UserService {
    private EventBus bus;

    public UserService(EventBus bus) {
        this.bus = bus;
    }

    public void publish(String eventType, String data) {
        bus.publish(eventType, data);
    }

    public void addTopic(String topicName) {
        bus.addTopic(topicName);
    }
}
