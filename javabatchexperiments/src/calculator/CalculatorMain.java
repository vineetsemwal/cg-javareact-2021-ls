package calculator;

public class CalculatorMain {


	public static void main(String[] args) {
		ICalculator calcy=new CasioCalculator();
		int result1=calcy.add(1, 2);
        int result2=calcy.add(3,4);


	}

}
