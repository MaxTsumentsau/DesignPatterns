package pattern.behavioral.memento.textEditor.originator;

import pattern.behavioral.memento.textEditor.memento.Memento;

public class Editor {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        this.text = memento.getText();
    }
}
