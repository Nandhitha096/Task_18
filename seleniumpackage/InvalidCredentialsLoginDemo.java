package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvalidCredentialsLoginDemo {

	public static void main(String[] args) throws Exception {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("----");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("0000....");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		
		
		//validation
		
		if(driver.getPageSource().contains("The email address or mobile number you entered isn't connected to an account."))
		{
			System.out.println("Validation successful");
		}
		

	}

}
