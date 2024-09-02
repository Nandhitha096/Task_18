package testngreports;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestNGReportTestCaseDemo1 {
	
	WebDriver driver;
	

	public static void main(String[] args) throws Exception {
		
		//initialize the HtmlReporter
		
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("FirstReport.html");
		
		//initialize ExtentReports and attach the HtmlReporter
		
		ExtentReports extent = new ExtentReports();
		
		//attach only HtmlReporter
		
		extent.attachReporter(htmlreporter);
				
		
		//TEST CASE 1
		
		ExtentTest testcase1 = extent.createTest("First Test Case");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		testcase1.log(Status.INFO, "Checking Test Cases for Valid Credentials");
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		testcase1.log(Status.INFO, "Navigated to Facebook Login Page");
		
		testcase1.log(Status.INFO, "Passing Valid credentials");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nandhitha096@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc@98654300");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		testcase1.log(Status.PASS, "First test case passed successfully with valid credentials");
		
		//TEST CASE 2
		
		
		ExtentTest testcase2 = extent.createTest("Second Test Case");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		testcase2.log(Status.INFO, "Checking Test Cases for Invalid Username & valid password");
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		testcase2.log(Status.INFO, "Navigated to Facebook Login Page");
		
		testcase2.log(Status.INFO, "Passing invalid credentials credentials");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("0908...");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc@98654300");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		testcase2.log(Status.FAIL, "Second test case failed with invalid username");
		
		//TEST CASE 3
		
		ExtentTest testcase3 = extent.createTest("Third Test Case");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		testcase3.log(Status.INFO, "Checking Test Cases for Valid username & Invalid password");
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		testcase3.log(Status.INFO, "Navigated to Facebook Login Page");
		
		testcase3.log(Status.INFO, "Passing invalid credentials");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nandhitha096@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("-------");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		testcase3.log(Status.FAIL, "Third test case Failed with invalid password");
		
		extent.flush();
		
		

	}

}
