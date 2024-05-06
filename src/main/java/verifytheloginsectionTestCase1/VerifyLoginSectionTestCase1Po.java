package verifytheloginsectionTestCase1;

import org.apache.xmlbeans.SchemaTypeLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyLoginSectionTestCase1Po {

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


