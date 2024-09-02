package grouptests;

import org.testng.annotations.Test;

public class GroupTestDemo {
	
	@Test(groups= {"smoke"})
	public void Test1()
	{
		System.out.println("This is Smoke Test");
	}

	@Test(groups= {"regression"})
	public void Test2()
	{
		System.out.println("This is Regression Test");
	}
}
