package pattern.behavioral.visitor.onlineShop.unmodifiableClass;

public class Book {
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    private String title;
    private double price;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
