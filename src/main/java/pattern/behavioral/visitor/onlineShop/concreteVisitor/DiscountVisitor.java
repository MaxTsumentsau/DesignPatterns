package pattern.behavioral.visitor.onlineShop.concreteVisitor;

import pattern.behavioral.visitor.onlineShop.commonVisitor.ProductVisitor;
import pattern.behavioral.visitor.onlineShop.unmodifiableClass.Book;
import pattern.behavioral.visitor.onlineShop.unmodifiableClass.Electronics;

public class DiscountVisitor implements ProductVisitor {
    @Override
    public void visit(Book book) {
        System.out.printf("Book %s with price %f and discount 10%%: %f%n",
                book.getTitle(), book.getPrice(), book.getPrice() * 0.9);
    }

    @Override
    public void visit(Electronics electronics) {
        System.out.printf("Electronics%s with price %f and discount 10%%: %f%n",
                electronics.getName(), electronics.getPrice(), electronics.getPrice() * 0.9);
    }
}
