package pattern.behavioral.visitor.figure;

import pattern.behavioral.visitor.figure.commonVisitor.ShapeVisitor;
import pattern.behavioral.visitor.figure.concreteVisitor.AreaCalculator;
import pattern.behavioral.visitor.figure.structure.ShapeCollection;
import pattern.behavioral.visitor.figure.unmofiableObject.Circle;
import pattern.behavioral.visitor.figure.unmofiableObject.Rectangle;

public class Runner {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Rectangle rectangle1 = new Rectangle(2, 4);
        Rectangle rectangle2 = new Rectangle(4, 4);
        ShapeCollection collection = new ShapeCollection();
        collection.addShape(circle1);
        collection.addShape(circle2);
        collection.addShape(rectangle1);
        collection.addShape(rectangle2);
        ShapeVisitor visitor = new AreaCalculator();
        collection.accept(visitor);
    }
}
