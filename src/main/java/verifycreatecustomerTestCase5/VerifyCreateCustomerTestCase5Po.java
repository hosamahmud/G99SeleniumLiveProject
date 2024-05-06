package verifycreatecustomerTestCase5;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyCreateCustomerTestCase5Po {

    @FindBy(xpath = "//h2[text() = 'Guru99 Bank']")
    WebElement guruBankHomePage;

    @FindBy(xpath = "//input[@name = 'uid']")
    WebElement usernameTextBox;

    @FindBy(xpath = "//input[@name = 'password']")
    WebElement passwordTextBox;

    @FindBy(xpath = "//input[@name = 'btnLogin']")
    WebElement loginButton;

    @FindBy(xpath = "//marquee[contains(text(),'Welcome To Manager')]")
    WebElement managerMainPage;

    @FindBy(xpath = "//a[text()='New Customer']")
    WebElement newCustomerButton;

    @FindBy(xpath = "//input[@name='name']")
    WebElement nameTextBox;

    @FindBy(xpath = "//input[@name='rad1']")
    WebElement maleGenderSelect;

    @FindBy(xpath = "//input[@name='dob']")
    WebElement birthBox;

    @FindBy(xpath = "//textarea[@name='addr']")
    WebElement addressTextBox;

    @FindBy(xpath = "//input[@name='city']")
    WebElement cityTextBox;

    @FindBy(xpath = "//input[@name='state']")
    WebElement stateTextBox;

    @FindBy(xpath = "//input[@name='pinno']")
    WebElement pinTextBox;

    @FindBy(xpath = "//input[@name='telephoneno']")
    WebElement mobileNumberTextBox;

    @FindBy(xpath = "//input[@name='emailid']")
    WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordCustomerTextBox;

    @FindBy(xpath = "//input[@name='sub']")
    WebElement submitButton;

    @FindBy(xpath = "//p[text()='Customer Registered Successfully!!!']")
    WebElement customerCreatedMessage;

    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueButton;

}


