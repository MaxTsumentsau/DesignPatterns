package pattern.behavioral.visitor.filesystem.concreteVisitor;

import pattern.behavioral.visitor.filesystem.commonVisitor.FileSystemVisitor;
import pattern.behavioral.visitor.filesystem.unmodifiableObject.Directory;
import pattern.behavioral.visitor.filesystem.unmodifiableObject.File;

public class StructurePrinter implements FileSystemVisitor {
    private String indent = "";

    @Override
    public void visit(File file) {
        System.out.printf("%s File:%s, Size:%dKB %n", indent, file.getName(), file.getSize());
    }

    @Override
    public void visit(Directory directory) {
        System.out.printf("%s Directory: %s%n", indent, directory.getName());
        indent += "   ";
        for (Object child : directory.getChildren()) {
            if (child instanceof File) {
                visit((File) child);
            } else if (child instanceof Directory) {
                visit((Directory) child);
            }
        }
        indent = indent.substring(0, Math.max(0, indent.length() - 2));
    }
}
