package pattern.creational.prototype;

public class Runner {
    public static void main(String[] args) {
        var doc1 = new Document("001m", "Hello world");
        var doc2 = doc1.clone();
        System.out.println(doc2);
    }
}
