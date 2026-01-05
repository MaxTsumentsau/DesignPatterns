package pattern.behavioral.state.gamePlay.commonState;

import pattern.behavioral.state.gamePlay.context.Player;

public interface PlayerState {
    void handleInput(Player player, String input);

    void update(Player player);
}
