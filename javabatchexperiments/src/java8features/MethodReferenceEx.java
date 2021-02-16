package java8features;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferenceEx {

    public static void main(String[] args){
        Supplier<String>supplier=Calculator::greet;
        String msg=supplier.get();
        System.out.println(msg);
        BiFunction<String,Integer,String>greet=Calculator::stringMultiplier;
        String greeting=greet.apply("hello",4);
        System.out.println(greeting);
        Calculator calculator=new Calculator();
        BinaryOperator<Integer>addOperation=calculator::add;
        int result=addOperation.apply(5,7);
        System.out.println(result);
        Consumer<String>consumer=System.out::println;
        consumer.accept("hello");
        Consumer<Integer>intConsumer=System.out::println;
        intConsumer.accept(20);
    }
}
