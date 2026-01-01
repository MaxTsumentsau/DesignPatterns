package pattern.structural.bridge.drawingAPI.concreteImplementation;

import pattern.structural.bridge.drawingAPI.implementation.DrawingAPI;

public class DirectXAPI implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("Drawing circle in DirectX: center(%.5f, %.5f), with radius: %.5f%n", x, y, radius);
    }
}
