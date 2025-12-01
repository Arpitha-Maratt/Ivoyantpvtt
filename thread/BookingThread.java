package thread;


class TicketCount{
    private int seats =1;

    public synchronized void book(String name){
        System.out.println("Thread running:"+Thread.currentThread().getName());

        if(seats > 0){
            System.out.println(name + "checking availability");

            try{
                Thread.sleep(100);}catch (InterruptedException e){}
            seats--;
            System.out.println(name + "booked the seat");
            } else{
            System.out.println(name+"cannot book ,No seats left");
        }
    }
}

class BookingTask implements Runnable{
    private TicketCount counter;
    private String name;

    public BookingTask(TicketCount counter , String name){
        this.counter=counter;
        this.name=name;
    }
    @Override
    public void run(){
        counter.book(name);
    }
}
public class BookingThread {
    public static void main(String[] args) throws InterruptedException {
        TicketCount counter = new TicketCount();

        Thread firstthread = new Thread(new BookingTask(counter,"Alice"));
        Thread secondThread = new Thread(new BookingTask(counter,"Bob"));

        firstthread.setName("Alice-Thread");
        secondThread.setName("Bob -Thread");

        firstthread.start();
        secondThread.start();

        System.out.println("Is alice thread alive?"+firstthread.isAlive());
        System.out.println("Is bob thread alive?"+secondThread.isAlive());

        firstthread.join();
        secondThread.join();

        System.out.println("Both customers fineshed booking");
        System.out.println("Is alice thread alive now?"+firstthread.isAlive());
        System.out.println("Is bob thread alive now"+secondThread.isAlive());

        counter.book("Alice");
        counter.book("Bob");
    }
}
