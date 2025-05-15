package demoqa.pages.alertsFrameWindows;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(tagName = "iframe")
    List<WebElement> iframe;

    public FramePage returnListOfFrames() {
        //finding all iframes on the page using method Size();
        System.out.println("The total number of the iframes is " + iframe.size());
        // finding by executing JS
        Integer numberOfFrames = Integer.parseInt(js.executeScript("return window.length")
                .toString());
        System.out.println("TotalNumber: " + numberOfFrames);
        return this;

    }

    public FramePage switchToFrameByIndex(int index) {
        driver.switchTo().frame(index);
        return this;
    }

    @FindBy(id = "sampleHeading")
    WebElement sampleHeading;

    public FramePage verifyIFrameByText(String text) {
        Assert.assertTrue(shouldHaveText(sampleHeading, text, 4));
        return this;
    }

    @FindBy(id = "frame1")
    WebElement frame1;

    public FramePage switchToFrameById() {
        driver.switchTo().frame(frame1);

        return this;
    }

    public FramePage switchToMainPage() {
        driver.switchTo().defaultContent();
        return this;
    }
    @FindBy(tagName = "h1")
    WebElement title;

    public FramePage veriyMainPageByTitle(String text) {
        Assert.assertTrue(title.getText().contains(text));
        return this;
    }

    @FindBy(tagName = "body")
    WebElement body;

    public FramePage handleNestedNames() {
        //switching to the parent frame
        driver.switchTo().frame(frame1);
        // get text from parent frame
        System.out.println("iframe is " + body.getText());
        // number all frames in Parent
        System.out.println("Number of Iframes in parent iframe is " + iframe.size());
        // switch to child frame
        driver.switchTo().frame(0);
        System.out.println("iframe is " + body.getText());
        return this;
    }
}
