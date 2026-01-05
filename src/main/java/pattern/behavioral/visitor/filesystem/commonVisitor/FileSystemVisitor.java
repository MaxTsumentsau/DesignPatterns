package pattern.behavioral.visitor.filesystem.commonVisitor;

import pattern.behavioral.visitor.filesystem.unmodifiableObject.Directory;
import pattern.behavioral.visitor.filesystem.unmodifiableObject.File;

public interface FileSystemVisitor {
    void visit(File file);

    void visit(Directory directory);
}
