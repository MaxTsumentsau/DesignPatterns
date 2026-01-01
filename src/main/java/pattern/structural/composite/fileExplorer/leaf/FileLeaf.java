package pattern.structural.composite.fileExplorer.leaf;

import pattern.structural.composite.fileExplorer.commonInterface.FileComponent;

public class FileLeaf implements FileComponent {
    private String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
