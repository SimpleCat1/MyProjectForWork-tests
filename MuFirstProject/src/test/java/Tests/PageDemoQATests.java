package Tests;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import java.io.File;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;


public class PageDemoQATests {

    private String urlSite = Data.urlSite;
    private String firstName = "Игорь";
    private String lastName = "Игоревич";
    private String gender = "Male";
    private String birthday = "4 April,2022";
    private String email = "igor@mail.ru";
    private String mobileNumber = "1111111111";
    private String subject = "a";
    private String subjectSelection = "Math";
    private String hobie = "Sports";
    private String namePicture = "weegschaal-emoticon-sterrenbeeld.gif";
    private String pathPicture = "src\\weegschaal-emoticon-sterrenbeeld.gif";
    private String currentAddress = "person";
    private String state = "Uttar Pradesh";
    private String city = "Lucknow";
    private By firstNameLocator = byXpath("//input[@id='firstName']");
    private By lastNameLocator = byXpath("//input[@id='lastName']");
    private By emailLocator = byXpath("//input[@id='userEmail']");
    private By genderRadioLocator = byXpath("//label[@class='custom-control-label' and text()='Male']");
    private By mobileNumberLocator = byXpath("//input[@id='userNumber']");
    private By dateOfBirthInputLocator = byXpath("//input[@id='dateOfBirthInput']");
    private By dateOfBirthInputCalendarLocator = byXpath("//div[text()='4'][1]");
    private By subjectLocator = byXpath("//input[@id='subjectsInput']");
    private By subjectSelectionLocator = byXpath("//div[@id='react-select-2-option-0']");
    private By hobbiesCheckboxLocator = byXpath("//label[@class='custom-control-label' and text()='Sports']");
    private By downloadScreenLocator = byXpath("//input[@id='uploadPicture']");
    private By currentAddressLocator = byXpath("//textarea[@id='currentAddress']");
    private By selectStateLocator = byXpath("//div[@class=' css-1hwfws3']/div[(text()='Select State')]/ancestor::div[@id='state']");
    private By selectStateAfterClickLocator = byXpath("//div[@class=' css-26l3qy-menu']//div[@id='react-select-3-option-1']");
    private By selectCityLocator = byXpath("//div[@class=' css-1hwfws3']/div[(text()='Select City')]");
    private By selectCityAfterClickLocator = byXpath("//div[@class=' css-26l3qy-menu']//div[@id='react-select-4-option-1']");
    private By buttonSubmitLocator = byXpath("//button[@id='submit']");
    private By titleTextLocator = byXpath("//div[text()='Thanks for submitting the form']");
    private By firstNameTitleLocator = byXpath("//tbody/tr[1]/td[2]");
    private By emailTitleLocator = byXpath("//tbody/tr[2]/td[2]");
    private By genderRadioTitleLocator = byXpath("//tbody/tr[3]/td[2]");
    private By mobileNumberTitleLocator = byXpath("//tbody/tr[4]/td[2]");
    private By dateOfBirthTitleLocator = byXpath("//tbody/tr[5]/td[2]");
    private By subjectTitleLocator = byXpath("//tbody/tr[6]/td[2]");
    private By HobbiesTitleLocator = byXpath("//tbody/tr[7]/td[2]");
    private By downloadScreenTitleLocator = byXpath("//tbody/tr[8]/td[2]");
    private By currentAddressTitleLocator = byXpath("//tbody/tr[9]/td[2]");
    private By selectStateAndCityTitleLocator = byXpath("//tbody/tr[10]/td[2]");

    @Test
    public void StudentRegistrationForm_fillingInFieldsWithData_AppearSubmittingForm() {
        System.setProperty("selenide.browser", "Firefox");
        Configuration.startMaximized = true;
        open(urlSite);
        element(firstNameLocator).setValue(firstName);
        element(lastNameLocator).setValue(lastName);
        element(emailLocator).setValue(email);
        element(genderRadioLocator).click();
        element(mobileNumberLocator).setValue(mobileNumber);
        element(dateOfBirthInputLocator).click();
        element(dateOfBirthInputCalendarLocator).click();
        element(subjectLocator).setValue(subject);
        element(subjectSelectionLocator).click();
        element(hobbiesCheckboxLocator).click();
        element(downloadScreenLocator).uploadFile(new File(pathPicture));
        element(currentAddressLocator).setValue(currentAddress);
        element(selectStateLocator).scrollTo();
        element(selectStateLocator).click();
        element(selectStateAfterClickLocator).click();
        element(selectCityLocator).click();
        element(selectCityAfterClickLocator).click();
        element(buttonSubmitLocator).scrollTo();
        element(buttonSubmitLocator).click();
        element(firstNameTitleLocator).shouldHave(text(firstName+" "+lastName));
        element(emailTitleLocator).shouldHave(text(email));
        element(genderRadioTitleLocator).shouldHave(text(gender));
        element(mobileNumberTitleLocator).shouldHave(text(mobileNumber));
        element(dateOfBirthTitleLocator).shouldHave(text(birthday));
        element(subjectTitleLocator).shouldHave(text(subjectSelection));
        element(HobbiesTitleLocator).shouldHave(text(hobie));
        element(downloadScreenTitleLocator).shouldHave(text(namePicture));
        element(currentAddressTitleLocator).shouldHave(text(currentAddress));
        element(selectStateAndCityTitleLocator).shouldHave(text(state+" "+city));
    }
}
