package calculator;

public class CasioScientificCalculator extends CasioCalculator implements IScientificCalculator{

	
    @Override
    public double areaSquare(double side) {
        return side*side;
    }
}
