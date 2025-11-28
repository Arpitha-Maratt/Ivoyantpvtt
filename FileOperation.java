import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileOperation {
    private String filPath;

    public FileOperation(String filPath){
        this.filPath=filPath;
    }

    //create file

    public void createFile()throws IOException{
        File file = new File(filPath);
        if(file.createNewFile()){
            System.out.println("File created:"+file.getName());
        }else{
            System.out.println("File already exists");
        }
    }

    //Write text

    public void writeFile(String content,boolean append) throws IOException{
        try(FileWriter fw = new FileWriter(filPath,append)){
            fw.write(content + "\n");
        }
        System.out.println("Comtent written to file");
    }

    //Read text file

    public void readFile() throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(filPath))){
            String line;

            System.out.println("File content:");
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
    }

    //delete file

    public void deleteFile(){
        File file = new File(filPath);
        if(file.delete()){
            System.out.println("File is deleted successfully");
        }else{
            System.out.println("Failed to delete file");
        }
    }

    //copy file

    public void copyFile(String destPath) throws IOException{
        Files.copy(Path.of(filPath),Path.of(destPath), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied to :"+destPath);
    }

    //Rename/Replace file

    public void rename(String newName){
        File file = new File(filPath);
        File newFile = new File(newName);

        if(file.renameTo(newFile)){
            System.out.println("File renamed to "+ newName);
            filPath = newName;
        }else{
            System.out.println("Failed to rename");
        }
    }

    // read Binary file

    public void readBinary() throws IOException{
        try(FileInputStream fis = new FileInputStream(filPath)){
            int data;
            System.out.println("Binary file content:");
            while((data = fis.read())!= -1){
                System.out.println(data +" ");
            }
            System.out.println();
        }
    }

    // read csv file

    public void readCSV() throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(filPath))){

            String line;
            System.out.println("CSV content");
            while((line = br.readLine()) != null){
                String[] values = line.split(",");
                for(String v : values){
                    System.out.println(v + "|");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path");
        String path = sc.nextLine();

        FileOperation file = new FileOperation(path);

//        file.createFile();
//        file.writeFile("Hello , this is test",true);
//        file.readFile();

//        // binary read file
//        file.readBinary();
//
//        //csv file
//        file.readCSV();
//
//        //copy
//        file.copyFile("copy.txt");
//        file.rename("rename.txt");
        file.deleteFile();
    }

}
