package seleniumpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesFile {
	
	static Properties prop= new Properties();
	static String projectpath = System.getProperty("user.dir");
	
	

	public static void main(String[] args) throws Exception {
		
		getProperties();

	}
	
	public static void getProperties() throws Exception
	{
		
		
	    FileInputStream fis = new FileInputStream(projectpath + "/src/test/java/config/configuration.properties");
	    prop.load(fis);
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement emailField = driver.findElement(By.id("email"));
		WebElement passwordField = driver.findElement(By.id("pass"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		emailField.sendKeys(prop.getProperty("email"));
		Thread.sleep(3000);
		passwordField.sendKeys(prop.getProperty("password"));
		Thread.sleep(3000);
		loginButton.click();
			
		
	}

}
