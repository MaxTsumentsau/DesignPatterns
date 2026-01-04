package pattern.behavioral.mediator.meetingRoom.abstractMediator;

import pattern.behavioral.mediator.meetingRoom.concreteComponent.User;

public interface Mediator {
    void bookRoom(User user);

    void releaseRoom(User user);
}
