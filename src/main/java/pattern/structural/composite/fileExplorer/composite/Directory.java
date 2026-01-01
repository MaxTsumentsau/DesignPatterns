package pattern.structural.composite.fileExplorer.composite;

import pattern.structural.composite.fileExplorer.commonInterface.FileComponent;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponent {
    private String name;
    private List<FileComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileComponent child : children) {
            child.showDetails();
        }
    }
}
