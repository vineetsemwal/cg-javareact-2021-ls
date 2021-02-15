package multitthreading.executors;

import multitthreading.RunnableTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsEx {
    public static void main(String args[]) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Runnable task1 = new RunnableTask("task1");
        Runnable task2 = new RunnableTask("task2");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.shutdown();
    }
}
