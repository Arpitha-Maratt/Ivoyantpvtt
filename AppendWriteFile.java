import java.io.FileWriter;
import java.io.IOException;

public class AppendWriteFile {
    public static void main(String[] args) {
        try(FileWriter obj = new FileWriter("filename.txt",true)){
            obj.write("\nTo write extra content i used append file here we should use two argumnaet in constructor filename with true it will appedn the file ");
            System.out.println("Successfully append the file");
        } catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
