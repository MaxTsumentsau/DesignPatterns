package pattern.behavioral.state.gamePlay.concreteState;

import pattern.behavioral.state.gamePlay.commonState.PlayerState;
import pattern.behavioral.state.gamePlay.context.Player;

public class RunningState implements PlayerState {
    @Override
    public void handleInput(Player player, String input) {
        if ("idle".equals(input)) {
            System.out.println("Player is going to stay idle");
            player.setState(new IdleState());
        } else if ("jump".equals(input)) {
            System.out.println("Player is going to jump while he is running");
            player.setState(new JumpingState());
        }
    }

    @Override
    public void update(Player player) {
        System.out.println("Player jumps");
    }
}
