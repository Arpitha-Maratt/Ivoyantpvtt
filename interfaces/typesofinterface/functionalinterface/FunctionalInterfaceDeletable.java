package interfaces.typesofinterface.functionalinterface;

interface Deletable{
    void delete();
}
public class FunctionalInterfaceDeletable implements Deletable {
    public void delete(){
        System.out.println("Account deleted");
    }
}
