package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		driver.manage().window().maximize();
		
		WebElement elm = driver.findElement(By.id("hot-spot"));
        Actions act=new Actions(driver);
        Thread.sleep(3000);
        
        //act.moveToElement(elm).build().perform();
        //Thread.sleep(3000);
        
        act.contextClick(elm).build().perform();
       
	}

}
