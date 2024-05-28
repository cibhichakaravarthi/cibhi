package Task18;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class faceBook extends mainChorme {
	@Test
	public void test1(){
		//load url
		chromeDriver.get("https://www.facebook.com");
		//verify we landed on facebook
		if (!chromeDriver.getTitle().contains("Facebook")) {
            		System.out.println("Failed to open Facebook homepage.");
            		return;
        	}
		//click create button
		WebElement createButton = chromeDriver.findElement(By.xpath("//a[text()='Create new account']"));
		createButton.click();
		
		//Enter first name as "Test" and last name as "User"
		WebElement firstName = chromeDriver.findElement(By.name("firstname"));
		firstName.sendKeys("Test");
		WebElement lastName = chromeDriver.findElement(By.name("lastname"));
		lastName.sendKeys("user");
		
		//Enter emailid and password
		WebElement emailId = chromeDriver.findElement(By.xpath("//input[@name='reg_email__']"));
		emailId.sendKeys("testuser@test.com");
		WebElement reemailId = chromeDriver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		reemailId.sendKeys("testuser@test.com");
		WebElement passWord = chromeDriver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		passWord.sendKeys("Test@1234");
		
		//select Date of brith
		Select day = new Select(chromeDriver.findElement(By.xpath("//select[@name='birthday_day']")));
		Select month = new Select(chromeDriver.findElement(By.xpath("//select[@name='birthday_month']")));
		Select year = new Select(chromeDriver.findElement(By.xpath("//select[@name='birthday_year']")));
		day.selectByVisibleText("11");
		month.selectByVisibleText("May");
		year.selectByVisibleText("1985");
		
		//Select gender button
		WebElement gender = chromeDriver.findElement(By.xpath("//input[@value='2']"));
        	gender.click();

        	//click submit button
        	WebElement submit = chromeDriver.findElement(By.xpath("//button[@name='websubmit']"));
		submit.click();
		
		//I cannot move further it showing error message 
		//That email can't be used. Try a different one or sign up with mobile number instead.
	
	}

}
