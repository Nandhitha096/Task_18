package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

    public static void main(String[] args) {
    	
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the Chrome WebDriver
        WebDriver driver = new ChromeDriver();
        
        //Navigate to the URL
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
       //Perform Actions
       
       //Passing username in the username textfield
       driver.findElement(By.name("username")).sendKeys("Nandhitha");
       
       //Passing password in the password textfield
       driver.findElement(By.name("password")).sendKeys("abc@123");
       
       //Clicking the Login button
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       
       //CLose the browser
       driver.close();
      
    }
    
}
