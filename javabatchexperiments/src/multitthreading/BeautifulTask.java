package multitthreading;

public class BeautifulTask implements Runnable {
    private BeautifulGreeting greeting;

    public BeautifulTask(BeautifulGreeting greeting) {
        this.greeting = greeting;
    }

    @Override
    public void run() {
        for(int i=0;i<3;i++) {
            greeting.greet();
        }
    }
}
