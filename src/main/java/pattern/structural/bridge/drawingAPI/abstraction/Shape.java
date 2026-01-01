package pattern.structural.bridge.drawingAPI.abstraction;

import pattern.structural.bridge.drawingAPI.implementation.DrawingAPI;

public abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();
}
