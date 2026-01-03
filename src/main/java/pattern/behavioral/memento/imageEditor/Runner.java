package pattern.behavioral.memento.imageEditor;

import pattern.behavioral.memento.imageEditor.caretaker.History;
import pattern.behavioral.memento.imageEditor.originator.ImageEditor;

public class Runner {
    public static void main(String[] args) {
        History history = new History();
        ImageEditor editor = new ImageEditor("Normal");
        history.push(editor.save());

        editor.setState("Glitter");
        history.push(editor.save());

        editor.setState("Mate");
        history.push(editor.save());

        editor.restore(history.pop());
        editor.showInfo();

        editor.restore(history.pop());
        editor.showInfo();

        editor.restore(history.pop());
        editor.showInfo();

        editor.restore(history.pop());
        editor.showInfo();
    }
}
