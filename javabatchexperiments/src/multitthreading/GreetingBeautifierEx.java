package multitthreading;

public class GreetingBeautifierEx {
    //
    //  (good morning) (good morning)
    //
    public static void main(String[] args){
        BeautifulGreeting greeting=new BeautifulGreeting("good morning");
        Thread thread1=new Thread(new BeautifulTask(greeting));
        Thread thread2=new Thread(new BeautifulTask(greeting));
        thread1.start();
        thread2.start();
    }
}
