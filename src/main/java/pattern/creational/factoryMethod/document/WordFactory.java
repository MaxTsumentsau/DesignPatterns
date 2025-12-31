package pattern.creational.factoryMethod.document;

public class WordFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
