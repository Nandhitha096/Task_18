package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tickets.paytm.com/trains/");
		driver.manage().window().maximize();
		
		WebElement button= driver.findElement(By.xpath("//div[@class='yXYSb']"));
        button.click();
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        //driver.switchTo().frame("oauth-iframe");
        WebElement number= driver.findElement(By.xpath("//input[@name='mobile']"));
        number.sendKeys("9600955380");
        System.out.println(number.getText());
	}

}
