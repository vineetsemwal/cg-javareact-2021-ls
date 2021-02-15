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
        IGreet lambdaInline=(arg)->System.out.println(arg);
        lambdaInline.greet("lamba inline expression");

        IGreet lambdaBlock=(msg)->{
            System.out.println(msg);
        };
        lambdaBlock.greet("lambda block");

    }
}
