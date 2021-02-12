package multitthreading;

public class RunnableExample {

    public static void main(String[] args)throws InterruptedException{
        Thread thread1 = new Thread(new RunnableTask("thread1"));
        Thread thread2=new Thread(new RunnableTask("thread2"));
        Thread thread3=new Thread(new RunnableTask("thread3"));
        thread1.start();
        thread2.start();
        thread3.start();
        boolean isT1Alvie=thread1.isAlive();
        boolean isT2Alive= thread2.isAlive();
        boolean isT3Alive=thread3.isAlive();
        System.out.println( "t1 alive="+isT1Alvie+" t2 alive="+isT2Alive+" t3 alive "+isT3Alive);
        thread1.join();
        thread2.join();
        thread3.join();
        isT1Alvie=thread1.isAlive();
        isT2Alive= thread2.isAlive();
        isT3Alive=thread3.isAlive();
        System.out.println( "t1 alive="+isT1Alvie+" t2 alive="+isT2Alive+" t3 alive "+isT3Alive);

        System.out.println("main thread finished");

    }
}
