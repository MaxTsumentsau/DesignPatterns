package pattern.behavioral.state.gamePlay.context;

import pattern.behavioral.state.gamePlay.commonState.PlayerState;
import pattern.behavioral.state.gamePlay.concreteState.IdleState;

public class Player {
    private PlayerState state;

    public Player() {
        this.state = new IdleState();
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void handleInput(String input) {
        state.handleInput(this, input);
    }

    public void update() {
        state.update(this);
    }
}
