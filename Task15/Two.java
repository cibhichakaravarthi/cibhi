package Task15;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Two extends main {
	@Test
	public void test1() throws InterruptedException{
		// load url
		chromeDriver.get("https://www.google.com");
		// send keys in google search bar
	    By by = By.id("APjFqb");
	    WebElement element = chromeDriver.findElement(by);
	    element.sendKeys("Selenium Browser driver");
	    element.submit();
	  //wait for program
	    Thread.sleep(100);
	    //comparing the expected result with actual result
	    String results = chromeDriver.getPageSource();
	    boolean result = results.contains("Selenium Browser driver");
	    Assert.assertEquals(result, true);
	    System.out.println(result);
	}
	
}

