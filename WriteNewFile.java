import java.io.FileWriter;
import java.io.IOException;

public class WriteNewFile {
    public static void main(String[] args) {
        try{
            FileWriter write = new FileWriter("C:\\Users\\arpit\\OneDrive\\Desktop\\HibernateDemo\\JavaFiles\\NewFolder\\text.txt");
            write.write("the write operation is done using FileWriter");
            write.close();
        }catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
