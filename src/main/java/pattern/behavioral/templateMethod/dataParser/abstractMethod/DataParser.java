package pattern.behavioral.templateMethod.dataParser.abstractMethod;

public abstract class DataParser {
    public final void parseFile(String file) {
        openFile(file);
        readData();
        processData();
        closeFile();
    }

    private void openFile(String file) {
        System.out.printf("Opening the file: %s%n", file);
    }

    private void closeFile() {
        System.out.println("Closing file");
    }

    protected abstract void readData();

    protected abstract void processData();
}
