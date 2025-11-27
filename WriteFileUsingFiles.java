import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFileUsingFiles {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("thirdFile.txt");
        Files.write(path,"Hello using files we are writing".getBytes());

    }
}
