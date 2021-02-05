
public class CalculatcorMain {

	public static void main(StringExperiment[] args) {
		Calculator calcy=new Calculator();
        int result1=calcy.add(1, 2, 3);
        int result2=calcy.add(4, 5);
        double result3=calcy.add(5,9);
        StringExperiment concat=calcy.add("hello", "world");
	}

}
