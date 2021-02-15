package java8dfeatures;

public class CalculatorMain {

    public static void main(String[] args){
        ISub subtract=new ISub(){
            @Override
            public int sub(int num1, int num2) {
                return num1-num2;
            }

        };

        int result= subtract.sub(5,3);
        System.out.println("sub result="+result);


    }

}
