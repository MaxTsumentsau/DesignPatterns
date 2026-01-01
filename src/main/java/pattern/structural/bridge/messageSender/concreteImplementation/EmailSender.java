package pattern.structural.bridge.messageSender.concreteImplementation;

import pattern.structural.bridge.messageSender.implementation.MessageSender;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.printf("Sending email message: %s%n", message);
    }
}
