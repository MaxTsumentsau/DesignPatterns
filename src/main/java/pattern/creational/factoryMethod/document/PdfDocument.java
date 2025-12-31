package pattern.creational.factoryMethod.document;

public class PdfDocument implements Document{
    @Override
    public void open() {
        System.out.println("Open in pdf reader!");
    }
}
