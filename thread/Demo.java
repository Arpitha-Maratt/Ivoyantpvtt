package thread;

class A extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("hello");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        A obj = new A();
        B obj2 = new B();

////        System.out.println(obj.getPriority());
//        obj2.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        Thread.sleep(10);
        obj2.start();
    }
}
