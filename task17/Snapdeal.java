package task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws Exception {
		
		     
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='accountInner']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("userName")).sendKeys("9600955380");
		
		Thread.sleep(3000);
		driver.findElement(By.id("checkUser")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='txt-center']//input[@name='otpValue']")).sendKeys(args);

	}

}
