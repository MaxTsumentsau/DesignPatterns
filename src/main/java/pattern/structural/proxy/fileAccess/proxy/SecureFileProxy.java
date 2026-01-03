package pattern.structural.proxy.fileAccess.proxy;

import pattern.structural.proxy.fileAccess.commonInterface.FileAccess;
import pattern.structural.proxy.fileAccess.realProject.ReadFileAccess;

public class SecureFileProxy implements FileAccess {
    private ReadFileAccess readFileAccess =new ReadFileAccess();
    private String role;

    public SecureFileProxy(String role) {
        this.role = role;
    }

    @Override
    public void readFile(String filename) {
        if ("ADMIN".equalsIgnoreCase(role)) {
            readFileAccess.readFile(filename);
        } else {
            System.out.println("Access denied!");
        }
    }
}
