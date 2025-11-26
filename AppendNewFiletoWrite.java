
import java.io.FileWriter;
import java.io.IOException;

public class AppendNewFiletoWrite {
    public static void main(String[] args) {
        try(FileWriter oj = new FileWriter("C:\\Users\\arpit\\OneDrive\\Desktop\\HibernateDemo\\JavaFiles\\src\\write.txt")){
            oj.write("The new file created and the content is added");
            System.out.println("Successfully file is updated");
        }catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
