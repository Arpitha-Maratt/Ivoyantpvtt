package interfaces.typesofinterface.markerinterface;

class abc implements Cloneable{
    int x;
    String y;

    // constractor

    public abc(int x,String y){
        this.x=x;
        this.y = y;
    }

    protected Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }
}
public class CloneableInterface {
    public static void main(String[] args)
        throws CloneNotSupportedException
        {
            abc p = new abc(10,"We are Reading book");
            abc q = (abc)p.clone();

            System.out.println(q.x);
            System.out.println(q.y);
        }
    }
