package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import Utils.ElementUtils;

public class LoginPage {

	private WebDriver driver;
    private ExtentTest test;
    private ElementUtils eleUtil;

    @FindBy(id = "user-name")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(css = ".title")
    private WebElement productsTitle;

    @FindBy(css = "[data-test='error']")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver, ExtentTest test, ElementUtils eleUtil) {
        this.driver = driver;
        this.test = test;
        this.eleUtil = eleUtil;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameInput.clear();
        usernameInput.sendKeys(username);
        test.info("Entered username: " + username);
    }

    public void enterPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
        test.info("Entered password:" +password);
    }

    public void clickLogin() {
        loginButton.click();
        test.info("Clicked Login button");
    }

    public String getTitle() {
        String title = productsTitle.getText();
        test.info("Page title: " + title);
        return title;
    }

    public String getErrorMessage() {
        return eleUtil.getText(errorMessage);
    }
    
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
    
}