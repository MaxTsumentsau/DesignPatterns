package pattern.behavioral.observer.notificationSystem;

import pattern.behavioral.observer.notificationSystem.publisher.NewsAgency;
import pattern.behavioral.observer.notificationSystem.subscriber.EmailSubscriber;
import pattern.behavioral.observer.notificationSystem.subscriber.SmsSubscriber;
import pattern.behavioral.observer.notificationSystem.subscriberInterface.Observer;

public class Runner {
    public static void main(String[] args) {
        NewsAgency times = new NewsAgency();
        Observer observer1 = new SmsSubscriber("+1 19433483");
        Observer observer2 = new EmailSubscriber("max@gmail.com");
        times.addObserver(observer1);
        times.addObserver(observer2);
        times.notifyObservers("Hello from mars!");
        times.removeObserver(observer2);
        times.notifyObservers("Find new species in Asia");
    }
}
