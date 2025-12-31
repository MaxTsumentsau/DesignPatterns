package pattern.creational.factoryMethod.documentWithStaticMethod;

public class Runner {
    public static void main(String[] args) {
        Document pdf = DocumentFactory.createDocument("pdf");
        pdf.open();

        Document word = DocumentFactory.createDocument("word");
        word.open();

        Document excel = DocumentFactory.createDocument("Excel ");
        pdf.open();
    }
}
