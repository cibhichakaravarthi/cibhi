package Task16;

import org.junit.Test;

public class one extends mainFirefox {
	@Test
	public void test1() throws InterruptedException {
		// load url
		fireFoxDriver.get("https://www.google.com");
		String url=fireFoxDriver.getCurrentUrl();
		//print current url
		System.out.println("The current page url:" +url);
		// wait time
		Thread.sleep(1000);
		//refresh the page
		fireFoxDriver.navigate().refresh();
		
	}

}
