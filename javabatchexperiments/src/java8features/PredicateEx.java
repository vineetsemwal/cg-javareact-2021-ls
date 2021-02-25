package java8features;

import java.util.function.*;

public class PredicateEx {

    public static void main(String args[]){
        Predicate<Integer>predicate=(num)->num%2==0;
        //concat string as many times and return length is even or not
        BiPredicate<String,Integer>biPredicate=(str,num)->{
            StringBuilder builder =new StringBuilder();
            for(int i=0;i<num;i++){
                builder.append(str);
            }
           return builder.toString().length()%2==0;
        };

    }
}
