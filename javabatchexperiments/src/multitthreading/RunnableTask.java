package multitthreading;

public class RunnableTask implements Runnable{

    private String name;
    public RunnableTask(String name){
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println( name+ "-" + i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
