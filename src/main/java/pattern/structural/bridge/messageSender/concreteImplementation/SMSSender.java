package pattern.structural.bridge.messageSender.concreteImplementation;

import pattern.structural.bridge.messageSender.implementation.MessageSender;

public class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.printf("Sending sms message: %s%n", message);
    }
}
