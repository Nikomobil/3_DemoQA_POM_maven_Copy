package demoqa.pages;

import demoqa.core.BasePage;
import demoqa.pages.alertsFrameWindows.AlertsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SidePanel extends BasePage {


    public SidePanel(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    @FindBy(xpath = "//span[.='Login']")
    WebElement login;


    public LoginPage selectLogin() {
        click(login,0,100);// scroll
        return new LoginPage(driver, wait);

    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;


    public AlertsPage selectAlerts() {
        click(alerts,0,100);// scroll
        return new AlertsPage(driver, wait);
    }
}
