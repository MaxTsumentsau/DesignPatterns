package pattern.behavioral.memento.textEditor.caretaker;

import pattern.behavioral.memento.textEditor.memento.Memento;

import java.util.Stack;

public class History {
    private Stack<Memento> stack = new Stack<>();

    public void push(Memento memento) {
        stack.push(memento);
    }

    public Memento pop() {
        return stack.pop();
    }
}
