package exception;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsException {
    static void readFile(String fileName)throws IOException{
        FileReader fille = new FileReader(fileName);
    }

    public static void main(String[] args) {
        try{
           readFile("test.txt");
        }catch(IOException e){
            System.out.println("File not found "+e.getMessage());
        }
    }
}
