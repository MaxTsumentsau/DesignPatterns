package pattern.creational.factoryMethod.documentWithStaticMethod;

class DocumentFactory {
    //Статический фабричный метод
    public static Document createDocument(String type) {
        switch (type.toLowerCase().trim()) {
            case "pdf":
                return new PdfDocument();
            case "word":
                return new WordDocument();
            case "excel":
                return new ExcelDocument();
            default: throw new IllegalArgumentException("Неизвестный тип документа: " + type);
        }
    }
}
