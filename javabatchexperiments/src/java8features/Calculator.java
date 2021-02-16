package java8features;

public class Calculator {

    public static String greet(){
        System.out.println("inside greet");
        return "hello";
    }

    public static String stringMultiplier(String word, int times){
        String result="";
        for (int i=0;i<times;i++){
            result=result+word;
        }
        return result;
    }

    public int add(int a, int b){
        return a+b;
    }

}
