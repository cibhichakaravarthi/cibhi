package Task21;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frame extends mainChorme {
	
	@Test
	public void test1() {
		
		//load url
		chromeDriver.get("https://the-internet.herokuapp.com/iframe");
		
		//locate frame xpath
		WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("mce_0_ifr")));
		
		//locate p tag inside frame
		WebElement p = chromeDriver.findElement(By.id("tinymce"));
		
		//Send hello people inside p tag using javascript
		JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
        	js.executeScript("arguments[0].innerText = 'Hello People';", p);
        
		//verify the enter name is correct or not
        	String name = p.getText();
        	System.out.println(name);	
        
		}

}
