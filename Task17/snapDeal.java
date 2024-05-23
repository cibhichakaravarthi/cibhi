package Task17;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class snapDeal extends mainChorme {
	@Test
	public void test1() throws InterruptedException {
		//load url
		chromeDriver.get("https://www.snapdeal.com/");
		Thread.sleep(1000);
		//move to signin button and click it  
		WebElement signIn= chromeDriver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
		signIn.click();
		Thread.sleep(1000);
		//click login button
		WebElement logIn= chromeDriver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']"));
		logIn.click();
		Thread.sleep(1000);
		//Move to login frame
		WebElement logInframe= chromeDriver.findElement(By.xpath("//iframe[@id='loginIframe']")); 
		chromeDriver.switchTo().frame(logInframe);
		// Enter the Email Id
        WebElement email = chromeDriver.findElement(By.xpath("//input[@id='userName']"));
        email.sendKeys("cibhicr@gmail.com"); 
        Thread.sleep(1000);
        // Click on the Continue button
        WebElement continuebtn= chromeDriver.findElement(By.xpath("//button[@id='checkUser']"));
        continuebtn.click();
        
        //After clicking continue button in Email it asking OTP so otp cannot be done by automation testing.
        //couldn't move forward
		
		
	}

}
