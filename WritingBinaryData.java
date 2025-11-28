import java.io.FileOutputStream;
import java.io.IOException;

public class WritingBinaryData {
    public static void main(String[] args) {
        try (FileOutputStream fus = new FileOutputStream("flower.jpg")) {
            fus.write(100);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }