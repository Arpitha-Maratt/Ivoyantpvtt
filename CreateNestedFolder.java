import java.io.File;

public class CreateNestedFolder {
    public static void main(String[] args) {
        File nestedFolder = new File("A/B/C");
        nestedFolder.mkdirs();
        System.out.println("Created nested folder: "+nestedFolder.getName());
    }
}
