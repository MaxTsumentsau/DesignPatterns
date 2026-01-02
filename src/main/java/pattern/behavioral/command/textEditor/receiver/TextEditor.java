package pattern.behavioral.command.textEditor.receiver;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void write(String words) {
        text.append(words);
    }

    public String getText() {
        return text.toString();
    }

    public void deleteLast(int count) {
        text.delete(text.length() - count, text.length());
    }
}
