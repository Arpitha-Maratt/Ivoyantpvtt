import java.io.File;
import java.io.IOException;

public class CreateFileInSpectificFolder {
    public static void main(String[] args) {
        try {
            File obj = new File("C:\\Users\\arpit\\OneDrive\\Desktop\\HibernateDemo\\JavaFiles\\src\\thirdFile.txt");
            if (obj.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File already existed");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
