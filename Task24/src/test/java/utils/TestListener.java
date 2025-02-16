package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.BaseTest;

public class TestListener  implements ITestListener {
	
	 private static ExtentReports extent = ExtentManager.createInstance("Task24/extent-report.html");
	 private static ThreadLocal<ExtentTest> test = ExtentManager.getTestInstance();
	 

   
    @Override
    public void onTestStart(ITestResult result) {
    	ExtentTest test1 = extent.createTest(result.getMethod().getMethodName());
    	test.set(test1);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    	test.get().pass("Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	test.get().fail("Test failure");
    	 BaseTest baseTest = (BaseTest) result.getInstance();
         baseTest.takeScreenshot(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    	test.get().skip("Test skiped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Not implemented
    }

    @Override
    public void onStart(ITestContext context) {
        // Not implemented
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
