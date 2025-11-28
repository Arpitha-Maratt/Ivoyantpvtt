import java.io.IOException;
import java.io.ObjectOutput;

class Students extends ExternalSerialization {
    String name;
    int age;

    public void writeExternal(ObjectOutput out) throws IOException{
        out.writeUTF(name);
        out.writeInt(age);
    }
}

public class ExternalSerialization  {
    public static void main(String[] args) {


    }
}
