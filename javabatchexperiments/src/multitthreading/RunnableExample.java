package multitthreading;

public class RunnableExample {

    public static void main(String[] args){
        Thread thread1 = new Thread(new RunnableTask("thread1"));
        Thread thread2=new Thread(new RunnableTask("thread2"));
        Thread thread3=new Thread(new RunnableTask("thread3"));
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("main thread finished");
    }
}
