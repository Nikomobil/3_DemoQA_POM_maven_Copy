package demoqa.tests.iteractions;


import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.SidePanel;
import demoqa.pages.iteractions.DroppablePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DroppableTest extends TestBase {

    @BeforeMethod
    public void preCondition() {
        new HomePage(app.driver, app.wait)
                .getInteractives();
        new SidePanel(app.driver, app.wait)
                .selectDroppable();
    }

    @Test
    public void actionDragMeTest(){
        new DroppablePage(app.driver, app.wait)
                .actionDragMe()
                .verifyDropped("Dropped!");
    }

}
