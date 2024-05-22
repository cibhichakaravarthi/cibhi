package Task16;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class three extends mainChorme {
	@Test
	public void test1() throws InterruptedException {
		// load url
		chromeDriver.get("https://www.wikipedia.org");
		// wait time
		Thread.sleep(1000);
		// search input in wikipedia
		WebElement search=chromeDriver.findElement(By.id("searchInput"));
		search.sendKeys("Artificial Intelligence");
		search.submit();
		Thread.sleep(1000);
		// histroy in wikipedia
		WebElement history=chromeDriver.findElement(By.id("ca-history"));
		history.click();
		Thread.sleep(1000);
		//get histroy title
		WebElement htitle=chromeDriver.findElement(By.id("firstHeading"));
		String histroytitle=htitle.getText();
		//print current title
		System.out.println("The current pageTitle:" +histroytitle);
		
		
		
	}

}
