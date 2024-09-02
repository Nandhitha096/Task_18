package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssDemo2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//verify text colour of an element
		
         String ExpectedTextColor = "#ffffff";
		
		String TextColor = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("color");
		System.out.println(TextColor);
		Color hexcode= Color.fromString(TextColor);
		String ActualTextcolor= hexcode.asHex();
		System.out.println(ActualTextcolor);
		
		//Validation
		if(ExpectedTextColor.equals(ActualTextcolor))
		{
			System.out.println("Validation Successful");
		}

	}

}
