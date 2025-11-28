import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\arpit\\OneDrive\\Desktop\\HibernateDemo\\JavaFiles\\src\\Test");

        if(obj.delete()){
            System.out.println("Test folder is deleted"+obj.getName());
        }else{
            System.out.println("Failed to delete folder");
        }
    }
}
