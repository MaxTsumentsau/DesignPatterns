package pattern.behavioral.visitor.filesystem.concreteVisitor;

import pattern.behavioral.visitor.filesystem.commonVisitor.FileSystemVisitor;
import pattern.behavioral.visitor.filesystem.unmodifiableObject.Directory;
import pattern.behavioral.visitor.filesystem.unmodifiableObject.File;

public class SizeCalculator implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        for (Object child : directory.getChildren()) {
            if (child instanceof File) {
                totalSize += ((File) child).getSize();
            } else if (child instanceof Directory) {
                visit((Directory) child);
            }
        }
    }

    public void getTotalSize() {
        System.out.println("TotalSize: " + totalSize);
        totalSize = 0;
    }
}
