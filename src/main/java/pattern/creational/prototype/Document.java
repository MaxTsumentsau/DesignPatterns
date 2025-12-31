package pattern.creational.prototype;

public class Document implements Prototype{
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public Prototype clone() {
        return new Document(title, content);
    }
}
