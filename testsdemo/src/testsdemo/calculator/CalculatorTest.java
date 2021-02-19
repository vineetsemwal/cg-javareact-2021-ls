package testsdemo.calculator;

import org.junit.jupiter.api.*;

public class CalculatorTest {

	/**
	 * test scenario i/p1= 2 , i/p2=3
	 * expectation=5 
	 */
	@Test
	public void testAdd_1() {
		Calculator calculator=new Calculator();
		int result=calculator.add(2, 3);
		Assertions.assertEquals(5, result);
	}
	
	/**
	 * test scenario i/p1= -3 , i/p2=-5
	 * expectation=-8 
	 */
	@Test
	public void testAdd_2() {
		Calculator calculator=new Calculator();
		int result=calculator.add(-3, -5);
		Assertions.assertEquals(-8, result);
		
	}
	
}
