package demoqa.pages.widgets;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SliderPage extends BasePage {

    public SliderPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(css = ".range-slider")
    WebElement sliderInput;

    public SliderPage moveSliderInHorizontalDirection() {
        pause(1000);
        moveWithJS(0, 200);
        new Actions(driver).dragAndDropBy(sliderInput, 330, 0).perform();

        return this;
    }

    public SliderPage verifySliderPosition(String position) {
        Assert.assertEquals(sliderInput.getDomAttribute("value"), position);
        return this;
    }
}
