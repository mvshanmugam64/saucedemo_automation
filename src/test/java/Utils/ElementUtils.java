package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

public class ElementUtils {
	
	private WebDriver driver;
    private ExtentTest test;

    public ElementUtils(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }

    public String getText(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(element));
        String text = element.getText().trim();
        test.info("Fetched text from element: " + text);
        return text;
    }

    public String getValue(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(element));
        String value = element.getAttribute("value").trim();
        test.info("Fetched value from element: " + value);
        return value;
    }

}
