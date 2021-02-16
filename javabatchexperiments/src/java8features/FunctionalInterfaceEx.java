package java8features;

import  java.util.function.*;

public class FunctionalInterfaceEx {
    public static void main(String[]  args){
        IGreet anonymous=new IGreet(){
            @Override
            public void greet(String msg) {
              System.out.println(msg);
            }
        };
        anonymous.greet("anoymous");

        //inline lambda expression
        IGreet lambdaInline=(msg)->System.out.println(msg);
        lambdaInline.greet("lamba inline expression");

        IGreet lambdaBlock=(msg)->{
            System.out.println(msg);
        };
        lambdaBlock.greet("lambda block");

        Consumer<String>lambdaInline2=(msg)->System.out.println(msg);
        lambdaInline2.accept("hello lambda inline");

        IGreetWithName biconsumerInline=(name, msg) ->System.out.println("greeting for "+name +" is "+ msg);
        IGreetWithName biconsumerBlock=(name,msg)->{
            System.out.println("greeting for "+name +" is "+ msg);
        };
        biconsumerInline.greet("arpit", "hello");
        biconsumerBlock.greet("abeer", "hi");

        BiConsumer<String,String>biconsumerInline2=(name,msg)->System.out.println("greeting for "+name +" is "+ msg);
        biconsumerInline2.accept("surya","hello");

        IGreetSupplier supplierInline=()->"hello";
        String msg1=supplierInline.greet();
        System.out.println("msg is "+msg1);
        IGreetSupplier supplierBlock=()->{
          return "hi";
        };
        String msg2=supplierBlock.greet();
        System.out.println("msg is "+msg2);
        Supplier<String>supplierInline2=()->"hi";
         String msg3=supplierInline2.get();
        System.out.println("msg is "+msg3);

        ISquare squareInline=(number)->number*number;
        int squareResult=squareInline.square(10);
        System.out.println("square result="+squareResult);
        Function<Integer,Integer>squareInline2=(number)->number*number;
        int squareResult2=squareInline2.apply(8);
        System.out.println("square result ="+squareResult2);

        IStringMultiplier biFunction=(str,times)->{
           String result="";
            for (int i=0;i<times;i++){
                result=result+str;
            }
            return result;
        };

       String biResult= biFunction.multiply("rohit",3);
       System.out.println("bifunction Result="+biResult);

       BiFunction<String,Integer,String>biFucntion2=(str,times)->{
           String result="";
           for (int i=0;i<times;i++){
               result=result+str;
           }
           return result;
       };
       String biResult2=biFucntion2.apply("vijay",4);
       System.out.println("bifunction Result="+biResult2);

       IEven even=(num)->num%2==0;
      boolean isEven1= even.isEven(10);
      Predicate<Integer>predicate=(num)->num%2==0;
      boolean isEven2=predicate.test(10);
      System.out.println("is even="+isEven2);
      BiPredicate<Integer,Integer>biPredicate=(num1,num2)->(num1+num2)%2==0;
      boolean isSumEven=biPredicate.test(5,7);
      System.out.println("is sum even="+isSumEven);

      UnaryOperator<Integer>unaryOperator=(number)->number*number;
      int operatorResult=unaryOperator.apply(10);
      BinaryOperator<Integer>binaryOperator=(num1,num2)->num1+num2;
      int binaryOperatorResult=binaryOperator.apply(2,5);
      System.out.println("unary operator result="+operatorResult);
      System.out.println("binary operator result="+binaryOperatorResult);
    }
}
