package com.revature;

//static import, import all the static methods
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/*
 * Test the methods of the CalculatorImpl Class
 * 
 * 
 * 		jUnit tests should be made all methods
 * 			-tests are not run in any order
 * 				-jUnit @s
 * 					-@Test		 -placed above each method to test
 * 					-@Before	 -Before each test method call
 * 					-@After		 -After each test method finishes
 * 					-@Ignore	 -...
 * 					-@BeforeClass -must be static methods
 * 					-@AfterClass  -must be static methods
 * 
 * 			-public void, no return type other than void					
 * 
 */
public class CalculatorTest {

	/*
	 * 	public int add(int x, int y);
	public int subtract(int x, int y);
	public int multiple(int x, int y);
	public int divide(int x, int y) throws IllegalArgumentException;
	 */
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("***Before Class***");
	}
	
	@Before
	public void before(){
		System.out.println("before method");
		//setup/reset any resources 
	}
	
	
	
	@Test //@Test says this method should be tested
	public void additionalShouldReturnSum(){
		System.out.println("************Addition Test*************************");
		Calculator tester = new CalculatorImpl();
		
		//assert methods
		assertEquals("10 + 5 should be 15", 10+5, tester.add(10, 5)); 
		assertEquals("100 + 5 should be 105", 100+5, tester.add(100, 5));
		assertEquals("11 + 20 should be 31", 11+20, tester.add(11, 20));
		assertEquals("1 + 1 should be 2", 1+1, tester.add(1, 1));
		assertEquals(5, tester.add(2,3));
	}
	
	@Ignore
	public void subtractShouldReturn(){
		System.out.println("************Subtraction Test*************************");
		Calculator tester = new CalculatorImpl();
	}
	
	@Test
	public void multipleShouldReturn(){
		System.out.println("************Multiple Test*************************");
		Calculator tester = new CalculatorImpl();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void divideShouldReturn(){
		System.out.println("************Divide Test*************************");
		Calculator tester = new CalculatorImpl();
		tester.divide(10, 1);
		
		
	}
	/*
	 * timeout = 3000 ms
	 */
	@Test(timeout = 3000)
	public void testTime(){
		System.out.println("************testTime Test*************************");
		new CalculatorImpl().timeTooLong();
	}
	

	
	@After
	public void after(){
		System.out.println("After");
	}
	
	
	@AfterClass
	public static void afterClass(){
		System.out.println("***AfterClass***");
	}
}
