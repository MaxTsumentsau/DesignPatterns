package pattern.behavioral.memento.gameSaver;

import pattern.behavioral.memento.gameSaver.careTaker.SaveHistory;
import pattern.behavioral.memento.gameSaver.originator.Player;

public class Runner {
    public static void main(String[] args) {
        SaveHistory history = new SaveHistory();
        Player player = new Player(1, 100);
        history.push(player.save());
        player.showState();

        player.setLevel(5);
        player.setHealth(130);
        history.push(player.save());
        player.showState();

        player.setLevel(5);
        player.setHealth(10);
        player.showState();

        player.restore(history.pop());
        player.showState();

        player.restore(history.pop());
        player.showState();
    }
}
