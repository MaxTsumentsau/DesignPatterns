package pattern.creational.factoryMethod.documentWithStaticMethod;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Open in Office word!");
    }
}
