package java8dfeatures;

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

        IGreetWithName biconsumerInline=(name, msg) ->System.out.println("greeting for "+name +" is "+ msg);
        IGreetWithName biconsumerBlock=(name,msg)->{
            System.out.println("greeting for "+name +" is "+ msg);
        };
        biconsumerInline.greet("arpit", "hello");
        biconsumerBlock.greet("abeer", "hi");


        IGreetSupplier supplierInline=()->"hello";
        String msg1=supplierInline.greet();
        System.out.println("msg is "+msg1);
        IGreetSupplier supplierBlock=()->{
          return "hi";
        };
        String msg2=supplierBlock.greet();
        System.out.println("msg is "+msg2);

    }
}
