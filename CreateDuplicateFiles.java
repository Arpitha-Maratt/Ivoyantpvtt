import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateDuplicateFiles {
    public static void main(String[] args) throws IOException {
        Files.copy(Path.of("filename.txt"),Path.of("backup.txt"));
    }
}
