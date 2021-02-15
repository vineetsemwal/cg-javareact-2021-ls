package multitthreading.producerconsumer;

public class ConsumerTask implements Runnable{

    private ProduceConsume resource;

    public ConsumerTask(ProduceConsume resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                resource.consume();
                Thread.sleep(1000);
            }
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
