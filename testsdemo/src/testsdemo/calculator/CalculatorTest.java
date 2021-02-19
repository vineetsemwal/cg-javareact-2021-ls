package testsdemo.calculator;

import org.junit.jupiter.api.*;
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
	 * test scenario num1= 2 , num2=3
	 * expectation=5 
	 */
	@Test
	public void testAdd_1() {
		System.out.println("inside testAdd1");
		int result=calculator.add(2, 3);
		assertEquals(5, result);
	}
	
	/**
	 * test scenario num1= -3 , num2=-5
	 * expectation=-8 
	 */
	@Test
	public void testAdd_2() {
		System.out.println("inside testAdd2");
		int result=calculator.add(-3, -5);
		assertEquals(-8, result);
		
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
		int result=calculator.addBy10(5);
		assertEquals(15, result);
		
	}
	
	
}
