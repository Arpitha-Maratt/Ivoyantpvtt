import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateDirectory {
    public static void main(String[] args) throws IOException {
        Files.createDirectories(Path.of("NewDirectory"));
    }
}
