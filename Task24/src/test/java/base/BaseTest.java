package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
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
    public void tearDownMethod() {
        chromeDriver.quit();       
    }

    
}
