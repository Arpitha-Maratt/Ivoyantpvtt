import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class DuplicateFileReplaceifItExistes {
    public static void main(String[] args) throws IOException {
        Files.copy(Path.of("thirdFile.txt"),Path.of("text.txt"), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File duplicted and replaced");
    }
}
