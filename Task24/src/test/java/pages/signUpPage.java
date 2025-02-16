package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BasePage;

public class signUpPage extends BasePage  {

    public signUpPage(WebDriver chromeDriver) {
        super(chromeDriver);
        PageFactory.initElements(chromeDriver, this);
    }

    @FindBy(id = "sign-username")
    private WebElement usernameField;

    @FindBy(id = "sign-password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[text()='Sign up']")
    private WebElement signUpButton;
    
    @FindBy(xpath = "//div[contains(@class, 'alert') and contains(text(), 'This user already exist.')]")
    private WebElement errorMessage;

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }
    
    public boolean isErrorMessageDisplayed1() {
        return errorMessage.isDisplayed();
    }

	public void verifysignUp(String signup) throws InterruptedException  {
		Thread.sleep(2000); // Adding sleep to wait for the alert
        String alertText = chromeDriver.switchTo().alert().getText();
        Assert.assertTrue(alertText.contains(signup));
        chromeDriver.switchTo().alert().accept();
		
		
	}

	
}

