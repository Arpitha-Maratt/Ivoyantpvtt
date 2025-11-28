import java.io.*;

class Student1 implements Externalizable {
    int id;
    String name;

    // ✅ Mandatory public no-arg constructor
    public Student1() {
    }

    // Parameterized constructor for creating object normally
    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeUTF(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException {
        id = in.readInt();
        name = in.readUTF();
    }

    @Override
    public String toString() {
        return "Student1{id=" + id + ", name='" + name + "'}";
    }
}


public class ExternalSerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student1 s1 = new Student1(101, "Arpitha"); // Use parameterized constructor

// Serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student_ext.ser"));
        oos.writeObject(s1);
        oos.close();

// Deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student_ext.ser"));
        Student1 s2 = (Student1) ois.readObject(); // JVM uses no-arg constructor internally
        ois.close();

        System.out.println(s2);

    }
}
