import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WriteFilesUsingFilesAnAppend {
    public static void main(String[] args)throws IOException {
        Path path = Path.of("thirdFile.txt");
        Files.write(path,"Hello using files we are writing and also appending".getBytes(), StandardOpenOption.APPEND);
    }
}
