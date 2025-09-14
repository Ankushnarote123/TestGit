package Listener;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base_components.BaseClass;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import utils.Screenshots;


public class Listeners extends BaseClass implements ITestListener
{
	 private static ThreadLocal<ExtentTest> testReport = new ThreadLocal<>();

	    @Override
	    public void onTestStart(ITestResult result) {
	        ExtentTest test = extent.createTest(result.getMethod().getMethodName());
	        testReport.set(test);
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        testReport.get().log(Status.PASS, "Test Passed");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        String path = Screenshots.capture(driver, result.getMethod().getMethodName());
	        testReport.get().log(Status.FAIL, "Test Failed: " + result.getThrowable());
	        testReport.get().addScreenCaptureFromPath(path);
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        testReport.get().log(Status.SKIP, "Test Skipped");
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        setupReport();
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	    	tearDown();
	    }
	
	
}
