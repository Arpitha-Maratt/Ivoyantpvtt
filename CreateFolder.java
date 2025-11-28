import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        File folder = new File("MyFolder");
        folder.mkdir();
        System.out.println("Folder is created"+folder.getName());
    }
}
