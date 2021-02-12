package multitthreading;

public class BeautifulTask implements Runnable {
    private BeautifulGreeting greeting;

    public BeautifulTask(BeautifulGreeting greeting) {
        this.greeting = greeting;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                greeting.greet();
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
