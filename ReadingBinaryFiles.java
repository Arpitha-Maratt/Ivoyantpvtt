import java.io.FileInputStream;
import java.io.IOException;

public class ReadingBinaryFiles {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("flower.jpg")){
            int byteData ;
            while ((byteData = fis.read()) != -1){
                System.out.print(byteData);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
