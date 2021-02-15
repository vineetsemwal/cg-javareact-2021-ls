package multitthreading;

public class GreetingBeautifierEx {
    //
    //  (good morning) (good morning)
    //
    public static void main(String[] args){
        BeautifulGreeting sharedResource=new BeautifulGreeting("good morning");
        Thread thread1=new Thread(new BeautifulTask(sharedResource));
        Thread thread2=new Thread(new BeautifulTask(sharedResource));
        thread1.start();
        thread2.start();
    }
}
