import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadUsingFilesAndDisplayIt {
    public static void main(String[] args) throws IOException {
        String data = Files.readString(Path.of("filename.txt"));
        System.out.println(data);
    }
}
