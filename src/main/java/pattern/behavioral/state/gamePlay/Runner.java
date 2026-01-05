package pattern.behavioral.state.gamePlay;

import pattern.behavioral.state.gamePlay.context.Player;

public class Runner {
    public static void main(String[] args) {
        Player player = new Player();
        player.update();
        player.handleInput("run");
        player.update();
        player.update();
        player.handleInput("jump");
        player.update();
        player.handleInput("idle");
        player.update();
        player.update();
    }
}
