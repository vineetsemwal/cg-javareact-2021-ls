package multitthreading.producerconsumer;

public class ProducerConsumerMain {

    public static void main(String args[]){
        ProduceConsume resource=new ProduceConsume();
        ProducerTask producerTask=new ProducerTask(resource);
        Thread producerThread=new Thread(producerTask);
        ConsumerTask consumerTask=new ConsumerTask(resource);
        Thread consumerThread=new Thread(consumerTask);
        producerThread.start();
        consumerThread.start();
    }
}
