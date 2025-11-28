import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadSecondFile {
    public static void main(String[] args) {
        File obj = new File("secondFile.txt");

        try(Scanner myObj = new Scanner(obj)){
            while(myObj.hasNext()){
                String data = myObj.nextLine();
                System.out.println(data);
            }
        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}