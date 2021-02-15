package multitthreading.producerconsumer;

public class ProduceConsume {
    private int i;
    private boolean produced;

    synchronized public void produce() {
        try {
            if(produced){
                wait();
            }
            i++;
            System.out.println("produced " + i);
             Thread.sleep(100);
             produced=true;
             notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void consume() {
        try {
            if(!produced){
                wait();
            }
            System.out.println("consumed" + i);
            Thread.sleep(1000);
            produced=false;
            notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
