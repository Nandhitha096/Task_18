package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumQuestionTwo {

	public static void main(String[] args) throws Exception {
		
		//Setting up chromedriver
		WebDriverManager.chromedriver().setup();
		
		//Creating new instance of Chrome Driver
		WebDriver driver = new ChromeDriver();
		
		//Launching Google using get() method
		driver.get("https://www.google.com/");
		
		//Finding the Search input Element by xpath
		WebElement textfield = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		Thread.sleep(3000);
		
		//Entering the search query in the textfield
		textfield.sendKeys("Selenium Browser Driver");
		Thread.sleep(3000);
		
		//Pressing ENTER key to search the given query in Google
		textfield.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		//Closing the browser
		driver.close();

	}

}
