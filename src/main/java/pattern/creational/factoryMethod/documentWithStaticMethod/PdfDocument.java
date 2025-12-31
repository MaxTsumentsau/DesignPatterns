package pattern.creational.factoryMethod.documentWithStaticMethod;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Open in pdf reader!");
    }
}
