package pattern.structural.bridge.messageSender.concreteImplementation;

import pattern.structural.bridge.messageSender.implementation.MessageSender;

public class PushSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.printf("Sending push notification: %s%n", message);
    }
}
