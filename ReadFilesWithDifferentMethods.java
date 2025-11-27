import java.io.File;

public class ReadFilesWithDifferentMethods {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");

        if(myObj.exists()){
            System.out.println("File name:"+myObj.getName());
            System.out.println("Absolute path"+myObj.getAbsolutePath());
            System.out.println("Writeable:"+myObj.canWrite());
            System.out.println("Readable:"+myObj.canRead());
            System.out.println("File size:"+ myObj.length());
            System.out.println("Last modified:"+myObj.lastModified());
            System.out.println("list of the file:"+myObj.list());
        }
    }
}
