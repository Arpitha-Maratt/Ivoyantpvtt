package executor;

import java.util.concurrent.Executor;

class Invoker implements Executor{
    @Override
    public void execute(Runnable command){
        command.run();
    }
}
public class ExecutorInterface {
    public static void main(String[] args) {

        Executor exe = new Invoker();
        exe.execute(()-> System.out.println("Task is running"));
    }
}

