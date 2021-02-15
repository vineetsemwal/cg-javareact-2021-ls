package multitthreading.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {

    public static void main(String args[]) throws Exception{
        Callable task1=new CallableTask(10,20);
        Callable task2=new CallableTask(50,70);
        ExecutorService executor= Executors.newCachedThreadPool();
        Future<Integer>future1 =executor.submit(task1);
        Future<Integer>future2=executor.submit(task2);
        Integer result1=future1.get();//blocking method
        Integer result2=future2.get();
        System.out.println("result1 ="+result1 +" result2 ="+result2);
        executor.shutdown();
    }

}
