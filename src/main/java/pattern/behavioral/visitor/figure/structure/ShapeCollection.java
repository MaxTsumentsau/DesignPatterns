package pattern.behavioral.visitor.figure.structure;

import pattern.behavioral.visitor.figure.commonVisitor.ShapeVisitor;
import pattern.behavioral.visitor.figure.unmofiableObject.Circle;
import pattern.behavioral.visitor.figure.unmofiableObject.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollection {
    private List<Object> shapes = new ArrayList<>();

    public void addShape(Object shape) {
        shapes.add(shape);
    }

    public void accept(ShapeVisitor visitor) {
        for (Object shape : shapes) {
            if (shape instanceof Circle) {
                visitor.visit((Circle) shape);
            } else if (shape instanceof Rectangle) {
                visitor.visit((Rectangle) shape);
            }
        }
    }
}
