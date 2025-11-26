import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Java file concept some what tricky");
            myWriter.close();
            System.out.println("Succesfully wrote the file");
        }catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
