package Listener.TestNGListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener2 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("On Test Start from Listener");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		System.out.println("On Test Success from Listener");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		System.out.println("On Test fail from Listener");
		
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
