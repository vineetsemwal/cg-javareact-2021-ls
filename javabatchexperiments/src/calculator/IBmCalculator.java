package calculator;

public class IBmCalculator implements ICalculator,IMarkerInterface{


    @Override
    public int add(int num1, int num2) {
        return num1 +num2;
    }
    
    
}
