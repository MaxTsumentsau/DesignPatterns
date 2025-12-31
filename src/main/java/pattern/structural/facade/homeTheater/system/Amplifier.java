package pattern.structural.facade.homeTheater.system;

public class Amplifier {
    private boolean isActive = false;

    public void on() {
        isActive = true;
        System.out.println("Turn on the amplifier");
    }

    public void off() {
        isActive = false;
        System.out.println("Turn off the amplifier");
    }

    public void setVolume(int volume) {
        System.out.println("Set volume to: " + volume);
    }
}
