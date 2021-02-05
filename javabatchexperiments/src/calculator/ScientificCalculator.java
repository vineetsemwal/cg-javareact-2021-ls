package calculator;

public class ScientificCalculator implements ICalculator{

    @Override
   public int add(int num1, int num2) {
        int sum=num1-num2;
        return sum;
    }

   public double areaSquare(double side){
        return side*side;
    }

}
