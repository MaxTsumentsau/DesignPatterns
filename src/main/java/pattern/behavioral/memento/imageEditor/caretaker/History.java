package pattern.behavioral.memento.imageEditor.caretaker;

import pattern.behavioral.memento.imageEditor.memento.ImageMemento;

import java.util.EmptyStackException;
import java.util.Stack;

public class History {
    private Stack<ImageMemento> history = new Stack<>();

    public void push(ImageMemento memento) {
        history.push(memento);
    }

    public ImageMemento pop() {
        if (!history.empty()) {
            return history.pop();
        } else {
            return new ImageMemento("Normal");
        }
    }
}
