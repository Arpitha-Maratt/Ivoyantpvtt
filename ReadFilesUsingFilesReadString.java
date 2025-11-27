import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFilesUsingFilesReadString {
    public static void main(String[] args) {
        try {
            Files.readString(Path.of("filename.txt"));
            System.out.println("File has been read");
        }catch (IOException e){
            System.out.println("I/O error:"+e.getMessage());
        }
    }
}
