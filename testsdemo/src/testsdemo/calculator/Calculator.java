package testsdemo.calculator;

public class Calculator {

	private Adder adder;

	public void setAdder(Adder adder){
		this.adder=adder;
	}


	public boolean isEven(int num) {
		return num%2==0;
	}
	
	public int addBy10(int num) {
		System.out.println("inside add by 10");
      int result=adder.add(num,10);
      return result;
	}
	
}
