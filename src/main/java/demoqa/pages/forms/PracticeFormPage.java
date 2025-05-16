package demoqa.pages.forms;

import demoqa.core.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeFormPage extends BasePage {

    public PracticeFormPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(id = "firstName")
    WebElement firstName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBy(id = "userEmail")
    WebElement userEmail;
    @FindBy(id = "userNumber")
    WebElement userNumber;


    public PracticeFormPage enterPersonalDates(String name, String surname, String email, String phone) {
        type(firstName, name, 100);
        type(lastName, surname, 100);
        type(userEmail, email, 100);
        type(userNumber, phone, 100);
        return this;
    }

    @FindBy(css = "[for='gender-radio-1']")
    WebElement male;
    @FindBy(css = "[for='gender-radio-2']")
    WebElement female;
    @FindBy(css = "[for='gender-radio-3']")
    WebElement other;

    public PracticeFormPage selectGender(String gender) {
        if (gender.equals("Male")) {
            click(male);
        } else if (gender.equals("Female")) {
            click(female);
        } else if (gender.equals("Other")) {
            click(other);
        }
        return this;
    }

    @FindBy(id = "dateOfBirthInput")
    WebElement dateOfBirth;

    public PracticeFormPage enterDateOfBirth(String date) {
        click(dateOfBirth);
        String os = System.getProperty("os.name");
        System.out.println("My os" + os);
        if (os.startsWith("Mac")) {
            dateOfBirth.sendKeys(Keys.COMMAND, "a");
        }else{
            dateOfBirth.sendKeys(Keys.CONTROL, "a");
        }
        dateOfBirth.sendKeys(date);
        dateOfBirth.sendKeys(Keys.ENTER);
        return this;
    }
}
