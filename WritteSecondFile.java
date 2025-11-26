import java.io.FileWriter;
import java.io.IOException;

public class WritteSecondFile {
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWriter("secondFile.txt");
            obj.write("Second file is created and we are writing");
            obj.close();
            System.out.println("Succesflly wrote");
        }catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
