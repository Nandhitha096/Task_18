package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.file.io/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='css-zpjtsm e12cce780']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\91893\\OneDrive\\Desktop\\AutoIT.exe");
		System.out.println("Test Excecuted Successfully");
		
		

	}

}
