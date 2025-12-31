package pattern.structural.facade.homeTheater.facade;

import pattern.structural.facade.homeTheater.system.Amplifier;
import pattern.structural.facade.homeTheater.system.DVDPlayer;
import pattern.structural.facade.homeTheater.system.Projector;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer, Projector projector) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }


    public void watchMovie(String name) {
        System.out.println("Going to watch the movie...");
        amplifier.on();
        amplifier.setVolume(5);
        projector.on();
        dvdPlayer.on();
        dvdPlayer.videScreenMode();
        dvdPlayer.playMovie(name);
    }

    public void endMovie() {
        System.out.println("Turn off the HomeTheater...");
        dvdPlayer.off();
        amplifier.off();
        projector.off();
    }
}
