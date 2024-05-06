package verifytheinvalidpassTestCase3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyInvalidPassTestCase3Po {

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

}
