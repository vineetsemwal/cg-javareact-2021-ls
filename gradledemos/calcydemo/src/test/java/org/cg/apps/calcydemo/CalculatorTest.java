package org.cg.apps.calcydemo;

import org.junit.jupiter.api.*;

public class CalculatorTest {
	

	Calculator calculator;
	
	@BeforeEach
	public void setup() {
		calculator=new Calculator();
	}

	@Test
	public void testAdd_1() {
		int result=calculator.add(3, 5);
		Assertions.assertEquals(8,result);
	}
}
