package demoqa.pages;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //    @FindBy(css = "#userName")
    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "password")
    WebElement userPassword;

    public LoginPage enterPersonalData(String user, String password) {
        type(userName, user, 100);
        type(userPassword, password);
        return this;
    }

    @FindBy(id = "login")
    WebElement loginButton;

    public ProfilePage clickOnLoginButton() {
        click(loginButton);
        return new ProfilePage(driver, wait);
    }
}
