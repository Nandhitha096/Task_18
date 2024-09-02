package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws Exception {
		
		//Setting up the chrome driver
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		//Launching the provided url
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//Switching to frame
		WebElement Frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(Frame);
		
		//Clicking the date field
		WebElement date = driver.findElement(By.id("datepicker"));
		date.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		//Clicking on next month
		driver.findElement(By.xpath("//a[@title='Next']/span")).click();
		
		//Selecting date
		driver.findElement(By.xpath("//a[@data-date='22']")).click();
		
		driver.quit();
		
		//Printing the selected date in console
		String selectedDate = date.getAttribute("value");
		System.out.println("Selected Date : " + selectedDate);

	}

}
