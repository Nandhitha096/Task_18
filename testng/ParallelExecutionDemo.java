package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ParallelExecutionDemo {
	
	WebDriver driver = null;
	

@Parameters("browserName")	
	
@BeforeTest
public void setup(String browserName) throws Exception
{
	
	System.out.println("The browser name is : "+browserName);
	System.out.println("Thread id : "+Thread.currentThread().getId());
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Thread.sleep(3000);
	}
	
	else if(browserName.equalsIgnoreCase("microsoft bing"))
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
}
@Test

public void test() throws Exception
{
	driver.get("https://www.selenium.dev/");
	Thread.sleep(3000);
}
	
@AfterTest

public void teardown()
{
	driver.close();
	System.out.println("Test completed successfully");
}	

}
