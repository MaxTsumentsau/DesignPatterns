package pattern.behavioral.mediator.chatRoom.concreteMediator;

import pattern.behavioral.mediator.chatRoom.abstractComponent.User;
import pattern.behavioral.mediator.chatRoom.mediatorInterface.ChatMediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User sender) {
        for (User u : users) {
            if (u != sender) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
