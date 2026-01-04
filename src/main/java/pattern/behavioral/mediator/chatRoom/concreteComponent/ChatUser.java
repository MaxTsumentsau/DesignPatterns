package pattern.behavioral.mediator.chatRoom.concreteComponent;

import pattern.behavioral.mediator.chatRoom.abstractComponent.User;
import pattern.behavioral.mediator.chatRoom.mediatorInterface.ChatMediator;

public class ChatUser extends User {
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.printf("%s send message %s%n", name, message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.printf("%s receive message %s%n", name, message);
    }
}
