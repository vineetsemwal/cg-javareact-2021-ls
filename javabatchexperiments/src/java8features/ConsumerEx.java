package java8features;

import java.util.function.*;

public class ConsumerEx {
    public static void main(String args[]){
        Consumer<String> consumer=(arg)->System.out.println(arg);
        BiConsumer<String,Integer>biConsumer=(str,num) ->System.out.println("string is "+str +" number is "+num);
      //  biConsumer.accept("hello",10);
    }

    public void print(String msg){
        System.out.println(msg);
    }
}
