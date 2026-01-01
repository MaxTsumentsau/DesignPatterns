package pattern.structural.composite.fileExplorer;

import pattern.structural.composite.fileExplorer.composite.Directory;
import pattern.structural.composite.fileExplorer.leaf.FileLeaf;

public class Runner {
    public static void main(String[] args) {
        FileLeaf leaf1 = new FileLeaf("javac.exe");
        FileLeaf leaf2 = new FileLeaf("Debugger.bat");

        Directory directory1 = new Directory("Java 21");
        directory1.add(leaf1);
        directory1.add(leaf2);
        Directory directory2 = new Directory("ProgramFiles");
        directory2.add(directory1);

        directory2.showDetails();
    }
}
