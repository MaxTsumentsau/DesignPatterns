package pattern.creational.factoryMethod.documentWithStaticMethod;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Open in office excel!");
    }
}
