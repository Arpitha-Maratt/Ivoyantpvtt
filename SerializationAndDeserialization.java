import java.io.*;

class Student implements Serializable{
    int id ;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name = name;
    }
}
public class SerializationAndDeserialization {
    public static void main(String[] args) {

        Student s1 = new Student(101,"Arpitha");

        //Serialization

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.user"))){
            oos.writeObject(s1);
            System.out.println("Object serializable successfully");
        }catch (IOException e){
            e.printStackTrace();
        }

        //deserialization

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.user"))){
            Student s2 = (Student) ois.readObject();
            System.out.println("Object Deserialization");
            System.out.println("ID:"+s2.id);
            System.out.println("Name:"+s2.name);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
