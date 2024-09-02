package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPageObjects {
	
	WebDriver driver=null;
	
	By enter_email=By.id("email");
	By enter_password=By.id("pass");
	By button_click=By.name("login");
	
	public FacebookLoginPageObjects(WebDriver driver) {
		
		this.driver=driver;
	}

	public void setEmailTextbox(String email)
	{
		driver.findElement(enter_email).sendKeys(email);
		
	}
	
	public void setPasswordText(String password)
	{
		driver.findElement(enter_password).sendKeys(password);
	}
	
	public void buttonClickAction()
	{
		driver.findElement(button_click).click();
	}
	
}

