package multitthreading;

public class BeautifulGreeting implements Runnable{

    private String greeting;

    public BeautifulGreeting(String greet){
        this.greeting=greet;
    }

    @Override
    public void run() {
      try {
          for (int i = 0; i < 3; i++) {
              System.out.print("(");
              System.out.print(greeting);
              Thread.sleep(200);
              System.out.print(")");
          }
      }catch(Exception e){
          e.printStackTrace();
      }
    }
}
