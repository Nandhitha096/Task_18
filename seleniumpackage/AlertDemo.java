package seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AlertDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert a1= driver.switchTo().alert();
		Thread.sleep(3000);
		a1.sendKeys("Testing");
		Thread.sleep(3000);
		a1.accept();
		
		if(driver.getPageSource().contains("You entered: Testing"))
		{
				System.out.println("Validation successfull");
		}

	}

}
