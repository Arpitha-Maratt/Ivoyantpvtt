import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileUsingBufferWriter {
    public static void main(String[] args) {
        try{
        BufferedWriter bw = new BufferedWriter(new FileWriter("thirdFile.txt",true));
        bw.write("Appending new line");
            System.out.println("file is wrote");
        bw.close();
    }catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
}
    }