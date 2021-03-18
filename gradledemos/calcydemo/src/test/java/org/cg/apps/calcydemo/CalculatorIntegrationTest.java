package org.cg.apps.calcydemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorIntegrationTest {


    Calculator calculator;

    @BeforeEach
    public void setup() {
    	Adder adder=new Adder();
        calculator = new Calculator(adder);
    }

	/**
	 * scanario num1=0, num2=0
	 * expectation : reuslt is 0
	 */
	@Test
    public void testAdd_1(){
    	int result=calculator.add(0, 0);
	    Assertions.assertEquals(0,result);
	}

	/**
	 * scanario num1=3, num2=5
	 * expectation : result is 8
	 */
	@Test
	public void testAdd_2(){
		int result=calculator.add(3,5);
	    Assertions.assertEquals(8,result);
	}


	/**
	 * scnario num1=-10, num2=-20
	 * expectation : result is -30
	 */
	@Test
	public void testAdd_3(){
		int result=calculator.add(-10,-20);
		Assertions.assertEquals(-30,result);
	}

}
