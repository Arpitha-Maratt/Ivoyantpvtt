import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("data.csv"));

        String line;
        while((line = br.readLine()) != null){
            String[] values = line.split(",");
            System.out.println(values[0]+"-"+values[1]+"-"+values[3]);
        }
        br.close();
    }
}
