package pattern.behavioral.visitor.filesystem;

import pattern.behavioral.visitor.filesystem.concreteVisitor.SizeCalculator;
import pattern.behavioral.visitor.filesystem.concreteVisitor.StructurePrinter;
import pattern.behavioral.visitor.filesystem.unmodifiableObject.Directory;
import pattern.behavioral.visitor.filesystem.unmodifiableObject.File;

public class Runner {
    public static void main(String[] args) {
        Directory directory1 = new Directory("root");
        File file1 = new File("windows.exe", 1024);
        File file2 = new File("readme.txt", 52);
        directory1.add(file1);
        directory1.add(file2);

        Directory directory2 = new Directory("Program Files");
        File file3 = new File("javac.bat", 124);
        File file4 = new File("jdb.txt", 48);
        directory1.add(directory2);
        directory2.add(file3);
        directory2.add(file4);

        SizeCalculator sizeCalculator = new SizeCalculator();
        sizeCalculator.visit(directory1);
        sizeCalculator.getTotalSize();
        sizeCalculator.visit(file1);
        sizeCalculator.getTotalSize();

        StructurePrinter printer = new StructurePrinter();
        printer.visit(file3);
        printer.visit(directory1);
        printer.visit(directory2);
    }
}
