package pattern.structural.proxy.fileAccess;

import pattern.structural.proxy.fileAccess.commonInterface.FileAccess;
import pattern.structural.proxy.fileAccess.proxy.SecureFileProxy;

public class Runner {
    public static void main(String[] args) {
        FileAccess access1 = new SecureFileProxy("USER");
        access1.readFile("secret.txt");

        FileAccess access2 = new SecureFileProxy("ADMIN");
        access2.readFile("secret.txt");
    }
}
