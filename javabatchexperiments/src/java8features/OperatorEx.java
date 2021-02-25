package java8features;

import  java.util.function.*;
public class OperatorEx {

    public static void main(String args[]){
        UnaryOperator<Integer>unary=(arg)->arg+1;
        BinaryOperator<Integer>binary=(arg1,arg2)->arg1+arg2;
        BiFunction<Integer,Integer,Integer>bifun=(arg1,arg2)->arg1+arg2;
    }
}
