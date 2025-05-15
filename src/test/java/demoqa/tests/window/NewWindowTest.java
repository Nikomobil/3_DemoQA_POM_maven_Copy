package demoqa.tests.window;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.SidePanel;
import demoqa.pages.alertsFrameWindows.BrowserWindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewWindowTest extends TestBase {


    @BeforeMethod
    public void preCondition() {
        new HomePage(app.driver, app.wait)
                .getAlertsFrameWindows();
        new SidePanel(app.driver, app.wait)
                .selectBrowserWindows()
                .hideAds();
    }
    @Test
    public void newTabTest(){
        new BrowserWindowPage(app.driver, app.wait)
                .switchToNewTab(1)
                .verifyNewTabTitle("This is a sample page");
    }
}
