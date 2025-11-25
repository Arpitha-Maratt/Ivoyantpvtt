package interfaces.typesofinterface.functionalinterface;

interface Writable{
    void write(String txt);
}
public class FuncationalInterfaceWritable implements Writable {
    public void write(String txt)
    {
        System.out.println(txt);
    }

    public static void main(String[] args) {
        FuncationalInterfaceWritable obj = new FuncationalInterfaceWritable();
        obj.write("I am Arpitha.S");
    }

}
