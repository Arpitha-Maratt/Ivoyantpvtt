import java.io.File;

public class DeleteFile{
    public static void main(String[] args) {

        File myObj =new File("secondFile.txt");
            if(myObj.delete()){
                System.out.println("File deleted:"+myObj.getName());
            }else{
                System.out.println("Failed to delete the file");
            }
    }
}

