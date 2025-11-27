import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreatemultipleDirecetoriesUsingFiles {
    public static void main(String[] args)  throws IOException {
        Files.createDirectories(Path.of("A1/B1/C1"));
    }
}
