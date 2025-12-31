package pattern.creational.factoryMethod.document;

public class PdfFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
