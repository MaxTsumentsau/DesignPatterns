package pattern.behavioral.observer.messageBroker;

import pattern.behavioral.observer.messageBroker.broker.EventBus;
import pattern.behavioral.observer.messageBroker.publisher.UserService;
import pattern.behavioral.observer.messageBroker.subscriber.EmailService;
import pattern.behavioral.observer.messageBroker.subscriber.LoggingService;
import pattern.behavioral.observer.messageBroker.subscriberInterface.Subscriber;

public class Runner {
    public static void main(String[] args) {
        EventBus kafka = new EventBus();
        UserService hr = new UserService(kafka);
        Subscriber subscriber1 = new EmailService();
        Subscriber subscriber2 = new LoggingService();

        hr.addTopic("NewPerson");
        hr.addTopic("SustainPerson");

        kafka.subscribe("NewPerson", subscriber1);
        kafka.subscribe("NewPerson", subscriber2);
        kafka.subscribe("SustainPerson", subscriber1);

        hr.publish("NewPerson", "New employee is John Doe");
        hr.publish("SustainPerson", "John Doe is sustained");
    }
}
