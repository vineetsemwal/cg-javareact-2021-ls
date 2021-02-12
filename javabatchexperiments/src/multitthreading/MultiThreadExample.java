package multitthreading;

public class MultiThreadExample {

    public static void main(String args[]){
        Thread thread1=new ThreadTask("thread1");
        Thread thread2 = new ThreadTask("thread2");
        Thread thread3=new ThreadTask("thread3");
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("main thread");
    }
}
