import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ToReadAFile {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\arpit\\OneDrive\\Desktop\\HibernateDemo\\JavaFiles\\NewFolder\\text.txt");
        try(Scanner myReader = new Scanner(myFile)){
            while(myReader.hasNext()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
