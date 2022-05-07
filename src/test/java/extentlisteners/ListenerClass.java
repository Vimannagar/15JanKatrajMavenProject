package extentlisteners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testclasses.BaseTest;
import utility.ScreenShot;



public class ListenerClass extends BaseTest implements ITestListener


{
	
	public static ExtentTest test;
	ExtentReports extent = ExtentReportGen.extentReportGenerator();
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started :"+result.getName());
		test = extent.createTest(result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed :"+result.getName());
		
		test.log(Status.PASS, "Test case is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case Failed :"+result.getName());
		test.fail(result.getThrowable());
		try {
			test.addScreenCaptureFromPath(ScreenShot.captureScreenshotWithPath(driver,result.getName() ), "Captured screenshot");
		} catch (IOException e) {
			
			System.out.println("Exception occured while taking screenshot");
		}
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case got skipped :"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("Test started :"+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test completed :"+context.getName());
		extent.flush();
	}
	
	
	
	
	

}
