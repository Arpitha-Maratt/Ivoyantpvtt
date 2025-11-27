import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class ReadFileUsingBufferReader {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("filename.txt"));
            String line;

            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
