import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFileUsingWriteString {
    public static void main(String[] args) throws IOException {
        Files.writeString(Path.of("thirdFile.txt"),"\n write a line using writeString");
        System.out.println("File is wrote");
    }
}
