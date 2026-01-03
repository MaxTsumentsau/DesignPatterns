package pattern.structural.proxy.imageViewer.proxy;

import pattern.structural.proxy.imageViewer.commonInterface.Image;
import pattern.structural.proxy.imageViewer.realObject.RealImage;

public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }


    @Override
    public void display() {
        if(realImage==null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
