package pattern.structural.bridge.messageSender.concreteAbstraction;

import pattern.structural.bridge.messageSender.abstraction.Message;
import pattern.structural.bridge.messageSender.implementation.MessageSender;

public class AlertMessage extends Message {

    public AlertMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        messageSender.sendMessage("Alert! " + message);
    }
}
