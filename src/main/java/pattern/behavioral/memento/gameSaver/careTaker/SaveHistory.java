package pattern.behavioral.memento.gameSaver.careTaker;

import pattern.behavioral.memento.gameSaver.memento.PlayerMemento;

import java.util.Stack;

public class SaveHistory {
    private Stack<PlayerMemento> saves = new Stack<>();

    public void push(PlayerMemento memento) {
        saves.push(memento);
    }

    public PlayerMemento pop() {
        return saves.pop();
    }
}
