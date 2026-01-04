package pattern.behavioral.mediator.chatRoom;

import pattern.behavioral.mediator.chatRoom.abstractComponent.User;
import pattern.behavioral.mediator.chatRoom.concreteComponent.ChatUser;
import pattern.behavioral.mediator.chatRoom.concreteMediator.ChatRoom;
import pattern.behavioral.mediator.chatRoom.mediatorInterface.ChatMediator;

public class Runner {
    public static void main(String[] args) {
        ChatMediator chat = new ChatRoom();
        User user1 = new ChatUser(chat, "Olga");
        User user2 = new ChatUser(chat, "Michael");
        User user3 = new ChatUser(chat, "Chad");

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.send("Ciao tutti!");
    }
}
