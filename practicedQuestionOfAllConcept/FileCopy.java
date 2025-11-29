package practicedQuestionOfAllConcept;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "copy.txt";
        String destinationFile ="filename.txt";

        int charCount =0;
        int lineCount = 0;

        try{
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));

            String line;
            while((line = reader.readLine()) != null){
                lineCount++;
                charCount +=lineCount;

                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();

            System.out.println("File copied");
            System.out.println("Rotal lines:"+lineCount);
            System.out.println("Total characters count:"+charCount);
        }catch (IOException e){
            System.out.println("Error occured:"+e.getMessage());
        }
    }
}
