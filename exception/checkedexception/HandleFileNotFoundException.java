package exception.checkedexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandleFileNotFoundException {
    public static void main(String[] args) {

        // Getting the cuurent root directory
        String root = System.getProperty("user.dir");
        System.out.println("Current root dirctory:"+root);

        // add file
        String path = root +"\\message.txt";
        System.out.println("File path"+path);


        //reading file path
        try{
            FileReader f = new FileReader(path);

            BufferedReader b = new BufferedReader(f);

            for(int counter = 0 ; counter < 3;counter++)
                System.out.println(b.readLine());

            f.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found"+ e.getMessage());
        }catch (IOException e){
            System.out.println("An I/O eror occured "+e.getMessage());
        }
    }
}
