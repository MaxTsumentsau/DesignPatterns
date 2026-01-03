package pattern.structural.proxy.imageViewer;

import pattern.structural.proxy.imageViewer.commonInterface.Image;
import pattern.structural.proxy.imageViewer.proxy.ProxyImage;

public class Runner {
    public static void main(String[] args) {
        Image image = new ProxyImage("SomeFile.png");
        image.display();
        image.display();
    }
}
