package demoqa.pages;

import demoqa.core.BasePage;
import demoqa.pages.alertsFrameWindows.AlertsPage;
import demoqa.pages.alertsFrameWindows.BrowserWindowPage;
import demoqa.pages.alertsFrameWindows.FramePage;
import demoqa.pages.iteractions.DroppablePage;
import demoqa.pages.widgets.MenuPage;
import demoqa.pages.widgets.SelectMenuPage;
import demoqa.pages.widgets.SliderPage;
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
        click(login, 0, 100);// scroll
        return new LoginPage(driver, wait);

    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;


    public AlertsPage selectAlerts() {
        click(alerts, 0, 100);// scroll
        return new AlertsPage(driver, wait);
    }

    @FindBy(xpath = "//span[.='Frames']")
    WebElement frames;

    public SidePanel selectFrame() {
        click(frames, 0, 200);// scroll
        return new SidePanel(driver, wait);
    }

    @FindBy(xpath = "//span[.='Nested Frames']")
    WebElement nestedFrames;

    public FramePage selectNestedFrames() {
        click(nestedFrames, 0, 200);
        return new FramePage(driver, wait);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindow;

    public BrowserWindowPage selectBrowserWindows() {
        click(browserWindow, 0, 200);
        return new BrowserWindowPage(driver, wait);
    }

    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement SelectMenu;

    public SelectMenuPage getSelectMenu() {
        click(SelectMenu, 0, 500);
        return new SelectMenuPage(driver, wait);
    }

    @FindBy(xpath = "//span[.='Menu']")
    WebElement menu;

    public MenuPage getMenu() {
        click(menu, 0, 300);
        return new MenuPage(driver, wait);
    }

    @FindBy(xpath = "//span[.='Slider']")
    WebElement slider;

    public SliderPage selectSlider() {
        click(slider, 0, 300);

        return new SliderPage(driver, wait);
    }

    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;

    public DroppablePage selectDroppable() {
        click(droppable, 0, 200);
        return new DroppablePage(driver, wait);
    }
}
