package org.cg.apps.calcydemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculatorUnitTest {


    Calculator calculator;
	Adder adder;

	@BeforeEach
    public void setup() {
    	adder= Mockito.mock(Adder.class);
        calculator = new Calculator(adder);
    }


	/**
	 * scanario num1=3, num2=5
	 * expectation : result is 8
	 */
	@Test
	public void testAdd_2(){
		Mockito.when(adder.add(3,5)).thenReturn(8);
		Mockito.when(adder.add(5,3)).thenReturn(8);
		int result=calculator.add(3,5);
	    Assertions.assertEquals(8,result);
	    Mockito.verify(adder).add(3,5);
	}


}
