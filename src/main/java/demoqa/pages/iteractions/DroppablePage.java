package demoqa.pages.iteractions;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DroppablePage extends BasePage {

    public DroppablePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(id = "draggable")
    WebElement dragMe;

    @FindBy(id = "droppable")
    WebElement dropHere;

    public DroppablePage actionDragMe() {
        pause(1000);
        moveWithJS(0, 300);
        new Actions(driver).dragAndDrop(dragMe, dropHere).perform();
        return this;
    }

    public DroppablePage verifyDropped(String text) {
        Assert.assertTrue(shouldHaveText(dropHere, text, 5));
        return this;
    }
}
