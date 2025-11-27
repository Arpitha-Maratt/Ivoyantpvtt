import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class MoveOrRenameFiles {
    public static void main(String[] args) throws IOException {
        Files.move(Path.of("backup.txt"),Path.of("C:\\Users\\arpit\\OneDrive\\Desktop\\HibernateDemo\\JavaFiles\\NewFolder\\text1.txt"),
                StandardCopyOption.REPLACE_EXISTING);
    }
}
