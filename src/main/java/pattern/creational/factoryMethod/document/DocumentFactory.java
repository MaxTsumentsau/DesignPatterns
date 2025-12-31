package pattern.creational.factoryMethod.document;

public abstract class DocumentFactory {
    public abstract Document createDocument();

    public void renderDocument(){
        Document document = createDocument();
        document.open();
    }
}
