package pattern.behavioral.state.gamePlay.concreteState;

import pattern.behavioral.state.gamePlay.commonState.PlayerState;
import pattern.behavioral.state.gamePlay.context.Player;

public class JumpingState implements PlayerState {
    @Override
    public void handleInput(Player player, String input) {
        if ("idle".equals(input)) {
            System.out.println("Player is going to stand up");
            player.setState(new IdleState());
        }
    }

    @Override
    public void update(Player player) {
        System.out.println("Player jumps");
    }
}
