package Task21;

import java.time.Duration;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class window extends mainChorme {
	
	@Test
	public void test() throws InterruptedException {
		
		//load url
		chromeDriver.get("https://the-internet.herokuapp.com/windows");
		
		//locate click here and click it
		WebElement clickHere = chromeDriver.findElement(By.xpath("//a[@href='/windows/new']"));
		clickHere.click();
		
		//switch to new window
		String oldWindow = chromeDriver.getWindowHandle();
		WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		//get handle to new window
		Set<String> windows = chromeDriver.getWindowHandles();
		String newWindow = windows.stream().filter(handle -> !handle.equals(oldWindow)).findFirst().orElseThrow();
		
		//switch to new window
		chromeDriver.switchTo().window(newWindow);
		
		//locate xpath for new window
		WebElement newText = chromeDriver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));
		Thread.sleep(3000);
		//verify we landed to new window
		if(newText.getText().equals("New Window")) {
			System.out.println("'New window' text is present");
		} else {
			System.out.println("'New window' text is not present");
		}
		
		//close the new window
		chromeDriver.close();
		
		//navigate to old window
		chromeDriver.switchTo().window(oldWindow);
		
		//verify old window is active
		if(chromeDriver.getWindowHandle().equals(oldWindow)) {
			System.out.println("Back to the old window");
		} else {
			System.out.println("Old window was not in active");
		}
		
		
	}

}
