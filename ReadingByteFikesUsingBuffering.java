import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingByteFikesUsingBuffering {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("flower.jpg");
        FileOutputStream fos = new FileOutputStream("fowerCopy.jpg")){
            byte[] buffer = new byte[1024];
            int bytesReads;
            while((bytesReads= fis.read(buffer)) != -1){
                fos.write(buffer,0,bytesReads);
            }
            System.out.println("File copied succesfully");
        }catch (IOException e){
            e.printStackTrace();
        }
        }

}
