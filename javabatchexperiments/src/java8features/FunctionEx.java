package java8features;

import java.util.function.*;

public class FunctionEx {

    public static void main (String args[]){
        Function<String,Integer> func=(arg) ->arg.length();
        BiFunction<String,Integer, String>bifunc=(str,num)-> {
            StringBuilder builder=new StringBuilder();
            for(int i=0;i<num;i++){
                builder.append(str);
            }
            return builder.toString();
        };
    }
}
