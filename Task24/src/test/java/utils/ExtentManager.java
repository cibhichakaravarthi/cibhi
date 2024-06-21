package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager  {

    public static ExtentReports getReporter() {
    	ExtentReports extent=new ExtentReports();
        extent = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-output/Task24 Suite/extent-reports.html");
        extent.attachReporter(sparkReporter);
        return extent;
    }
}

