package pattern.creational.factoryMethod.document;

public class WordDocument implements Document{
    @Override
    public void open() {
        System.out.println("Open in Office word!");
    }
}
