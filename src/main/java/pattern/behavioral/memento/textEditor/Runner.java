package pattern.behavioral.memento.textEditor;

import pattern.behavioral.memento.textEditor.caretaker.History;
import pattern.behavioral.memento.textEditor.originator.Editor;

public class Runner {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setText("First version");
        history.push(editor.save());

        editor.setText("Second version");
        history.push(editor.save());

        editor.setText("Third version");
        System.out.println(editor.getText());

        editor.restore(history.pop());
        System.out.println(editor.getText());

        editor.restore(history.pop());
        System.out.println(editor.getText());
    }
}
