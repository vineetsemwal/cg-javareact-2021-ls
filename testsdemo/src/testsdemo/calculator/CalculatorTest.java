package testsdemo.calculator;

import org.junit.jupiter.api.*;

public class CalculatorTest {

	Calculator calculator;
	
	@BeforeEach
	public void setup() {
		System.out.println("inside setup");
		calculator=new Calculator();			
	}
	

	/**
	 * test scenario num1= 2 , num2=3
	 * expectation=5 
	 */
	@Test
	public void testAdd_1() {
		System.out.println("inside testAdd1");
		int result=calculator.add(2, 3);
		Assertions.assertEquals(5, result);
	}
	
	/**
	 * test scenario num1= -3 , num2=-5
	 * expectation=-8 
	 */
	@Test
	public void testAdd_2() {
		System.out.println("inside testAdd2");
		int result=calculator.add(-3, -5);
		Assertions.assertEquals(-8, result);
		
	}
	
}
