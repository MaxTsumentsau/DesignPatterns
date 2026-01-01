package pattern.structural.bridge.drawingAPI.concreteAbstraction;

import pattern.structural.bridge.drawingAPI.abstraction.Shape;
import pattern.structural.bridge.drawingAPI.implementation.DrawingAPI;

public class Circle extends Shape {
    private double x;
    private double y;
    private double radius;

    public Circle(DrawingAPI drawingAPI, double x, double y, double radius) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }
}
