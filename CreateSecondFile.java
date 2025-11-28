import java.io.File;
import java.io.IOException;

public class CreateSecondFile {
    public static void main(String[] args) {
        try {
            File obj = new File("secondFie.txt");
            if(obj.createNewFile()){
            System.out.println("File is created:" + obj.getName());
        }else {
                System.out.println("File already existed");
            }
            }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
            }
    }
}
