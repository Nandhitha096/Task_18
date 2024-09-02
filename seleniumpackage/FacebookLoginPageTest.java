package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.FacebookLoginPageObjects;

public class FacebookLoginPageTest {
	
	static WebDriver driver;
	

	public static void main(String[] args) throws Exception {
		
		facebookLoginActions();

	}
	
	public static void facebookLoginActions() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		FacebookLoginPageObjects login= new FacebookLoginPageObjects(driver);
		Thread.sleep(3000);	
		login.setEmailTextbox("nandhitha096@gmail");
		Thread.sleep(3000);
		login.setPasswordText("123456789");
		login.buttonClickAction();
		
		
		System.out.println("Automation testing executed successfully");
	}

}
