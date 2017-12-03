package greetingsUtil;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GreetingsUtilTestHW {
	
static GreetingsUtil gu;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		gu = new GreetingsUtil();
				
	}
	
	@Before
	public void setUp() throws Exception {
		gu.currentState = "going";
		System.out.println("CURRENT STATE INITIALLY BEFORE  EACH TEST: " +gu.currentState);
	}

	@Test
	public void testHello() 
	{
	assertEquals("Hi!", gu.Hello());//current state changes to coming
	System.out.println("Result0:" + "Current State: "+ gu.currentState);
	}
	
	@Test
	public void testGoodBye() 
	{
	assertEquals( "You already said that", gu.GoodBye());//current state = going
	System.out.println("Result1:" + " Current State: "+gu.currentState);
	 
	}
	
	
	@Test
	public void testChangeState() 
	{
	  gu.ChangeState();//current state changes to coming
	  assertEquals("bye",gu.GoodBye());//current state changes to going
	  System.out.println("Result2: "+" Current State: "+gu.currentState);
	}
	
	@Test
	public void TestEmptyInput() 
	{
	  gu.currentState = ""; 
	  assertEquals("bye",gu.GoodBye());//current state = going
	  System.out.println("Result3: "+" Current State: "+gu.currentState);
	  
	}
	
	
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("your tests here");
		
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


	}


	
