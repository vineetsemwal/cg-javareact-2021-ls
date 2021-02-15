package java8dfeatures;

public interface ICalculator {

    default int add(int a, int b){
        return a+b;
    }

    int sub (int num1, int num2);
}
