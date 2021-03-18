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

	@Test
	public void testAdd_3(){
		Calculator spy= Mockito.spy(calculator);
		//Mockito.when(spy.add(4,10)).thenReturn(14);
		Mockito.doReturn(14).when(spy).add(4,10);
		int result=spy.addBy10(4);
	    Assertions.assertEquals(14,result);
	}


}
