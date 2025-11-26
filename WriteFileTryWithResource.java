import java.io.FileWriter;
import java.io.IOException;

public class WriteFileTryWithResource {
    public static void main(String[] args) {
        try(FileWriter obj = new FileWriter("filename.txt")){
            obj.write("Second time file is wrote ");
            System.out.println("Succesfully wrote a file");
        }catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
