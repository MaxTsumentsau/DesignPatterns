package pattern.creational.factoryMethod.document;

public class Runner {
    public static void main(String[] args) {
        DocumentFactory factory;

        factory = new PdfFactory();
        factory.renderDocument();

        factory = new WordFactory();
        factory.renderDocument();

        factory = new ExcelFactory();
        factory.renderDocument();
    }
}
