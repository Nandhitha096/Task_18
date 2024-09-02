package testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNG3 {
	
	static String s1= "Successful";
	static String s2= "UnSuccessful";
	
	@Test
	public void TestCaseOne()
	{
		System.out.println("TestCase one is executed");
	}
	
	
	@Test(invocationCount = 2)
	public void TestCaseTwo()
	{
		System.out.println("TestCase Two is executed");
	}
	
	@Test
	public void TestCaseThree()
	{
		try {
			Assert.assertEquals(s1,s2);
		}
		catch(Exception e)
		{
			System.out.println("String doesn't match");
		}
	}
	
	@Test(dependsOnMethods = {"TestCaseOne"})
	public void TestCaseFour()
	{
		System.out.println("Test case four is successfully executing with help of Test case One");
	}
	
	@Test(enabled =false)
	public void TestCaseFive()
	{
		System.out.println("Test case five executed successfully");
	}

}
