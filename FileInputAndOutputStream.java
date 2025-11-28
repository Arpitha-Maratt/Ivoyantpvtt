import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputAndOutputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("hubstuff.png");
        FileOutputStream fos = new FileOutputStream("flower.jpg");

        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }
        fis.close();
        fos.close();
    }
}
