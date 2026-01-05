package pattern.behavioral.visitor.figure.concreteVisitor;

import pattern.behavioral.visitor.figure.commonVisitor.ShapeVisitor;
import pattern.behavioral.visitor.figure.unmofiableObject.Circle;
import pattern.behavioral.visitor.figure.unmofiableObject.Rectangle;

public class AreaCalculator implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Area of circle: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of rectangle: " + area);
    }
}
