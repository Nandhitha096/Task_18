package seleniumpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ExplicitWaitDemo {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		driver.manage().window().maximize();
		WebDriverWait wt= new WebDriverWait(driver, Duration.ofSeconds(3));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("FullName")))
		.sendKeys("Nandhitha Vijaykumar");
		
	}

}
