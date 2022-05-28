package Listener.TestNGListener;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener4 extends Listener3 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("On Test Start from Listener");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("On Test success from Listener");
		TakeScreenShot(driver,result.getTestName());
	}
public static void TakeScreenShot(WebDriver driver,String name)
{
	TakesScreenshot screen=(TakesScreenshot) driver;
	File source=screen.getScreenshotAs(OutputType.FILE);
	
	int no=1;
	File Destination =new File("C:\\Users\\Admin\\Pictures\\ss.pp");
	
	no++;
	try {
	
		FileHandler.copy(source, Destination);
	}
	catch(IOException e)
	{
		e.printStackTrace();
		
	}
	System.out.println("Screenshot is taken");
	
}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Fail from listener");
		TakeScreenShot(driver,result.getTestName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("On Test skip from Listener");
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
