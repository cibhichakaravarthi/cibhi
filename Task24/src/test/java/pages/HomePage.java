package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver chromeDriver) {
        super(chromeDriver);
        PageFactory.initElements(chromeDriver, this);
    }

    // Define web elements
    @FindBy(id = "signin2")
    private WebElement signUpButton;

    @FindBy(id = "login2")
    private WebElement loginButton;

    // Actions on web elements
    public void clickSignUp() {
        signUpButton.click();
    }

    public void clickLogin() {
        loginButton.click();
    }
}

