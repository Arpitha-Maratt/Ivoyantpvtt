import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WriteUsingWriteStringAppend {
    public static void main(String[] args) throws IOException {
        Files.writeString(Path.of("thirdFile.txt"),"\n appended file ", StandardOpenOption.APPEND);
    }
}
