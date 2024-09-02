package task18; 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignup {
	
	//defining the facebook url to a static variable
	static String url = "https://www.facebook.com/";

	public static void main(String[] args) throws Exception {
		                          
		//Setting up the chrome driver
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		//Launching Facebook
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Verifying if the website has been re-directed to Facebook Homepage
		if(driver.getCurrentUrl().equals(url))
		{
			System.out.println("Successfully navigated to Facebook Homepage ");
		}
		else
		{
			System.out.println("Failed to navigate to Facebook Homepage");
		}
		
		//Clicking on "Create new account" button
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		//Entering the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		Thread.sleep(1000);
		//Entering the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("User");
		Thread.sleep(2000);
		//Entering the email address
		driver.findElement(By.name("reg_email__")).sendKeys("testuser@test.com");
		Thread.sleep(2000);
		//Entering the password
		driver.findElement(By.id("password_step_input")).sendKeys("Abcd@123456");
		Thread.sleep(2000);
		
		//selecting date of birth
		Select day= new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("6");
		Thread.sleep(2000);
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Jun");
		Thread.sleep(2000);
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("1996");
		Thread.sleep(2000);
		
		//Choosing the gender
		String gender= "Female";
		
		driver.findElement(By.cssSelector("input[id='sex'][value='1']")).click();
		Thread.sleep(2000);
		
		//Clicking on "Submit" button
		driver.findElement(By.name("websubmit")).click();
		
		//Verifying if the user is successfully registered
		if(driver.getCurrentUrl().equals(url))
		{
			System.out.println("Successfully registered on Facebook and re-directed to Homepage");
		}
		else
		{
			System.out.println("Registration Failed / re-driection to Homepage was unsuccessful");
		}
		
		//closing the browser
		driver.close();	
		
		
	}

}
