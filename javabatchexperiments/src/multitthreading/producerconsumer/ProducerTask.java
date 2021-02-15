package multitthreading.producerconsumer;

public class ProducerTask implements Runnable {
    private ProduceConsume resource;

    public ProducerTask(ProduceConsume resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                resource.produce();
                Thread.sleep(100);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
