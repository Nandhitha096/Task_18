package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg2 {
	
	
	@Test
	public void A()
	{
		System.out.println("A test method");
	}
	
	@BeforeTest
	public void B()
	{
		System.out.println("B test method");
	}
	
	@BeforeSuite
	public void C()
	{
		System.out.println("C test method");
	}
	
	@AfterMethod
	public void D()
	{
		System.out.println("D test method");
	}
	
	@BeforeClass
	public void E()
	{
		System.out.println("E test method");
	}
	
	@AfterTest
	public void F()
	{
		System.out.println("F test method");
	}
	
	@AfterClass
	public void G()
	{
		System.out.println("G test method");
	}
	
	@BeforeMethod
	public void H()
	{
		System.out.println("H test method");
	}
	
	@AfterSuite
	public void I()
	{
		System.out.println("I test method");
	}
	
	@Test
	public void A1()
	{
		System.out.println("A1 test method");
	}
	
	
	

}
