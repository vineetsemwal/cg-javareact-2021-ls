package java8dfeatures;

public class Calculator implements ICalculator{
    @Override
    public int add(int num1, int num2){
        return num1+num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1-num2;
    }
}
