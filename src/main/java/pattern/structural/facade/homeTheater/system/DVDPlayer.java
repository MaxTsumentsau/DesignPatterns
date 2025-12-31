package pattern.structural.facade.homeTheater.system;

public class DVDPlayer {
    private boolean isActive = false;

    public void on() {
        isActive = true;
        System.out.println("Turn on the DVD player");
    }

    public void off() {
        isActive = false;
        System.out.println("Turn off the DVD player");
    }

    public void playMovie(String name) {
        System.out.println("Show movie: " + name);
    }

    public void videScreenMode() {
        System.out.println("Show movie in wide screen mode");
    }
}
