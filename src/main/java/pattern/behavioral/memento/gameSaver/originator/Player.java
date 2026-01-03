package pattern.behavioral.memento.gameSaver.originator;

import pattern.behavioral.memento.gameSaver.memento.PlayerMemento;

public class Player {
    private int level;
    private int health;

    public Player(int level, int health) {
        this.level = level;
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void showState() {
        System.out.printf("Player at level %d with health %d%n", level, health);
    }

    public PlayerMemento save() {
        return new PlayerMemento(level, health);
    }

    public void restore(PlayerMemento memento) {
        this.level = memento.level();
        this.health = memento.health();
    }
}
