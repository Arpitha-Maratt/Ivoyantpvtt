package interfaces.typesofinterface.functionalinterface;

interface Updatable{
    public void update();
}
public class FunctionalInterfaceUpdatable implements Updatable {
    public void update(){
        System.out.println("Profile is updated");
    }

    public static void main(String[] args) {
        FunctionalInterfaceUpdatable u = new FunctionalInterfaceUpdatable();
        u.update();
    }
}
