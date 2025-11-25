package interfaces.typesofinterface.functionalinterface;

interface Readable{
    void read();
}
public class FunctionalInterfaceReadable implements Readable {
    public void read(){
        System.out.println("Reading a book");
    }

    public static void main(String[] args) {
        FunctionalInterfaceReadable b = new FunctionalInterfaceReadable();
        b.read();
    }
}
