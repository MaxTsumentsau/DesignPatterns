package pattern.structural.bridge.drawingAPI;

import pattern.structural.bridge.drawingAPI.abstraction.Shape;
import pattern.structural.bridge.drawingAPI.concreteAbstraction.Circle;
import pattern.structural.bridge.drawingAPI.concreteImplementation.DirectXAPI;
import pattern.structural.bridge.drawingAPI.concreteImplementation.OpenGLAPI;

public class Runner {
    public static void main(String[] args) {
        Shape circle1 = new Circle(new OpenGLAPI(),3.444, 15.154, 10.50);
        Shape circle2 = new Circle(new DirectXAPI(),3.444, 15.154, 10.50);

        circle1.draw();
        circle2.draw();
    }
}
