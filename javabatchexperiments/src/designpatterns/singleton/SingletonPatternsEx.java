package designpatterns.singleton;

public class SingletonPatternsEx {

    public static void main(String[] args){
      StoreHolder storeHolder1=StoreHolder.getInstance();
      StoreHolder storeHolder2=StoreHolder.getInstance();
      System.out.println("same object="+(storeHolder1==storeHolder2));
    }
}
