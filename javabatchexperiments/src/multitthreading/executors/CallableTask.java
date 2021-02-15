package multitthreading.executors;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer> {

    private int num1,num2;

    public CallableTask(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }


    @Override
    public Integer call() throws Exception {
        int result =num1+num2;
        Thread.sleep(1000);
        return result;
    }
}
