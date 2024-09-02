package task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
		
				//Setting up the chrome driver
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				Thread.sleep(2000);
				
				String url = "https://jqueryui.com/droppable/";
				
				//Launching the provided url
				driver.get("https://jqueryui.com/droppable/");
				driver.manage().window().maximize();
				
				//Verifying the navigation to homepage
				if(driver.getCurrentUrl().equals(url))
				{
					System.out.println("Successfully navigated to the jquery-droppable page");
				}
				else
				{
					System.out.println("Failed to navigate to the jquery-droppable page");
				}
				
				//Switching to Frame
				driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
				WebElement element1 = driver.findElement(By.id("draggable"));
				WebElement element2 = driver.findElement(By.id("droppable"));
				
				//Performing drag and drop operation using Actions class
				Actions act = new Actions(driver);
				act.dragAndDrop(element1, element2);
				Thread.sleep(2000);
				act.build().perform();
				
				//Defining the rgba color for comparison
				String expectedColor = "rgba(255, 250, 144, 1)";
				
				//Fetching the background-color of the element
				String rgbaColor = driver.findElement(By.id("droppable")).getCssValue("background-color");
				
				System.out.println("RGB Color : "+rgbaColor);
				
				//verifying if the operation has been performed with respect to color change
				if(rgbaColor.equals(expectedColor))
				{
					System.out.println("Drag and drop operation has been performed successfully");
				}
				else
				{
					System.out.println("Failed to perform drag and drop operation");
				}
				
				String targetText = element2.getText();
				
				//Verifying the text of target element
				if(targetText.equals("Dropped!"))
				{
					System.out.println("The text of the target element has been verified");
				}
				else
				{
					System.out.println("Incorrect text");
				}
				
				//closing the browser
				driver.close();
				
				
	}

}
