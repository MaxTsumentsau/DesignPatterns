package pattern.behavioral.mediator.meetingRoom;

import pattern.behavioral.mediator.meetingRoom.abstractMediator.Mediator;
import pattern.behavioral.mediator.meetingRoom.concreteComponent.User;
import pattern.behavioral.mediator.meetingRoom.concreteMediator.MeetingRoomMediator;

public class Runner {
    public static void main(String[] args) {
        Mediator meetingRoom = new MeetingRoomMediator();
        User igor = new User("Igor", meetingRoom);
        User anna = new User("Anna", meetingRoom);

        anna.bookRoom();
        igor.bookRoom();
        anna.releasedRoom();
        igor.bookRoom();
    }
}
