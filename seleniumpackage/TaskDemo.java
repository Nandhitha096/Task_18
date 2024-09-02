package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskDemo {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&deoia=1&jlou=AfemULuVhVhmokPUb47-UJPdII2At_GSomPpuWA3_PIIEtRDwQIVshoC35tJ7SKRoN1wgr6kUEtdZgzJadh-8y7w1jIxSOkLfUa8xn0uTAHpCQ&smuh=54779&lh=Ac8D76X4BNHyeU2O7co");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='u_0_0_Lx']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='u_g_b_2i']")).sendKeys("Nandhitha");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='u_g_d_dS']")).sendKeys("Vijaykumar");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='u_g_g_M/']")).sendKeys("nandhitha096@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("abcd@12345");
		Thread.sleep(3000);
		
		List<WebElement> birthDate = driver.findElements(By.xpath("//select[@id='day']"));
		birthDate.get(6).click();
		
		Thread.sleep(3000);
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']"));
		birthMonth.get(6).click();


	}

}
