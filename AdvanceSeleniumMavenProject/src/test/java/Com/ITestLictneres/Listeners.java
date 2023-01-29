package Com.ITestLictneres;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onStart(ITestContext c)
	{
		System.out.println("On start");
	}
	
	public void onFinish(ITestContext c) {
		
		System.out.println("on finish");
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success");
	}
	
	public void onTestFailure(ITestResult result) {
	System.out.println("On Test Failure");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on Test failure But withIn Success Percentage");
	}
}
