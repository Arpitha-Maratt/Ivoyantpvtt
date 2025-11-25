package interfaces.typesofinterface.functionalinterface;

interface Printable{
    void print();
}
public class FunctionalInterfacePrintable {
    public void print(){
        System.out.println("Printing document..");
    }

    public static void main(String[] args) {
        FunctionalInterfacePrintable p = new FunctionalInterfacePrintable();
        p.print();
    }
}
