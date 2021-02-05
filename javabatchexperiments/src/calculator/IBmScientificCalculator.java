package calculator;

public class IBmScientificCalculator extends IBmCalculator  implements IScientificCalculator{
    @Override
    public double areaSquare(double side) {
        return side*side;
    }
}
