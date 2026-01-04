package pattern.behavioral.observer.messageBroker.broker;

import pattern.behavioral.observer.messageBroker.subscriberInterface.Subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBus {
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void subscribe(String eventType, Subscriber subscriber) {
        subscribers.computeIfAbsent(eventType, k -> new ArrayList<>()).add(subscriber);
    }

    public void publish(String eventType, String data) {
        if (subscribers.containsKey(eventType)) {
            for (Subscriber s : subscribers.get(eventType)) {
                s.handleEvent(eventType, data);
            }
        }
    }

    public void addTopic(String topic) {
        subscribers.putIfAbsent(topic, new ArrayList<>());
    }
}
