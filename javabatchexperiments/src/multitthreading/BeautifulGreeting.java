package multitthreading;

public class BeautifulGreeting {

    private String greeting;

    public BeautifulGreeting(String greet) {
        this.greeting = greet;
    }

      synchronized public void greet() {
        try {
            System.out.print("(");
            System.out.print(greeting);
            Thread.sleep(200);
            System.out.print(")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
