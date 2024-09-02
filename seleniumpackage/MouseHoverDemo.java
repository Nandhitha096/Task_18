package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.id("navbarDropdown"));
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
		
		Thread.sleep(3000);
		
		act.contextClick().build().perform();
		
		
	}

}
