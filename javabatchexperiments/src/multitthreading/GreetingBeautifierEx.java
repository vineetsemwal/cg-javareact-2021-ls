package multitthreading;

public class GreetingBeautifierEx {
    //
    //  (good)(morning)
    //
    public static void main(String[] args){
        Thread thread1=new Thread(new BeautifulGreeting("good"));
        Thread thread2=new Thread(new BeautifulGreeting("morning"));
        thread1.start();
        thread2.start();
    }
}
