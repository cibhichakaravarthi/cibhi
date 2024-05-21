package Task15;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//file->new -> maven project (name: selenium)
//add dependency in pom.xml(selenium, testng, junit)
//import chormedriver, by is used for locate the elements, assert is used for test case is pass or failure
//load url

public class four extends main{
	@Test
	public void test1() throws InterruptedException {
		chromeDriver.get("https://www.google.com");
		// send keys in google search bar
	    By by = By.id("APjFqb");
	    WebElement element = chromeDriver.findElement(by);
	    element.sendKeys("guvi");
	    element.submit();
	  //wait for program
	    Thread.sleep(1000);
	}
	

}
