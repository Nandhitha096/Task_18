package testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TestNGIgnoreClassDemo {

	@Test
	public void Test1()
	{
		System.out.println("Test one Method executes");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test two Method executes");
	}
	
	@Test
	public void Test3()
	{
		System.out.println("Test three Method executes");
	}
	
}
