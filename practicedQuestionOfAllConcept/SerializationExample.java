package practicedQuestionOfAllConcept;

import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }

}
public class SerializationExample{
    public static void main(String[] args) {
        Student s1 = new Student(101,"Arpitha");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))){
            oos.writeObject(s1);
            System.out.println("Object serialized successfully");
        }catch (IOException e){
            e.printStackTrace();
        }

        // deserailaztion

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))){
            Student s2 = (Student) ois.readObject();
            System.out.println("Object deserialized");
            System.out.println("ID :"+s2.id);
            System.out.println("Name:"+s2.name);
           ois.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
