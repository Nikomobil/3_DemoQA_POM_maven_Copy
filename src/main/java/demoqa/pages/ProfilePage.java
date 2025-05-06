package demoqa.pages;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilePage extends BasePage {


    public ProfilePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    @FindBy(id = "userName-value")
    WebElement userNameValue;

    public ProfilePage verifyUserName(String text) {
//        assert userNameValue
//                .getText().contains(text) : "Username doesn't contains the expected text.";
        String expectedText = text;
        String actualText = userNameValue.getText();
        String errorMessage = "Username doesn't contains the expected text.";
        System.out.println("\nExpected text: " + expectedText + ",\nActual text: " + actualText);
        Assert.assertTrue(actualText.contains(expectedText), errorMessage);

        return this;
    }
}
