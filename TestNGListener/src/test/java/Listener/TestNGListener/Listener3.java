package Listener.TestNGListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Listener3 {

	public static WebDriver driver;

	@BeforeTest
	public void initBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	 @Test(priority=1)
	 public void login() throws InterruptedException {
	 //Enter Username
	 
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	 
	 //Enter Password
	 
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin1234");
	 
	 //Click on Login button
	 
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	 
	 Thread.sleep(4000);
	 
	 //We are Forcefully Fail this test case
	 Assert.assertTrue(false);
	 
	 }
	 
	 @Test(priority=2)
	 public void homepage() throws InterruptedException
	 {
	 System.out.println("This is second test case which is for Homepage");
	 Thread.sleep(4000);
	 Assert.assertTrue(false);
	 }


}
