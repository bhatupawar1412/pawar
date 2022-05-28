package Listener.TestNGListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

	//step 1
	//selenium and testng dependency
	//step 2
	//implements ITestListener  then r8 click karun
	//Sourses madhe jaun Orride implements method select kelya 
	//all select kelya and ok..
	//je error ale te method body methun kadun taklya ...
	// ek class tayar kela --Sample Test 
	//three void method tayar kelya 
	//& anotetion dilya ani 
	//project la TestNg madhe convert kela...
	
	/*
	  <listener class-name="packagename.classname"/>
	  for example
	  <listeners>
<listener class-name="Listener.TestNGListener.ListenerClass">
</listener>
</listeners>
	
	  
 	*/
	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("test case exute successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
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
