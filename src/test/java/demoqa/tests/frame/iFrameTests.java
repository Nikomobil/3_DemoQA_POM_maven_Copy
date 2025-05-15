package demoqa.tests.frame;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.SidePanel;
import demoqa.pages.alertsFrameWindows.FramePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iFrameTests extends TestBase {

    @BeforeMethod
    public void preCondition() {
        new HomePage(app.driver, app.wait)
                .getAlertsFrameWindows();
    }

    @Test
    public void iFrameTest(){
        new SidePanel(app.driver, app.wait)
                .selectFrame();
        new FramePage(app.driver, app.wait)
                .returnListOfFrames()
        .switchToFrameByIndex(1)
        .verifyIFrameByText("This is a sample page");
    }

    @Test
    public void iFrameTest2(){
        new SidePanel(app.driver, app.wait)
                .selectFrame();
        new FramePage(app.driver, app.wait)
                .switchToFrameById()
                .verifyIFrameByText("sample page")
                .switchToMainPage()
                .veriyMainPageByTitle("Frames");
    }
    @Test
    public void NestedIframeTest(){
        new SidePanel(app.driver, app.wait)
                .selectNestedFrames();
        new FramePage(app.driver, app.wait)
                .handleNestedNames();
    }

}
