package pattern.structural.facade.homeTheater;

import pattern.structural.facade.homeTheater.facade.HomeTheaterFacade;
import pattern.structural.facade.homeTheater.system.Amplifier;
import pattern.structural.facade.homeTheater.system.DVDPlayer;
import pattern.structural.facade.homeTheater.system.Projector;

public class Runner {
    public static void main(String[] args) {
        Projector projector = new Projector();
        Amplifier amplifier = new Amplifier();
        DVDPlayer player = new DVDPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, player, projector);
        homeTheater.watchMovie("Terminator");
        homeTheater.endMovie();
    }
}
