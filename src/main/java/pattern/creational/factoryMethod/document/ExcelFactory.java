package pattern.creational.factoryMethod.document;

public class ExcelFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
