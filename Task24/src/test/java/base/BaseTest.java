package base;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver chromeDriver;
    
    //load chromedriver and url
    @BeforeMethod
    public void setUpMethod() throws InterruptedException {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.demoblaze.com/");
        chromeDriver.manage().window().maximize();
    }
    //quit chromedriver
    @AfterMethod
    public void tearDownMethod(ITestResult result) 
    	{
            if (ITestResult.FAILURE == result.getStatus()) {
                takeScreenshot(result.getName());
            }
        chromeDriver.quit();       
    	}
    
    // capturing screenshot
    public void takeScreenshot(String testName) {
        TakesScreenshot ts = (TakesScreenshot) chromeDriver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        try {
        	// Ensure the directory exists
            Files.createDirectories(Paths.get("screenshots"));

            Files.copy(srcFile.toPath(), Paths.get("screenshots", testName + ".png"),StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
