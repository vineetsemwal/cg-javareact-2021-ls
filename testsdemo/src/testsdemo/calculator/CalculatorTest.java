package testsdemo.calculator;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

	Calculator calculator;
	
	@BeforeEach
	public void setup() {
		System.out.println("inside setup");
		calculator=new Calculator();			
	}	
	
	@AfterEach
	public void clear() {
		System.out.println("inside clear");
		calculator=null;
	}
	
	@BeforeAll
	public static void setupOnce() {
		System.out.println("inside setupOnce");
	}


	/**
	 * test scenario number=4
	 * expectation : true
	 */
	@Test
	public void testIsEven_1() {
		boolean actual=calculator.isEven(4);
		assertTrue(actual);
	}
	
	
	/**
	 * test scenario number=7
	 * expectation : false
	 */
	@Test
	public void testIsEven_2() {
		boolean actual=calculator.isEven(7);
		assertFalse(actual);
	}
	
	@Test
	public void testAddBy10_1() {
		Adder adder= Mockito.mock(Adder.class);
		Mockito.when(adder.add(5,10)).thenReturn(15);
		Mockito.when(adder.add(10,5)).thenReturn(15);
		calculator.setAdder(adder);
		int result=calculator.addBy10(5);
		assertEquals(15, result);
		
	}
	
	
}
