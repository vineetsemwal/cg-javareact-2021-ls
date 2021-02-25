package java8features;

import java.util.function.Supplier;

public class SupplierEx2 {
    public static void main(String[]  args){
        Supplier<String> supplier=new Supplier(){
            @Override
            public String get() {
                return "hello";
            }
        };

        Supplier<String>supplier2=() ->"hello";
        Supplier<String>supplier3=()->{
          return "hello";
        };
    }
}
