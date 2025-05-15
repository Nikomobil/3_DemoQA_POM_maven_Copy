package demoqa.tests.widgets;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.SidePanel;
import demoqa.pages.widgets.SelectMenuPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeletedTest extends TestBase {

    @BeforeMethod
    public void preCondition() {
        new HomePage(app.driver, app.wait)
                .getWidgets();
        new SidePanel(app.driver, app.wait)
                .getSelectMenu().hideAds();
    }

    @Test
    public void selectOldStyleTest(){
         new SelectMenuPage(app.driver, app.wait)
                .selectOldStyle("Blue")
                .verifyColor();
    }
    @Test
    public void multipleSelectTest(){
        new SelectMenuPage(app.driver, app.wait)
                .multiSelect(new String[]{"Blue", "Red"})
                .verifyColor();
    }

    @Test
    public void standardMultoiSelectTest(){
        new SelectMenuPage(app.driver, app.wait)
                .standardMultiSelect(new String[]{"Volvo", "Audi"});
    }
}
