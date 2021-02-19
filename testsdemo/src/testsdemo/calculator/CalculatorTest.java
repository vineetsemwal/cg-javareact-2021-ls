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
	
	/**
	 * case when other unit on which unit under testing is in different class,
	 *  then mock normally
	 */
	@Test
	public void testAddBy10_1() {
		Adder adder= Mockito.mock(Adder.class);
		Mockito.when(adder.add(5,10)).thenReturn(15);
		//Mockito.when(adder.add(10,5)).thenReturn(15);
		calculator.setAdder(adder);
		int result=calculator.addBy10(5);
		assertEquals(15, result);
		Mockito.verify(adder).add(5, 10);
		
	}
	
	/**
	 * case when other unit on which unit under testing is in the same class,
	 *  then use spy
	 */
	@Test
	public void testSubBy10_1() {
	    Calculator spy  =Mockito.spy(calculator);	 
	    Mockito.doReturn(5).when(spy).sub(15, 10);
	    int result=spy.subBy10(15);
	    assertEquals(5, result);
	    Mockito.verify(spy).sub(15, 10);
	}
	
	
}
