package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class TestCaseexamen {

	@Before
	public void before() {System.out.print("Before ");}
	
	@Test
	public void test1() {System.out.print("test1 ");}
	
	@Test
	public void test2() {System.out.print("test2 ");}
	
	@AfterClass
	public static void after() {System.out.print("after ");}

}
