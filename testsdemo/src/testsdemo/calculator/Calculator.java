package testsdemo.calculator;

public class Calculator {

	public int add(int a, int b) {
		return a+b;
	}
	
	public boolean isEven(int num) {
		return num%2==0;
	}
	
	public int addBy10(int num) {
      int result=add(num,10);
      return result;
	}
	
}
