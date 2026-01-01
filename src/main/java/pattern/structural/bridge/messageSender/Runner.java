package pattern.structural.bridge.messageSender;

import pattern.structural.bridge.messageSender.abstraction.Message;
import pattern.structural.bridge.messageSender.concreteAbstraction.AlertMessage;
import pattern.structural.bridge.messageSender.concreteAbstraction.TextMessage;
import pattern.structural.bridge.messageSender.concreteImplementation.EmailSender;
import pattern.structural.bridge.messageSender.concreteImplementation.PushSender;
import pattern.structural.bridge.messageSender.concreteImplementation.SMSSender;

public class Runner {
    public static void main(String[] args) {
        Message message1 = new TextMessage(new PushSender());
        Message message2 = new AlertMessage(new SMSSender());
        Message message3 = new TextMessage(new EmailSender());

        message1.send("Merry christmas! We love you!");
        message2.send("Website is shutdown!!");
        message3.send("We want to give you promotion!");
    }
}
