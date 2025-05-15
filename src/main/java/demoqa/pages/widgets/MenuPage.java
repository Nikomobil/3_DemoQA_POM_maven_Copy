package demoqa.pages.widgets;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;


public class MenuPage extends BasePage {

    public MenuPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(xpath = "//a[.='Main Item 2']")
    WebElement mainItem2;


    @FindBy(xpath = "//a[.='SUB SUB LIST »']")
    WebElement subSubList;

    @FindBy(xpath = "//a[.='Sub Sub Item 1']")
    WebElement subSubItem1;

    public MenuPage selectSubMenu() {
        pause(1000);
        moveWithJS(0, 200);
        Actions actions = new Actions(driver);
        actions.moveToElement(mainItem2).perform();
        actions.moveToElement(subSubList).perform();
        actions.moveToElement(subSubItem1).perform();
        return this;
    }


    public MenuPage verifySubMenu() {
//        Assert.assertTrue(subSubItem1.isDisplayed());
        Assert.assertTrue(isElementDisplayed(subSubItem1));

        return this;

    }
}
