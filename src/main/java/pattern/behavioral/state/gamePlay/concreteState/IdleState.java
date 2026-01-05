package pattern.behavioral.state.gamePlay.concreteState;

import pattern.behavioral.state.gamePlay.commonState.PlayerState;
import pattern.behavioral.state.gamePlay.context.Player;

public class IdleState implements PlayerState {
    @Override
    public void handleInput(Player player, String input) {
        if ("run".equals(input)){
            System.out.println("Player is going to run");
            player.setState(new RunningState());
        } else if("jump".equals(input)){
            System.out.println("Player is going to jump");
            player.setState(new JumpingState());
        }
    }

    @Override
    public void update(Player player) {
        System.out.println("Player stays idle");
    }
}
