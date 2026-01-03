package pattern.structural.proxy.imageViewer.realObject;

import pattern.structural.proxy.imageViewer.commonInterface.Image;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisc();
    }

    private void loadFromDisc() {
        System.out.printf("Load image %s%n", filename);
    }

    @Override
    public void display() {
        System.out.printf("Show image %s%n", filename);
    }
}
