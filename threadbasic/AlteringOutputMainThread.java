package threadbasic;

class AlteringOutputMainThread implements Runnable{
    public void run(){
        for(int i =1;i<=5;i++){
            System.out.println("Runnable thread:"+i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        AlteringOutputMainThread obj = new AlteringOutputMainThread();
        Thread t = new Thread(obj);
        t.start();

        for(int i=1;i<=5;i++){
            System.out.println("Main thread"+i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
