package tests;

import dto.Student;
import enums.Gender;
import manager.AppManager;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

public class PracticeFormTests extends AppManager {
    @Test
    public void practiceFormPositiveTest() {
        Student student = new Student("Maksim",
                "Maksimov", "maksimov325@gmail.com",
                Gender.MALE, "1234567890",
                "23 Mar 2001", " Maths,Chemistry,English ",
                "sports", "", "address 1",
                "NCR", "Delhi");
        HomePage homePage = new HomePage(getDriver());
        homePage.clickBtnForms();
        new FormsPage(getDriver()).clickBtnPracticeForm();
        PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());
        practiceFormPage.typePracticeForm(student);
    }
}
