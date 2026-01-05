package pattern.behavioral.visitor.onlineShop;

import pattern.behavioral.visitor.onlineShop.commonVisitor.ProductVisitor;
import pattern.behavioral.visitor.onlineShop.concreteVisitor.DiscountVisitor;
import pattern.behavioral.visitor.onlineShop.concreteVisitor.InfoPrinterVisitor;
import pattern.behavioral.visitor.onlineShop.strucute.ShoppingCart;
import pattern.behavioral.visitor.onlineShop.unmodifiableClass.Book;
import pattern.behavioral.visitor.onlineShop.unmodifiableClass.Electronics;

public class Runner {
    public static void main(String[] args) {
        Book book1 = new Book("One flew over the cuckoo's nest", 25.0);
        Book book2 = new Book("catcher in the rye", 17.0);
        Electronics electronics1 = new Electronics("samsung s26", 1200);
        Electronics electronics2 = new Electronics("iphone 17", 1300);
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(book1);
        cart.addItem(book2);
        cart.addItem(electronics1);
        cart.addItem(electronics2);

        ProductVisitor visitor1 = new DiscountVisitor();
        ProductVisitor visitor2 = new InfoPrinterVisitor();

        cart.accept(visitor1);
        cart.accept(visitor2);
    }
}
