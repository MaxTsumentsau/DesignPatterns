package pattern.behavioral.memento.imageEditor.originator;

import pattern.behavioral.memento.imageEditor.memento.ImageMemento;

public class ImageEditor {
    private String state;

    public ImageEditor(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ImageMemento save() {
        return new ImageMemento(state);
    }

    public void restore(ImageMemento memento) {
        this.state = memento.state();
    }

    public void showInfo() {
        System.out.printf("Image editor with state %s%n", state);
    }
}
