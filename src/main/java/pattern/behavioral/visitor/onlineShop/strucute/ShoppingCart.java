package pattern.behavioral.visitor.onlineShop.strucute;

import pattern.behavioral.visitor.onlineShop.commonVisitor.ProductVisitor;
import pattern.behavioral.visitor.onlineShop.unmodifiableClass.Book;
import pattern.behavioral.visitor.onlineShop.unmodifiableClass.Electronics;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Object> items = new ArrayList<>();

    public void addItem(Object item) {
        items.add(item);
    }

    public void accept(ProductVisitor visitor) {
        for (Object item : items) {
            if (item instanceof Book) {
                visitor.visit((Book) item);
            } else if (item instanceof Electronics) {
                visitor.visit((Electronics) item);
            }
        }
    }
}
