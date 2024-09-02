package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.id("column-a"));
		WebElement e2=driver.findElement(By.id("column-b"));
		
		Actions act= new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(e1, e2);
		act.build().perform();
		

	}

}
