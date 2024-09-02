package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlAndTitleDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//get the title of the webpage
		String title= driver.getTitle();
		System.out.println("Title of the current webpage: "+title);
		
		//get the URL of the webpage
		String url= driver.getCurrentUrl();
		System.out.println("URL of the current webpage: "+url);
	
	}

}
