package pattern.structural.facade.homeTheater.system;

public class Projector {
    private boolean isActive = false;

    public void on() {
        isActive = true;
        System.out.println("Turn on the projector");
    }

    public void off() {
        isActive = false;
        System.out.println("Turn off the projector");
    }
}
