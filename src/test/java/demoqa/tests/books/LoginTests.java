package demoqa.tests.books;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.LoginPage;
import demoqa.pages.SidePanel;
import demoqa.pages.alertsFrameWindows.AlertsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void preCondition() {
        new HomePage(app.driver, app.wait)
                .getBookstore()
                .selectLogin().hideAds();

    }

    @Test
    public void loginPositiveTest() {
        new LoginPage(app.driver, app.wait)
                .enterPersonalData("PORTISHEAD", "Password@1")
                .clickOnLoginButton()
                .verifyUserName("PORTISHEAD")
        ;
    }

}
