import java.io.File;

public class CreateNewFolder {
    public static void main(String[] args) {
        File folder = new File("NewFolder");
        if (folder.mkdir()) {
            System.out.println("Folder is created:" + folder.getName());
        } else {
            System.out.println("Folder already created");
        }
    }
}
