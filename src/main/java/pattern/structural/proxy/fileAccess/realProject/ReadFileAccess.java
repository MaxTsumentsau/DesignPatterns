package pattern.structural.proxy.fileAccess.realProject;

import pattern.structural.proxy.fileAccess.commonInterface.FileAccess;

public class ReadFileAccess implements FileAccess {
    @Override
    public void readFile(String filename) {
        System.out.printf("Read file %s%n", filename);
    }
}
