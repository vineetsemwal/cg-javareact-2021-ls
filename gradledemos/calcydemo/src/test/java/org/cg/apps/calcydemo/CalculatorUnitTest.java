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
	public void testAdd_1(){

	}


}
