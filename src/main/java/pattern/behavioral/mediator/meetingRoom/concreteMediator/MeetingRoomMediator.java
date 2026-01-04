package pattern.behavioral.mediator.meetingRoom.concreteMediator;

import pattern.behavioral.mediator.meetingRoom.abstractMediator.Mediator;
import pattern.behavioral.mediator.meetingRoom.concreteComponent.User;

public class MeetingRoomMediator implements Mediator {
    private boolean isBooked;

    @Override
    public void bookRoom(User user) {
        if (!isBooked) {
            System.out.printf("%s is booked meeting room%n", user.getName());
            isBooked = true;
        } else {
            System.out.println("Meeting room is already booked");
        }
    }

    @Override
    public void releaseRoom(User user) {
        if (isBooked) {
            System.out.printf("%s release meeting room%n", user.getName());
            isBooked = false;
        } else {
            System.out.println("Meeting room already released");
        }
    }
}
