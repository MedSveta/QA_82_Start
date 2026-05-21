package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PracticeFormPage extends BasePage {
    public PracticeFormPage(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory
                (driver, 10), this);
    }

    @FindBy(css = "input[placeholder='First Name']")
    WebElement inputFirstName;
    @FindBy(id = "lastName")
    WebElement inputLastName;
    @FindBy(xpath = "//input[@placeholder='name@example.com']")
    WebElement inputEmail;
    @FindBy(css = "#userNumber")
    WebElement inputMobile;
    @FindBy(css = "textarea.form-control")
    WebElement textareaAddress;

    public void typePracticeForm() {
    inputFirstName.sendKeys("Misha");
    inputLastName.sendKeys("Mishin");
    inputEmail.sendKeys("misha345@gmail.com");
    inputMobile.sendKeys("1234567890");
    textareaAddress.sendKeys("Address");
    }
}
