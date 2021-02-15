package java8dfeatures;

public class CalculatorMain {

    public static void main(String[] args){
        ICalculator calculator=new ICalculator(){
            @Override
            public int sub(int num1, int num2) {
                return num1-num2;
            }
        };

       int result= calculator.sub(5,3);
        System.out.println("sub result="+result);
        int addResult=calculator.add(5,6);
        System.out.println("add result="+addResult);
    }

}
