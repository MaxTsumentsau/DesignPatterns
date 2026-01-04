package pattern.behavioral.mediator.meetingRoom.concreteComponent;

import pattern.behavioral.mediator.meetingRoom.abstractMediator.Mediator;

public class User {
    private String name;
    private Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void bookRoom(){
        mediator.bookRoom(this);
    }

    public void releasedRoom(){
        mediator.releaseRoom(this);
    }
}
