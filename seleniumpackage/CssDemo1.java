package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssDemo1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//verify background colour of an element
		
		String ExpectedBgColor = "#ff7b1d";
		
		String BackgroundColor = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("background-color");
		System.out.println(BackgroundColor);
		Color hexcode= Color.fromString(BackgroundColor);
		String ActualBgcolor= hexcode.asHex();
		System.out.println(ActualBgcolor);
		
		//Validation
		if(ExpectedBgColor.equals(ActualBgcolor))
		{
			System.out.println("Validation Successful");
		}
		
		

	}

}
