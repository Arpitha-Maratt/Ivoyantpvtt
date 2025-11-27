import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFileUsingFiles {
    public static void main(String[] args) throws IOException {
        Files.deleteIfExists(Path.of("C:\\Users\\arpit\\OneDrive\\Desktop\\HibernateDemo\\JavaFiles\\NewFolder\\text.txt"));
    }
}
