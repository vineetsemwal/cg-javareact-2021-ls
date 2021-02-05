package calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		ICalculator calcy=new IBmCalculator();

		int result1=calcy.add(1, 2);

	}

}
