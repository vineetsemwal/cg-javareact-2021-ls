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
	
	public int sub(int num1, int num2) {
		System.out.println("inside sub");
		return num1-num2;
	}
	
	
	public int subBy10(int number) {
		System.out.println("inside subby10");
		int result=sub(number,10);
		return result;
	}
	
}
