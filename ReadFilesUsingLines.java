import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFilesUsingLines {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("filename.txt")).forEach(System.out::println);

    }
}
