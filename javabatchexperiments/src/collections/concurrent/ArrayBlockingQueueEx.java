package collections.concurrent;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {

    public static void main(String[] args) throws InterruptedException{
        ArrayBlockingQueue<Integer>list=new ArrayBlockingQueue<>(2);
     // list.add(10);
       // list.put(20);
        Integer element=list.take();
       System.out.println(element+" current Q "+list);
    }
}
