package demoqa.tests.practice;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.SidePanel;
import demoqa.pages.forms.PracticeFormPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTests extends TestBase{

    @BeforeMethod
    public void preCondition() {
        new HomePage(app.driver, app.wait)
                .getForms();
        new SidePanel(app.driver, app.wait)
                .selectPracticeForm().hideAds();
    }
    @Test
    public void createStudentAccountTest(){
        new PracticeFormPage(app.driver, app.wait)
                .enterPersonalDates("Robert","Smith","kristina@gmail.com","0123456789")
//                .selectGender("Male")
//                .enterDateOfBirth("10 May 1990")
//                .addSubject(new String[]{"English","Maths"})
//                .selectHobbies(new String[]{"Music","Sports"})
//                .uploadFile("src/images/candles-9247498_1280.jpg")
//                .inputState("NCR")
//                .inputCity("Delhi")
//                .submit()
//                .verifySuccessRegistration("")
        ;
    }

}
