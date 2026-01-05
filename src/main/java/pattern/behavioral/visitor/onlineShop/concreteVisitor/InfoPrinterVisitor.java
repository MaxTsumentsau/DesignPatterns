package pattern.behavioral.visitor.onlineShop.concreteVisitor;

import pattern.behavioral.visitor.onlineShop.commonVisitor.ProductVisitor;
import pattern.behavioral.visitor.onlineShop.unmodifiableClass.Book;
import pattern.behavioral.visitor.onlineShop.unmodifiableClass.Electronics;

public class InfoPrinterVisitor implements ProductVisitor {
    @Override
    public void visit(Book book) {
        System.out.printf("Book %s with price %f%n",
                book.getTitle(), book.getPrice());
    }

    @Override
    public void visit(Electronics electronics) {
        System.out.printf("Book %s with price %f%n",
                electronics.getName(), electronics.getPrice());
    }
}
