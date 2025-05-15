package demoqa.pages;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //.top-card:nth-child(6)
    @FindBy(css = ".top-card:nth-child(6)")
    WebElement bookStore;

    public SidePanel getBookstore() {
        click(bookStore,0,500);
        return new SidePanel(driver, wait);
    }

    @FindBy(css = ".top-card:nth-child(3)")
    WebElement alertsFrameWindows;

    public SidePanel getAlertsFrameWindows() {
        click(alertsFrameWindows,0,50);
        return new SidePanel(driver, wait);
    }
    @FindBy(css = ".top-card:nth-child(4)")
    WebElement widgets;

    public SidePanel getWidgets() {
        click(widgets,0,50);
        return new SidePanel(driver, wait);
    }

    @FindBy(css = ".top-card:nth-child(5)")
    WebElement interaction;

    public SidePanel getInteractives() {
        click(interaction,0,50);
        return new SidePanel(driver, wait);
    }
}
