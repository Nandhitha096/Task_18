package testngignore;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGIgnoreDemo {
	
	@Test
	public void A()
	{
		System.out.println("A test method");
	}
	
	@Test
	public void B()
	{
		System.out.println("B test method");
	}
	
	@Test
	public void C()
	{
		System.out.println("C test method");
	}
	
	@Test
	public void D()
	{
		System.out.println("D test method");
	}
	
	@Test
	public void E()
	{
		System.out.println("E test method");
	}
	
	
	@Test
	public void F()
	{
		System.out.println("F test method");
	}
	
	

}
