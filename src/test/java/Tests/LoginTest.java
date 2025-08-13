package Tests;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Utils.ElementUtils;
import Utils.FileReader;
import commons.BaseTest;

public class LoginTest extends BaseTest {
	
	@DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"standard_user", "secret_sauce", ""}, // positive
                {"locked_out_user", "secret_sauce", FileReader.get("error.lockedOutUser")},
                {"invalid_user", "wrong_pass", FileReader.get("error.invalidCredentials")},
                {"", "secret_sauce", FileReader.get("error.usernameRequired")},
                {"standard_user", "", FileReader.get("error.passwordRequired")}
        };
    }

    @Test(dataProvider = "loginData", enabled = true)
    public void loginTests(String username, String password, String expectedError) {
       
        test.info("Starting login test with Username: '" + username + "', Password: '" + password + "'");
        ElementUtils elementUtils = new ElementUtils(driver, test);
    	LoginPage loginPage = new LoginPage(driver, test, elementUtils);
    	loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        if (expectedError.isEmpty()) {
            Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"),
                    "User should be redirected to inventory page");
        } else {
            Assert.assertEquals(loginPage.getErrorMessage(), expectedError);
        }
    }

    @Test(enabled = true)
    public void verifyLocalStorageAfterLogin() {
        ElementUtils elementUtils = new ElementUtils(driver, test);
    	LoginPage loginPage = new LoginPage(driver, test, elementUtils);
        
     

        loginPage.login("standard_user", "secret_sauce");

        
        Cookie sessionCookie = driver.manage().getCookieNamed("session-username");
        Assert.assertNotNull(sessionCookie, "session-username cookie not found!");
        Assert.assertEquals(sessionCookie.getValue(), "standard_user", "Cookie value mismatch!");
        test.pass("Cookie session-username verified successfully: " + sessionCookie.getValue());
    }
	
	
	
}
