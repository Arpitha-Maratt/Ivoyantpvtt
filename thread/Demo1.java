package thread;

class Hi implements  Runnable{
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

class Hello implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();

        Thread thread1 = new Thread(obj);
        Thread thread2 = new Thread(obj2);
////        System.out.println(obj.getPriority());
//        obj2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();

        thread2.start();
    }
}

