package pattern.behavioral.mediator.chatRoom.mediatorInterface;

import pattern.behavioral.mediator.chatRoom.abstractComponent.User;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
