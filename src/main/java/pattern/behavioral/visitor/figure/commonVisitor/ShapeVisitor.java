package pattern.behavioral.visitor.figure.commonVisitor;

import pattern.behavioral.visitor.figure.unmofiableObject.Circle;
import pattern.behavioral.visitor.figure.unmofiableObject.Rectangle;

public interface ShapeVisitor {
    void visit(Circle circle);

    void visit(Rectangle rectangle);
}
