package pattern.behavioral.visitor.onlineShop.commonVisitor;

import pattern.behavioral.visitor.onlineShop.unmodifiableClass.Book;
import pattern.behavioral.visitor.onlineShop.unmodifiableClass.Electronics;

public interface ProductVisitor {
    void visit(Book book);

    void visit(Electronics electronics);
}
