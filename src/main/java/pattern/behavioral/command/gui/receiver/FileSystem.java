package pattern.behavioral.command.gui.receiver;

public class FileSystem {
    public void saveFile(){
        System.out.println("File is saving");
    }

    public void openFile(){
        System.out.println("File is opening");
    }

    public void exitApp(){
        System.out.println("App is closing");
    }
}
