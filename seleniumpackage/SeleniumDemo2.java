package seleniumpackage;

import java.lang.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumDemo2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		String title1= driver.getTitle();
		System.out.println("Title of the webpage is :" +title1);
		String url1= driver.getCurrentUrl();
		System.out.println("Current URL of the webpage is :" +url1);
		//Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("password123");
		Thread.sleep(3000);
	
		
	}

}
